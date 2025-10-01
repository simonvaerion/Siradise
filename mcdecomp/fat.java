/*
 * Decompiled with CFR 0.152.
 */
public class fat<T extends btj>
extends fbq<T> {
    private final fee g;
    private final fee h;

    public fat(fee $$0) {
        super($$0);
        this.g = this.b.b("left_chest");
        this.h = this.b.b("right_chest");
    }

    public static fek c() {
        fem $$0 = fbq.a(fei.a);
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("body");
        fej $$3 = fej.c().a(26, 21).a(-4.0f, 0.0f, -2.0f, 8.0f, 8.0f, 3.0f);
        $$2.a("left_chest", $$3, feg.a(6.0f, -8.0f, 0.0f, 0.0f, -1.5707964f, 0.0f));
        $$2.a("right_chest", $$3, feg.a(-6.0f, -8.0f, 0.0f, 0.0f, 1.5707964f, 0.0f));
        fen $$4 = $$1.a("head_parts").a("head");
        fej $$5 = fej.c().a(0, 12).a(-1.0f, -7.0f, 0.0f, 2.0f, 7.0f, 1.0f);
        $$4.a("left_ear", $$5, feg.a(1.25f, -10.0f, 4.0f, 0.2617994f, 0.0f, 0.2617994f));
        $$4.a("right_ear", $$5, feg.a(-1.25f, -10.0f, 4.0f, 0.2617994f, 0.0f, -0.2617994f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        if (((btj)$$0).r()) {
            this.g.k = true;
            this.h.k = true;
        } else {
            this.g.k = false;
            this.h.k = false;
        }
    }
}

