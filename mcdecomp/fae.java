/*
 * Decompiled with CFR 0.152.
 */
public class fae
extends fbo<bsp>
implements fag {
    private final fee a;
    private final fee b;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private static final float k = 0.7853982f;
    private static final float l = -1.134464f;
    private static final float m = -1.0471976f;

    public fae(fee $$0) {
        super(fkf::h);
        this.a = $$0.b("root");
        this.b = this.a.b("head");
        this.f = this.a.b("body");
        this.g = this.f.b("right_arm");
        this.h = this.f.b("left_arm");
        this.i = this.f.b("right_wing");
        this.j = this.f.b("left_wing");
    }

    @Override
    public fee a() {
        return this.a;
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fen $$2 = $$1.a("root", fej.c(), feg.a(0.0f, 23.5f, 0.0f));
        $$2.a("head", fej.c().a(0, 0).a(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f, new fei(0.0f)), feg.a(0.0f, -3.99f, 0.0f));
        fen $$3 = $$2.a("body", fej.c().a(0, 10).a(-1.5f, 0.0f, -1.0f, 3.0f, 4.0f, 2.0f, new fei(0.0f)).a(0, 16).a(-1.5f, 0.0f, -1.0f, 3.0f, 5.0f, 2.0f, new fei(-0.2f)), feg.a(0.0f, -4.0f, 0.0f));
        $$3.a("right_arm", fej.c().a(23, 0).a(-0.75f, -0.5f, -1.0f, 1.0f, 4.0f, 2.0f, new fei(-0.01f)), feg.a(-1.75f, 0.5f, 0.0f));
        $$3.a("left_arm", fej.c().a(23, 6).a(-0.25f, -0.5f, -1.0f, 1.0f, 4.0f, 2.0f, new fei(-0.01f)), feg.a(1.75f, 0.5f, 0.0f));
        $$3.a("right_wing", fej.c().a(16, 14).a(0.0f, 1.0f, 0.0f, 0.0f, 5.0f, 8.0f, new fei(0.0f)), feg.a(-0.5f, 0.0f, 0.6f));
        $$3.a("left_wing", fej.c().a(16, 14).a(0.0f, 1.0f, 0.0f, 0.0f, 5.0f, 8.0f, new fei(0.0f)), feg.a(0.5f, 0.0f, 0.6f));
        return fek.a($$0, 32, 32);
    }

    @Override
    public void a(bsp $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.a().e().forEach(fee::c);
        float $$6 = $$3 * 20.0f * ((float)Math.PI / 180) + $$1;
        float $$7 = apa.b($$6) * (float)Math.PI * 0.15f + $$2;
        float $$8 = $$3 - (float)$$0.ag;
        float $$9 = $$3 * 9.0f * ((float)Math.PI / 180);
        float $$10 = Math.min($$2 / 0.3f, 1.0f);
        float $$11 = 1.0f - $$10;
        float $$12 = $$0.D($$8);
        if ($$0.fY()) {
            float $$13 = $$3 * 8.0f * ((float)Math.PI / 180) + $$2;
            float $$14 = apa.b($$13) * 16.0f * ((float)Math.PI / 180);
            float $$15 = $$0.E($$8);
            float $$16 = apa.b($$13) * 14.0f * ((float)Math.PI / 180);
            float $$17 = apa.b($$13) * 30.0f * ((float)Math.PI / 180);
            this.a.f = $$0.ga() ? (float)Math.PI * 4 * $$15 : this.a.f;
            this.a.g = $$14 * (1.0f - $$15);
            this.b.f = $$17 * (1.0f - $$15);
            this.b.g = $$16 * (1.0f - $$15);
        } else {
            this.b.e = $$5 * ((float)Math.PI / 180);
            this.b.f = $$4 * ((float)Math.PI / 180);
        }
        this.i.e = 0.43633232f * (1.0f - $$10);
        this.i.f = -0.7853982f + $$7;
        this.j.e = 0.43633232f * (1.0f - $$10);
        this.j.f = 0.7853982f - $$7;
        this.f.e = $$10 * 0.7853982f;
        float $$18 = $$12 * apa.i($$10, -1.0471976f, -1.134464f);
        this.a.c += (float)Math.cos($$9) * 0.25f * $$11;
        this.g.e = $$18;
        this.h.e = $$18;
        float $$19 = $$11 * (1.0f - $$12);
        float $$20 = 0.43633232f - apa.b($$9 + 4.712389f) * (float)Math.PI * 0.075f * $$19;
        this.h.g = -$$20;
        this.g.g = $$20;
        this.g.f = 0.27925268f * $$12;
        this.h.f = -0.27925268f * $$12;
    }

    @Override
    public void a(bft $$0, eij $$1) {
        float $$2 = 1.0f;
        float $$3 = 3.0f;
        this.a.a($$1);
        this.f.a($$1);
        $$1.a(0.0f, 0.0625f, 0.1875f);
        $$1.a(a.b.rotation(this.g.e));
        $$1.b(0.7f, 0.7f, 0.7f);
        $$1.a(0.0625f, 0.0f, 0.0f);
    }
}

