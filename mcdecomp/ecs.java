/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class ecs
implements eck {
    @Nullable
    final Long a;
    final dzj b;

    ecs(@Nullable Long $$0, dzj $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public ecl b() {
        return ecm.q;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.b.a();
    }

    public boolean a(dzk $$0) {
        aif $$1 = $$0.d();
        long $$2 = $$1.W();
        if (this.a != null) {
            $$2 %= this.a.longValue();
        }
        return this.b.b($$0, (int)$$2);
    }

    public static a a(dzj $$0) {
        return new a($$0);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements eck.a {
        @Nullable
        private Long a;
        private final dzj b;

        public a(dzj $$0) {
            this.b = $$0;
        }

        public a a(long $$0) {
            this.a = $$0;
            return this;
        }

        public ecs a() {
            return new ecs(this.a, this.b);
        }

        @Override
        public /* synthetic */ eck build() {
            return this.a();
        }
    }

    public static class b
    implements dzt<ecs> {
        @Override
        public void a(JsonObject $$0, ecs $$1, JsonSerializationContext $$2) {
            $$0.addProperty("period", (Number)$$1.a);
            $$0.add("value", $$2.serialize((Object)$$1.b));
        }

        public ecs b(JsonObject $$0, JsonDeserializationContext $$1) {
            Long $$2 = $$0.has("period") ? Long.valueOf(aor.n($$0, "period")) : null;
            dzj $$3 = aor.a($$0, "value", $$1, dzj.class);
            return new ecs($$2, $$3);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

