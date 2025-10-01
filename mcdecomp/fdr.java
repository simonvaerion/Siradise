/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public class fdr<T extends bxs>
extends fbo<T> {
    private static final float o = 13.0f;
    private static final float p = 1.0f;
    private final fee q;
    protected final fee a;
    protected final fee b;
    protected final fee f;
    protected final fee g;
    protected final fee h;
    protected final fee i;
    protected final fee j;
    protected final fee k;
    protected final fee l;
    protected final fee m;
    protected final fee n;
    private final List<fee> r;
    private final List<fee> s;
    private final List<fee> t;
    private final List<fee> u;

    public fdr(fee $$0) {
        super(fkf::d);
        this.q = $$0;
        this.a = $$0.b("bone");
        this.b = this.a.b("body");
        this.f = this.b.b("head");
        this.m = this.a.b("right_leg");
        this.i = this.a.b("left_leg");
        this.l = this.b.b("right_arm");
        this.j = this.b.b("left_arm");
        this.g = this.f.b("right_tendril");
        this.h = this.f.b("left_tendril");
        this.n = this.b.b("right_ribcage");
        this.k = this.b.b("left_ribcage");
        this.r = ImmutableList.of((Object)this.h, (Object)this.g);
        this.s = ImmutableList.of((Object)this.b);
        this.t = ImmutableList.of((Object)this.f, (Object)this.j, (Object)this.l, (Object)this.i, (Object)this.m);
        this.u = ImmutableList.of((Object)this.b, (Object)this.f, (Object)this.j, (Object)this.l, (Object)this.i, (Object)this.m);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("bone", fej.c(), feg.a(0.0f, 24.0f, 0.0f));
        fen $$3 = $$2.a("body", fej.c().a(0, 0).a(-9.0f, -13.0f, -4.0f, 18.0f, 21.0f, 11.0f), feg.a(0.0f, -21.0f, 0.0f));
        $$3.a("right_ribcage", fej.c().a(90, 11).a(-2.0f, -11.0f, -0.1f, 9.0f, 21.0f, 0.0f), feg.a(-7.0f, -2.0f, -4.0f));
        $$3.a("left_ribcage", fej.c().a(90, 11).a().a(-7.0f, -11.0f, -0.1f, 9.0f, 21.0f, 0.0f).a(false), feg.a(7.0f, -2.0f, -4.0f));
        fen $$4 = $$3.a("head", fej.c().a(0, 32).a(-8.0f, -16.0f, -5.0f, 16.0f, 16.0f, 10.0f), feg.a(0.0f, -13.0f, 0.0f));
        $$4.a("right_tendril", fej.c().a(52, 32).a(-16.0f, -13.0f, 0.0f, 16.0f, 16.0f, 0.0f), feg.a(-8.0f, -12.0f, 0.0f));
        $$4.a("left_tendril", fej.c().a(58, 0).a(0.0f, -13.0f, 0.0f, 16.0f, 16.0f, 0.0f), feg.a(8.0f, -12.0f, 0.0f));
        $$3.a("right_arm", fej.c().a(44, 50).a(-4.0f, 0.0f, -4.0f, 8.0f, 28.0f, 8.0f), feg.a(-13.0f, -13.0f, 1.0f));
        $$3.a("left_arm", fej.c().a(0, 58).a(-4.0f, 0.0f, -4.0f, 8.0f, 28.0f, 8.0f), feg.a(13.0f, -13.0f, 1.0f));
        $$2.a("right_leg", fej.c().a(76, 48).a(-3.1f, 0.0f, -3.0f, 6.0f, 13.0f, 6.0f), feg.a(-5.9f, -13.0f, 0.0f));
        $$2.a("left_leg", fej.c().a(76, 76).a(-2.9f, 0.0f, -3.0f, 6.0f, 13.0f, 6.0f), feg.a(5.9f, -13.0f, 0.0f));
        return fek.a($$0, 128, 128);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a().e().forEach(fee::c);
        float $$6 = $$3 - (float)((bxs)$$0).ag;
        this.a($$4, $$5);
        this.b($$1, $$2);
        this.a($$3);
        this.a($$0, $$3, $$6);
        this.a(((bxs)$$0).bT, eok.e, $$3);
        this.a(((bxs)$$0).bU, eok.f, $$3);
        this.a(((bxs)$$0).e, eok.b, $$3);
        this.a(((bxs)$$0).d, eok.a, $$3);
        this.a(((bxs)$$0).b, eok.c, $$3);
        this.a(((bxs)$$0).c, eok.d, $$3);
    }

    private void a(float $$0, float $$1) {
        this.f.e = $$1 * ((float)Math.PI / 180);
        this.f.f = $$0 * ((float)Math.PI / 180);
    }

    private void a(float $$0) {
        float $$1 = $$0 * 0.1f;
        float $$2 = apa.b($$1);
        float $$3 = apa.a($$1);
        this.f.g += 0.06f * $$2;
        this.f.e += 0.06f * $$3;
        this.b.g += 0.025f * $$3;
        this.b.e += 0.025f * $$2;
    }

    private void b(float $$0, float $$1) {
        float $$2 = Math.min(0.5f, 3.0f * $$1);
        float $$3 = $$0 * 0.8662f;
        float $$4 = apa.b($$3);
        float $$5 = apa.a($$3);
        float $$6 = Math.min(0.35f, $$2);
        this.f.g += 0.3f * $$5 * $$2;
        this.f.e += 1.2f * apa.b($$3 + 1.5707964f) * $$6;
        this.b.g = 0.1f * $$5 * $$2;
        this.b.e = 1.0f * $$4 * $$6;
        this.i.e = 1.0f * $$4 * $$2;
        this.m.e = 1.0f * apa.b($$3 + (float)Math.PI) * $$2;
        this.j.e = -(0.8f * $$4 * $$2);
        this.j.g = 0.0f;
        this.l.e = -(0.8f * $$5 * $$2);
        this.l.g = 0.0f;
        this.g();
    }

    private void g() {
        this.j.f = 0.0f;
        this.j.d = 1.0f;
        this.j.b = 13.0f;
        this.j.c = -13.0f;
        this.l.f = 0.0f;
        this.l.d = 1.0f;
        this.l.b = -13.0f;
        this.l.c = -13.0f;
    }

    private void a(T $$0, float $$1, float $$2) {
        float $$3;
        this.h.e = $$3 = ((bxs)$$0).D($$2) * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * (double)0.1f);
        this.g.e = -$$3;
    }

    @Override
    public fee a() {
        return this.q;
    }

    public List<fee> c() {
        return this.r;
    }

    public List<fee> d() {
        return this.s;
    }

    public List<fee> e() {
        return this.t;
    }

    public List<fee> f() {
        return this.u;
    }
}

