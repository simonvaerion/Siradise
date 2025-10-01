/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class adj {
    private static final Logger a = LogUtils.getLogger();

    public static <D, R> CompletableFuture<R> a(c $$0, f<D> $$12, e<D, R> $$22, Executor $$3, Executor $$4) {
        try {
            Pair<cnf, akn> $$52 = $$0.a.a();
            akn $$6 = (akn)$$52.getSecond();
            hl<acz> $$7 = acz.a();
            hl<acz> $$8 = adj.b($$6, $$7, acz.b, acl.a);
            hs.b $$9 = $$8.b(acz.c);
            hs.b $$10 = acl.a((akx)$$6, $$9, acl.b);
            cnf $$11 = (cnf)$$52.getFirst();
            b<D> $$122 = $$12.get(new a($$6, $$11, $$9, $$10));
            hl<acz> $$13 = $$8.a(acz.c, $$122.b);
            hs.b $$14 = $$13.b(acz.d);
            return ((CompletableFuture)ada.a($$6, $$14, $$11.b(), $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1, $$2) -> {
                if ($$2 != null) {
                    $$6.close();
                }
            })).thenApplyAsync($$5 -> {
                $$5.a($$14);
                return $$22.create($$6, (ada)$$5, $$13, $$4.a);
            }, $$4);
        }
        catch (Exception $$15) {
            return CompletableFuture.failedFuture($$15);
        }
    }

    private static hs.b a(akx $$0, hl<acz> $$1, acz $$2, List<acl.b<?>> $$3) {
        hs.b $$4 = $$1.b($$2);
        return acl.a($$0, $$4, $$3);
    }

    private static hl<acz> b(akx $$0, hl<acz> $$1, acz $$2, List<acl.b<?>> $$3) {
        hs.b $$4 = adj.a($$0, $$1, $$2, $$3);
        return $$1.a($$2, $$4);
    }

    public static final class c
    extends Record {
        final d a;
        private final dt.a b;
        private final int c;

        public c(d $$0, dt.a $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "packConfig;commandSelection;functionCompilationLevel", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "packConfig;commandSelection;functionCompilationLevel", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "packConfig;commandSelection;functionCompilationLevel", "a", "b", "c"}, this, $$0);
        }

        public d a() {
            return this.a;
        }

        public dt.a b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }
    }

    public record d(aki a, cnf b, boolean c, boolean d) {
        private final aki a;
        private final cnf b;
        private final boolean c;
        private final boolean d;

        public Pair<cnf, akn> a() {
            caw $$0 = this.d ? cay.c.a() : this.b.b();
            cnf $$1 = MinecraftServer.a(this.a, this.b.a(), this.c, $$0);
            if (!this.d) {
                $$1 = $$1.a(this.b.b());
            }
            List<ajl> $$2 = this.a.g();
            akq $$3 = new akq(ajm.b, $$2);
            return Pair.of((Object)$$1, (Object)$$3);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "packRepository;initialDataConfig;safeMode;initMode", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "packRepository;initialDataConfig;safeMode;initMode", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "packRepository;initialDataConfig;safeMode;initMode", "a", "b", "c", "d"}, this, $$0);
        }

        public aki b() {
            return this.a;
        }

        public cnf c() {
            return this.b;
        }

        public boolean d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    public record a(akx a, cnf b, hs.b c, hs.b d) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "a", "b", "c", "d"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface f<D> {
        public b<D> get(a var1);
    }

    public static final class b<D>
    extends Record {
        final D a;
        final hs.b b;

        public b(D $$0, hs.b $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "cookie;finalDimensions", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "cookie;finalDimensions", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "cookie;finalDimensions", "a", "b"}, this, $$0);
        }

        public D a() {
            return this.a;
        }

        public hs.b b() {
            return this.b;
        }
    }

    @FunctionalInterface
    public static interface e<D, R> {
        public R create(akn var1, ada var2, hl<acz> var3, D var4);
    }
}

