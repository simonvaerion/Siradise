/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import java.util.Arrays;
import java.util.List;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class emz {
    private boolean b;
    private cls c;
    private bfj d;
    private eei e = eei.b;
    private final gu.a f = new gu.a();
    private final Vector3f g = new Vector3f(0.0f, 0.0f, 1.0f);
    private final Vector3f h = new Vector3f(0.0f, 1.0f, 0.0f);
    private final Vector3f i = new Vector3f(1.0f, 0.0f, 0.0f);
    private float j;
    private float k;
    private final Quaternionf l = new Quaternionf(0.0f, 0.0f, 0.0f, 1.0f);
    private boolean m;
    private float n;
    private float o;
    public static final float a = 0.083333336f;

    public void a(cls $$0, bfj $$1, boolean $$2, boolean $$3, float $$4) {
        this.b = true;
        this.c = $$0;
        this.d = $$1;
        this.m = $$2;
        this.a($$1.h($$4), $$1.g($$4));
        this.b(apa.d((double)$$4, $$1.J, $$1.dn()), apa.d((double)$$4, $$1.K, $$1.dp()) + (double)apa.i($$4, this.o, this.n), apa.d((double)$$4, $$1.L, $$1.dt()));
        if ($$2) {
            if ($$3) {
                this.a(this.k + 180.0f, -this.j);
            }
            this.a(-this.a(4.0), 0.0, 0.0);
        } else if ($$1 instanceof bfz && ((bfz)$$1).fy()) {
            ha $$5 = ((bfz)$$1).fA();
            this.a($$5 != null ? $$5.p() - 180.0f : 0.0f, 0.0f);
            this.a(0.0, 0.3, 0.0);
        }
    }

    public void a() {
        if (this.d != null) {
            this.o = this.n;
            this.n += (this.d.cF() - this.n) * 0.5f;
        }
    }

    private double a(double $$0) {
        for (int $$1 = 0; $$1 < 8; ++$$1) {
            double $$8;
            eei $$6;
            eee $$7;
            float $$2 = ($$1 & 1) * 2 - 1;
            float $$3 = ($$1 >> 1 & 1) * 2 - 1;
            float $$4 = ($$1 >> 2 & 1) * 2 - 1;
            eei $$5 = this.e.b($$2 *= 0.1f, $$3 *= 0.1f, $$4 *= 0.1f);
            if (((eeg)($$7 = this.c.a(new clv($$5, $$6 = new eei(this.e.c - (double)this.g.x() * $$0 + (double)$$2, this.e.d - (double)this.g.y() * $$0 + (double)$$3, this.e.e - (double)this.g.z() * $$0 + (double)$$4), clv.a.c, clv.b.a, this.d)))).c() == eeg.a.a || !(($$8 = $$7.e().f(this.e)) < $$0)) continue;
            $$0 = $$8;
        }
        return $$0;
    }

    protected void a(double $$0, double $$1, double $$2) {
        double $$3 = (double)this.g.x() * $$0 + (double)this.h.x() * $$1 + (double)this.i.x() * $$2;
        double $$4 = (double)this.g.y() * $$0 + (double)this.h.y() * $$1 + (double)this.i.y() * $$2;
        double $$5 = (double)this.g.z() * $$0 + (double)this.h.z() * $$1 + (double)this.i.z() * $$2;
        this.a(new eei(this.e.c + $$3, this.e.d + $$4, this.e.e + $$5));
    }

    protected void a(float $$0, float $$1) {
        this.j = $$1;
        this.k = $$0;
        this.l.rotationYXZ(-$$0 * ((float)Math.PI / 180), $$1 * ((float)Math.PI / 180), 0.0f);
        this.g.set(0.0f, 0.0f, 1.0f).rotate((Quaternionfc)this.l);
        this.h.set(0.0f, 1.0f, 0.0f).rotate((Quaternionfc)this.l);
        this.i.set(1.0f, 0.0f, 0.0f).rotate((Quaternionfc)this.l);
    }

    protected void b(double $$0, double $$1, double $$2) {
        this.a(new eei($$0, $$1, $$2));
    }

    protected void a(eei $$0) {
        this.e = $$0;
        this.f.b($$0.c, $$0.d, $$0.e);
    }

    public eei b() {
        return this.e;
    }

    public gu c() {
        return this.f;
    }

    public float d() {
        return this.j;
    }

    public float e() {
        return this.k;
    }

    public Quaternionf f() {
        return this.l;
    }

    public bfj g() {
        return this.d;
    }

    public boolean h() {
        return this.b;
    }

    public boolean i() {
        return this.m;
    }

    public a j() {
        enn $$0 = enn.N();
        double $$1 = (double)$$0.aM().k() / (double)$$0.aM().l();
        double $$2 = Math.tan((double)((float)$$0.m.ac().c().intValue() * ((float)Math.PI / 180)) / 2.0) * (double)0.05f;
        double $$3 = $$2 * $$1;
        eei $$4 = new eei(this.g).a((double)0.05f);
        eei $$5 = new eei(this.i).a($$3);
        eei $$6 = new eei(this.h).a($$2);
        return new a($$4, $$5, $$6);
    }

    public dxg k() {
        if (!this.b) {
            return dxg.d;
        }
        dxe $$0 = this.c.b_(this.f);
        if ($$0.a(anb.a) && this.e.d < (double)((float)this.f.v() + $$0.a(this.c, (gu)this.f))) {
            return dxg.b;
        }
        a $$1 = this.j();
        List<eei> $$2 = Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d());
        for (eei $$3 : $$2) {
            eei $$4 = this.e.e($$3);
            gu $$5 = gu.a($$4);
            dxe $$6 = this.c.b_($$5);
            if ($$6.a(anb.b)) {
                if (!($$4.d <= (double)($$6.a(this.c, $$5) + (float)$$5.v()))) continue;
                return dxg.a;
            }
            dcb $$7 = this.c.a_($$5);
            if (!$$7.a(cpo.qC)) continue;
            return dxg.c;
        }
        return dxg.d;
    }

    public final Vector3f l() {
        return this.g;
    }

    public final Vector3f m() {
        return this.h;
    }

    public final Vector3f n() {
        return this.i;
    }

    public void o() {
        this.c = null;
        this.d = null;
        this.b = false;
    }

    public static class a {
        final eei a;
        private final eei b;
        private final eei c;

        a(eei $$0, eei $$1, eei $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public eei a() {
            return this.a.e(this.c).e(this.b);
        }

        public eei b() {
            return this.a.e(this.c).d(this.b);
        }

        public eei c() {
            return this.a.d(this.c).e(this.b);
        }

        public eei d() {
            return this.a.d(this.c).d(this.b);
        }

        public eei a(float $$0, float $$1) {
            return this.a.e(this.c.a((double)$$1)).d(this.b.a((double)$$0));
        }
    }
}

