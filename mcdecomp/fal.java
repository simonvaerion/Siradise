/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fal<T extends brm>
extends fad<T> {
    private static final float a = 19.0f;
    private static final String b = "bone";
    private static final String f = "stinger";
    private static final String g = "left_antenna";
    private static final String h = "right_antenna";
    private static final String i = "front_legs";
    private static final String j = "middle_legs";
    private static final String k = "back_legs";
    private final fee l;
    private final fee m;
    private final fee n;
    private final fee o;
    private final fee p;
    private final fee q;
    private final fee r;
    private final fee s;
    private final fee t;
    private float u;

    public fal(fee $$0) {
        super(false, 24.0f, 0.0f);
        this.l = $$0.b(b);
        fee $$1 = this.l.b("body");
        this.r = $$1.b(f);
        this.s = $$1.b(g);
        this.t = $$1.b(h);
        this.m = this.l.b("right_wing");
        this.n = this.l.b("left_wing");
        this.o = this.l.b(i);
        this.p = this.l.b(j);
        this.q = this.l.b(k);
    }

    public static fek c() {
        float $$0 = 19.0f;
        fem $$1 = new fem();
        fen $$2 = $$1.a();
        fen $$3 = $$2.a(b, fej.c(), feg.a(0.0f, 19.0f, 0.0f));
        fen $$4 = $$3.a("body", fej.c().a(0, 0).a(-3.5f, -4.0f, -5.0f, 7.0f, 7.0f, 10.0f), feg.a);
        $$4.a(f, fej.c().a(26, 7).a(0.0f, -1.0f, 5.0f, 0.0f, 1.0f, 2.0f), feg.a);
        $$4.a(g, fej.c().a(2, 0).a(1.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f), feg.a(0.0f, -2.0f, -5.0f));
        $$4.a(h, fej.c().a(2, 3).a(-2.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f), feg.a(0.0f, -2.0f, -5.0f));
        fei $$5 = new fei(0.001f);
        $$3.a("right_wing", fej.c().a(0, 18).a(-9.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, $$5), feg.a(-1.5f, -4.0f, -3.0f, 0.0f, -0.2618f, 0.0f));
        $$3.a("left_wing", fej.c().a(0, 18).a().a(0.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, $$5), feg.a(1.5f, -4.0f, -3.0f, 0.0f, 0.2618f, 0.0f));
        $$3.a(i, fej.c().a(i, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 1), feg.a(1.5f, 3.0f, -2.0f));
        $$3.a(j, fej.c().a(j, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 3), feg.a(1.5f, 3.0f, 0.0f));
        $$3.a(k, fej.c().a(k, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 5), feg.a(1.5f, 3.0f, 2.0f));
        return fek.a($$1, 64, 64);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.u = ((brm)$$0).D($$3);
        this.r.k = !((brm)$$0).gj();
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        boolean $$6;
        this.m.e = 0.0f;
        this.s.e = 0.0f;
        this.t.e = 0.0f;
        this.l.e = 0.0f;
        boolean bl2 = $$6 = ((bfj)$$0).ay() && ((bfj)$$0).dl().g() < 1.0E-7;
        if ($$6) {
            this.m.f = -0.2618f;
            this.m.g = 0.0f;
            this.n.e = 0.0f;
            this.n.f = 0.2618f;
            this.n.g = 0.0f;
            this.o.e = 0.0f;
            this.p.e = 0.0f;
            this.q.e = 0.0f;
        } else {
            float $$7 = $$3 * 120.32113f * ((float)Math.PI / 180);
            this.m.f = 0.0f;
            this.m.g = apa.b($$7) * (float)Math.PI * 0.15f;
            this.n.e = this.m.e;
            this.n.f = this.m.f;
            this.n.g = -this.m.g;
            this.o.e = 0.7853982f;
            this.p.e = 0.7853982f;
            this.q.e = 0.7853982f;
            this.l.e = 0.0f;
            this.l.f = 0.0f;
            this.l.g = 0.0f;
        }
        if (!$$0.S_()) {
            this.l.e = 0.0f;
            this.l.f = 0.0f;
            this.l.g = 0.0f;
            if (!$$6) {
                float $$8 = apa.b($$3 * 0.18f);
                this.l.e = 0.1f + $$8 * (float)Math.PI * 0.025f;
                this.s.e = $$8 * (float)Math.PI * 0.03f;
                this.t.e = $$8 * (float)Math.PI * 0.03f;
                this.o.e = -$$8 * (float)Math.PI * 0.1f + 0.3926991f;
                this.q.e = -$$8 * (float)Math.PI * 0.05f + 0.7853982f;
                this.l.c = 19.0f - apa.b($$3 * 0.18f) * 0.9f;
            }
        }
        if (this.u > 0.0f) {
            this.l.e = fcc.a(this.l.e, 3.0915928f, this.u);
        }
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of();
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.l);
    }
}

