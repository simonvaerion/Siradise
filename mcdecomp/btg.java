/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class btg
extends brl {
    public static final bfk bT = bfk.b(0.9f, 1.3f).a(0.7f);
    private static final int ca = 2;
    private static final int cb = 1;
    protected static final ImmutableList<bqg<? extends bqf<? super btg>>> bU = ImmutableList.of(bqg.c, bqg.d, bqg.b, bqg.n, bqg.f, bqg.q);
    protected static final ImmutableList<bpb<?>> bW = ImmutableList.of(bpb.n, bpb.h, bpb.m, bpb.E, bpb.t, bpb.au, bpb.r, bpb.R, bpb.S, bpb.N, bpb.J, bpb.O, (Object[])new bpb[]{bpb.Q, bpb.U, bpb.V, bpb.Y});
    public static final int bX = 10;
    public static final double bY = 0.02;
    public static final double bZ = (double)0.1f;
    private static final aby<Boolean> cc = acb.a(btg.class, aca.k);
    private static final aby<Boolean> cd = acb.a(btg.class, aca.k);
    private static final aby<Boolean> ce = acb.a(btg.class, aca.k);
    private boolean cf;
    private int cg;

    public btg(bfn<? extends btg> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
        this.J().a(true);
        this.a(dxp.f, -1.0f);
        this.a(dxp.g, -1.0f);
    }

    public cfz q() {
        apf $$0 = apf.a(this.ct().hashCode());
        anl<cfr> $$1 = this.gi() ? and.b : and.a;
        hi.c<cfr> $$2 = jb.am.a($$1);
        return cfs.a(cgc.vi, $$2.a($$0).get());
    }

    protected bha.b<btg> dL() {
        return bha.a(bW, bU);
    }

    @Override
    protected bha<?> a(Dynamic<?> $$0) {
        return bth.a(this.dL().a($$0));
    }

    public static bhf.a r() {
        return bgb.y().a(bhg.a, 10.0).a(bhg.d, 0.2f).a(bhg.f, 2.0);
    }

    @Override
    protected void m() {
        if (this.h_()) {
            this.a(bhg.f).a(1.0);
            this.gh();
        } else {
            this.a(bhg.f).a(2.0);
            this.gg();
        }
    }

    @Override
    protected int d(float $$0, float $$1) {
        return super.d($$0, $$1) - 10;
    }

    @Override
    protected amg s() {
        if (this.gi()) {
            return amh.jN;
        }
        return amh.jD;
    }

    @Override
    protected amg d(ben $$0) {
        if (this.gi()) {
            return amh.jQ;
        }
        return amh.jG;
    }

    @Override
    protected amg g_() {
        if (this.gi()) {
            return amh.jO;
        }
        return amh.jE;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.jW, 0.15f, 1.0f);
    }

    protected amg w() {
        if (this.gi()) {
            return amh.jS;
        }
        return amh.jI;
    }

    @Nullable
    public btg b(aif $$0, bfe $$1) {
        btg $$2 = bfn.U.a($$0);
        if ($$2 != null) {
            bfe $$4;
            bth.a($$2, $$0.y_());
            bfe $$3 = $$0.y_().h() ? this : $$1;
            boolean $$5 = $$3 instanceof btg && ((btg)($$4 = $$3)).gi() || $$0.y_().j() < 0.02;
            $$2.w($$5);
        }
        return $$2;
    }

    public bha<btg> dK() {
        return super.dK();
    }

    @Override
    protected void W() {
        this.dI().ad().a("goatBrain");
        this.dK().a((aif)this.dI(), this);
        this.dI().ad().c();
        this.dI().ad().a("goatActivityUpdate");
        bth.a(this);
        this.dI().ad().c();
        super.W();
    }

    @Override
    public int fC() {
        return 15;
    }

    @Override
    public void n(float $$0) {
        int $$1 = this.fC();
        float $$2 = apa.c(this.aV, $$0);
        float $$3 = apa.a($$2, (float)(-$$1), (float)$$1);
        super.n(this.aV + $$3);
    }

    @Override
    public amg d(cfz $$0) {
        return this.gi() ? amh.jP : amh.jF;
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        if ($$2.a(cgc.pK) && !this.h_()) {
            $$0.a(this.w(), 1.0f, 1.0f);
            cfz $$3 = cgb.a($$2, $$0, cgc.pQ.ae_());
            $$0.a($$1, $$3);
            return bdx.a(this.dI().B);
        }
        bdx $$4 = super.b($$0, $$1);
        if ($$4.a() && this.m($$2)) {
            this.dI().a(null, this, this.d($$2), ami.g, 1.0f, apa.b(this.dI().z, 0.8f, 1.2f));
        }
        return $$4;
    }

    @Override
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        apf $$5 = $$0.y_();
        bth.a(this, $$5);
        this.w($$5.j() < 0.02);
        this.m();
        if (!this.h_() && (double)$$5.i() < (double)0.1f) {
            aby<Boolean> $$6 = $$5.h() ? cd : ce;
            this.am.b($$6, false);
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected void V() {
        super.V();
        za.a(this);
    }

    @Override
    public bfk a(bgl $$0) {
        return $$0 == bgl.g ? bT.a(this.dV()) : super.a($$0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("IsScreamingGoat", this.gi());
        $$0.a("HasLeftHorn", this.fY());
        $$0.a("HasRightHorn", this.ge());
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.w($$0.q("IsScreamingGoat"));
        this.am.b(cd, $$0.q("HasLeftHorn"));
        this.am.b(ce, $$0.q("HasRightHorn"));
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 58) {
            this.cf = true;
        } else if ($$0 == 59) {
            this.cf = false;
        } else {
            super.b($$0);
        }
    }

    @Override
    public void b_() {
        this.cg = this.cf ? ++this.cg : (this.cg -= 2);
        this.cg = apa.a(this.cg, 0, 20);
        super.b_();
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(cc, false);
        this.am.a(cd, true);
        this.am.a(ce, true);
    }

    public boolean fY() {
        return this.am.b(cd);
    }

    public boolean ge() {
        return this.am.b(ce);
    }

    public boolean gf() {
        aby<Boolean> $$4;
        boolean $$0 = this.fY();
        boolean $$1 = this.ge();
        if (!$$0 && !$$1) {
            return false;
        }
        if (!$$0) {
            aby<Boolean> $$2 = ce;
        } else if (!$$1) {
            aby<Boolean> $$3 = cd;
        } else {
            $$4 = this.af.h() ? cd : ce;
        }
        this.am.b($$4, false);
        eei $$5 = this.dg();
        cfz $$6 = this.q();
        double $$7 = apa.b(this.af, -0.2f, 0.2f);
        double $$8 = apa.b(this.af, 0.3f, 0.7f);
        double $$9 = apa.b(this.af, -0.2f, 0.2f);
        bvh $$10 = new bvh(this.dI(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
        this.dI().b($$10);
        return true;
    }

    public void gg() {
        this.am.b(cd, true);
        this.am.b(ce, true);
    }

    public void gh() {
        this.am.b(cd, false);
        this.am.b(ce, false);
    }

    public boolean gi() {
        return this.am.b(cc);
    }

    public void w(boolean $$0) {
        this.am.b(cc, $$0);
    }

    public float gj() {
        return (float)this.cg / 20.0f * 30.0f * ((float)Math.PI / 180);
    }

    public static boolean c(bfn<? extends brl> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$1.a_($$3.d()).a(amw.bP) && btg.a($$1, $$3);
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }
}

