/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ear
extends eay {
    private static final Logger a = LogUtils.getLogger();
    final List<ckg> b;

    ear(eck[] $$0, Collection<ckg> $$1) {
        super($$0);
        this.b = ImmutableList.copyOf($$1);
    }

    @Override
    public eba b() {
        return ebb.d;
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        ckg $$6;
        apf $$22 = $$1.b();
        if (this.b.isEmpty()) {
            boolean $$3 = $$0.a(cgc.qb);
            List $$4 = jb.g.s().filter(ckg::i).filter($$2 -> $$3 || $$2.a($$0)).collect(Collectors.toList());
            if ($$4.isEmpty()) {
                a.warn("Couldn't find a compatible enchantment for {}", (Object)$$0);
                return $$0;
            }
            ckg $$5 = (ckg)$$4.get($$22.a($$4.size()));
        } else {
            $$6 = this.b.get($$22.a(this.b.size()));
        }
        return ear.a($$0, $$6, $$22);
    }

    private static cfz a(cfz $$0, ckg $$1, apf $$2) {
        int $$3 = apa.a($$2, $$1.e(), $$1.a());
        if ($$0.a(cgc.qb)) {
            $$0 = new cfz(cgc.tC);
            cev.a($$0, new ckj($$1, $$3));
        } else {
            $$0.a($$1, $$3);
        }
        return $$0;
    }

    public static a c() {
        return new a();
    }

    public static eay.a<?> d() {
        return ear.a($$0 -> new ear((eck[])$$0, (Collection<ckg>)ImmutableList.of()));
    }

    public static class a
    extends eay.a<a> {
        private final Set<ckg> a = Sets.newHashSet();

        protected a a() {
            return this;
        }

        public a a(ckg $$0) {
            this.a.add($$0);
            return this;
        }

        @Override
        public eaz b() {
            return new ear(this.g(), this.a);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class b
    extends eay.c<ear> {
        @Override
        public void a(JsonObject $$0, ear $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            if (!$$1.b.isEmpty()) {
                JsonArray $$3 = new JsonArray();
                for (ckg $$4 : $$1.b) {
                    acq $$5 = jb.g.b($$4);
                    if ($$5 == null) {
                        throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$4);
                    }
                    $$3.add((JsonElement)new JsonPrimitive($$5.toString()));
                }
                $$0.add("enchantments", (JsonElement)$$3);
            }
        }

        public ear a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            ArrayList $$3 = Lists.newArrayList();
            if ($$0.has("enchantments")) {
                JsonArray $$4 = aor.v($$0, "enchantments");
                for (JsonElement $$5 : $$4) {
                    String $$6 = aor.a($$5, "enchantment");
                    ckg $$7 = jb.g.b(new acq($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
                    $$3.add($$7);
                }
            }
            return new ear($$2, $$3);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

