/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fcp<T extends bfj>
extends fad<T> {
    protected final fee a;
    protected final fee b;
    protected final fee f;
    protected final fee g;
    protected final fee h;
    protected final fee i;

    protected fcp(fee $$0, boolean $$1, float $$2, float $$3, float $$4, float $$5, int $$6) {
        super($$1, $$2, $$3, $$4, $$5, $$6);
        this.a = $$0.b("head");
        this.b = $$0.b("body");
        this.f = $$0.b("right_hind_leg");
        this.g = $$0.b("left_hind_leg");
        this.h = $$0.b("right_front_leg");
        this.i = $$0.b("left_front_leg");
    }

    public static fem a(int $$0, fei $$1) {
        fem $$2 = new fem();
        fen $$3 = $$2.a();
        $$3.a("head", fej.c().a(0, 0).a(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, $$1), feg.a(0.0f, 18 - $$0, -6.0f));
        $$3.a("body", fej.c().a(28, 8).a(-5.0f, -10.0f, -7.0f, 10.0f, 16.0f, 8.0f, $$1), feg.a(0.0f, 17 - $$0, 2.0f, 1.5707964f, 0.0f, 0.0f));
        fej $$4 = fej.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, (float)$$0, 4.0f, $$1);
        $$3.a("right_hind_leg", $$4, feg.a(-3.0f, 24 - $$0, 7.0f));
        $$3.a("left_hind_leg", $$4, feg.a(3.0f, 24 - $$0, 7.0f));
        $$3.a("right_front_leg", $$4, feg.a(-3.0f, 24 - $$0, -5.0f));
        $$3.a("left_front_leg", $$4, feg.a(3.0f, 24 - $$0, -5.0f));
        return $$2;
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
        this.a.e = $$5 * ((float)Math.PI / 180);
        this.a.f = $$4 * ((float)Math.PI / 180);
        this.f.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
        this.g.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.h.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2;
        this.i.e = apa.b($$1 * 0.6662f) * 1.4f * $$2;
    }
}

