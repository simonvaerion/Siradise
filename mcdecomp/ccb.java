/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.stream.Collectors;

public class ccb
extends cbf {
    public static final int k = 35;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    private static final int o = 3;
    private static final int p = 30;
    private static final int q = 30;
    private static final int r = 39;
    private final bdq s = new ccs();
    final bdq t = new bee(2){

        @Override
        public void e() {
            super.e();
            ccb.this.a(this);
        }
    };
    private final cbq u;

    public ccb(int $$0, byn $$1) {
        this($$0, $$1, cbq.a);
    }

    public ccb(int $$0, byn $$1, final cbq $$2) {
        super(cck.o, $$0);
        this.u = $$2;
        this.a(new ccx(this.t, 0, 49, 19){

            @Override
            public boolean a(cfz $$0) {
                return $$0.i() || $$0.a(cgc.tC) || $$0.E();
            }
        });
        this.a(new ccx(this.t, 1, 49, 40){

            @Override
            public boolean a(cfz $$0) {
                return $$0.i() || $$0.a(cgc.tC) || $$0.E();
            }
        });
        this.a(new ccx(this.s, 2, 129, 34){

            @Override
            public boolean a(cfz $$0) {
                return false;
            }

            @Override
            public void a(byo $$02, cfz $$12) {
                $$2.a((cmm $$0, gu $$1) -> {
                    if ($$0 instanceof aif) {
                        bfp.a((aif)$$0, eei.b($$1), this.a((cmm)$$0));
                    }
                    $$0.c(1042, (gu)$$1, 0);
                });
                ccb.this.t.a(0, cfz.b);
                ccb.this.t.a(1, cfz.b);
            }

            private int a(cmm $$0) {
                int $$1 = 0;
                $$1 += this.g(ccb.this.t.a(0));
                if (($$1 += this.g(ccb.this.t.a(1))) > 0) {
                    int $$22 = (int)Math.ceil((double)$$1 / 2.0);
                    return $$22 + $$0.z.a($$22);
                }
                return 0;
            }

            private int g(cfz $$0) {
                int $$1 = 0;
                Map<ckg, Integer> $$22 = cki.a($$0);
                for (Map.Entry<ckg, Integer> $$3 : $$22.entrySet()) {
                    ckg $$4 = $$3.getKey();
                    Integer $$5 = $$3.getValue();
                    if ($$4.c()) continue;
                    $$1 += $$4.a($$5);
                }
                return $$1;
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
    public void a(bdq $$0) {
        super.a($$0);
        if ($$0 == this.t) {
            this.l();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l() {
        boolean $$3;
        cfz $$0 = this.t.a(0);
        cfz $$1 = this.t.a(1);
        boolean $$2 = !$$0.b() || !$$1.b();
        boolean bl2 = $$3 = !$$0.b() && !$$1.b();
        if ($$2) {
            cfz $$14;
            int $$13;
            boolean $$4;
            boolean bl3 = $$4 = !$$0.b() && !$$0.a(cgc.tC) && !$$0.E() || !$$1.b() && !$$1.a(cgc.tC) && !$$1.E();
            if ($$0.L() > 1 || $$1.L() > 1 || !$$3 && $$4) {
                this.s.a(0, cfz.b);
                this.d();
                return;
            }
            int $$5 = 1;
            if ($$3) {
                if (!$$0.a($$1.d())) {
                    this.s.a(0, cfz.b);
                    this.d();
                    return;
                }
                cfu $$6 = $$0.d();
                int $$7 = $$6.n() - $$0.k();
                int $$8 = $$6.n() - $$1.k();
                int $$9 = $$7 + $$8 + $$6.n() * 5 / 100;
                int $$10 = Math.max($$6.n() - $$9, 0);
                cfz $$11 = this.a($$0, $$1);
                if (!$$11.i()) {
                    if (!cfz.a($$0, $$1)) {
                        this.s.a(0, cfz.b);
                        this.d();
                        return;
                    }
                    $$5 = 2;
                }
            } else {
                boolean $$12 = !$$0.b();
                $$13 = $$12 ? $$0.k() : $$1.k();
                $$14 = $$12 ? $$0 : $$1;
            }
            this.s.a(0, this.a($$14, $$13, $$5));
        } else {
            this.s.a(0, cfz.b);
        }
        this.d();
    }

    private cfz a(cfz $$0, cfz $$1) {
        cfz $$2 = $$0.p();
        Map<ckg, Integer> $$3 = cki.a($$1);
        for (Map.Entry<ckg, Integer> $$4 : $$3.entrySet()) {
            ckg $$5 = $$4.getKey();
            if ($$5.c() && cki.a($$5, $$2) != 0) continue;
            $$2.a($$5, $$4.getValue());
        }
        return $$2;
    }

    private cfz a(cfz $$02, int $$1, int $$2) {
        cfz $$3 = $$02.c($$2);
        $$3.c("Enchantments");
        $$3.c("StoredEnchantments");
        if ($$1 > 0) {
            $$3.b($$1);
        } else {
            $$3.c("Damage");
        }
        Map<ckg, Integer> $$4 = cki.a($$02).entrySet().stream().filter($$0 -> ((ckg)$$0.getKey()).c()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        cki.a($$4, $$3);
        $$3.d(0);
        if ($$3.a(cgc.tC) && $$4.size() == 0) {
            $$3 = new cfz(cgc.qb);
            if ($$02.A()) {
                $$3.a($$02.y());
            }
        }
        for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
            $$3.d(cbh.e($$3.I()));
        }
        return $$3;
    }

    @Override
    public void b(byo $$0) {
        super.b($$0);
        this.u.a((cmm $$1, gu $$2) -> this.a($$0, this.t));
    }

    @Override
    public boolean a(byo $$0) {
        return ccb.a(this.u, $$0, cpo.nZ);
    }

    @Override
    public cfz a(byo $$0, int $$1) {
        cfz $$2 = cfz.b;
        ccx $$3 = (ccx)this.i.get($$1);
        if ($$3 != null && $$3.f()) {
            cfz $$4 = $$3.e();
            $$2 = $$4.p();
            cfz $$5 = this.t.a(0);
            cfz $$6 = this.t.a(1);
            if ($$1 == 2) {
                if (!this.a($$4, 3, 39, true)) {
                    return cfz.b;
                }
                $$3.a($$4, $$2);
            } else if ($$1 == 0 || $$1 == 1 ? !this.a($$4, 3, 39, false) : ($$5.b() || $$6.b() ? !this.a($$4, 0, 2, false) : ($$1 >= 3 && $$1 < 30 ? !this.a($$4, 30, 39, false) : $$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)))) {
                return cfz.b;
            }
            if ($$4.b()) {
                $$3.d(cfz.b);
            } else {
                $$3.d();
            }
            if ($$4.L() == $$2.L()) {
                return cfz.b;
            }
            $$3.a($$0, $$4);
        }
        return $$2;
    }
}

