/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.function.Function;

public class fbs<T extends bfz>
extends fad<T>
implements fag,
fbn {
    public static final float f = 0.25f;
    public static final float g = 0.5f;
    public static final float h = -0.1f;
    private static final float a = 0.005f;
    private static final float b = 0.2617994f;
    private static final float w = 1.9198622f;
    private static final float x = 0.2617994f;
    public static final float i = 1.4835298f;
    public static final float j = 0.5235988f;
    public final fee k;
    public final fee l;
    public final fee m;
    public final fee n;
    public final fee o;
    public final fee p;
    public final fee q;
    public a r = fbs$a.a;
    public a s = fbs$a.a;
    public boolean t;
    public float u;

    public fbs(fee $$0) {
        this($$0, fkf::d);
    }

    public fbs(fee $$0, Function<acq, fkf> $$1) {
        super($$1, true, 16.0f, 0.0f, 2.0f, 2.0f, 24.0f);
        this.k = $$0.b("head");
        this.l = $$0.b("hat");
        this.m = $$0.b("body");
        this.n = $$0.b("right_arm");
        this.o = $$0.b("left_arm");
        this.p = $$0.b("right_leg");
        this.q = $$0.b("left_leg");
    }

    public static fem a(fei $$0, float $$1) {
        fem $$2 = new fem();
        fen $$3 = $$2.a();
        $$3.a("head", fej.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), feg.a(0.0f, 0.0f + $$1, 0.0f));
        $$3.a("hat", fej.c().a(32, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0.a(0.5f)), feg.a(0.0f, 0.0f + $$1, 0.0f));
        $$3.a("body", fej.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0), feg.a(0.0f, 0.0f + $$1, 0.0f));
        $$3.a("right_arm", fej.c().a(40, 16).a(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(-5.0f, 2.0f + $$1, 0.0f));
        $$3.a("left_arm", fej.c().a(40, 16).a().a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(5.0f, 2.0f + $$1, 0.0f));
        $$3.a("right_leg", fej.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(-1.9f, 12.0f + $$1, 0.0f));
        $$3.a("left_leg", fej.c().a(0, 16).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), feg.a(1.9f, 12.0f + $$1, 0.0f));
        return $$2;
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of((Object)this.k);
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.m, (Object)this.n, (Object)this.o, (Object)this.p, (Object)this.q, (Object)this.l);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3) {
        this.u = ((bfz)$$0).a($$3);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        boolean $$9;
        boolean $$6 = ((bfz)$$0).fs() > 4;
        boolean $$7 = ((bfz)$$0).bX();
        this.k.f = $$4 * ((float)Math.PI / 180);
        this.k.e = $$6 ? -0.7853982f : (this.u > 0.0f ? ($$7 ? this.a(this.u, this.k.e, -0.7853982f) : this.a(this.u, this.k.e, $$5 * ((float)Math.PI / 180))) : $$5 * ((float)Math.PI / 180));
        this.m.f = 0.0f;
        this.n.d = 0.0f;
        this.n.b = -5.0f;
        this.o.d = 0.0f;
        this.o.b = 5.0f;
        float $$8 = 1.0f;
        if ($$6) {
            $$8 = (float)((bfj)$$0).dl().g();
            $$8 /= 0.2f;
            $$8 *= $$8 * $$8;
        }
        if ($$8 < 1.0f) {
            $$8 = 1.0f;
        }
        this.n.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 2.0f * $$2 * 0.5f / $$8;
        this.o.e = apa.b($$1 * 0.6662f) * 2.0f * $$2 * 0.5f / $$8;
        this.n.g = 0.0f;
        this.o.g = 0.0f;
        this.p.e = apa.b($$1 * 0.6662f) * 1.4f * $$2 / $$8;
        this.q.e = apa.b($$1 * 0.6662f + (float)Math.PI) * 1.4f * $$2 / $$8;
        this.p.f = 0.005f;
        this.q.f = -0.005f;
        this.p.g = 0.005f;
        this.q.g = -0.005f;
        if (this.d) {
            this.n.e += -0.62831855f;
            this.o.e += -0.62831855f;
            this.p.e = -1.4137167f;
            this.p.f = 0.31415927f;
            this.p.g = 0.07853982f;
            this.q.e = -1.4137167f;
            this.q.f = -0.31415927f;
            this.q.g = -0.07853982f;
        }
        this.n.f = 0.0f;
        this.o.f = 0.0f;
        boolean bl2 = $$9 = ((bfz)$$0).fh() == bft.b;
        if (((bfz)$$0).fi()) {
            boolean $$10;
            boolean bl3 = $$10 = ((bfz)$$0).fj() == bdw.a;
            if ($$10 == $$9) {
                this.a($$0);
            } else {
                this.b($$0);
            }
        } else {
            boolean $$11;
            boolean bl4 = $$11 = $$9 ? this.r.a() : this.s.a();
            if ($$9 != $$11) {
                this.b($$0);
                this.a($$0);
            } else {
                this.a($$0);
                this.b($$0);
            }
        }
        this.a($$0, $$3);
        if (this.t) {
            this.m.e = 0.5f;
            this.n.e += 0.4f;
            this.o.e += 0.4f;
            this.p.d = 4.0f;
            this.q.d = 4.0f;
            this.p.c = 12.2f;
            this.q.c = 12.2f;
            this.k.c = 4.2f;
            this.m.c = 3.2f;
            this.o.c = 5.2f;
            this.n.c = 5.2f;
        } else {
            this.m.e = 0.0f;
            this.p.d = 0.0f;
            this.q.d = 0.0f;
            this.p.c = 12.0f;
            this.q.c = 12.0f;
            this.k.c = 0.0f;
            this.m.c = 0.0f;
            this.o.c = 2.0f;
            this.n.c = 2.0f;
        }
        if (this.s != fbs$a.h) {
            faf.a(this.n, $$3, 1.0f);
        }
        if (this.r != fbs$a.h) {
            faf.a(this.o, $$3, -1.0f);
        }
        if (this.u > 0.0f) {
            float $$15;
            float $$12 = $$1 % 26.0f;
            bft $$13 = this.c($$0);
            float $$14 = $$13 == bft.b && this.c > 0.0f ? 0.0f : this.u;
            float f2 = $$15 = $$13 == bft.a && this.c > 0.0f ? 0.0f : this.u;
            if (!((bfz)$$0).fi()) {
                if ($$12 < 14.0f) {
                    this.o.e = this.a($$15, this.o.e, 0.0f);
                    this.n.e = apa.i($$14, this.n.e, 0.0f);
                    this.o.f = this.a($$15, this.o.f, (float)Math.PI);
                    this.n.f = apa.i($$14, this.n.f, (float)Math.PI);
                    this.o.g = this.a($$15, this.o.g, (float)Math.PI + 1.8707964f * this.a($$12) / this.a(14.0f));
                    this.n.g = apa.i($$14, this.n.g, (float)Math.PI - 1.8707964f * this.a($$12) / this.a(14.0f));
                } else if ($$12 >= 14.0f && $$12 < 22.0f) {
                    float $$16 = ($$12 - 14.0f) / 8.0f;
                    this.o.e = this.a($$15, this.o.e, 1.5707964f * $$16);
                    this.n.e = apa.i($$14, this.n.e, 1.5707964f * $$16);
                    this.o.f = this.a($$15, this.o.f, (float)Math.PI);
                    this.n.f = apa.i($$14, this.n.f, (float)Math.PI);
                    this.o.g = this.a($$15, this.o.g, 5.012389f - 1.8707964f * $$16);
                    this.n.g = apa.i($$14, this.n.g, 1.2707963f + 1.8707964f * $$16);
                } else if ($$12 >= 22.0f && $$12 < 26.0f) {
                    float $$17 = ($$12 - 22.0f) / 4.0f;
                    this.o.e = this.a($$15, this.o.e, 1.5707964f - 1.5707964f * $$17);
                    this.n.e = apa.i($$14, this.n.e, 1.5707964f - 1.5707964f * $$17);
                    this.o.f = this.a($$15, this.o.f, (float)Math.PI);
                    this.n.f = apa.i($$14, this.n.f, (float)Math.PI);
                    this.o.g = this.a($$15, this.o.g, (float)Math.PI);
                    this.n.g = apa.i($$14, this.n.g, (float)Math.PI);
                }
            }
            float $$18 = 0.3f;
            float $$19 = 0.33333334f;
            this.q.e = apa.i(this.u, this.q.e, 0.3f * apa.b($$1 * 0.33333334f + (float)Math.PI));
            this.p.e = apa.i(this.u, this.p.e, 0.3f * apa.b($$1 * 0.33333334f));
        }
        this.l.a(this.k);
    }

    private void a(T $$0) {
        switch (this.s) {
            case a: {
                this.n.f = 0.0f;
                break;
            }
            case c: {
                this.n.e = this.n.e * 0.5f - 0.9424779f;
                this.n.f = -0.5235988f;
                break;
            }
            case b: {
                this.n.e = this.n.e * 0.5f - 0.31415927f;
                this.n.f = 0.0f;
                break;
            }
            case e: {
                this.n.e = this.n.e * 0.5f - (float)Math.PI;
                this.n.f = 0.0f;
                break;
            }
            case d: {
                this.n.f = -0.1f + this.k.f;
                this.o.f = 0.1f + this.k.f + 0.4f;
                this.n.e = -1.5707964f + this.k.e;
                this.o.e = -1.5707964f + this.k.e;
                break;
            }
            case f: {
                faf.a(this.n, this.o, $$0, true);
                break;
            }
            case g: {
                faf.a(this.n, this.o, this.k, true);
                break;
            }
            case j: {
                this.n.e = this.n.e * 0.5f - 0.62831855f;
                this.n.f = 0.0f;
                break;
            }
            case h: {
                this.n.e = apa.a(this.k.e - 1.9198622f - (((bfj)$$0).bU() ? 0.2617994f : 0.0f), -2.4f, 3.3f);
                this.n.f = this.k.f - 0.2617994f;
                break;
            }
            case i: {
                this.n.e = apa.a(this.k.e, -1.2f, 1.2f) - 1.4835298f;
                this.n.f = this.k.f - 0.5235988f;
            }
        }
    }

    private void b(T $$0) {
        switch (this.r) {
            case a: {
                this.o.f = 0.0f;
                break;
            }
            case c: {
                this.o.e = this.o.e * 0.5f - 0.9424779f;
                this.o.f = 0.5235988f;
                break;
            }
            case b: {
                this.o.e = this.o.e * 0.5f - 0.31415927f;
                this.o.f = 0.0f;
                break;
            }
            case e: {
                this.o.e = this.o.e * 0.5f - (float)Math.PI;
                this.o.f = 0.0f;
                break;
            }
            case d: {
                this.n.f = -0.1f + this.k.f - 0.4f;
                this.o.f = 0.1f + this.k.f;
                this.n.e = -1.5707964f + this.k.e;
                this.o.e = -1.5707964f + this.k.e;
                break;
            }
            case f: {
                faf.a(this.n, this.o, $$0, false);
                break;
            }
            case g: {
                faf.a(this.n, this.o, this.k, false);
                break;
            }
            case j: {
                this.o.e = this.o.e * 0.5f - 0.62831855f;
                this.o.f = 0.0f;
                break;
            }
            case h: {
                this.o.e = apa.a(this.k.e - 1.9198622f - (((bfj)$$0).bU() ? 0.2617994f : 0.0f), -2.4f, 3.3f);
                this.o.f = this.k.f + 0.2617994f;
                break;
            }
            case i: {
                this.o.e = apa.a(this.k.e, -1.2f, 1.2f) - 1.4835298f;
                this.o.f = this.k.f + 0.5235988f;
            }
        }
    }

    protected void a(T $$0, float $$1) {
        if (this.c <= 0.0f) {
            return;
        }
        bft $$2 = this.c($$0);
        fee $$3 = this.a($$2);
        float $$4 = this.c;
        this.m.f = apa.a(apa.c($$4) * ((float)Math.PI * 2)) * 0.2f;
        if ($$2 == bft.a) {
            this.m.f *= -1.0f;
        }
        this.n.d = apa.a(this.m.f) * 5.0f;
        this.n.b = -apa.b(this.m.f) * 5.0f;
        this.o.d = -apa.a(this.m.f) * 5.0f;
        this.o.b = apa.b(this.m.f) * 5.0f;
        this.n.f += this.m.f;
        this.o.f += this.m.f;
        this.o.e += this.m.f;
        $$4 = 1.0f - this.c;
        $$4 *= $$4;
        $$4 *= $$4;
        $$4 = 1.0f - $$4;
        float $$5 = apa.a($$4 * (float)Math.PI);
        float $$6 = apa.a(this.c * (float)Math.PI) * -(this.k.e - 0.7f) * 0.75f;
        $$3.e -= $$5 * 1.2f + $$6;
        $$3.f += this.m.f * 2.0f;
        $$3.g += apa.a(this.c * (float)Math.PI) * -0.4f;
    }

    protected float a(float $$0, float $$1, float $$2) {
        float $$3 = ($$2 - $$1) % ((float)Math.PI * 2);
        if ($$3 < (float)(-Math.PI)) {
            $$3 += (float)Math.PI * 2;
        }
        if ($$3 >= (float)Math.PI) {
            $$3 -= (float)Math.PI * 2;
        }
        return $$1 + $$0 * $$3;
    }

    private float a(float $$0) {
        return -65.0f * $$0 + $$0 * $$0;
    }

    @Override
    public void a(fbs<T> $$0) {
        super.a($$0);
        $$0.r = this.r;
        $$0.s = this.s;
        $$0.t = this.t;
        $$0.k.a(this.k);
        $$0.l.a(this.l);
        $$0.m.a(this.m);
        $$0.n.a(this.n);
        $$0.o.a(this.o);
        $$0.p.a(this.p);
        $$0.q.a(this.q);
    }

    public void d_(boolean $$0) {
        this.k.k = $$0;
        this.l.k = $$0;
        this.m.k = $$0;
        this.n.k = $$0;
        this.o.k = $$0;
        this.p.k = $$0;
        this.q.k = $$0;
    }

    @Override
    public void a(bft $$0, eij $$1) {
        this.a($$0).a($$1);
    }

    protected fee a(bft $$0) {
        if ($$0 == bft.a) {
            return this.o;
        }
        return this.n;
    }

    @Override
    public fee d() {
        return this.k;
    }

    private bft c(T $$0) {
        bft $$1 = ((bfz)$$0).fh();
        return ((bfz)$$0).aH == bdw.a ? $$1 : $$1.d();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(false);
        public static final /* enum */ a b = new a(false);
        public static final /* enum */ a c = new a(false);
        public static final /* enum */ a d = new a(true);
        public static final /* enum */ a e = new a(false);
        public static final /* enum */ a f = new a(true);
        public static final /* enum */ a g = new a(true);
        public static final /* enum */ a h = new a(false);
        public static final /* enum */ a i = new a(false);
        public static final /* enum */ a j = new a(false);
        private final boolean k;
        private static final /* synthetic */ a[] l;

        public static a[] values() {
            return (a[])l.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0) {
            this.k = $$0;
        }

        public boolean a() {
            return this.k;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d, e, f, g, h, i, j};
        }

        static {
            l = fbs$a.b();
        }
    }
}

