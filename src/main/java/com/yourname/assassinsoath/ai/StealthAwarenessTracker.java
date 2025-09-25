package com.yourname.assassinsoath.ai;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.WeakHashMap;

/**
 * Tracks how aware mobs are of stealthy players and exposes convenience helpers for manipulating
 * the internal awareness state. This mirrors the compiled logic from the original release but
 * ensures alert stages automatically downgrade once detection falls back below their thresholds.
 */
public final class StealthAwarenessTracker {
    private static final Map<Mob, AwarenessState> MOB_STATE = new WeakHashMap<>();

    private static final float SOUND_INCREMENT = 0.1f;
    private static final float SOUND_CAP = 0.5f;
    private static final float HEAD_TURN_THRESHOLD = 0.2f;
    private static final float INVESTIGATE_THRESHOLD = 0.3f;
    private static final float ALERT_THRESHOLD = 0.99f;
    private static final int FORGET_DURATION_TICKS = 200;
    private static final float PER_SECOND_DECAY_FACTOR = 0.95f;
    private static final int TICKS_PER_SECOND = 20;
    private static final float DETECTION_DECAY_FACTOR =
            (float) Math.pow(PER_SECOND_DECAY_FACTOR, 1.0f / TICKS_PER_SECOND);

    public static final int STAGE_HEAD_TURN = 1;
    public static final int STAGE_INVESTIGATE = 2;
    public static final int STAGE_ALERT = 3;

    private StealthAwarenessTracker() {
    }

    public static Optional<AwarenessState> get(Mob mob) {
        return Optional.ofNullable(MOB_STATE.get(mob));
    }

    public static void update(Mob mob, Player player, float detection, int stage) {
        AwarenessState state = ensure(mob);
        state.targetId = player.getUUID();
        state.lastKnownPos = player.position();

        float clampedDetection = Math.max(0.0f, Math.min(1.0f, detection));
        state.detection = clampedDetection;

        // Always derive the stored stage from the most recent detection so mobs
        // only enter alert behaviours once the visibility meter is truly full.
        state.stage = stageFor(clampedDetection);
        state.forgetTicks = Math.max(state.forgetTicks, FORGET_DURATION_TICKS);
        state.soundFocusTicks = Math.max(state.soundFocusTicks, FORGET_DURATION_TICKS);
    }

    public static void addNoise(Mob mob, Player player, Vec3 source, float detection) {
        AwarenessState state = ensure(mob);
        state.targetId = player.getUUID();
        state.lastKnownPos = source;

        if (detection > 0.0f && state.detection < SOUND_CAP) {
            state.detection = Math.min(SOUND_CAP, state.detection + SOUND_INCREMENT);
        }

        state.stage = stageFor(state.detection);
        state.forgetTicks = Math.max(state.forgetTicks, FORGET_DURATION_TICKS);
        state.soundFocusTicks = Math.max(state.soundFocusTicks, FORGET_DURATION_TICKS);
    }

    public static void reduceDetection(Mob mob, float targetDetection) {
        AwarenessState state = MOB_STATE.get(mob);
        if (state == null) {
            return;
        }

        float clamped = Math.max(0.0f, Math.min(targetDetection, state.detection));
        state.detection = clamped;
        state.stage = stageFor(clamped);
    }

    public static void tick(Mob mob) {
        AwarenessState state = MOB_STATE.get(mob);
        if (state == null) {
            return;
        }

        state.forgetTicks--;
        if (state.soundFocusTicks > 0) {
            state.soundFocusTicks--;
        }

        state.detection = Math.min(1.0f, Math.max(0.0f, state.detection * DETECTION_DECAY_FACTOR));
        state.stage = stageFor(state.detection);

        if (state.forgetTicks <= 0 || state.lastKnownPos == null) {
            MOB_STATE.remove(mob);
        }
    }

    public static void clear(Mob mob) {
        MOB_STATE.remove(mob);
    }

    public static int stageFor(float detection) {
        if (detection >= ALERT_THRESHOLD) {
            return STAGE_ALERT;
        }
        if (detection >= INVESTIGATE_THRESHOLD) {
            return STAGE_INVESTIGATE;
        }
        if (detection >= HEAD_TURN_THRESHOLD) {
            return STAGE_HEAD_TURN;
        }
        return 0;
    }

    private static AwarenessState ensure(Mob mob) {
        return MOB_STATE.computeIfAbsent(mob, ignored -> new AwarenessState());
    }

    public static final class AwarenessState {
        private UUID targetId;
        private Vec3 lastKnownPos;
        private float detection;
        private int stage;
        private int forgetTicks;
        private int soundFocusTicks;

        public Optional<UUID> targetId() {
            return Optional.ofNullable(targetId);
        }

        public Optional<Vec3> lastKnownPos() {
            return Optional.ofNullable(lastKnownPos);
        }

        public float detection() {
            return detection;
        }

        public int stage() {
            return stage;
        }

        public int soundFocusTicks() {
            return soundFocusTicks;
        }
    }
}
