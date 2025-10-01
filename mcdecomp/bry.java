/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.tuple.Pair
 */
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class bry
extends brs
implements bgr,
bgy<a> {
    private static final aby<String> bT = acb.a(bry.class, aca.e);
    private static final int bU = 1024;
    @Nullable
    private bey bW;
    private int bX;
    @Nullable
    private UUID bY;

    public bry(bfn<? extends bry> $$0, cmm $$1) {
        super((bfn<? extends brs>)$$0, $$1);
    }

    @Override
    public float a(gu $$0, cmp $$1) {
        if ($$1.a_($$0.d()).a(cpo.fl)) {
            return 10.0f;
        }
        return $$1.v($$0);
    }

    public static boolean c(bfn<bry> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$1.a_($$3.d()).a(amw.bQ) && bry.a($$1, $$3);
    }

    @Override
    public void a(aif $$0, bfy $$1) {
        UUID $$2 = $$1.ct();
        if (!$$2.equals(this.bY)) {
            this.a(this.r() == a.a ? a.b : a.a);
            this.bY = $$2;
            this.a(amh.nj, 2.0f, 1.0f);
        }
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bT, a.a.d);
    }

    @Override
    public bdx b(byo $$0, bdw $$12) {
        cfz $$2 = $$0.b($$12);
        if ($$2.a(cgc.oC) && !this.h_()) {
            amg $$8;
            cfz $$5;
            boolean $$3 = false;
            if (this.bW != null) {
                $$3 = true;
                cfz $$4 = new cfz(cgc.va);
                chj.a($$4, this.bW, this.bX);
                this.bW = null;
                this.bX = 0;
            } else {
                $$5 = new cfz(cgc.oD);
            }
            cfz $$6 = cgb.a($$2, $$0, $$5, false);
            $$0.a($$12, $$6);
            if ($$3) {
                amg $$7 = amh.nm;
            } else {
                $$8 = amh.nl;
            }
            this.a($$8, 1.0f, 1.0f);
            return bdx.a(this.dI().B);
        }
        if ($$2.a(cgc.rg) && this.a()) {
            this.a(ami.h);
            this.a(dgl.N, (bfj)$$0);
            if (!this.dI().B) {
                $$2.a(1, $$0, (T $$1) -> $$1.d($$12));
            }
            return bdx.a(this.dI().B);
        }
        if (this.r() == a.b && $$2.a(ane.O)) {
            if (this.bW != null) {
                for (int $$9 = 0; $$9 < 2; ++$$9) {
                    this.dI().a(iv.Z, this.dn() + this.af.j() / 2.0, this.e(0.5), this.dt() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
                }
            } else {
                Optional<Pair<bey, Integer>> $$10 = this.l($$2);
                if (!$$10.isPresent()) {
                    return bdx.d;
                }
                Pair<bey, Integer> $$11 = $$10.get();
                if (!$$0.fO().d) {
                    $$2.h(1);
                }
                for (int $$122 = 0; $$122 < 4; ++$$122) {
                    this.dI().a(iv.q, this.dn() + this.af.j() / 2.0, this.e(0.5), this.dt() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
                }
                this.bW = (bey)$$11.getLeft();
                this.bX = (Integer)$$11.getRight();
                this.a(amh.nk, 2.0f, 1.0f);
            }
            return bdx.a(this.dI().B);
        }
        return super.b($$0, $$12);
    }

    @Override
    public void a(ami $$0) {
        brs $$1;
        this.dI().a(null, this, amh.nn, $$0, 1.0f, 1.0f);
        if (!this.dI().r_() && ($$1 = bfn.t.a(this.dI())) != null) {
            ((aif)this.dI()).a(iv.x, this.dn(), this.e(0.5), this.dt(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ai();
            $$1.b(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
            $$1.t(this.er());
            $$1.aV = this.aV;
            if (this.aa()) {
                $$1.b(this.ab());
                $$1.n(this.cy());
            }
            if (this.fH()) {
                $$1.fF();
            }
            $$1.m(this.co());
            this.dI().b($$1);
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                this.dI().b(new bvh(this.dI(), this.dn(), this.e(1.0), this.dt(), new cfz(this.r().e.b())));
            }
        }
    }

    @Override
    public boolean a() {
        return this.bs() && !this.h_();
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("Type", this.r().c());
        if (this.bW != null) {
            $$0.a("EffectId", bey.a(this.bW));
            $$0.a("EffectDuration", this.bX);
        }
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.a(a.a($$0.l("Type")));
        if ($$0.b("EffectId", 99)) {
            this.bW = bey.a($$0.h("EffectId"));
        }
        if ($$0.b("EffectDuration", 99)) {
            this.bX = $$0.h("EffectDuration");
        }
    }

    private Optional<Pair<bey, Integer>> l(cfz $$0) {
        cxq $$1 = cxq.a($$0.d());
        if ($$1 != null) {
            return Optional.of(Pair.of((Object)$$1.a(), (Object)$$1.b()));
        }
        return Optional.empty();
    }

    @Override
    public void a(a $$0) {
        this.am.b(bT, $$0.d);
    }

    public a r() {
        return a.a(this.am.b(bT));
    }

    @Nullable
    public bry c(aif $$0, bfe $$1) {
        bry $$2 = bfn.ao.a($$0);
        if ($$2 != null) {
            $$2.a(this.a((bry)$$1));
        }
        return $$2;
    }

    private a a(bry $$0) {
        a $$4;
        a $$2;
        a $$1 = this.r();
        if ($$1 == ($$2 = $$0.r()) && this.af.a(1024) == 0) {
            a $$3 = $$1 == a.b ? a.a : a.b;
        } else {
            $$4 = this.af.h() ? $$1 : $$2;
        }
        return $$4;
    }

    @Override
    @Nullable
    public /* synthetic */ brs b(aif aif2, bfe bfe2) {
        return this.c(aif2, bfe2);
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.c(aif2, bfe2);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.r();
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("red", cpo.cg.n());
        public static final /* enum */ a b = new a("brown", cpo.cf.n());
        public static final apr.a<a> c;
        final String d;
        final dcb e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, dcb $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public dcb a() {
            return this.e;
        }

        @Override
        public String c() {
            return this.d;
        }

        static a a(String $$0) {
            return c.a($$0, a);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            f = bry$a.b();
            c = apr.a(a::values);
        }
    }
}

