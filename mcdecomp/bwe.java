/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bwe
extends bfq
implements bvu {
    public static final float b = 7.448451f;
    public static final int c = apa.f(24.166098f);
    private static final aby<Integer> d = acb.a(bwe.class, aca.b);
    eei e = eei.b;
    gu bS = gu.b;
    a bT = a.a;

    public bwe(bfn<? extends bwe> $$0, cmm $$1) {
        super((bfn<? extends bfq>)$$0, $$1);
        this.bJ = 5;
        this.bL = new g(this);
        this.bK = new f(this);
    }

    @Override
    public boolean aP() {
        return (this.r() + this.ag) % c == 0;
    }

    @Override
    protected blt D() {
        return new d(this);
    }

    @Override
    protected void x() {
        this.bO.a(1, new c());
        this.bO.a(2, new i());
        this.bO.a(3, new e());
        this.bP.a(1, new b());
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(d, 0);
    }

    public void b(int $$0) {
        this.am.b(d, apa.a($$0, 0, 64));
    }

    private void w() {
        this.d_();
        this.a(bhg.f).a(6 + this.q());
    }

    public int q() {
        return this.am.b(d);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return $$1.b * 0.35f;
    }

    @Override
    public void a(aby<?> $$0) {
        if (d.equals($$0)) {
            this.w();
        }
        super.a($$0);
    }

    public int r() {
        return this.af() * 3;
    }

    @Override
    protected boolean U() {
        return true;
    }

    @Override
    public void l() {
        super.l();
        if (this.dI().B) {
            float $$0 = apa.b((float)(this.r() + this.ag) * 7.448451f * ((float)Math.PI / 180) + (float)Math.PI);
            float $$1 = apa.b((float)(this.r() + this.ag + 1) * 7.448451f * ((float)Math.PI / 180) + (float)Math.PI);
            if ($$0 > 0.0f && $$1 <= 0.0f) {
                this.dI().a(this.dn(), this.dp(), this.dt(), amh.rL, this.cY(), 0.95f + this.af.i() * 0.05f, 0.95f + this.af.i() * 0.05f, false);
            }
            int $$2 = this.q();
            float $$3 = apa.b(this.dy() * ((float)Math.PI / 180)) * (1.3f + 0.21f * (float)$$2);
            float $$4 = apa.a(this.dy() * ((float)Math.PI / 180)) * (1.3f + 0.21f * (float)$$2);
            float $$5 = (0.3f + $$0 * 0.45f) * ((float)$$2 * 0.2f + 1.0f);
            this.dI().a(iv.U, this.dn() + (double)$$3, this.dp() + (double)$$5, this.dt() + (double)$$4, 0.0, 0.0, 0.0);
            this.dI().a(iv.U, this.dn() - (double)$$3, this.dp() + (double)$$5, this.dt() - (double)$$4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void b_() {
        if (this.bs() && this.fT()) {
            this.g(8);
        }
        super.b_();
    }

    @Override
    protected void W() {
        super.W();
    }

    @Override
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.bS = this.di().b(5);
        this.b(0);
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        if ($$0.e("AX")) {
            this.bS = new gu($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
        }
        this.b($$0.h("Size"));
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("AX", this.bS.u());
        $$0.a("AY", this.bS.v());
        $$0.a("AZ", this.bS.w());
        $$0.a("Size", this.q());
    }

    @Override
    public boolean a(double $$0) {
        return true;
    }

    @Override
    public ami cY() {
        return ami.f;
    }

    @Override
    protected amg s() {
        return amh.rI;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.rM;
    }

    @Override
    protected amg g_() {
        return amh.rK;
    }

    @Override
    public bge eN() {
        return bge.b;
    }

    @Override
    protected float eR() {
        return 1.0f;
    }

    @Override
    public boolean a(bfn<?> $$0) {
        return true;
    }

    @Override
    public bfk a(bgl $$0) {
        int $$1 = this.q();
        bfk $$2 = super.a($$0);
        float $$3 = ($$2.a + 0.2f * (float)$$1) / $$2.a;
        return $$2.a($$3);
    }

    @Override
    public double bx() {
        return this.cF();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = bwe$a.a();
        }
    }

    class g
    extends bly {
        private float m;

        public g(bgb $$0) {
            super($$0);
            this.m = 0.1f;
        }

        @Override
        public void a() {
            if (bwe.this.O) {
                bwe.this.a_(bwe.this.dy() + 180.0f);
                this.m = 0.1f;
            }
            double $$0 = bwe.this.e.c - bwe.this.dn();
            double $$1 = bwe.this.e.d - bwe.this.dp();
            double $$2 = bwe.this.e.e - bwe.this.dt();
            double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            if (Math.abs($$3) > (double)1.0E-5f) {
                double $$4 = 1.0 - Math.abs($$1 * (double)0.7f) / $$3;
                $$3 = Math.sqrt(($$0 *= $$4) * $$0 + ($$2 *= $$4) * $$2);
                double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
                float $$6 = bwe.this.dy();
                float $$7 = (float)apa.d($$2, $$0);
                float $$8 = apa.g(bwe.this.dy() + 90.0f);
                float $$9 = apa.g($$7 * 57.295776f);
                bwe.this.a_(apa.e($$8, $$9, 4.0f) - 90.0f);
                bwe.this.aV = bwe.this.dy();
                this.m = apa.d($$6, bwe.this.dy()) < 3.0f ? apa.d(this.m, 1.8f, 0.005f * (1.8f / this.m)) : apa.d(this.m, 0.2f, 0.025f);
                float $$10 = (float)(-(apa.d(-$$1, $$3) * 57.2957763671875));
                bwe.this.b_($$10);
                float $$11 = bwe.this.dy() + 90.0f;
                double $$12 = (double)(this.m * apa.b($$11 * ((float)Math.PI / 180))) * Math.abs($$0 / $$5);
                double $$13 = (double)(this.m * apa.a($$11 * ((float)Math.PI / 180))) * Math.abs($$2 / $$5);
                double $$14 = (double)(this.m * apa.a($$10 * ((float)Math.PI / 180))) * Math.abs($$1 / $$5);
                eei $$15 = bwe.this.dl();
                bwe.this.f($$15.e(new eei($$12, $$14, $$13).d($$15).a(0.2)));
            }
        }
    }

    class f
    extends blx {
        public f(bgb $$0) {
            super($$0);
        }

        @Override
        public void a() {
        }
    }

    class d
    extends blt {
        public d(bgb $$0) {
            super($$0);
        }

        @Override
        public void a() {
            bwe.this.aX = bwe.this.aV;
            bwe.this.aV = bwe.this.dy();
        }
    }

    class c
    extends bmv {
        private int b;

        c() {
        }

        @Override
        public boolean a() {
            bfz $$0 = bwe.this.j();
            if ($$0 != null) {
                return bwe.this.a($$0, bqm.a);
            }
            return false;
        }

        @Override
        public void c() {
            this.b = this.a(10);
            bwe.this.bT = bwe$a.a;
            this.h();
        }

        @Override
        public void d() {
            bwe.this.bS = bwe.this.dI().a(dhk.a.e, bwe.this.bS).b(10 + bwe.this.af.a(20));
        }

        @Override
        public void e() {
            if (bwe.this.bT == bwe$a.a) {
                --this.b;
                if (this.b <= 0) {
                    bwe.this.bT = bwe$a.b;
                    this.h();
                    this.b = this.a((8 + bwe.this.af.a(4)) * 20);
                    bwe.this.a(amh.rN, 10.0f, 0.95f + bwe.this.af.i() * 0.1f);
                }
            }
        }

        private void h() {
            bwe.this.bS = bwe.this.j().di().b(20 + bwe.this.af.a(20));
            if (bwe.this.bS.v() < bwe.this.dI().t_()) {
                bwe.this.bS = new gu(bwe.this.bS.u(), bwe.this.dI().t_() + 1, bwe.this.bS.w());
            }
        }
    }

    class i
    extends h {
        private static final int c = 20;
        private boolean d;
        private int e;

        i() {
        }

        @Override
        public boolean a() {
            return bwe.this.j() != null && bwe.this.bT == bwe$a.b;
        }

        @Override
        public boolean b() {
            bfz $$0 = bwe.this.j();
            if ($$0 == null) {
                return false;
            }
            if (!$$0.bs()) {
                return false;
            }
            if ($$0 instanceof byo) {
                byo $$1 = (byo)$$0;
                if ($$0.G_() || $$1.f()) {
                    return false;
                }
            }
            if (!this.a()) {
                return false;
            }
            if (bwe.this.ag > this.e) {
                this.e = bwe.this.ag + 20;
                List<bfj> $$2 = bwe.this.dI().a(bro.class, bwe.this.cE().g(16.0), bfm.a);
                for (bro bro2 : $$2) {
                    bro2.gj();
                }
                this.d = !$$2.isEmpty();
            }
            return !this.d;
        }

        @Override
        public void c() {
        }

        @Override
        public void d() {
            bwe.this.h((bfz)null);
            bwe.this.bT = bwe$a.a;
        }

        @Override
        public void e() {
            bfz $$0 = bwe.this.j();
            if ($$0 == null) {
                return;
            }
            bwe.this.e = new eei($$0.dn(), $$0.e(0.5), $$0.dt());
            if (bwe.this.cE().g(0.2f).c($$0.cE())) {
                bwe.this.z($$0);
                bwe.this.bT = bwe$a.a;
                if (!bwe.this.aQ()) {
                    bwe.this.dI().c(1039, bwe.this.di(), 0);
                }
            } else if (bwe.this.O || bwe.this.aL > 0) {
                bwe.this.bT = bwe$a.a;
            }
        }
    }

    class e
    extends h {
        private float c;
        private float d;
        private float e;
        private float f;

        e() {
        }

        @Override
        public boolean a() {
            return bwe.this.j() == null || bwe.this.bT == bwe$a.a;
        }

        @Override
        public void c() {
            this.d = 5.0f + bwe.this.af.i() * 10.0f;
            this.e = -4.0f + bwe.this.af.i() * 9.0f;
            this.f = bwe.this.af.h() ? 1.0f : -1.0f;
            this.i();
        }

        @Override
        public void e() {
            if (bwe.this.af.a(this.a(350)) == 0) {
                this.e = -4.0f + bwe.this.af.i() * 9.0f;
            }
            if (bwe.this.af.a(this.a(250)) == 0) {
                this.d += 1.0f;
                if (this.d > 15.0f) {
                    this.d = 5.0f;
                    this.f = -this.f;
                }
            }
            if (bwe.this.af.a(this.a(450)) == 0) {
                this.c = bwe.this.af.i() * 2.0f * (float)Math.PI;
                this.i();
            }
            if (this.h()) {
                this.i();
            }
            if (bwe.this.e.d < bwe.this.dp() && !bwe.this.dI().t(bwe.this.di().c(1))) {
                this.e = Math.max(1.0f, this.e);
                this.i();
            }
            if (bwe.this.e.d > bwe.this.dp() && !bwe.this.dI().t(bwe.this.di().b(1))) {
                this.e = Math.min(-1.0f, this.e);
                this.i();
            }
        }

        private void i() {
            if (gu.b.equals(bwe.this.bS)) {
                bwe.this.bS = bwe.this.di();
            }
            this.c += this.f * 15.0f * ((float)Math.PI / 180);
            bwe.this.e = eei.a(bwe.this.bS).b(this.d * apa.b(this.c), -4.0f + this.e, this.d * apa.a(this.c));
        }
    }

    class b
    extends bmv {
        private final bqm b = bqm.a().a(64.0);
        private int c = bwe$b.b(20);

        b() {
        }

        @Override
        public boolean a() {
            if (this.c > 0) {
                --this.c;
                return false;
            }
            this.c = bwe$b.b(60);
            List<byo> $$0 = bwe.this.dI().a(this.b, bwe.this, bwe.this.cE().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
                $$0.sort(Comparator.comparing(bfj::dp).reversed());
                for (byo $$1 : $$0) {
                    if (!bwe.this.a((bfz)$$1, bqm.a)) continue;
                    bwe.this.h($$1);
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean b() {
            bfz $$0 = bwe.this.j();
            if ($$0 != null) {
                return bwe.this.a($$0, bqm.a);
            }
            return false;
        }
    }

    abstract class h
    extends bmv {
        public h() {
            this.a(EnumSet.of(bmv.a.a));
        }

        protected boolean h() {
            return bwe.this.e.c(bwe.this.dn(), bwe.this.dp(), bwe.this.dt()) < 4.0;
        }
    }
}

