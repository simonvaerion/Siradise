/*
 * Decompiled with CFR 0.152.
 */
public class fxt
extends fxg {
    public fxt(amg $$0, ami $$1, float $$2, float $$3, apf $$4, gu $$5) {
        this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
    }

    public static fxt a(amg $$0, float $$1) {
        return fxt.a($$0, $$1, 0.25f);
    }

    public static fxt a(he<amg> $$0, float $$1) {
        return fxt.a($$0.a(), $$1);
    }

    public static fxt a(amg $$0, float $$1, float $$2) {
        return new fxt($$0.a(), ami.a, $$2, $$1, fxy.t(), false, 0, fxy.a.a, 0.0, 0.0, 0.0, true);
    }

    public static fxt a(amg $$0) {
        return new fxt($$0.a(), ami.b, 1.0f, 1.0f, fxy.t(), false, 0, fxy.a.a, 0.0, 0.0, 0.0, true);
    }

    public static fxt a(amg $$0, eei $$1) {
        return new fxt($$0, ami.c, 4.0f, 1.0f, fxy.t(), false, 0, fxy.a.b, $$1.c, $$1.d, $$1.e);
    }

    public static fxt b(amg $$0, float $$1, float $$2) {
        return new fxt($$0.a(), ami.i, $$2, $$1, fxy.t(), false, 0, fxy.a.a, 0.0, 0.0, 0.0, true);
    }

    public static fxt b(amg $$0) {
        return fxt.b($$0, 1.0f, 1.0f);
    }

    public static fxt a(amg $$0, apf $$1, double $$2, double $$3, double $$4) {
        return new fxt($$0, ami.i, 1.0f, 1.0f, $$1, false, 0, fxy.a.b, $$2, $$3, $$4);
    }

    public fxt(amg $$0, ami $$1, float $$2, float $$3, apf $$4, double $$5, double $$6, double $$7) {
        this($$0, $$1, $$2, $$3, $$4, false, 0, fxy.a.b, $$5, $$6, $$7);
    }

    private fxt(amg $$0, ami $$1, float $$2, float $$3, apf $$4, boolean $$5, int $$6, fxy.a $$7, double $$8, double $$9, double $$10) {
        this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
    }

    public fxt(acq $$0, ami $$1, float $$2, float $$3, apf $$4, boolean $$5, int $$6, fxy.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
        super($$0, $$1, $$4);
        this.d = $$2;
        this.e = $$3;
        this.f = $$8;
        this.g = $$9;
        this.h = $$10;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$11;
    }
}

