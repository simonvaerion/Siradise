/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class ecw
implements ecy {
    private static final String b = "block_entity";
    private static final a c = new a(){

        @Override
        public rk a(dzk $$0) {
            czn $$1 = $$0.c(ebw.h);
            return $$1 != null ? $$1.m() : null;
        }

        @Override
        public String a() {
            return ecw.b;
        }

        @Override
        public Set<ebt<?>> b() {
            return ImmutableSet.of(ebw.h);
        }
    };
    public static final ecw a = new ecw(c);
    final a d;

    private static a b(final dzk.b $$0) {
        return new a(){

            @Override
            @Nullable
            public rk a(dzk $$02) {
                bfj $$1 = $$02.c($$0.a());
                return $$1 != null ? cl.b($$1) : null;
            }

            @Override
            public String a() {
                return $$0.name();
            }

            @Override
            public Set<ebt<?>> b() {
                return ImmutableSet.of($$0.a());
            }
        };
    }

    private ecw(a $$0) {
        this.d = $$0;
    }

    @Override
    public ecx a() {
        return ecz.b;
    }

    @Override
    @Nullable
    public rk a(dzk $$0) {
        return this.d.a($$0);
    }

    @Override
    public Set<ebt<?>> b() {
        return this.d.b();
    }

    public static ecy a(dzk.b $$0) {
        return new ecw(ecw.b($$0));
    }

    static ecw a(String $$0) {
        if ($$0.equals(b)) {
            return new ecw(c);
        }
        dzk.b $$1 = dzk.b.a($$0);
        return new ecw(ecw.b($$1));
    }

    static interface a {
        @Nullable
        public rk a(dzk var1);

        public String a();

        public Set<ebt<?>> b();
    }

    public static class b
    implements dzi.b<ecw> {
        @Override
        public JsonElement a(ecw $$0, JsonSerializationContext $$1) {
            return new JsonPrimitive($$0.d.a());
        }

        public ecw b(JsonElement $$0, JsonDeserializationContext $$1) {
            String $$2 = $$0.getAsString();
            return ecw.a($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonElement, jsonDeserializationContext);
        }
    }

    public static class c
    implements dzt<ecw> {
        @Override
        public void a(JsonObject $$0, ecw $$1, JsonSerializationContext $$2) {
            $$0.addProperty("target", $$1.d.a());
        }

        public ecw b(JsonObject $$0, JsonDeserializationContext $$1) {
            String $$2 = aor.i($$0, "target");
            return ecw.a($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

