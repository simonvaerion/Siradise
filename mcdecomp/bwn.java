/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bwn
extends bwc {
    private static final aby<Byte> b = acb.a(bwn.class, aca.a);
    private static final float c = 0.1f;

    public bwn(bfn<? extends bwn> $$0, cmm $$1) {
        super((bfn<? extends bwc>)$$0, $$1);
    }

    @Override
    protected void x() {
        this.bO.a(1, new bmp(this));
        this.bO.a(3, new bnb(this, 0.4f));
        this.bO.a(4, new a(this));
        this.bO.a(5, new boi(this, 0.8));
        this.bO.a(6, new bnd(this, byo.class, 8.0f));
        this.bO.a(6, new bnq(this));
        this.bP.a(1, new bon(this, new Class[0]));
        this.bP.a(2, new c<byo>(this, byo.class));
        this.bP.a(3, new c<brx>(this, brx.class));
    }

    @Override
    public double bx() {
        return this.de() * 0.5f;
    }

    @Override
    protected bpj b(cmm $$0) {
        return new bpk(this, $$0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(b, (byte)0);
    }

    @Override
    public void l() {
        super.l();
        if (!this.dI().B) {
            this.w(this.O);
        }
    }

    public static bhf.a r() {
        return bwc.ge().a(bhg.a, 16.0).a(bhg.d, 0.3f);
    }

    @Override
    protected amg s() {
        return amh.wY;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.xa;
    }

    @Override
    protected amg g_() {
        return amh.wZ;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.xb, 0.15f, 1.0f);
    }

    @Override
    public boolean i_() {
        return this.w();
    }

    @Override
    public void a(dcb $$0, eei $$1) {
        if (!$$0.a(cpo.bs)) {
            super.a($$0, $$1);
        }
    }

    @Override
    public bge eN() {
        return bge.c;
    }

    @Override
    public boolean c(bfa $$0) {
        if ($$0.c() == bfc.s) {
            return false;
        }
        return super.c($$0);
    }

    public boolean w() {
        return (this.am.b(b) & 1) != 0;
    }

    public void w(boolean $$0) {
        byte $$1 = this.am.b(b);
        $$1 = $$0 ? (byte)($$1 | 1) : (byte)($$1 & 0xFFFFFFFE);
        this.am.b(b, $$1);
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        bwk $$6;
        $$3 = super.a($$0, $$1, $$2, $$3, $$4);
        apf $$5 = $$0.y_();
        if ($$5.a(100) == 0 && ($$6 = bfn.aJ.a(this.dI())) != null) {
            $$6.b(this.dn(), this.dp(), this.dt(), this.dy(), 0.0f);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.k((bfj)this);
        }
        if ($$3 == null) {
            $$3 = new b();
            if ($$0.ai() == bdu.d && $$5.i() < 0.1f * $$1.d()) {
                ((b)$$3).a($$5);
            }
        }
        if ($$3 instanceof b) {
            b $$7 = (b)$$3;
            bey $$8 = $$7.a;
            if ($$8 != null) {
                this.b(new bfa($$8, -1));
            }
        }
        return $$3;
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 0.65f;
    }

    static class a
    extends bnf {
        public a(bwn $$0) {
            super($$0, 1.0, true);
        }

        @Override
        public boolean a() {
            return super.a() && !this.a.bN();
        }

        @Override
        public boolean b() {
            float $$0 = this.a.bj();
            if ($$0 >= 0.5f && this.a.ec().a(100) == 0) {
                this.a.h((bfz)null);
                return false;
            }
            return super.b();
        }

        @Override
        protected double a(bfz $$0) {
            return 4.0f + $$0.dd();
        }
    }

    static class c<T extends bfz>
    extends boo<T> {
        public c(bwn $$0, Class<T> $$1) {
            super((bgb)$$0, $$1, true);
        }

        @Override
        public boolean a() {
            float $$0 = this.e.bj();
            if ($$0 >= 0.5f) {
                return false;
            }
            return super.a();
        }
    }

    public static class b
    implements bgt {
        @Nullable
        public bey a;

        public void a(apf $$0) {
            int $$1 = $$0.a(5);
            if ($$1 <= 1) {
                this.a = bfc.a;
            } else if ($$1 <= 2) {
                this.a = bfc.e;
            } else if ($$1 <= 3) {
                this.a = bfc.j;
            } else if ($$1 <= 4) {
                this.a = bfc.n;
            }
        }
    }
}

