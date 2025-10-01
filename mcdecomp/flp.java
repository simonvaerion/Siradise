/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class flp
implements flu<czd> {
    private static final int b = 20;
    private static final int c = 40;
    private static final int d = 16;
    public static final String a = "flag";
    private static final String e = "pole";
    private static final String f = "bar";
    private final fee g;
    private final fee h;
    private final fee i;

    public flp(flv.a $$0) {
        fee $$1 = $$0.a(fed.f);
        this.g = $$1.b(a);
        this.h = $$1.b(e);
        this.i = $$1.b(f);
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 0).a(-10.0f, 0.0f, -2.0f, 20.0f, 40.0f, 1.0f), feg.a);
        $$1.a(e, fej.c().a(44, 0).a(-1.0f, -30.0f, -1.0f, 2.0f, 42.0f, 2.0f), feg.a);
        $$1.a(f, fej.c().a(0, 42).a(-10.0f, -32.0f, -1.0f, 20.0f, 2.0f, 2.0f), feg.a);
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(czd $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        long $$10;
        List<Pair<he<cze>, cen>> $$6 = $$0.c();
        float $$7 = 0.6666667f;
        boolean $$8 = $$0.k() == null;
        $$2.a();
        if ($$8) {
            long $$9 = 0L;
            $$2.a(0.5f, 0.5f, 0.5f);
            this.h.k = true;
        } else {
            $$10 = $$0.k().V();
            dcb $$11 = $$0.q();
            if ($$11.b() instanceof cot) {
                $$2.a(0.5f, 0.5f, 0.5f);
                float $$12 = -ddh.b($$11.c(cot.a));
                $$2.a(a.d.rotationDegrees($$12));
                this.h.k = true;
            } else {
                $$2.a(0.5f, -0.16666667f, 0.5f);
                float $$13 = -$$11.c(cyi.a).p();
                $$2.a(a.d.rotationDegrees($$13));
                $$2.a(0.0f, -0.3125f, -0.4375f);
                this.h.k = false;
            }
        }
        $$2.a();
        $$2.b(0.6666667f, -0.6666667f, -0.6666667f);
        ein $$14 = fww.f.a($$3, fkf::b);
        this.h.a($$2, $$14, $$4, $$5);
        this.i.a($$2, $$14, $$4, $$5);
        gu $$15 = $$0.p();
        float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$10, 100L) + $$1) / 100.0f;
        this.g.e = (-0.0125f + 0.01f * apa.b((float)Math.PI * 2 * $$16)) * (float)Math.PI;
        this.g.c = -32.0f;
        flp.a($$2, $$3, $$4, $$5, this.g, fww.f, true, $$6);
        $$2.b();
        $$2.b();
    }

    public static void a(eij $$0, fjx $$1, int $$2, int $$3, fee $$4, fwu $$5, boolean $$6, List<Pair<he<cze>, cen>> $$7) {
        flp.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
    }

    public static void a(eij $$0, fjx $$12, int $$2, int $$3, fee $$4, fwu $$5, boolean $$62, List<Pair<he<cze>, cen>> $$7, boolean $$8) {
        $$4.a($$0, $$5.a($$12, fkf::b, $$8), $$2, $$3);
        for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); ++$$9) {
            Pair<he<cze>, cen> $$10 = $$7.get($$9);
            float[] $$11 = ((cen)$$10.getSecond()).d();
            ((he)$$10.getFirst()).e().map($$1 -> $$62 ? fkj.a($$1) : fkj.b($$1)).ifPresent($$6 -> $$4.a($$0, $$6.a($$12, fkf::l), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0f));
        }
    }
}

