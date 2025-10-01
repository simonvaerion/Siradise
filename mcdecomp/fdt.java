/*
 * Decompiled with CFR 0.152.
 */
public class fdt<T extends bfj>
extends fdq<T> {
    private boolean b;

    public fdt(fee $$0) {
        super($$0);
    }

    public static fek c() {
        fem $$0 = fdq.b();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("head", fej.c().a(0, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), feg.a);
        fen $$3 = $$2.a("hat", fej.c().a(0, 64).a(0.0f, 0.0f, 0.0f, 10.0f, 2.0f, 10.0f), feg.a(-5.0f, -10.03125f, -5.0f));
        fen $$4 = $$3.a("hat2", fej.c().a(0, 76).a(0.0f, 0.0f, 0.0f, 7.0f, 4.0f, 7.0f), feg.a(1.75f, -4.0f, 2.0f, -0.05235988f, 0.0f, 0.02617994f));
        fen $$5 = $$4.a("hat3", fej.c().a(0, 87).a(0.0f, 0.0f, 0.0f, 4.0f, 4.0f, 4.0f), feg.a(1.75f, -4.0f, 2.0f, -0.10471976f, 0.0f, 0.05235988f));
        $$5.a("hat4", fej.c().a(0, 95).a(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f, new fei(0.25f)), feg.a(1.75f, -2.0f, 2.0f, -0.20943952f, 0.0f, 0.10471976f));
        fen $$6 = $$2.a("nose");
        $$6.a("mole", fej.c().a(0, 0).a(0.0f, 3.0f, -6.75f, 1.0f, 1.0f, 1.0f, new fei(-0.25f)), feg.a(0.0f, -2.0f, 0.0f));
        return fek.a($$0, 64, 128);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.a.a(0.0f, -2.0f, 0.0f);
        float $$6 = 0.01f * (float)(((bfj)$$0).af() % 10);
        this.a.e = apa.a((float)((bfj)$$0).ag * $$6) * 4.5f * ((float)Math.PI / 180);
        this.a.f = 0.0f;
        this.a.g = apa.b((float)((bfj)$$0).ag * $$6) * 2.5f * ((float)Math.PI / 180);
        if (this.b) {
            this.a.a(0.0f, 1.0f, -1.5f);
            this.a.e = -0.9f;
        }
    }

    public fee e() {
        return this.a;
    }

    public void b(boolean $$0) {
        this.b = $$0;
    }
}

