/*
 * Decompiled with CFR 0.152.
 */
public class ewb
extends evp<cbu>
implements eyi {
    private static final acq w = new acq("textures/gui/container/crafting_table.png");
    private static final acq x = new acq("textures/gui/recipe_button.png");
    private final eyc y = new eyc();
    private boolean z;

    public ewb(cbu $$0, byn $$1, sw $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void b() {
        super.b();
        this.z = this.g < 379;
        this.y.a(this.g, this.h, this.f, this.z, (ccp)this.p);
        this.s = this.y.a(this.g, this.c);
        this.d(new ept(this.s + 5, this.h / 2 - 49, 20, 18, 0, 0, 19, x, $$0 -> {
            this.y.f();
            this.s = this.y.a(this.g, this.c);
            $$0.b(this.s + 5, this.h / 2 - 49);
        }));
        this.e(this.y);
        this.c(this.y);
        this.l = 29;
    }

    @Override
    public void B() {
        super.B();
        this.y.h();
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        if (this.y.g() && this.z) {
            this.a($$0, $$3, $$1, $$2);
            this.y.a($$0, $$1, $$2, $$3);
        } else {
            this.y.a($$0, $$1, $$2, $$3);
            super.a($$0, $$1, $$2, $$3);
            this.y.a($$0, this.s, this.t, true, $$3);
        }
        this.a($$0, $$1, $$2);
        this.y.a($$0, this.s, this.t, $$1, $$2);
    }

    @Override
    protected void a(eox $$0, float $$1, int $$2, int $$3) {
        int $$4 = this.s;
        int $$5 = (this.h - this.k) / 2;
        $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
    }

    @Override
    protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
        return (!this.z || !this.y.g()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(double $$0, double $$1, int $$2) {
        if (this.y.a($$0, $$1, $$2)) {
            this.a(this.y);
            return true;
        }
        if (this.z && this.y.g()) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
        boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
        return this.y.a($$0, $$1, this.s, this.t, this.c, this.k, $$4) && $$5;
    }

    @Override
    protected void a(ccx $$0, int $$1, int $$2, cbo $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.y.a($$0);
    }

    @Override
    public void D() {
        this.y.i();
    }

    @Override
    public eyc E() {
        return this.y;
    }
}

