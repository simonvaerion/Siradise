/*
 * Decompiled with CFR 0.152.
 */
public abstract class evo
extends euq {
    private static final sw m = sw.c("advMode.setCommand");
    private static final sw n = sw.c("advMode.command");
    private static final sw o = sw.c("advMode.previousOutput");
    protected epr a;
    protected epr b;
    protected epi c;
    protected epi k;
    protected epp<Boolean> l;
    epl p;

    public evo() {
        super(enf.a);
    }

    @Override
    public void f() {
        this.a.a();
        if (!this.l().j()) {
            this.aw_();
        }
    }

    abstract cln l();

    abstract int B();

    @Override
    protected void b() {
        this.c = this.d(epi.a(sv.d, (epi $$0) -> this.C()).a(this.g / 2 - 4 - 150, this.h / 4 + 120 + 12, 150, 20).a());
        this.k = this.d(epi.a(sv.e, (epi $$0) -> this.aw_()).a(this.g / 2 + 4, this.h / 4 + 120 + 12, 150, 20).a());
        boolean $$02 = this.l().o();
        this.l = this.d(epp.a(sw.b("O"), sw.b("X")).a($$02).a().a(this.g / 2 + 150 - 20, this.B(), 20, 20, sw.c("advMode.trackOutput"), ($$0, $$1) -> {
            cln $$2 = this.l();
            $$2.a((boolean)$$1);
            this.c((boolean)$$1);
        }));
        this.a = new epr(this.i, this.g / 2 - 150, 50, 300, 20, (sw)sw.c("advMode.command")){

            @Override
            protected tj aE_() {
                return super.aE_().b(evo.this.p.c());
            }
        };
        this.a.m(32500);
        this.a.b(this::a);
        this.e(this.a);
        this.b = new epr(this.i, this.g / 2 - 150, this.B(), 276, 20, sw.c("advMode.previousOutput"));
        this.b.m(32500);
        this.b.c(false);
        this.b.a("-");
        this.e(this.b);
        this.c(this.a);
        this.p = new epl(this.f, this, this.a, this.i, true, true, 0, 7, false, Integer.MIN_VALUE);
        this.p.a(true);
        this.p.b();
        this.c($$02);
    }

    @Override
    public void a(enn $$0, int $$1, int $$2) {
        String $$3 = this.a.b();
        this.b($$0, $$1, $$2);
        this.a.a($$3);
        this.p.b();
    }

    protected void c(boolean $$0) {
        this.b.a($$0 ? this.l().l().getString() : "-");
    }

    protected void C() {
        cln $$0 = this.l();
        this.a($$0);
        if (!$$0.o()) {
            $$0.c(null);
        }
        this.f.a((euq)null);
    }

    protected abstract void a(cln var1);

    private void a(String $$0) {
        this.p.b();
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if (this.p.a($$0, $$1, $$2)) {
            return true;
        }
        if (super.a($$0, $$1, $$2)) {
            return true;
        }
        if ($$0 == 257 || $$0 == 335) {
            this.C();
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2) {
        if (this.p.a($$2)) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (this.p.a($$0, $$1, $$2)) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, m, this.g / 2, 20, 0xFFFFFF);
        $$0.b(this.i, n, this.g / 2 - 150, 40, 0xA0A0A0);
        this.a.a($$0, $$1, $$2, $$3);
        int $$4 = 75;
        if (!this.b.b().isEmpty()) {
            $$0.b(this.i, o, this.g / 2 - 150, ($$4 += 5 * this.i.b + 1 + this.B() - 135) + 4, 0xA0A0A0);
            this.b.a($$0, $$1, $$2, $$3);
        }
        super.a($$0, $$1, $$2, $$3);
        this.p.a($$0, $$1, $$2);
    }
}

