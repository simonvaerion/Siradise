/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fbq<T extends btk>
extends fad<T> {
    private static final float g = 2.1816616f;
    private static final float h = 1.0471976f;
    private static final float i = 0.7853982f;
    private static final float j = 0.5235988f;
    private static final float k = 0.2617994f;
    protected static final String a = "head_parts";
    private static final String l = "left_hind_baby_leg";
    private static final String m = "right_hind_baby_leg";
    private static final String n = "left_front_baby_leg";
    private static final String o = "right_front_baby_leg";
    private static final String p = "saddle";
    private static final String q = "left_saddle_mouth";
    private static final String r = "left_saddle_line";
    private static final String s = "right_saddle_mouth";
    private static final String t = "right_saddle_line";
    private static final String u = "head_saddle";
    private static final String w = "mouth_saddle_wrap";
    protected final fee b;
    protected final fee f;
    private final fee x;
    private final fee y;
    private final fee z;
    private final fee A;
    private final fee B;
    private final fee C;
    private final fee D;
    private final fee E;
    private final fee F;
    private final fee[] G;
    private final fee[] H;

    public fbq(fee $$0) {
        super(true, 16.2f, 1.36f, 2.7272f, 2.0f, 20.0f);
        this.b = $$0.b("body");
        this.f = $$0.b(a);
        this.x = $$0.b("right_hind_leg");
        this.y = $$0.b("left_hind_leg");
        this.z = $$0.b("right_front_leg");
        this.A = $$0.b("left_front_leg");
        this.B = $$0.b(m);
        this.C = $$0.b(l);
        this.D = $$0.b(o);
        this.E = $$0.b(n);
        this.F = this.b.b("tail");
        fee $$1 = this.b.b(p);
        fee $$2 = this.f.b(q);
        fee $$3 = this.f.b(s);
        fee $$4 = this.f.b(r);
        fee $$5 = this.f.b(t);
        fee $$6 = this.f.b(u);
        fee $$7 = this.f.b(w);
        this.G = new fee[]{$$1, $$2, $$3, $$6, $$7};
        this.H = new fee[]{$$4, $$5};
    }

    public static fem a(fei $$0) {
        fem $$1 = new fem();
        fen $$2 = $$1.a();
        fen $$3 = $$2.a("body", fej.c().a(0, 32).a(-5.0f, -8.0f, -17.0f, 10.0f, 10.0f, 22.0f, new fei(0.05f)), feg.a(0.0f, 11.0f, 5.0f));
        fen $$4 = $$2.a(a, fej.c().a(0, 35).a(-2.05f, -6.0f, -2.0f, 4.0f, 12.0f, 7.0f), feg.a(0.0f, 4.0f, -12.0f, 0.5235988f, 0.0f, 0.0f));
        fen $$5 = $$4.a("head", fej.c().a(0, 13).a(-3.0f, -11.0f, -2.0f, 6.0f, 5.0f, 7.0f, $$0), feg.a);
        $$4.a("mane", fej.c().a(56, 36).a(-1.0f, -11.0f, 5.01f, 2.0f, 16.0f, 2.0f, $$0), feg.a);
        $$4.a("upper_mouth", fej.c().a(0, 25).a(-2.0f, -11.0f, -7.0f, 4.0f, 5.0f, 5.0f, $$0), feg.a);
        $$2.a("left_hind_leg", fej.c().a(48, 21).a().a(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$0), feg.a(4.0f, 14.0f, 7.0f));
        $$2.a("right_hind_leg", fej.c().a(48, 21).a(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$0), feg.a(-4.0f, 14.0f, 7.0f));
        $$2.a("left_front_leg", fej.c().a(48, 21).a().a(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$0), feg.a(4.0f, 14.0f, -12.0f));
        $$2.a("right_front_leg", fej.c().a(48, 21).a(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$0), feg.a(-4.0f, 14.0f, -12.0f));
        fei $$6 = $$0.a(0.0f, 5.5f, 0.0f);
        $$2.a(l, fej.c().a(48, 21).a().a(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$6), feg.a(4.0f, 14.0f, 7.0f));
        $$2.a(m, fej.c().a(48, 21).a(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, $$6), feg.a(-4.0f, 14.0f, 7.0f));
        $$2.a(n, fej.c().a(48, 21).a().a(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$6), feg.a(4.0f, 14.0f, -12.0f));
        $$2.a(o, fej.c().a(48, 21).a(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, $$6), feg.a(-4.0f, 14.0f, -12.0f));
        $$3.a("tail", fej.c().a(42, 36).a(-1.5f, 0.0f, 0.0f, 3.0f, 14.0f, 4.0f, $$0), feg.a(0.0f, -5.0f, 2.0f, 0.5235988f, 0.0f, 0.0f));
        $$3.a(p, fej.c().a(26, 0).a(-5.0f, -8.0f, -9.0f, 10.0f, 9.0f, 9.0f, new fei(0.5f)), feg.a);
        $$4.a(q, fej.c().a(29, 5).a(2.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f, $$0), feg.a);
        $$4.a(s, fej.c().a(29, 5).a(-3.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f, $$0), feg.a);
        $$4.a(r, fej.c().a(32, 2).a(3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f), feg.b(-0.5235988f, 0.0f, 0.0f));
        $$4.a(t, fej.c().a(32, 2).a(-3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f), feg.b(-0.5235988f, 0.0f, 0.0f));
        $$4.a(u, fej.c().a(1, 1).a(-3.0f, -11.0f, -1.9f, 6.0f, 5.0f, 6.0f, new fei(0.22f)), feg.a);
        $$4.a(w, fej.c().a(19, 0).a(-2.0f, -11.0f, -4.0f, 4.0f, 5.0f, 2.0f, new fei(0.2f)), feg.a);
        $$5.a("left_ear", fej.c().a(19, 16).a(0.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, new fei(-0.001f)), feg.a);
        $$5.a("right_ear", fej.c().a(19, 16).a(-2.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, new fei(-0.001f)), feg.a);
        return $$1;
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        boolean $$6 = ((btk)$$0).i();
        boolean $$7 = ((bfj)$$0).bN();
        for (fee $$8 : this.G) {
            $$8.k = $$6;
        }
        for (fee $$9 : this.H) {
            $$9.k = $$7 && $$6;
        }
        this.b.c = 11.0f;
    }

    @Override
    public Iterable<fee> a() {
        return ImmutableList.of((Object)this.f);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.b, (Object)this.x, (Object)this.y, (Object)this.z, (Object)this.A, (Object)this.B, (Object)this.C, (Object)this.D, (Object)this.E);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        float $$4 = apa.j($$3, ((btk)$$0).aW, ((btk)$$0).aV);
        float $$5 = apa.j($$3, ((btk)$$0).aY, ((btk)$$0).aX);
        float $$6 = apa.i($$3, ((btk)$$0).N, ((bfj)$$0).dA());
        float $$7 = $$5 - $$4;
        float $$8 = $$6 * ((float)Math.PI / 180);
        if ($$7 > 20.0f) {
            $$7 = 20.0f;
        }
        if ($$7 < -20.0f) {
            $$7 = -20.0f;
        }
        if ($$2 > 0.2f) {
            $$8 += apa.b($$1 * 0.8f) * 0.15f * $$2;
        }
        float $$9 = ((btk)$$0).D($$3);
        float $$10 = ((btk)$$0).E($$3);
        float $$11 = 1.0f - $$10;
        float $$12 = ((btk)$$0).F($$3);
        boolean $$13 = ((btk)$$0).cl != 0;
        float $$14 = (float)((btk)$$0).ag + $$3;
        this.f.c = 4.0f;
        this.f.d = -12.0f;
        this.b.e = 0.0f;
        this.f.e = 0.5235988f + $$8;
        this.f.f = $$7 * ((float)Math.PI / 180);
        float $$15 = ((bfj)$$0).aV() ? 0.2f : 1.0f;
        float $$16 = apa.b($$15 * $$1 * 0.6662f + (float)Math.PI);
        float $$17 = $$16 * 0.8f * $$2;
        float $$18 = (1.0f - Math.max($$10, $$9)) * (0.5235988f + $$8 + $$12 * apa.a($$14) * 0.05f);
        this.f.e = $$10 * (0.2617994f + $$8) + $$9 * (2.1816616f + apa.a($$14) * 0.05f) + $$18;
        this.f.f = $$10 * $$7 * ((float)Math.PI / 180) + (1.0f - Math.max($$10, $$9)) * this.f.f;
        this.f.c = $$10 * -4.0f + $$9 * 11.0f + (1.0f - Math.max($$10, $$9)) * this.f.c;
        this.f.d = $$10 * -4.0f + $$9 * -12.0f + (1.0f - Math.max($$10, $$9)) * this.f.d;
        this.b.e = $$10 * -0.7853982f + $$11 * this.b.e;
        float $$19 = 0.2617994f * $$10;
        float $$20 = apa.b($$14 * 0.6f + (float)Math.PI);
        this.A.c = 2.0f * $$10 + 14.0f * $$11;
        this.A.d = -6.0f * $$10 - 10.0f * $$11;
        this.z.c = this.A.c;
        this.z.d = this.A.d;
        float $$21 = (-1.0471976f + $$20) * $$10 + $$17 * $$11;
        float $$22 = (-1.0471976f - $$20) * $$10 - $$17 * $$11;
        this.y.e = $$19 - $$16 * 0.5f * $$2 * $$11;
        this.x.e = $$19 + $$16 * 0.5f * $$2 * $$11;
        this.A.e = $$21;
        this.z.e = $$22;
        this.F.e = 0.5235988f + $$2 * 0.75f;
        this.F.c = -5.0f + $$2;
        this.F.d = 2.0f + $$2 * 2.0f;
        this.F.f = $$13 ? apa.b($$14 * 0.7f) : 0.0f;
        this.B.c = this.x.c;
        this.B.d = this.x.d;
        this.B.e = this.x.e;
        this.C.c = this.y.c;
        this.C.d = this.y.d;
        this.C.e = this.y.e;
        this.D.c = this.z.c;
        this.D.d = this.z.d;
        this.D.e = this.z.e;
        this.E.c = this.A.c;
        this.E.d = this.A.d;
        this.E.e = this.A.e;
        boolean $$23 = ((bfe)$$0).h_();
        this.x.k = !$$23;
        this.y.k = !$$23;
        this.z.k = !$$23;
        this.A.k = !$$23;
        this.B.k = $$23;
        this.C.k = $$23;
        this.D.k = $$23;
        this.E.k = $$23;
        this.b.c = $$23 ? 10.8f : 0.0f;
    }
}

