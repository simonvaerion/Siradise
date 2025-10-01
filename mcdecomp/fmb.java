/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fmb
implements flu<czz> {
    public static final fwu a = new fwu(fuu.e, new acq("entity/conduit/base"));
    public static final fwu b = new fwu(fuu.e, new acq("entity/conduit/cage"));
    public static final fwu c = new fwu(fuu.e, new acq("entity/conduit/wind"));
    public static final fwu d = new fwu(fuu.e, new acq("entity/conduit/wind_vertical"));
    public static final fwu e = new fwu(fuu.e, new acq("entity/conduit/open_eye"));
    public static final fwu f = new fwu(fuu.e, new acq("entity/conduit/closed_eye"));
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final flt k;

    public fmb(flv.a $$0) {
        this.k = $$0.a();
        this.g = $$0.a(fed.x);
        this.h = $$0.a(fed.z);
        this.i = $$0.a(fed.y);
        this.j = $$0.a(fed.w);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("eye", fej.c().a(0, 0).a(-4.0f, -4.0f, 0.0f, 8.0f, 8.0f, 0.0f, new fei(0.01f)), feg.a);
        return fek.a($$0, 16, 16);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("wind", fej.c().a(0, 0).a(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    public static fek d() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("shell", fej.c().a(0, 0).a(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f), feg.a);
        return fek.a($$0, 32, 16);
    }

    public static fek e() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("shell", fej.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), feg.a);
        return fek.a($$0, 32, 16);
    }

    @Override
    public void a(czz $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        float $$6 = (float)$$0.a + $$1;
        if (!$$0.d()) {
            float $$7 = $$0.a(0.0f);
            ein $$8 = a.a($$3, fkf::b);
            $$2.a();
            $$2.a(0.5f, 0.5f, 0.5f);
            $$2.a(new Quaternionf().rotationY($$7 * ((float)Math.PI / 180)));
            this.i.a($$2, $$8, $$4, $$5);
            $$2.b();
            return;
        }
        float $$9 = $$0.a($$1) * 57.295776f;
        float $$10 = apa.a($$6 * 0.1f) / 2.0f + 0.5f;
        $$10 = $$10 * $$10 + $$10;
        $$2.a();
        $$2.a(0.5f, 0.3f + $$10 * 0.2f, 0.5f);
        Vector3f $$11 = new Vector3f(0.5f, 1.0f, 0.5f).normalize();
        $$2.a(new Quaternionf().rotationAxis($$9 * ((float)Math.PI / 180), (Vector3fc)$$11));
        this.j.a($$2, b.a($$3, fkf::d), $$4, $$5);
        $$2.b();
        int $$12 = $$0.a / 66 % 3;
        $$2.a();
        $$2.a(0.5f, 0.5f, 0.5f);
        if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX(1.5707964f));
        } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ(1.5707964f));
        }
        ein $$13 = ($$12 == 1 ? d : c).a($$3, fkf::d);
        this.h.a($$2, $$13, $$4, $$5);
        $$2.b();
        $$2.a();
        $$2.a(0.5f, 0.5f, 0.5f);
        $$2.b(0.875f, 0.875f, 0.875f);
        $$2.a(new Quaternionf().rotationXYZ((float)Math.PI, 0.0f, (float)Math.PI));
        this.h.a($$2, $$13, $$4, $$5);
        $$2.b();
        emz $$14 = this.k.b;
        $$2.a();
        $$2.a(0.5f, 0.3f + $$10 * 0.2f, 0.5f);
        $$2.b(0.5f, 0.5f, 0.5f);
        float $$15 = -$$14.e();
        $$2.a(new Quaternionf().rotationYXZ($$15 * ((float)Math.PI / 180), $$14.d() * ((float)Math.PI / 180), (float)Math.PI));
        float $$16 = 1.3333334f;
        $$2.b(1.3333334f, 1.3333334f, 1.3333334f);
        this.g.a($$2, ($$0.f() ? e : f).a($$3, fkf::d), $$4, $$5);
        $$2.b();
    }
}

