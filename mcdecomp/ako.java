/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ako
implements akx {
    static final Logger b = LogUtils.getLogger();
    protected final List<d> a = Lists.newArrayList();
    private final ajm c;
    private final String d;

    public ako(ajm $$0, String $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public void a(ajl $$0) {
        this.a($$0.a(), $$0, null);
    }

    public void a(ajl $$0, Predicate<acq> $$1) {
        this.a($$0.a(), $$0, $$1);
    }

    public void a(String $$0, Predicate<acq> $$1) {
        this.a($$0, null, $$1);
    }

    private void a(String $$0, @Nullable ajl $$1, @Nullable Predicate<acq> $$2) {
        this.a.add(new d($$0, $$1, $$2));
    }

    @Override
    public Set<String> a() {
        return ImmutableSet.of((Object)this.d);
    }

    @Override
    public Optional<akv> getResource(acq $$0) {
        for (int $$1 = this.a.size() - 1; $$1 >= 0; --$$1) {
            akp<InputStream> $$4;
            d $$2 = this.a.get($$1);
            ajl $$3 = $$2.b;
            if ($$3 != null && ($$4 = $$3.a(this.c, $$0)) != null) {
                akp<akz> $$5 = this.a($$0, $$1);
                return Optional.of(ako.a($$3, $$0, $$4, $$5));
            }
            if (!$$2.a($$0)) continue;
            b.warn("Resource {} not found, but was filtered by pack {}", (Object)$$0, (Object)$$2.a);
            return Optional.empty();
        }
        return Optional.empty();
    }

    private static akv a(ajl $$0, acq $$1, akp<InputStream> $$2, akp<akz> $$3) {
        return new akv($$0, ako.a($$1, $$0, $$2), $$3);
    }

    private static akp<InputStream> a(acq $$0, ajl $$1, akp<InputStream> $$2) {
        if (b.isDebugEnabled()) {
            return () -> new c((InputStream)$$2.get(), $$0, $$1.a());
        }
        return $$2;
    }

    @Override
    public List<akv> a(acq $$0) {
        acq $$1 = ako.d($$0);
        ArrayList<akv> $$2 = new ArrayList<akv>();
        boolean $$3 = false;
        String $$4 = null;
        for (int $$5 = this.a.size() - 1; $$5 >= 0; --$$5) {
            akp<InputStream> $$8;
            d $$6 = this.a.get($$5);
            ajl $$7 = $$6.b;
            if ($$7 != null && ($$8 = $$7.a(this.c, $$0)) != null) {
                akp<akz> $$10;
                if ($$3) {
                    akp<akz> $$9 = akz.b;
                } else {
                    $$10 = () -> {
                        akp<InputStream> $$2 = $$7.a(this.c, $$1);
                        return $$2 != null ? ako.b($$2) : akz.a;
                    };
                }
                $$2.add(new akv($$7, $$8, $$10));
            }
            if ($$6.a($$0)) {
                $$4 = $$6.a;
                break;
            }
            if (!$$6.a($$1)) continue;
            $$3 = true;
        }
        if ($$2.isEmpty() && $$4 != null) {
            b.warn("Resource {} not found, but was filtered by pack {}", (Object)$$0, $$4);
        }
        return Lists.reverse($$2);
    }

    private static boolean b(acq $$0) {
        return $$0.a().endsWith(".mcmeta");
    }

    private static acq c(acq $$0) {
        String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
        return $$0.c($$1);
    }

    static acq d(acq $$0) {
        return $$0.c($$0.a() + ".mcmeta");
    }

    @Override
    public Map<acq, akv> b(String $$0, Predicate<acq> $$1) {
        final class A
        extends Record {
            final ajl a;
            final akp<InputStream> b;
            final int c;

            A(ajl $$0, akp<InputStream> $$1, int $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "packResources;resource;packIndex", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "packResources;resource;packIndex", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "packResources;resource;packIndex", "a", "b", "c"}, this, $$0);
            }

            public ajl a() {
                return this.a;
            }

            public akp<InputStream> b() {
                return this.b;
            }

            public int c() {
                return this.c;
            }
        }
        HashMap<acq, A> $$22 = new HashMap<acq, A>();
        HashMap $$32 = new HashMap();
        int $$4 = this.a.size();
        for (int $$52 = 0; $$52 < $$4; ++$$52) {
            d $$62 = this.a.get($$52);
            $$62.a($$22.keySet());
            $$62.a($$32.keySet());
            ajl $$7 = $$62.b;
            if ($$7 == null) continue;
            int $$8 = $$52;
            $$7.a(this.c, this.d, $$0, ($$5, $$6) -> {
                if (ako.b($$5)) {
                    if ($$1.test(ako.c($$5))) {
                        $$32.put($$5, new A($$7, (akp<InputStream>)$$6, $$8));
                    }
                } else if ($$1.test((acq)$$5)) {
                    $$22.put((acq)$$5, new A($$7, (akp<InputStream>)$$6, $$8));
                }
            });
        }
        TreeMap $$9 = Maps.newTreeMap();
        $$22.forEach(($$2, $$3) -> {
            akp<akz> $$7;
            acq $$4 = ako.d($$2);
            A $$5 = (A)$$32.get($$4);
            if ($$5 != null && $$5.c >= $$3.c) {
                akp<akz> $$6 = ako.a($$5.b);
            } else {
                $$7 = akz.b;
            }
            $$9.put($$2, ako.a($$3.a, $$2, $$3.b, $$7));
        });
        return $$9;
    }

    private akp<akz> a(acq $$0, int $$1) {
        return () -> {
            acq $$2 = ako.d($$0);
            for (int $$3 = this.a.size() - 1; $$3 >= $$1; --$$3) {
                akp<InputStream> $$6;
                d $$4 = this.a.get($$3);
                ajl $$5 = $$4.b;
                if ($$5 != null && ($$6 = $$5.a(this.c, $$2)) != null) {
                    return ako.b($$6);
                }
                if ($$4.a($$2)) break;
            }
            return akz.a;
        };
    }

    private static akp<akz> a(akp<InputStream> $$0) {
        return () -> ako.b($$0);
    }

    private static akz b(akp<InputStream> $$0) throws IOException {
        try (InputStream $$1 = $$0.get();){
            akz akz2 = akz.a($$1);
            return akz2;
        }
    }

    private static void a(d $$0, Map<acq, b> $$1) {
        for (b $$2 : $$1.values()) {
            if ($$0.a($$2.a)) {
                $$2.c.clear();
                continue;
            }
            if (!$$0.a($$2.b())) continue;
            $$2.d.clear();
        }
    }

    private void a(d $$0, String $$1, Predicate<acq> $$2, Map<acq, b> $$32) {
        ajl $$42 = $$0.b;
        if ($$42 == null) {
            return;
        }
        $$42.a(this.c, this.d, $$1, ($$3, $$4) -> {
            if (ako.b($$3)) {
                acq $$5 = ako.c($$3);
                if (!$$2.test($$5)) {
                    return;
                }
                $$1.computeIfAbsent($$5, (Function<acq, b>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, <init>(acq ), (Lacq;)Lako$b;)()).d.put($$42, (akp<InputStream>)$$4);
            } else {
                if (!$$2.test((acq)$$3)) {
                    return;
                }
                $$1.computeIfAbsent($$3, (Function<acq, b>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, <init>(acq ), (Lacq;)Lako$b;)()).c.add(new e($$42, (akp<InputStream>)$$4));
            }
        });
    }

    @Override
    public Map<acq, List<akv>> c(String $$0, Predicate<acq> $$1) {
        HashMap $$2 = Maps.newHashMap();
        for (d $$3 : this.a) {
            ako.a($$3, $$2);
            this.a($$3, $$0, $$1, $$2);
        }
        TreeMap $$4 = Maps.newTreeMap();
        for (b $$5 : $$2.values()) {
            if ($$5.c.isEmpty()) continue;
            ArrayList<akv> $$6 = new ArrayList<akv>();
            for (e $$7 : $$5.c) {
                ajl $$8 = $$7.a;
                akp<InputStream> $$9 = $$5.d.get($$8);
                akp<akz> $$10 = $$9 != null ? ako.a($$9) : akz.b;
                $$6.add(ako.a($$8, $$5.a, $$7.b, $$10));
            }
            $$4.put($$5.a, $$6);
        }
        return $$4;
    }

    @Override
    public Stream<ajl> b() {
        return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
    }

    static final class d
    extends Record {
        final String a;
        @Nullable
        final ajl b;
        @Nullable
        private final Predicate<acq> c;

        d(String $$0, @Nullable ajl $$1, @Nullable Predicate<acq> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(Collection<acq> $$0) {
            if (this.c != null) {
                $$0.removeIf(this.c);
            }
        }

        public boolean a(acq $$0) {
            return this.c != null && this.c.test($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "name;resources;filter", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "name;resources;filter", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "name;resources;filter", "a", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        @Nullable
        public ajl b() {
            return this.b;
        }

        @Nullable
        public Predicate<acq> c() {
            return this.c;
        }
    }

    static final class b
    extends Record {
        final acq a;
        private final acq b;
        final List<e> c;
        final Map<ajl, akp<InputStream>> d;

        b(acq $$0) {
            this($$0, ako.d($$0), new ArrayList<e>(), (Map<ajl, akp<InputStream>>)new Object2ObjectArrayMap());
        }

        private b(acq $$0, acq $$1, List<e> $$2, Map<ajl, akp<InputStream>> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "fileLocation;metadataLocation;fileSources;metaSources", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "fileLocation;metadataLocation;fileSources;metaSources", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "fileLocation;metadataLocation;fileSources;metaSources", "a", "b", "c", "d"}, this, $$0);
        }

        public acq a() {
            return this.a;
        }

        public acq b() {
            return this.b;
        }

        public List<e> c() {
            return this.c;
        }

        public Map<ajl, akp<InputStream>> d() {
            return this.d;
        }
    }

    static final class e
    extends Record {
        final ajl a;
        final akp<InputStream> b;

        e(ajl $$0, akp<InputStream> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "source;resource", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "source;resource", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "source;resource", "a", "b"}, this, $$0);
        }

        public ajl a() {
            return this.a;
        }

        public akp<InputStream> b() {
            return this.b;
        }
    }

    static class c
    extends FilterInputStream {
        private final Supplier<String> a;
        private boolean b;

        public c(InputStream $$0, acq $$1, String $$2) {
            super($$0);
            Exception $$3 = new Exception("Stacktrace");
            this.a = () -> {
                StringWriter $$3 = new StringWriter();
                $$3.printStackTrace(new PrintWriter($$3));
                return "Leaked resource: '" + $$1 + "' loaded from pack: '" + $$2 + "'\n" + $$3;
            };
        }

        @Override
        public void close() throws IOException {
            super.close();
            this.b = true;
        }

        protected void finalize() throws Throwable {
            if (!this.b) {
                b.warn("{}", (Object)this.a.get());
            }
            super.finalize();
        }
    }
}

