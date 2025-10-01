/*
 * Decompiled with CFR 0.152.
 */
public class czx
extends czn {
    private boolean a;
    private boolean b;
    private boolean c;
    private final cln d = new cln(){

        @Override
        public void a(String $$0) {
            super.a($$0);
            czx.this.e();
        }

        @Override
        public aif e() {
            return (aif)czx.this.o;
        }

        @Override
        public void f() {
            dcb $$0 = czx.this.o.a_(czx.this.p);
            this.e().a(czx.this.p, $$0, $$0, 3);
        }

        @Override
        public eei g() {
            return eei.b(czx.this.p);
        }

        @Override
        public ds i() {
            ha $$0 = czx.this.q().c(cqu.a);
            return new ds(this, eei.b(czx.this.p), new eeh(0.0f, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
        }

        @Override
        public boolean j() {
            return !czx.this.r();
        }
    };

    public czx(gu $$0, dcb $$1) {
        super(czp.w, $$0, $$1);
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        this.d.a($$0);
        $$0.a("powered", this.d());
        $$0.a("conditionMet", this.i());
        $$0.a("auto", this.f());
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.d.b($$0);
        this.a = $$0.q("powered");
        this.c = $$0.q("conditionMet");
        this.b($$0.q("auto"));
    }

    @Override
    public boolean t() {
        return true;
    }

    public cln c() {
        return this.d;
    }

    public void a(boolean $$0) {
        this.a = $$0;
    }

    public boolean d() {
        return this.a;
    }

    public boolean f() {
        return this.b;
    }

    public void b(boolean $$0) {
        boolean $$1 = this.b;
        this.b = $$0;
        if (!$$1 && $$0 && !this.a && this.o != null && this.v() != czx$a.a) {
            this.x();
        }
    }

    public void g() {
        a $$0 = this.v();
        if ($$0 == czx$a.b && (this.a || this.b) && this.o != null) {
            this.x();
        }
    }

    private void x() {
        cpn $$0 = this.q().b();
        if ($$0 instanceof cqu) {
            this.j();
            this.o.a(this.p, $$0, 1);
        }
    }

    public boolean i() {
        return this.c;
    }

    public boolean j() {
        this.c = true;
        if (this.w()) {
            czn $$1;
            gu $$0 = this.p.a(this.o.a_(this.p).c(cqu.a).g());
            this.c = this.o.a_($$0).b() instanceof cqu ? ($$1 = this.o.c_($$0)) instanceof czx && ((czx)$$1).c().k() > 0 : false;
        }
        return this.c;
    }

    public a v() {
        dcb $$0 = this.q();
        if ($$0.a(cpo.fN)) {
            return czx$a.c;
        }
        if ($$0.a(cpo.kG)) {
            return czx$a.b;
        }
        if ($$0.a(cpo.kH)) {
            return czx$a.a;
        }
        return czx$a.c;
    }

    public boolean w() {
        dcb $$0 = this.o.a_(this.p());
        if ($$0.b() instanceof cqu) {
            return $$0.c(cqu.b);
        }
        return false;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = czx$a.a();
        }
    }
}

