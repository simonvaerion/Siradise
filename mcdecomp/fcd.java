/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fcd<T extends bfj>
extends fad<T> {
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 2;
    protected static final int a = 3;
    private static final float t = 0.0f;
    private static final float u = 16.0f;
    private static final float w = -9.0f;
    private static final float x = 15.0f;
    private static final float y = -9.0f;
    private static final float z = 12.0f;
    private static final float A = -10.0f;
    private static final float B = 15.0f;
    private static final float C = 8.0f;
    private static final float D = 20.0f;
    private static final float E = 14.0f;
    protected static final float b = 18.0f;
    protected static final float f = 5.0f;
    protected static final float g = 14.1f;
    private static final float F = -5.0f;
    private static final String G = "tail1";
    private static final String H = "tail2";
    protected final fee h;
    protected final fee i;
    protected final fee j;
    protected final fee k;
    protected final fee l;
    protected final fee m;
    protected final fee n;
    protected final fee o;
    protected int p = 1;

    public fcd(fee $$0) {
        super(true, 10.0f, 4.0f);
        this.n = $$0.b("head");
        this.o = $$0.b("body");
        this.l = $$0.b(G);
        this.m = $$0.b(H);
        this.h = $$0.b("left_hind_leg");
        this.i = $$0.b("right_hind_leg");
        this.j = $$0.b("left_front_leg");
        this.k = $$0.b("right_front_leg");
    }

    public static fem a(fei $$0) {
        fem $$1 = new fem();
        fen $$2 = $$1.a();
        fei $$3 = new fei(-0.02f);
        $$2.a("head", fej.c().a("main", -2.5f, -2.0f, -3.0f, 5.0f, 4.0f, 5.0f, $$0).a("nose", -1.5f, -0.001f, -4.0f, 3, 2, 2, $$0, 0, 24).a("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2, $$0, 0, 10).a("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2, $$0, 6, 10), feg.a(0.0f, 15.0f, -9.0f));
        $$2.a("body", fej.c().a(20, 0).a(-2.0f, 3.0f, -8.0f, 4.0f, 16.0f, 6.0f, $$0), feg.a(0.0f, 12.0f, -10.0f, 1.5707964f, 0.0f, 0.0f));
        $$2.a(G, fej.c().a(0, 15).a(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, $$0), feg.a(0.0f, 15.0f, 8.0f, 0.9f, 0.0f, 0.0f));
        $$2.a(H, fej.c().a(4, 15).a(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, $$3), feg.a(0.0f, 20.0f, 14.0f));
        fej $$4 = fej.c().a(8, 13).a(-1.0f, 0.0f, 1.0f, 2.0f, 6.0f, 2.0f, $$0);
        $$2.a("left_hind_leg", $$4, feg.a(1.1f, 18.0f, 5.0f));
        $$2.a("right_hind_leg", $$4, feg.a(-1.1f, 18.0f, 5.0f));
        fej $$5 = fej.c().a(40, 0).a(-1.0f, 0.0f, 0.0f, 2.0f, 10.0f, 2.0f, $$0);
        $$2.a("left_front_leg", $$5, feg.a(1.2f, 14.1f, -5.0f));
        $$2.a("right_front_leg", $$5, feg.a(-1.2f, 14.1f, -5.0f));
        return $$1;
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of((Object)this.n);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.o, (Object)this.h, (Object)this.i, (Object)this.j, (Object)this.k, (Object)this.l, (Object)this.m);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.n.e = $$5 * ((float)Math.PI / 180);
        this.n.f = $$4 * ((float)Math.PI / 180);
        if (this.p != 3) {
            this.o.e = 1.5707964f;
            if (this.p == 2) {
                this.h.e = apa.b($$1 * 0.6662f) * $$2;
                this.i.e = apa.b($$1 * 0.6662f + 0.3f) * $$2;
                this.j.e = apa.b($$1 * 0.6662f + (float)Math.PI + 0.3f) * $$2;
                this.k.e = apa.b($$1 * 0.6662f + (float)Math.PI) * $$2;
                this.m.e = 1.7278761f + 0.31415927f * apa.b($$1) * $$2;
            } else {
                this.h.e = apa.b($$1 * 0.6662f) * $$2;
                this.i.e = apa.b($$1 * 0.6662f + (float)Math.PI) * $$2;
                this.j.e = apa.b($$1 * 0.6662f + (float)Math.PI) * $$2;
                this.k.e = apa.b($$1 * 0.6662f) * $$2;
                this.m.e = this.p == 1 ? 1.7278761f + 0.7853982f * apa.b($$1) * $$2 : 1.7278761f + 0.47123894f * apa.b($$1) * $$2;
            }
        }
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        this.o.c = 12.0f;
        this.o.d = -10.0f;
        this.n.c = 15.0f;
        this.n.d = -9.0f;
        this.l.c = 15.0f;
        this.l.d = 8.0f;
        this.m.c = 20.0f;
        this.m.d = 14.0f;
        this.j.c = 14.1f;
        this.j.d = -5.0f;
        this.k.c = 14.1f;
        this.k.d = -5.0f;
        this.h.c = 18.0f;
        this.h.d = 5.0f;
        this.i.c = 18.0f;
        this.i.d = 5.0f;
        this.l.e = 0.9f;
        if (((bfj)$$0).bU()) {
            this.o.c += 1.0f;
            this.n.c += 2.0f;
            this.l.c += 1.0f;
            this.m.c += -4.0f;
            this.m.d += 2.0f;
            this.l.e = 1.5707964f;
            this.m.e = 1.5707964f;
            this.p = 0;
        } else if (((bfj)$$0).bV()) {
            this.m.c = this.l.c;
            this.m.d += 2.0f;
            this.l.e = 1.5707964f;
            this.m.e = 1.5707964f;
            this.p = 2;
        } else {
            this.p = 1;
        }
    }
}

