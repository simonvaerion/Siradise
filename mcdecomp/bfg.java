/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bfg
extends bfj
implements bgx {
    private static final Logger d = LogUtils.getLogger();
    private static final int e = 5;
    private static final aby<Float> f = acb.a(bfg.class, aca.d);
    private static final aby<Integer> g = acb.a(bfg.class, aca.b);
    private static final aby<Boolean> h = acb.a(bfg.class, aca.k);
    private static final aby<it> i = acb.a(bfg.class, aca.l);
    private static final float j = 32.0f;
    private static final float k = 0.5f;
    private static final float l = 3.0f;
    public static final float b = 6.0f;
    public static final float c = 0.5f;
    private chw m = chz.b;
    private final List<bfa> n = Lists.newArrayList();
    private final Map<bfj, Integer> o = Maps.newHashMap();
    private int p = 600;
    private int q = 20;
    private int r = 20;
    private boolean s;
    private int t;
    private float u;
    private float aD;
    @Nullable
    private bfz aE;
    @Nullable
    private UUID aF;

    public bfg(bfn<? extends bfg> $$0, cmm $$1) {
        super($$0, $$1);
        this.ae = true;
    }

    public bfg(cmm $$0, double $$1, double $$2, double $$3) {
        this((bfn<? extends bfg>)bfn.c, $$0);
        this.e($$1, $$2, $$3);
    }

    @Override
    protected void a_() {
        this.aj().a(g, 0);
        this.aj().a(f, Float.valueOf(3.0f));
        this.aj().a(h, false);
        this.aj().a(i, iv.v);
    }

    public void a(float $$0) {
        if (!this.dI().B) {
            this.aj().b(f, Float.valueOf(apa.a($$0, 0.0f, 32.0f)));
        }
    }

    @Override
    public void d_() {
        double $$0 = this.dn();
        double $$1 = this.dp();
        double $$2 = this.dt();
        super.d_();
        this.e($$0, $$1, $$2);
    }

    public float h() {
        return this.aj().b(f).floatValue();
    }

    public void a(chw $$0) {
        this.m = $$0;
        if (!this.s) {
            this.w();
        }
    }

    private void w() {
        if (this.m == chz.b && this.n.isEmpty()) {
            this.aj().b(g, 0);
        } else {
            this.aj().b(g, chy.a(chy.a(this.m, this.n)));
        }
    }

    public void a(bfa $$0) {
        this.n.add($$0);
        if (!this.s) {
            this.w();
        }
    }

    public int i() {
        return this.aj().b(g);
    }

    public void a(int $$0) {
        this.s = true;
        this.aj().b(g, $$0);
    }

    public it j() {
        return this.aj().b(i);
    }

    public void a(it $$0) {
        this.aj().b(i, $$0);
    }

    protected void a(boolean $$0) {
        this.aj().b(h, $$0);
    }

    public boolean k() {
        return this.aj().b(h);
    }

    public int m() {
        return this.p;
    }

    public void b(int $$0) {
        this.p = $$0;
    }

    @Override
    public void l() {
        block20: {
            ArrayList $$24;
            float $$1;
            block21: {
                boolean $$23;
                boolean $$02;
                block19: {
                    float $$6;
                    int $$5;
                    super.l();
                    $$02 = this.k();
                    $$1 = this.h();
                    if (!this.dI().B) break block19;
                    if ($$02 && this.af.h()) {
                        return;
                    }
                    it $$2 = this.j();
                    if ($$02) {
                        int $$3 = 2;
                        float $$4 = 0.2f;
                    } else {
                        $$5 = apa.f((float)Math.PI * $$1 * $$1);
                        $$6 = $$1;
                    }
                    for (int $$7 = 0; $$7 < $$5; ++$$7) {
                        double $$22;
                        double $$21;
                        double $$20;
                        float $$8 = this.af.i() * ((float)Math.PI * 2);
                        float $$9 = apa.c(this.af.i()) * $$6;
                        double $$10 = this.dn() + (double)(apa.b($$8) * $$9);
                        double $$11 = this.dp();
                        double $$12 = this.dt() + (double)(apa.a($$8) * $$9);
                        if ($$2.b() == iv.v) {
                            int $$13 = $$02 && this.af.h() ? 0xFFFFFF : this.i();
                            double $$14 = (float)($$13 >> 16 & 0xFF) / 255.0f;
                            double $$15 = (float)($$13 >> 8 & 0xFF) / 255.0f;
                            double $$16 = (float)($$13 & 0xFF) / 255.0f;
                        } else if ($$02) {
                            double $$17 = 0.0;
                            double $$18 = 0.0;
                            double $$19 = 0.0;
                        } else {
                            $$20 = (0.5 - this.af.j()) * 0.15;
                            $$21 = 0.01f;
                            $$22 = (0.5 - this.af.j()) * 0.15;
                        }
                        this.dI().b($$2, $$10, $$11, $$12, $$20, $$21, $$22);
                    }
                    break block20;
                }
                if (this.ag >= this.q + this.p) {
                    this.ai();
                    return;
                }
                boolean bl2 = $$23 = this.ag < this.q;
                if ($$02 != $$23) {
                    this.a($$23);
                }
                if ($$23) {
                    return;
                }
                if (this.aD != 0.0f) {
                    if (($$1 += this.aD) < 0.5f) {
                        this.ai();
                        return;
                    }
                    this.a($$1);
                }
                if (this.ag % 5 != 0) break block20;
                this.o.entrySet().removeIf($$0 -> this.ag >= (Integer)$$0.getValue());
                $$24 = Lists.newArrayList();
                for (bfa $$25 : this.m.a()) {
                    $$24.add(new bfa($$25.c(), $$25.a($$0 -> $$0 / 4), $$25.e(), $$25.f(), $$25.g()));
                }
                $$24.addAll(this.n);
                if (!$$24.isEmpty()) break block21;
                this.o.clear();
                break block20;
            }
            List<bfz> $$26 = this.dI().a(bfz.class, this.cE());
            if ($$26.isEmpty()) break block20;
            for (bfz $$27 : $$26) {
                double $$29;
                double $$28;
                double $$30;
                if (this.o.containsKey($$27) || !$$27.ft() || !(($$30 = ($$28 = $$27.dn() - this.dn()) * $$28 + ($$29 = $$27.dt() - this.dt()) * $$29) <= (double)($$1 * $$1))) continue;
                this.o.put($$27, this.ag + this.r);
                for (bfa $$31 : $$24) {
                    if ($$31.c().a()) {
                        $$31.c().a(this, this.s(), $$27, $$31.e(), 0.5);
                        continue;
                    }
                    $$27.b(new bfa($$31), this);
                }
                if (this.u != 0.0f) {
                    if (($$1 += this.u) < 0.5f) {
                        this.ai();
                        return;
                    }
                    this.a($$1);
                }
                if (this.t == 0) continue;
                this.p += this.t;
                if (this.p > 0) continue;
                this.ai();
                return;
            }
        }
    }

    public float o() {
        return this.u;
    }

    public void b(float $$0) {
        this.u = $$0;
    }

    public float p() {
        return this.aD;
    }

    public void c(float $$0) {
        this.aD = $$0;
    }

    public int q() {
        return this.t;
    }

    public void c(int $$0) {
        this.t = $$0;
    }

    public int r() {
        return this.q;
    }

    public void d(int $$0) {
        this.q = $$0;
    }

    public void a(@Nullable bfz $$0) {
        this.aE = $$0;
        this.aF = $$0 == null ? null : $$0.ct();
    }

    @Nullable
    public bfz s() {
        bfj $$0;
        if (this.aE == null && this.aF != null && this.dI() instanceof aif && ($$0 = ((aif)this.dI()).a(this.aF)) instanceof bfz) {
            this.aE = (bfz)$$0;
        }
        return this.aE;
    }

    @Override
    protected void a(qr $$0) {
        this.ag = $$0.h("Age");
        this.p = $$0.h("Duration");
        this.q = $$0.h("WaitTime");
        this.r = $$0.h("ReapplicationDelay");
        this.t = $$0.h("DurationOnUse");
        this.u = $$0.j("RadiusOnUse");
        this.aD = $$0.j("RadiusPerTick");
        this.a($$0.j("Radius"));
        if ($$0.b("Owner")) {
            this.aF = $$0.a("Owner");
        }
        if ($$0.b("Particle", 8)) {
            try {
                this.a(em.a(new StringReader($$0.l("Particle")), jb.k.p()));
            }
            catch (CommandSyntaxException $$1) {
                d.warn("Couldn't load custom particle {}", (Object)$$0.l("Particle"), (Object)$$1);
            }
        }
        if ($$0.b("Color", 99)) {
            this.a($$0.h("Color"));
        }
        if ($$0.b("Potion", 8)) {
            this.a(chy.c($$0));
        }
        if ($$0.b("Effects", 9)) {
            qx $$2 = $$0.c("Effects", 10);
            this.n.clear();
            for (int $$3 = 0; $$3 < $$2.size(); ++$$3) {
                bfa $$4 = bfa.b($$2.a($$3));
                if ($$4 == null) continue;
                this.a($$4);
            }
        }
    }

    @Override
    protected void b(qr $$0) {
        $$0.a("Age", this.ag);
        $$0.a("Duration", this.p);
        $$0.a("WaitTime", this.q);
        $$0.a("ReapplicationDelay", this.r);
        $$0.a("DurationOnUse", this.t);
        $$0.a("RadiusOnUse", this.u);
        $$0.a("RadiusPerTick", this.aD);
        $$0.a("Radius", this.h());
        $$0.a("Particle", this.j().a());
        if (this.aF != null) {
            $$0.a("Owner", this.aF);
        }
        if (this.s) {
            $$0.a("Color", this.i());
        }
        if (this.m != chz.b) {
            $$0.a("Potion", jb.j.b(this.m).toString());
        }
        if (!this.n.isEmpty()) {
            qx $$1 = new qx();
            for (bfa $$2 : this.n) {
                $$1.add($$2.a(new qr()));
            }
            $$0.a("Effects", $$1);
        }
    }

    @Override
    public void a(aby<?> $$0) {
        if (f.equals($$0)) {
            this.d_();
        }
        super.a($$0);
    }

    public chw t() {
        return this.m;
    }

    @Override
    public dxj l_() {
        return dxj.d;
    }

    @Override
    public bfk a(bgl $$0) {
        return bfk.b(this.h() * 2.0f, 0.5f);
    }

    @Override
    @Nullable
    public /* synthetic */ bfj v() {
        return this.s();
    }
}

