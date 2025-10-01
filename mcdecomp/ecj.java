/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Set;

public class ecj
implements eck {
    final cpn a;
    final cz b;

    ecj(cpn $$0, cz $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public ecl b() {
        return ecm.i;
    }

    @Override
    public Set<ebt<?>> a() {
        return ImmutableSet.of(ebw.g);
    }

    public boolean a(dzk $$0) {
        dcb $$1 = $$0.c(ebw.g);
        return $$1 != null && $$1.a(this.a) && this.b.a($$1);
    }

    public static a a(cpn $$0) {
        return new a($$0);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements eck.a {
        private final cpn a;
        private cz b = cz.a;

        public a(cpn $$0) {
            this.a = $$0;
        }

        public a a(cz.a $$0) {
            this.b = $$0.b();
            return this;
        }

        @Override
        public eck build() {
            return new ecj(this.a, this.b);
        }
    }

    public static class b
    implements dzt<ecj> {
        @Override
        public void a(JsonObject $$0, ecj $$1, JsonSerializationContext $$2) {
            $$0.addProperty("block", jb.f.b($$1.a).toString());
            $$0.add("properties", $$1.b.a());
        }

        public ecj b(JsonObject $$0, JsonDeserializationContext $$12) {
            acq $$2 = new acq(aor.i($$0, "block"));
            cpn $$3 = (cpn)jb.f.b($$2).orElseThrow(() -> new IllegalArgumentException("Can't find block " + $$2));
            cz $$4 = cz.a($$0.get("properties"));
            $$4.a($$3.l(), (String $$1) -> {
                throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1);
            });
            return new ecj($$3, $$4);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

