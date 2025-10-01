/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bsl
extends brk
implements bgy<b> {
    public static final String b = "BucketVariantTag";
    private static final aby<Integer> d = acb.a(bsl.class, aca.b);
    public static final List<d> c = List.of(new d(bsl$b.h, cen.b, cen.h), new d(bsl$b.g, cen.h, cen.h), new d(bsl$b.g, cen.h, cen.l), new d(bsl$b.l, cen.a, cen.h), new d(bsl$b.b, cen.l, cen.h), new d(bsl$b.a, cen.b, cen.a), new d(bsl$b.f, cen.g, cen.d), new d(bsl$b.j, cen.k, cen.e), new d(bsl$b.l, cen.a, cen.o), new d(bsl$b.f, cen.a, cen.e), new d(bsl$b.i, cen.a, cen.h), new d(bsl$b.l, cen.a, cen.b), new d(bsl$b.d, cen.j, cen.g), new d(bsl$b.e, cen.f, cen.d), new d(bsl$b.k, cen.o, cen.a), new d(bsl$b.c, cen.h, cen.o), new d(bsl$b.j, cen.o, cen.a), new d(bsl$b.g, cen.a, cen.e), new d(bsl$b.a, cen.o, cen.a), new d(bsl$b.b, cen.h, cen.a), new d(bsl$b.d, cen.j, cen.e), new d(bsl$b.g, cen.e, cen.e));
    private boolean e = true;

    public bsl(bfn<? extends bsl> $$0, cmm $$1) {
        super((bfn<? extends brk>)$$0, $$1);
    }

    public static String c(int $$0) {
        return "entity.minecraft.tropical_fish.predefined." + $$0;
    }

    static int a(b $$0, cen $$1, cen $$2) {
        return $$0.b() & 0xFFFF | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
    }

    public static cen s(int $$0) {
        return cen.a($$0 >> 16 & 0xFF);
    }

    public static cen t(int $$0) {
        return cen.a($$0 >> 24 & 0xFF);
    }

    public static b u(int $$0) {
        return bsl$b.a($$0 & 0xFFFF);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(d, 0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("Variant", this.gk());
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.v($$0.h("Variant"));
    }

    private void v(int $$0) {
        this.am.b(d, $$0);
    }

    @Override
    public boolean d(int $$0) {
        return !this.e;
    }

    private int gk() {
        return this.am.b(d);
    }

    public cen gh() {
        return bsl.s(this.gk());
    }

    public cen gi() {
        return bsl.t(this.gk());
    }

    public b gj() {
        return bsl.u(this.gk());
    }

    @Override
    public void a(b $$0) {
        int $$1 = this.gk();
        cen $$2 = bsl.s($$1);
        cen $$3 = bsl.t($$1);
        this.v(bsl.a($$0, $$2, $$3));
    }

    @Override
    public void l(cfz $$0) {
        super.l($$0);
        qr $$1 = $$0.w();
        $$1.a(b, this.gk());
    }

    @Override
    public cfz b() {
        return new cfz(cgc.pU);
    }

    @Override
    protected amg s() {
        return amh.xT;
    }

    @Override
    protected amg g_() {
        return amh.xU;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.xW;
    }

    @Override
    protected amg fZ() {
        return amh.xV;
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        d $$14;
        $$3 = super.a($$0, $$1, $$2, $$3, $$4);
        if ($$2 == bgd.l && $$4 != null && $$4.b(b, 3)) {
            this.v($$4.h(b));
            return $$3;
        }
        apf $$5 = $$0.y_();
        if ($$3 instanceof c) {
            c $$6 = (c)$$3;
            d $$7 = $$6.b;
        } else if ((double)$$5.i() < 0.9) {
            d $$8 = ac.a(c, $$5);
            $$3 = new c(this, $$8);
        } else {
            this.e = false;
            b[] $$9 = bsl$b.values();
            cen[] $$10 = cen.values();
            b $$11 = ac.a($$9, $$5);
            cen $$12 = ac.a($$10, $$5);
            cen $$13 = ac.a($$10, $$5);
            $$14 = new d($$11, $$12, $$13);
        }
        this.v($$14.a());
        return $$3;
    }

    public static boolean b(bfn<bsl> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$1.b_($$3.d()).a(anb.a) && $$1.a_($$3.c()).a(cpo.G) && ($$1.s($$3).a(amv.am) || bsn.c($$0, $$1, $$2, $$3, $$4));
    }

    @Override
    public /* synthetic */ Object c() {
        return this.gj();
    }

    public static final class b
    extends Enum<b>
    implements apr {
        public static final /* enum */ b a = new b("kob", bsl$a.a, 0);
        public static final /* enum */ b b = new b("sunstreak", bsl$a.a, 1);
        public static final /* enum */ b c = new b("snooper", bsl$a.a, 2);
        public static final /* enum */ b d = new b("dasher", bsl$a.a, 3);
        public static final /* enum */ b e = new b("brinely", bsl$a.a, 4);
        public static final /* enum */ b f = new b("spotty", bsl$a.a, 5);
        public static final /* enum */ b g = new b("flopper", bsl$a.b, 0);
        public static final /* enum */ b h = new b("stripey", bsl$a.b, 1);
        public static final /* enum */ b i = new b("glitter", bsl$a.b, 2);
        public static final /* enum */ b j = new b("blockfish", bsl$a.b, 3);
        public static final /* enum */ b k = new b("betty", bsl$a.b, 4);
        public static final /* enum */ b l = new b("clayfish", bsl$a.b, 5);
        public static final Codec<b> m;
        private static final IntFunction<b> n;
        private final String o;
        private final sw p;
        private final a q;
        private final int r;
        private static final /* synthetic */ b[] s;

        public static b[] values() {
            return (b[])s.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, a $$1, int $$2) {
            this.o = $$0;
            this.q = $$1;
            this.r = $$1.c | $$2 << 8;
            this.p = sw.c("entity.minecraft.tropical_fish.type." + this.o);
        }

        public static b a(int $$0) {
            return n.apply($$0);
        }

        public a a() {
            return this.q;
        }

        public int b() {
            return this.r;
        }

        @Override
        public String c() {
            return this.o;
        }

        public sw d() {
            return this.p;
        }

        private static /* synthetic */ b[] e() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k, l};
        }

        static {
            s = bsl$b.e();
            m = apr.a(b::values);
            n = anu.a(b::b, bsl$b.values(), a);
        }
    }

    static class c
    extends brk.a {
        final d b;

        c(bsl $$0, d $$1) {
            super($$0);
            this.b = $$1;
        }
    }

    public record d(b a, cen b, cen c) {
        private final b a;
        private final cen b;
        private final cen c;

        public int a() {
            return bsl.a(this.a, this.b, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "pattern;baseColor;patternColor", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "pattern;baseColor;patternColor", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "pattern;baseColor;patternColor", "a", "b", "c"}, this, $$0);
        }

        public b b() {
            return this.a;
        }

        public cen c() {
            return this.b;
        }

        public cen d() {
            return this.c;
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0);
        public static final /* enum */ a b = new a(1);
        final int c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0) {
            this.c = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = bsl$a.a();
        }
    }
}

