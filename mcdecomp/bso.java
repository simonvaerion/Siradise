/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bso
extends bgv
implements bgg {
    private static final aby<Boolean> bX = acb.a(bso.class, aca.k);
    private static final aby<Integer> bY = acb.a(bso.class, aca.b);
    private static final aby<Integer> bZ = acb.a(bso.class, aca.b);
    public static final Predicate<bfz> bW = $$0 -> {
        bfn<?> $$1 = $$0.ae();
        return $$1 == bfn.aF || $$1 == bfn.aC || $$1 == bfn.N;
    };
    private static final float ca = 8.0f;
    private static final float cb = 20.0f;
    private float cc;
    private float cd;
    private boolean ce;
    private boolean cf;
    private float cg;
    private float ch;
    private static final bdi ci = apw.a(20, 39);
    @Nullable
    private UUID cj;

    public bso(bfn<? extends bso> $$0, cmm $$1) {
        super((bfn<? extends bgv>)$$0, $$1);
        this.x(false);
        this.a(dxp.f, -1.0f);
        this.a(dxp.g, -1.0f);
    }

    @Override
    protected void x() {
        this.bO.a(1, new bmp(this));
        this.bO.a(1, new b(1.5));
        this.bO.a(2, new boa(this));
        this.bO.a(3, new a<btn>(this, btn.class, 24.0f, 1.5, 1.5));
        this.bO.a(4, new bnb(this, 0.4f));
        this.bO.a(5, new bnf(this, 1.0, true));
        this.bO.a(6, new bmt(this, 1.0, 10.0f, 2.0f, false));
        this.bO.a(7, new bmh(this, 1.0));
        this.bO.a(8, new boi(this, 1.0));
        this.bO.a(9, new bmd(this, 8.0f));
        this.bO.a(10, new bnd(this, byo.class, 8.0f));
        this.bO.a(10, new bnq(this));
        this.bP.a(1, new bos(this));
        this.bP.a(2, new bot(this));
        this.bP.a(3, new bon(this, new Class[0]).a(new Class[0]));
        this.bP.a(4, new boo<byo>(this, byo.class, 10, true, false, this::a_));
        this.bP.a(5, new bor<brl>(this, brl.class, false, bW));
        this.bP.a(6, new bor<bsm>(this, bsm.class, false, bsm.bU));
        this.bP.a(7, new boo<bvl>((bgb)this, bvl.class, false));
        this.bP.a(8, new bou<bso>(this, true));
    }

    public static bhf.a ge() {
        return bgb.y().a(bhg.d, 0.3f).a(bhg.a, 8.0).a(bhg.f, 2.0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bX, false);
        this.am.a(bY, cen.o.a());
        this.am.a(bZ, 0);
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.Ap, 0.15f, 1.0f);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("CollarColor", (byte)this.gh().a());
        this.c($$0);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        if ($$0.b("CollarColor", 99)) {
            this.a(cen.a($$0.h("CollarColor")));
        }
        this.a(this.dI(), $$0);
    }

    @Override
    protected amg s() {
        if (this.S_()) {
            return amh.Ak;
        }
        if (this.af.a(3) == 0) {
            if (this.q() && this.er() < 10.0f) {
                return amh.Aq;
            }
            return amh.An;
        }
        return amh.Ai;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.Am;
    }

    @Override
    protected amg g_() {
        return amh.Aj;
    }

    @Override
    protected float eR() {
        return 0.4f;
    }

    @Override
    public void b_() {
        super.b_();
        if (!this.dI().B && this.ce && !this.cf && !this.fV() && this.ay()) {
            this.cf = true;
            this.cg = 0.0f;
            this.ch = 0.0f;
            this.dI().a((bfj)this, (byte)8);
        }
        if (!this.dI().B) {
            this.a((aif)this.dI(), true);
        }
    }

    @Override
    public void l() {
        super.l();
        if (!this.bs()) {
            return;
        }
        this.cd = this.cc;
        this.cc = this.gi() ? (this.cc += (1.0f - this.cc) * 0.4f) : (this.cc += (0.0f - this.cc) * 0.4f);
        if (this.aX()) {
            this.ce = true;
            if (this.cf && !this.dI().B) {
                this.dI().a((bfj)this, (byte)56);
                this.gj();
            }
        } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0f) {
                this.a(amh.Ao, this.eR(), (this.af.i() - this.af.i()) * 0.2f + 1.0f);
                this.a(dgl.v);
            }
            this.ch = this.cg;
            this.cg += 0.05f;
            if (this.ch >= 2.0f) {
                this.ce = false;
                this.cf = false;
                this.ch = 0.0f;
                this.cg = 0.0f;
            }
            if (this.cg > 0.4f) {
                float $$0 = (float)this.dp();
                int $$1 = (int)(apa.a((this.cg - 0.4f) * (float)Math.PI) * 7.0f);
                eei $$2 = this.dl();
                for (int $$3 = 0; $$3 < $$1; ++$$3) {
                    float $$4 = (this.af.i() * 2.0f - 1.0f) * this.dd() * 0.5f;
                    float $$5 = (this.af.i() * 2.0f - 1.0f) * this.dd() * 0.5f;
                    this.dI().a(iv.ag, this.dn() + (double)$$4, (double)($$0 + 0.8f), this.dt() + (double)$$5, $$2.c, $$2.d, $$2.e);
                }
            }
        }
    }

    private void gj() {
        this.cf = false;
        this.cg = 0.0f;
        this.ch = 0.0f;
    }

    @Override
    public void a(ben $$0) {
        this.ce = false;
        this.cf = false;
        this.ch = 0.0f;
        this.cg = 0.0f;
        super.a($$0);
    }

    public boolean gf() {
        return this.ce;
    }

    public float D(float $$0) {
        return Math.min(0.5f + apa.i($$0, this.ch, this.cg) / 2.0f * 0.5f, 1.0f);
    }

    public float f(float $$0, float $$1) {
        float $$2 = (apa.i($$0, this.ch, this.cg) + $$1) / 1.8f;
        if ($$2 < 0.0f) {
            $$2 = 0.0f;
        } else if ($$2 > 1.0f) {
            $$2 = 1.0f;
        }
        return apa.a($$2 * (float)Math.PI) * apa.a($$2 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    public float E(float $$0) {
        return apa.i($$0, this.cd, this.cc) * 0.15f * (float)Math.PI;
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return $$1.b * 0.8f;
    }

    @Override
    public int X() {
        if (this.w()) {
            return 20;
        }
        return super.X();
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        if (this.b($$0)) {
            return false;
        }
        bfj $$2 = $$0.d();
        if (!this.dI().B) {
            this.z(false);
        }
        if ($$2 != null && !($$2 instanceof byo) && !($$2 instanceof byu)) {
            $$1 = ($$1 + 1.0f) / 2.0f;
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean z(bfj $$0) {
        boolean $$1 = $$0.a(this.dJ().b(this), (float)((int)this.b(bhg.f)));
        if ($$1) {
            this.a((bfz)this, $$0);
        }
        return $$1;
    }

    @Override
    public void x(boolean $$0) {
        super.x($$0);
        if ($$0) {
            this.a(bhg.a).a(20.0);
            this.t(20.0f);
        } else {
            this.a(bhg.a).a(8.0);
        }
        this.a(bhg.f).a(4.0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public bdx b(byo $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        cfu $$3 = $$2.d();
        if (this.dI().B) {
            boolean $$4 = this.l($$0) || this.q() || $$2.a(cgc.qL) && !this.q() && !this.S_();
            return $$4 ? bdx.b : bdx.d;
        }
        if (this.q()) {
            bdx $$7;
            if (this.m($$2) && this.er() < this.eI()) {
                if (!$$0.fO().d) {
                    $$2.h(1);
                }
                this.s((float)$$3.v().a());
                return bdx.a;
            }
            if ($$3 instanceof ceo) {
                ceo $$5 = (ceo)$$3;
                if (this.l($$0)) {
                    cen $$6 = $$5.d();
                    if ($$6 == this.gh()) return super.b($$0, $$1);
                    this.a($$6);
                    if ($$0.fO().d) return bdx.a;
                    $$2.h(1);
                    return bdx.a;
                }
            }
            if (($$7 = super.b($$0, $$1)).a() && !this.h_() || !this.l($$0)) return $$7;
            this.z(!this.fY());
            this.bk = false;
            this.bN.n();
            this.h((bfz)null);
            return bdx.a;
        }
        if (!$$2.a(cgc.qL) || this.S_()) return super.b($$0, $$1);
        if (!$$0.fO().d) {
            $$2.h(1);
        }
        if (this.af.a(3) == 0) {
            this.f($$0);
            this.bN.n();
            this.h((bfz)null);
            this.z(true);
            this.dI().a((bfj)this, (byte)7);
            return bdx.a;
        } else {
            this.dI().a((bfj)this, (byte)6);
        }
        return bdx.a;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 8) {
            this.cf = true;
            this.cg = 0.0f;
            this.ch = 0.0f;
        } else if ($$0 == 56) {
            this.gj();
        } else {
            super.b($$0);
        }
    }

    public float gg() {
        if (this.S_()) {
            return 1.5393804f;
        }
        if (this.q()) {
            return (0.55f - (this.eI() - this.er()) * 0.02f) * (float)Math.PI;
        }
        return 0.62831855f;
    }

    @Override
    public boolean m(cfz $$0) {
        cfu $$1 = $$0.d();
        return $$1.u() && $$1.v().c();
    }

    @Override
    public int fE() {
        return 8;
    }

    @Override
    public int a() {
        return this.am.b(bZ);
    }

    @Override
    public void a(int $$0) {
        this.am.b(bZ, $$0);
    }

    @Override
    public void c() {
        this.a(ci.a(this.af));
    }

    @Override
    @Nullable
    public UUID b() {
        return this.cj;
    }

    @Override
    public void a(@Nullable UUID $$0) {
        this.cj = $$0;
    }

    public cen gh() {
        return cen.a(this.am.b(bY));
    }

    public void a(cen $$0) {
        this.am.b(bY, $$0.a());
    }

    @Nullable
    public bso b(aif $$0, bfe $$1) {
        UUID $$3;
        bso $$2 = bfn.bn.a($$0);
        if ($$2 != null && ($$3 = this.U_()) != null) {
            $$2.b($$3);
            $$2.x(true);
        }
        return $$2;
    }

    public void A(boolean $$0) {
        this.am.b(bX, $$0);
    }

    @Override
    public boolean a(brl $$0) {
        if ($$0 == this) {
            return false;
        }
        if (!this.q()) {
            return false;
        }
        if (!($$0 instanceof bso)) {
            return false;
        }
        bso $$1 = (bso)$$0;
        if (!$$1.q()) {
            return false;
        }
        if ($$1.w()) {
            return false;
        }
        return this.gc() && $$1.gc();
    }

    public boolean gi() {
        return this.am.b(bX);
    }

    @Override
    public boolean a(bfz $$0, bfz $$1) {
        if ($$0 instanceof bvo || $$0 instanceof bvw) {
            return false;
        }
        if ($$0 instanceof bso) {
            bso $$2 = (bso)$$0;
            return !$$2.q() || $$2.I_() != $$1;
        }
        if ($$0 instanceof byo && $$1 instanceof byo && !((byo)$$1).a((byo)$$0)) {
            return false;
        }
        if ($$0 instanceof btk && ((btk)$$0).gn()) {
            return false;
        }
        return !($$0 instanceof bgv) || !((bgv)$$0).q();
    }

    @Override
    public boolean a(byo $$0) {
        return !this.S_() && super.a($$0);
    }

    @Override
    public eei cG() {
        return new eei(0.0, 0.6f * this.cF(), this.dd() * 0.4f);
    }

    public static boolean c(bfn<bso> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$1.a_($$3.d()).a(amw.bV) && bso.a($$1, $$3);
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }

    class b
    extends bno {
        public b(double $$0) {
            super(bso.this, $$0);
        }

        @Override
        protected boolean h() {
            return this.b.dx() || this.b.bL();
        }
    }

    class a<T extends bfz>
    extends bmc<T> {
        private final bso j;

        public a(bso $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4);
            this.j = $$0;
        }

        @Override
        public boolean a() {
            if (super.a() && this.b instanceof btn) {
                return !this.j.q() && this.a((btn)this.b);
            }
            return false;
        }

        private boolean a(btn $$0) {
            return $$0.gi() >= bso.this.af.a(5);
        }

        @Override
        public void c() {
            bso.this.h((bfz)null);
            super.c();
        }

        @Override
        public void e() {
            bso.this.h((bfz)null);
            super.e();
        }
    }
}

