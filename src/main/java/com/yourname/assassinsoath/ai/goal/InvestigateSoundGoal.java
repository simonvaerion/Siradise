package com.yourname.assassinsoath.ai.goal;

import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import java.util.EnumSet;
import java.util.Optional;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

public class InvestigateSoundGoal extends Goal {
  private final Mob mob;
  private Vec3 targetPos;
  private int timer;

  public InvestigateSoundGoal(Mob mob) {
    this.mob = mob;
    this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
  }

  @Override
  public boolean canUse() {
    Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(mob);
    if (state.isEmpty()) return false;
    if (state.get().stage() < StealthAwarenessTracker.STAGE_INVESTIGATE) return false;
    targetPos = state.get().lastKnownPos().orElse(null);
    if (targetPos == null) return false;
    return mob.getRandom().nextFloat() < 0.9f;
  }

  @Override
  public void start() {
    timer = 80;
    mob.getNavigation().moveTo(targetPos.x, targetPos.y, targetPos.z, 1.05);
  }

  @Override
  public boolean canContinueToUse() {
    if (--timer <= 0) return false;
    if (!mob.getNavigation().isInProgress()) return false;
    return StealthAwarenessTracker.get(mob)
        .map(state -> state.stage() >= StealthAwarenessTracker.STAGE_INVESTIGATE)
        .orElse(false);
  }

  @Override
  public void tick() {
    if (targetPos != null && mob.getRandom().nextInt(20) == 0) {
      mob.getLookControl().setLookAt(targetPos.x, targetPos.y, targetPos.z);
    }
  }

  @Override
  public void stop() {
    targetPos = null;
  }
}
