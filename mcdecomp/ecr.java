/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ecr
implements eck {
    final bz a;

    public ecr(bz $$0) {
        this.a = $$0;
    }

    @Override
    public ecl b() {
        return ecm.j;
    }

    @Override
    public Set<ebt<?>> a() {
        return ImmutableSet.of(ebw.i);
    }

    public boolean a(dzk $$0) {
        cfz $$1 = $$0.c(ebw.i);
        return $$1 != null && this.a.a($$1);
    }

    public static eck.a a(bz.a $$0) {
        return () -> new ecr($$0.b());
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements dzt<ecr> {
        @Override
        public void a(JsonObject $$0, ecr $$1, JsonSerializationContext $$2) {
            $$0.add("predicate", $$1.a.a());
        }

        public ecr b(JsonObject $$0, JsonDeserializationContext $$1) {
            bz $$2 = bz.a($$0.get("predicate"));
            return new ecr($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

