/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fbh<T extends brv>
extends fad<T> {
    public final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private static final int k = 6;
    private static final float l = 16.5f;
    private static final float m = 17.5f;
    private float n;

    public fbh(fee $$0) {
        super(true, 8.0f, 3.35f);
        this.a = $$0.b("head");
        this.b = $$0.b("body");
        this.f = $$0.b("right_hind_leg");
        this.g = $$0.b("left_hind_leg");
        this.h = $$0.b("right_front_leg");
        this.i = $$0.b("left_front_leg");
        this.j = this.b.b("tail");
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("head", fej.c().a(1, 5).a(-3.0f, -2.0f, -5.0f, 8.0f, 6.0f, 6.0f), feg.a(-1.0f, 16.5f, -3.0f));
        $$2.a("right_ear", fej.c().a(8, 1).a(-3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f), feg.a);
        $$2.a("left_ear", fej.c().a(15, 1).a(3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f), feg.a);
        $$2.a("nose", fej.c().a(6, 18).a(-1.0f, 2.01f, -8.0f, 4.0f, 2.0f, 3.0f), feg.a);
        fen $$3 = $$1.a("body", fej.c().a(24, 15).a(-3.0f, 3.999f, -3.5f, 6.0f, 11.0f, 6.0f), feg.a(0.0f, 16.0f, -6.0f, 1.5707964f, 0.0f, 0.0f));
        fei $$4 = new fei(0.001f);
        fej $$5 = fej.c().a(4, 24).a(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, $$4);
        fej $$6 = fej.c().a(13, 24).a(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, $$4);
        $$1.a("right_hind_leg", $$6, feg.a(-5.0f, 17.5f, 7.0f));
        $$1.a("left_hind_leg", $$5, feg.a(-1.0f, 17.5f, 7.0f));
        $$1.a("right_front_leg", $$6, feg.a(-5.0f, 17.5f, 0.0f));
        $$1.a("left_front_leg", $$5, feg.a(-1.0f, 17.5f, 0.0f));
        $$3.a("tail", fej.c().a(30, 0).a(2.0f, 0.0f, -1.0f, 4.0f, 9.0f, 5.0f), feg.a(-4.0f, 15.0f, -1.0f, -0.05235988f, 0.0f, 0.0f));
        return fek.a($$0, 48, 32);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        this.b.e = 1.5707964f;
        this.j.e = -0.05235988f;
        this.f.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        this.g.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.h.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.i.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        this.a.a(-1.0f, 16.5f, -3.0f);
        this.a.f = 0.0f;
        this.a.g = ((brv)$$0).D($$3);
        this.f.k = true;
        this.g.k = true;
        this.h.k = true;
        this.i.k = true;
        this.b.a(0.0f, 16.0f, -6.0f);
        this.b.g = 0.0f;
        this.f.a(-5.0f, 17.5f, 7.0f);
        this.g.a(-1.0f, 17.5f, 7.0f);
        if (((brv)$$0).bU()) {
            this.b.e = 1.6755161f;
            float $$4 = ((brv)$$0).E($$3);
            this.b.a(0.0f, 16.0f + ((brv)$$0).E($$3), -6.0f);
            this.a.a(-1.0f, 16.5f + $$4, -3.0f);
            this.a.f = 0.0f;
        } else if (((brv)$$0).fy()) {
            this.b.g = -1.5707964f;
            this.b.a(0.0f, 21.0f, -6.0f);
            this.j.e = -2.6179938f;
            if (this.e) {
                this.j.e = -2.1816616f;
                this.b.a(0.0f, 21.0f, -2.0f);
            }
            this.a.a(1.0f, 19.49f, -3.0f);
            this.a.e = 0.0f;
            this.a.f = -2.0943952f;
            this.a.g = 0.0f;
            this.f.k = false;
            this.g.k = false;
            this.h.k = false;
            this.i.k = false;
        } else if (((brv)$$0).w()) {
            this.b.e = 0.5235988f;
            this.b.a(0.0f, 9.0f, -3.0f);
            this.j.e = 0.7853982f;
            this.j.a(-4.0f, 15.0f, -2.0f);
            this.a.a(-1.0f, 10.0f, -0.25f);
            this.a.e = 0.0f;
            this.a.f = 0.0f;
            if (this.e) {
                this.a.a(-1.0f, 13.0f, -3.75f);
            }
            this.f.e = -1.3089969f;
            this.f.a(-5.0f, 21.5f, 6.75f);
            this.g.e = -1.3089969f;
            this.g.a(-1.0f, 21.5f, 6.75f);
            this.h.e = -0.2617994f;
            this.i.e = -0.2617994f;
        }
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of((Object)this.a);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.b, (Object)this.f, (Object)this.g, (Object)this.h, (Object)this.i);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        if (!(((brv)$$0).fy() || ((brv)$$0).fY() || ((brv)$$0).bU())) {
            this.a.e = $$5 * ((float)Math.PI / 180);
            this.a.f = $$4 * ((float)Math.PI / 180);
        }
        if (((brv)$$0).fy()) {
            this.a.e = 0.0f;
            this.a.f = -2.0943952f;
            this.a.g = apa.b($$3 * 0.027f) / 22.0f;
        }
        if (((brv)$$0).bU()) {
            float $$6;
            this.b.f = $$6 = apa.b($$3) * 0.01f;
            this.f.g = $$6;
            this.g.g = $$6;
            this.h.g = $$6 / 2.0f;
            this.i.g = $$6 / 2.0f;
        }
        if (((brv)$$0).fY()) {
            float $$7 = 0.1f;
            this.n += 0.67f;
            this.f.e = apa.b(this.n * 0.4662f) * 0.1f;
            this.g.e = apa.b(this.n * 0.4662f + (float)Math.PI) * 0.1f;
            this.h.e = apa.b(this.n * 0.4662f + (float)Math.PI) * 0.1f;
            this.i.e = apa.b(this.n * 0.4662f) * 0.1f;
        }
    }
}

