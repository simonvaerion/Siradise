/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bgb
extends bfz
implements bgw {
    private static final aby<Byte> b = acb.a(bgb.class, aca.a);
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 4;
    protected static final int f = 1;
    private static final hz bS = new hz(1, 0, 1);
    public static final float g = 0.15f;
    public static final float bB = 0.55f;
    public static final float bC = 0.5f;
    public static final float bD = 0.25f;
    public static final String bE = "Leash";
    public static final float bF = 0.085f;
    public static final int bG = 2;
    public static final int bH = 2;
    public int bI;
    protected int bJ;
    protected blx bK;
    protected bly bL;
    protected blw bM;
    private final blt bT;
    protected bpj bN;
    protected final bmw bO;
    protected final bmw bP;
    @Nullable
    private bfz bU;
    private final bqe bV;
    private final hn<cfz> bW = hn.a(2, cfz.b);
    protected final float[] bQ = new float[2];
    private final hn<cfz> bX = hn.a(4, cfz.b);
    protected final float[] bR = new float[4];
    private boolean bY;
    private boolean bZ;
    private final Map<dxp, Float> ca = Maps.newEnumMap(dxp.class);
    @Nullable
    private acq cb;
    private long cc;
    @Nullable
    private bfj cd;
    private int ce;
    @Nullable
    private qr cf;
    private gu cg = gu.b;
    private float ch = -1.0f;

    protected bgb(bfn<? extends bgb> $$0, cmm $$1) {
        super((bfn<? extends bfz>)$$0, $$1);
        this.bO = new bmw($$1.ae());
        this.bP = new bmw($$1.ae());
        this.bK = new blx(this);
        this.bL = new bly(this);
        this.bM = new blw(this);
        this.bT = this.D();
        this.bN = this.b($$1);
        this.bV = new bqe(this);
        Arrays.fill(this.bR, 0.085f);
        Arrays.fill(this.bQ, 0.085f);
        if ($$1 != null && !$$1.B) {
            this.x();
        }
    }

    protected void x() {
    }

    public static bhf.a y() {
        return bfz.dM().a(bhg.b, 16.0).a(bhg.g);
    }

    protected bpj b(cmm $$0) {
        return new bpi(this, $$0);
    }

    protected boolean z() {
        return false;
    }

    public float a(dxp $$0) {
        bgb $$3;
        bgb $$1;
        bfj bfj2 = this.cX();
        if (bfj2 instanceof bgb && ($$1 = (bgb)bfj2).z()) {
            bgb $$2 = $$1;
        } else {
            $$3 = this;
        }
        Float $$4 = $$3.ca.get((Object)$$0);
        return $$4 == null ? $$0.a() : $$4.floatValue();
    }

    public void a(dxp $$0, float $$1) {
        this.ca.put($$0, Float.valueOf($$1));
    }

    public void A() {
    }

    public void C() {
    }

    protected blt D() {
        return new blt(this);
    }

    public blx E() {
        return this.bK;
    }

    public bly G() {
        bfj bfj2 = this.cX();
        if (bfj2 instanceof bgb) {
            bgb $$0 = (bgb)bfj2;
            return $$0.G();
        }
        return this.bL;
    }

    public blw I() {
        return this.bM;
    }

    public bpj J() {
        bfj bfj2 = this.cX();
        if (bfj2 instanceof bgb) {
            bgb $$0 = (bgb)bfj2;
            return $$0.J();
        }
        return this.bN;
    }

    @Override
    @Nullable
    public bfz cL() {
        bgb $$0;
        bfj bfj2;
        return !this.fQ() && (bfj2 = this.cO()) instanceof bgb ? ($$0 = (bgb)bfj2) : null;
    }

    public bqe K() {
        return this.bV;
    }

    @Override
    @Nullable
    public bfz j() {
        return this.bU;
    }

    public void h(@Nullable bfz $$0) {
        this.bU = $$0;
    }

    @Override
    public boolean a(bfn<?> $$0) {
        return $$0 != bfn.Q;
    }

    public boolean a(cgp $$0) {
        return false;
    }

    public void L() {
        this.a(dgl.m);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(b, (byte)0);
    }

    public int M() {
        return 80;
    }

    public void N() {
        amg $$0 = this.s();
        if ($$0 != null) {
            this.a($$0, this.eR(), this.eS());
        }
    }

    @Override
    public void ao() {
        super.ao();
        this.dI().ad().a("mobBaseTick");
        if (this.bs() && this.af.a(1000) < this.bI++) {
            this.q();
            this.N();
        }
        this.dI().ad().c();
    }

    @Override
    protected void e(ben $$0) {
        this.q();
        super.e($$0);
    }

    private void q() {
        this.bI = -this.M();
    }

    @Override
    public int ea() {
        if (this.bJ > 0) {
            int $$0 = this.bJ;
            for (int $$1 = 0; $$1 < this.bX.size(); ++$$1) {
                if (this.bX.get($$1).b() || !(this.bR[$$1] <= 1.0f)) continue;
                $$0 += 1 + this.af.a(3);
            }
            for (int $$2 = 0; $$2 < this.bW.size(); ++$$2) {
                if (this.bW.get($$2).b() || !(this.bQ[$$2] <= 1.0f)) continue;
                $$0 += 1 + this.af.a(3);
            }
            return $$0;
        }
        return this.bJ;
    }

    public void O() {
        if (this.dI().B) {
            for (int $$0 = 0; $$0 < 20; ++$$0) {
                double $$1 = this.af.k() * 0.02;
                double $$2 = this.af.k() * 0.02;
                double $$3 = this.af.k() * 0.02;
                double $$4 = 10.0;
                this.dI().a(iv.W, this.c(1.0) - $$1 * 10.0, this.dq() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
            }
        } else {
            this.dI().a((bfj)this, (byte)20);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 20) {
            this.O();
        } else {
            super.b($$0);
        }
    }

    @Override
    public void l() {
        super.l();
        if (!this.dI().B) {
            this.fN();
            if (this.ag % 5 == 0) {
                this.P();
            }
        }
    }

    protected void P() {
        boolean $$0 = !(this.cL() instanceof bgb);
        boolean $$1 = !(this.cW() instanceof cah);
        this.bO.a(bmv.a.a, $$0);
        this.bO.a(bmv.a.c, $$0 && $$1);
        this.bO.a(bmv.a.b, $$0);
    }

    @Override
    protected float e(float $$0, float $$1) {
        this.bT.a();
        return $$1;
    }

    @Nullable
    protected amg s() {
        return null;
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("CanPickUpLoot", this.fG());
        $$0.a("PersistenceRequired", this.bZ);
        qx $$1 = new qx();
        for (cfz cfz2 : this.bX) {
            qr qr2 = new qr();
            if (!cfz2.b()) {
                cfz2.b(qr2);
            }
            $$1.add(qr2);
        }
        $$0.a("ArmorItems", $$1);
        qx $$4 = new qx();
        for (cfz cfz3 : this.bW) {
            qr $$6 = new qr();
            if (!cfz3.b()) {
                cfz3.b($$6);
            }
            $$4.add($$6);
        }
        $$0.a("HandItems", $$4);
        qx qx2 = new qx();
        for (float $$8 : this.bR) {
            qx2.add(qu.a($$8));
        }
        $$0.a("ArmorDropChances", qx2);
        qx qx3 = new qx();
        for (float $$10 : this.bQ) {
            qx3.add(qu.a($$10));
        }
        $$0.a("HandDropChances", qx3);
        if (this.cd != null) {
            qr $$11 = new qr();
            if (this.cd instanceof bfz) {
                UUID $$12 = this.cd.ct();
                $$11.a("UUID", $$12);
            } else if (this.cd instanceof buz) {
                gu $$13 = ((buz)this.cd).y();
                $$11.a("X", $$13.u());
                $$11.a("Y", $$13.v());
                $$11.a("Z", $$13.w());
            }
            $$0.a(bE, $$11);
        } else if (this.cf != null) {
            $$0.a(bE, this.cf.h());
        }
        $$0.a("LeftHanded", this.fR());
        if (this.cb != null) {
            $$0.a("DeathLootTable", this.cb.toString());
            if (this.cc != 0L) {
                $$0.a("DeathLootTableSeed", this.cc);
            }
        }
        if (this.fQ()) {
            $$0.a("NoAI", this.fQ());
        }
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        if ($$0.b("CanPickUpLoot", 1)) {
            this.s($$0.q("CanPickUpLoot"));
        }
        this.bZ = $$0.q("PersistenceRequired");
        if ($$0.b("ArmorItems", 9)) {
            qx $$1 = $$0.c("ArmorItems", 10);
            for (int $$2 = 0; $$2 < this.bX.size(); ++$$2) {
                this.bX.set($$2, cfz.a($$1.a($$2)));
            }
        }
        if ($$0.b("HandItems", 9)) {
            qx $$3 = $$0.c("HandItems", 10);
            for (int $$4 = 0; $$4 < this.bW.size(); ++$$4) {
                this.bW.set($$4, cfz.a($$3.a($$4)));
            }
        }
        if ($$0.b("ArmorDropChances", 9)) {
            qx $$5 = $$0.c("ArmorDropChances", 5);
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                this.bR[$$6] = $$5.i($$6);
            }
        }
        if ($$0.b("HandDropChances", 9)) {
            qx $$7 = $$0.c("HandDropChances", 5);
            for (int $$8 = 0; $$8 < $$7.size(); ++$$8) {
                this.bQ[$$8] = $$7.i($$8);
            }
        }
        if ($$0.b(bE, 10)) {
            this.cf = $$0.p(bE);
        }
        this.u($$0.q("LeftHanded"));
        if ($$0.b("DeathLootTable", 8)) {
            this.cb = new acq($$0.l("DeathLootTable"));
            this.cc = $$0.i("DeathLootTableSeed");
        }
        this.t($$0.q("NoAI"));
    }

    @Override
    protected void a(ben $$0, boolean $$1) {
        super.a($$0, $$1);
        this.cb = null;
    }

    @Override
    public final acq ew() {
        return this.cb == null ? this.Q() : this.cb;
    }

    protected acq Q() {
        return super.ew();
    }

    @Override
    public long ex() {
        return this.cc;
    }

    public void z(float $$0) {
        this.bn = $$0;
    }

    public void A(float $$0) {
        this.bm = $$0;
    }

    public void B(float $$0) {
        this.bl = $$0;
    }

    @Override
    public void w(float $$0) {
        super.w($$0);
        this.z($$0);
    }

    @Override
    public void b_() {
        super.b_();
        this.dI().ad().a("looting");
        if (!this.dI().B && this.fG() && this.bs() && !this.bb && this.dI().X().b(cmi.c)) {
            hz $$0 = this.R();
            List<bvh> $$1 = this.dI().a(bvh.class, this.cE().c($$0.u(), $$0.v(), $$0.w()));
            for (bvh $$2 : $$1) {
                if ($$2.dD() || $$2.j().b() || $$2.r() || !this.k($$2.j())) continue;
                this.b($$2);
            }
        }
        this.dI().ad().c();
    }

    protected hz R() {
        return bS;
    }

    protected void b(bvh $$0) {
        cfz $$1 = $$0.j();
        cfz $$2 = this.i($$1.p());
        if (!$$2.b()) {
            this.a($$0);
            this.a((bfj)$$0, $$2.L());
            $$1.h($$2.L());
            if ($$1.b()) {
                $$0.ai();
            }
        }
    }

    public cfz i(cfz $$0) {
        bfo $$1 = bgb.h($$0);
        cfz $$2 = this.c($$1);
        boolean $$3 = this.b($$0, $$2);
        if ($$1.e() && !$$3) {
            $$1 = bfo.a;
            $$2 = this.c($$1);
            $$3 = $$2.b();
        }
        if ($$3 && this.j($$0)) {
            double $$4 = this.f($$1);
            if (!$$2.b() && (double)Math.max(this.af.i() - 0.1f, 0.0f) < $$4) {
                this.b($$2);
            }
            if ($$1.e() && $$0.L() > 1) {
                cfz $$5 = $$0.c(1);
                this.b($$1, $$5);
                return $$5;
            }
            this.b($$1, $$0);
            return $$0;
        }
        return cfz.b;
    }

    protected void b(bfo $$0, cfz $$1) {
        this.a($$0, $$1);
        this.e($$0);
        this.bZ = true;
    }

    public void e(bfo $$0) {
        switch ($$0.a()) {
            case a: {
                this.bQ[$$0.b()] = 2.0f;
                break;
            }
            case b: {
                this.bR[$$0.b()] = 2.0f;
            }
        }
    }

    protected boolean b(cfz $$0, cfz $$1) {
        if ($$1.b()) {
            return true;
        }
        if ($$0.d() instanceof chk) {
            if (!($$1.d() instanceof chk)) {
                return true;
            }
            chk $$2 = (chk)$$0.d();
            chk $$3 = (chk)$$1.d();
            if ($$2.h() != $$3.h()) {
                return $$2.h() > $$3.h();
            }
            return this.c($$0, $$1);
        }
        if ($$0.d() instanceof cdx && $$1.d() instanceof cdx) {
            return this.c($$0, $$1);
        }
        if ($$0.d() instanceof ceh && $$1.d() instanceof ceh) {
            return this.c($$0, $$1);
        }
        if ($$0.d() instanceof cdj) {
            if (cki.d($$1)) {
                return false;
            }
            if (!($$1.d() instanceof cdj)) {
                return true;
            }
            cdj $$4 = (cdj)$$0.d();
            cdj $$5 = (cdj)$$1.d();
            if ($$4.e() != $$5.e()) {
                return $$4.e() > $$5.e();
            }
            if ($$4.f() != $$5.f()) {
                return $$4.f() > $$5.f();
            }
            return this.c($$0, $$1);
        }
        if ($$0.d() instanceof cej) {
            if ($$1.d() instanceof cds) {
                return true;
            }
            if ($$1.d() instanceof cej) {
                cej $$6 = (cej)$$0.d();
                cej $$7 = (cej)$$1.d();
                if ($$6.d() != $$7.d()) {
                    return $$6.d() > $$7.d();
                }
                return this.c($$0, $$1);
            }
        }
        return false;
    }

    public boolean c(cfz $$02, cfz $$1) {
        if ($$02.k() < $$1.k() || $$02.u() && !$$1.u()) {
            return true;
        }
        if ($$02.u() && $$1.u()) {
            return $$02.v().e().stream().anyMatch($$0 -> !$$0.equals("Damage")) && !$$1.v().e().stream().anyMatch($$0 -> !$$0.equals("Damage"));
        }
        return false;
    }

    public boolean j(cfz $$0) {
        return true;
    }

    public boolean k(cfz $$0) {
        return this.j($$0);
    }

    public boolean h(double $$0) {
        return true;
    }

    public boolean T() {
        return this.bM();
    }

    protected boolean U() {
        return false;
    }

    @Override
    public void du() {
        if (this.dI().ai() == bdu.a && this.U()) {
            this.ai();
            return;
        }
        if (this.fH() || this.T()) {
            this.bc = 0;
            return;
        }
        byo $$0 = this.dI().a((bfj)this, -1.0);
        if ($$0 != null) {
            int $$2;
            int $$3;
            double $$1 = $$0.f((bfj)this);
            if ($$1 > (double)($$3 = ($$2 = this.ae().f().f()) * $$2) && this.h($$1)) {
                this.ai();
            }
            int $$4 = this.ae().f().g();
            int $$5 = $$4 * $$4;
            if (this.bc > 600 && this.af.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
                this.ai();
            } else if ($$1 < (double)$$5) {
                this.bc = 0;
            }
        }
    }

    @Override
    protected final void fc() {
        ++this.bc;
        this.dI().ad().a("sensing");
        this.bV.a();
        this.dI().ad().c();
        int $$0 = this.dI().n().ag() + this.af();
        if ($$0 % 2 == 0 || this.ag <= 1) {
            this.dI().ad().a("targetSelector");
            this.bP.a();
            this.dI().ad().c();
            this.dI().ad().a("goalSelector");
            this.bO.a();
            this.dI().ad().c();
        } else {
            this.dI().ad().a("targetSelector");
            this.bP.a(false);
            this.dI().ad().c();
            this.dI().ad().a("goalSelector");
            this.bO.a(false);
            this.dI().ad().c();
        }
        this.dI().ad().a("navigation");
        this.bN.c();
        this.dI().ad().c();
        this.dI().ad().a("mob tick");
        this.W();
        this.dI().ad().c();
        this.dI().ad().a("controls");
        this.dI().ad().a("move");
        this.bL.a();
        this.dI().ad().b("look");
        this.bK.a();
        this.dI().ad().b("jump");
        this.bM.b();
        this.dI().ad().c();
        this.dI().ad().c();
        this.V();
    }

    protected void V() {
        za.a(this.dI(), this, this.bO);
    }

    protected void W() {
    }

    public int X() {
        return 40;
    }

    public int fC() {
        return 75;
    }

    public int fD() {
        return 10;
    }

    public void a(bfj $$0, float $$1, float $$2) {
        double $$7;
        double $$3 = $$0.dn() - this.dn();
        double $$4 = $$0.dt() - this.dt();
        if ($$0 instanceof bfz) {
            bfz $$5 = (bfz)$$0;
            double $$6 = $$5.dr() - this.dr();
        } else {
            $$7 = ($$0.cE().b + $$0.cE().e) / 2.0 - this.dr();
        }
        double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
        float $$9 = (float)(apa.d($$4, $$3) * 57.2957763671875) - 90.0f;
        float $$10 = (float)(-(apa.d($$7, $$8) * 57.2957763671875));
        this.b_(this.a(this.dA(), $$10, $$2));
        this.a_(this.a(this.dy(), $$9, $$1));
    }

    private float a(float $$0, float $$1, float $$2) {
        float $$3 = apa.g($$1 - $$0);
        if ($$3 > $$2) {
            $$3 = $$2;
        }
        if ($$3 < -$$2) {
            $$3 = -$$2;
        }
        return $$0 + $$3;
    }

    public static boolean a(bfn<? extends bgb> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        gu $$5 = $$3.d();
        return $$2 == bgd.c || $$1.a_($$5).a((cls)$$1, $$5, $$0);
    }

    public boolean a(cmn $$0, bgd $$1) {
        return true;
    }

    public boolean a(cmp $$0) {
        return !$$0.d(this.cE()) && $$0.f(this);
    }

    public int fE() {
        return 4;
    }

    public boolean d(int $$0) {
        return false;
    }

    @Override
    public int cr() {
        if (this.j() == null) {
            return 3;
        }
        int $$0 = (int)(this.er() - this.eI() * 0.33f);
        if (($$0 -= (3 - this.dI().ai().a()) * 4) < 0) {
            $$0 = 0;
        }
        return $$0 + 3;
    }

    @Override
    public Iterable<cfz> bI() {
        return this.bW;
    }

    @Override
    public Iterable<cfz> bJ() {
        return this.bX;
    }

    @Override
    public cfz c(bfo $$0) {
        switch ($$0.a()) {
            case a: {
                return this.bW.get($$0.b());
            }
            case b: {
                return this.bX.get($$0.b());
            }
        }
        return cfz.b;
    }

    @Override
    public void a(bfo $$0, cfz $$1) {
        this.e($$1);
        switch ($$0.a()) {
            case a: {
                this.a($$0, this.bW.set($$0.b(), $$1), $$1);
                break;
            }
            case b: {
                this.a($$0, this.bX.set($$0.b(), $$1), $$1);
            }
        }
    }

    @Override
    protected void a(ben $$0, int $$1, boolean $$2) {
        super.a($$0, $$1, $$2);
        for (bfo $$3 : bfo.values()) {
            boolean $$6;
            cfz $$4 = this.c($$3);
            float $$5 = this.f($$3);
            boolean bl2 = $$6 = $$5 > 1.0f;
            if ($$4.b() || cki.e($$4) || !$$2 && !$$6 || !(Math.max(this.af.i() - (float)$$1 * 0.01f, 0.0f) < $$5)) continue;
            if (!$$6 && $$4.i()) {
                $$4.b($$4.l() - this.af.a(1 + this.af.a(Math.max($$4.l() - 3, 1))));
            }
            this.b($$4);
            this.a($$3, cfz.b);
        }
    }

    protected float f(bfo $$0) {
        float $$3;
        switch ($$0.a()) {
            case a: {
                float $$1 = this.bQ[$$0.b()];
                break;
            }
            case b: {
                float $$2 = this.bR[$$0.b()];
                break;
            }
            default: {
                $$3 = 0.0f;
            }
        }
        return $$3;
    }

    protected void a(apf $$0, bdv $$1) {
        if ($$0.i() < 0.15f * $$1.d()) {
            float $$3;
            int $$2 = $$0.a(2);
            float f2 = $$3 = this.dI().ai() == bdu.d ? 0.1f : 0.25f;
            if ($$0.i() < 0.095f) {
                ++$$2;
            }
            if ($$0.i() < 0.095f) {
                ++$$2;
            }
            if ($$0.i() < 0.095f) {
                ++$$2;
            }
            boolean $$4 = true;
            for (bfo $$5 : bfo.values()) {
                cfu $$7;
                if ($$5.a() != bfo.a.b) continue;
                cfz $$6 = this.c($$5);
                if (!$$4 && $$0.i() < $$3) break;
                $$4 = false;
                if (!$$6.b() || ($$7 = bgb.a($$5, $$2)) == null) continue;
                this.a($$5, new cfz($$7));
            }
        }
    }

    @Nullable
    public static cfu a(bfo $$0, int $$1) {
        switch ($$0) {
            case f: {
                if ($$1 == 0) {
                    return cgc.oK;
                }
                if ($$1 == 1) {
                    return cgc.pa;
                }
                if ($$1 == 2) {
                    return cgc.oO;
                }
                if ($$1 == 3) {
                    return cgc.oS;
                }
                if ($$1 == 4) {
                    return cgc.oW;
                }
            }
            case e: {
                if ($$1 == 0) {
                    return cgc.oL;
                }
                if ($$1 == 1) {
                    return cgc.pb;
                }
                if ($$1 == 2) {
                    return cgc.oP;
                }
                if ($$1 == 3) {
                    return cgc.oT;
                }
                if ($$1 == 4) {
                    return cgc.oX;
                }
            }
            case d: {
                if ($$1 == 0) {
                    return cgc.oM;
                }
                if ($$1 == 1) {
                    return cgc.pc;
                }
                if ($$1 == 2) {
                    return cgc.oQ;
                }
                if ($$1 == 3) {
                    return cgc.oU;
                }
                if ($$1 == 4) {
                    return cgc.oY;
                }
            }
            case c: {
                if ($$1 == 0) {
                    return cgc.oN;
                }
                if ($$1 == 1) {
                    return cgc.pd;
                }
                if ($$1 == 2) {
                    return cgc.oR;
                }
                if ($$1 == 3) {
                    return cgc.oV;
                }
                if ($$1 != 4) break;
                return cgc.oZ;
            }
        }
        return null;
    }

    protected void b(apf $$0, bdv $$1) {
        float $$2 = $$1.d();
        this.a($$0, $$2);
        for (bfo $$3 : bfo.values()) {
            if ($$3.a() != bfo.a.b) continue;
            this.a($$0, $$2, $$3);
        }
    }

    protected void a(apf $$0, float $$1) {
        if (!this.eO().b() && $$0.i() < 0.25f * $$1) {
            this.a(bfo.a, cki.a($$0, this.eO(), (int)(5.0f + $$1 * (float)$$0.a(18)), false));
        }
    }

    protected void a(apf $$0, float $$1, bfo $$2) {
        cfz $$3 = this.c($$2);
        if (!$$3.b() && $$0.i() < 0.5f * $$1) {
            this.a($$2, cki.a($$0, $$3, (int)(5.0f + $$1 * (float)$$0.a(18)), false));
        }
    }

    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        apf $$5 = $$0.y_();
        this.a(bhg.b).c(new bhe("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bhe.a.b));
        if ($$5.i() < 0.05f) {
            this.u(true);
        } else {
            this.u(false);
        }
        return $$3;
    }

    public void fF() {
        this.bZ = true;
    }

    public void a(bfo $$0, float $$1) {
        switch ($$0.a()) {
            case a: {
                this.bQ[$$0.b()] = $$1;
                break;
            }
            case b: {
                this.bR[$$0.b()] = $$1;
            }
        }
    }

    public boolean fG() {
        return this.bY;
    }

    public void s(boolean $$0) {
        this.bY = $$0;
    }

    @Override
    public boolean f(cfz $$0) {
        bfo $$1 = bgb.h($$0);
        return this.c($$1).b() && this.fG();
    }

    public boolean fH() {
        return this.bZ;
    }

    @Override
    public final bdx a(byo $$0, bdw $$1) {
        if (!this.bs()) {
            return bdx.d;
        }
        if (this.fP() == $$0) {
            this.a(true, !$$0.fO().d);
            this.a(dgl.r, (bfj)$$0);
            return bdx.a(this.dI().B);
        }
        bdx $$2 = this.c($$0, $$1);
        if ($$2.a()) {
            this.a(dgl.r, (bfj)$$0);
            return $$2;
        }
        $$2 = this.b($$0, $$1);
        if ($$2.a()) {
            this.a(dgl.r, (bfj)$$0);
            return $$2;
        }
        return super.a($$0, $$1);
    }

    private bdx c(byo $$0, bdw $$12) {
        bdx $$3;
        cfz $$2 = $$0.b($$12);
        if ($$2.a(cgc.tQ) && this.a($$0)) {
            this.b((bfj)$$0, true);
            $$2.h(1);
            return bdx.a(this.dI().B);
        }
        if ($$2.a(cgc.tR) && ($$3 = $$2.a($$0, (bfz)this, $$12)).a()) {
            return $$3;
        }
        if ($$2.d() instanceof che) {
            if (this.dI() instanceof aif) {
                che $$4 = (che)$$2.d();
                Optional<bgb> $$5 = $$4.a($$0, this, this.ae(), (aif)this.dI(), this.dg(), $$2);
                $$5.ifPresent($$1 -> this.a($$0, (bgb)$$1));
                return $$5.isPresent() ? bdx.a : bdx.d;
            }
            return bdx.b;
        }
        return bdx.d;
    }

    protected void a(byo $$0, bgb $$1) {
    }

    protected bdx b(byo $$0, bdw $$1) {
        return bdx.d;
    }

    public boolean fI() {
        return this.a(this.di());
    }

    public boolean a(gu $$0) {
        if (this.ch == -1.0f) {
            return true;
        }
        return this.cg.j($$0) < (double)(this.ch * this.ch);
    }

    public void a(gu $$0, int $$1) {
        this.cg = $$0;
        this.ch = $$1;
    }

    public gu fJ() {
        return this.cg;
    }

    public float fK() {
        return this.ch;
    }

    public void fL() {
        this.ch = -1.0f;
    }

    public boolean fM() {
        return this.ch != -1.0f;
    }

    @Nullable
    public <T extends bgb> T a(bfn<T> $$0, boolean $$1) {
        if (this.dD()) {
            return null;
        }
        bgb $$2 = (bgb)$$0.a(this.dI());
        if ($$2 == null) {
            return null;
        }
        $$2.s(this);
        $$2.a(this.h_());
        $$2.t(this.fQ());
        if (this.aa()) {
            $$2.b(this.ab());
            $$2.n(this.cy());
        }
        if (this.fH()) {
            $$2.fF();
        }
        $$2.m(this.co());
        if ($$1) {
            $$2.s(this.fG());
            for (bfo $$3 : bfo.values()) {
                cfz $$4 = this.c($$3);
                if ($$4.b()) continue;
                $$2.a($$3, $$4.c());
                $$2.a($$3, this.f($$3));
            }
        }
        this.dI().b($$2);
        if (this.bM()) {
            bfj $$5 = this.cW();
            this.Y();
            $$2.a($$5, true);
        }
        this.ai();
        return (T)$$2;
    }

    protected void fN() {
        if (this.cf != null) {
            this.fV();
        }
        if (this.cd == null) {
            return;
        }
        if (!this.bs() || !this.cd.bs()) {
            this.a(true, true);
        }
    }

    public void a(boolean $$0, boolean $$1) {
        if (this.cd != null) {
            this.cd = null;
            this.cf = null;
            if (!this.dI().B && $$1) {
                this.a((cml)cgc.tQ);
            }
            if (!this.dI().B && $$0 && this.dI() instanceof aif) {
                ((aif)this.dI()).k().b(this, new xx(this, null));
            }
        }
    }

    public boolean a(byo $$0) {
        return !this.fO() && !(this instanceof bvu);
    }

    public boolean fO() {
        return this.cd != null;
    }

    @Nullable
    public bfj fP() {
        if (this.cd == null && this.ce != 0 && this.dI().B) {
            this.cd = this.dI().a(this.ce);
        }
        return this.cd;
    }

    public void b(bfj $$0, boolean $$1) {
        this.cd = $$0;
        this.cf = null;
        if (!this.dI().B && $$1 && this.dI() instanceof aif) {
            ((aif)this.dI()).k().b(this, new xx(this, this.cd));
        }
        if (this.bM()) {
            this.Y();
        }
    }

    public void r(int $$0) {
        this.ce = $$0;
        this.a(false, false);
    }

    @Override
    public boolean a(bfj $$0, boolean $$1) {
        boolean $$2 = super.a($$0, $$1);
        if ($$2 && this.fO()) {
            this.a(true, true);
        }
        return $$2;
    }

    private void fV() {
        if (this.cf != null && this.dI() instanceof aif) {
            if (this.cf.b("UUID")) {
                UUID $$0 = this.cf.a("UUID");
                bfj $$1 = ((aif)this.dI()).a($$0);
                if ($$1 != null) {
                    this.b($$1, true);
                    return;
                }
            } else if (this.cf.b("X", 99) && this.cf.b("Y", 99) && this.cf.b("Z", 99)) {
                gu $$2 = rd.b(this.cf);
                this.b(bvb.b(this.dI(), $$2), true);
                return;
            }
            if (this.ag > 100) {
                this.a((cml)cgc.tQ);
                this.cf = null;
            }
        }
    }

    @Override
    public boolean cV() {
        return super.cV() && !this.fQ();
    }

    public void t(boolean $$0) {
        byte $$1 = this.am.b(b);
        this.am.b(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & 0xFFFFFFFE));
    }

    public void u(boolean $$0) {
        byte $$1 = this.am.b(b);
        this.am.b(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & 0xFFFFFFFD));
    }

    public void v(boolean $$0) {
        byte $$1 = this.am.b(b);
        this.am.b(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & 0xFFFFFFFB));
    }

    public boolean fQ() {
        return (this.am.b(b) & 1) != 0;
    }

    public boolean fR() {
        return (this.am.b(b) & 2) != 0;
    }

    public boolean fS() {
        return (this.am.b(b) & 4) != 0;
    }

    public void a(boolean $$0) {
    }

    @Override
    public bft fh() {
        return this.fR() ? bft.a : bft.b;
    }

    public double i(bfz $$0) {
        return this.dd() * 2.0f * (this.dd() * 2.0f) + $$0.dd();
    }

    public double j(bfz $$0) {
        return Math.max(this.e($$0.eA()), this.e($$0.dg()));
    }

    public boolean k(bfz $$0) {
        double $$1 = this.j($$0);
        return $$1 <= this.i($$0);
    }

    @Override
    public boolean z(bfj $$0) {
        boolean $$4;
        int $$3;
        float $$1 = (float)this.b(bhg.f);
        float $$2 = (float)this.b(bhg.g);
        if ($$0 instanceof bfz) {
            $$1 += cki.a(this.eO(), ((bfz)$$0).eN());
            $$2 += (float)cki.c(this);
        }
        if (($$3 = cki.d(this)) > 0) {
            $$0.g($$3 * 4);
        }
        if ($$4 = $$0.a(this.dJ().b(this), $$1)) {
            if ($$2 > 0.0f && $$0 instanceof bfz) {
                ((bfz)$$0).q($$2 * 0.5f, apa.a(this.dy() * ((float)Math.PI / 180)), -apa.b(this.dy() * ((float)Math.PI / 180)));
                this.f(this.dl().d(0.6, 1.0, 0.6));
            }
            if ($$0 instanceof byo) {
                byo $$5 = (byo)$$0;
                this.a($$5, this.eO(), $$5.fi() ? $$5.fk() : cfz.b);
            }
            this.a((bfz)this, $$0);
            this.x($$0);
        }
        return $$4;
    }

    private void a(byo $$0, cfz $$1, cfz $$2) {
        if (!$$1.b() && !$$2.b() && $$1.d() instanceof cdo && $$2.a(cgc.uy)) {
            float $$3 = 0.25f + (float)cki.g(this) * 0.05f;
            if (this.af.i() < $$3) {
                $$0.gi().a(cgc.uy, 100);
                this.dI().a((bfj)$$0, (byte)30);
            }
        }
    }

    protected boolean fT() {
        if (this.dI().N() && !this.dI().B) {
            boolean $$2;
            float $$0 = this.bj();
            gu $$1 = gu.a(this.dn(), this.dr(), this.dt());
            boolean bl2 = $$2 = this.aX() || this.az || this.aA;
            if ($$0 > 0.5f && this.af.i() * 30.0f < ($$0 - 0.4f) * 2.0f && !$$2 && this.dI().g($$1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void c(anl<dxd> $$0) {
        if (this.J().q()) {
            super.c($$0);
        } else {
            this.f(this.dl().b(0.0, 0.3, 0.0));
        }
    }

    public void fU() {
        this.c((bmv $$0) -> true);
        this.dK().h();
    }

    public void c(Predicate<bmv> $$0) {
        this.bO.a($$0);
    }

    @Override
    protected void cp() {
        super.cp();
        this.a(true, false);
        this.bK().forEach($$0 -> {
            if (!$$0.b()) {
                $$0.f(0);
            }
        });
    }

    @Override
    @Nullable
    public cfz dv() {
        che $$0 = che.a(this.ae());
        if ($$0 == null) {
            return null;
        }
        return new cfz($$0);
    }
}

