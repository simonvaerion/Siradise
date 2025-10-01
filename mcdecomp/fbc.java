/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

public class fbc<T extends bfz>
extends fad<T> {
    private final fee a;
    private final fee b;

    public fbc(fee $$0) {
        this.b = $$0.b("left_wing");
        this.a = $$0.b("right_wing");
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        fei $$2 = new fei(1.0f);
        $$1.a("left_wing", fej.c().a(22, 0).a(-10.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, $$2), feg.a(5.0f, 0.0f, 0.0f, 0.2617994f, 0.0f, -0.2617994f));
        $$1.a("right_wing", fej.c().a(22, 0).a().a(0.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, $$2), feg.a(-5.0f, 0.0f, 0.0f, 0.2617994f, 0.0f, 0.2617994f));
        return fek.a($$0, 64, 32);
    }

    @Override
    protected Iterable<fee> a() {
        return ImmutableList.of();
    }

    @Override
    protected Iterable<fee> b() {
        return ImmutableList.of((Object)this.b, (Object)this.a);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = 0.2617994f;
        float $$7 = -0.2617994f;
        float $$8 = 0.0f;
        float $$9 = 0.0f;
        if (((bfz)$$0).fr()) {
            float $$10 = 1.0f;
            eei $$11 = ((bfj)$$0).dl();
            if ($$11.d < 0.0) {
                eei $$12 = $$11.d();
                $$10 = 1.0f - (float)Math.pow(-$$12.d, 1.5);
            }
            $$6 = $$10 * 0.34906584f + (1.0f - $$10) * $$6;
            $$7 = $$10 * -1.5707964f + (1.0f - $$10) * $$7;
        } else if (((bfj)$$0).bU()) {
            $$6 = 0.6981317f;
            $$7 = -0.7853982f;
            $$8 = 3.0f;
            $$9 = 0.08726646f;
        }
        this.b.c = $$8;
        if ($$0 instanceof fiv) {
            fiv $$13 = (fiv)$$0;
            $$13.c += ($$6 - $$13.c) * 0.1f;
            $$13.d += ($$9 - $$13.d) * 0.1f;
            $$13.e += ($$7 - $$13.e) * 0.1f;
            this.b.e = $$13.c;
            this.b.f = $$13.d;
            this.b.g = $$13.e;
        } else {
            this.b.e = $$6;
            this.b.g = $$7;
            this.b.f = $$9;
        }
        this.a.f = -this.b.f;
        this.a.c = this.b.c;
        this.a.e = this.b.e;
        this.a.g = -this.b.g;
    }
}

