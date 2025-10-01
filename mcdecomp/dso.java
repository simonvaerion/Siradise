/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface dso<C extends dms> {
    public Optional<dsn<C>> createGenerator(a<C> var1);

    public static <C extends dms> dso<C> simple(Predicate<a<C>> $$0, dsn<C> $$1) {
        Optional $$22 = Optional.of($$1);
        return $$2 -> $$0.test($$2) ? $$22 : Optional.empty();
    }

    public static <C extends dms> Predicate<a<C>> checkForBiomeOnTop(dhk.a $$0) {
        return $$1 -> $$1.a($$0);
    }

    public record a<C extends dms>(ddy a, cno b, dhy c, long d, clt e, C f, cmo g, Predicate<he<cnk>> h, dvu i, hs j) {
        public boolean a(dhk.a $$0) {
            int $$1 = this.e.b();
            int $$2 = this.e.c();
            int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
            he<cnk> $$4 = this.a.c().getNoiseBiome(hq.a($$1), hq.a($$3), hq.a($$2), this.c.b());
            return this.h.test($$4);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }
    }
}

