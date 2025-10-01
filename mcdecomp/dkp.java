/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.slf4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class dkp {
    private static final Logger a = LogUtils.getLogger();
    private static final LoadingCache<aif, b> b = CacheBuilder.newBuilder().weakKeys().expireAfterAccess(5L, TimeUnit.MINUTES).build((CacheLoader)new CacheLoader<aif, b>(){

        public b a(aif $$0) {
            return new b((Object2IntMap<a>)Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap()), new MutableInt(0));
        }

        public /* synthetic */ Object load(Object object) throws Exception {
            return this.a((aif)object);
        }
    });

    public static void a(aif $$0) {
        try {
            ((b)b.get((Object)$$0)).b().increment();
        }
        catch (Exception $$1) {
            a.error("Failed to increment chunk count", (Throwable)$$1);
        }
    }

    public static void a(aif $$02, dkb<?, ?> $$12, Optional<dre> $$2) {
        try {
            ((b)b.get((Object)$$02)).a().computeInt((Object)new a($$12, $$2), ($$0, $$1) -> $$1 == null ? 1 : $$1 + 1);
        }
        catch (Exception $$3) {
            a.error("Failed to increment feature count", (Throwable)$$3);
        }
    }

    public static void a() {
        b.invalidateAll();
        a.debug("Cleared feature counts");
    }

    public static void b() {
        a.debug("Logging feature counts:");
        b.asMap().forEach(($$0, $$1) -> {
            String $$2 = $$0.ac().a().toString();
            boolean $$32 = $$0.n().v();
            hr<dre> $$42 = $$0.B_().d(jc.ay);
            String $$5 = ($$32 ? "running" : "dead") + " " + $$2;
            Integer $$6 = $$1.b().getValue();
            a.debug($$5 + " total_chunks: " + $$6);
            $$1.a().forEach(($$3, $$4) -> a.debug($$5 + " " + String.format(Locale.ROOT, "%10d ", $$4) + String.format(Locale.ROOT, "%10f ", (double)$$4.intValue() / (double)$$6.intValue()) + $$3.b().flatMap($$42::c).map(acp::a) + " " + $$3.a().b() + " " + $$3.a()));
        });
    }

    record b(Object2IntMap<a> a, MutableInt b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "featureData;chunksWithFeatures", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "featureData;chunksWithFeatures", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "featureData;chunksWithFeatures", "a", "b"}, this, $$0);
        }
    }

    record a(dkb<?, ?> a, Optional<dre> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "feature;topFeature", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "feature;topFeature", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "feature;topFeature", "a", "b"}, this, $$0);
        }
    }
}

