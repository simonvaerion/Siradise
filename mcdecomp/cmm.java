/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class cmm
implements cmn,
AutoCloseable {
    public static final Codec<acp<cmm>> g = acp.a(jc.aH);
    public static final acp<cmm> h = acp.a(jc.aH, new acq("overworld"));
    public static final acp<cmm> i = acp.a(jc.aH, new acq("the_nether"));
    public static final acp<cmm> j = acp.a(jc.aH, new acq("the_end"));
    public static final int k = 30000000;
    public static final int l = 512;
    public static final int m = 32;
    public static final int n = 15;
    public static final int o = 24000;
    public static final int p = 20000000;
    public static final int q = -20000000;
    protected final List<dbd> r = Lists.newArrayList();
    protected final dyg s;
    private final List<dbd> a = Lists.newArrayList();
    private boolean b;
    private final Thread c;
    private final boolean d;
    private int e;
    protected int t = apf.a().f();
    protected final int u = 1013904223;
    protected float v;
    protected float w;
    protected float x;
    protected float y;
    public final apf z = apf.a();
    @Deprecated
    private final apf f = apf.b();
    private final acp<dfk> D;
    private final he<dfk> E;
    protected final dzf A;
    private final Supplier<ban> F;
    public final boolean B;
    private final dds G;
    private final cnm H;
    private final acp<cmm> I;
    private final hs J;
    private final beo K;
    private long L;

    protected cmm(dzf $$0, acp<cmm> $$1, hs $$2, he<dfk> $$3, Supplier<ban> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
        this.F = $$4;
        this.A = $$0;
        this.E = $$3;
        this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
        final dfk $$9 = $$3.a();
        this.I = $$1;
        this.B = $$5;
        this.G = $$9.k() != 1.0 ? new dds(){

            @Override
            public double a() {
                return super.a() / $$9.k();
            }

            @Override
            public double b() {
                return super.b() / $$9.k();
            }
        } : new dds();
        this.c = Thread.currentThread();
        this.H = new cnm(this, $$7);
        this.d = $$6;
        this.s = new dye(this, $$8);
        this.J = $$2;
        this.K = new beo($$2);
    }

    @Override
    public boolean r_() {
        return this.B;
    }

    @Override
    @Nullable
    public MinecraftServer n() {
        return null;
    }

    public boolean j(gu $$0) {
        return !this.r($$0) && cmm.D($$0);
    }

    public static boolean k(gu $$0) {
        return !cmm.b($$0.v()) && cmm.D($$0);
    }

    private static boolean D(gu $$0) {
        return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
    }

    private static boolean b(int $$0) {
        return $$0 < -20000000 || $$0 >= 20000000;
    }

    public dei l(gu $$0) {
        return this.d(hx.a($$0.u()), hx.a($$0.w()));
    }

    public dei d(int $$0, int $$1) {
        return (dei)this.a($$0, $$1, dec.n);
    }

    @Override
    @Nullable
    public ddx a(int $$0, int $$1, dec $$2, boolean $$3) {
        ddx $$4 = this.J().a($$0, $$1, $$2, $$3);
        if ($$4 == null && $$3) {
            throw new IllegalStateException("Should always be able to create a chunk!");
        }
        return $$4;
    }

    @Override
    public boolean a(gu $$0, dcb $$1, int $$2) {
        return this.a($$0, $$1, $$2, 512);
    }

    @Override
    public boolean a(gu $$0, dcb $$1, int $$2, int $$3) {
        if (this.r($$0)) {
            return false;
        }
        if (!this.B && this.af()) {
            return false;
        }
        dei $$4 = this.l($$0);
        cpn $$5 = $$1.b();
        dcb $$6 = $$4.a($$0, $$1, ($$2 & 0x40) != 0);
        if ($$6 != null) {
            dcb $$7 = this.a_($$0);
            if ($$7 == $$1) {
                if ($$6 != $$7) {
                    this.b($$0, $$6, $$7);
                }
                if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(ahy.c))) {
                    this.a($$0, $$6, $$1, $$2);
                }
                if (($$2 & 1) != 0) {
                    this.b($$0, $$6.b());
                    if (!this.B && $$1.n()) {
                        this.c($$0, $$5);
                    }
                }
                if (($$2 & 0x10) == 0 && $$3 > 0) {
                    int $$8 = $$2 & 0xFFFFFFDE;
                    $$6.b((cmn)this, $$0, $$8, $$3 - 1);
                    $$1.a((cmn)this, $$0, $$8, $$3 - 1);
                    $$1.b((cmn)this, $$0, $$8, $$3 - 1);
                }
                this.a($$0, $$6, $$7);
            }
            return true;
        }
        return false;
    }

    public void a(gu $$0, dcb $$1, dcb $$2) {
    }

    @Override
    public boolean a(gu $$0, boolean $$1) {
        dxe $$2 = this.b_($$0);
        return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
    }

    @Override
    public boolean a(gu $$0, boolean $$1, @Nullable bfj $$2, int $$3) {
        boolean $$7;
        dcb $$4 = this.a_($$0);
        if ($$4.i()) {
            return false;
        }
        dxe $$5 = this.b_($$0);
        if (!($$4.b() instanceof cpb)) {
            this.c(2001, $$0, cpn.i($$4));
        }
        if ($$1) {
            czn $$6 = $$4.t() ? this.c_($$0) : null;
            cpn.a($$4, this, $$0, $$6, $$2, cfz.b);
        }
        if ($$7 = this.a($$0, $$5.g(), 3, $$3)) {
            this.a(dgl.f, $$0, dgl.a.a($$2, $$4));
        }
        return $$7;
    }

    public void a(gu $$0, dcb $$1) {
    }

    public boolean b(gu $$0, dcb $$1) {
        return this.a($$0, $$1, 3);
    }

    public abstract void a(gu var1, dcb var2, dcb var3, int var4);

    public void b(gu $$0, dcb $$1, dcb $$2) {
    }

    public void a(gu $$0, cpn $$1) {
    }

    public void a(gu $$0, cpn $$1, ha $$2) {
    }

    public void a(gu $$0, cpn $$1, gu $$2) {
    }

    public void a(dcb $$0, gu $$1, cpn $$2, gu $$3, boolean $$4) {
    }

    @Override
    public void a(ha $$0, dcb $$1, gu $$2, gu $$3, int $$4, int $$5) {
        this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public int a(dhk.a $$0, int $$1, int $$2) {
        int $$5;
        if ($$1 < -30000000 || $$2 < -30000000 || $$1 >= 30000000 || $$2 >= 30000000) {
            int $$3 = this.t_() + 1;
        } else if (this.b(hx.a($$1), hx.a($$2))) {
            int $$4 = this.d(hx.a($$1), hx.a($$2)).a($$0, $$1 & 0xF, $$2 & 0xF) + 1;
        } else {
            $$5 = this.C_();
        }
        return $$5;
    }

    @Override
    public dwt s_() {
        return this.J().p();
    }

    @Override
    public dcb a_(gu $$0) {
        if (this.r($$0)) {
            return cpo.nb.n();
        }
        dei $$1 = this.d(hx.a($$0.u()), hx.a($$0.w()));
        return $$1.a_($$0);
    }

    @Override
    public dxe b_(gu $$0) {
        if (this.r($$0)) {
            return dxf.a.g();
        }
        dei $$1 = this.l($$0);
        return $$1.b_($$0);
    }

    public boolean N() {
        return !this.x_().a() && this.e < 4;
    }

    public boolean O() {
        return !this.x_().a() && !this.N();
    }

    public void a(@Nullable bfj $$0, gu $$1, amg $$2, ami $$3, float $$4, float $$5) {
        byo $$6;
        this.a($$0 instanceof byo ? ($$6 = (byo)$$0) : null, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public void a(@Nullable byo $$0, gu $$1, amg $$2, ami $$3, float $$4, float $$5) {
        this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
    }

    public abstract void a(@Nullable byo var1, double var2, double var4, double var6, he<amg> var8, ami var9, float var10, float var11, long var12);

    public void a(@Nullable byo $$0, double $$1, double $$2, double $$3, amg $$4, ami $$5, float $$6, float $$7, long $$8) {
        this.a($$0, $$1, $$2, $$3, jb.c.d($$4), $$5, $$6, $$7, $$8);
    }

    public abstract void a(@Nullable byo var1, bfj var2, he<amg> var3, ami var4, float var5, float var6, long var7);

    public void a(@Nullable byo $$0, double $$1, double $$2, double $$3, amg $$4, ami $$5, float $$6, float $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
    }

    public void a(@Nullable byo $$0, bfj $$1, amg $$2, ami $$3, float $$4, float $$5) {
        this.a($$0, $$1, jb.c.d($$2), $$3, $$4, $$5, this.f.g());
    }

    public void a(gu $$0, amg $$1, ami $$2, float $$3, float $$4, boolean $$5) {
        this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
    }

    public void a(double $$0, double $$1, double $$2, amg $$3, ami $$4, float $$5, float $$6, boolean $$7) {
    }

    @Override
    public void a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
    }

    public void a(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
    }

    public void b(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
    }

    public void b(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
    }

    public float a(float $$0) {
        float $$1 = this.f($$0);
        return $$1 * ((float)Math.PI * 2);
    }

    public void a(dbd $$0) {
        (this.b ? this.a : this.r).add($$0);
    }

    protected void P() {
        ban $$0 = this.ad();
        $$0.a("blockEntities");
        this.b = true;
        if (!this.a.isEmpty()) {
            this.r.addAll(this.a);
            this.a.clear();
        }
        Iterator<dbd> $$1 = this.r.iterator();
        while ($$1.hasNext()) {
            dbd $$2 = $$1.next();
            if ($$2.b()) {
                $$1.remove();
                continue;
            }
            if (!this.m($$2.c())) continue;
            $$2.a();
        }
        this.b = false;
        $$0.c();
    }

    public <T extends bfj> void a(Consumer<T> $$0, T $$1) {
        try {
            $$0.accept($$1);
        }
        catch (Throwable $$2) {
            o $$3 = o.a($$2, "Ticking entity");
            p $$4 = $$3.a("Entity being ticked");
            $$1.a($$4);
            throw new y($$3);
        }
    }

    public boolean h(bfj $$0) {
        return true;
    }

    public boolean a(long $$0) {
        return true;
    }

    public boolean m(gu $$0) {
        return this.a(clt.a($$0));
    }

    public cme a(@Nullable bfj $$0, double $$1, double $$2, double $$3, float $$4, a $$5) {
        return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
    }

    public cme a(@Nullable bfj $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, a $$6) {
        return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    public cme a(@Nullable bfj $$0, @Nullable ben $$1, @Nullable cmf $$2, eei $$3, float $$4, boolean $$5, a $$6) {
        return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
    }

    public cme a(@Nullable bfj $$0, @Nullable ben $$1, @Nullable cmf $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, a $$8) {
        return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
    }

    public cme a(@Nullable bfj $$0, @Nullable ben $$1, @Nullable cmf $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, a $$8, boolean $$9) {
        cme.a $$10 = switch ($$8) {
            default -> throw new IncompatibleClassChangeError();
            case cmm$a.a -> cme.a.a;
            case cmm$a.b -> this.a(cmi.M);
            case cmm$a.c -> {
                if (this.X().b(cmi.c)) {
                    yield this.a(cmi.N);
                }
                yield cme.a.a;
            }
            case cmm$a.d -> this.a(cmi.O);
        };
        cme $$11 = new cme(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
        $$11.a();
        $$11.a($$9);
        return $$11;
    }

    private cme.a a(cmi.e<cmi.a> $$0) {
        return this.X().b($$0) ? cme.a.c : cme.a.b;
    }

    public abstract String F();

    @Override
    @Nullable
    public czn c_(gu $$0) {
        if (this.r($$0)) {
            return null;
        }
        if (!this.B && Thread.currentThread() != this.c) {
            return null;
        }
        return this.l($$0).a($$0, dei.b.a);
    }

    public void a(czn $$0) {
        gu $$1 = $$0.p();
        if (this.r($$1)) {
            return;
        }
        this.l($$1).b($$0);
    }

    public void n(gu $$0) {
        if (this.r($$0)) {
            return;
        }
        this.l($$0).d($$0);
    }

    public boolean o(gu $$0) {
        if (this.r($$0)) {
            return false;
        }
        return this.J().b(hx.a($$0.u()), hx.a($$0.w()));
    }

    public boolean a(gu $$0, bfj $$1, ha $$2) {
        if (this.r($$0)) {
            return false;
        }
        ddx $$3 = this.a(hx.a($$0.u()), hx.a($$0.w()), dec.n, false);
        if ($$3 == null) {
            return false;
        }
        return $$3.a_($$0).a((cls)this, $$0, $$1, $$2);
    }

    public boolean a(gu $$0, bfj $$1) {
        return this.a($$0, $$1, ha.b);
    }

    public void Q() {
        double $$0 = 1.0 - (double)(this.d(1.0f) * 5.0f) / 16.0;
        double $$1 = 1.0 - (double)(this.b(1.0f) * 5.0f) / 16.0;
        double $$2 = 0.5 + 2.0 * apa.a((double)apa.b(this.f(1.0f) * ((float)Math.PI * 2)), -0.25, 0.25);
        this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
    }

    public void b(boolean $$0, boolean $$1) {
        this.J().a($$0, $$1);
    }

    public gu R() {
        gu $$0 = new gu(this.A.a(), this.A.b(), this.A.c());
        if (!this.w_().a($$0)) {
            $$0 = this.a(dhk.a.e, gu.a(this.w_().a(), 0.0, this.w_().b()));
        }
        return $$0;
    }

    public float S() {
        return this.A.d();
    }

    protected void T() {
        if (this.A.k()) {
            this.w = 1.0f;
            if (this.A.i()) {
                this.y = 1.0f;
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.J().close();
    }

    @Override
    @Nullable
    public cls c(int $$0, int $$1) {
        return this.a($$0, $$1, dec.n, false);
    }

    @Override
    public List<bfj> a(@Nullable bfj $$0, eed $$1, Predicate<? super bfj> $$2) {
        this.ad().d("getEntities");
        ArrayList $$32 = Lists.newArrayList();
        this.E().a($$1, (T $$3) -> {
            if ($$3 != $$0 && $$2.test((bfj)$$3)) {
                $$32.add($$3);
            }
            if ($$3 instanceof bub) {
                for (btz $$4 : ((bub)$$3).fV()) {
                    if ($$3 == $$0 || !$$2.test($$4)) continue;
                    $$32.add($$4);
                }
            }
        });
        return $$32;
    }

    @Override
    public <T extends bfj> List<T> a(dfz<bfj, T> $$0, eed $$1, Predicate<? super T> $$2) {
        ArrayList $$3 = Lists.newArrayList();
        this.a($$0, $$1, $$2, $$3);
        return $$3;
    }

    public <T extends bfj> void a(dfz<bfj, T> $$0, eed $$1, Predicate<? super T> $$2, List<? super T> $$3) {
        this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
    }

    public <T extends bfj> void a(dfz<bfj, T> $$0, eed $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$42) {
        this.ad().d("getEntities");
        this.E().a($$0, $$1, (U $$4) -> {
            if ($$2.test($$4)) {
                $$3.add((Object)$$4);
                if ($$3.size() >= $$42) {
                    return anr.a.b;
                }
            }
            if ($$4 instanceof bub) {
                bub $$5 = (bub)$$4;
                for (btz $$6 : $$5.fV()) {
                    bfj $$7 = (bfj)$$0.a($$6);
                    if ($$7 == null || !$$2.test($$7)) continue;
                    $$3.add((Object)$$7);
                    if ($$3.size() < $$42) continue;
                    return anr.a.b;
                }
            }
            return anr.a.a;
        });
    }

    @Nullable
    public abstract bfj a(int var1);

    public void p(gu $$0) {
        if (this.A($$0)) {
            this.l($$0).a(true);
        }
    }

    @Override
    public int t_() {
        return 63;
    }

    public void U() {
    }

    public long V() {
        return this.A.e();
    }

    public long W() {
        return this.A.f();
    }

    public boolean a(byo $$0, gu $$1) {
        return true;
    }

    public void a(bfj $$0, byte $$1) {
    }

    public void a(bfj $$0, ben $$1) {
    }

    public void a(gu $$0, cpn $$1, int $$2, int $$3) {
        this.a_($$0).a(this, $$0, $$2, $$3);
    }

    @Override
    public dyv u_() {
        return this.A;
    }

    public cmi X() {
        return this.A.q();
    }

    public float b(float $$0) {
        return apa.i($$0, this.x, this.y) * this.d($$0);
    }

    public void c(float $$0) {
        float $$1;
        this.x = $$1 = apa.a($$0, 0.0f, 1.0f);
        this.y = $$1;
    }

    public float d(float $$0) {
        return apa.i($$0, this.v, this.w);
    }

    public void e(float $$0) {
        float $$1;
        this.v = $$1 = apa.a($$0, 0.0f, 1.0f);
        this.w = $$1;
    }

    public boolean Y() {
        if (!this.x_().g() || this.x_().h()) {
            return false;
        }
        return (double)this.b(1.0f) > 0.9;
    }

    public boolean Z() {
        return (double)this.d(1.0f) > 0.2;
    }

    public boolean q(gu $$0) {
        if (!this.Z()) {
            return false;
        }
        if (!this.g($$0)) {
            return false;
        }
        if (this.a(dhk.a.e, $$0).v() > $$0.v()) {
            return false;
        }
        cnk $$1 = this.s($$0).a();
        return $$1.a($$0) == cnk.c.b;
    }

    @Nullable
    public abstract dyo a(String var1);

    public abstract void a(String var1, dyo var2);

    public abstract int t();

    public void b(int $$0, gu $$1, int $$2) {
    }

    public p a(o $$0) {
        p $$1 = $$0.a("Affected level", 1);
        $$1.a("All players", () -> this.v().size() + " total; " + this.v());
        $$1.a("Chunk stats", this.J()::e);
        $$1.a("Level dimension", () -> this.ac().a().toString());
        try {
            this.A.a($$1, this);
        }
        catch (Throwable $$2) {
            $$1.a("Level Data Unobtainable", $$2);
        }
        return $$1;
    }

    public abstract void a(int var1, gu var2, int var3);

    public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable qr $$6) {
    }

    public abstract efg I();

    public void c(gu $$0, cpn $$1) {
        for (ha $$2 : ha.c.a) {
            gu $$3 = $$0.a($$2);
            if (!this.A($$3)) continue;
            dcb $$4 = this.a_($$3);
            if ($$4.a(cpo.gY)) {
                this.a($$4, $$3, $$1, $$0, false);
                continue;
            }
            if (!$$4.g(this, $$3) || !($$4 = this.a_($$3 = $$3.a($$2))).a(cpo.gY)) continue;
            this.a($$4, $$3, $$1, $$0, false);
        }
    }

    @Override
    public bdv d_(gu $$0) {
        long $$1 = 0L;
        float $$2 = 0.0f;
        if (this.A($$0)) {
            $$2 = this.an();
            $$1 = this.l($$0).u();
        }
        return new bdv(this.ai(), this.W(), $$1, $$2);
    }

    @Override
    public int v_() {
        return this.e;
    }

    public void c(int $$0) {
    }

    @Override
    public dds w_() {
        return this.G;
    }

    public void a(uo<?> $$0) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    @Override
    public dfk x_() {
        return this.E.a();
    }

    public acp<dfk> aa() {
        return this.D;
    }

    public he<dfk> ab() {
        return this.E;
    }

    public acp<cmm> ac() {
        return this.I;
    }

    @Override
    public apf y_() {
        return this.z;
    }

    @Override
    public boolean a(gu $$0, Predicate<dcb> $$1) {
        return $$1.test(this.a_($$0));
    }

    @Override
    public boolean b(gu $$0, Predicate<dxe> $$1) {
        return $$1.test(this.b_($$0));
    }

    public abstract cjd q();

    public gu a(int $$0, int $$1, int $$2, int $$3) {
        this.t = this.t * 3 + 1013904223;
        int $$4 = this.t >> 2;
        return new gu($$0 + ($$4 & 0xF), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 0xF));
    }

    public boolean r() {
        return false;
    }

    public ban ad() {
        return this.F.get();
    }

    public Supplier<ban> ae() {
        return this.F;
    }

    @Override
    public cnm z_() {
        return this.H;
    }

    public final boolean af() {
        return this.d;
    }

    protected abstract dgb<bfj> E();

    @Override
    public long A_() {
        return this.L++;
    }

    @Override
    public hs B_() {
        return this.J;
    }

    public beo ag() {
        return this.K;
    }

    @Override
    public /* synthetic */ ddx a(int n2, int n3) {
        return this.d(n2, n3);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = cmm$a.a();
        }
    }
}

