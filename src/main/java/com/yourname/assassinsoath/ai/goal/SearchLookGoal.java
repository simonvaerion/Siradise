package com.yourname.assassinsoath.ai.goal;

import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import java.util.EnumSet;
import java.util.Optional;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

public class SearchLookGoal extends Goal {
  private final Mob mob;
  private Vec3 focusPos;
  private int timer;

  public SearchLookGoal(Mob mob) {
    this.mob = mob;
    this.setFlags(EnumSet.of(Flag.LOOK));
  }

  @Override
  public boolean canUse() {
    Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(mob);
    if (state.isEmpty()) return false;
    if (state.get().stage() < StealthAwarenessTracker.STAGE_HEAD_TURN) return false;
    focusPos = state.get().lastKnownPos().orElse(null);
    return focusPos != null;
  }

  @Override
  public void start() {
    timer = 40;
    directLook();
  }

  @Override
  public boolean canContinueToUse() {
    if (--timer <= 0) return false;
    Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(mob);
    if (state.isEmpty()) return false;
    if (state.get().stage() < StealthAwarenessTracker.STAGE_HEAD_TURN) return false;
    focusPos = state.get().lastKnownPos().orElse(focusPos);
    return focusPos != null;
  }

  @Override
  public void tick() {
    if (focusPos == null) return;
    directLook();
  }

  @Override
  public void stop() {
    focusPos = null;
  }

  private void directLook() {
    Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(mob);
    float detection = state.map(StealthAwarenessTracker.AwarenessState::detection).orElse(0f);
    float spread = Mth.lerp(detection, 4.0f, 0.6f);
    Vec3 jitter =
        new Vec3(
            mob.getRandom().nextDouble() * spread - spread / 2,
            mob.getRandom().nextDouble() * spread / 3 - spread / 6,
            mob.getRandom().nextDouble() * spread - spread / 2);
    Vec3 target = focusPos.add(jitter);
    mob.getLookControl().setLookAt(target.x, target.y, target.z);
  }
}
