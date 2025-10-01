/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fmi
implements flu<dav> {
    private static final String a = "stick";
    private static final int b = -988212;
    private static final int c = apa.h(16);
    private static final float d = 0.6666667f;
    private static final eei e = new eei(0.0, 0.3333333432674408, 0.046666666865348816);
    private final Map<ddo, a> f = (Map)ddo.a().collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$1 -> new a($$02.a(fed.a($$1)))));
    private final eov g;

    public fmi(flv.a $$02) {
        this.g = $$02.f();
    }

    @Override
    public void a(dav $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        dcb $$6 = $$0.q();
        cwn $$7 = (cwn)$$6.b();
        ddo $$8 = cwn.a($$7);
        a $$9 = this.f.get($$8);
        $$9.b.k = $$6.b() instanceof cxi;
        this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    public float b() {
        return 0.6666667f;
    }

    public float c() {
        return 0.6666667f;
    }

    void a(dav $$0, eij $$1, fjx $$2, int $$3, int $$4, dcb $$5, cwn $$6, ddo $$7, fcb $$8) {
        $$1.a();
        this.a($$1, -$$6.g($$5), $$5);
        this.a($$1, $$2, $$3, $$4, $$7, $$8);
        this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
        this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
        $$1.b();
    }

    void a(eij $$0, float $$1, dcb $$2) {
        $$0.a(0.5f, 0.75f * this.b(), 0.5f);
        $$0.a(a.d.rotationDegrees($$1));
        if (!($$2.b() instanceof cxi)) {
            $$0.a(0.0f, -0.3125f, -0.4375f);
        }
    }

    void a(eij $$0, fjx $$1, int $$2, int $$3, ddo $$4, fcb $$5) {
        $$0.a();
        float $$6 = this.b();
        $$0.b($$6, -$$6, -$$6);
        fwu $$7 = this.a($$4);
        ein $$8 = $$7.a($$1, $$5::a);
        this.a($$0, $$2, $$3, $$5, $$8);
        $$0.b();
    }

    void a(eij $$0, int $$1, int $$2, fcb $$3, ein $$4) {
        a $$5 = (a)$$3;
        $$5.a.a($$0, $$4, $$1, $$2);
    }

    fwu a(ddo $$0) {
        return fkj.a($$0);
    }

    void a(gu $$0, daw $$12, eij $$2, fjx $$3, int $$4, int $$5, int $$6, boolean $$7) {
        int $$16;
        boolean $$15;
        int $$14;
        $$2.a();
        this.a($$2, $$7, this.d());
        int $$8 = fmi.a($$12);
        int $$9 = 4 * $$5 / 2;
        aom[] $$10 = $$12.a(enn.N().aP(), (sw $$1) -> {
            List<aom> $$2 = this.g.c((ta)$$1, $$6);
            return $$2.isEmpty() ? aom.a : $$2.get(0);
        });
        if ($$12.a()) {
            int $$11 = $$12.b().g();
            boolean $$122 = fmi.a($$0, $$11);
            int $$13 = 0xF000F0;
        } else {
            $$14 = $$8;
            $$15 = false;
            $$16 = $$4;
        }
        for (int $$17 = 0; $$17 < 4; ++$$17) {
            aom $$18 = $$10[$$17];
            float $$19 = -this.g.a($$18) / 2;
            if ($$15) {
                this.g.a($$18, $$19, $$17 * $$5 - $$9, $$14, $$8, $$2.c().a(), $$3, $$16);
                continue;
            }
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$14, false, $$2.c().a(), $$3, eov.a.c, 0, $$16);
        }
        $$2.b();
    }

    private void a(eij $$0, boolean $$1, eei $$2) {
        if (!$$1) {
            $$0.a(a.d.rotationDegrees(180.0f));
        }
        float $$3 = 0.015625f * this.c();
        $$0.a($$2.c, $$2.d, $$2.e);
        $$0.b($$3, -$$3, $$3);
    }

    eei d() {
        return e;
    }

    static boolean a(gu $$0, int $$1) {
        if ($$1 == cen.p.g()) {
            return true;
        }
        enn $$2 = enn.N();
        fiy $$3 = $$2.t;
        if ($$3 != null && $$2.m.au().a() && $$3.gl()) {
            return true;
        }
        bfj $$4 = $$2.al();
        return $$4 != null && $$4.e(eei.b($$0)) < (double)c;
    }

    static int a(daw $$0) {
        int $$1 = $$0.b().g();
        if ($$1 == cen.p.g() && $$0.a()) {
            return -988212;
        }
        double $$2 = 0.4;
        int $$3 = (int)((double)aok.b.b($$1) * 0.4);
        int $$4 = (int)((double)aok.b.c($$1) * 0.4);
        int $$5 = (int)((double)aok.b.d($$1) * 0.4);
        return aok.b.a(0, $$3, $$4, $$5);
    }

    public static a a(fea $$0, ddo $$1) {
        return new a($$0.a(fed.a($$1)));
    }

    public static fek f() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("sign", fej.c().a(0, 0).a(-12.0f, -14.0f, -1.0f, 24.0f, 12.0f, 2.0f), feg.a);
        $$1.a(a, fej.c().a(0, 14).a(-1.0f, -2.0f, -1.0f, 2.0f, 14.0f, 2.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    public static final class a
    extends fcb {
        public final fee a;
        public final fee b;

        public a(fee $$0) {
            super(fkf::d);
            this.a = $$0;
            this.b = $$0.b(fmi.a);
        }

        @Override
        public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
            this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
    }
}

