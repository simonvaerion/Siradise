/*
 * Decompiled with CFR 0.152.
 */
public class dwo {
    private static final int b = 16;
    public static final int a = Integer.MIN_VALUE;
    private final int c;
    private final ans d;
    private final gu.a e = new gu.a();
    private final gu.a f = new gu.a();

    public dwo(cmo $$0) {
        this.c = $$0.C_() - 1;
        int $$1 = $$0.aj();
        int $$2 = apa.e($$1 - this.c + 1);
        this.d = new apl($$2, 256);
    }

    public void a(ddx $$0) {
        int $$1 = $$0.a();
        if ($$1 == -1) {
            this.a(this.c);
            return;
        }
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            for (int $$3 = 0; $$3 < 16; ++$$3) {
                int $$4 = Math.max(this.a($$0, $$1, $$3, $$2), this.c);
                this.b(dwo.c($$3, $$2), $$4);
            }
        }
    }

    private int a(ddx $$0, int $$1, int $$2, int $$3) {
        int $$4 = hx.c($$0.g($$1) + 1);
        gu.a $$5 = this.e.d($$2, $$4, $$3);
        gu.a $$6 = this.f.a((hz)$$5, ha.a);
        dcb $$7 = cpo.a.n();
        for (int $$8 = $$1; $$8 >= 0; --$$8) {
            dej $$9 = $$0.b($$8);
            if ($$9.c()) {
                $$7 = cpo.a.n();
                int $$10 = $$0.g($$8);
                $$5.q(hx.c($$10));
                $$6.q($$5.v() - 1);
                continue;
            }
            for (int $$11 = 15; $$11 >= 0; --$$11) {
                dcb $$12 = $$9.a($$2, $$11, $$3);
                if (dwo.a($$0, $$5, $$7, $$6, $$12)) {
                    return $$5.v();
                }
                $$7 = $$12;
                $$5.g($$6);
                $$6.c(ha.a);
            }
        }
        return this.c;
    }

    public boolean a(cls $$0, int $$1, int $$2, int $$3) {
        dcb $$10;
        gu.a $$9;
        dcb $$8;
        int $$4 = $$2 + 1;
        int $$5 = dwo.c($$1, $$3);
        int $$6 = this.b($$5);
        if ($$4 < $$6) {
            return false;
        }
        gu.a $$7 = this.e.d($$1, $$2 + 1, $$3);
        if (this.a($$0, $$5, $$6, $$7, $$8 = $$0.a_($$7), $$9 = this.f.d($$1, $$2, $$3), $$10 = $$0.a_($$9))) {
            return true;
        }
        gu.a $$11 = this.e.d($$1, $$2 - 1, $$3);
        dcb $$12 = $$0.a_($$11);
        return this.a($$0, $$5, $$6, $$9, $$10, $$11, $$12);
    }

    private boolean a(cls $$0, int $$1, int $$2, gu $$3, dcb $$4, gu $$5, dcb $$6) {
        int $$7 = $$3.v();
        if (dwo.a($$0, $$3, $$4, $$5, $$6)) {
            if ($$7 > $$2) {
                this.b($$1, $$7);
                return true;
            }
        } else if ($$7 == $$2) {
            this.b($$1, this.a($$0, $$5, $$6));
            return true;
        }
        return false;
    }

    private int a(cls $$0, gu $$1, dcb $$2) {
        gu.a $$3 = this.e.g($$1);
        gu.a $$4 = this.f.a((hz)$$1, ha.a);
        dcb $$5 = $$2;
        while ($$4.v() >= this.c) {
            dcb $$6 = $$0.a_($$4);
            if (dwo.a($$0, $$3, $$5, $$4, $$6)) {
                return $$3.v();
            }
            $$5 = $$6;
            $$3.g($$4);
            $$4.c(ha.a);
        }
        return this.c;
    }

    private static boolean a(cls $$0, gu $$1, dcb $$2, gu $$3, dcb $$4) {
        if ($$4.b($$0, $$3) != 0) {
            return true;
        }
        efb $$5 = dwv.a($$0, $$1, $$2, ha.a);
        efb $$6 = dwv.a($$0, $$3, $$4, ha.b);
        return eey.b($$5, $$6);
    }

    public int a(int $$0, int $$1) {
        int $$2 = this.b(dwo.c($$0, $$1));
        return this.c($$2);
    }

    public int a() {
        int $$0 = Integer.MIN_VALUE;
        for (int $$1 = 0; $$1 < this.d.b(); ++$$1) {
            int $$2 = this.d.a($$1);
            if ($$2 <= $$0) continue;
            $$0 = $$2;
        }
        return this.c($$0 + this.c);
    }

    private void a(int $$0) {
        int $$1 = $$0 - this.c;
        for (int $$2 = 0; $$2 < this.d.b(); ++$$2) {
            this.d.b($$2, $$1);
        }
    }

    private void b(int $$0, int $$1) {
        this.d.b($$0, $$1 - this.c);
    }

    private int b(int $$0) {
        return this.d.a($$0) + this.c;
    }

    private int c(int $$0) {
        if ($$0 == this.c) {
            return Integer.MIN_VALUE;
        }
        return $$0;
    }

    private static int c(int $$0, int $$1) {
        return $$0 + $$1 * 16;
    }
}

