/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ku
extends Supplier<JsonElement> {
    public void a(dcc<?, ?> var1);

    public static c a() {
        return new c();
    }

    public static ku a(ku ... $$0) {
        return new a(b.a, Arrays.asList($$0));
    }

    public static ku b(ku ... $$0) {
        return new a(b.b, Arrays.asList($$0));
    }

    public static class c
    implements ku {
        private final Map<dde<?>, String> a = Maps.newHashMap();

        private static <T extends Comparable<T>> String a(dde<T> $$0, Stream<T> $$1) {
            return $$1.map($$0::a).collect(Collectors.joining("|"));
        }

        private static <T extends Comparable<T>> String c(dde<T> $$0, T $$1, T[] $$2) {
            return c.a($$0, Stream.concat(Stream.of($$1), Stream.of($$2)));
        }

        private <T extends Comparable<T>> void a(dde<T> $$0, String $$1) {
            String $$2 = this.a.put($$0, $$1);
            if ($$2 != null) {
                throw new IllegalStateException("Tried to replace " + $$0 + " value from " + $$2 + " to " + $$1);
            }
        }

        public final <T extends Comparable<T>> c a(dde<T> $$0, T $$1) {
            this.a($$0, $$0.a($$1));
            return this;
        }

        @SafeVarargs
        public final <T extends Comparable<T>> c a(dde<T> $$0, T $$1, T ... $$2) {
            this.a($$0, c.c($$0, $$1, $$2));
            return this;
        }

        public final <T extends Comparable<T>> c b(dde<T> $$0, T $$1) {
            this.a($$0, "!" + $$0.a($$1));
            return this;
        }

        @SafeVarargs
        public final <T extends Comparable<T>> c b(dde<T> $$0, T $$1, T ... $$2) {
            this.a($$0, "!" + c.c($$0, $$1, $$2));
            return this;
        }

        public JsonElement b() {
            JsonObject $$0 = new JsonObject();
            this.a.forEach(($$1, $$2) -> $$0.addProperty($$1.f(), $$2));
            return $$0;
        }

        @Override
        public void a(dcc<?, ?> $$0) {
            List $$12 = this.a.keySet().stream().filter($$1 -> $$0.a($$1.f()) != $$1).collect(Collectors.toList());
            if (!$$12.isEmpty()) {
                throw new IllegalStateException("Properties " + $$12 + " are missing from " + $$0);
            }
        }

        @Override
        public /* synthetic */ Object get() {
            return this.b();
        }
    }

    public static class a
    implements ku {
        private final b a;
        private final List<ku> b;

        a(b $$0, List<ku> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void a(dcc<?, ?> $$0) {
            this.b.forEach($$1 -> $$1.a($$0));
        }

        public JsonElement b() {
            JsonArray $$0 = new JsonArray();
            this.b.stream().map(Supplier::get).forEach(arg_0 -> ((JsonArray)$$0).add(arg_0));
            JsonObject $$1 = new JsonObject();
            $$1.add(this.a.c, (JsonElement)$$0);
            return $$1;
        }

        @Override
        public /* synthetic */ Object get() {
            return this.b();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("AND");
        public static final /* enum */ b b = new b("OR");
        final String c;
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.c = $$0;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            d = ku$b.a();
        }
    }
}

