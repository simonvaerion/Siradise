/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class eda
implements ecy {
    final acq a;

    eda(acq $$0) {
        this.a = $$0;
    }

    @Override
    public ecx a() {
        return ecz.a;
    }

    @Override
    @Nullable
    public rk a(dzk $$0) {
        return $$0.d().n().aG().a(this.a);
    }

    @Override
    public Set<ebt<?>> b() {
        return ImmutableSet.of();
    }

    public static class a
    implements dzt<eda> {
        @Override
        public void a(JsonObject $$0, eda $$1, JsonSerializationContext $$2) {
            $$0.addProperty("source", $$1.a.toString());
        }

        public eda b(JsonObject $$0, JsonDeserializationContext $$1) {
            String $$2 = aor.i($$0, "source");
            return new eda(new acq($$2));
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

