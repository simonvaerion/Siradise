/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bnu
extends bmv {
    private final bgb a;
    private final bwg b;
    @Nullable
    private bfz c;
    private int d = -1;
    private final double e;
    private int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    public bnu(bwg $$0, double $$1, int $$2, float $$3) {
        this($$0, $$1, $$2, $$2, $$3);
    }

    public bnu(bwg $$0, double $$1, int $$2, int $$3, float $$4) {
        if (!($$0 instanceof bfz)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.b = $$0;
        this.a = (bgb)((Object)$$0);
        this.e = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$4 * $$4;
        this.a(EnumSet.of(bmv.a.a, bmv.a.b));
    }

    @Override
    public boolean a() {
        bfz $$0 = this.a.j();
        if ($$0 == null || !$$0.bs()) {
            return false;
        }
        this.c = $$0;
        return true;
    }

    @Override
    public boolean b() {
        return this.a() || this.c.bs() && !this.a.J().l();
    }

    @Override
    public void d() {
        this.c = null;
        this.f = 0;
        this.d = -1;
    }

    @Override
    public boolean K_() {
        return true;
    }

    @Override
    public void e() {
        double $$0 = this.a.i(this.c.dn(), this.c.dp(), this.c.dt());
        boolean $$1 = this.a.K().a(this.c);
        this.f = $$1 ? ++this.f : 0;
        if ($$0 > (double)this.j || this.f < 5) {
            this.a.J().a((bfj)this.c, this.e);
        } else {
            this.a.J().n();
        }
        this.a.E().a(this.c, 30.0f, 30.0f);
        if (--this.d == 0) {
            if (!$$1) {
                return;
            }
            float $$2 = (float)Math.sqrt($$0) / this.i;
            float $$3 = apa.a($$2, 0.1f, 1.0f);
            this.b.a(this.c, $$3);
            this.d = apa.d($$2 * (float)(this.h - this.g) + (float)this.g);
        } else if (this.d < 0) {
            this.d = apa.a(apa.d(Math.sqrt($$0) / (double)this.i, (double)this.g, (double)this.h));
        }
    }
}

