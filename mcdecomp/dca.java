/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.MapCodec
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dca
implements cat {
    protected static final ha[] aD = new ha[]{ha.e, ha.f, ha.c, ha.d, ha.a, ha.b};
    protected final boolean aE;
    protected final float aF;
    protected final boolean aG;
    protected final cxa aH;
    protected final float aI;
    protected final float aJ;
    protected final float aK;
    protected final boolean aL;
    protected final caw aM;
    protected final d aN;
    @Nullable
    protected acq aO;

    public dca(d $$0) {
        this.aE = $$0.b;
        this.aO = $$0.l;
        this.aF = $$0.e;
        this.aG = $$0.h;
        this.aH = $$0.c;
        this.aI = $$0.i;
        this.aJ = $$0.j;
        this.aK = $$0.k;
        this.aL = $$0.C;
        this.aM = $$0.D;
        this.aN = $$0;
    }

    @Deprecated
    public void a(dcb $$0, cmn $$1, gu $$2, int $$3, int $$4) {
    }

    @Deprecated
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        switch ($$3) {
            case a: {
                return !$$0.r($$1, $$2);
            }
            case b: {
                return $$1.b_($$2).a(anb.a);
            }
            case c: {
                return !$$0.r($$1, $$2);
            }
        }
        return false;
    }

    @Deprecated
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        return $$0;
    }

    @Deprecated
    public boolean a(dcb $$0, dcb $$1, ha $$2) {
        return false;
    }

    @Deprecated
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        za.a($$1, $$2);
    }

    @Deprecated
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
    }

    @Deprecated
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.t() && !$$0.a($$3.b())) {
            $$1.n($$2);
        }
    }

    @Deprecated
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        return bdx.d;
    }

    @Deprecated
    public boolean a(dcb $$0, cmm $$1, gu $$2, int $$3, int $$4) {
        return false;
    }

    @Deprecated
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Deprecated
    public boolean g_(dcb $$0) {
        return false;
    }

    @Deprecated
    public boolean f_(dcb $$0) {
        return false;
    }

    @Deprecated
    public dxe c_(dcb $$0) {
        return dxf.a.g();
    }

    @Deprecated
    public boolean d_(dcb $$0) {
        return false;
    }

    public float al_() {
        return 0.25f;
    }

    public float an_() {
        return 0.2f;
    }

    @Override
    public caw m() {
        return this.aM;
    }

    @Deprecated
    public dcb a(dcb $$0, cvz $$1) {
        return $$0;
    }

    @Deprecated
    public dcb a(dcb $$0, cui $$1) {
        return $$0;
    }

    @Deprecated
    public boolean a(dcb $$0, cih $$1) {
        return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
    }

    @Deprecated
    public boolean a(dcb $$0, dxd $$1) {
        return $$0.r() || !$$0.e();
    }

    @Deprecated
    public List<cfz> a(dcb $$0, dzq.a $$1) {
        acq $$2 = this.r();
        if ($$2 == dzg.a) {
            return Collections.emptyList();
        }
        dzq $$3 = $$1.a(ebw.g, $$0).a(ebv.n);
        aif $$4 = $$3.a();
        dzs $$5 = $$4.n().aH().getLootTable($$2);
        return $$5.a($$3);
    }

    @Deprecated
    public long a(dcb $$0, gu $$1) {
        return apa.a($$1);
    }

    @Deprecated
    public efb f(dcb $$0, cls $$1, gu $$2) {
        return $$0.j($$1, $$2);
    }

    @Deprecated
    public efb b_(dcb $$0, cls $$1, gu $$2) {
        return this.c($$0, $$1, $$2, een.a());
    }

    @Deprecated
    public efb a(dcb $$0, cls $$1, gu $$2) {
        return eey.a();
    }

    @Deprecated
    public int g(dcb $$0, cls $$1, gu $$2) {
        if ($$0.i($$1, $$2)) {
            return $$1.M();
        }
        return $$0.a($$1, $$2) ? 0 : 1;
    }

    @Nullable
    @Deprecated
    public bea b(dcb $$0, cmm $$1, gu $$2) {
        return null;
    }

    @Deprecated
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return true;
    }

    @Deprecated
    public float b(dcb $$0, cls $$1, gu $$2) {
        return $$0.r($$1, $$2) ? 0.2f : 1.0f;
    }

    @Deprecated
    public int a(dcb $$0, cmm $$1, gu $$2) {
        return 0;
    }

    @Deprecated
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return eey.b();
    }

    @Deprecated
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.aE ? $$0.j($$1, $$2) : eey.a();
    }

    @Deprecated
    public boolean a_(dcb $$0, cls $$1, gu $$2) {
        return cpn.a($$0.k($$1, $$2));
    }

    @Deprecated
    public boolean h(dcb $$0, cls $$1, gu $$2) {
        return cpn.a($$0.c($$1, $$2));
    }

    @Deprecated
    public efb b(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.c($$0, $$1, $$2, $$3);
    }

    @Deprecated
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        this.a($$0, $$1, $$2, $$3);
    }

    @Deprecated
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
    }

    @Deprecated
    public float a(dcb $$0, byo $$1, cls $$2, gu $$3) {
        float $$4 = $$0.h($$2, $$3);
        if ($$4 == -1.0f) {
            return 0.0f;
        }
        int $$5 = $$1.e($$0) ? 30 : 100;
        return $$1.d($$0) / $$4 / (float)$$5;
    }

    @Deprecated
    public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
    }

    @Deprecated
    public void a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
    }

    @Deprecated
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return 0;
    }

    @Deprecated
    public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
    }

    @Deprecated
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return 0;
    }

    public final acq r() {
        if (this.aO == null) {
            acq $$0 = jb.f.b(this.p());
            this.aO = $$0.d("blocks/");
        }
        return this.aO;
    }

    @Deprecated
    public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
    }

    public abstract cfu k();

    protected abstract cpn p();

    public dxi s() {
        return this.aN.a.apply(this.p().n());
    }

    public float t() {
        return this.aN.f;
    }

    public static class d {
        Function<dcb, dxi> a = $$0 -> dxi.a;
        boolean b = true;
        cxa c = cxa.f;
        ToIntFunction<dcb> d = $$0 -> 0;
        float e;
        float f;
        boolean g;
        boolean h;
        float i = 0.6f;
        float j = 1.0f;
        float k = 1.0f;
        acq l;
        boolean m = true;
        boolean n;
        boolean o;
        @Deprecated
        boolean p;
        @Deprecated
        boolean q;
        boolean r;
        dxj s = dxj.a;
        boolean t = true;
        ddc u = ddc.a;
        boolean v;
        e<bfn<?>> w = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ha.b) && $$0.h() < 14;
        f x = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
        f y;
        f z = this.y = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
        f A = ($$0, $$1, $$2) -> false;
        f B = ($$0, $$1, $$2) -> false;
        boolean C;
        caw D = cay.e;
        Optional<b> E = Optional.empty();

        private d() {
        }

        public static d a() {
            return new d();
        }

        public static d a(dca $$0) {
            d $$1 = new d();
            $$1.f = $$0.aN.f;
            $$1.e = $$0.aN.e;
            $$1.b = $$0.aN.b;
            $$1.h = $$0.aN.h;
            $$1.d = $$0.aN.d;
            $$1.a = $$0.aN.a;
            $$1.c = $$0.aN.c;
            $$1.i = $$0.aN.i;
            $$1.j = $$0.aN.j;
            $$1.C = $$0.aN.C;
            $$1.m = $$0.aN.m;
            $$1.n = $$0.aN.n;
            $$1.o = $$0.aN.o;
            $$1.p = $$0.aN.p;
            $$1.q = $$0.aN.q;
            $$1.r = $$0.aN.r;
            $$1.s = $$0.aN.s;
            $$1.g = $$0.aN.g;
            $$1.E = $$0.aN.E;
            $$1.t = $$0.aN.t;
            $$1.D = $$0.aN.D;
            $$1.B = $$0.aN.B;
            $$1.u = $$0.aN.u;
            $$1.v = $$0.aN.v;
            return $$1;
        }

        public d a(cen $$0) {
            this.a = $$1 -> $$0.e();
            return this;
        }

        public d a(dxi $$0) {
            this.a = $$1 -> $$0;
            return this;
        }

        public d a(Function<dcb, dxi> $$0) {
            this.a = $$0;
            return this;
        }

        public d b() {
            this.b = false;
            this.m = false;
            return this;
        }

        public d c() {
            this.m = false;
            return this;
        }

        public d a(float $$0) {
            this.i = $$0;
            return this;
        }

        public d b(float $$0) {
            this.j = $$0;
            return this;
        }

        public d c(float $$0) {
            this.k = $$0;
            return this;
        }

        public d a(cxa $$0) {
            this.c = $$0;
            return this;
        }

        public d a(ToIntFunction<dcb> $$0) {
            this.d = $$0;
            return this;
        }

        public d a(float $$0, float $$1) {
            return this.e($$0).f($$1);
        }

        public d d() {
            return this.d(0.0f);
        }

        public d d(float $$0) {
            this.a($$0, $$0);
            return this;
        }

        public d e() {
            this.h = true;
            return this;
        }

        public d f() {
            this.C = true;
            return this;
        }

        public d g() {
            this.l = dzg.a;
            return this;
        }

        public d a(cpn $$0) {
            this.l = $$0.r();
            return this;
        }

        public d h() {
            this.o = true;
            return this;
        }

        public d i() {
            this.p = true;
            return this;
        }

        public d j() {
            this.r = true;
            return this;
        }

        @Deprecated
        public d k() {
            this.q = true;
            return this;
        }

        public d a(dxj $$0) {
            this.s = $$0;
            return this;
        }

        public d l() {
            this.n = true;
            return this;
        }

        public d a(e<bfn<?>> $$0) {
            this.w = $$0;
            return this;
        }

        public d a(f $$0) {
            this.x = $$0;
            return this;
        }

        public d b(f $$0) {
            this.y = $$0;
            return this;
        }

        public d c(f $$0) {
            this.z = $$0;
            return this;
        }

        public d d(f $$0) {
            this.A = $$0;
            return this;
        }

        public d e(f $$0) {
            this.B = $$0;
            return this;
        }

        public d m() {
            this.g = true;
            return this;
        }

        public d e(float $$0) {
            this.f = $$0;
            return this;
        }

        public d f(float $$0) {
            this.e = Math.max(0.0f, $$0);
            return this;
        }

        public d a(c $$02) {
            switch ($$02) {
                default: {
                    this.E = Optional.empty();
                    break;
                }
                case c: {
                    this.E = Optional.of(($$0, $$1, $$2) -> {
                        cpn $$3 = $$0.b();
                        long $$4 = apa.b($$2.u(), 0, $$2.w());
                        double $$5 = ((double)((float)($$4 >> 4 & 0xFL) / 15.0f) - 1.0) * (double)$$3.an_();
                        float $$6 = $$3.al_();
                        double $$7 = apa.a(((double)((float)($$4 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                        double $$8 = apa.a(((double)((float)($$4 >> 8 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                        return new eei($$7, $$5, $$8);
                    });
                    break;
                }
                case b: {
                    this.E = Optional.of(($$0, $$1, $$2) -> {
                        cpn $$3 = $$0.b();
                        long $$4 = apa.b($$2.u(), 0, $$2.w());
                        float $$5 = $$3.al_();
                        double $$6 = apa.a(((double)((float)($$4 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                        double $$7 = apa.a(((double)((float)($$4 >> 8 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                        return new eei($$6, 0.0, $$7);
                    });
                }
            }
            return this;
        }

        public d n() {
            this.t = false;
            return this;
        }

        public d a(cau ... $$0) {
            this.D = cay.c.a($$0);
            return this;
        }

        public d a(ddc $$0) {
            this.u = $$0;
            return this;
        }

        public d o() {
            this.v = true;
            return this;
        }
    }

    public static interface e<A> {
        public boolean test(dcb var1, cls var2, gu var3, A var4);
    }

    public static interface b {
        public eei evaluate(dcb var1, cls var2, gu var3);
    }

    public static interface f {
        public boolean test(dcb var1, cls var2, gu var3);
    }

    public static abstract class dca$a
    extends dcd<cpn, dcb> {
        private final int b;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        @Deprecated
        private final boolean j;
        @Deprecated
        private boolean k;
        private final dxj l;
        private final dxi m;
        private final float n;
        private final boolean o;
        private final boolean p;
        private final f q;
        private final f r;
        private final f s;
        private final f t;
        private final f u;
        private final Optional<b> v;
        private final boolean w;
        private final ddc x;
        private final boolean y;
        @Nullable
        protected a a;
        private dxe z = dxf.a.g();
        private boolean A;

        protected dca$a(cpn $$0, ImmutableMap<dde<?>, Comparable<?>> $$1, MapCodec<dcb> $$2) {
            super($$0, $$1, $$2);
            d $$3 = $$0.aN;
            this.b = $$3.d.applyAsInt(this.x());
            this.g = $$0.g_(this.x());
            this.h = $$3.n;
            this.i = $$3.o;
            this.j = $$3.p;
            this.l = $$3.s;
            this.m = $$3.a.apply(this.x());
            this.n = $$3.f;
            this.o = $$3.g;
            this.p = $$3.m;
            this.q = $$3.x;
            this.r = $$3.y;
            this.s = $$3.z;
            this.t = $$3.A;
            this.u = $$3.B;
            this.v = $$3.E;
            this.w = $$3.t;
            this.x = $$3.u;
            this.y = $$3.v;
        }

        private boolean D() {
            if (((cpn)this.e).aN.r) {
                return true;
            }
            if (((cpn)this.e).aN.q) {
                return false;
            }
            if (this.a == null) {
                return false;
            }
            efb $$0 = this.a.b;
            if ($$0.b()) {
                return false;
            }
            eed $$1 = $$0.a();
            if ($$1.a() >= 0.7291666666666666) {
                return true;
            }
            return $$1.c() >= 1.0;
        }

        public void a() {
            this.z = ((cpn)this.e).c_(this.x());
            this.A = ((cpn)this.e).e_(this.x());
            if (!this.b().o()) {
                this.a = new a(this.x());
            }
            this.k = this.D();
        }

        public cpn b() {
            return (cpn)this.e;
        }

        public he<cpn> c() {
            return ((cpn)this.e).q();
        }

        @Deprecated
        public boolean d() {
            cpn $$0 = this.b();
            return $$0 != cpo.bs && $$0 != cpo.mY && this.e();
        }

        @Deprecated
        public boolean e() {
            return this.k;
        }

        public boolean a(cls $$0, gu $$1, bfn<?> $$2) {
            return this.b().aN.w.test(this.x(), $$0, $$1, $$2);
        }

        public boolean a(cls $$0, gu $$1) {
            if (this.a != null) {
                return this.a.g;
            }
            return this.b().c(this.x(), $$0, $$1);
        }

        public int b(cls $$0, gu $$1) {
            if (this.a != null) {
                return this.a.h;
            }
            return this.b().g(this.x(), $$0, $$1);
        }

        public efb a(cls $$0, gu $$1, ha $$2) {
            if (this.a != null && this.a.i != null) {
                return this.a.i[$$2.ordinal()];
            }
            return eey.a(this.c($$0, $$1), $$2);
        }

        public efb c(cls $$0, gu $$1) {
            return this.b().f(this.x(), $$0, $$1);
        }

        public boolean f() {
            return this.a == null || this.a.c;
        }

        public boolean g() {
            return this.g;
        }

        public int h() {
            return this.b;
        }

        public boolean i() {
            return this.h;
        }

        public boolean j() {
            return this.i;
        }

        @Deprecated
        public boolean k() {
            return this.j;
        }

        public dxi d(cls $$0, gu $$1) {
            return this.m;
        }

        public dcb a(cvz $$0) {
            return this.b().a(this.x(), $$0);
        }

        public dcb a(cui $$0) {
            return this.b().a(this.x(), $$0);
        }

        public cvs l() {
            return this.b().b_(this.x());
        }

        public boolean e(cls $$0, gu $$1) {
            return this.u.test(this.x(), $$0, $$1);
        }

        public float f(cls $$0, gu $$1) {
            return this.b().b(this.x(), $$0, $$1);
        }

        public boolean g(cls $$0, gu $$1) {
            return this.q.test(this.x(), $$0, $$1);
        }

        public boolean m() {
            return this.b().f_(this.x());
        }

        public int b(cls $$0, gu $$1, ha $$2) {
            return this.b().a(this.x(), $$0, $$1, $$2);
        }

        public boolean n() {
            return this.b().d_(this.x());
        }

        public int a(cmm $$0, gu $$1) {
            return this.b().a(this.x(), $$0, $$1);
        }

        public float h(cls $$0, gu $$1) {
            return this.n;
        }

        public float a(byo $$0, cls $$1, gu $$2) {
            return this.b().a(this.x(), $$0, $$1, $$2);
        }

        public int c(cls $$0, gu $$1, ha $$2) {
            return this.b().b(this.x(), $$0, $$1, $$2);
        }

        public dxj o() {
            return this.l;
        }

        public boolean i(cls $$0, gu $$1) {
            if (this.a != null) {
                return this.a.a;
            }
            dcb $$2 = this.x();
            if ($$2.p()) {
                return cpn.a($$2.c($$0, $$1));
            }
            return false;
        }

        public boolean p() {
            return this.p;
        }

        public boolean a(dcb $$0, ha $$1) {
            return this.b().a(this.x(), $$0, $$1);
        }

        public efb j(cls $$0, gu $$1) {
            return this.a($$0, $$1, een.a());
        }

        public efb a(cls $$0, gu $$1, een $$2) {
            return this.b().a(this.x(), $$0, $$1, $$2);
        }

        public efb k(cls $$0, gu $$1) {
            if (this.a != null) {
                return this.a.b;
            }
            return this.b($$0, $$1, een.a());
        }

        public efb b(cls $$0, gu $$1, een $$2) {
            return this.b().c(this.x(), $$0, $$1, $$2);
        }

        public efb l(cls $$0, gu $$1) {
            return this.b().b_(this.x(), $$0, $$1);
        }

        public efb c(cls $$0, gu $$1, een $$2) {
            return this.b().b(this.x(), $$0, $$1, $$2);
        }

        public efb m(cls $$0, gu $$1) {
            return this.b().a(this.x(), $$0, $$1);
        }

        public final boolean a(cls $$0, gu $$1, bfj $$2) {
            return this.a($$0, $$1, $$2, ha.b);
        }

        public final boolean a(cls $$0, gu $$1, bfj $$2, ha $$3) {
            return cpn.a(this.b($$0, $$1, een.a($$2)), $$3);
        }

        public eei n(cls $$0, gu $$1) {
            return this.v.map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(eei.b);
        }

        public boolean q() {
            return !this.v.isEmpty();
        }

        public boolean a(cmm $$0, gu $$1, int $$2, int $$3) {
            return this.b().a(this.x(), $$0, $$1, $$2, $$3);
        }

        @Deprecated
        public void a(cmm $$0, gu $$1, cpn $$2, gu $$3, boolean $$4) {
            this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
        }

        public final void a(cmn $$0, gu $$1, int $$2) {
            this.a($$0, $$1, $$2, 512);
        }

        public final void a(cmn $$0, gu $$1, int $$2, int $$3) {
            gu.a $$4 = new gu.a();
            for (ha $$5 : aD) {
                $$4.a((hz)$$1, $$5);
                $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
            }
        }

        public final void b(cmn $$0, gu $$1, int $$2) {
            this.b($$0, $$1, $$2, 512);
        }

        public void b(cmn $$0, gu $$1, int $$2, int $$3) {
            this.b().a(this.x(), $$0, $$1, $$2, $$3);
        }

        public void a(cmm $$0, gu $$1, dcb $$2, boolean $$3) {
            this.b().b(this.x(), $$0, $$1, $$2, $$3);
        }

        public void b(cmm $$0, gu $$1, dcb $$2, boolean $$3) {
            this.b().a(this.x(), $$0, $$1, $$2, $$3);
        }

        public void a(aif $$0, gu $$1, apf $$2) {
            this.b().a(this.x(), $$0, $$1, $$2);
        }

        public void b(aif $$0, gu $$1, apf $$2) {
            this.b().b(this.x(), $$0, $$1, $$2);
        }

        public void a(cmm $$0, gu $$1, bfj $$2) {
            this.b().a(this.x(), $$0, $$1, $$2);
        }

        public void a(aif $$0, gu $$1, cfz $$2, boolean $$3) {
            this.b().a(this.x(), $$0, $$1, $$2, $$3);
        }

        public List<cfz> a(dzq.a $$0) {
            return this.b().a(this.x(), $$0);
        }

        public bdx a(cmm $$0, byo $$1, bdw $$2, eee $$3) {
            return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
        }

        public void a(cmm $$0, gu $$1, byo $$2) {
            this.b().a(this.x(), $$0, $$1, $$2);
        }

        public boolean o(cls $$0, gu $$1) {
            return this.r.test(this.x(), $$0, $$1);
        }

        public boolean p(cls $$0, gu $$1) {
            return this.s.test(this.x(), $$0, $$1);
        }

        public dcb a(ha $$0, dcb $$1, cmn $$2, gu $$3, gu $$4) {
            return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
        }

        public boolean a(cls $$0, gu $$1, dxu $$2) {
            return this.b().a(this.x(), $$0, $$1, $$2);
        }

        public boolean a(cih $$0) {
            return this.b().a(this.x(), $$0);
        }

        public boolean a(dxd $$0) {
            return this.b().a(this.x(), $$0);
        }

        public boolean r() {
            return this.y;
        }

        public boolean a(cmp $$0, gu $$1) {
            return this.b().a(this.x(), $$0, $$1);
        }

        public boolean q(cls $$0, gu $$1) {
            return this.t.test(this.x(), $$0, $$1);
        }

        @Nullable
        public bea b(cmm $$0, gu $$1) {
            return this.b().b(this.x(), $$0, $$1);
        }

        @Override
        public boolean a(anl<cpn> $$0) {
            return this.b().q().a($$0);
        }

        @Override
        public boolean a(anl<cpn> $$0, Predicate<dca$a> $$1) {
            return this.a($$0) && $$1.test(this);
        }

        @Override
        public boolean a(hi<cpn> $$0) {
            return $$0.a(this.b().q());
        }

        public Stream<anl<cpn>> s() {
            return this.b().q().c();
        }

        public boolean t() {
            return this.b() instanceof csb;
        }

        @Nullable
        public <T extends czn> czo<T> a(cmm $$0, czp<T> $$1) {
            if (this.b() instanceof csb) {
                return ((csb)((Object)this.b())).a($$0, this.x(), $$1);
            }
            return null;
        }

        public boolean a(cpn $$0) {
            return this.b() == $$0;
        }

        public dxe u() {
            return this.z;
        }

        public boolean v() {
            return this.A;
        }

        public long a(gu $$0) {
            return this.b().a(this.x(), $$0);
        }

        public cxa w() {
            return this.b().m(this.x());
        }

        public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
            this.b().a($$0, $$1, $$2, $$3);
        }

        public boolean d(cls $$0, gu $$1, ha $$2) {
            return this.a($$0, $$1, $$2, cxp.a);
        }

        public boolean a(cls $$0, gu $$1, ha $$2, cxp $$3) {
            if (this.a != null) {
                return this.a.a($$2, $$3);
            }
            return $$3.a(this.x(), $$0, $$1, $$2);
        }

        public boolean r(cls $$0, gu $$1) {
            if (this.a != null) {
                return this.a.d;
            }
            return this.b().a_(this.x(), $$0, $$1);
        }

        protected abstract dcb x();

        public boolean y() {
            return this.o;
        }

        public boolean z() {
            return this.w;
        }

        public ddc A() {
            return this.x;
        }

        static final class a {
            private static final ha[] e = ha.values();
            private static final int f = cxp.values().length;
            protected final boolean a;
            final boolean g;
            final int h;
            @Nullable
            final efb[] i;
            protected final efb b;
            protected final boolean c;
            private final boolean[] j;
            protected final boolean d;

            a(dcb $$02) {
                cpn $$1 = $$02.b();
                this.a = $$02.i(cmb.a, gu.b);
                this.g = $$1.c($$02, cmb.a, gu.b);
                this.h = $$1.g($$02, cmb.a, gu.b);
                if (!$$02.p()) {
                    this.i = null;
                } else {
                    this.i = new efb[e.length];
                    efb $$2 = $$1.f($$02, cmb.a, gu.b);
                    ha[] haArray = e;
                    int n2 = haArray.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        ha $$3 = haArray[i2];
                        this.i[$$3.ordinal()] = eey.a($$2, $$3);
                    }
                }
                this.b = $$1.c($$02, cmb.a, gu.b, een.a());
                if (!this.b.b() && $$02.q()) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jb.f.b($$1)));
                }
                this.c = Arrays.stream(ha.a.values()).anyMatch($$0 -> this.b.b((ha.a)$$0) < 0.0 || this.b.c((ha.a)$$0) > 1.0);
                this.j = new boolean[e.length * f];
                for (ha $$4 : e) {
                    for (cxp $$5 : cxp.values()) {
                        this.j[dca$a$a.b((ha)$$4, (cxp)$$5)] = $$5.a($$02, cmb.a, gu.b, $$4);
                    }
                }
                this.d = cpn.a($$02.k(cmb.a, gu.b));
            }

            public boolean a(ha $$0, cxp $$1) {
                return this.j[dca$a$a.b($$0, $$1)];
            }

            private static int b(ha $$0, cxp $$1) {
                return $$0.ordinal() * f + $$1.ordinal();
            }
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = dca$c.a();
        }
    }
}

