/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.mutable.MutableInt;

public class dzr {
    final eaf[] a;
    final eck[] b;
    private final Predicate<dzk> c;
    final eaz[] d;
    private final BiFunction<cfz, dzk, cfz> e;
    final edf f;
    final edf g;

    dzr(eaf[] $$0, eck[] $$1, eaz[] $$2, edf $$3, edf $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = ecm.a($$1);
        this.d = $$2;
        this.e = ebb.a($$2);
        this.f = $$3;
        this.g = $$4;
    }

    private void b(Consumer<cfz> $$0, dzk $$1) {
        apf $$2 = $$1.b();
        ArrayList $$32 = Lists.newArrayList();
        MutableInt $$4 = new MutableInt();
        for (eaf $$5 : this.a) {
            $$5.expand($$1, $$3 -> {
                int $$4 = $$3.a($$1.c());
                if ($$4 > 0) {
                    $$32.add($$3);
                    $$4.add($$4);
                }
            });
        }
        int $$6 = $$32.size();
        if ($$4.intValue() == 0 || $$6 == 0) {
            return;
        }
        if ($$6 == 1) {
            ((eae)$$32.get(0)).a($$0, $$1);
            return;
        }
        int $$7 = $$2.a($$4.intValue());
        for (eae $$8 : $$32) {
            if (($$7 -= $$8.a($$1.c())) >= 0) continue;
            $$8.a($$0, $$1);
            return;
        }
    }

    public void a(Consumer<cfz> $$0, dzk $$1) {
        if (!this.c.test($$1)) {
            return;
        }
        Consumer<cfz> $$2 = eaz.a(this.e, $$0, $$1);
        int $$3 = this.f.a($$1) + apa.d(this.g.b($$1) * $$1.c());
        for (int $$4 = 0; $$4 < $$3; ++$$4) {
            this.b($$2, $$1);
        }
    }

    public void a(dzv $$0) {
        for (int $$1 = 0; $$1 < this.b.length; ++$$1) {
            this.b[$$1].a($$0.b(".condition[" + $$1 + "]"));
        }
        for (int $$2 = 0; $$2 < this.d.length; ++$$2) {
            this.d[$$2].a($$0.b(".functions[" + $$2 + "]"));
        }
        for (int $$3 = 0; $$3 < this.a.length; ++$$3) {
            this.a[$$3].a($$0.b(".entries[" + $$3 + "]"));
        }
        this.f.a($$0.b(".rolls"));
        this.g.a($$0.b(".bonusRolls"));
    }

    public static a a() {
        return new a();
    }

    public static class a
    implements eaw<a>,
    ecd<a> {
        private final List<eaf> a = Lists.newArrayList();
        private final List<eck> b = Lists.newArrayList();
        private final List<eaz> c = Lists.newArrayList();
        private edf d = edd.a(1.0f);
        private edf e = edd.a(0.0f);

        public a a(edf $$0) {
            this.d = $$0;
            return this;
        }

        public a a() {
            return this;
        }

        public a b(edf $$0) {
            this.e = $$0;
            return this;
        }

        public a a(eaf.a<?> $$0) {
            this.a.add($$0.b());
            return this;
        }

        public a a(eck.a $$0) {
            this.b.add($$0.build());
            return this;
        }

        public a a(eaz.a $$0) {
            this.c.add($$0.b());
            return this;
        }

        public dzr b() {
            if (this.d == null) {
                throw new IllegalArgumentException("Rolls not set");
            }
            return new dzr(this.a.toArray(new eaf[0]), this.b.toArray(new eck[0]), this.c.toArray(new eaz[0]), this.d, this.e);
        }

        @Override
        public /* synthetic */ eaw c() {
            return this.a();
        }

        @Override
        public /* synthetic */ eaw b(eaz.a a2) {
            return this.a(a2);
        }

        @Override
        public /* synthetic */ ecd d() {
            return this.a();
        }

        @Override
        public /* synthetic */ ecd b(eck.a a2) {
            return this.a(a2);
        }
    }

    public static class b
    implements JsonDeserializer<dzr>,
    JsonSerializer<dzr> {
        public dzr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = aor.m($$0, "loot pool");
            eaf[] $$4 = aor.a($$3, "entries", $$2, eaf[].class);
            eck[] $$5 = aor.a($$3, "conditions", new eck[0], $$2, eck[].class);
            eaz[] $$6 = aor.a($$3, "functions", new eaz[0], $$2, eaz[].class);
            edf $$7 = aor.a($$3, "rolls", $$2, edf.class);
            edf $$8 = aor.a($$3, "bonus_rolls", edd.a(0.0f), $$2, edf.class);
            return new dzr($$4, $$5, $$6, $$7, $$8);
        }

        public JsonElement a(dzr $$0, Type $$1, JsonSerializationContext $$2) {
            JsonObject $$3 = new JsonObject();
            $$3.add("rolls", $$2.serialize((Object)$$0.f));
            $$3.add("bonus_rolls", $$2.serialize((Object)$$0.g));
            $$3.add("entries", $$2.serialize((Object)$$0.a));
            if (!ArrayUtils.isEmpty((Object[])$$0.b)) {
                $$3.add("conditions", $$2.serialize((Object)$$0.b));
            }
            if (!ArrayUtils.isEmpty((Object[])$$0.d)) {
                $$3.add("functions", $$2.serialize((Object)$$0.d));
            }
            return $$3;
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((dzr)object, type, jsonSerializationContext);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

