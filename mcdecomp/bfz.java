/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bfz
extends bfj
implements bfh {
    private static final Logger b = LogUtils.getLogger();
    private static final UUID c = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
    private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
    private static final bhe bB = new bhe(c, "Sprinting speed boost", (double)0.3f, bhe.a.c);
    public static final int h = 2;
    public static final int i = 4;
    public static final int j = 98;
    public static final int k = 100;
    public static final int l = 6;
    public static final int m = 100;
    private static final int bC = 40;
    public static final double n = 0.003;
    public static final double o = 0.08;
    public static final int p = 20;
    private static final int bD = 7;
    private static final int bE = 10;
    private static final int bF = 2;
    public static final int q = 4;
    private static final float bG = 0.42f;
    private static final double bH = 128.0;
    protected static final int r = 1;
    protected static final int s = 2;
    protected static final int t = 4;
    protected static final aby<Byte> u = acb.a(bfz.class, aca.a);
    private static final aby<Float> bI = acb.a(bfz.class, aca.d);
    private static final aby<Integer> bJ = acb.a(bfz.class, aca.b);
    private static final aby<Boolean> bK = acb.a(bfz.class, aca.k);
    private static final aby<Integer> bL = acb.a(bfz.class, aca.b);
    private static final aby<Integer> bM = acb.a(bfz.class, aca.b);
    private static final aby<Optional<gu>> bN = acb.a(bfz.class, aca.o);
    protected static final float aD = 1.74f;
    protected static final bfk aE = bfk.c(0.2f, 0.2f);
    public static final float aF = 0.5f;
    private static final int bO = 50;
    private final bhd bP;
    private final bek bQ = new bek(this);
    private final Map<bey, bfa> bR = Maps.newHashMap();
    private final hn<cfz> bS = hn.a(2, cfz.b);
    private final hn<cfz> bT = hn.a(4, cfz.b);
    public boolean aG;
    private boolean bU = false;
    public bdw aH;
    public int aI;
    public int aJ;
    public int aK;
    public int aL;
    public int aM;
    public int aN;
    public float aO;
    public float aP;
    protected int aQ;
    public final bgz aR = new bgz();
    public final int aS = 20;
    public final float aT;
    public final float aU;
    public float aV;
    public float aW;
    public float aX;
    public float aY;
    @Nullable
    protected byo aZ;
    protected int ba;
    protected boolean bb;
    protected int bc;
    protected float bd;
    protected float be;
    protected float bf;
    protected float bg;
    protected float bh;
    protected int bi;
    protected float bj;
    protected boolean bk;
    public float bl;
    public float bm;
    public float bn;
    protected int bo;
    protected double bp;
    protected double bq;
    protected double br;
    protected double bs;
    protected double bt;
    protected double bu;
    protected int bv;
    private boolean bV = true;
    @Nullable
    private bfz bW;
    private int bX;
    private bfz bY;
    private int bZ;
    private float ca;
    private int cb;
    private float cc;
    protected cfz bw = cfz.b;
    protected int bx;
    protected int by;
    private gu cd;
    private Optional<gu> ce = Optional.empty();
    @Nullable
    private ben cf;
    private long cg;
    protected int bz;
    private float ch;
    private float ci;
    protected bha<?> bA;
    private boolean cj;

    protected bfz(bfn<? extends bfz> $$0, cmm $$1) {
        super($$0, $$1);
        this.bP = new bhd(bhh.a($$0));
        this.t(this.eI());
        this.H = true;
        this.aU = (float)((Math.random() + 1.0) * (double)0.01f);
        this.an();
        this.aT = (float)Math.random() * 12398.0f;
        this.a_((float)(Math.random() * 6.2831854820251465));
        this.aX = this.dy();
        this.r(0.6f);
        rc $$2 = rc.a;
        this.bA = this.a(new Dynamic((DynamicOps)$$2, (Object)((rk)$$2.createMap((Map)ImmutableMap.of((Object)$$2.a("memories"), (Object)((rk)$$2.emptyMap()))))));
    }

    public bha<?> dK() {
        return this.bA;
    }

    protected bha.b<?> dL() {
        return bha.a(ImmutableList.of(), ImmutableList.of());
    }

    protected bha<?> a(Dynamic<?> $$0) {
        return this.dL().a($$0);
    }

    @Override
    public void ah() {
        this.a(this.dJ().w(), Float.MAX_VALUE);
    }

    public boolean a(bfn<?> $$0) {
        return true;
    }

    @Override
    protected void a_() {
        this.am.a(u, (byte)0);
        this.am.a(bJ, 0);
        this.am.a(bK, false);
        this.am.a(bL, 0);
        this.am.a(bM, 0);
        this.am.a(bI, Float.valueOf(1.0f));
        this.am.a(bN, Optional.empty());
    }

    public static bhf.a dM() {
        return bhf.a().a(bhg.a).a(bhg.c).a(bhg.d).a(bhg.i).a(bhg.j);
    }

    @Override
    protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
        if (!this.aV()) {
            this.bc();
        }
        if (!this.dI().B && $$1 && this.aa > 0.0f) {
            this.dR();
            this.dS();
        }
        if (!this.dI().B && this.aa > 3.0f && $$1 && !$$2.i()) {
            double $$4 = this.dn();
            double $$5 = this.dp();
            double $$6 = this.dt();
            gu $$7 = this.di();
            if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
                double $$8 = $$4 - (double)$$3.u() - 0.5;
                double $$9 = $$6 - (double)$$3.w() - 0.5;
                double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
                $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
                $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
            }
            float $$11 = apa.f(this.aa - 3.0f);
            double $$12 = Math.min((double)(0.2f + $$11 / 15.0f), 2.5);
            int $$13 = (int)(150.0 * $$12);
            ((aif)this.dI()).a(new in(iv.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15f);
        }
        super.a($$0, $$1, $$2, $$3);
        if ($$1) {
            this.ce = Optional.empty();
        }
    }

    public boolean dN() {
        return this.eN() == bge.b;
    }

    public float a(float $$0) {
        return apa.i($$0, this.ci, this.ch);
    }

    @Override
    public void ao() {
        this.aO = this.aP;
        if (this.al) {
            this.fw().ifPresent(this::a);
        }
        if (this.dO()) {
            this.dP();
        }
        super.ao();
        this.dI().ad().a("livingEntityBaseTick");
        if (this.aU() || this.dI().B) {
            this.aw();
        }
        if (this.bs()) {
            gu $$9;
            boolean $$0 = this instanceof byo;
            if (!this.dI().B) {
                double $$2;
                double $$1;
                if (this.bt()) {
                    this.a(this.dJ().f(), 1.0f);
                } else if ($$0 && !this.dI().w_().a(this.cE()) && ($$1 = this.dI().w_().a(this) + this.dI().w_().n()) < 0.0 && ($$2 = this.dI().w_().o()) > 0.0) {
                    this.a(this.dJ().v(), (float)Math.max(1, apa.a(-$$1 * $$2)));
                }
            }
            if (((bfj)this).a(anb.a) && !this.dI().a_(gu.a(this.dn(), this.dr(), this.dt())).a(cpo.nd)) {
                boolean $$3;
                boolean bl2 = $$3 = !this.dN() && !bfb.c(this) && (!$$0 || !((byo)this).fO().a);
                if ($$3) {
                    this.j(this.m(this.cf()));
                    if (this.cf() == -20) {
                        this.j(0);
                        eei $$4 = this.dl();
                        for (int $$5 = 0; $$5 < 8; ++$$5) {
                            double $$6 = this.af.j() - this.af.j();
                            double $$7 = this.af.j() - this.af.j();
                            double $$8 = this.af.j() - this.af.j();
                            this.dI().a(iv.e, this.dn() + $$6, this.dp() + $$7, this.dt() + $$8, $$4.c, $$4.d, $$4.e);
                        }
                        this.a(this.dJ().h(), 2.0f);
                    }
                }
                if (!this.dI().B && this.bM() && this.cW() != null && this.cW().bO()) {
                    this.Y();
                }
            } else if (this.cf() < this.ce()) {
                this.j(this.n(this.cf()));
            }
            if (!this.dI().B && !Objects.equal((Object)this.cd, (Object)($$9 = this.di()))) {
                this.cd = $$9;
                this.c($$9);
            }
        }
        if (this.bs() && (this.aX() || this.az)) {
            this.aB();
        }
        if (this.aL > 0) {
            --this.aL;
        }
        if (this.ak > 0 && !(this instanceof aig)) {
            --this.ak;
        }
        if (this.es() && this.dI().h(this)) {
            this.dX();
        }
        if (this.ba > 0) {
            --this.ba;
        } else {
            this.aZ = null;
        }
        if (this.bY != null && !this.bY.bs()) {
            this.bY = null;
        }
        if (this.bW != null) {
            if (!this.bW.bs()) {
                this.a((bfz)null);
            } else if (this.ag - this.bX > 100) {
                this.a((bfz)null);
            }
        }
        this.ej();
        this.bg = this.bf;
        this.aW = this.aV;
        this.aY = this.aX;
        this.M = this.dy();
        this.N = this.dA();
        this.dI().ad().c();
    }

    public boolean dO() {
        return this.ag % 5 == 0 && this.dl().c != 0.0 && this.dl().e != 0.0 && !this.G_() && cki.k(this) && this.dQ();
    }

    protected void dP() {
        eei $$0 = this.dl();
        this.dI().a(iv.I, this.dn() + (this.af.j() - 0.5) * (double)this.dd(), this.dp() + 0.1, this.dt() + (this.af.j() - 0.5) * (double)this.dd(), $$0.c * -0.2, 0.1, $$0.e * -0.2);
        float $$1 = this.af.i() * 0.4f + this.af.i() > 0.9f ? 0.6f : 0.0f;
        this.a(amh.wd, $$1, 0.6f + this.af.i() * 0.4f);
    }

    protected boolean dQ() {
        return this.dI().a_(this.aE()).a(amw.aL);
    }

    @Override
    protected float aH() {
        if (this.dQ() && cki.a(ckk.l, this) > 0) {
            return 1.0f;
        }
        return super.aH();
    }

    protected boolean c(dcb $$0) {
        return !$$0.i() || this.fr();
    }

    protected void dR() {
        bhc $$0 = this.a(bhg.d);
        if ($$0 == null) {
            return;
        }
        if ($$0.a(d) != null) {
            $$0.b(d);
        }
    }

    protected void dS() {
        int $$02;
        if (!this.be().i() && ($$02 = cki.a(ckk.l, this)) > 0 && this.dQ()) {
            bhc $$1 = this.a(bhg.d);
            if ($$1 == null) {
                return;
            }
            $$1.b(new bhe(d, "Soul speed boost", (double)(0.03f * (1.0f + (float)$$02 * 0.35f)), bhe.a.a));
            if (this.ec().i() < 0.04f) {
                cfz $$2 = this.c(bfo.c);
                $$2.a(1, this, (T $$0) -> $$0.d(bfo.c));
            }
        }
    }

    protected void dT() {
        bhc $$0 = this.a(bhg.d);
        if ($$0 == null) {
            return;
        }
        if ($$0.a(e) != null) {
            $$0.b(e);
        }
    }

    protected void dU() {
        int $$0;
        if (!this.be().i() && ($$0 = this.cg()) > 0) {
            bhc $$1 = this.a(bhg.d);
            if ($$1 == null) {
                return;
            }
            float $$2 = -0.05f * this.ch();
            $$1.b(new bhe(e, "Powder snow slow", (double)$$2, bhe.a.a));
        }
    }

    protected void c(gu $$0) {
        int $$1 = cki.a(ckk.j, this);
        if ($$1 > 0) {
            ckn.a(this, this.dI(), $$0, $$1);
        }
        if (this.c(this.be())) {
            this.dR();
        }
        this.dS();
    }

    public boolean h_() {
        return false;
    }

    public float dV() {
        return this.h_() ? 0.5f : 1.0f;
    }

    protected boolean dW() {
        return true;
    }

    protected void dX() {
        ++this.aN;
        if (this.aN >= 20 && !this.dI().r_() && !this.dD()) {
            this.dI().a((bfj)this, (byte)60);
            this.a(bfj.c.a);
        }
    }

    public boolean dY() {
        return !this.h_();
    }

    protected boolean dZ() {
        return !this.h_();
    }

    protected int m(int $$0) {
        int $$1 = cki.e(this);
        if ($$1 > 0 && this.af.a($$1 + 1) > 0) {
            return $$0;
        }
        return $$0 - 1;
    }

    protected int n(int $$0) {
        return Math.min($$0 + 4, this.ce());
    }

    public int ea() {
        return 0;
    }

    protected boolean eb() {
        return false;
    }

    public apf ec() {
        return this.af;
    }

    @Nullable
    public bfz ed() {
        return this.bW;
    }

    @Override
    public bfz M_() {
        return this.ed();
    }

    public int ee() {
        return this.bX;
    }

    public void c(@Nullable byo $$0) {
        this.aZ = $$0;
        this.ba = this.ag;
    }

    public void a(@Nullable bfz $$0) {
        this.bW = $$0;
        this.bX = this.ag;
    }

    @Nullable
    public bfz ef() {
        return this.bY;
    }

    public int eg() {
        return this.bZ;
    }

    public void x(bfj $$0) {
        this.bY = $$0 instanceof bfz ? (bfz)$$0 : null;
        this.bZ = this.ag;
    }

    public int eh() {
        return this.bc;
    }

    public void o(int $$0) {
        this.bc = $$0;
    }

    public boolean ei() {
        return this.bU;
    }

    public void p(boolean $$0) {
        this.bU = $$0;
    }

    protected boolean a(bfo $$0) {
        return true;
    }

    public void a(bfo $$0, cfz $$1, cfz $$2) {
        boolean $$3;
        boolean bl2 = $$3 = $$2.b() && $$1.b();
        if ($$3 || cfz.c($$1, $$2) || this.al) {
            return;
        }
        cfa $$4 = cfa.c_($$2);
        if ($$4 != null && !this.G_() && $$4.g() == $$0) {
            if (!this.dI().r_() && !this.aQ()) {
                this.dI().a(null, this.dn(), this.dp(), this.dt(), $$4.ak_(), this.cY(), 1.0f, 1.0f);
            }
            if (this.a($$0)) {
                this.a(dgl.w);
            }
        }
    }

    @Override
    public void a(bfj.c $$0) {
        super.a($$0);
        this.bA.a();
    }

    @Override
    public void b(qr $$0) {
        $$0.a("Health", this.er());
        $$0.a("HurtTime", (short)this.aL);
        $$0.a("HurtByTimestamp", this.bX);
        $$0.a("DeathTime", (short)this.aN);
        $$0.a("AbsorptionAmount", this.ff());
        $$0.a("Attributes", this.eM().c());
        if (!this.bR.isEmpty()) {
            qx $$12 = new qx();
            for (bfa $$2 : this.bR.values()) {
                $$12.add($$2.a(new qr()));
            }
            $$0.a("ActiveEffects", $$12);
        }
        $$0.a("FallFlying", this.fr());
        this.fw().ifPresent($$1 -> {
            $$0.a("SleepingX", $$1.u());
            $$0.a("SleepingY", $$1.v());
            $$0.a("SleepingZ", $$1.w());
        });
        DataResult<rk> $$3 = this.bA.a(rc.a);
        $$3.resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).ifPresent($$1 -> $$0.a("Brain", (rk)$$1));
    }

    @Override
    public void a(qr $$0) {
        this.y($$0.j("AbsorptionAmount"));
        if ($$0.b("Attributes", 9) && this.dI() != null && !this.dI().B) {
            this.eM().a($$0.c("Attributes", 10));
        }
        if ($$0.b("ActiveEffects", 9)) {
            qx $$1 = $$0.c("ActiveEffects", 10);
            for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
                qr $$3 = $$1.a($$2);
                bfa $$4 = bfa.b($$3);
                if ($$4 == null) continue;
                this.bR.put($$4.c(), $$4);
            }
        }
        if ($$0.b("Health", 99)) {
            this.t($$0.j("Health"));
        }
        this.aL = $$0.g("HurtTime");
        this.aN = $$0.g("DeathTime");
        this.bX = $$0.h("HurtByTimestamp");
        if ($$0.b("Team", 8)) {
            boolean $$7;
            String $$5 = $$0.l("Team");
            efe $$6 = this.dI().I().f($$5);
            boolean bl2 = $$7 = $$6 != null && this.dI().I().a(this.cu(), $$6);
            if (!$$7) {
                b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", (Object)$$5);
            }
        }
        if ($$0.q("FallFlying")) {
            this.b(7, true);
        }
        if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
            gu $$8 = new gu($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
            this.g($$8);
            this.am.b(ar, bgl.c);
            if (!this.al) {
                this.a($$8);
            }
        }
        if ($$0.b("Brain", 10)) {
            this.bA = this.a(new Dynamic((DynamicOps)rc.a, (Object)$$0.c("Brain")));
        }
    }

    protected void ej() {
        Iterator<bey> $$0 = this.bR.keySet().iterator();
        try {
            while ($$0.hasNext()) {
                bey $$1 = $$0.next();
                bfa $$2 = this.bR.get($$1);
                if (!$$2.a(this, () -> this.a($$2, true, null))) {
                    if (this.dI().B) continue;
                    $$0.remove();
                    this.a($$2);
                    continue;
                }
                if ($$2.d() % 600 != 0) continue;
                this.a($$2, false, null);
            }
        }
        catch (ConcurrentModificationException $$1) {
            // empty catch block
        }
        if (this.bV) {
            if (!this.dI().B) {
                this.F();
                this.q();
            }
            this.bV = false;
        }
        int $$3 = this.am.b(bJ);
        boolean $$4 = this.am.b(bK);
        if ($$3 > 0) {
            boolean $$6;
            if (this.cb()) {
                boolean $$5 = this.af.a(15) == 0;
            } else {
                $$6 = this.af.h();
            }
            if ($$4) {
                $$6 &= this.af.a(5) == 0;
            }
            if ($$6 && $$3 > 0) {
                double $$7 = (double)($$3 >> 16 & 0xFF) / 255.0;
                double $$8 = (double)($$3 >> 8 & 0xFF) / 255.0;
                double $$9 = (double)($$3 >> 0 & 0xFF) / 255.0;
                this.dI().a($$4 ? iv.a : iv.v, this.d(0.5), this.dq(), this.g(0.5), $$7, $$8, $$9);
            }
        }
    }

    protected void F() {
        if (this.bR.isEmpty()) {
            this.em();
            this.j(false);
        } else {
            Collection<bfa> $$0 = this.bR.values();
            this.am.b(bK, bfz.c($$0));
            this.am.b(bJ, chy.a($$0));
            this.j(this.a(bfc.n));
        }
    }

    private void q() {
        boolean $$0 = this.ca();
        if (this.i(6) != $$0) {
            this.b(6, $$0);
        }
    }

    public double y(@Nullable bfj $$0) {
        double $$1 = 1.0;
        if (this.bS()) {
            $$1 *= 0.8;
        }
        if (this.cb()) {
            float $$2 = this.eQ();
            if ($$2 < 0.1f) {
                $$2 = 0.1f;
            }
            $$1 *= 0.7 * (double)$$2;
        }
        if ($$0 != null) {
            cfz $$3 = this.c(bfo.f);
            bfn<?> $$4 = $$0.ae();
            if ($$4 == bfn.aJ && $$3.a(cgc.tr) || $$4 == bfn.bp && $$3.a(cgc.tu) || $$4 == bfn.aw && $$3.a(cgc.tx) || $$4 == bfn.ax && $$3.a(cgc.tx) || $$4 == bfn.u && $$3.a(cgc.tv)) {
                $$1 *= 0.5;
            }
        }
        return $$1;
    }

    public boolean c(bfz $$0) {
        if ($$0 instanceof byo && this.dI().ai() == bdu.a) {
            return false;
        }
        return $$0.ek();
    }

    public boolean a(bfz $$0, bqm $$1) {
        return $$1.a(this, $$0);
    }

    public boolean ek() {
        return !this.co() && this.el();
    }

    public boolean el() {
        return !this.G_() && this.bs();
    }

    public static boolean c(Collection<bfa> $$0) {
        for (bfa $$1 : $$0) {
            if (!$$1.g() || $$1.f()) continue;
            return false;
        }
        return true;
    }

    protected void em() {
        this.am.b(bK, false);
        this.am.b(bJ, 0);
    }

    public boolean en() {
        if (this.dI().B) {
            return false;
        }
        Iterator<bfa> $$0 = this.bR.values().iterator();
        boolean $$1 = false;
        while ($$0.hasNext()) {
            this.a($$0.next());
            $$0.remove();
            $$1 = true;
        }
        return $$1;
    }

    public Collection<bfa> eo() {
        return this.bR.values();
    }

    public Map<bey, bfa> ep() {
        return this.bR;
    }

    public boolean a(bey $$0) {
        return this.bR.containsKey($$0);
    }

    @Nullable
    public bfa b(bey $$0) {
        return this.bR.get($$0);
    }

    public final boolean b(bfa $$0) {
        return this.b($$0, null);
    }

    public boolean b(bfa $$0, @Nullable bfj $$1) {
        if (!this.c($$0)) {
            return false;
        }
        bfa $$2 = this.bR.get($$0.c());
        if ($$2 == null) {
            this.bR.put($$0.c(), $$0);
            this.a($$0, $$1);
            return true;
        }
        if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            return true;
        }
        return false;
    }

    public boolean c(bfa $$0) {
        bey $$1;
        return this.eN() != bge.b || ($$1 = $$0.c()) != bfc.j && $$1 != bfc.s;
    }

    public void c(bfa $$0, @Nullable bfj $$1) {
        if (!this.c($$0)) {
            return;
        }
        bfa $$2 = this.bR.put($$0.c(), $$0);
        if ($$2 == null) {
            this.a($$0, $$1);
        } else {
            this.a($$0, true, $$1);
        }
    }

    public boolean eq() {
        return this.eN() == bge.b;
    }

    @Nullable
    public bfa c(@Nullable bey $$0) {
        return this.bR.remove($$0);
    }

    public boolean d(bey $$0) {
        bfa $$1 = this.c($$0);
        if ($$1 != null) {
            this.a($$1);
            return true;
        }
        return false;
    }

    protected void a(bfa $$0, @Nullable bfj $$1) {
        this.bV = true;
        if (!this.dI().B) {
            $$0.c().b(this, this.eM(), $$0.e());
            this.d($$0);
        }
    }

    public void d(bfa $$0) {
        for (bfj $$1 : this.cN()) {
            if (!($$1 instanceof aig)) continue;
            aig $$2 = (aig)$$1;
            $$2.c.a(new yw(this.af(), $$0));
        }
    }

    protected void a(bfa $$0, boolean $$1, @Nullable bfj $$2) {
        this.bV = true;
        if ($$1 && !this.dI().B) {
            bey $$3 = $$0.c();
            $$3.a(this, this.eM(), $$0.e());
            $$3.b(this, this.eM(), $$0.e());
        }
        if (!this.dI().B) {
            this.d($$0);
        }
    }

    protected void a(bfa $$0) {
        this.bV = true;
        if (!this.dI().B) {
            $$0.c().a(this, this.eM(), $$0.e());
            for (bfj $$1 : this.cN()) {
                if (!($$1 instanceof aig)) continue;
                aig $$2 = (aig)$$1;
                $$2.c.a(new xd(this.af(), $$0.c()));
            }
        }
    }

    public void s(float $$0) {
        float $$1 = this.er();
        if ($$1 > 0.0f) {
            this.t($$1 + $$0);
        }
    }

    public float er() {
        return this.am.b(bI).floatValue();
    }

    public void t(float $$0) {
        this.am.b(bI, Float.valueOf(apa.a($$0, 0.0f, this.eI())));
    }

    public boolean es() {
        return this.er() <= 0.0f;
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        boolean $$16;
        bfj $$8;
        if (this.b($$0)) {
            return false;
        }
        if (this.dI().B) {
            return false;
        }
        if (this.es()) {
            return false;
        }
        if ($$0.a(amy.i) && this.a(bfc.l)) {
            return false;
        }
        if (this.fy() && !this.dI().B) {
            this.fz();
        }
        this.bc = 0;
        float $$2 = $$1;
        boolean $$3 = false;
        float $$4 = 0.0f;
        if ($$1 > 0.0f && this.f($$0)) {
            bfj $$5;
            this.u($$1);
            $$4 = $$1;
            $$1 = 0.0f;
            if (!$$0.a(amy.j) && ($$5 = $$0.c()) instanceof bfz) {
                bfz $$6 = (bfz)$$5;
                this.d($$6);
            }
            $$3 = true;
        }
        if ($$0.a(amy.o) && this.ae().a(amz.j)) {
            $$1 *= 5.0f;
        }
        this.aR.a(1.5f);
        boolean $$7 = true;
        if ((float)this.ak > 10.0f && !$$0.a(amy.e)) {
            if ($$1 <= this.bj) {
                return false;
            }
            this.f($$0, $$1 - this.bj);
            this.bj = $$1;
            $$7 = false;
        } else {
            this.bj = $$1;
            this.ak = 20;
            this.f($$0, $$1);
            this.aL = this.aM = 10;
        }
        if ($$0.a(amy.a) && !this.c(bfo.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75f;
        }
        if (($$8 = $$0.d()) != null) {
            bso $$11;
            if ($$8 instanceof bfz) {
                bfz $$9 = (bfz)$$8;
                if (!$$0.a(amy.q)) {
                    this.a($$9);
                }
            }
            if ($$8 instanceof byo) {
                byo $$10 = (byo)$$8;
                this.ba = 100;
                this.aZ = $$10;
            } else if ($$8 instanceof bso && ($$11 = (bso)$$8).q()) {
                byo $$12;
                this.ba = 100;
                bfz bfz2 = $$11.I_();
                this.aZ = bfz2 instanceof byo ? ($$12 = (byo)bfz2) : null;
            }
        }
        if ($$7) {
            if ($$3) {
                this.dI().a((bfj)this, (byte)29);
            } else {
                this.dI().a((bfj)this, $$0);
            }
            if (!($$0.a(amy.r) || $$3 && !($$1 > 0.0f))) {
                this.bl();
            }
            if ($$8 != null && !$$0.a(amy.l)) {
                double $$13 = $$8.dn() - this.dn();
                double $$14 = $$8.dt() - this.dt();
                while ($$13 * $$13 + $$14 * $$14 < 1.0E-4) {
                    $$13 = (Math.random() - Math.random()) * 0.01;
                    $$14 = (Math.random() - Math.random()) * 0.01;
                }
                this.q(0.4f, $$13, $$14);
                if (!$$3) {
                    this.a($$13, $$14);
                }
            }
        }
        if (this.es()) {
            if (!this.h($$0)) {
                amg $$15 = this.g_();
                if ($$7 && $$15 != null) {
                    this.a($$15, this.eR(), this.eS());
                }
                this.a($$0);
            }
        } else if ($$7) {
            this.e($$0);
        }
        boolean bl2 = $$16 = !$$3 || $$1 > 0.0f;
        if ($$16) {
            this.cf = $$0;
            this.cg = this.dI().V();
        }
        if (this instanceof aig) {
            ai.h.a((aig)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0f && $$4 < 3.4028235E37f) {
                ((aig)this).a(amr.K, Math.round($$4 * 10.0f));
            }
        }
        if ($$8 instanceof aig) {
            ai.g.a((aig)$$8, this, $$0, $$2, $$1, $$3);
        }
        return $$16;
    }

    protected void d(bfz $$0) {
        $$0.e(this);
    }

    protected void e(bfz $$0) {
        $$0.q(0.5, $$0.dn() - this.dn(), $$0.dt() - this.dt());
    }

    private boolean h(ben $$0) {
        if ($$0.a(amy.d)) {
            return false;
        }
        cfz $$1 = null;
        for (bdw $$2 : bdw.values()) {
            cfz $$3 = this.b($$2);
            if (!$$3.a(cgc.uz)) continue;
            $$1 = $$3.p();
            $$3.h(1);
            break;
        }
        if ($$1 != null) {
            if (this instanceof aig) {
                aig $$4 = (aig)this;
                $$4.b(amr.c.b(cgc.uz));
                ai.B.a($$4, $$1);
            }
            this.t(1.0f);
            this.en();
            this.b(new bfa(bfc.j, 900, 1));
            this.b(new bfa(bfc.v, 100, 1));
            this.b(new bfa(bfc.l, 800, 0));
            this.dI().a((bfj)this, (byte)35);
        }
        return $$1 != null;
    }

    @Nullable
    public ben et() {
        if (this.dI().V() - this.cg > 40L) {
            this.cf = null;
        }
        return this.cf;
    }

    protected void e(ben $$0) {
        amg $$1 = this.d($$0);
        if ($$1 != null) {
            this.a($$1, this.eR(), this.eS());
        }
    }

    public boolean f(ben $$0) {
        eei $$4;
        byu $$3;
        bfj $$1 = $$0.c();
        boolean $$2 = false;
        if ($$1 instanceof byu && ($$3 = (byu)$$1).w() > 0) {
            $$2 = true;
        }
        if (!$$0.a(amy.c) && this.fp() && !$$2 && ($$4 = $$0.h()) != null) {
            eei $$5 = this.f(1.0f);
            eei $$6 = $$4.a(this.dg()).d();
            $$6 = new eei($$6.c, 0.0, $$6.e);
            if ($$6.b($$5) < 0.0) {
                return true;
            }
        }
        return false;
    }

    private void i(cfz $$0) {
        if (!$$0.b()) {
            if (!this.aQ()) {
                this.dI().a(this.dn(), this.dp(), this.dt(), amh.lZ, this.cY(), 0.8f, 0.8f + this.dI().z.i() * 0.4f, false);
            }
            this.a($$0, 5);
        }
    }

    public void a(ben $$0) {
        if (this.dD() || this.bb) {
            return;
        }
        bfj $$1 = $$0.d();
        bfz $$2 = this.eH();
        if (this.bi >= 0 && $$2 != null) {
            $$2.a((bfj)this, this.bi, $$0);
        }
        if (this.fy()) {
            this.fz();
        }
        if (!this.dI().B && this.aa()) {
            b.info("Named entity {} died: {}", (Object)this, (Object)this.eG().a().getString());
        }
        this.bb = true;
        this.eG().c();
        cmm cmm2 = this.dI();
        if (cmm2 instanceof aif) {
            aif $$3 = (aif)cmm2;
            if ($$1 == null || $$1.a($$3, this)) {
                this.a(dgl.p);
                this.g($$0);
                this.f($$2);
            }
            this.dI().a((bfj)this, (byte)3);
        }
        this.b(bgl.h);
    }

    protected void f(@Nullable bfz $$0) {
        if (this.dI().B) {
            return;
        }
        boolean $$1 = false;
        if ($$0 instanceof buv) {
            if (this.dI().X().b(cmi.c)) {
                gu $$2 = this.di();
                dcb $$3 = cpo.cd.n();
                if (this.dI().a_($$2).i() && $$3.a((cmp)this.dI(), $$2)) {
                    this.dI().a($$2, $$3, 3);
                    $$1 = true;
                }
            }
            if (!$$1) {
                bvh $$4 = new bvh(this.dI(), this.dn(), this.dp(), this.dt(), new cfz(cgc.da));
                this.dI().b($$4);
            }
        }
    }

    protected void g(ben $$0) {
        boolean $$4;
        int $$3;
        bfj $$1 = $$0.d();
        if ($$1 instanceof byo) {
            int $$2 = cki.h((bfz)$$1);
        } else {
            $$3 = 0;
        }
        boolean bl2 = $$4 = this.ba > 0;
        if (this.dZ() && this.dI().X().b(cmi.f)) {
            this.a($$0, $$4);
            this.a($$0, $$3, $$4);
        }
        this.eu();
        this.ev();
    }

    protected void eu() {
    }

    protected void ev() {
        if (this.dI() instanceof aif && !this.ez() && (this.eb() || this.ba > 0 && this.dY() && this.dI().X().b(cmi.f))) {
            bfp.a((aif)this.dI(), this.dg(), this.ea());
        }
    }

    protected void a(ben $$0, int $$1, boolean $$2) {
    }

    public acq ew() {
        return this.ae().j();
    }

    public long ex() {
        return 0L;
    }

    protected void a(ben $$0, boolean $$1) {
        acq $$2 = this.ew();
        dzs $$3 = this.dI().n().aH().getLootTable($$2);
        dzq.a $$4 = new dzq.a((aif)this.dI()).a(ebw.a, this).a(ebw.f, this.dg()).a(ebw.c, $$0).b(ebw.d, $$0.d()).b(ebw.e, $$0.c());
        if ($$1 && this.aZ != null) {
            $$4 = $$4.a(ebw.b, this.aZ).a(this.aZ.gj());
        }
        dzq $$5 = $$4.a(ebv.f);
        $$3.a($$5, this.ex(), this::b);
    }

    public void q(double $$0, double $$1, double $$2) {
        if (($$0 *= 1.0 - this.b(bhg.c)) <= 0.0) {
            return;
        }
        this.at = true;
        eei $$3 = this.dl();
        eei $$4 = new eei($$1, 0.0, $$2).d().a($$0);
        this.o($$3.c / 2.0 - $$4.c, this.ay() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
    }

    public void a(double $$0, double $$1) {
    }

    @Nullable
    protected amg d(ben $$0) {
        return amh.iZ;
    }

    @Nullable
    protected amg g_() {
        return amh.iU;
    }

    private amg d(int $$0) {
        return $$0 > 4 ? this.eC().b() : this.eC().a();
    }

    public void ey() {
        this.cj = true;
    }

    public boolean ez() {
        return this.cj;
    }

    protected eei eA() {
        bfj bfj2 = this.cW();
        if (bfj2 instanceof bgp) {
            bgp $$0 = (bgp)((Object)bfj2);
            return this.dg().b(0.0, $$0.d(), 0.0);
        }
        return this.dg();
    }

    public float eB() {
        return 0.0f;
    }

    public a eC() {
        return new a(amh.ja, amh.iS);
    }

    protected amg c(cfz $$0) {
        return $$0.N();
    }

    public amg d(cfz $$0) {
        return $$0.O();
    }

    public Optional<gu> eD() {
        return this.ce;
    }

    public boolean i_() {
        if (this.G_()) {
            return false;
        }
        gu $$0 = this.di();
        dcb $$1 = this.dj();
        if ($$1.a(amw.aN)) {
            this.ce = Optional.of($$0);
            return true;
        }
        if ($$1.b() instanceof cya && this.c($$0, $$1)) {
            this.ce = Optional.of($$0);
            return true;
        }
        return false;
    }

    private boolean c(gu $$0, dcb $$1) {
        dcb $$2;
        return $$1.c(cya.a) != false && ($$2 = this.dI().a_($$0.d())).a(cpo.cO) && $$2.c(ctq.a) == $$1.c(cya.aC);
    }

    @Override
    public boolean bs() {
        return !this.dD() && this.er() > 0.0f;
    }

    @Override
    public boolean a(float $$0, float $$1, ben $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        int $$4 = this.d($$0, $$1);
        if ($$4 > 0) {
            this.a(this.d($$4), 1.0f, 1.0f);
            this.eE();
            this.a($$2, (float)$$4);
            return true;
        }
        return $$3;
    }

    protected int d(float $$0, float $$1) {
        if (this.ae().a(amz.l)) {
            return 0;
        }
        bfa $$2 = this.b(bfc.h);
        float $$3 = $$2 == null ? 0.0f : (float)($$2.e() + 1);
        return apa.f(($$0 - 3.0f - $$3) * $$1);
    }

    protected void eE() {
        if (this.aQ()) {
            return;
        }
        int $$0 = apa.a(this.dn());
        int $$1 = apa.a(this.dp() - (double)0.2f);
        int $$2 = apa.a(this.dt());
        dcb $$3 = this.dI().a_(new gu($$0, $$1, $$2));
        if (!$$3.i()) {
            cxa $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5f, $$4.b() * 0.75f);
        }
    }

    @Override
    public void m(float $$0) {
        this.aL = this.aM = 10;
    }

    public int eF() {
        return apa.a(this.b(bhg.i));
    }

    protected void b(ben $$0, float $$1) {
    }

    protected void c(ben $$0, float $$1) {
    }

    protected void u(float $$0) {
    }

    protected float d(ben $$0, float $$1) {
        if (!$$0.a(amy.b)) {
            this.b($$0, $$1);
            $$1 = bej.a($$1, this.eF(), (float)this.b(bhg.j));
        }
        return $$1;
    }

    protected float e(ben $$0, float $$1) {
        int $$2;
        int $$3;
        float $$4;
        float $$5;
        float $$6;
        if ($$0.a(amy.f)) {
            return $$1;
        }
        if (this.a(bfc.k) && !$$0.a(amy.g) && ($$6 = ($$5 = $$1) - ($$1 = Math.max(($$4 = $$1 * (float)($$3 = 25 - ($$2 = (this.b(bfc.k).e() + 1) * 5))) / 25.0f, 0.0f))) > 0.0f && $$6 < 3.4028235E37f) {
            if (this instanceof aig) {
                ((aig)this).a(amr.M, Math.round($$6 * 10.0f));
            } else if ($$0.d() instanceof aig) {
                ((aig)$$0.d()).a(amr.I, Math.round($$6 * 10.0f));
            }
        }
        if ($$1 <= 0.0f) {
            return 0.0f;
        }
        if ($$0.a(amy.h)) {
            return $$1;
        }
        int $$7 = cki.a(this.bJ(), $$0);
        if ($$7 > 0) {
            $$1 = bej.a($$1, $$7);
        }
        return $$1;
    }

    protected void f(ben $$0, float $$1) {
        bfj bfj2;
        if (this.b($$0)) {
            return;
        }
        $$1 = this.d($$0, $$1);
        float $$2 = $$1 = this.e($$0, $$1);
        $$1 = Math.max($$1 - this.ff(), 0.0f);
        this.y(this.ff() - ($$2 - $$1));
        float $$3 = $$2 - $$1;
        if ($$3 > 0.0f && $$3 < 3.4028235E37f && (bfj2 = $$0.d()) instanceof aig) {
            aig $$4 = (aig)bfj2;
            $$4.a(amr.H, Math.round($$3 * 10.0f));
        }
        if ($$1 == 0.0f) {
            return;
        }
        this.eG().a($$0, $$1);
        this.t(this.er() - $$1);
        this.y(this.ff() - $$1);
        this.a(dgl.o);
    }

    public bek eG() {
        return this.bQ;
    }

    @Nullable
    public bfz eH() {
        if (this.aZ != null) {
            return this.aZ;
        }
        if (this.bW != null) {
            return this.bW;
        }
        return null;
    }

    public final float eI() {
        return (float)this.b(bhg.a);
    }

    public final int eJ() {
        return this.am.b(bL);
    }

    public final void p(int $$0) {
        this.am.b(bL, $$0);
    }

    public final int eK() {
        return this.am.b(bM);
    }

    public final void q(int $$0) {
        this.am.b(bM, $$0);
    }

    private int s() {
        if (bfb.a(this)) {
            return 6 - (1 + bfb.b(this));
        }
        if (this.a(bfc.d)) {
            return 6 + (1 + this.b(bfc.d).e()) * 2;
        }
        return 6;
    }

    public void a(bdw $$0) {
        this.a($$0, false);
    }

    public void a(bdw $$0, boolean $$1) {
        if (!this.aG || this.aI >= this.s() / 2 || this.aI < 0) {
            this.aI = -1;
            this.aG = true;
            this.aH = $$0;
            if (this.dI() instanceof aif) {
                uv $$2 = new uv(this, $$0 == bdw.a ? 0 : 3);
                aid $$3 = ((aif)this.dI()).k();
                if ($$1) {
                    $$3.a(this, $$2);
                } else {
                    $$3.b(this, $$2);
                }
            }
        }
    }

    @Override
    public void c(ben $$0) {
        this.aR.a(1.5f);
        this.ak = 20;
        this.aL = this.aM = 10;
        amg $$1 = this.d($$0);
        if ($$1 != null) {
            this.a($$1, this.eR(), (this.af.i() - this.af.i()) * 0.2f + 1.0f);
        }
        this.a(this.dJ().n(), 0.0f);
        this.cf = $$0;
        this.cg = this.dI().V();
    }

    @Override
    public void b(byte $$0) {
        switch ($$0) {
            case 3: {
                amg $$1 = this.g_();
                if ($$1 != null) {
                    this.a($$1, this.eR(), (this.af.i() - this.af.i()) * 0.2f + 1.0f);
                }
                if (this instanceof byo) break;
                this.t(0.0f);
                this.a(this.dJ().n());
                break;
            }
            case 30: {
                this.a(amh.uR, 0.8f, 0.8f + this.dI().z.i() * 0.4f);
                break;
            }
            case 29: {
                this.a(amh.uQ, 1.0f, 0.8f + this.dI().z.i() * 0.4f);
                break;
            }
            case 46: {
                int $$2 = 128;
                for (int $$3 = 0; $$3 < 128; ++$$3) {
                    double $$4 = (double)$$3 / 127.0;
                    float $$5 = (this.af.i() - 0.5f) * 0.2f;
                    float $$6 = (this.af.i() - 0.5f) * 0.2f;
                    float $$7 = (this.af.i() - 0.5f) * 0.2f;
                    double $$8 = apa.d($$4, this.J, this.dn()) + (this.af.j() - 0.5) * (double)this.dd() * 2.0;
                    double $$9 = apa.d($$4, this.K, this.dp()) + this.af.j() * (double)this.de();
                    double $$10 = apa.d($$4, this.L, this.dt()) + (this.af.j() - 0.5) * (double)this.dd() * 2.0;
                    this.dI().a(iv.X, $$8, $$9, $$10, (double)$$5, (double)$$6, $$7);
                }
                break;
            }
            case 47: {
                this.i(this.c(bfo.a));
                break;
            }
            case 48: {
                this.i(this.c(bfo.b));
                break;
            }
            case 49: {
                this.i(this.c(bfo.f));
                break;
            }
            case 50: {
                this.i(this.c(bfo.e));
                break;
            }
            case 51: {
                this.i(this.c(bfo.d));
                break;
            }
            case 52: {
                this.i(this.c(bfo.c));
                break;
            }
            case 54: {
                cte.b(this);
                break;
            }
            case 55: {
                this.y();
                break;
            }
            case 60: {
                this.x();
                break;
            }
            default: {
                super.b($$0);
            }
        }
    }

    private void x() {
        for (int $$0 = 0; $$0 < 20; ++$$0) {
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            this.dI().a(iv.W, this.d(1.0), this.dq(), this.g(1.0), $$1, $$2, $$3);
        }
    }

    private void y() {
        cfz $$0 = this.c(bfo.b);
        this.a(bfo.b, this.c(bfo.a));
        this.a(bfo.a, $$0);
    }

    @Override
    protected void ax() {
        this.a(this.dJ().m(), 4.0f);
    }

    protected void eL() {
        int $$0 = this.s();
        if (this.aG) {
            ++this.aI;
            if (this.aI >= $$0) {
                this.aI = 0;
                this.aG = false;
            }
        } else {
            this.aI = 0;
        }
        this.aP = (float)this.aI / (float)$$0;
    }

    @Nullable
    public bhc a(bhb $$0) {
        return this.eM().a($$0);
    }

    public double a(he<bhb> $$0) {
        return this.b($$0.a());
    }

    public double b(bhb $$0) {
        return this.eM().c($$0);
    }

    public double b(he<bhb> $$0) {
        return this.c($$0.a());
    }

    public double c(bhb $$0) {
        return this.eM().d($$0);
    }

    public bhd eM() {
        return this.bP;
    }

    public bge eN() {
        return bge.a;
    }

    public cfz eO() {
        return this.c(bfo.a);
    }

    public cfz eP() {
        return this.c(bfo.b);
    }

    public boolean b(cfu $$0) {
        return this.b((cfz $$1) -> $$1.a($$0));
    }

    public boolean b(Predicate<cfz> $$0) {
        return $$0.test(this.eO()) || $$0.test(this.eP());
    }

    public cfz b(bdw $$0) {
        if ($$0 == bdw.a) {
            return this.c(bfo.a);
        }
        if ($$0 == bdw.b) {
            return this.c(bfo.b);
        }
        throw new IllegalArgumentException("Invalid hand " + $$0);
    }

    public void a(bdw $$0, cfz $$1) {
        if ($$0 == bdw.a) {
            this.a(bfo.a, $$1);
        } else if ($$0 == bdw.b) {
            this.a(bfo.b, $$1);
        } else {
            throw new IllegalArgumentException("Invalid hand " + $$0);
        }
    }

    public boolean b(bfo $$0) {
        return !this.c($$0).b();
    }

    @Override
    public abstract Iterable<cfz> bJ();

    public abstract cfz c(bfo var1);

    @Override
    public abstract void a(bfo var1, cfz var2);

    protected void e(cfz $$0) {
        qr $$1 = $$0.v();
        if ($$1 != null) {
            $$0.d().b($$1);
        }
    }

    public float eQ() {
        Iterable<cfz> $$0 = this.bJ();
        int $$1 = 0;
        int $$2 = 0;
        for (cfz $$3 : $$0) {
            if (!$$3.b()) {
                ++$$2;
            }
            ++$$1;
        }
        return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0f;
    }

    @Override
    public void g(boolean $$0) {
        super.g($$0);
        bhc $$1 = this.a(bhg.d);
        if ($$1.a(c) != null) {
            $$1.d(bB);
        }
        if ($$0) {
            $$1.b(bB);
        }
    }

    protected float eR() {
        return 1.0f;
    }

    public float eS() {
        if (this.h_()) {
            return (this.af.i() - this.af.i()) * 0.2f + 1.5f;
        }
        return (this.af.i() - this.af.i()) * 0.2f + 1.0f;
    }

    protected boolean eT() {
        return this.es();
    }

    @Override
    public void g(bfj $$0) {
        if (!this.fy()) {
            super.g($$0);
        }
    }

    private void a(bfj $$0) {
        eei $$4;
        if (this.dD()) {
            eei $$1 = this.dg();
        } else if ($$0.dD() || this.dI().a_($$0.di()).a(amw.aH)) {
            double $$2 = Math.max(this.dp(), $$0.dp());
            eei $$3 = new eei(this.dn(), $$2, this.dt());
        } else {
            $$4 = $$0.b(this);
        }
        this.a($$4.c, $$4.d, $$4.e);
    }

    @Override
    public boolean cz() {
        return this.cy();
    }

    protected float eU() {
        return 0.42f * this.aG() + this.eV();
    }

    public float eV() {
        return this.a(bfc.h) ? 0.1f * ((float)this.b(bfc.h).e() + 1.0f) : 0.0f;
    }

    protected void eW() {
        eei $$0 = this.dl();
        this.o($$0.c, this.eU(), $$0.e);
        if (this.bV()) {
            float $$1 = this.dy() * ((float)Math.PI / 180);
            this.f(this.dl().b(-apa.a($$1) * 0.2f, 0.0, apa.b($$1) * 0.2f));
        }
        this.at = true;
    }

    protected void eX() {
        this.f(this.dl().b(0.0, -0.04f, 0.0));
    }

    protected void c(anl<dxd> $$0) {
        this.f(this.dl().b(0.0, 0.04f, 0.0));
    }

    protected float eY() {
        return 0.8f;
    }

    public boolean a(dxe $$0) {
        return false;
    }

    public void h(eei $$0) {
        if (this.cU()) {
            boolean $$2;
            double $$1 = 0.08;
            boolean bl2 = $$2 = this.dl().d <= 0.0;
            if ($$2 && this.a(bfc.B)) {
                $$1 = 0.01;
            }
            dxe $$3 = this.dI().b_(this.di());
            if (this.aV() && this.dW() && !this.a($$3)) {
                double $$4 = this.dp();
                float $$5 = this.bV() ? 0.9f : this.eY();
                float $$6 = 0.02f;
                float $$7 = cki.f(this);
                if ($$7 > 3.0f) {
                    $$7 = 3.0f;
                }
                if (!this.ay()) {
                    $$7 *= 0.5f;
                }
                if ($$7 > 0.0f) {
                    $$5 += (0.54600006f - $$5) * $$7 / 3.0f;
                    $$6 += (this.fa() - $$6) * $$7 / 3.0f;
                }
                if (this.a(bfc.D)) {
                    $$5 = 0.96f;
                }
                this.a($$6, $$0);
                this.a(bgf.a, this.dl());
                eei $$8 = this.dl();
                if (this.O && this.i_()) {
                    $$8 = new eei($$8.c, 0.2, $$8.e);
                }
                this.f($$8.d($$5, 0.8f, $$5));
                eei $$9 = this.a($$1, $$2, this.dl());
                this.f($$9);
                if (this.O && this.g($$9.c, $$9.d + (double)0.6f - this.dp() + $$4, $$9.e)) {
                    this.o($$9.c, 0.3f, $$9.e);
                }
            } else if (this.bi() && this.dW() && !this.a($$3)) {
                double $$10 = this.dp();
                this.a(0.02f, $$0);
                this.a(bgf.a, this.dl());
                if (this.b(anb.b) <= this.dc()) {
                    this.f(this.dl().d(0.5, 0.8f, 0.5));
                    eei $$11 = this.a($$1, $$2, this.dl());
                    this.f($$11);
                } else {
                    this.f(this.dl().a(0.5));
                }
                if (!this.aR()) {
                    this.f(this.dl().b(0.0, -$$1 / 4.0, 0.0));
                }
                eei $$12 = this.dl();
                if (this.O && this.g($$12.c, $$12.d + (double)0.6f - this.dp() + $$10, $$12.e)) {
                    this.o($$12.c, 0.3f, $$12.e);
                }
            } else if (this.fr()) {
                double $$22;
                double $$23;
                float $$24;
                this.ck();
                eei $$13 = this.dl();
                eei $$14 = this.bD();
                float $$15 = this.dA() * ((float)Math.PI / 180);
                double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
                double $$17 = $$13.h();
                double $$18 = $$14.f();
                double $$19 = Math.cos($$15);
                $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
                $$13 = this.dl().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
                if ($$13.d < 0.0 && $$16 > 0.0) {
                    double $$20 = $$13.d * -0.1 * $$19;
                    $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
                }
                if ($$15 < 0.0f && $$16 > 0.0) {
                    double $$21 = $$17 * (double)(-apa.a($$15)) * 0.04;
                    $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
                }
                if ($$16 > 0.0) {
                    $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
                }
                this.f($$13.d(0.99f, 0.98f, 0.99f));
                this.a(bgf.a, this.dl());
                if (this.O && !this.dI().B && ($$24 = (float)(($$23 = $$17 - ($$22 = this.dl().h())) * 10.0 - 3.0)) > 0.0f) {
                    this.a(this.d((int)$$24), 1.0f, 1.0f);
                    this.a(this.dJ().l(), $$24);
                }
                if (this.ay() && !this.dI().B) {
                    this.b(7, false);
                }
            } else {
                gu $$25 = this.aE();
                float $$26 = this.dI().a_($$25).b().h();
                float $$27 = this.ay() ? $$26 * 0.91f : 0.91f;
                eei $$28 = this.a($$0, $$26);
                double $$29 = $$28.d;
                if (this.a(bfc.y)) {
                    $$29 += (0.05 * (double)(this.b(bfc.y).e() + 1) - $$28.d) * 0.2;
                } else if (!this.dI().B || this.dI().A($$25)) {
                    if (!this.aR()) {
                        $$29 -= $$1;
                    }
                } else {
                    $$29 = this.dp() > (double)this.dI().C_() ? -0.1 : 0.0;
                }
                if (this.ei()) {
                    this.o($$28.c, $$29, $$28.e);
                } else {
                    this.o($$28.c * (double)$$27, $$29 * (double)0.98f, $$28.e * (double)$$27);
                }
            }
        }
        this.q(this instanceof bru);
    }

    private void c(byo $$0, eei $$1) {
        eei $$2 = this.b($$0, $$1);
        this.a($$0, $$2);
        if (this.cU()) {
            this.w(this.e($$0));
            this.h($$2);
        } else {
            this.q(false);
            this.f(eei.b);
            this.az();
        }
    }

    protected void a(byo $$0, eei $$1) {
    }

    protected eei b(byo $$0, eei $$1) {
        return $$1;
    }

    protected float e(byo $$0) {
        return this.fa();
    }

    public void q(boolean $$0) {
        float $$1 = (float)apa.f(this.dn() - this.J, $$0 ? this.dp() - this.K : 0.0, this.dt() - this.L);
        this.v($$1);
    }

    protected void v(float $$0) {
        float $$1 = Math.min($$0 * 4.0f, 1.0f);
        this.aR.a($$1, 0.4f);
    }

    public eei a(eei $$0, float $$1) {
        this.a(this.z($$1), $$0);
        this.f(this.j(this.dl()));
        this.a(bgf.a, this.dl());
        eei $$2 = this.dl();
        if ((this.O || this.bk) && (this.i_() || this.dj().a(cpo.qC) && cvf.a(this))) {
            $$2 = new eei($$2.c, 0.2, $$2.e);
        }
        return $$2;
    }

    public eei a(double $$0, boolean $$1, eei $$2) {
        if (!this.aR() && !this.bV()) {
            double $$4;
            if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
                double $$3 = -0.003;
            } else {
                $$4 = $$2.d - $$0 / 16.0;
            }
            return new eei($$2.c, $$4, $$2.e);
        }
        return $$2;
    }

    private eei j(eei $$0) {
        if (this.i_()) {
            this.n();
            float $$1 = 0.15f;
            double $$2 = apa.a($$0.c, (double)-0.15f, (double)0.15f);
            double $$3 = apa.a($$0.e, (double)-0.15f, (double)0.15f);
            double $$4 = Math.max($$0.d, (double)-0.15f);
            if ($$4 < 0.0 && !this.dj().a(cpo.nS) && this.fq() && this instanceof byo) {
                $$4 = 0.0;
            }
            $$0 = new eei($$2, $$4, $$3);
        }
        return $$0;
    }

    private float z(float $$0) {
        if (this.ay()) {
            return this.fa() * (0.21600002f / ($$0 * $$0 * $$0));
        }
        return this.eZ();
    }

    protected float eZ() {
        return this.cL() instanceof byo ? this.fa() * 0.1f : 0.02f;
    }

    public float fa() {
        return this.ca;
    }

    public void w(float $$0) {
        this.ca = $$0;
    }

    public boolean z(bfj $$0) {
        this.x($$0);
        return false;
    }

    @Override
    public void l() {
        super.l();
        this.D();
        this.G();
        if (!this.dI().B) {
            int $$1;
            int $$0 = this.eJ();
            if ($$0 > 0) {
                if (this.aJ <= 0) {
                    this.aJ = 20 * (30 - $$0);
                }
                --this.aJ;
                if (this.aJ <= 0) {
                    this.p($$0 - 1);
                }
            }
            if (($$1 = this.eK()) > 0) {
                if (this.aK <= 0) {
                    this.aK = 20 * (30 - $$1);
                }
                --this.aK;
                if (this.aK <= 0) {
                    this.q($$1 - 1);
                }
            }
            this.z();
            if (this.ag % 20 == 0) {
                this.eG().c();
            }
            if (this.fy() && !this.I()) {
                this.fz();
            }
        }
        if (!this.dD()) {
            this.b_();
        }
        double $$2 = this.dn() - this.J;
        double $$3 = this.dt() - this.L;
        float $$4 = (float)($$2 * $$2 + $$3 * $$3);
        float $$5 = this.aV;
        float $$6 = 0.0f;
        this.bd = this.be;
        float $$7 = 0.0f;
        if ($$4 > 0.0025000002f) {
            $$7 = 1.0f;
            $$6 = (float)Math.sqrt($$4) * 3.0f;
            float $$8 = (float)apa.d($$3, $$2) * 57.295776f - 90.0f;
            float $$9 = apa.e(apa.g(this.dy()) - $$8);
            $$5 = 95.0f < $$9 && $$9 < 265.0f ? $$8 - 180.0f : $$8;
        }
        if (this.aP > 0.0f) {
            $$5 = this.dy();
        }
        if (!this.ay()) {
            $$7 = 0.0f;
        }
        this.be += ($$7 - this.be) * 0.3f;
        this.dI().ad().a("headTurn");
        $$6 = this.e($$5, $$6);
        this.dI().ad().c();
        this.dI().ad().a("rangeChecks");
        while (this.dy() - this.M < -180.0f) {
            this.M -= 360.0f;
        }
        while (this.dy() - this.M >= 180.0f) {
            this.M += 360.0f;
        }
        while (this.aV - this.aW < -180.0f) {
            this.aW -= 360.0f;
        }
        while (this.aV - this.aW >= 180.0f) {
            this.aW += 360.0f;
        }
        while (this.dA() - this.N < -180.0f) {
            this.N -= 360.0f;
        }
        while (this.dA() - this.N >= 180.0f) {
            this.N += 360.0f;
        }
        while (this.aX - this.aY < -180.0f) {
            this.aY -= 360.0f;
        }
        while (this.aX - this.aY >= 180.0f) {
            this.aY += 360.0f;
        }
        this.dI().ad().c();
        this.bf += $$6;
        this.by = this.fr() ? ++this.by : 0;
        if (this.fy()) {
            this.b_(0.0f);
        }
    }

    private void z() {
        Map<bfo, cfz> $$0 = this.A();
        if ($$0 != null) {
            this.a($$0);
            if (!$$0.isEmpty()) {
                this.b($$0);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    private Map<bfo, cfz> A() {
        EnumMap $$0 = null;
        block4: for (bfo $$1 : bfo.values()) {
            void $$4;
            switch ($$1.a()) {
                case a: {
                    cfz $$2 = this.f($$1);
                    break;
                }
                case b: {
                    cfz $$3 = this.e($$1);
                    break;
                }
                default: {
                    continue block4;
                }
            }
            cfz $$5 = this.c($$1);
            if (!this.a((cfz)$$4, $$5)) continue;
            if ($$0 == null) {
                $$0 = Maps.newEnumMap(bfo.class);
            }
            $$0.put($$1, $$5);
            if (!$$4.b()) {
                this.eM().a($$4.a($$1));
            }
            if ($$5.b()) continue;
            this.eM().b($$5.a($$1));
        }
        return $$0;
    }

    public boolean a(cfz $$0, cfz $$1) {
        return !cfz.a($$1, $$0);
    }

    private void a(Map<bfo, cfz> $$0) {
        cfz $$1 = $$0.get((Object)bfo.a);
        cfz $$2 = $$0.get((Object)bfo.b);
        if ($$1 != null && $$2 != null && cfz.a($$1, this.f(bfo.b)) && cfz.a($$2, this.f(bfo.a))) {
            ((aif)this.dI()).k().b(this, new vu(this, 55));
            $$0.remove((Object)bfo.a);
            $$0.remove((Object)bfo.b);
            this.c(bfo.a, $$1.p());
            this.c(bfo.b, $$2.p());
        }
    }

    private void b(Map<bfo, cfz> $$0) {
        ArrayList $$12 = Lists.newArrayListWithCapacity((int)$$0.size());
        $$0.forEach(($$1, $$2) -> {
            cfz $$3 = $$2.p();
            $$12.add(Pair.of((Object)$$1, (Object)$$3));
            switch ($$1.a()) {
                case a: {
                    this.c((bfo)((Object)$$1), $$3);
                    break;
                }
                case b: {
                    this.b((bfo)((Object)$$1), $$3);
                }
            }
        });
        ((aif)this.dI()).k().b(this, new xz(this.af(), $$12));
    }

    private cfz e(bfo $$0) {
        return this.bT.get($$0.b());
    }

    private void b(bfo $$0, cfz $$1) {
        this.bT.set($$0.b(), $$1);
    }

    private cfz f(bfo $$0) {
        return this.bS.get($$0.b());
    }

    private void c(bfo $$0, cfz $$1) {
        this.bS.set($$0.b(), $$1);
    }

    protected float e(float $$0, float $$1) {
        boolean $$4;
        float $$2 = apa.g($$0 - this.aV);
        this.aV += $$2 * 0.3f;
        float $$3 = apa.g(this.dy() - this.aV);
        if (Math.abs($$3) > 50.0f) {
            this.aV += $$3 - (float)(apa.j((double)$$3) * 50);
        }
        boolean bl2 = $$4 = $$3 < -90.0f || $$3 >= 90.0f;
        if ($$4) {
            $$1 *= -1.0f;
        }
        return $$1;
    }

    /*
     * Unable to fully structure code
     */
    public void b_() {
        if (this.cb > 0) {
            --this.cb;
        }
        if (this.cU()) {
            this.bo = 0;
            this.f(this.dn(), this.dp(), this.dt());
        }
        if (this.bo > 0) {
            $$0 = this.dn() + (this.bp - this.dn()) / (double)this.bo;
            $$1 = this.dp() + (this.bq - this.dp()) / (double)this.bo;
            $$2 = this.dt() + (this.br - this.dt()) / (double)this.bo;
            $$3 = apa.d(this.bs - (double)this.dy());
            this.a_(this.dy() + (float)$$3 / (float)this.bo);
            this.b_(this.dA() + (float)(this.bt - (double)this.dA()) / (float)this.bo);
            --this.bo;
            this.e($$0, $$1, $$2);
            this.a(this.dy(), this.dA());
        } else if (!this.cV()) {
            this.f(this.dl().a(0.98));
        }
        if (this.bv > 0) {
            this.aX += (float)apa.d(this.bu - (double)this.aX) / (float)this.bv;
            --this.bv;
        }
        $$4 = this.dl();
        $$5 = $$4.c;
        $$6 = $$4.d;
        $$7 = $$4.e;
        if (Math.abs($$4.c) < 0.003) {
            $$5 = 0.0;
        }
        if (Math.abs($$4.d) < 0.003) {
            $$6 = 0.0;
        }
        if (Math.abs($$4.e) < 0.003) {
            $$7 = 0.0;
        }
        this.o($$5, $$6, $$7);
        this.dI().ad().a("ai");
        if (this.eT()) {
            this.bk = false;
            this.bl = 0.0f;
            this.bn = 0.0f;
        } else if (this.cV()) {
            this.dI().ad().a("newAi");
            this.fc();
            this.dI().ad().c();
        }
        this.dI().ad().c();
        this.dI().ad().a("jump");
        if (this.bk && this.dW()) {
            if (this.bi()) {
                $$8 = this.b(anb.b);
            } else {
                $$9 = this.b(anb.a);
            }
            $$10 = this.aV() != false && $$9 > 0.0;
            $$11 = this.dc();
            if ($$10 && (!this.ay() || $$9 > $$11)) {
                this.c(anb.a);
            } else if (this.bi() && (!this.ay() || $$9 > $$11)) {
                this.c(anb.b);
            } else if ((this.ay() || $$10 && $$9 <= $$11) && this.cb == 0) {
                this.eW();
                this.cb = 10;
            }
        } else {
            this.cb = 0;
        }
        this.dI().ad().c();
        this.dI().ad().a("travel");
        this.bl *= 0.98f;
        this.bn *= 0.98f;
        this.C();
        $$12 = this.cE();
        $$13 = new eei(this.bl, this.bm, this.bn);
        if (this.a(bfc.B) || this.a(bfc.y)) {
            this.n();
        }
        if (!((var11_15 = this.cL()) instanceof byo)) ** GOTO lbl-1000
        $$14 = (byo)var11_15;
        if (this.bs()) {
            this.c($$14, $$13);
        } else lbl-1000:
        // 2 sources

        {
            this.h($$13);
        }
        this.dI().ad().c();
        this.dI().ad().a("freezing");
        if (!this.dI().B && !this.es()) {
            $$15 = this.cg();
            if (this.az && this.dw()) {
                this.k(Math.min(this.cj(), $$15 + 1));
            } else {
                this.k(Math.max(0, $$15 - 2));
            }
        }
        this.dT();
        this.dU();
        if (!this.dI().B && this.ag % 40 == 0 && this.ci() && this.dw()) {
            this.a(this.dJ().t(), 1.0f);
        }
        this.dI().ad().c();
        this.dI().ad().a("push");
        if (this.bz > 0) {
            --this.bz;
            this.a($$12, this.cE());
        }
        this.fd();
        this.dI().ad().c();
        if (!this.dI().B && this.fb() && this.aX()) {
            this.a(this.dJ().h(), 1.0f);
        }
    }

    public boolean fb() {
        return false;
    }

    private void C() {
        boolean $$02 = this.i(7);
        if ($$02 && !this.ay() && !this.bM() && !this.a(bfc.y)) {
            cfz $$1 = this.c(bfo.e);
            if ($$1.a(cgc.nh) && cet.d($$1)) {
                $$02 = true;
                int $$2 = this.by + 1;
                if (!this.dI().B && $$2 % 10 == 0) {
                    int $$3 = $$2 / 10;
                    if ($$3 % 2 == 0) {
                        $$1.a(1, this, (T $$0) -> $$0.d(bfo.e));
                    }
                    this.a(dgl.n);
                }
            } else {
                $$02 = false;
            }
        } else {
            $$02 = false;
        }
        if (!this.dI().B) {
            this.b(7, $$02);
        }
    }

    protected void fc() {
    }

    protected void fd() {
        if (this.dI().r_()) {
            this.dI().a(dfz.a(byo.class), this.cE(), bfm.a(this)).forEach(this::A);
            return;
        }
        List<bfj> $$0 = this.dI().a((bfj)this, this.cE(), bfm.a(this));
        if (!$$0.isEmpty()) {
            int $$1 = this.dI().X().c(cmi.t);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
                int $$2 = 0;
                for (int $$3 = 0; $$3 < $$0.size(); ++$$3) {
                    if ($$0.get($$3).bM()) continue;
                    ++$$2;
                }
                if ($$2 > $$1 - 1) {
                    this.a(this.dJ().g(), 6.0f);
                }
            }
            for (int $$4 = 0; $$4 < $$0.size(); ++$$4) {
                bfj $$5 = $$0.get($$4);
                this.A($$5);
            }
        }
    }

    protected void a(eed $$0, eed $$1) {
        eed $$2 = $$0.b($$1);
        List<bfj> $$3 = this.dI().a_(this, $$2);
        if (!$$3.isEmpty()) {
            for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
                bfj $$5 = $$3.get($$4);
                if (!($$5 instanceof bfz)) continue;
                this.g((bfz)$$5);
                this.bz = 0;
                this.f(this.dl().a(-0.2));
                break;
            }
        } else if (this.O) {
            this.bz = 0;
        }
        if (!this.dI().B && this.bz <= 0) {
            this.c(4, false);
        }
    }

    protected void A(bfj $$0) {
        $$0.g(this);
    }

    protected void g(bfz $$0) {
    }

    public boolean fe() {
        return (this.am.b(u) & 4) != 0;
    }

    @Override
    public void Y() {
        bfj $$0 = this.cW();
        super.Y();
        if ($$0 != null && $$0 != this.cW() && !this.dI().B) {
            this.a($$0);
        }
    }

    @Override
    public void bv() {
        super.bv();
        this.bd = this.be;
        this.be = 0.0f;
        this.n();
    }

    @Override
    public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
        this.bp = $$0;
        this.bq = $$1;
        this.br = $$2;
        this.bs = $$3;
        this.bt = $$4;
        this.bo = $$5;
    }

    @Override
    public void a(float $$0, int $$1) {
        this.bu = $$0;
        this.bv = $$1;
    }

    public void r(boolean $$0) {
        this.bk = $$0;
    }

    public void a(bvh $$0) {
        bfj $$1 = $$0.v();
        if ($$1 instanceof aig) {
            ai.O.a((aig)$$1, $$0.j(), this);
        }
    }

    public void a(bfj $$0, int $$1) {
        if (!$$0.dD() && !this.dI().B && ($$0 instanceof bvh || $$0 instanceof byu || $$0 instanceof bfp)) {
            ((aif)this.dI()).k().b($$0, new yr($$0.af(), this.af(), $$1));
        }
    }

    public boolean B(bfj $$0) {
        if ($$0.dI() != this.dI()) {
            return false;
        }
        eei $$1 = new eei(this.dn(), this.dr(), this.dt());
        eei $$2 = new eei($$0.dn(), $$0.dr(), $$0.dt());
        if ($$2.f($$1) > 128.0) {
            return false;
        }
        return this.dI().a(new clv($$1, $$2, clv.a.a, clv.b.a, this)).c() == eeg.a.a;
    }

    @Override
    public float h(float $$0) {
        if ($$0 == 1.0f) {
            return this.aX;
        }
        return apa.i($$0, this.aY, this.aX);
    }

    public float x(float $$0) {
        float $$1 = this.aP - this.aO;
        if ($$1 < 0.0f) {
            $$1 += 1.0f;
        }
        return this.aO + $$1 * $$0;
    }

    @Override
    public boolean bo() {
        return !this.dD();
    }

    @Override
    public boolean bp() {
        return this.bs() && !this.G_() && !this.i_();
    }

    @Override
    public float cm() {
        return this.aX;
    }

    @Override
    public void n(float $$0) {
        this.aX = $$0;
    }

    @Override
    public void o(float $$0) {
        this.aV = $$0;
    }

    @Override
    protected eei a(ha.a $$0, l.a $$1) {
        return bfz.i(super.a($$0, $$1));
    }

    public static eei i(eei $$0) {
        return new eei($$0.c, $$0.d, 0.0);
    }

    public float ff() {
        return this.cc;
    }

    public void y(float $$0) {
        if ($$0 < 0.0f) {
            $$0 = 0.0f;
        }
        this.cc = $$0;
    }

    public void Q_() {
    }

    public void F_() {
    }

    protected void fg() {
        this.bV = true;
    }

    public abstract bft fh();

    public boolean fi() {
        return (this.am.b(u) & 1) > 0;
    }

    public bdw fj() {
        return (this.am.b(u) & 2) > 0 ? bdw.b : bdw.a;
    }

    private void D() {
        if (this.fi()) {
            if (cfz.b(this.b(this.fj()), this.bw)) {
                this.bw = this.b(this.fj());
                this.a(this.bw);
            } else {
                this.fo();
            }
        }
    }

    protected void a(cfz $$0) {
        $$0.b(this.dI(), this, this.fl());
        if (this.E()) {
            this.b($$0, 5);
        }
        if (--this.bx == 0 && !this.dI().B && !$$0.t()) {
            this.Z_();
        }
    }

    private boolean E() {
        int $$0 = this.fl();
        cbc $$1 = this.bw.d().v();
        boolean $$2 = $$1 != null && $$1.e();
        return ($$2 |= $$0 <= this.bw.r() - 7) && $$0 % 4 == 0;
    }

    private void G() {
        this.ci = this.ch;
        this.ch = this.bX() ? Math.min(1.0f, this.ch + 0.09f) : Math.max(0.0f, this.ch - 0.09f);
    }

    protected void c(int $$0, boolean $$1) {
        int $$2 = this.am.b(u).byteValue();
        $$2 = $$1 ? ($$2 |= $$0) : ($$2 &= ~$$0);
        this.am.b(u, (byte)$$2);
    }

    public void c(bdw $$0) {
        cfz $$1 = this.b($$0);
        if ($$1.b() || this.fi()) {
            return;
        }
        this.bw = $$1;
        this.bx = $$1.r();
        if (!this.dI().B) {
            this.c(1, true);
            this.c(2, $$0 == bdw.b);
            this.a(dgl.E);
        }
    }

    @Override
    public void a(aby<?> $$0) {
        super.a($$0);
        if (bN.equals($$0)) {
            if (this.dI().B) {
                this.fw().ifPresent(this::a);
            }
        } else if (u.equals($$0) && this.dI().B) {
            if (this.fi() && this.bw.b()) {
                this.bw = this.b(this.fj());
                if (!this.bw.b()) {
                    this.bx = this.bw.r();
                }
            } else if (!this.fi() && !this.bw.b()) {
                this.bw = cfz.b;
                this.bx = 0;
            }
        }
    }

    @Override
    public void a(eb.a $$0, eei $$1) {
        super.a($$0, $$1);
        this.aY = this.aX;
        this.aW = this.aV = this.aX;
    }

    protected void b(cfz $$0, int $$1) {
        if ($$0.b() || !this.fi()) {
            return;
        }
        if ($$0.s() == chs.c) {
            this.a(this.c($$0), 0.5f, this.dI().z.i() * 0.1f + 0.9f);
        }
        if ($$0.s() == chs.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5f + 0.5f * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2f + 1.0f);
        }
    }

    private void a(cfz $$0, int $$1) {
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            eei $$3 = new eei(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            $$3 = $$3.a(-this.dA() * ((float)Math.PI / 180));
            $$3 = $$3.b(-this.dy() * ((float)Math.PI / 180));
            double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
            eei $$5 = new eei(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
            $$5 = $$5.a(-this.dA() * ((float)Math.PI / 180));
            $$5 = $$5.b(-this.dy() * ((float)Math.PI / 180));
            $$5 = $$5.b(this.dn(), this.dr(), this.dt());
            this.dI().a(new ir(iv.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
        }
    }

    protected void Z_() {
        if (this.dI().B && !this.fi()) {
            return;
        }
        bdw $$0 = this.fj();
        if (!this.bw.equals(this.b($$0))) {
            this.fn();
            return;
        }
        if (!this.bw.b() && this.fi()) {
            this.b(this.bw, 16);
            cfz $$1 = this.bw.a(this.dI(), this);
            if ($$1 != this.bw) {
                this.a($$0, $$1);
            }
            this.fo();
        }
    }

    public cfz fk() {
        return this.bw;
    }

    public int fl() {
        return this.bx;
    }

    public int fm() {
        if (this.fi()) {
            return this.bw.r() - this.fl();
        }
        return 0;
    }

    public void fn() {
        if (!this.bw.b()) {
            this.bw.a(this.dI(), this, this.fl());
            if (this.bw.t()) {
                this.D();
            }
        }
        this.fo();
    }

    public void fo() {
        if (!this.dI().B) {
            boolean $$0 = this.fi();
            this.c(1, false);
            if ($$0) {
                this.a(dgl.D);
            }
        }
        this.bw = cfz.b;
        this.bx = 0;
    }

    public boolean fp() {
        if (!this.fi() || this.bw.b()) {
            return false;
        }
        cfu $$0 = this.bw.d();
        if ($$0.c(this.bw) != chs.d) {
            return false;
        }
        return $$0.b(this.bw) - this.bx >= 5;
    }

    public boolean fq() {
        return this.bP();
    }

    public boolean fr() {
        return this.i(7);
    }

    @Override
    public boolean bX() {
        return super.bX() || !this.fr() && this.c(bgl.b);
    }

    public int fs() {
        return this.by;
    }

    public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
        double $$4 = this.dn();
        double $$5 = this.dp();
        double $$6 = this.dt();
        double $$7 = $$1;
        boolean $$8 = false;
        gu $$9 = gu.a($$0, $$7, $$2);
        cmm $$10 = this.dI();
        if ($$10.A($$9)) {
            boolean $$11 = false;
            while (!$$11 && $$9.v() > $$10.C_()) {
                gu $$12 = $$9.d();
                dcb $$13 = $$10.a_($$12);
                if ($$13.d()) {
                    $$11 = true;
                    continue;
                }
                $$7 -= 1.0;
                $$9 = $$12;
            }
            if ($$11) {
                this.b($$0, $$7, $$2);
                if ($$10.g(this) && !$$10.d(this.cE())) {
                    $$8 = true;
                }
            }
        }
        if (!$$8) {
            this.b($$4, $$5, $$6);
            return false;
        }
        if ($$3) {
            $$10.a((bfj)this, (byte)46);
        }
        if (this instanceof bgi) {
            ((bgi)this).J().n();
        }
        return true;
    }

    public boolean ft() {
        return true;
    }

    public boolean fu() {
        return true;
    }

    public void a(gu $$0, boolean $$1) {
    }

    public boolean f(cfz $$0) {
        return false;
    }

    @Override
    public bfk a(bgl $$0) {
        return $$0 == bgl.c ? aE : super.a($$0).a(this.dV());
    }

    public ImmutableList<bgl> fv() {
        return ImmutableList.of((Object)((Object)bgl.a));
    }

    public eed g(bgl $$0) {
        bfk $$1 = this.a($$0);
        return new eed(-$$1.a / 2.0f, 0.0, -$$1.a / 2.0f, $$1.a / 2.0f, $$1.b, $$1.a / 2.0f);
    }

    @Override
    public boolean cq() {
        return super.cq() && !this.fy();
    }

    public Optional<gu> fw() {
        return this.am.b(bN);
    }

    public void g(gu $$0) {
        this.am.b(bN, Optional.of($$0));
    }

    public void fx() {
        this.am.b(bN, Optional.empty());
    }

    public boolean fy() {
        return this.fw().isPresent();
    }

    public void b(gu $$0) {
        dcb $$1;
        if (this.bM()) {
            this.Y();
        }
        if (($$1 = this.dI().a_($$0)).b() instanceof cpg) {
            this.dI().a($$0, (dcb)$$1.a(cpg.b, true), 3);
        }
        this.b(bgl.c);
        this.a($$0);
        this.g($$0);
        this.f(eei.b);
        this.at = true;
    }

    private void a(gu $$0) {
        this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
    }

    private boolean I() {
        return this.fw().map($$0 -> this.dI().a_((gu)$$0).b() instanceof cpg).orElse(false);
    }

    public void fz() {
        this.fw().filter(this.dI()::A).ifPresent($$0 -> {
            dcb $$1 = this.dI().a_((gu)$$0);
            if ($$1.b() instanceof cpg) {
                ha $$2 = $$1.c(cpg.aC);
                this.dI().a((gu)$$0, (dcb)$$1.a(cpg.b, false), 3);
                eei $$3 = cpg.a(this.ae(), (clw)this.dI(), $$0, $$2, this.dy()).orElseGet(() -> {
                    gu $$1 = $$0.c();
                    return new eei((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5);
                });
                eei $$4 = eei.c($$0).d($$3).d();
                float $$5 = (float)apa.d(apa.d($$4.e, $$4.c) * 57.2957763671875 - 90.0);
                this.e($$3.c, $$3.d, $$3.e);
                this.a_($$5);
                this.b_(0.0f);
            }
        });
        eei $$02 = this.dg();
        this.b(bgl.a);
        this.e($$02.c, $$02.d, $$02.e);
        this.fx();
    }

    @Nullable
    public ha fA() {
        gu $$0 = this.fw().orElse(null);
        return $$0 != null ? cpg.a(this.dI(), $$0) : null;
    }

    @Override
    public boolean bt() {
        return !this.fy() && super.bt();
    }

    @Override
    protected final float a(bgl $$0, bfk $$1) {
        return $$0 == bgl.c ? 0.2f : this.b($$0, $$1);
    }

    protected float b(bgl $$0, bfk $$1) {
        return super.a($$0, $$1);
    }

    public cfz g(cfz $$0) {
        return cfz.b;
    }

    public cfz a(cmm $$0, cfz $$1) {
        if ($$1.M()) {
            $$0.a(null, this.dn(), this.dp(), this.dt(), this.d($$1), ami.g, 1.0f, 1.0f + ($$0.z.i() - $$0.z.i()) * 0.4f);
            this.a($$1, $$0, this);
            if (!(this instanceof byo) || !((byo)this).fO().d) {
                $$1.h(1);
            }
            this.a(dgl.m);
        }
        return $$1;
    }

    private void a(cfz $$0, cmm $$1, bfz $$2) {
        cfu $$3 = $$0.d();
        if ($$3.u()) {
            List<Pair<bfa, Float>> $$4 = $$3.v().f();
            for (Pair<bfa, Float> $$5 : $$4) {
                if ($$1.B || $$5.getFirst() == null || !($$1.z.i() < ((Float)$$5.getSecond()).floatValue())) continue;
                $$2.b(new bfa((bfa)$$5.getFirst()));
            }
        }
    }

    private static byte g(bfo $$0) {
        switch ($$0) {
            case a: {
                return 47;
            }
            case b: {
                return 48;
            }
            case f: {
                return 49;
            }
            case e: {
                return 50;
            }
            case c: {
                return 52;
            }
            case d: {
                return 51;
            }
        }
        return 47;
    }

    public void d(bfo $$0) {
        this.dI().a((bfj)this, bfz.g($$0));
    }

    public void d(bdw $$0) {
        this.d($$0 == bdw.a ? bfo.a : bfo.b);
    }

    @Override
    public eed j_() {
        if (this.c(bfo.f).a(cgc.tw)) {
            float $$0 = 0.5f;
            return this.cE().c(0.5, 0.5, 0.5);
        }
        return super.j_();
    }

    public static bfo h(cfz $$0) {
        cfa $$1 = cfa.c_($$0);
        if ($$1 != null) {
            return $$1.g();
        }
        return bfo.a;
    }

    private static bgs a(bfz $$0, bfo $$12) {
        if ($$12 == bfo.f || $$12 == bfo.a || $$12 == bfo.b) {
            return bgs.a($$0, $$12);
        }
        return bgs.a($$0, $$12, $$1 -> $$1.b() || bgb.h($$1) == $$12);
    }

    @Nullable
    private static bfo r(int $$0) {
        if ($$0 == 100 + bfo.f.b()) {
            return bfo.f;
        }
        if ($$0 == 100 + bfo.e.b()) {
            return bfo.e;
        }
        if ($$0 == 100 + bfo.d.b()) {
            return bfo.d;
        }
        if ($$0 == 100 + bfo.c.b()) {
            return bfo.c;
        }
        if ($$0 == 98) {
            return bfo.a;
        }
        if ($$0 == 99) {
            return bfo.b;
        }
        return null;
    }

    @Override
    public bgs a_(int $$0) {
        bfo $$1 = bfz.r($$0);
        if ($$1 != null) {
            return bfz.a(this, $$1);
        }
        return super.a_($$0);
    }

    @Override
    public boolean dw() {
        if (this.G_()) {
            return false;
        }
        boolean $$0 = !this.c(bfo.f).a(ane.az) && !this.c(bfo.e).a(ane.az) && !this.c(bfo.d).a(ane.az) && !this.c(bfo.c).a(ane.az);
        return $$0 && super.dw();
    }

    @Override
    public boolean ca() {
        return !this.dI().r_() && this.a(bfc.x) || super.ca();
    }

    @Override
    public float dz() {
        return this.aV;
    }

    @Override
    public void a(us $$0) {
        double $$1 = $$0.e();
        double $$2 = $$0.f();
        double $$3 = $$0.g();
        float $$4 = $$0.l();
        float $$5 = $$0.k();
        this.f($$1, $$2, $$3);
        this.aV = $$0.m();
        this.aX = $$0.m();
        this.aW = this.aV;
        this.aY = this.aX;
        this.e($$0.a());
        this.a_($$0.c());
        this.a($$1, $$2, $$3, $$4, $$5);
        this.o($$0.h(), $$0.i(), $$0.j());
    }

    public boolean fB() {
        return this.eO().d() instanceof cdo;
    }

    @Override
    public float dC() {
        float $$0 = super.dC();
        return this.cL() instanceof byo ? Math.max($$0, 1.0f) : $$0;
    }

    public record a(amg a, amg b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "small;big", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "small;big", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "small;big", "a", "b"}, this, $$0);
        }
    }
}

