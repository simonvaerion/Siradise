/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class acl {
    private static final Logger c = LogUtils.getLogger();
    public static final List<b<?>> a = List.of(new b<dfk>(jc.au, dfk.h), new b<cnk>(jc.ap, cnk.a), new b<ss>(jc.aq, ss.a), new b(jc.ar, djn.a), new b(jc.as, dkb.a), new b<dre>(jc.ay, dre.a), new b<dsa>(jc.az, dsa.a), new b<dsg>(jc.aB, dsg.a), new b<dvr>(jc.aA, dvs.c), new b<dtj>(jc.aC, dtj.a), new b<dhp>(jc.aw, dhp.a), new b<dwh.a>(jc.ax, dwh.a.a), new b<dhd>(jc.at, dhd.b), new b<drp>(jc.aF, drp.a), new b<dqb>(jc.av, dqb.a), new b<cie>(jc.aE, cie.a), new b<cic>(jc.aD, cic.a), new b<bep>(jc.p, bep.a), new b<cny>(jc.aG, cny.a));
    public static final List<b<?>> b = List.of(new b<dfl>(jc.aI, dfl.a));

    public static hs.b a(akx $$0, hs $$12, List<b<?>> $$22) {
        HashMap $$3 = new HashMap();
        List<Pair<ia<?>, a>> $$4 = $$22.stream().map($$1 -> $$1.a(Lifecycle.stable(), $$3)).toList();
        aco.b $$5 = acl.a($$12, $$4);
        $$4.forEach($$2 -> ((a)$$2.getSecond()).load($$0, $$5));
        $$4.forEach($$1 -> {
            hr $$2 = (hr)$$1.getFirst();
            try {
                $$2.l();
            }
            catch (Exception $$3) {
                $$3.put($$2.c(), $$3);
            }
        });
        if (!$$3.isEmpty()) {
            acl.a($$3);
            throw new IllegalStateException("Failed to load registries due to above errors");
        }
        return new hs.c($$4.stream().map(Pair::getFirst).toList()).c();
    }

    private static aco.b a(hs $$0, List<Pair<ia<?>, a>> $$12) {
        final HashMap $$2 = new HashMap();
        $$0.b().forEach($$1 -> $$2.put($$1.a(), acl.a($$1.b())));
        $$12.forEach($$1 -> $$2.put(((ia)$$1.getFirst()).c(), acl.a((ia)$$1.getFirst())));
        return new aco.b(){

            @Override
            public <T> Optional<aco.a<T>> a(acp<? extends hr<? extends T>> $$0) {
                return Optional.ofNullable((aco.a)$$2.get($$0));
            }
        };
    }

    private static <T> aco.a<T> a(ia<T> $$0) {
        return new aco.a($$0.p(), $$0.n(), $$0.d());
    }

    private static <T> aco.a<T> a(hr<T> $$0) {
        return new aco.a<T>($$0.p(), $$0.u(), $$0.d());
    }

    private static void a(Map<acp<?>, Exception> $$02) {
        StringWriter $$1 = new StringWriter();
        PrintWriter $$2 = new PrintWriter($$1);
        Map<acq, Map<acq, Exception>> $$3 = $$02.entrySet().stream().collect(Collectors.groupingBy($$0 -> ((acp)$$0.getKey()).b(), Collectors.toMap($$0 -> ((acp)$$0.getKey()).a(), Map.Entry::getValue)));
        $$3.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach($$12 -> {
            $$2.printf("> Errors in registry %s:%n", $$12.getKey());
            ((Map)$$12.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach($$1 -> {
                $$2.printf(">> Errors in element %s:%n", $$1.getKey());
                ((Exception)$$1.getValue()).printStackTrace($$2);
            });
        });
        $$2.flush();
        c.error("Registry loading errors:\n{}", (Object)$$1);
    }

    private static String a(acq $$0) {
        return $$0.a();
    }

    static <E> void a(aco.b $$02, akx $$1, acp<? extends hr<E>> $$2, ia<E> $$3, Decoder<E> $$4, Map<acp<?>, Exception> $$5) {
        String $$6 = acl.a($$2.a());
        acj $$7 = acj.a($$6);
        aco $$8 = aco.a(JsonOps.INSTANCE, $$02);
        for (Map.Entry<acq, akv> $$9 : $$7.a($$1).entrySet()) {
            acq $$10 = $$9.getKey();
            acp $$11 = acp.a($$2, $$7.b($$10));
            akv $$12 = $$9.getValue();
            try {
                BufferedReader $$13 = $$12.e();
                try {
                    JsonElement $$14 = JsonParser.parseReader((Reader)$$13);
                    DataResult $$15 = $$4.parse($$8, (Object)$$14);
                    Object $$16 = $$15.getOrThrow(false, $$0 -> {});
                    $$3.a($$11, $$16, $$12.c() ? Lifecycle.stable() : $$15.lifecycle());
                }
                finally {
                    if ($$13 == null) continue;
                    ((Reader)$$13).close();
                }
            }
            catch (Exception $$17) {
                $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$10, $$12.b()), $$17));
            }
        }
    }

    static interface a {
        public void load(akx var1, aco.b var2);
    }

    public record b<T>(acp<? extends hr<T>> a, Codec<T> b) {
        Pair<ia<?>, a> a(Lifecycle $$0, Map<acp<?>, Exception> $$1) {
            hm $$22 = new hm(this.a, $$0);
            a $$32 = ($$2, $$3) -> acl.a($$3, $$2, this.a, $$22, this.b, $$1);
            return Pair.of($$22, (Object)$$32);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "key;elementCodec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "key;elementCodec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "key;elementCodec", "a", "b"}, this, $$0);
        }
    }
}

