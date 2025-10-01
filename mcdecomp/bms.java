/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bms
extends bmv {
    private final bgb a;
    private final Predicate<bgb> b;
    @Nullable
    private bgb c;
    private final double d;
    private final bpj e;
    private int f;
    private final float g;
    private float h;
    private final float i;

    public bms(bgb $$0, double $$12, float $$2, float $$3) {
        this.a = $$0;
        this.b = $$1 -> $$1 != null && $$0.getClass() != $$1.getClass();
        this.d = $$12;
        this.e = $$0.J();
        this.g = $$2;
        this.i = $$3;
        this.a(EnumSet.of(bmv.a.a, bmv.a.b));
        if (!($$0.J() instanceof bpi) && !($$0.J() instanceof bph)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
        }
    }

    @Override
    public boolean a() {
        List<bgb> $$0 = this.a.dI().a(bgb.class, this.a.cE().g(this.i), this.b);
        if (!$$0.isEmpty()) {
            for (bgb $$1 : $$0) {
                if ($$1.cb()) continue;
                this.c = $$1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean b() {
        return this.c != null && !this.e.l() && this.a.f((bfj)this.c) > (double)(this.g * this.g);
    }

    @Override
    public void c() {
        this.f = 0;
        this.h = this.a.a(dxp.j);
        this.a.a(dxp.j, 0.0f);
    }

    @Override
    public void d() {
        this.c = null;
        this.e.n();
        this.a.a(dxp.j, this.h);
    }

    @Override
    public void e() {
        double $$2;
        double $$1;
        if (this.c == null || this.a.fO()) {
            return;
        }
        this.a.E().a(this.c, 10.0f, (float)this.a.X());
        if (--this.f > 0) {
            return;
        }
        this.f = this.a(10);
        double $$0 = this.a.dn() - this.c.dn();
        double $$3 = $$0 * $$0 + ($$1 = this.a.dp() - this.c.dp()) * $$1 + ($$2 = this.a.dt() - this.c.dt()) * $$2;
        if ($$3 <= (double)(this.g * this.g)) {
            this.e.n();
            blx $$4 = this.c.E();
            if ($$3 <= (double)this.g || $$4.e() == this.a.dn() && $$4.f() == this.a.dp() && $$4.g() == this.a.dt()) {
                double $$5 = this.c.dn() - this.a.dn();
                double $$6 = this.c.dt() - this.a.dt();
                this.e.a(this.a.dn() - $$5, this.a.dp(), this.a.dt() - $$6, this.d);
            }
            return;
        }
        this.e.a((bfj)this.c, this.d);
    }
}

