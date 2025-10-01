/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwj
extends bwc {
    @Nullable
    private b b;

    public bwj(bfn<? extends bwj> $$0, cmm $$1) {
        super((bfn<? extends bwc>)$$0, $$1);
    }

    @Override
    protected void x() {
        this.b = new b(this);
        this.bO.a(1, new bmp(this));
        this.bO.a(1, new bmk(this, this.dI()));
        this.bO.a(3, this.b);
        this.bO.a(4, new bnf(this, 1.0, false));
        this.bO.a(5, new a(this));
        this.bP.a(1, new bon(this, new Class[0]).a(new Class[0]));
        this.bP.a(2, new boo<byo>((bgb)this, byo.class, true));
    }

    @Override
    public double bw() {
        return 0.1;
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 0.13f;
    }

    public static bhf.a q() {
        return bwc.ge().a(bhg.a, 8.0).a(bhg.d, 0.25).a(bhg.f, 1.0);
    }

    @Override
    protected bfj.b aS() {
        return bfj.b.c;
    }

    @Override
    protected amg s() {
        return amh.vk;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.vm;
    }

    @Override
    protected amg g_() {
        return amh.vl;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.vn, 0.15f, 1.0f);
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        if (this.b($$0)) {
            return false;
        }
        if (($$0.d() != null || $$0.a(amy.x)) && this.b != null) {
            this.b.h();
        }
        return super.a($$0, $$1);
    }

    @Override
    public void l() {
        this.aV = this.dy();
        super.l();
    }

    @Override
    public void o(float $$0) {
        this.a_($$0);
        super.o($$0);
    }

    @Override
    public float a(gu $$0, cmp $$1) {
        if (ctj.h($$1.a_($$0.d()))) {
            return 10.0f;
        }
        return super.a($$0, $$1);
    }

    public static boolean b(bfn<bwj> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        if (bwj.c($$0, $$1, $$2, $$3, $$4)) {
            byo $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
            return $$5 == null;
        }
        return false;
    }

    @Override
    public bge eN() {
        return bge.c;
    }

    static class b
    extends bmv {
        private final bwj a;
        private int b;

        public b(bwj $$0) {
            this.a = $$0;
        }

        public void h() {
            if (this.b == 0) {
                this.b = this.a(20);
            }
        }

        @Override
        public boolean a() {
            return this.b > 0;
        }

        @Override
        public void e() {
            --this.b;
            if (this.b <= 0) {
                cmm $$0 = this.a.dI();
                apf $$1 = this.a.ec();
                gu $$2 = this.a.di();
                int $$3 = 0;
                block0: while ($$3 <= 5 && $$3 >= -5) {
                    int $$4 = 0;
                    while ($$4 <= 10 && $$4 >= -10) {
                        int $$5 = 0;
                        while ($$5 <= 10 && $$5 >= -10) {
                            gu $$6 = $$2.b($$4, $$3, $$5);
                            dcb $$7 = $$0.a_($$6);
                            cpn $$8 = $$7.b();
                            if ($$8 instanceof ctj) {
                                if ($$0.X().b(cmi.c)) {
                                    $$0.a($$6, true, this.a);
                                } else {
                                    $$0.a($$6, ((ctj)$$8).o($$0.a_($$6)), 3);
                                }
                                if ($$1.h()) break block0;
                            }
                            $$5 = ($$5 <= 0 ? 1 : 0) - $$5;
                        }
                        $$4 = ($$4 <= 0 ? 1 : 0) - $$4;
                    }
                    $$3 = ($$3 <= 0 ? 1 : 0) - $$3;
                }
            }
        }
    }

    static class a
    extends bns {
        @Nullable
        private ha i;
        private boolean j;

        public a(bwj $$0) {
            super($$0, 1.0, 10);
            this.a(EnumSet.of(bmv.a.a));
        }

        @Override
        public boolean a() {
            if (this.b.j() != null) {
                return false;
            }
            if (!this.b.J().l()) {
                return false;
            }
            apf $$0 = this.b.ec();
            if (this.b.dI().X().b(cmi.c) && $$0.a(a.b(10)) == 0) {
                this.i = ha.b($$0);
                gu $$1 = gu.a(this.b.dn(), this.b.dp() + 0.5, this.b.dt()).a(this.i);
                dcb $$2 = this.b.dI().a_($$1);
                if (ctj.h($$2)) {
                    this.j = true;
                    return true;
                }
            }
            this.j = false;
            return super.a();
        }

        @Override
        public boolean b() {
            if (this.j) {
                return false;
            }
            return super.b();
        }

        @Override
        public void c() {
            gu $$1;
            if (!this.j) {
                super.c();
                return;
            }
            cmm $$0 = this.b.dI();
            dcb $$2 = $$0.a_($$1 = gu.a(this.b.dn(), this.b.dp() + 0.5, this.b.dt()).a(this.i));
            if (ctj.h($$2)) {
                $$0.a($$1, ctj.n($$2), 3);
                this.b.O();
                this.b.ai();
            }
        }
    }
}

