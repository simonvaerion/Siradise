/*
 * Decompiled with CFR 0.152.
 */
public class fio
extends fhk {
    private final bfj a;
    private int b;
    private final int D;
    private final it E;

    public fio(few $$0, bfj $$1, it $$2) {
        this($$0, $$1, $$2, 3);
    }

    public fio(few $$0, bfj $$1, it $$2, int $$3) {
        this($$0, $$1, $$2, $$3, $$1.dl());
    }

    private fio(few $$0, bfj $$1, it $$2, int $$3, eei $$4) {
        super($$0, $$1.dn(), $$1.e(0.5), $$1.dt(), $$4.c, $$4.d, $$4.e);
        this.a = $$1;
        this.D = $$3;
        this.E = $$2;
        this.a();
    }

    @Override
    public void a() {
        for (int $$0 = 0; $$0 < 16; ++$$0) {
            double $$3;
            double $$2;
            double $$1 = this.r.i() * 2.0f - 1.0f;
            if ($$1 * $$1 + ($$2 = (double)(this.r.i() * 2.0f - 1.0f)) * $$2 + ($$3 = (double)(this.r.i() * 2.0f - 1.0f)) * $$3 > 1.0) continue;
            double $$4 = this.a.c($$1 / 4.0);
            double $$5 = this.a.e(0.5 + $$2 / 4.0);
            double $$6 = this.a.f($$3 / 4.0);
            this.c.a(this.E, false, $$4, $$5, $$6, $$1, $$2 + 0.2, $$3);
        }
        ++this.b;
        if (this.b >= this.D) {
            this.k();
        }
    }
}

