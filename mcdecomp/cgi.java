/*
 * Decompiled with CFR 0.152.
 */
public class cgi
extends cfu {
    private static final ih a = new ig(){
        private final ig c = new ig();

        /*
         * WARNING - void declaration
         */
        @Override
        public cfz a(gv $$0, cfz $$1) {
            void $$16;
            ddf $$9;
            ha $$2 = $$0.e().c(cro.a);
            aif $$3 = $$0.g();
            double $$4 = $$0.a() + (double)$$2.j() * 1.125;
            double $$5 = Math.floor($$0.b()) + (double)$$2.k();
            double $$6 = $$0.c() + (double)$$2.l() * 1.125;
            gu $$7 = $$0.d().a($$2);
            dcb $$8 = $$3.a_($$7);
            ddf ddf2 = $$9 = $$8.b() instanceof cpd ? $$8.c(((cpd)$$8.b()).b()) : ddf.a;
            if ($$8.a(amw.N)) {
                if ($$9.b()) {
                    double $$10 = 0.6;
                } else {
                    double $$11 = 0.1;
                }
            } else if ($$8.i() && $$3.a_($$7.d()).a(amw.N)) {
                ddf $$13;
                dcb $$12 = $$3.a_($$7.d());
                ddf ddf3 = $$13 = $$12.b() instanceof cpd ? $$12.c(((cpd)$$12.b()).b()) : ddf.a;
                if ($$2 == ha.a || !$$13.b()) {
                    double $$14 = -0.9;
                } else {
                    double $$15 = -0.4;
                }
            } else {
                return this.c.dispense($$0, $$1);
            }
            caf $$17 = caf.a($$3, $$4, $$5 + $$16, $$6, ((cgi)$$1.d()).b);
            if ($$1.A()) {
                $$17.b($$1.y());
            }
            $$3.b($$17);
            $$1.h(1);
            return $$1;
        }

        @Override
        protected void a(gv $$0) {
            $$0.g().c(1000, $$0.d(), 0);
        }
    };
    final caf.a b;

    public cgi(caf.a $$0, cfu.a $$1) {
        super($$1);
        this.b = $$0;
        cro.a(this, a);
    }

    @Override
    public bdx a(cij $$0) {
        gu $$2;
        cmm $$1 = $$0.q();
        dcb $$3 = $$1.a_($$2 = $$0.a());
        if (!$$3.a(amw.N)) {
            return bdx.e;
        }
        cfz $$4 = $$0.n();
        if (!$$1.B) {
            ddf $$5 = $$3.b() instanceof cpd ? $$3.c(((cpd)$$3.b()).b()) : ddf.a;
            double $$6 = 0.0;
            if ($$5.b()) {
                $$6 = 0.5;
            }
            caf $$7 = caf.a($$1, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5, this.b);
            if ($$4.A()) {
                $$7.b($$4.y());
            }
            $$1.b($$7);
            $$1.a(dgl.t, $$2, dgl.a.a($$0.o(), $$1.a_($$2.d())));
        }
        $$4.h(1);
        return bdx.a($$1.B);
    }
}

