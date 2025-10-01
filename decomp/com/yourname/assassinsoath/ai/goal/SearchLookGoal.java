/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.Goal$Flag
 *  net.minecraft.world.phys.Vec3
 */
package com.yourname.assassinsoath.ai.goal;

import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import java.util.EnumSet;
import java.util.Optional;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

public class SearchLookGoal
extends Goal {
    private final Mob mob;
    private Vec3 focusPos;
    private int timer;

    public SearchLookGoal(Mob mob) {
        this.mob = mob;
        this.m_7021_(EnumSet.of(Goal.Flag.LOOK));
    }

    public boolean m_8036_() {
        Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(this.mob);
        if (state.isEmpty()) {
            return false;
        }
        if (state.get().stage() < 1) {
            return false;
        }
        this.focusPos = state.get().lastKnownPos().orElse(null);
        return this.focusPos != null;
    }

    public void m_8056_() {
        this.timer = 40;
        this.directLook();
    }

    public boolean m_8045_() {
        if (--this.timer <= 0) {
            return false;
        }
        Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(this.mob);
        if (state.isEmpty()) {
            return false;
        }
        if (state.get().stage() < 1) {
            return false;
        }
        this.focusPos = state.get().lastKnownPos().orElse(this.focusPos);
        return this.focusPos != null;
    }

    public void m_8037_() {
        if (this.focusPos == null) {
            return;
        }
        this.directLook();
    }

    public void m_8041_() {
        this.focusPos = null;
    }

    private void directLook() {
        Optional<StealthAwarenessTracker.AwarenessState> state = StealthAwarenessTracker.get(this.mob);
        float detection = state.map(StealthAwarenessTracker.AwarenessState::detection).orElse(Float.valueOf(0.0f)).floatValue();
        float spread = Mth.m_14179_((float)detection, (float)4.0f, (float)0.6f);
        Vec3 jitter = new Vec3(this.mob.m_217043_().m_188500_() * (double)spread - (double)(spread / 2.0f), this.mob.m_217043_().m_188500_() * (double)spread / 3.0 - (double)(spread / 6.0f), this.mob.m_217043_().m_188500_() * (double)spread - (double)(spread / 2.0f));
        Vec3 target = this.focusPos.m_82549_(jitter);
        this.mob.m_21563_().m_24946_(target.f_82479_, target.f_82480_, target.f_82481_);
    }
}

