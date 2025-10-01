/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ebl
extends eay {
    final boolean a;
    final List<sw> b;
    @Nullable
    final dzk.b c;

    public ebl(eck[] $$0, boolean $$1, List<sw> $$2, @Nullable dzk.b $$3) {
        super($$0);
        this.a = $$1;
        this.b = ImmutableList.copyOf($$2);
        this.c = $$3;
    }

    @Override
    public eba b() {
        return ebb.t;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.c != null ? ImmutableSet.of(this.c.a()) : ImmutableSet.of();
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        qx $$2 = this.a($$0, !this.b.isEmpty());
        if ($$2 != null) {
            if (this.a) {
                $$2.clear();
            }
            UnaryOperator<sw> $$3 = ebm.a($$1, this.c);
            this.b.stream().map($$3).map(sw.a::a).map(ri::a).forEach($$2::add);
        }
        return $$0;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    private qx a(cfz $$0, boolean $$1) {
        void $$7;
        void $$4;
        if ($$0.u()) {
            qr $$2 = $$0.v();
        } else if ($$1) {
            qr $$3 = new qr();
            $$0.c($$3);
        } else {
            return null;
        }
        if ($$4.b("display", 10)) {
            qr $$5 = $$4.p("display");
        } else if ($$1) {
            qr $$6 = new qr();
            $$4.a("display", $$6);
        } else {
            return null;
        }
        if ($$7.b("Lore", 9)) {
            return $$7.c("Lore", 8);
        }
        if ($$1) {
            qx $$8 = new qx();
            $$7.a("Lore", $$8);
            return $$8;
        }
        return null;
    }

    public static a c() {
        return new a();
    }

    public static class a
    extends eay.a<a> {
        private boolean a;
        private dzk.b b;
        private final List<sw> c = Lists.newArrayList();

        public a a(boolean $$0) {
            this.a = $$0;
            return this;
        }

        public a a(dzk.b $$0) {
            this.b = $$0;
            return this;
        }

        public a a(sw $$0) {
            this.c.add($$0);
            return this;
        }

        protected a a() {
            return this;
        }

        @Override
        public eaz b() {
            return new ebl(this.g(), this.a, this.c, this.b);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class b
    extends eay.c<ebl> {
        @Override
        public void a(JsonObject $$0, ebl $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.addProperty("replace", Boolean.valueOf($$1.a));
            JsonArray $$3 = new JsonArray();
            for (sw $$4 : $$1.b) {
                $$3.add(sw.a.c($$4));
            }
            $$0.add("lore", (JsonElement)$$3);
            if ($$1.c != null) {
                $$0.add("entity", $$2.serialize((Object)$$1.c));
            }
        }

        public ebl a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            boolean $$3 = aor.a($$0, "replace", false);
            List $$4 = (List)Streams.stream((Iterable)aor.v($$0, "lore")).map(sw.a::a).collect(ImmutableList.toImmutableList());
            dzk.b $$5 = aor.a($$0, "entity", null, $$1, dzk.b.class);
            return new ebl($$2, $$3, $$4, $$5);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

