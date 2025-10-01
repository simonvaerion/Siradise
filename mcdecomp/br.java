/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class br<V> {
    private static final String a = "variant";
    final Codec<V> b;
    final Function<bfj, Optional<V>> c;
    final bp.a d;

    public static <V> br<V> a(hr<V> $$0, Function<bfj, Optional<V>> $$1) {
        return new br<V>($$0.q(), $$1);
    }

    public static <V> br<V> a(Codec<V> $$0, Function<bfj, Optional<V>> $$1) {
        return new br<V>($$0, $$1);
    }

    private br(Codec<V> $$0, Function<bfj, Optional<V>> $$12) {
        this.b = $$0;
        this.c = $$12;
        this.d = $$1 -> {
            JsonElement $$2 = $$1.get(a);
            if ($$2 == null) {
                throw new JsonParseException("Missing variant field");
            }
            Object $$3 = ((Pair)ac.a($$0.decode(new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)$$2)), JsonParseException::new)).getFirst();
            return this.a($$3);
        };
    }

    public bp.a a() {
        return this.d;
    }

    public bp a(final V $$0) {
        return new bp(){

            @Override
            public boolean a(bfj $$02, aif $$12, @Nullable eei $$2) {
                return br.this.c.apply($$02).filter($$1 -> $$1.equals($$0)).isPresent();
            }

            @Override
            public JsonObject a() {
                JsonObject $$02 = new JsonObject();
                $$02.add(br.a, (JsonElement)ac.a(br.this.b.encodeStart((DynamicOps)JsonOps.INSTANCE, $$0), (String $$1) -> new JsonParseException("Can't serialize variant " + $$0 + ", message " + $$1)));
                return $$02;
            }

            @Override
            public bp.a c() {
                return br.this.d;
            }
        };
    }
}

