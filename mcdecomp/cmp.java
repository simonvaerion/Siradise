/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cmp
extends clp,
clw,
cnc,
cnm.a {
    @Nullable
    public ddx a(int var1, int var2, dec var3, boolean var4);

    @Deprecated
    public boolean b(int var1, int var2);

    public int a(dhk.a var1, int var2, int var3);

    public int v_();

    public cnm z_();

    default public he<cnk> s(gu $$0) {
        return this.z_().a($$0);
    }

    default public Stream<dcb> c(eed $$0) {
        int $$6;
        int $$1 = apa.a($$0.a);
        int $$2 = apa.a($$0.d);
        int $$3 = apa.a($$0.b);
        int $$4 = apa.a($$0.e);
        int $$5 = apa.a($$0.c);
        if (this.a($$1, $$3, $$5, $$2, $$4, $$6 = apa.a($$0.f))) {
            return this.a($$0);
        }
        return Stream.empty();
    }

    @Override
    default public int a(gu $$0, clx $$1) {
        return $$1.getColor(this.s($$0).a(), $$0.u(), $$0.w());
    }

    @Override
    default public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2) {
        ddx $$3 = this.a(hq.e($$0), hq.e($$2), dec.f, false);
        if ($$3 != null) {
            return $$3.getNoiseBiome($$0, $$1, $$2);
        }
        return this.a($$0, $$1, $$2);
    }

    public he<cnk> a(int var1, int var2, int var3);

    public boolean r_();

    @Deprecated
    public int t_();

    public dfk x_();

    @Override
    default public int C_() {
        return this.x_().n();
    }

    @Override
    default public int D_() {
        return this.x_().o();
    }

    default public gu a(dhk.a $$0, gu $$1) {
        return new gu($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
    }

    default public boolean t(gu $$0) {
        return this.a_($$0).i();
    }

    default public boolean u(gu $$0) {
        if ($$0.v() >= this.t_()) {
            return this.g($$0);
        }
        gu $$1 = new gu($$0.u(), this.t_(), $$0.w());
        if (!this.g($$1)) {
            return false;
        }
        $$1 = $$1.d();
        while ($$1.v() > $$0.v()) {
            dcb $$2 = this.a_($$1);
            if ($$2.b(this, $$1) > 0 && !$$2.k()) {
                return false;
            }
            $$1 = $$1.d();
        }
        return true;
    }

    default public float v(gu $$0) {
        return this.w($$0) - 0.5f;
    }

    @Deprecated
    default public float w(gu $$0) {
        float $$1 = (float)this.z($$0) / 15.0f;
        float $$2 = $$1 / (4.0f - 3.0f * $$1);
        return apa.i(this.x_().s(), $$2, 1.0f);
    }

    default public ddx x(gu $$0) {
        return this.a(hx.a($$0.u()), hx.a($$0.w()));
    }

    default public ddx a(int $$0, int $$1) {
        return this.a($$0, $$1, dec.n, true);
    }

    default public ddx a(int $$0, int $$1, dec $$2) {
        return this.a($$0, $$1, $$2, true);
    }

    @Override
    @Nullable
    default public cls c(int $$0, int $$1) {
        return this.a($$0, $$1, dec.c, false);
    }

    default public boolean y(gu $$0) {
        return this.b_($$0).a(anb.a);
    }

    default public boolean d(eed $$0) {
        int $$1 = apa.a($$0.a);
        int $$2 = apa.c($$0.d);
        int $$3 = apa.a($$0.b);
        int $$4 = apa.c($$0.e);
        int $$5 = apa.a($$0.c);
        int $$6 = apa.c($$0.f);
        gu.a $$7 = new gu.a();
        for (int $$8 = $$1; $$8 < $$2; ++$$8) {
            for (int $$9 = $$3; $$9 < $$4; ++$$9) {
                for (int $$10 = $$5; $$10 < $$6; ++$$10) {
                    dcb $$11 = this.a_($$7.d($$8, $$9, $$10));
                    if ($$11.u().c()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    default public int z(gu $$0) {
        return this.c($$0, this.v_());
    }

    default public int c(gu $$0, int $$1) {
        if ($$0.u() < -30000000 || $$0.w() < -30000000 || $$0.u() >= 30000000 || $$0.w() >= 30000000) {
            return 15;
        }
        return this.b($$0, $$1);
    }

    @Deprecated
    default public boolean f(int $$0, int $$1) {
        return this.b(hx.a($$0), hx.a($$1));
    }

    @Deprecated
    default public boolean A(gu $$0) {
        return this.f($$0.u(), $$0.w());
    }

    @Deprecated
    default public boolean a(gu $$0, gu $$1) {
        return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
    }

    @Deprecated
    default public boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        if ($$4 < this.C_() || $$1 >= this.aj()) {
            return false;
        }
        return this.b($$0, $$2, $$3, $$5);
    }

    @Deprecated
    default public boolean b(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = hx.a($$0);
        int $$5 = hx.a($$2);
        int $$6 = hx.a($$1);
        int $$7 = hx.a($$3);
        for (int $$8 = $$4; $$8 <= $$5; ++$$8) {
            for (int $$9 = $$6; $$9 <= $$7; ++$$9) {
                if (this.b($$8, $$9)) continue;
                return false;
            }
        }
        return true;
    }

    public hs B_();

    public caw G();

    default public <T> hg<T> a(acp<? extends hr<? extends T>> $$0) {
        hr $$1 = this.B_().d($$0);
        return $$1.p().a(this.G());
    }
}

