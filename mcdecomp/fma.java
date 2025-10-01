/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Calendar;

public class fma<T extends czn>
implements flu<T> {
    private static final String a = "bottom";
    private static final String b = "lid";
    private static final String c = "lock";
    private final fee d;
    private final fee e;
    private final fee f;
    private final fee g;
    private final fee h;
    private final fee i;
    private final fee j;
    private final fee k;
    private final fee l;
    private boolean m;

    public fma(flv.a $$0) {
        Calendar $$1 = Calendar.getInstance();
        if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
            this.m = true;
        }
        fee $$2 = $$0.a(fed.r);
        this.e = $$2.b(a);
        this.d = $$2.b(b);
        this.f = $$2.b(c);
        fee $$3 = $$0.a(fed.I);
        this.h = $$3.b(a);
        this.g = $$3.b(b);
        this.i = $$3.b(c);
        fee $$4 = $$0.a(fed.J);
        this.k = $$4.b(a);
        this.j = $$4.b(b);
        this.l = $$4.b(c);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 19).a(1.0f, 0.0f, 1.0f, 14.0f, 10.0f, 14.0f), feg.a);
        $$1.a(b, fej.c().a(0, 0).a(1.0f, 0.0f, 0.0f, 14.0f, 5.0f, 14.0f), feg.a(0.0f, 9.0f, 1.0f));
        $$1.a(c, fej.c().a(0, 0).a(7.0f, -2.0f, 14.0f, 2.0f, 4.0f, 1.0f), feg.a(0.0f, 9.0f, 1.0f));
        return fek.a($$0, 64, 64);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 19).a(1.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f), feg.a);
        $$1.a(b, fej.c().a(0, 0).a(1.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f), feg.a(0.0f, 9.0f, 1.0f));
        $$1.a(c, fej.c().a(0, 0).a(15.0f, -2.0f, 14.0f, 1.0f, 4.0f, 1.0f), feg.a(0.0f, 9.0f, 1.0f));
        return fek.a($$0, 64, 64);
    }

    public static fek d() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(a, fej.c().a(0, 19).a(0.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f), feg.a);
        $$1.a(b, fej.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f), feg.a(0.0f, 9.0f, 1.0f));
        $$1.a(c, fej.c().a(0, 0).a(0.0f, -2.0f, 14.0f, 1.0f, 4.0f, 1.0f), feg.a(0.0f, 9.0f, 1.0f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(T $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        crq.c<czu> $$15;
        cmm $$6 = ((czn)$$0).k();
        boolean $$7 = $$6 != null;
        dcb $$8 = $$7 ? ((czn)$$0).q() : (dcb)cpo.cv.n().a(cqp.b, ha.d);
        dct $$9 = $$8.b(cqp.c) ? $$8.c(cqp.c) : dct.a;
        cpn $$10 = $$8.b();
        if (!($$10 instanceof cog)) {
            return;
        }
        cog $$11 = (cog)$$10;
        boolean $$12 = $$9 != dct.a;
        $$2.a();
        float $$13 = $$8.c(cqp.b).p();
        $$2.a(0.5f, 0.5f, 0.5f);
        $$2.a(a.d.rotationDegrees(-$$13));
        $$2.a(-0.5f, -0.5f, -0.5f);
        if ($$7) {
            crq.c<czu> $$14 = $$11.a($$8, $$6, ((czn)$$0).p(), true);
        } else {
            $$15 = crq.b::b;
        }
        float $$16 = $$15.apply(cqp.a((dap)$$0)).get($$1);
        $$16 = 1.0f - $$16;
        $$16 = 1.0f - $$16 * $$16 * $$16;
        int $$17 = ((Int2IntFunction)$$15.apply(new flx())).applyAsInt($$4);
        fwu $$18 = fkj.a($$0, $$9, this.m);
        ein $$19 = $$18.a($$3, fkf::c);
        if ($$12) {
            if ($$9 == dct.b) {
                this.a($$2, $$19, this.g, this.i, this.h, $$16, $$17, $$5);
            } else {
                this.a($$2, $$19, this.j, this.l, this.k, $$16, $$17, $$5);
            }
        } else {
            this.a($$2, $$19, this.d, this.f, this.e, $$16, $$17, $$5);
        }
        $$2.b();
    }

    private void a(eij $$0, ein $$1, fee $$2, fee $$3, fee $$4, float $$5, int $$6, int $$7) {
        $$3.e = $$2.e = -($$5 * 1.5707964f);
        $$2.a($$0, $$1, $$6, $$7);
        $$3.a($$0, $$1, $$6, $$7);
        $$4.a($$0, $$1, $$6, $$7);
    }
}

