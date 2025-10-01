/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzc
extends bzg {
    private static final Logger b = LogUtils.getLogger();
    private final apf c = apf.a();
    private boolean d;
    private int e;
    private static final int f = 10;
    private static final aby<Integer> g = acb.a(bzc.class, aca.b);
    private static final aby<Boolean> h = acb.a(bzc.class, aca.k);
    private int i;
    private int j;
    private int k;
    private int l;
    private float m;
    private boolean n = true;
    @Nullable
    private bfj o;
    private a p = a.a;
    private final int q;
    private final int r;

    private bzc(bfn<? extends bzc> $$0, cmm $$1, int $$2, int $$3) {
        super((bfn<? extends bzg>)$$0, $$1);
        this.as = true;
        this.q = Math.max(0, $$2);
        this.r = Math.max(0, $$3);
    }

    public bzc(bfn<? extends bzc> $$0, cmm $$1) {
        this($$0, $$1, 0, 0);
    }

    public bzc(byo $$0, cmm $$1, int $$2, int $$3) {
        this(bfn.bu, $$1, $$2, $$3);
        this.b((bfj)$$0);
        float $$4 = $$0.dA();
        float $$5 = $$0.dy();
        float $$6 = apa.b(-$$5 * ((float)Math.PI / 180) - (float)Math.PI);
        float $$7 = apa.a(-$$5 * ((float)Math.PI / 180) - (float)Math.PI);
        float $$8 = -apa.b(-$$4 * ((float)Math.PI / 180));
        float $$9 = apa.a(-$$4 * ((float)Math.PI / 180));
        double $$10 = $$0.dn() - (double)$$7 * 0.3;
        double $$11 = $$0.dr();
        double $$12 = $$0.dt() - (double)$$6 * 0.3;
        this.b($$10, $$11, $$12, $$5, $$4);
        eei $$13 = new eei(-$$7, apa.a(-($$9 / $$8), -5.0f, 5.0f), -$$6);
        double $$14 = $$13.f();
        $$13 = $$13.d(0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365));
        this.f($$13);
        this.a_((float)(apa.d($$13.c, $$13.e) * 57.2957763671875));
        this.b_((float)(apa.d($$13.d, $$13.h()) * 57.2957763671875));
        this.M = this.dy();
        this.N = this.dA();
    }

    @Override
    protected void a_() {
        this.aj().a(g, 0);
        this.aj().a(h, false);
    }

    @Override
    public void a(aby<?> $$0) {
        if (g.equals($$0)) {
            int $$1 = this.aj().b(g);
            bfj bfj2 = this.o = $$1 > 0 ? this.dI().a($$1 - 1) : null;
        }
        if (h.equals($$0)) {
            this.d = this.aj().b(h);
            if (this.d) {
                this.o(this.dl().c, -0.4f * apa.a(this.c, 0.6f, 1.0f), this.dl().e);
            }
        }
        super.a($$0);
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = 64.0;
        return $$0 < 4096.0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
    }

    @Override
    public void l() {
        boolean $$4;
        this.c.b(this.ct().getLeastSignificantBits() ^ this.dI().V());
        super.l();
        byo $$0 = this.k();
        if ($$0 == null) {
            this.ai();
            return;
        }
        if (!this.dI().B && this.a($$0)) {
            return;
        }
        if (this.ay()) {
            ++this.i;
            if (this.i >= 1200) {
                this.ai();
                return;
            }
        } else {
            this.i = 0;
        }
        float $$1 = 0.0f;
        gu $$2 = this.di();
        dxe $$3 = this.dI().b_($$2);
        if ($$3.a(anb.a)) {
            $$1 = $$3.a((cls)this.dI(), $$2);
        }
        boolean bl2 = $$4 = $$1 > 0.0f;
        if (this.p == a.a) {
            if (this.o != null) {
                this.f(eei.b);
                this.p = a.b;
                return;
            }
            if ($$4) {
                this.f(this.dl().d(0.3, 0.2, 0.3));
                this.p = a.c;
                return;
            }
            this.p();
        } else {
            if (this.p == a.b) {
                if (this.o != null) {
                    if (this.o.dD() || this.o.dI().ac() != this.dI().ac()) {
                        this.x(null);
                        this.p = a.a;
                    } else {
                        this.e(this.o.dn(), this.o.e(0.8), this.o.dt());
                    }
                }
                return;
            }
            if (this.p == a.c) {
                eei $$5 = this.dl();
                double $$6 = this.dp() + $$5.d - (double)$$2.v() - (double)$$1;
                if (Math.abs($$6) < 0.01) {
                    $$6 += Math.signum($$6) * 0.1;
                }
                this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.af.i() * 0.2, $$5.e * 0.9);
                this.n = this.j > 0 || this.l > 0 ? this.n && this.e < 10 && this.b($$2) : true;
                if ($$4) {
                    this.e = Math.max(0, this.e - 1);
                    if (this.d) {
                        this.f(this.dl().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                    }
                    if (!this.dI().B) {
                        this.a($$2);
                    }
                } else {
                    this.e = Math.min(10, this.e + 1);
                }
            }
        }
        if (!$$3.a(anb.a)) {
            this.f(this.dl().b(0.0, -0.03, 0.0));
        }
        this.a(bgf.a, this.dl());
        this.C();
        if (this.p == a.a && (this.ay() || this.O)) {
            this.f(eei.b);
        }
        double $$7 = 0.92;
        this.f(this.dl().a(0.92));
        this.an();
    }

    private boolean a(byo $$0) {
        cfz $$1 = $$0.eO();
        cfz $$2 = $$0.eP();
        boolean $$3 = $$1.a(cgc.qh);
        boolean $$4 = $$2.a(cgc.qh);
        if ($$0.dD() || !$$0.bs() || !$$3 && !$$4 || this.f($$0) > 1024.0) {
            this.ai();
            return true;
        }
        return false;
    }

    private void p() {
        eeg $$0 = bzh.a((bfj)this, this::a);
        this.a($$0);
    }

    @Override
    protected boolean a(bfj $$0) {
        return super.a($$0) || $$0.bs() && $$0 instanceof bvh;
    }

    @Override
    protected void a(eef $$0) {
        super.a($$0);
        if (!this.dI().B) {
            this.x($$0.a());
        }
    }

    @Override
    protected void a(eee $$0) {
        super.a($$0);
        this.f(this.dl().d().a($$0.a(this)));
    }

    private void x(@Nullable bfj $$0) {
        this.o = $$0;
        this.aj().b(g, $$0 == null ? 0 : $$0.af() + 1);
    }

    private void a(gu $$0) {
        aif $$1 = (aif)this.dI();
        int $$2 = 1;
        gu $$3 = $$0.c();
        if (this.af.i() < 0.25f && this.dI().q($$3)) {
            ++$$2;
        }
        if (this.af.i() < 0.5f && !this.dI().g($$3)) {
            --$$2;
        }
        if (this.j > 0) {
            --this.j;
            if (this.j <= 0) {
                this.k = 0;
                this.l = 0;
                this.aj().b(h, false);
            }
        } else if (this.l > 0) {
            this.l -= $$2;
            if (this.l > 0) {
                double $$9;
                double $$8;
                this.m += (float)this.af.a(0.0, 9.188);
                float $$4 = this.m * ((float)Math.PI / 180);
                float $$5 = apa.a($$4);
                float $$6 = apa.b($$4);
                double $$7 = this.dn() + (double)($$5 * (float)this.l * 0.1f);
                dcb $$10 = $$1.a_(gu.a($$7, ($$8 = (double)((float)apa.a(this.dp()) + 1.0f)) - 1.0, $$9 = this.dt() + (double)($$6 * (float)this.l * 0.1f)));
                if ($$10.a(cpo.G)) {
                    if (this.af.i() < 0.15f) {
                        $$1.a(iv.e, $$7, $$8 - (double)0.1f, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
                    }
                    float $$11 = $$5 * 0.04f;
                    float $$12 = $$6 * 0.04f;
                    $$1.a(iv.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
                    $$1.a(iv.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
                }
            } else {
                this.a(amh.hQ, 0.25f, 1.0f + (this.af.i() - this.af.i()) * 0.4f);
                double $$13 = this.dp() + 0.5;
                $$1.a(iv.e, this.dn(), $$13, this.dt(), (int)(1.0f + this.dd() * 20.0f), (double)this.dd(), 0.0, (double)this.dd(), 0.2f);
                $$1.a(iv.B, this.dn(), $$13, this.dt(), (int)(1.0f + this.dd() * 20.0f), (double)this.dd(), 0.0, (double)this.dd(), 0.2f);
                this.j = apa.a(this.af, 20, 40);
                this.aj().b(h, true);
            }
        } else if (this.k > 0) {
            this.k -= $$2;
            float $$14 = 0.15f;
            if (this.k < 20) {
                $$14 += (float)(20 - this.k) * 0.05f;
            } else if (this.k < 40) {
                $$14 += (float)(40 - this.k) * 0.02f;
            } else if (this.k < 60) {
                $$14 += (float)(60 - this.k) * 0.01f;
            }
            if (this.af.i() < $$14) {
                double $$19;
                double $$18;
                float $$15 = apa.a(this.af, 0.0f, 360.0f) * ((float)Math.PI / 180);
                float $$16 = apa.a(this.af, 25.0f, 60.0f);
                double $$17 = this.dn() + (double)(apa.a($$15) * $$16) * 0.1;
                dcb $$20 = $$1.a_(gu.a($$17, ($$18 = (double)((float)apa.a(this.dp()) + 1.0f)) - 1.0, $$19 = this.dt() + (double)(apa.b($$15) * $$16) * 0.1));
                if ($$20.a(cpo.G)) {
                    $$1.a(iv.ag, $$17, $$18, $$19, 2 + this.af.a(2), (double)0.1f, 0.0, (double)0.1f, 0.0);
                }
            }
            if (this.k <= 0) {
                this.m = apa.a(this.af, 0.0f, 360.0f);
                this.l = apa.a(this.af, 20, 80);
            }
        } else {
            this.k = apa.a(this.af, 100, 600);
            this.k -= this.r * 20 * 5;
        }
    }

    private boolean b(gu $$0) {
        b $$1 = bzc$b.c;
        for (int $$2 = -1; $$2 <= 2; ++$$2) {
            b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
            switch ($$3) {
                case c: {
                    return false;
                }
                case a: {
                    if ($$1 != bzc$b.c) break;
                    return false;
                }
                case b: {
                    if ($$1 != bzc$b.a) break;
                    return false;
                }
            }
            $$1 = $$3;
        }
        return true;
    }

    private b a(gu $$02, gu $$12) {
        return gu.b($$02, $$12).map(this::c).reduce(($$0, $$1) -> $$0 == $$1 ? $$0 : bzc$b.c).orElse(bzc$b.c);
    }

    private b c(gu $$0) {
        dcb $$1 = this.dI().a_($$0);
        if ($$1.i() || $$1.a(cpo.fm)) {
            return bzc$b.a;
        }
        dxe $$2 = $$1.u();
        if ($$2.a(anb.a) && $$2.b() && $$1.k(this.dI(), $$0).b()) {
            return bzc$b.b;
        }
        return bzc$b.c;
    }

    public boolean j() {
        return this.n;
    }

    @Override
    public void b(qr $$0) {
    }

    @Override
    public void a(qr $$0) {
    }

    public int a(cfz $$0) {
        byo $$1 = this.k();
        if (this.dI().B || $$1 == null || this.a($$1)) {
            return 0;
        }
        int $$2 = 0;
        if (this.o != null) {
            this.c(this.o);
            ai.D.a((aig)$$1, $$0, this, Collections.emptyList());
            this.dI().a((bfj)this, (byte)31);
            $$2 = this.o instanceof bvh ? 3 : 5;
        } else if (this.j > 0) {
            dzq $$3 = new dzq.a((aif)this.dI()).a(ebw.f, this.dg()).a(ebw.i, $$0).a(ebw.a, this).a((float)this.q + $$1.gj()).a(ebv.e);
            dzs $$4 = this.dI().n().aH().getLootTable(dzg.ai);
            ObjectArrayList<cfz> $$5 = $$4.a($$3);
            ai.D.a((aig)$$1, $$0, this, (Collection<cfz>)$$5);
            for (cfz $$6 : $$5) {
                bvh $$7 = new bvh(this.dI(), this.dn(), this.dp(), this.dt(), $$6);
                double $$8 = $$1.dn() - this.dn();
                double $$9 = $$1.dp() - this.dp();
                double $$10 = $$1.dt() - this.dt();
                double $$11 = 0.1;
                $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
                this.dI().b($$7);
                $$1.dI().b(new bfp($$1.dI(), $$1.dn(), $$1.dp() + 0.5, $$1.dt() + 0.5, this.af.a(6) + 1));
                if (!$$6.a(ane.ao)) continue;
                $$1.a(amr.R, 1);
            }
            $$2 = 1;
        }
        if (this.ay()) {
            $$2 = 2;
        }
        this.ai();
        return $$2;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 31 && this.dI().B && this.o instanceof byo && ((byo)this.o).g()) {
            this.c(this.o);
        }
        super.b($$0);
    }

    protected void c(bfj $$0) {
        bfj $$1 = this.v();
        if ($$1 == null) {
            return;
        }
        eei $$2 = new eei($$1.dn() - this.dn(), $$1.dp() - this.dp(), $$1.dt() - this.dt()).a(0.1);
        $$0.f($$0.dl().e($$2));
    }

    @Override
    protected bfj.b aS() {
        return bfj.b.a;
    }

    @Override
    public void a(bfj.c $$0) {
        this.a((bzc)null);
        super.a($$0);
    }

    @Override
    public void ak() {
        this.a((bzc)null);
    }

    @Override
    public void b(@Nullable bfj $$0) {
        super.b($$0);
        this.a(this);
    }

    private void a(@Nullable bzc $$0) {
        byo $$1 = this.k();
        if ($$1 != null) {
            $$1.cj = $$0;
        }
    }

    @Nullable
    public byo k() {
        bfj $$0 = this.v();
        return $$0 instanceof byo ? (byo)$$0 : null;
    }

    @Nullable
    public bfj o() {
        return this.o;
    }

    @Override
    public boolean cq() {
        return false;
    }

    @Override
    public uo<ur> S() {
        bfj $$0 = this.v();
        return new us(this, $$0 == null ? this.af() : $$0.af());
    }

    @Override
    public void a(us $$0) {
        super.a($$0);
        if (this.k() == null) {
            int $$1 = $$0.n();
            b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", (Object)this.dI().a($$1), (Object)$$1);
            this.ah();
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = bzc$a.a();
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = bzc$b.a();
        }
    }
}

