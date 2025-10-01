/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cz {
    public static final cz a = new cz((List<c>)ImmutableList.of());
    private final List<c> b;

    private static c a(String $$0, JsonElement $$1) {
        if ($$1.isJsonPrimitive()) {
            String $$2 = $$1.getAsString();
            return new b($$0, $$2);
        }
        JsonObject $$3 = aor.m($$1, "value");
        String $$4 = $$3.has("min") ? cz.b($$3.get("min")) : null;
        String $$5 = $$3.has("max") ? cz.b($$3.get("max")) : null;
        return $$4 != null && $$4.equals($$5) ? new b($$0, $$4) : new d($$0, $$4, $$5);
    }

    @Nullable
    private static String b(JsonElement $$0) {
        if ($$0.isJsonNull()) {
            return null;
        }
        return $$0.getAsString();
    }

    cz(List<c> $$0) {
        this.b = ImmutableList.copyOf($$0);
    }

    public <S extends dcd<?, S>> boolean a(dcc<?, S> $$0, S $$1) {
        for (c $$2 : this.b) {
            if ($$2.a($$0, $$1)) continue;
            return false;
        }
        return true;
    }

    public boolean a(dcb $$0) {
        return this.a($$0.b().l(), $$0);
    }

    public boolean a(dxe $$0) {
        return this.a($$0.a().f(), $$0);
    }

    public void a(dcc<?, ?> $$0, Consumer<String> $$1) {
        this.b.forEach($$2 -> $$2.a($$0, $$1));
    }

    public static cz a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "properties");
        ArrayList $$2 = Lists.newArrayList();
        for (Map.Entry $$3 : $$1.entrySet()) {
            $$2.add(cz.a((String)$$3.getKey(), (JsonElement)$$3.getValue()));
        }
        return new cz($$2);
    }

    public JsonElement a() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        if (!this.b.isEmpty()) {
            this.b.forEach($$1 -> $$0.add($$1.b(), $$1.a()));
        }
        return $$0;
    }

    static class b
    extends c {
        private final String a;

        public b(String $$0, String $$1) {
            super($$0);
            this.a = $$1;
        }

        @Override
        protected <T extends Comparable<T>> boolean a(dcd<?, ?> $$0, dde<T> $$1) {
            Comparable $$2 = $$0.c($$1);
            Optional<T> $$3 = $$1.b(this.a);
            return $$3.isPresent() && $$2.compareTo((Comparable)((Comparable)$$3.get())) == 0;
        }

        @Override
        public JsonElement a() {
            return new JsonPrimitive(this.a);
        }
    }

    static class d
    extends c {
        @Nullable
        private final String a;
        @Nullable
        private final String b;

        public d(String $$0, @Nullable String $$1, @Nullable String $$2) {
            super($$0);
            this.a = $$1;
            this.b = $$2;
        }

        @Override
        protected <T extends Comparable<T>> boolean a(dcd<?, ?> $$0, dde<T> $$1) {
            Optional<T> $$4;
            Optional<T> $$3;
            Comparable $$2 = $$0.c($$1);
            if (!(this.a == null || ($$3 = $$1.b(this.a)).isPresent() && $$2.compareTo((Comparable)((Comparable)$$3.get())) >= 0)) {
                return false;
            }
            return this.b == null || ($$4 = $$1.b(this.b)).isPresent() && $$2.compareTo((Comparable)((Comparable)$$4.get())) <= 0;
        }

        @Override
        public JsonElement a() {
            JsonObject $$0 = new JsonObject();
            if (this.a != null) {
                $$0.addProperty("min", this.a);
            }
            if (this.b != null) {
                $$0.addProperty("max", this.b);
            }
            return $$0;
        }
    }

    static abstract class c {
        private final String a;

        public c(String $$0) {
            this.a = $$0;
        }

        public <S extends dcd<?, S>> boolean a(dcc<?, S> $$0, S $$1) {
            dde<?> $$2 = $$0.a(this.a);
            if ($$2 == null) {
                return false;
            }
            return this.a($$1, $$2);
        }

        protected abstract <T extends Comparable<T>> boolean a(dcd<?, ?> var1, dde<T> var2);

        public abstract JsonElement a();

        public String b() {
            return this.a;
        }

        public void a(dcc<?, ?> $$0, Consumer<String> $$1) {
            dde<?> $$2 = $$0.a(this.a);
            if ($$2 == null) {
                $$1.accept(this.a);
            }
        }
    }

    public static class a {
        private final List<c> a = Lists.newArrayList();

        private a() {
        }

        public static a a() {
            return new a();
        }

        public a a(dde<?> $$0, String $$1) {
            this.a.add(new b($$0.f(), $$1));
            return this;
        }

        public a a(dde<Integer> $$0, int $$1) {
            return this.a((dde)$$0, (Comparable<T> & apr)Integer.toString($$1));
        }

        public a a(dde<Boolean> $$0, boolean $$1) {
            return this.a((dde)$$0, (Comparable<T> & apr)Boolean.toString($$1));
        }

        public <T extends Comparable<T> & apr> a a(dde<T> $$0, T $$1) {
            return this.a($$0, (T)((apr)$$1).c());
        }

        public cz b() {
            return new cz(this.a);
        }
    }
}

