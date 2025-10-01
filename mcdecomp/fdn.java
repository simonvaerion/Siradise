/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class fdn<T extends bsm>
extends fcp<T> {
    private static final String j = "egg_belly";
    private final fee k;

    public fdn(fee $$0) {
        super($$0, true, 120.0f, 0.0f, 9.0f, 6.0f, 120);
        this.k = $$0.b(j);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("head", fej.c().a(3, 0).a(-3.0f, -1.0f, -3.0f, 6.0f, 5.0f, 6.0f), feg.a(0.0f, 19.0f, -10.0f));
        $$1.a("body", fej.c().a(7, 37).a("shell", -9.5f, 3.0f, -10.0f, 19.0f, 20.0f, 6.0f).a(31, 1).a("belly", -5.5f, 3.0f, -13.0f, 11.0f, 18.0f, 3.0f), feg.a(0.0f, 11.0f, -10.0f, 1.5707964f, 0.0f, 0.0f));
        $$1.a(j, fej.c().a(70, 33).a(-4.5f, 3.0f, -14.0f, 9.0f, 18.0f, 1.0f), feg.a(0.0f, 11.0f, -10.0f, 1.5707964f, 0.0f, 0.0f));
        boolean $$2 = true;
        $$1.a("right_hind_leg", fej.c().a(1, 23).a(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f), feg.a(-3.5f, 22.0f, 11.0f));
        $$1.a("left_hind_leg", fej.c().a(1, 12).a(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f), feg.a(3.5f, 22.0f, 11.0f));
        $$1.a("right_front_leg", fej.c().a(27, 30).a(-13.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f), feg.a(-5.0f, 21.0f, -4.0f));
        $$1.a("left_front_leg", fej.c().a(27, 24).a(0.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f), feg.a(5.0f, 21.0f, -4.0f));
        return fek.a($$0, 128, 64);
    }

    @Override
    protected Iterable<fee> b() {
        return Iterables.concat(super.b(), (Iterable)ImmutableList.of((Object)this.k));
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.f.e = apa.b($$1 * 0.6662f * 0.6f) * 0.5f * $$2;
        this.g.e = apa.b($$1 * 0.6662f * 0.6f + (float)Math.PI) * 0.5f * $$2;
        this.h.g = apa.b($$1 * 0.6662f * 0.6f + (float)Math.PI) * 0.5f * $$2;
        this.i.g = apa.b($$1 * 0.6662f * 0.6f) * 0.5f * $$2;
        this.h.e = 0.0f;
        this.i.e = 0.0f;
        this.h.f = 0.0f;
        this.i.f = 0.0f;
        this.f.f = 0.0f;
        this.g.f = 0.0f;
        if (!((bfj)$$0).aV() && ((bfj)$$0).ay()) {
            float $$6 = ((bsm)$$0).r() ? 4.0f : 1.0f;
            float $$7 = ((bsm)$$0).r() ? 2.0f : 1.0f;
            float $$8 = 5.0f;
            this.h.f = apa.b($$6 * $$1 * 5.0f + (float)Math.PI) * 8.0f * $$2 * $$7;
            this.h.g = 0.0f;
            this.i.f = apa.b($$6 * $$1 * 5.0f) * 8.0f * $$2 * $$7;
            this.i.g = 0.0f;
            this.f.f = apa.b($$1 * 5.0f + (float)Math.PI) * 3.0f * $$2;
            this.f.e = 0.0f;
            this.g.f = apa.b($$1 * 5.0f) * 3.0f * $$2;
            this.g.e = 0.0f;
        }
        this.k.k = !this.e && ((bsm)$$0).q();
    }

    @Override
    public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
        boolean $$8 = this.k.k;
        if ($$8) {
            $$0.a();
            $$0.a(0.0f, -0.08f, 0.0f);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        if ($$8) {
            $$0.b();
        }
    }
}

