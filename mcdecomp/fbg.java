/*
 * Decompiled with CFR 0.152.
 */
public class fbg<T extends bfj>
extends fbo<T> {
    private static final String a = "base";
    private static final String b = "upper_jaw";
    private static final String f = "lower_jaw";
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;

    public fbg(fee $$0) {
        this.g = $$0;
        this.h = $$0.b(a);
        this.i = $$0.b(b);
        this.j = $$0.b(f);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 10.0f), feg.a(-5.0f, 24.0f, -5.0f));
        fej $$2 = fej.c().a(40, 0).a(0.0f, 0.0f, 0.0f, 4.0f, 14.0f, 8.0f);
        $$1.a(b, $$2, feg.a(1.5f, 24.0f, -4.0f));
        $$1.a(f, $$2, feg.a(-1.5f, 24.0f, 4.0f, 0.0f, (float)Math.PI, 0.0f));
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = $$1 * 2.0f;
        if ($$6 > 1.0f) {
            $$6 = 1.0f;
        }
        $$6 = 1.0f - $$6 * $$6 * $$6;
        this.i.g = (float)Math.PI - $$6 * 0.35f * (float)Math.PI;
        this.j.g = (float)Math.PI + $$6 * 0.35f * (float)Math.PI;
        float $$7 = ($$1 + apa.a($$1 * 2.7f)) * 0.6f * 12.0f;
        this.j.c = this.i.c = 24.0f - $$7;
        this.h.c = this.i.c;
    }

    @Override
    public fee a() {
        return this.g;
    }
}

