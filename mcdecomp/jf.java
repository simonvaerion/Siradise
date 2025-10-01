/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class jf {
    private final cpn a;
    final Map<b, cpn> b = Maps.newHashMap();
    caw c = cay.e;
    boolean d = true;
    boolean e = true;
    @Nullable
    String f;
    @Nullable
    String g;

    jf(cpn $$0) {
        this.a = $$0;
    }

    public cpn a() {
        return this.a;
    }

    public Map<b, cpn> b() {
        return this.b;
    }

    public cpn a(b $$0) {
        return this.b.get((Object)$$0);
    }

    public boolean c() {
        return this.d;
    }

    public boolean a(caw $$0) {
        return this.e && this.c.a($$0);
    }

    public Optional<String> d() {
        if (ac.b(this.f)) {
            return Optional.empty();
        }
        return Optional.of(this.f);
    }

    public Optional<String> e() {
        if (ac.b(this.g)) {
            return Optional.empty();
        }
        return Optional.of(this.g);
    }

    public static class a {
        private final jf a;

        public a(cpn $$0) {
            this.a = new jf($$0);
        }

        public jf a() {
            return this.a;
        }

        public a a(cpn $$0) {
            this.a.b.put(jf$b.a, $$0);
            return this;
        }

        public a b(cpn $$0) {
            this.a.b.put(jf$b.b, $$0);
            return this;
        }

        public a c(cpn $$0) {
            this.a.b.put(jf$b.j, $$0);
            return this;
        }

        public a d(cpn $$0) {
            this.a.b.put(jf$b.c, $$0);
            return this;
        }

        public a e(cpn $$0) {
            this.a.b.put(jf$b.d, $$0);
            return this;
        }

        public a f(cpn $$0) {
            this.a.b.put(jf$b.e, $$0);
            return this;
        }

        public a g(cpn $$0) {
            this.a.b.put(jf$b.f, $$0);
            return this;
        }

        public a h(cpn $$0) {
            this.a.b.put(jf$b.g, $$0);
            return this;
        }

        public a i(cpn $$0) {
            this.a.b.put(jf$b.h, $$0);
            return this;
        }

        public a j(cpn $$0) {
            this.a.b.put(jf$b.i, $$0);
            return this;
        }

        public a a(cpn $$0, cpn $$1) {
            this.a.b.put(jf$b.k, $$0);
            this.a.b.put(jf$b.r, $$1);
            return this;
        }

        public a k(cpn $$0) {
            this.a.b.put(jf$b.l, $$0);
            return this;
        }

        public a l(cpn $$0) {
            this.a.b.put(jf$b.m, $$0);
            return this;
        }

        public a m(cpn $$0) {
            this.a.b.put(jf$b.n, $$0);
            return this;
        }

        public a n(cpn $$0) {
            this.a.b.put(jf$b.o, $$0);
            return this;
        }

        public a o(cpn $$0) {
            this.a.b.put(jf$b.p, $$0);
            return this;
        }

        public a p(cpn $$0) {
            this.a.b.put(jf$b.q, $$0);
            return this;
        }

        public a b() {
            this.a.d = false;
            return this;
        }

        public a c() {
            this.a.e = false;
            return this;
        }

        public a a(cau ... $$0) {
            this.a.c = cay.c.a($$0);
            return this;
        }

        public a a(String $$0) {
            this.a.f = $$0;
            return this;
        }

        public a b(String $$0) {
            this.a.g = $$0;
            return this;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("button");
        public static final /* enum */ b b = new b("chiseled");
        public static final /* enum */ b c = new b("cracked");
        public static final /* enum */ b d = new b("cut");
        public static final /* enum */ b e = new b("door");
        public static final /* enum */ b f = new b("custom_fence");
        public static final /* enum */ b g = new b("fence");
        public static final /* enum */ b h = new b("custom_fence_gate");
        public static final /* enum */ b i = new b("fence_gate");
        public static final /* enum */ b j = new b("mosaic");
        public static final /* enum */ b k = new b("sign");
        public static final /* enum */ b l = new b("slab");
        public static final /* enum */ b m = new b("stairs");
        public static final /* enum */ b n = new b("pressure_plate");
        public static final /* enum */ b o = new b("polished");
        public static final /* enum */ b p = new b("trapdoor");
        public static final /* enum */ b q = new b("wall");
        public static final /* enum */ b r = new b("wall_sign");
        private final String s;
        private static final /* synthetic */ b[] t;

        public static b[] values() {
            return (b[])t.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.s = $$0;
        }

        public String a() {
            return this.s;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
        }

        static {
            t = jf$b.b();
        }
    }
}

