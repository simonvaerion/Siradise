/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.Goal$Flag
 *  net.minecraft.world.phys.Vec3
 */
package com.yourname.assassinsoath.ai.goal;

import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import java.util.EnumSet;
import java.util.Optional;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

public class InvestigateSoundGoal
extends Goal {
    private final Mob mob;
    private Vec3 targetPos;
    private int timer;

    public InvestigateSoundGoal(Mob mob) {
        this.mob = mob;
        this.m_7021_(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
    }

    public boolean m_8036_() {
        Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(this.mob);
        if (state.isEmpty()) {
            return false;
        }
        if (state.get().stage() < 2) {
            return false;
        }
        this.targetPos = state.get().lastKnownPos().orElse(null);
        if (this.targetPos == null) {
            return false;
        }
        return this.mob.m_217043_().m_188501_() < 0.9f;
    }

    public void m_8056_() {
        this.timer = 80;
        this.mob.m_21573_().m_26519_(this.targetPos.f_82479_, this.targetPos.f_82480_, this.targetPos.f_82481_, 1.05);
    }

    public boolean m_8045_() {
        if (--this.timer <= 0) {
            return false;
        }
        if (!this.mob.m_21573_().m_26572_()) {
            return false;
        }
        return StealthAwarenessTracker.get(this.mob).map(state -> state.stage() >= 2).orElse(false);
    }

    public void m_8037_() {
        if (this.targetPos != null && this.mob.m_217043_().m_188503_(20) == 0) {
            this.mob.m_21563_().m_24946_(this.targetPos.f_82479_, this.targetPos.f_82480_, this.targetPos.f_82481_);
        }
    }

    public void m_8041_() {
        this.targetPos = null;
    }
}

