/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  javax.annotation.Nullable
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public abstract class bfi
extends bfj {
    static final Logger o = LogUtils.getLogger();
    public static final int b = -1;
    private static final aby<Integer> p = acb.a(bfi.class, aca.b);
    private static final aby<Integer> q = acb.a(bfi.class, aca.b);
    private static final aby<Vector3f> r = acb.a(bfi.class, aca.A);
    private static final aby<Vector3f> s = acb.a(bfi.class, aca.A);
    private static final aby<Quaternionf> t = acb.a(bfi.class, aca.B);
    private static final aby<Quaternionf> u = acb.a(bfi.class, aca.B);
    private static final aby<Byte> aD = acb.a(bfi.class, aca.a);
    private static final aby<Integer> aE = acb.a(bfi.class, aca.b);
    private static final aby<Float> aF = acb.a(bfi.class, aca.d);
    private static final aby<Float> aG = acb.a(bfi.class, aca.d);
    private static final aby<Float> aH = acb.a(bfi.class, aca.d);
    private static final aby<Float> aI = acb.a(bfi.class, aca.d);
    private static final aby<Float> aJ = acb.a(bfi.class, aca.d);
    private static final aby<Integer> aK = acb.a(bfi.class, aca.b);
    private static final IntSet aL = IntSet.of((int[])new int[]{r.a(), s.a(), t.a(), u.a(), aD.a(), aE.a(), aG.a(), aH.a()});
    private static final float aM = 0.0f;
    private static final float aN = 1.0f;
    private static final int aO = -1;
    public static final String c = "interpolation_duration";
    public static final String d = "start_interpolation";
    public static final String e = "transformation";
    public static final String f = "billboard";
    public static final String g = "brightness";
    public static final String h = "view_range";
    public static final String i = "shadow_radius";
    public static final String j = "shadow_strength";
    public static final String k = "width";
    public static final String l = "height";
    public static final String m = "glow_color_override";
    private final Quaternionf aP = new Quaternionf();
    private long aQ = Integer.MIN_VALUE;
    private int aR;
    private float aS;
    private eed aT;
    protected boolean n;
    private boolean aU;
    private boolean aV;
    @Nullable
    private j aW;

    public bfi(bfn<?> $$0, cmm $$1) {
        super($$0, $$1);
        this.ae = true;
        this.as = true;
        this.aT = this.cE();
    }

    @Override
    public void a(aby<?> $$0) {
        super.a($$0);
        if (aJ.equals($$0) || aI.equals($$0)) {
            this.A();
        }
        if (p.equals($$0)) {
            this.aU = true;
        }
        if (q.equals($$0)) {
            this.aV = true;
        }
        if (aL.contains($$0.a())) {
            this.n = true;
        }
    }

    private static j a(acb $$0) {
        Vector3f $$1 = $$0.b(r);
        Quaternionf $$2 = $$0.b(t);
        Vector3f $$3 = $$0.b(s);
        Quaternionf $$4 = $$0.b(u);
        return new j($$1, $$2, $$3, $$4);
    }

    @Override
    public void l() {
        bfj $$0 = this.cW();
        if ($$0 != null && $$0.dD()) {
            this.Y();
        }
        if (this.dI().B) {
            if (this.aU) {
                this.aU = false;
                int $$1 = this.p();
                this.aQ = this.ag + $$1;
            }
            if (this.aV) {
                this.aV = false;
                this.aR = this.o();
            }
            if (this.n) {
                this.n = false;
                boolean $$2 = this.aR != 0;
                this.aW = $$2 && this.aW != null ? this.a(this.aW, this.aS) : this.D();
                this.a($$2, this.aS);
            }
        }
    }

    protected abstract void a(boolean var1, float var2);

    @Override
    protected void a_() {
        this.am.a(p, 0);
        this.am.a(q, 0);
        this.am.a(r, new Vector3f());
        this.am.a(s, new Vector3f(1.0f, 1.0f, 1.0f));
        this.am.a(u, new Quaternionf());
        this.am.a(t, new Quaternionf());
        this.am.a(aD, a.a.a());
        this.am.a(aE, -1);
        this.am.a(aF, Float.valueOf(1.0f));
        this.am.a(aG, Float.valueOf(0.0f));
        this.am.a(aH, Float.valueOf(1.0f));
        this.am.a(aI, Float.valueOf(0.0f));
        this.am.a(aJ, Float.valueOf(0.0f));
        this.am.a(aK, -1);
    }

    @Override
    protected void a(qr $$02) {
        if ($$02.e(e)) {
            j.b.decode((DynamicOps)rc.a, (Object)$$02.c(e)).resultOrPartial(ac.a("Display entity", arg_0 -> ((Logger)o).error(arg_0))).ifPresent($$0 -> this.a((j)$$0.getFirst()));
        }
        if ($$02.b(c, 99)) {
            int $$1 = $$02.h(c);
            this.b($$1);
        }
        if ($$02.b(d, 99)) {
            int $$2 = $$02.h(d);
            this.c($$2);
        }
        if ($$02.b(f, 8)) {
            a.e.decode((DynamicOps)rc.a, (Object)$$02.c(f)).resultOrPartial(ac.a("Display entity", arg_0 -> ((Logger)o).error(arg_0))).ifPresent($$0 -> this.a((a)$$0.getFirst()));
        }
        if ($$02.b(h, 99)) {
            this.s($$02.j(h));
        }
        if ($$02.b(i, 99)) {
            this.t($$02.j(i));
        }
        if ($$02.b(j, 99)) {
            this.u($$02.j(j));
        }
        if ($$02.b(k, 99)) {
            this.v($$02.j(k));
        }
        if ($$02.b(l, 99)) {
            this.w($$02.j(l));
        }
        if ($$02.b(m, 99)) {
            this.d($$02.h(m));
        }
        if ($$02.b(g, 10)) {
            ant.b.decode((DynamicOps)rc.a, (Object)$$02.c(g)).resultOrPartial(ac.a("Display entity", arg_0 -> ((Logger)o).error(arg_0))).ifPresent($$0 -> this.a((ant)$$0.getFirst()));
        } else {
            this.a((ant)null);
        }
    }

    private void a(j $$0) {
        this.am.b(r, $$0.d());
        this.am.b(t, $$0.e());
        this.am.b(s, $$0.f());
        this.am.b(u, $$0.g());
    }

    @Override
    protected void b(qr $$0) {
        j.b.encodeStart((DynamicOps)rc.a, (Object)bfi.a(this.am)).result().ifPresent($$1 -> $$0.a(e, (rk)$$1));
        a.e.encodeStart((DynamicOps)rc.a, (Object)this.q()).result().ifPresent($$1 -> $$0.a(f, (rk)$$1));
        $$0.a(c, this.o());
        $$0.a(h, this.t());
        $$0.a(i, this.v());
        $$0.a(j, this.w());
        $$0.a(k, this.x());
        $$0.a(l, this.z());
        $$0.a(m, this.y());
        ant $$12 = this.r();
        if ($$12 != null) {
            ant.b.encodeStart((DynamicOps)rc.a, (Object)$$12).result().ifPresent($$1 -> $$0.a(g, (rk)$$1));
        }
    }

    @Override
    public uo<ur> S() {
        return new us(this);
    }

    @Override
    public eed j_() {
        return this.aT;
    }

    @Override
    public dxj l_() {
        return dxj.d;
    }

    @Override
    public boolean c_() {
        return true;
    }

    public Quaternionf j() {
        return this.aP;
    }

    @Nullable
    public j k() {
        return this.aW;
    }

    private void b(int $$0) {
        this.am.b(q, $$0);
    }

    private int o() {
        return this.am.b(q);
    }

    private void c(int $$0) {
        this.am.a(p, $$0, true);
    }

    private int p() {
        return this.am.b(p);
    }

    private void a(a $$0) {
        this.am.b(aD, $$0.a());
    }

    private a q() {
        return a.f.apply(this.am.b(aD).byteValue());
    }

    private void a(@Nullable ant $$0) {
        this.am.b(aE, $$0 != null ? $$0.a() : -1);
    }

    @Nullable
    private ant r() {
        int $$0 = this.am.b(aE);
        return $$0 != -1 ? ant.a($$0) : null;
    }

    private int s() {
        return this.am.b(aE);
    }

    private void s(float $$0) {
        this.am.b(aF, Float.valueOf($$0));
    }

    private float t() {
        return this.am.b(aF).floatValue();
    }

    private void t(float $$0) {
        this.am.b(aG, Float.valueOf($$0));
    }

    private float v() {
        return this.am.b(aG).floatValue();
    }

    private void u(float $$0) {
        this.am.b(aH, Float.valueOf($$0));
    }

    private float w() {
        return this.am.b(aH).floatValue();
    }

    private void v(float $$0) {
        this.am.b(aI, Float.valueOf($$0));
    }

    private float x() {
        return this.am.b(aI).floatValue();
    }

    private void w(float $$0) {
        this.am.b(aJ, Float.valueOf($$0));
    }

    private int y() {
        return this.am.b(aK);
    }

    private void d(int $$0) {
        this.am.b(aK, $$0);
    }

    public float a(float $$0) {
        float $$4;
        int $$1 = this.aR;
        if ($$1 <= 0) {
            return 1.0f;
        }
        float $$2 = (long)this.ag - this.aQ;
        float $$3 = $$2 + $$0;
        this.aS = $$4 = apa.a(apa.g($$3, 0.0f, $$1), 0.0f, 1.0f);
        return $$4;
    }

    private float z() {
        return this.am.b(aJ).floatValue();
    }

    @Override
    public void e(double $$0, double $$1, double $$2) {
        super.e($$0, $$1, $$2);
        this.A();
    }

    private void A() {
        float $$0 = this.x();
        float $$1 = this.z();
        if ($$0 == 0.0f || $$1 == 0.0f) {
            this.as = true;
        } else {
            this.as = false;
            float $$2 = $$0 / 2.0f;
            double $$3 = this.dn();
            double $$4 = this.dp();
            double $$5 = this.dt();
            this.aT = new eed($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
        }
    }

    @Override
    public void b_(float $$0) {
        super.b_($$0);
        this.C();
    }

    @Override
    public void a_(float $$0) {
        super.a_($$0);
        this.C();
    }

    private void C() {
        this.aP.rotationYXZ((float)(-Math.PI) / 180 * this.dy(), (float)Math.PI / 180 * this.dA(), 0.0f);
    }

    @Override
    public boolean a(double $$0) {
        return $$0 < apa.k((double)this.t() * 64.0 * bfi.cx());
    }

    @Override
    public int k_() {
        int $$0 = this.y();
        return $$0 != -1 ? $$0 : super.k_();
    }

    private j D() {
        return new j(bfi$e.constant(bfi.a(this.am)), this.q(), this.s(), bfi$d.constant(this.v()), bfi$d.constant(this.w()), this.y());
    }

    private j a(j $$0, float $$1) {
        j $$2 = $$0.a.get($$1);
        float $$3 = $$0.d.get($$1);
        float $$4 = $$0.e.get($$1);
        return new j(new l($$2, bfi.a(this.am)), this.q(), this.s(), new h($$3, this.v()), new h($$4, this.w()), this.y());
    }

    public static final class j
    extends Record {
        final e<j> a;
        private final a b;
        private final int c;
        final d d;
        final d e;
        private final int f;

        public j(e<j> $$0, a $$1, int $$2, d $$3, d $$4, int $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public e<j> a() {
            return this.a;
        }

        public a b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public d d() {
            return this.d;
        }

        public d e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a(0, "fixed");
        public static final /* enum */ a b = new a(1, "vertical");
        public static final /* enum */ a c = new a(2, "horizontal");
        public static final /* enum */ a d = new a(3, "center");
        public static final Codec<a> e;
        public static final IntFunction<a> f;
        private final byte g;
        private final String h;
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(byte $$0, String $$1) {
            this.h = $$1;
            this.g = $$0;
        }

        @Override
        public String c() {
            return this.h;
        }

        byte a() {
            return this.g;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            i = bfi$a.b();
            e = apr.a(a::values);
            f = anu.a(a::a, bfi$a.values(), anu.a.a);
        }
    }

    @FunctionalInterface
    public static interface e<T> {
        public static <T> e<T> constant(T $$0) {
            return $$1 -> $$0;
        }

        public T get(float var1);
    }

    @FunctionalInterface
    public static interface d {
        public static d constant(float $$0) {
            return $$1 -> $$0;
        }

        public float get(float var1);
    }

    record l(j a, j b) implements e<j>
    {
        public j a(float $$0) {
            if ((double)$$0 >= 1.0) {
                return this.b;
            }
            return this.a.a(this.b, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "previous;current", "a", "b"}, this, $$0);
        }

        @Override
        public /* synthetic */ Object get(float f2) {
            return this.a(f2);
        }
    }

    record h(float a, float b) implements d
    {
        @Override
        public float get(float $$0) {
            return apa.i($$0, this.a, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "previous;current", "a", "b"}, this, $$0);
        }
    }

    record c(int a, int b) implements f
    {
        @Override
        public int get(float $$0) {
            return aok.b.a($$0, this.a, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "previous;current", "a", "b"}, this, $$0);
        }
    }

    record i(int a, int b) implements f
    {
        @Override
        public int get(float $$0) {
            return apa.a($$0, this.a, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "previous;current", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "previous;current", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface f {
        public static f constant(int $$0) {
            return $$1 -> $$0;
        }

        public int get(float var1);
    }

    public static class k
    extends bfi {
        public static final String o = "text";
        private static final String aD = "line_width";
        private static final String aE = "text_opacity";
        private static final String aF = "background";
        private static final String aG = "shadow";
        private static final String aH = "see_through";
        private static final String aI = "default_background";
        private static final String aJ = "alignment";
        public static final byte p = 1;
        public static final byte q = 2;
        public static final byte r = 4;
        public static final byte s = 8;
        public static final byte t = 16;
        private static final byte aK = -1;
        public static final int u = 0x40000000;
        private static final aby<sw> aL = acb.a(k.class, aca.f);
        private static final aby<Integer> aM = acb.a(k.class, aca.b);
        private static final aby<Integer> aN = acb.a(k.class, aca.b);
        private static final aby<Byte> aO = acb.a(k.class, aca.a);
        private static final aby<Byte> aP = acb.a(k.class, aca.a);
        private static final IntSet aQ = IntSet.of((int[])new int[]{aL.a(), aM.a(), aN.a(), aO.a(), aP.a()});
        @Nullable
        private b aR;
        @Nullable
        private e aS;

        public k(bfn<?> $$0, cmm $$1) {
            super($$0, $$1);
        }

        @Override
        protected void a_() {
            super.a_();
            this.am.a(aL, sw.h());
            this.am.a(aM, 200);
            this.am.a(aN, 0x40000000);
            this.am.a(aO, (byte)-1);
            this.am.a(aP, (byte)0);
        }

        @Override
        public void a(aby<?> $$0) {
            super.a($$0);
            if (aQ.contains($$0.a())) {
                this.n = true;
            }
        }

        private sw p() {
            return this.am.b(aL);
        }

        private void c(sw $$0) {
            this.am.b(aL, $$0);
        }

        private int q() {
            return this.am.b(aM);
        }

        @Override
        private void b(int $$0) {
            this.am.b(aM, $$0);
        }

        private byte r() {
            return this.am.b(aO);
        }

        private void c(byte $$0) {
            this.am.b(aO, $$0);
        }

        @Override
        private int s() {
            return this.am.b(aN);
        }

        @Override
        private void c(int $$0) {
            this.am.b(aN, $$0);
        }

        private byte t() {
            return this.am.b(aP);
        }

        private void d(byte $$0) {
            this.am.b(aP, $$0);
        }

        private static byte a(byte $$0, qr $$1, String $$2, byte $$3) {
            if ($$1.q($$2)) {
                return (byte)($$0 | $$3);
            }
            return $$0;
        }

        @Override
        protected void a(qr $$0) {
            super.a($$0);
            if ($$0.b(aD, 99)) {
                this.b($$0.h(aD));
            }
            if ($$0.b(aE, 99)) {
                this.c($$0.f(aE));
            }
            if ($$0.b(aF, 99)) {
                this.c($$0.h(aF));
            }
            byte $$1 = bfi$k.a((byte)0, $$0, aG, (byte)1);
            $$1 = bfi$k.a($$1, $$0, aH, (byte)2);
            $$1 = bfi$k.a($$1, $$0, aI, (byte)4);
            Optional<a> $$2 = a.d.decode((DynamicOps)rc.a, (Object)$$0.c(aJ)).resultOrPartial(ac.a("Display entity", arg_0 -> ((Logger)o).error(arg_0))).map(Pair::getFirst);
            if ($$2.isPresent()) {
                $$1 = switch ($$2.get()) {
                    default -> throw new IncompatibleClassChangeError();
                    case a.a -> $$1;
                    case a.b -> (byte)($$1 | 8);
                    case a.c -> (byte)($$1 | 0x10);
                };
            }
            this.d($$1);
            if ($$0.b(o, 8)) {
                String $$3 = $$0.l(o);
                try {
                    tj $$4 = sw.a.a($$3);
                    if ($$4 != null) {
                        ds $$5 = this.da().a(2);
                        tj $$6 = sy.a($$5, $$4, (bfj)this, 0);
                        this.c($$6);
                    } else {
                        this.c(sw.h());
                    }
                }
                catch (Exception $$7) {
                    o.warn("Failed to parse display entity text {}", (Object)$$3, (Object)$$7);
                }
            }
        }

        private static void b(byte $$0, qr $$1, String $$2, byte $$3) {
            $$1.a($$2, ($$0 & $$3) != 0);
        }

        @Override
        protected void b(qr $$0) {
            super.b($$0);
            $$0.a(o, sw.a.a(this.p()));
            $$0.a(aD, this.q());
            $$0.a(aF, this.s());
            $$0.a(aE, this.r());
            byte $$12 = this.t();
            bfi$k.b($$12, $$0, aG, (byte)1);
            bfi$k.b($$12, $$0, aH, (byte)2);
            bfi$k.b($$12, $$0, aI, (byte)4);
            a.d.encodeStart((DynamicOps)rc.a, (Object)bfi$k.a($$12)).result().ifPresent($$1 -> $$0.a(aJ, (rk)$$1));
        }

        @Override
        protected void a(boolean $$0, float $$1) {
            this.aS = $$0 && this.aS != null ? this.a(this.aS, $$1) : this.v();
            this.aR = null;
        }

        @Nullable
        public e o() {
            return this.aS;
        }

        private e v() {
            return new e(this.p(), this.q(), bfi$f.constant(this.r()), bfi$f.constant(this.s()), this.t());
        }

        private e a(e $$0, float $$1) {
            int $$2 = $$0.d.get($$1);
            int $$3 = $$0.c.get($$1);
            return new e(this.p(), this.q(), new i($$3, this.r()), new bfi$c($$2, this.s()), this.t());
        }

        public b a(d $$0) {
            if (this.aR == null) {
                this.aR = this.aS != null ? $$0.split(this.aS.a(), this.aS.b()) : new b(List.of(), 0);
            }
            return this.aR;
        }

        public static a a(byte $$0) {
            if (($$0 & 8) != 0) {
                return a.b;
            }
            if (($$0 & 0x10) != 0) {
                return a.c;
            }
            return a.a;
        }

        public static final class a
        extends Enum<a>
        implements apr {
            public static final /* enum */ a a = new a("center");
            public static final /* enum */ a b = new a("left");
            public static final /* enum */ a c = new a("right");
            public static final Codec<a> d;
            private final String e;
            private static final /* synthetic */ a[] f;

            public static a[] values() {
                return (a[])f.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$0) {
                this.e = $$0;
            }

            @Override
            public String c() {
                return this.e;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c};
            }

            static {
                f = bfi$k$a.a();
                d = apr.a(a::values);
            }
        }

        public static final class e
        extends Record {
            private final sw a;
            private final int b;
            final f c;
            final f d;
            private final byte e;

            public e(sw $$0, int $$1, f $$2, f $$3, byte $$4) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
                this.d = $$3;
                this.e = $$4;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "text;lineWidth;textOpacity;backgroundColor;flags", "a", "b", "c", "d", "e"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "text;lineWidth;textOpacity;backgroundColor;flags", "a", "b", "c", "d", "e"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "text;lineWidth;textOpacity;backgroundColor;flags", "a", "b", "c", "d", "e"}, this, $$0);
            }

            public sw a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }

            public f c() {
                return this.c;
            }

            public f d() {
                return this.d;
            }

            public byte e() {
                return this.e;
            }
        }

        public record b(List<c> a, int b) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "lines;width", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "lines;width", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "lines;width", "a", "b"}, this, $$0);
            }
        }

        @FunctionalInterface
        public static interface d {
            public b split(sw var1, int var2);
        }

        public record c(aom a, int b) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "contents;width", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "contents;width", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "contents;width", "a", "b"}, this, $$0);
            }
        }
    }

    public static class b
    extends bfi {
        public static final String o = "block_state";
        private static final aby<dcb> p = acb.a(b.class, aca.i);
        @Nullable
        private a q;

        public b(bfn<?> $$0, cmm $$1) {
            super($$0, $$1);
        }

        @Override
        protected void a_() {
            super.a_();
            this.am.a(p, cpo.a.n());
        }

        @Override
        public void a(aby<?> $$0) {
            super.a($$0);
            if ($$0.equals(p)) {
                this.n = true;
            }
        }

        private dcb p() {
            return this.am.b(p);
        }

        private void c(dcb $$0) {
            this.am.b(p, $$0);
        }

        @Override
        protected void a(qr $$0) {
            super.a($$0);
            this.c(rd.a(this.dI().a(jc.e), $$0.p(o)));
        }

        @Override
        protected void b(qr $$0) {
            super.b($$0);
            $$0.a(o, rd.a(this.p()));
        }

        @Nullable
        public a o() {
            return this.q;
        }

        @Override
        protected void a(boolean $$0, float $$1) {
            this.q = new a(this.p());
        }

        public record a(dcb a) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockState", "a"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockState", "a"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockState", "a"}, this, $$0);
            }
        }
    }

    public static class g
    extends bfi {
        private static final String o = "item";
        private static final String p = "item_display";
        private static final aby<cfz> q = acb.a(g.class, aca.h);
        private static final aby<Byte> r = acb.a(g.class, aca.a);
        private final bgs s = new bgs(){

            @Override
            public cfz a() {
                return this.p();
            }

            @Override
            public boolean a(cfz $$0) {
                this.a($$0);
                return true;
            }
        };
        @Nullable
        private a t;

        public g(bfn<?> $$0, cmm $$1) {
            super($$0, $$1);
        }

        @Override
        protected void a_() {
            super.a_();
            this.am.a(q, cfz.b);
            this.am.a(r, cfw.a.a());
        }

        @Override
        public void a(aby<?> $$0) {
            super.a($$0);
            if (q.equals($$0) || r.equals($$0)) {
                this.n = true;
            }
        }

        cfz p() {
            return this.am.b(q);
        }

        void a(cfz $$0) {
            this.am.b(q, $$0);
        }

        private void a(cfw $$0) {
            this.am.b(r, $$0.a());
        }

        private cfw q() {
            return cfw.k.apply(this.am.b(r).byteValue());
        }

        @Override
        protected void a(qr $$02) {
            super.a($$02);
            this.a(cfz.a($$02.p(o)));
            if ($$02.b(p, 8)) {
                cfw.j.decode((DynamicOps)rc.a, (Object)$$02.c(p)).resultOrPartial(ac.a("Display entity", arg_0 -> ((Logger)o).error(arg_0))).ifPresent($$0 -> this.a((cfw)$$0.getFirst()));
            }
        }

        @Override
        protected void b(qr $$0) {
            super.b($$0);
            $$0.a(o, this.p().b(new qr()));
            cfw.j.encodeStart((DynamicOps)rc.a, (Object)this.q()).result().ifPresent($$1 -> $$0.a(p, (rk)$$1));
        }

        @Override
        public bgs a_(int $$0) {
            if ($$0 == 0) {
                return this.s;
            }
            return bgs.b;
        }

        @Nullable
        public a o() {
            return this.t;
        }

        @Override
        protected void a(boolean $$0, float $$1) {
            this.t = new a(this.p(), this.q());
        }

        public record a(cfz a, cfw b) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "itemStack;itemTransform", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "itemStack;itemTransform", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "itemStack;itemTransform", "a", "b"}, this, $$0);
            }
        }
    }
}

