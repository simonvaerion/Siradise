/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cef {
    private final sw a;
    String b = "items.png";
    boolean c = true;
    boolean d = true;
    boolean e = false;
    private final f f;
    private final int g;
    private final h h;
    @Nullable
    private cfz i;
    private Collection<cfz> j = cga.a();
    private Set<cfz> k = cga.a();
    @Nullable
    private Consumer<List<cfz>> l;
    private final Supplier<cfz> m;
    private final b n;

    cef(f $$0, int $$1, h $$2, sw $$3, Supplier<cfz> $$4, b $$5) {
        this.f = $$0;
        this.g = $$1;
        this.a = $$3;
        this.m = $$4;
        this.n = $$5;
        this.h = $$2;
    }

    public static a a(f $$0, int $$1) {
        return new a($$0, $$1);
    }

    public sw a() {
        return this.a;
    }

    public cfz b() {
        if (this.i == null) {
            this.i = this.m.get();
        }
        return this.i;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.c;
    }

    public int f() {
        return this.g;
    }

    public f g() {
        return this.f;
    }

    public boolean h() {
        return !this.j.isEmpty();
    }

    public boolean i() {
        return this.h != cef$h.a || this.h();
    }

    public boolean j() {
        return this.e;
    }

    public h k() {
        return this.h;
    }

    public void a(d $$0) {
        c $$1 = new c(this, $$0.a);
        acp<cef> $$2 = jb.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
        this.n.accept($$0, $$1);
        this.j = $$1.a;
        this.k = $$1.b;
        this.n();
    }

    public Collection<cfz> l() {
        return this.j;
    }

    public Collection<cfz> m() {
        return this.k;
    }

    public boolean a(cfz $$0) {
        return this.k.contains($$0);
    }

    public void a(Consumer<List<cfz>> $$0) {
        this.l = $$0;
    }

    public void n() {
        if (this.l != null) {
            this.l.accept(Lists.newArrayList(this.k));
        }
    }

    public static final class f
    extends Enum<f> {
        public static final /* enum */ f a = new f();
        public static final /* enum */ f b = new f();
        private static final /* synthetic */ f[] c;

        public static f[] values() {
            return (f[])c.clone();
        }

        public static f valueOf(String $$0) {
            return Enum.valueOf(f.class, $$0);
        }

        private static /* synthetic */ f[] a() {
            return new f[]{a, b};
        }

        static {
            c = cef$f.a();
        }
    }

    @FunctionalInterface
    public static interface b {
        public void accept(d var1, e var2);
    }

    public static final class h
    extends Enum<h> {
        public static final /* enum */ h a = new h();
        public static final /* enum */ h b = new h();
        public static final /* enum */ h c = new h();
        public static final /* enum */ h d = new h();
        private static final /* synthetic */ h[] e;

        public static h[] values() {
            return (h[])e.clone();
        }

        public static h valueOf(String $$0) {
            return Enum.valueOf(h.class, $$0);
        }

        private static /* synthetic */ h[] a() {
            return new h[]{a, b, c, d};
        }

        static {
            e = cef$h.a();
        }
    }

    public static class a {
        private static final b a = ($$0, $$1) -> {};
        private final f b;
        private final int c;
        private sw d = sw.h();
        private Supplier<cfz> e = () -> cfz.b;
        private b f = a;
        private boolean g = true;
        private boolean h = true;
        private boolean i = false;
        private h j = cef$h.a;
        private String k = "items.png";

        public a(f $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public a a(sw $$0) {
            this.d = $$0;
            return this;
        }

        public a a(Supplier<cfz> $$0) {
            this.e = $$0;
            return this;
        }

        public a a(b $$0) {
            this.f = $$0;
            return this;
        }

        public a a() {
            this.i = true;
            return this;
        }

        public a b() {
            this.h = false;
            return this;
        }

        public a c() {
            this.g = false;
            return this;
        }

        protected a a(h $$0) {
            this.j = $$0;
            return this;
        }

        public a a(String $$0) {
            this.k = $$0;
            return this;
        }

        public cef d() {
            if ((this.j == cef$h.c || this.j == cef$h.b) && this.f != a) {
                throw new IllegalStateException("Special tabs can't have display items");
            }
            cef $$0 = new cef(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.e = this.i;
            $$0.d = this.h;
            $$0.c = this.g;
            $$0.b = this.k;
            return $$0;
        }
    }

    static class c
    implements e {
        public final Collection<cfz> a = cga.a();
        public final Set<cfz> b = cga.a();
        private final cef c;
        private final caw d;

        public c(cef $$0, caw $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public void a(cfz $$0, g $$1) {
            boolean $$2;
            if ($$0.L() != 1) {
                throw new IllegalArgumentException("Stack size must be exactly 1");
            }
            boolean bl2 = $$2 = this.a.contains($$0) && $$1 != cef$g.c;
            if ($$2) {
                throw new IllegalStateException("Accidentally adding the same item stack twice " + $$0.J().getString() + " to a Creative Mode Tab: " + this.c.a().getString());
            }
            if ($$0.d().a(this.d)) {
                switch ($$1) {
                    case a: {
                        this.a.add($$0);
                        this.b.add($$0);
                        break;
                    }
                    case b: {
                        this.a.add($$0);
                        break;
                    }
                    case c: {
                        this.b.add($$0);
                    }
                }
            }
        }
    }

    public static final class d
    extends Record {
        final caw a;
        private final boolean b;
        private final hg.b c;

        public d(caw $$0, boolean $$1, hg.b $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public boolean a(caw $$0, boolean $$1, hg.b $$2) {
            return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "enabledFeatures;hasPermissions;holders", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "enabledFeatures;hasPermissions;holders", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "enabledFeatures;hasPermissions;holders", "a", "b", "c"}, this, $$0);
        }

        public caw a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public hg.b c() {
            return this.c;
        }
    }

    public static interface e {
        public void a(cfz var1, g var2);

        default public void a(cfz $$0) {
            this.a($$0, cef$g.a);
        }

        default public void a(cml $$0, g $$1) {
            this.a(new cfz($$0), $$1);
        }

        default public void a(cml $$0) {
            this.a(new cfz($$0), cef$g.a);
        }

        default public void a(Collection<cfz> $$0, g $$12) {
            $$0.forEach($$1 -> this.a((cfz)$$1, $$12));
        }

        default public void a(Collection<cfz> $$0) {
            this.a($$0, cef$g.a);
        }
    }

    protected static final class g
    extends Enum<g> {
        public static final /* enum */ g a = new g();
        public static final /* enum */ g b = new g();
        public static final /* enum */ g c = new g();
        private static final /* synthetic */ g[] d;

        public static g[] values() {
            return (g[])d.clone();
        }

        public static g valueOf(String $$0) {
            return Enum.valueOf(g.class, $$0);
        }

        private static /* synthetic */ g[] a() {
            return new g[]{a, b, c};
        }

        static {
            d = cef$g.a();
        }
    }
}

