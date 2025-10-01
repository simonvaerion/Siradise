/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 */
import org.joml.Quaternionf;

public class fos
extends fox<bua> {
    private static final acq a = new acq("textures/entity/end_crystal/end_crystal.png");
    private static final fkf f = fkf.d(a);
    private static final float g = (float)Math.sin(0.7853981633974483);
    private static final String h = "glass";
    private static final String i = "base";
    private final fee j;
    private final fee k;
    private final fee l;

    public fos(foy.a $$0) {
        super($$0);
        this.d = 0.5f;
        fee $$1 = $$0.a(fed.U);
        this.k = $$1.b(h);
        this.j = $$1.b("cube");
        this.l = $$1.b(i);
    }

    public static fek a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(h, fej.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), feg.a);
        $$1.a("cube", fej.c().a(32, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), feg.a);
        $$1.a(i, fej.c().a(0, 16).a(-6.0f, 0.0f, -6.0f, 12.0f, 4.0f, 12.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(bua $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        float $$6 = fos.a($$0, $$2);
        float $$7 = ((float)$$0.b + $$2) * 3.0f;
        ein $$8 = $$4.getBuffer(f);
        $$3.a();
        $$3.b(2.0f, 2.0f, 2.0f);
        $$3.a(0.0f, -0.5f, 0.0f);
        int $$9 = fum.d;
        if ($$0.k()) {
            this.l.a($$3, $$8, $$5, $$9);
        }
        $$3.a(a.d.rotationDegrees($$7));
        $$3.a(0.0f, 1.5f + $$6 / 2.0f, 0.0f);
        $$3.a(new Quaternionf().setAngleAxis(1.0471976f, g, 0.0f, g));
        this.k.a($$3, $$8, $$5, $$9);
        float $$10 = 0.875f;
        $$3.b(0.875f, 0.875f, 0.875f);
        $$3.a(new Quaternionf().setAngleAxis(1.0471976f, g, 0.0f, g));
        $$3.a(a.d.rotationDegrees($$7));
        this.k.a($$3, $$8, $$5, $$9);
        $$3.b(0.875f, 0.875f, 0.875f);
        $$3.a(new Quaternionf().setAngleAxis(1.0471976f, g, 0.0f, g));
        $$3.a(a.d.rotationDegrees($$7));
        this.j.a($$3, $$8, $$5, $$9);
        $$3.b();
        $$3.b();
        gu $$11 = $$0.j();
        if ($$11 != null) {
            float $$12 = (float)$$11.u() + 0.5f;
            float $$13 = (float)$$11.v() + 0.5f;
            float $$14 = (float)$$11.w() + 0.5f;
            float $$15 = (float)((double)$$12 - $$0.dn());
            float $$16 = (float)((double)$$13 - $$0.dp());
            float $$17 = (float)((double)$$14 - $$0.dt());
            $$3.a($$15, $$16, $$17);
            fot.a(-$$15, -$$16 + $$6, -$$17, $$2, $$0.b, $$3, $$4, $$5);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public static float a(bua $$0, float $$1) {
        float $$2 = (float)$$0.b + $$1;
        float $$3 = apa.a($$2 * 0.2f) / 2.0f + 0.5f;
        $$3 = ($$3 * $$3 + $$3) * 0.4f;
        return $$3 - 1.4f;
    }

    @Override
    public acq a(bua $$0) {
        return a;
    }

    @Override
    public boolean a(bua $$0, fmw $$1, double $$2, double $$3, double $$4) {
        return super.a($$0, $$1, $$2, $$3, $$4) || $$0.j() != null;
    }
}

