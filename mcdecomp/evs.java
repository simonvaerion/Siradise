/*
 * Decompiled with CFR 0.152.
 */
public class evs
extends ewp<cbh> {
    private static final acq w = new acq("textures/gui/container/anvil.png");
    private static final sw x = sw.c("container.repair.expensive");
    private epr y;
    private final byo z;

    public evs(cbh $$0, byn $$1, sw $$2) {
        super($$0, $$1, $$2, w);
        this.z = $$1.m;
        this.l = 60;
    }

    @Override
    public void B() {
        super.B();
        this.y.a();
    }

    @Override
    protected void D() {
        int $$0 = (this.g - this.c) / 2;
        int $$1 = (this.h - this.k) / 2;
        this.y = new epr(this.i, $$0 + 62, $$1 + 24, 103, 12, sw.c("container.repair"));
        this.y.d(false);
        this.y.n(-1);
        this.y.o(-1);
        this.y.b(false);
        this.y.m(50);
        this.y.b(this::a);
        this.y.a("");
        this.e(this.y);
        this.c(this.y);
        this.y.c(false);
    }

    @Override
    public void a(enn $$0, int $$1, int $$2) {
        String $$3 = this.y.b();
        this.b($$0, $$1, $$2);
        this.y.a($$3);
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        if ($$0 == 256) {
            this.f.t.q();
        }
        if (this.y.a($$0, $$1, $$2) || this.y.u()) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    private void a(String $$0) {
        ccx $$1 = ((cbh)this.p).b(0);
        if (!$$1.f()) {
            return;
        }
        String $$2 = $$0;
        if (!$$1.e().A() && $$2.equals($$1.e().y().getString())) {
            $$2 = "";
        }
        if (((cbh)this.p).a($$2)) {
            this.f.t.cl.a(new aaj($$2));
        }
    }

    @Override
    protected void b(eox $$0, int $$1, int $$2) {
        super.b($$0, $$1, $$2);
        int $$3 = ((cbh)this.p).n();
        if ($$3 > 0) {
            tj $$7;
            int $$4 = 8453920;
            if ($$3 >= 40 && !this.f.t.fO().d) {
                sw $$5 = x;
                $$4 = 0xFF6060;
            } else if (!((cbh)this.p).b(2).f()) {
                Object $$6 = null;
            } else {
                $$7 = sw.a("container.repair.cost", $$3);
                if (!((cbh)this.p).b(2).a(this.z)) {
                    $$4 = 0xFF6060;
                }
            }
            if ($$7 != null) {
                int $$8 = this.c - 8 - this.i.a($$7) - 2;
                int $$9 = 69;
                $$0.a($$8 - 2, 67, this.c - 8, 79, 0x4F000000);
                $$0.b(this.i, $$7, $$8, 69, $$4);
            }
        }
    }

    @Override
    protected void a(eox $$0, float $$1, int $$2, int $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(w, this.s + 59, this.t + 20, 0, this.k + (((cbh)this.p).b(0).f() ? 0 : 16), 110, 16);
    }

    @Override
    public void c(eox $$0, int $$1, int $$2, float $$3) {
        this.y.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void c(eox $$0, int $$1, int $$2) {
        if ((((cbh)this.p).b(0).f() || ((cbh)this.p).b(1).f()) && !((cbh)this.p).b(((cbh)this.p).o()).f()) {
            $$0.a(w, $$1 + 99, $$2 + 45, this.c, 0, 28, 21);
        }
    }

    @Override
    public void a(cbf $$0, int $$1, cfz $$2) {
        if ($$1 == 0) {
            this.y.a($$2.b() ? "" : $$2.y().getString());
            this.y.c(!$$2.b());
            this.a(this.y);
        }
    }
}

