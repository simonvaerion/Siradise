/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public class cci
extends cbf {
    private static final int k = -1;
    private static final int l = 4;
    private static final int m = 31;
    private static final int n = 31;
    private static final int o = 40;
    private final cbq p;
    final cbv q = cbv.a();
    private List<he<cze>> r = List.of();
    Runnable s = () -> {};
    final ccx t;
    final ccx u;
    private final ccx v;
    private final ccx w;
    long x;
    private final bdq y = new bee(3){

        @Override
        public void e() {
            super.e();
            cci.this.a(this);
            cci.this.s.run();
        }
    };
    private final bdq z = new bee(1){

        @Override
        public void e() {
            super.e();
            cci.this.s.run();
        }
    };

    public cci(int $$0, byn $$1) {
        this($$0, $$1, cbq.a);
    }

    public cci(int $$0, byn $$1, final cbq $$2) {
        super(cck.r, $$0);
        this.p = $$2;
        this.t = this.a(new ccx(this.y, 0, 13, 26){

            @Override
            public boolean a(cfz $$0) {
                return $$0.d() instanceof cdp;
            }
        });
        this.u = this.a(new ccx(this.y, 1, 33, 26){

            @Override
            public boolean a(cfz $$0) {
                return $$0.d() instanceof ceo;
            }
        });
        this.v = this.a(new ccx(this.y, 2, 23, 45){

            @Override
            public boolean a(cfz $$0) {
                return $$0.d() instanceof cdq;
            }
        });
        this.w = this.a(new ccx(this.z, 0, 143, 58){

            @Override
            public boolean a(cfz $$0) {
                return false;
            }

            @Override
            public void a(byo $$02, cfz $$12) {
                cci.this.t.a(1);
                cci.this.u.a(1);
                if (!cci.this.t.f() || !cci.this.u.f()) {
                    cci.this.q.a(-1);
                }
                $$2.a((cmm $$0, gu $$1) -> {
                    long $$22 = $$0.V();
                    if (cci.this.x != $$22) {
                        $$0.a(null, (gu)$$1, amh.yq, ami.e, 1.0f, 1.0f);
                        cci.this.x = $$22;
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
        this.a(this.q);
    }

    @Override
    public boolean a(byo $$0) {
        return cci.a(this.p, $$0, cpo.nT);
    }

    @Override
    public boolean b(byo $$0, int $$1) {
        if ($$1 >= 0 && $$1 < this.r.size()) {
            this.q.a($$1);
            this.a(this.r.get($$1));
            return true;
        }
        return false;
    }

    private List<he<cze>> c(cfz $$0) {
        if ($$0.b()) {
            return (List)jb.al.b(amu.a).map(ImmutableList::copyOf).orElse(ImmutableList.of());
        }
        cfu cfu2 = $$0.d();
        if (cfu2 instanceof cdq) {
            cdq $$1 = (cdq)cfu2;
            return (List)jb.al.b($$1.b()).map(ImmutableList::copyOf).orElse(ImmutableList.of());
        }
        return List.of();
    }

    private boolean e(int $$0) {
        return $$0 >= 0 && $$0 < this.r.size();
    }

    @Override
    public void a(bdq $$0) {
        he<cze> $$12;
        cfz $$1 = this.t.e();
        cfz $$2 = this.u.e();
        cfz $$3 = this.v.e();
        if ($$1.b() || $$2.b()) {
            this.w.e(cfz.b);
            this.r = List.of();
            this.q.a(-1);
            return;
        }
        int $$4 = this.q.b();
        boolean $$5 = this.e($$4);
        List<he<cze>> $$6 = this.r;
        this.r = this.c($$3);
        if (this.r.size() == 1) {
            this.q.a(0);
            he<cze> $$7 = this.r.get(0);
        } else if (!$$5) {
            this.q.a(-1);
            Object $$8 = null;
        } else {
            he<cze> $$9 = $$6.get($$4);
            int $$10 = this.r.indexOf($$9);
            if ($$10 != -1) {
                he<cze> $$11 = $$9;
                this.q.a($$10);
            } else {
                $$12 = null;
                this.q.a(-1);
            }
        }
        if ($$12 != null) {
            boolean $$14;
            qr $$13 = cds.a($$1);
            boolean bl2 = $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
                this.q.a(-1);
                this.w.e(cfz.b);
            } else {
                this.a($$12);
            }
        } else {
            this.w.e(cfz.b);
        }
        this.d();
    }

    public List<he<cze>> l() {
        return this.r;
    }

    public int m() {
        return this.q.b();
    }

    public void a(Runnable $$0) {
        this.s = $$0;
    }

    @Override
    public cfz a(byo $$0, int $$1) {
        cfz $$2 = cfz.b;
        ccx $$3 = (ccx)this.i.get($$1);
        if ($$3 != null && $$3.f()) {
            cfz $$4 = $$3.e();
            $$2 = $$4.p();
            if ($$1 == this.w.e) {
                if (!this.a($$4, 4, 40, true)) {
                    return cfz.b;
                }
                $$3.a($$4, $$2);
            } else if ($$1 == this.u.e || $$1 == this.t.e || $$1 == this.v.e ? !this.a($$4, 4, 40, false) : ($$4.d() instanceof cdp ? !this.a($$4, this.t.e, this.t.e + 1, false) : ($$4.d() instanceof ceo ? !this.a($$4, this.u.e, this.u.e + 1, false) : ($$4.d() instanceof cdq ? !this.a($$4, this.v.e, this.v.e + 1, false) : ($$1 >= 4 && $$1 < 31 ? !this.a($$4, 31, 40, false) : $$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)))))) {
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

    @Override
    public void b(byo $$0) {
        super.b($$0);
        this.p.a((cmm $$1, gu $$2) -> this.a($$0, this.y));
    }

    private void a(he<cze> $$0) {
        cfz $$1 = this.t.e();
        cfz $$2 = this.u.e();
        cfz $$3 = cfz.b;
        if (!$$1.b() && !$$2.b()) {
            qx $$7;
            $$3 = $$1.c(1);
            cen $$4 = ((ceo)$$2.d()).d();
            qr $$5 = cds.a($$3);
            if ($$5 != null && $$5.b("Patterns", 9)) {
                qx $$6 = $$5.c("Patterns", 10);
            } else {
                $$7 = new qx();
                if ($$5 == null) {
                    $$5 = new qr();
                }
                $$5.a("Patterns", $$7);
            }
            qr $$8 = new qr();
            $$8.a("Pattern", $$0.a().a());
            $$8.a("Color", $$4.a());
            $$7.add($$8);
            cds.a($$3, czp.t, $$5);
        }
        if (!cfz.a($$3, this.w.e())) {
            this.w.e($$3);
        }
    }

    public ccx n() {
        return this.t;
    }

    public ccx o() {
        return this.u;
    }

    public ccx p() {
        return this.v;
    }

    public ccx q() {
        return this.w;
    }
}

