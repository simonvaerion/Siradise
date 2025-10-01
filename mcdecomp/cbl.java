/*
 * Decompiled with CFR 0.152.
 */
public class cbl
extends cbf {
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    private static final int o = 3;
    private static final int p = 30;
    private static final int q = 30;
    private static final int r = 39;
    private final cbq s;
    long t;
    public final bdq n = new bee(2){

        @Override
        public void e() {
            cbl.this.a(this);
            super.e();
        }
    };
    private final ccs u = new ccs(){

        @Override
        public void e() {
            cbl.this.a(this);
            super.e();
        }
    };

    public cbl(int $$0, byn $$1) {
        this($$0, $$1, cbq.a);
    }

    public cbl(int $$0, byn $$1, final cbq $$2) {
        super(cck.w, $$0);
        this.s = $$2;
        this.a(new ccx(this.n, 0, 15, 15){

            @Override
            public boolean a(cfz $$0) {
                return $$0.a(cgc.rf);
            }
        });
        this.a(new ccx(this.n, 1, 15, 52){

            @Override
            public boolean a(cfz $$0) {
                return $$0.a(cgc.qa) || $$0.a(cgc.tp) || $$0.a(cgc.fx);
            }
        });
        this.a(new ccx(this.u, 2, 145, 39){

            @Override
            public boolean a(cfz $$0) {
                return false;
            }

            @Override
            public void a(byo $$02, cfz $$12) {
                ((ccx)cbl.this.i.get(0)).a(1);
                ((ccx)cbl.this.i.get(1)).a(1);
                $$12.d().b($$12, $$02.dI(), $$02);
                $$2.a((cmm $$0, gu $$1) -> {
                    long $$22 = $$0.V();
                    if (cbl.this.t != $$22) {
                        $$0.a(null, (gu)$$1, amh.yr, ami.e, 1.0f, 1.0f);
                        cbl.this.t = $$22;
                    }
                });
                super.a($$02, $$12);
            }
        });
        for (int $$3 = 0; $$3 < 3; ++$$3) {
            for (int $$4 = 0; $$4 < 9; ++$$4) {
                this.a(new ccx($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
            }
        }
        for (int $$5 = 0; $$5 < 9; ++$$5) {
            this.a(new ccx($$1, $$5, 8 + $$5 * 18, 142));
        }
    }

    @Override
    public boolean a(byo $$0) {
        return cbl.a(this.s, $$0, cpo.nX);
    }

    @Override
    public void a(bdq $$0) {
        cfz $$1 = this.n.a(0);
        cfz $$2 = this.n.a(1);
        cfz $$3 = this.u.a(2);
        if (!$$3.b() && ($$1.b() || $$2.b())) {
            this.u.b(2);
        } else if (!$$1.b() && !$$2.b()) {
            this.a($$1, $$2, $$3);
        }
    }

    private void a(cfz $$0, cfz $$1, cfz $$2) {
        this.s.a((cmm $$3, gu $$4) -> {
            void $$9;
            dyo $$5 = cgg.a($$0, $$3);
            if ($$5 == null) {
                return;
            }
            if ($$1.a(cgc.qa) && !$$5.h && $$5.f < 4) {
                cfz $$6 = $$0.c(1);
                $$6.w().a("map_scale_direction", 1);
                this.d();
            } else if ($$1.a(cgc.fx) && !$$5.h) {
                cfz $$7 = $$0.c(1);
                $$7.w().a("map_to_lock", true);
                this.d();
            } else if ($$1.a(cgc.tp)) {
                cfz $$8 = $$0.c(2);
                this.d();
            } else {
                this.u.b(2);
                this.d();
                return;
            }
            if (!cfz.a((cfz)$$9, $$2)) {
                this.u.a(2, (cfz)$$9);
                this.d();
            }
        });
    }

    @Override
    public boolean a(cfz $$0, ccx $$1) {
        return $$1.d != this.u && super.a($$0, $$1);
    }

    @Override
    public cfz a(byo $$0, int $$1) {
        cfz $$2 = cfz.b;
        ccx $$3 = (ccx)this.i.get($$1);
        if ($$3 != null && $$3.f()) {
            cfz $$4 = $$3.e();
            $$2 = $$4.p();
            if ($$1 == 2) {
                $$4.d().b($$4, $$0.dI(), $$0);
                if (!this.a($$4, 3, 39, true)) {
                    return cfz.b;
                }
                $$3.a($$4, $$2);
            } else if ($$1 == 1 || $$1 == 0 ? !this.a($$4, 3, 39, false) : ($$4.a(cgc.rf) ? !this.a($$4, 0, 1, false) : ($$4.a(cgc.qa) || $$4.a(cgc.tp) || $$4.a(cgc.fx) ? !this.a($$4, 1, 2, false) : ($$1 >= 3 && $$1 < 30 ? !this.a($$4, 30, 39, false) : $$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false))))) {
                return cfz.b;
            }
            if ($$4.b()) {
                $$3.d(cfz.b);
            }
            $$3.d();
            if ($$4.L() == $$2.L()) {
                return cfz.b;
            }
            $$3.a($$0, $$4);
            this.d();
        }
        return $$2;
    }

    @Override
    public void b(byo $$0) {
        super.b($$0);
        this.u.b(2);
        this.s.a((cmm $$1, gu $$2) -> this.a($$0, this.n));
    }
}

