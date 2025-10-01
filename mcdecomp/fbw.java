/*
 * Decompiled with CFR 0.152.
 */
public class fbw<T extends bfj>
extends fbo<T> {
    private static final String a = "knot";
    private final fee b;
    private final fee f;

    public fbw(fee $$0) {
        this.b = $$0;
        this.f = $$0.b(a);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 0).a(-3.0f, -8.0f, -3.0f, 6.0f, 8.0f, 6.0f), feg.a);
        return fek.a($$0, 32, 32);
    }

    @Override
    public fee a() {
        return this.b;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.f.f = $$4 * ((float)Math.PI / 180);
        this.f.e = $$5 * ((float)Math.PI / 180);
    }
}

