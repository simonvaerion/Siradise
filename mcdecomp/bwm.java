/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bwm
extends bvk {
    private static final aby<Byte> e = acb.a(bwm.class, aca.a);
    protected int b;
    private a bT = a.a;

    protected bwm(bfn<? extends bwm> $$0, cmm $$1) {
        super((bfn<? extends bvk>)$$0, $$1);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(e, (byte)0);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.b = $$0.h("SpellTicks");
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("SpellTicks", this.b);
    }

    @Override
    public bvk.a q() {
        if (this.gi()) {
            return bvk.a.c;
        }
        if (this.gp()) {
            return bvk.a.g;
        }
        return bvk.a.a;
    }

    public boolean gi() {
        if (this.dI().B) {
            return this.am.b(e) > 0;
        }
        return this.b > 0;
    }

    public void a(a $$0) {
        this.bT = $$0;
        this.am.b(e, (byte)$$0.h);
    }

    protected a gj() {
        if (!this.dI().B) {
            return this.bT;
        }
        return a.a(this.am.b(e).byteValue());
    }

    @Override
    protected void W() {
        super.W();
        if (this.b > 0) {
            --this.b;
        }
    }

    @Override
    public void l() {
        super.l();
        if (this.dI().B && this.gi()) {
            a $$0 = this.gj();
            double $$1 = $$0.i[0];
            double $$2 = $$0.i[1];
            double $$3 = $$0.i[2];
            float $$4 = this.aV * ((float)Math.PI / 180) + apa.b((float)this.ag * 0.6662f) * 0.25f;
            float $$5 = apa.b($$4);
            float $$6 = apa.a($$4);
            this.dI().a(iv.v, this.dn() + (double)$$5 * 0.6, this.dp() + 1.8, this.dt() + (double)$$6 * 0.6, $$1, $$2, $$3);
            this.dI().a(iv.v, this.dn() - (double)$$5 * 0.6, this.dp() + 1.8, this.dt() - (double)$$6 * 0.6, $$1, $$2, $$3);
        }
    }

    protected int gk() {
        return this.b;
    }

    protected abstract amg fY();

    protected static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, 0.0, 0.0, 0.0);
        public static final /* enum */ a b = new a(1, 0.7, 0.7, 0.8);
        public static final /* enum */ a c = new a(2, 0.4, 0.3, 0.35);
        public static final /* enum */ a d = new a(3, 0.7, 0.5, 0.2);
        public static final /* enum */ a e = new a(4, 0.3, 0.3, 0.8);
        public static final /* enum */ a f = new a(5, 0.1, 0.1, 0.2);
        private static final IntFunction<a> g;
        final int h;
        final double[] i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, double $$1, double $$2, double $$3) {
            this.h = $$0;
            this.i = new double[]{$$1, $$2, $$3};
        }

        public static a a(int $$0) {
            return g.apply($$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            j = bwm$a.a();
            g = anu.a($$0 -> $$0.h, bwm$a.values(), anu.a.a);
        }
    }

    protected abstract class c
    extends bmv {
        protected int b;
        protected int c;

        protected c() {
        }

        @Override
        public boolean a() {
            bfz $$0 = bwm.this.j();
            if ($$0 == null || !$$0.bs()) {
                return false;
            }
            if (bwm.this.gi()) {
                return false;
            }
            return bwm.this.ag >= this.c;
        }

        @Override
        public boolean b() {
            bfz $$0 = bwm.this.j();
            return $$0 != null && $$0.bs() && this.b > 0;
        }

        @Override
        public void c() {
            this.b = this.a(this.n());
            bwm.this.b = this.h();
            this.c = bwm.this.ag + this.i();
            amg $$0 = this.l();
            if ($$0 != null) {
                bwm.this.a($$0, 1.0f, 1.0f);
            }
            bwm.this.a(this.m());
        }

        @Override
        public void e() {
            --this.b;
            if (this.b == 0) {
                this.k();
                bwm.this.a(bwm.this.fY(), 1.0f, 1.0f);
            }
        }

        protected abstract void k();

        protected int n() {
            return 20;
        }

        protected abstract int h();

        protected abstract int i();

        @Nullable
        protected abstract amg l();

        protected abstract a m();
    }

    protected class b
    extends bmv {
        public b() {
            this.a(EnumSet.of(bmv.a.a, bmv.a.b));
        }

        @Override
        public boolean a() {
            return bwm.this.gk() > 0;
        }

        @Override
        public void c() {
            super.c();
            bwm.this.bN.n();
        }

        @Override
        public void d() {
            super.d();
            bwm.this.a(a.a);
        }

        @Override
        public void e() {
            if (bwm.this.j() != null) {
                bwm.this.E().a(bwm.this.j(), (float)bwm.this.fC(), (float)bwm.this.X());
            }
        }
    }
}

