/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dse {
    private static final Logger a = LogUtils.getLogger();
    protected static final dcb e = cpo.nc.n();
    protected drs f;
    @Nullable
    private ha b;
    private cui c;
    private cvz d;
    protected int g;
    private final dsr h;
    private static final Set<cpn> i = ImmutableSet.builder().add((Object)cpo.fo).add((Object)cpo.cp).add((Object)cpo.cq).add((Object)cpo.dU).add((Object)cpo.kd).add((Object)cpo.ki).add((Object)cpo.kg).add((Object)cpo.ke).add((Object)cpo.kf).add((Object)cpo.cO).add((Object)cpo.eX).build();

    protected dse(dsr $$0, int $$1, drs $$2) {
        this.h = $$0;
        this.g = $$1;
        this.f = $$2;
    }

    public dse(dsr $$0, qr $$1) {
        this($$0, $$1.h("GD"), (drs)drs.a.parse((DynamicOps)rc.a, (Object)$$1.c("BB")).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox")));
        int $$2 = $$1.h("O");
        this.a($$2 == -1 ? null : ha.b($$2));
    }

    protected static drs a(int $$0, int $$1, int $$2, ha $$3, int $$4, int $$5, int $$6) {
        if ($$3.o() == ha.a.c) {
            return new drs($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1);
        }
        return new drs($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
    }

    protected static ha a(apf $$0) {
        return ha.c.a.a($$0);
    }

    public final qr a(dsq $$0) {
        qr $$12 = new qr();
        $$12.a("id", jb.T.b(this.k()).toString());
        drs.a.encodeStart((DynamicOps)rc.a, (Object)this.f).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$1 -> $$12.a("BB", (rk)$$1));
        ha $$2 = this.i();
        $$12.a("O", $$2 == null ? -1 : $$2.e());
        $$12.a("GD", this.g);
        this.a($$0, $$12);
        return $$12;
    }

    protected abstract void a(dsq var1, qr var2);

    public void a(dse $$0, dsf $$1, apf $$2) {
    }

    public abstract void a(cng var1, cne var2, ddy var3, apf var4, drs var5, clt var6, gu var7);

    public drs f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public void a(int $$0) {
        this.g = $$0;
    }

    public boolean a(clt $$0, int $$1) {
        int $$2 = $$0.d();
        int $$3 = $$0.e();
        return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
    }

    public gu h() {
        return new gu(this.f.f());
    }

    protected gu.a b(int $$0, int $$1, int $$2) {
        return new gu.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
    }

    protected int a(int $$0, int $$1) {
        ha $$2 = this.i();
        if ($$2 == null) {
            return $$0;
        }
        switch ($$2) {
            case c: 
            case d: {
                return this.f.g() + $$0;
            }
            case e: {
                return this.f.j() - $$1;
            }
            case f: {
                return this.f.g() + $$1;
            }
        }
        return $$0;
    }

    protected int b(int $$0) {
        if (this.i() == null) {
            return $$0;
        }
        return $$0 + this.f.h();
    }

    protected int b(int $$0, int $$1) {
        ha $$2 = this.i();
        if ($$2 == null) {
            return $$1;
        }
        switch ($$2) {
            case c: {
                return this.f.l() - $$1;
            }
            case d: {
                return this.f.i() + $$1;
            }
            case e: 
            case f: {
                return this.f.i() + $$0;
            }
        }
        return $$1;
    }

    protected void a(cng $$0, dcb $$1, int $$2, int $$3, int $$4, drs $$5) {
        gu.a $$6 = this.b($$2, $$3, $$4);
        if (!$$5.b($$6)) {
            return;
        }
        if (!this.a($$0, $$2, $$3, $$4, $$5)) {
            return;
        }
        if (this.c != cui.a) {
            $$1 = $$1.a(this.c);
        }
        if (this.d != cvz.a) {
            $$1 = $$1.a(this.d);
        }
        $$0.a((gu)$$6, $$1, 2);
        dxe $$7 = $$0.b_($$6);
        if (!$$7.c()) {
            $$0.a((gu)$$6, $$7.a(), 0);
        }
        if (i.contains($$1.b())) {
            $$0.x($$6).e($$6);
        }
    }

    protected boolean a(cmp $$0, int $$1, int $$2, int $$3, drs $$4) {
        return true;
    }

    protected dcb a(cls $$0, int $$1, int $$2, int $$3, drs $$4) {
        gu.a $$5 = this.b($$1, $$2, $$3);
        if (!$$4.b($$5)) {
            return cpo.a.n();
        }
        return $$0.a_($$5);
    }

    protected boolean b(cmp $$0, int $$1, int $$2, int $$3, drs $$4) {
        gu.a $$5 = this.b($$1, $$2 + 1, $$3);
        if (!$$4.b($$5)) {
            return false;
        }
        return $$5.v() < $$0.a(dhk.a.c, $$5.u(), $$5.w());
    }

    protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
        for (int $$8 = $$3; $$8 <= $$6; ++$$8) {
            for (int $$9 = $$2; $$9 <= $$5; ++$$9) {
                for (int $$10 = $$4; $$10 <= $$7; ++$$10) {
                    this.a($$0, cpo.a.n(), $$9, $$8, $$10, $$1);
                }
            }
        }
    }

    protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dcb $$8, dcb $$9, boolean $$10) {
        for (int $$11 = $$3; $$11 <= $$6; ++$$11) {
            for (int $$12 = $$2; $$12 <= $$5; ++$$12) {
                for (int $$13 = $$4; $$13 <= $$7; ++$$13) {
                    if ($$10 && this.a((cls)$$0, $$12, $$11, $$13, $$1).i()) continue;
                    if ($$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7) {
                        this.a($$0, $$8, $$12, $$11, $$13, $$1);
                        continue;
                    }
                    this.a($$0, $$9, $$12, $$11, $$13, $$1);
                }
            }
        }
    }

    protected void a(cng $$0, drs $$1, drs $$2, dcb $$3, dcb $$4, boolean $$5) {
        this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
    }

    protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, apf $$9, a $$10) {
        for (int $$11 = $$3; $$11 <= $$6; ++$$11) {
            for (int $$12 = $$2; $$12 <= $$5; ++$$12) {
                for (int $$13 = $$4; $$13 <= $$7; ++$$13) {
                    if ($$8 && this.a((cls)$$0, $$12, $$11, $$13, $$1).i()) continue;
                    $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                    this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
                }
            }
        }
    }

    protected void a(cng $$0, drs $$1, drs $$2, boolean $$3, apf $$4, a $$5) {
        this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
    }

    protected void a(cng $$0, drs $$1, apf $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dcb $$10, dcb $$11, boolean $$12, boolean $$13) {
        for (int $$14 = $$5; $$14 <= $$8; ++$$14) {
            for (int $$15 = $$4; $$15 <= $$7; ++$$15) {
                for (int $$16 = $$6; $$16 <= $$9; ++$$16) {
                    if ($$2.i() > $$3 || $$12 && this.a((cls)$$0, $$15, $$14, $$16, $$1).i() || $$13 && !this.b($$0, $$15, $$14, $$16, $$1)) continue;
                    if ($$14 == $$5 || $$14 == $$8 || $$15 == $$4 || $$15 == $$7 || $$16 == $$6 || $$16 == $$9) {
                        this.a($$0, $$10, $$15, $$14, $$16, $$1);
                        continue;
                    }
                    this.a($$0, $$11, $$15, $$14, $$16, $$1);
                }
            }
        }
    }

    protected void a(cng $$0, drs $$1, apf $$2, float $$3, int $$4, int $$5, int $$6, dcb $$7) {
        if ($$2.i() < $$3) {
            this.a($$0, $$7, $$4, $$5, $$6, $$1);
        }
    }

    protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dcb $$8, boolean $$9) {
        float $$10 = $$5 - $$2 + 1;
        float $$11 = $$6 - $$3 + 1;
        float $$12 = $$7 - $$4 + 1;
        float $$13 = (float)$$2 + $$10 / 2.0f;
        float $$14 = (float)$$4 + $$12 / 2.0f;
        for (int $$15 = $$3; $$15 <= $$6; ++$$15) {
            float $$16 = (float)($$15 - $$3) / $$11;
            for (int $$17 = $$2; $$17 <= $$5; ++$$17) {
                float $$18 = ((float)$$17 - $$13) / ($$10 * 0.5f);
                for (int $$19 = $$4; $$19 <= $$7; ++$$19) {
                    float $$21;
                    float $$20 = ((float)$$19 - $$14) / ($$12 * 0.5f);
                    if ($$9 && this.a((cls)$$0, $$17, $$15, $$19, $$1).i() || !(($$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20) <= 1.05f)) continue;
                    this.a($$0, $$8, $$17, $$15, $$19, $$1);
                }
            }
        }
    }

    protected void b(cng $$0, dcb $$1, int $$2, int $$3, int $$4, drs $$5) {
        gu.a $$6 = this.b($$2, $$3, $$4);
        if (!$$5.b($$6)) {
            return;
        }
        while (this.a($$0.a_($$6)) && $$6.v() > $$0.C_() + 1) {
            $$0.a((gu)$$6, $$1, 2);
            $$6.c(ha.a);
        }
    }

    protected boolean a(dcb $$0) {
        return $$0.i() || $$0.k() || $$0.a(cpo.fg) || $$0.a(cpo.bw) || $$0.a(cpo.bx);
    }

    protected boolean a(cng $$0, drs $$1, apf $$2, int $$3, int $$4, int $$5, acq $$6) {
        return this.a((cnb)$$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
    }

    public static dcb a(cls $$0, gu $$1, dcb $$2) {
        ha $$3 = null;
        for (ha $$4 : ha.c.a) {
            gu $$5 = $$1.a($$4);
            dcb $$6 = $$0.a_($$5);
            if ($$6.a(cpo.cv)) {
                return $$2;
            }
            if (!$$6.i($$0, $$5)) continue;
            if ($$3 == null) {
                $$3 = $$4;
                continue;
            }
            $$3 = null;
            break;
        }
        if ($$3 != null) {
            return (dcb)$$2.a(ctg.aC, $$3.g());
        }
        ha $$7 = $$2.c(ctg.aC);
        gu $$8 = $$1.a($$7);
        if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
        }
        if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
        }
        if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
        }
        return (dcb)$$2.a(ctg.aC, $$7);
    }

    protected boolean a(cnb $$0, drs $$1, apf $$2, gu $$3, acq $$4, @Nullable dcb $$5) {
        if (!$$1.b($$3) || $$0.a_($$3).a(cpo.cv)) {
            return false;
        }
        if ($$5 == null) {
            $$5 = dse.a($$0, $$3, cpo.cv.n());
        }
        $$0.a($$3, $$5, 2);
        czn $$6 = $$0.c_($$3);
        if ($$6 instanceof czu) {
            ((czu)$$6).a($$4, $$2.g());
        }
        return true;
    }

    protected boolean a(cng $$0, drs $$1, apf $$2, int $$3, int $$4, int $$5, ha $$6, acq $$7) {
        gu.a $$8 = this.b($$3, $$4, $$5);
        if ($$1.b($$8) && !$$0.a_($$8).a(cpo.aU)) {
            this.a($$0, (dcb)cpo.aU.n().a(cro.a, $$6), $$3, $$4, $$5, $$1);
            czn $$9 = $$0.c_($$8);
            if ($$9 instanceof dae) {
                ((dae)$$9).a($$7, $$2.g());
            }
            return true;
        }
        return false;
    }

    public void a(int $$0, int $$1, int $$2) {
        this.f.a($$0, $$1, $$2);
    }

    public static drs a(Stream<dse> $$0) {
        return drs.b($$0.map(dse::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
    }

    @Nullable
    public static dse a(List<dse> $$0, drs $$1) {
        for (dse $$2 : $$0) {
            if (!$$2.f().a($$1)) continue;
            return $$2;
        }
        return null;
    }

    @Nullable
    public ha i() {
        return this.b;
    }

    public void a(@Nullable ha $$0) {
        this.b = $$0;
        if ($$0 == null) {
            this.d = cvz.a;
            this.c = cui.a;
        } else {
            switch ($$0) {
                case d: {
                    this.c = cui.b;
                    this.d = cvz.a;
                    break;
                }
                case e: {
                    this.c = cui.b;
                    this.d = cvz.b;
                    break;
                }
                case f: {
                    this.c = cui.a;
                    this.d = cvz.b;
                    break;
                }
                default: {
                    this.c = cui.a;
                    this.d = cvz.a;
                }
            }
        }
    }

    public cvz a() {
        return this.d;
    }

    public cui j() {
        return this.c;
    }

    public dsr k() {
        return this.h;
    }

    public static abstract class a {
        protected dcb a = cpo.a.n();

        public abstract void a(apf var1, int var2, int var3, int var4, boolean var5);

        public dcb a() {
            return this.a;
        }
    }
}

