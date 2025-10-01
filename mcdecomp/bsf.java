/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bsf
extends brl
implements bgy<h> {
    public static final double bT = 0.6;
    public static final double bU = 0.8;
    public static final double bW = 1.0;
    public static final double bX = 2.2;
    public static final double bY = 1.4;
    private static final aby<Integer> cb = acb.a(bsf.class, aca.b);
    private static final acq cc = new acq("killer_bunny");
    public static final int bZ = 8;
    public static final int ca = 8;
    private static final int cd = 40;
    private int ce;
    private int cf;
    private boolean cg;
    private int ch;
    int ci;

    public bsf(bfn<? extends bsf> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
        this.bM = new d(this);
        this.bL = new e(this);
        this.i(0.0);
    }

    @Override
    protected void x() {
        this.bO.a(1, new bmp(this));
        this.bO.a(1, new bmk(this, this.dI()));
        this.bO.a(1, new f(this, 2.2));
        this.bO.a(2, new bmh(this, 0.8));
        this.bO.a(3, new bod(this, 1.0, ciz.a(cgc.tl, cgc.tq, cpo.bR), false));
        this.bO.a(4, new b<byo>(this, byo.class, 8.0f, 2.2, 2.2));
        this.bO.a(4, new b<bso>(this, bso.class, 10.0f, 2.2, 2.2));
        this.bO.a(4, new b<bwc>(this, bwc.class, 4.0f, 2.2, 2.2));
        this.bO.a(5, new g(this));
        this.bO.a(6, new boi(this, 0.6));
        this.bO.a(11, new bnd(this, byo.class, 10.0f));
    }

    @Override
    protected float eU() {
        dxt $$1;
        float $$0 = 0.3f;
        if (this.O || this.bL.b() && this.bL.e() > this.dp() + 0.5) {
            $$0 = 0.5f;
        }
        if (($$1 = this.bN.j()) != null && !$$1.c()) {
            eei $$2 = $$1.a(this);
            if ($$2.d > this.dp() + 0.5) {
                $$0 = 0.5f;
            }
        }
        if (this.bL.c() <= 0.6) {
            $$0 = 0.2f;
        }
        return $$0 + this.eV();
    }

    @Override
    protected void eW() {
        double $$1;
        super.eW();
        double $$0 = this.bL.c();
        if ($$0 > 0.0 && ($$1 = this.dl().i()) < 0.01) {
            this.a(0.1f, new eei(0.0, 0.0, 1.0));
        }
        if (!this.dI().B) {
            this.dI().a((bfj)this, (byte)1);
        }
    }

    public float D(float $$0) {
        if (this.cf == 0) {
            return 0.0f;
        }
        return ((float)this.ce + $$0) / (float)this.cf;
    }

    public void i(double $$0) {
        this.J().a($$0);
        this.bL.a(this.bL.d(), this.bL.e(), this.bL.f(), $$0);
    }

    @Override
    public void r(boolean $$0) {
        super.r($$0);
        if ($$0) {
            this.a(this.w(), this.eR(), ((this.af.i() - this.af.i()) * 0.2f + 1.0f) * 0.8f);
        }
    }

    public void q() {
        this.r(true);
        this.cf = 10;
        this.ce = 0;
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(cb, bsf$h.a.j);
    }

    @Override
    public void W() {
        if (this.ch > 0) {
            --this.ch;
        }
        if (this.ci > 0) {
            this.ci -= this.af.a(3);
            if (this.ci < 0) {
                this.ci = 0;
            }
        }
        if (this.ay()) {
            d $$1;
            bfz $$0;
            if (!this.cg) {
                this.r(false);
                this.gh();
            }
            if (this.fY() == bsf$h.g && this.ch == 0 && ($$0 = this.j()) != null && this.f((bfj)$$0) < 16.0) {
                this.c($$0.dn(), $$0.dt());
                this.bL.a($$0.dn(), $$0.dp(), $$0.dt(), this.bL.c());
                this.q();
                this.cg = true;
            }
            if (!($$1 = (d)this.bM).c()) {
                if (this.bL.b() && this.ch == 0) {
                    dxt $$2 = this.bN.j();
                    eei $$3 = new eei(this.bL.d(), this.bL.e(), this.bL.f());
                    if ($$2 != null && !$$2.c()) {
                        $$3 = $$2.a(this);
                    }
                    this.c($$3.c, $$3.e);
                    this.q();
                }
            } else if (!$$1.d()) {
                this.ge();
            }
        }
        this.cg = this.ay();
    }

    @Override
    public boolean bg() {
        return false;
    }

    private void c(double $$0, double $$1) {
        this.a_((float)(apa.d($$1 - this.dt(), $$0 - this.dn()) * 57.2957763671875) - 90.0f);
    }

    private void ge() {
        ((d)this.bM).a(true);
    }

    private void gf() {
        ((d)this.bM).a(false);
    }

    private void gg() {
        this.ch = this.bL.c() < 2.2 ? 10 : 1;
    }

    private void gh() {
        this.gg();
        this.gf();
    }

    @Override
    public void b_() {
        super.b_();
        if (this.ce != this.cf) {
            ++this.ce;
        } else if (this.cf != 0) {
            this.ce = 0;
            this.cf = 0;
            this.r(false);
        }
    }

    public static bhf.a r() {
        return bgb.y().a(bhg.a, 3.0).a(bhg.d, 0.3f);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("RabbitType", this.fY().j);
        $$0.a("MoreCarrotTicks", this.ci);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.a(bsf$h.a($$0.h("RabbitType")));
        this.ci = $$0.h("MoreCarrotTicks");
    }

    protected amg w() {
        return amh.to;
    }

    @Override
    protected amg s() {
        return amh.tk;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.tn;
    }

    @Override
    protected amg g_() {
        return amh.tm;
    }

    @Override
    public boolean z(bfj $$0) {
        if (this.fY() == bsf$h.g) {
            this.a(amh.tl, 1.0f, (this.af.i() - this.af.i()) * 0.2f + 1.0f);
            return $$0.a(this.dJ().b(this), 8.0f);
        }
        return $$0.a(this.dJ().b(this), 3.0f);
    }

    @Override
    public ami cY() {
        return this.fY() == bsf$h.g ? ami.f : ami.g;
    }

    private static boolean l(cfz $$0) {
        return $$0.a(cgc.tl) || $$0.a(cgc.tq) || $$0.a(cpo.bR.k());
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public bsf b(aif $$0, bfe $$1) {
        block2: {
            block3: {
                $$2 = bfn.aC.a($$0);
                if ($$2 == null) break block2;
                $$3 = bsf.a($$0, this.di());
                if (this.af.a(20) == 0) break block3;
                if (!($$1 instanceof bsf)) ** GOTO lbl-1000
                $$4 = (bsf)$$1;
                if (this.af.h()) {
                    $$3 = $$4.fY();
                } else lbl-1000:
                // 2 sources

                {
                    $$3 = this.fY();
                }
            }
            $$2.a($$3);
        }
        return $$2;
    }

    @Override
    public boolean m(cfz $$0) {
        return bsf.l($$0);
    }

    public h fY() {
        return bsf$h.a(this.am.b(cb));
    }

    @Override
    public void a(h $$0) {
        if ($$0 == bsf$h.g) {
            this.a(bhg.i).a(8.0);
            this.bO.a(4, new a(this));
            this.bP.a(1, new bon(this, new Class[0]).a(new Class[0]));
            this.bP.a(2, new boo<byo>((bgb)this, byo.class, true));
            this.bP.a(2, new boo<bso>((bgb)this, bso.class, true));
            if (!this.aa()) {
                this.b(sw.c(ac.a("entity", cc)));
            }
        }
        this.am.b(cb, $$0.j);
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        h $$5 = bsf.a($$0, this.di());
        if ($$3 instanceof c) {
            $$5 = ((c)$$3).a;
        } else {
            $$3 = new c($$5);
        }
        this.a($$5);
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    private static h a(cmn $$0, gu $$1) {
        he<cnk> $$2 = $$0.s($$1);
        int $$3 = $$0.y_().a(100);
        if ($$2.a(amv.ak)) {
            return $$3 < 80 ? bsf$h.b : bsf$h.d;
        }
        if ($$2.a(amv.aj)) {
            return bsf$h.e;
        }
        return $$3 < 50 ? bsf$h.a : ($$3 < 90 ? bsf$h.f : bsf$h.c);
    }

    public static boolean c(bfn<bsf> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$1.a_($$3.d()).a(amw.bT) && bsf.a($$1, $$3);
    }

    boolean gi() {
        return this.ci <= 0;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 1) {
            this.bh();
            this.cf = 10;
            this.ce = 0;
        } else {
            super.b($$0);
        }
    }

    @Override
    public eei cG() {
        return new eei(0.0, 0.6f * this.cF(), this.dd() * 0.4f);
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.fY();
    }

    public static class d
    extends blw {
        private final bsf b;
        private boolean c;

        public d(bsf $$0) {
            super($$0);
            this.b = $$0;
        }

        public boolean c() {
            return this.a;
        }

        public boolean d() {
            return this.c;
        }

        public void a(boolean $$0) {
            this.c = $$0;
        }

        @Override
        public void b() {
            if (this.a) {
                this.b.q();
                this.a = false;
            }
        }
    }

    static class e
    extends bly {
        private final bsf l;
        private double m;

        public e(bsf $$0) {
            super($$0);
            this.l = $$0;
        }

        @Override
        public void a() {
            if (this.l.ay() && !this.l.bk && !((d)this.l.bM).c()) {
                this.l.i(0.0);
            } else if (this.b()) {
                this.l.i(this.m);
            }
            super.a();
        }

        @Override
        public void a(double $$0, double $$1, double $$2, double $$3) {
            if (this.l.aV()) {
                $$3 = 1.5;
            }
            super.a($$0, $$1, $$2, $$3);
            if ($$3 > 0.0) {
                this.m = $$3;
            }
        }
    }

    static class f
    extends bno {
        private final bsf h;

        public f(bsf $$0, double $$1) {
            super($$0, $$1);
            this.h = $$0;
        }

        @Override
        public void e() {
            super.e();
            this.h.i(this.c);
        }
    }

    static class b<T extends bfz>
    extends bmc<T> {
        private final bsf i;

        public b(bsf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4);
            this.i = $$0;
        }

        @Override
        public boolean a() {
            return this.i.fY() != bsf$h.g && super.a();
        }
    }

    static class g
    extends bni {
        private final bsf g;
        private boolean h;
        private boolean i;

        public g(bsf $$0) {
            super($$0, 0.7f, 16);
            this.g = $$0;
        }

        @Override
        public boolean a() {
            if (this.c <= 0) {
                if (!this.g.dI().X().b(cmi.c)) {
                    return false;
                }
                this.i = false;
                this.h = this.g.gi();
            }
            return super.a();
        }

        @Override
        public boolean b() {
            return this.i && super.b();
        }

        @Override
        public void e() {
            super.e();
            this.g.E().a((double)this.e.u() + 0.5, this.e.v() + 1, (double)this.e.w() + 0.5, 10.0f, this.g.X());
            if (this.m()) {
                cmm $$0 = this.g.dI();
                gu $$1 = this.e.c();
                dcb $$2 = $$0.a_($$1);
                cpn $$3 = $$2.b();
                if (this.i && $$3 instanceof cqe) {
                    int $$4 = $$2.c(cqe.d);
                    if ($$4 == 0) {
                        $$0.a($$1, cpo.a.n(), 2);
                        $$0.a($$1, true, this.g);
                    } else {
                        $$0.a($$1, (dcb)$$2.a(cqe.d, $$4 - 1), 2);
                        $$0.c(2001, $$1, cpn.i($$2));
                    }
                    this.g.ci = 40;
                }
                this.i = false;
                this.c = 10;
            }
        }

        @Override
        protected boolean a(cmp $$0, gu $$1) {
            dcb $$2 = $$0.a_($$1);
            if ($$2.a(cpo.cC) && this.h && !this.i && ($$2 = $$0.a_($$1.c())).b() instanceof cqe && ((cqe)$$2.b()).h($$2)) {
                this.i = true;
                return true;
            }
            return false;
        }
    }

    public static final class h
    extends Enum<h>
    implements apr {
        public static final /* enum */ h a = new h(0, "brown");
        public static final /* enum */ h b = new h(1, "white");
        public static final /* enum */ h c = new h(2, "black");
        public static final /* enum */ h d = new h(3, "white_splotched");
        public static final /* enum */ h e = new h(4, "gold");
        public static final /* enum */ h f = new h(5, "salt");
        public static final /* enum */ h g = new h(99, "evil");
        private static final IntFunction<h> i;
        public static final Codec<h> h;
        final int j;
        private final String k;
        private static final /* synthetic */ h[] l;

        public static h[] values() {
            return (h[])l.clone();
        }

        public static h valueOf(String $$0) {
            return Enum.valueOf(h.class, $$0);
        }

        private h(int $$0, String $$1) {
            this.j = $$0;
            this.k = $$1;
        }

        @Override
        public String c() {
            return this.k;
        }

        public int a() {
            return this.j;
        }

        public static h a(int $$0) {
            return i.apply($$0);
        }

        private static /* synthetic */ h[] b() {
            return new h[]{a, b, c, d, e, f, g};
        }

        static {
            l = bsf$h.b();
            i = anu.a(h::a, bsf$h.values(), a);
            h = apr.a(h::values);
        }
    }

    static class a
    extends bnf {
        public a(bsf $$0) {
            super($$0, 1.4, true);
        }

        @Override
        protected double a(bfz $$0) {
            return 4.0f + $$0.dd();
        }
    }

    public static class c
    extends bfe.a {
        public final h a;

        public c(h $$0) {
            super(1.0f);
            this.a = $$0;
        }
    }
}

