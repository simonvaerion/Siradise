/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ebe
extends eay {
    final List<Pair<he<cze>, cen>> a;
    final boolean b;

    ebe(eck[] $$0, List<Pair<he<cze>, cen>> $$1, boolean $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    @Override
    protected cfz a(cfz $$0, dzk $$1) {
        qx $$6;
        qr $$2 = cds.a($$0);
        if ($$2 == null) {
            $$2 = new qr();
        }
        cze.a $$3 = new cze.a();
        this.a.forEach($$3::a);
        qx $$4 = $$3.a();
        if (this.b) {
            qx $$5 = $$2.c("Patterns", 10).e();
            $$5.addAll($$4);
        } else {
            $$6 = $$4;
        }
        $$2.a("Patterns", $$6);
        cds.a($$0, czp.t, $$2);
        return $$0;
    }

    @Override
    public eba b() {
        return ebb.x;
    }

    public static a a(boolean $$0) {
        return new a($$0);
    }

    public static class a
    extends eay.a<a> {
        private final ImmutableList.Builder<Pair<he<cze>, cen>> a = ImmutableList.builder();
        private final boolean b;

        a(boolean $$0) {
            this.b = $$0;
        }

        protected a a() {
            return this;
        }

        @Override
        public eaz b() {
            return new ebe(this.g(), (List<Pair<he<cze>, cen>>)this.a.build(), this.b);
        }

        public a a(acp<cze> $$0, cen $$1) {
            return this.a(jb.al.f($$0), $$1);
        }

        public a a(he<cze> $$0, cen $$1) {
            this.a.add((Object)Pair.of($$0, (Object)$$1));
            return this;
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class b
    extends eay.c<ebe> {
        @Override
        public void a(JsonObject $$0, ebe $$12, JsonSerializationContext $$2) {
            super.a($$0, $$12, $$2);
            JsonArray $$3 = new JsonArray();
            $$12.a.forEach($$1 -> {
                JsonObject $$2 = new JsonObject();
                $$2.addProperty("pattern", ((he)$$1.getFirst()).e().orElseThrow(() -> new JsonSyntaxException("Unknown pattern: " + $$1.getFirst())).a().toString());
                $$2.addProperty("color", ((cen)$$1.getSecond()).b());
                $$3.add((JsonElement)$$2);
            });
            $$0.add("patterns", (JsonElement)$$3);
            $$0.addProperty("append", Boolean.valueOf($$12.b));
        }

        public ebe a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            ImmutableList.Builder $$3 = ImmutableList.builder();
            JsonArray $$4 = aor.v($$0, "patterns");
            for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
                JsonObject $$6 = aor.m($$4.get($$5), "pattern[" + $$5 + "]");
                String $$7 = aor.i($$6, "pattern");
                Optional<he.c<cze>> $$8 = jb.al.b(acp.a(jc.c, new acq($$7)));
                if ($$8.isEmpty()) {
                    throw new JsonSyntaxException("Unknown pattern: " + $$7);
                }
                String $$9 = aor.i($$6, "color");
                cen $$10 = cen.a($$9, null);
                if ($$10 == null) {
                    throw new JsonSyntaxException("Unknown color: " + $$9);
                }
                $$3.add((Object)Pair.of((Object)$$8.get(), (Object)$$10));
            }
            boolean $$11 = aor.k($$0, "append");
            return new ebe($$2, (List<Pair<he<cze>, cen>>)$$3.build(), $$11);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

