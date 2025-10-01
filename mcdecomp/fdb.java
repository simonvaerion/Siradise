/*
 * Decompiled with CFR 0.152.
 */
public class fdb
extends fdc {
    private final fee b;
    protected final fee a;

    public fdb(fee $$0) {
        this.b = $$0;
        this.a = $$0.b("head");
    }

    public static fem a() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), feg.a);
        return $$0;
    }

    public static fek b() {
        fem $$0 = fdb.a();
        fen $$1 = $$0.a();
        $$1.a("head").a("hat", fej.c().a(32, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new fei(0.25f)), feg.a);
        return fek.a($$0, 64, 64);
    }

    public static fek c() {
        fem $$0 = fdb.a();
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(float $$0, float $$1, float $$2) {
        this.a.f = $$1 * ((float)Math.PI / 180);
        this.a.e = $$2 * ((float)Math.PI / 180);
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }
}

