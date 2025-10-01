/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.phys.Vec3
 */
package com.yourname.assassinsoath.ai;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.WeakHashMap;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public final class StealthAwarenessTracker {
    private static final Map<Mob, AwarenessState> MOB_STATE = new WeakHashMap<Mob, AwarenessState>();
    private static final float SOUND_INCREMENT = 0.1f;
    private static final float SOUND_CAP = 0.5f;
    private static final float HEAD_TURN_THRESHOLD = 0.2f;
    private static final float INVESTIGATE_THRESHOLD = 0.3f;
    private static final float ALERT_THRESHOLD = 0.99f;
    private static final int FORGET_DURATION_TICKS = 200;
    private static final float PER_SECOND_DECAY_FACTOR = 0.95f;
    private static final int TICKS_PER_SECOND = 20;
    private static final float DETECTION_DECAY_FACTOR = (float)Math.pow(0.95f, 0.05);
    public static final int STAGE_HEAD_TURN = 1;
    public static final int STAGE_INVESTIGATE = 2;
    public static final int STAGE_ALERT = 3;

    private StealthAwarenessTracker() {
    }

    public static Optional<AwarenessState> get(Mob mob) {
        return Optional.ofNullable(MOB_STATE.get(mob));
    }

    public static void update(Mob mob, Player player, float detection, int stage) {
        float newDetection;
        AwarenessState state = StealthAwarenessTracker.ensure(mob);
        state.targetId = player.m_20148_();
        state.lastKnownPos = player.m_20182_();
        state.detection = newDetection = Math.min(1.0f, Math.max(state.detection, detection));
        state.stage = Math.max(state.stage, Math.max(stage, StealthAwarenessTracker.stageFor(newDetection)));
        state.forgetTicks = Math.max(state.forgetTicks, 200);
        state.soundFocusTicks = Math.max(state.soundFocusTicks, 200);
    }

    public static void addNoise(Mob mob, Player player, Vec3 source, float detection) {
        AwarenessState state = StealthAwarenessTracker.ensure(mob);
        state.targetId = player.m_20148_();
        state.lastKnownPos = source;
        if (detection > 0.0f && state.detection < 0.5f) {
            state.detection = Math.min(0.5f, state.detection + 0.1f);
        }
        state.stage = Math.max(state.stage, StealthAwarenessTracker.stageFor(state.detection));
        state.forgetTicks = Math.max(state.forgetTicks, 200);
        state.soundFocusTicks = Math.max(state.soundFocusTicks, 200);
    }

    public static void reduceDetection(Mob mob, float targetDetection) {
        float clamped;
        AwarenessState state = MOB_STATE.get(mob);
        if (state == null) {
            return;
        }
        state.detection = clamped = Math.max(0.0f, Math.min(targetDetection, state.detection));
        state.stage = StealthAwarenessTracker.stageFor(clamped);
    }

    private static AwarenessState ensure(Mob mob) {
        return MOB_STATE.computeIfAbsent(mob, k -> new AwarenessState());
    }

    public static void tick(Mob mob) {
        AwarenessState state = MOB_STATE.get(mob);
        if (state == null) {
            return;
        }
        --state.forgetTicks;
        if (state.soundFocusTicks > 0) {
            --state.soundFocusTicks;
        }
        state.detection = Math.min(1.0f, Math.max(0.0f, state.detection * DETECTION_DECAY_FACTOR));
        state.stage = StealthAwarenessTracker.stageFor(state.detection);
        if (state.forgetTicks <= 0 || state.lastKnownPos == null) {
            MOB_STATE.remove(mob);
        }
    }

    public static void clear(Mob mob) {
        MOB_STATE.remove(mob);
    }

    public static int stageFor(float detection) {
        if (detection >= 0.99f) {
            return 3;
        }
        if (detection >= 0.3f) {
            return 2;
        }
        if (detection >= 0.2f) {
            return 1;
        }
        return 0;
    }

    public static final class AwarenessState {
        private UUID targetId;
        private Vec3 lastKnownPos;
        private float detection;
        private int stage;
        private int forgetTicks;
        private int soundFocusTicks;

        public Optional<UUID> targetId() {
            return Optional.ofNullable(this.targetId);
        }

        public Optional<Vec3> lastKnownPos() {
            return Optional.ofNullable(this.lastKnownPos);
        }

        public float detection() {
            return this.detection;
        }

        public int stage() {
            return this.stage;
        }

        public int soundFocusTicks() {
            return this.soundFocusTicks;
        }
    }
}

