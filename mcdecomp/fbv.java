/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class fbv<T extends bwl>
extends fbo<T> {
    private static final int a = 8;
    private final fee b;
    private final fee[] f = new fee[8];

    public fbv(fee $$0) {
        this.b = $$0;
        Arrays.setAll(this.f, $$1 -> $$0.b(fbv.a($$1)));
    }

    private static String a(int $$0) {
        return "cube" + $$0;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        for (int $$2 = 0; $$2 < 8; ++$$2) {
            int $$3 = 0;
            int $$4 = $$2;
            if ($$2 == 2) {
                $$3 = 24;
                $$4 = 10;
            } else if ($$2 == 3) {
                $$3 = 24;
                $$4 = 19;
            }
            $$1.a(fbv.a($$2), fej.c().a($$3, $$4).a(-4.0f, 16 + $$2, -4.0f, 8.0f, 1.0f, 8.0f), feg.a);
        }
        $$1.a("inside_cube", fej.c().a(0, 16).a(-2.0f, 18.0f, -2.0f, 4.0f, 4.0f, 4.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        float $$4 = apa.i($$3, ((bwl)$$0).bS, ((bwl)$$0).e);
        if ($$4 < 0.0f) {
            $$4 = 0.0f;
        }
        for (int $$5 = 0; $$5 < this.f.length; ++$$5) {
            this.f[$$5].c = (float)(-(4 - $$5)) * $$4 * 1.7f;
        }
    }

    @Override
    public fee a() {
        return this.b;
    }
}

