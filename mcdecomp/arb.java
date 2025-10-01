/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.lang.reflect.Type;
import org.apache.commons.lang3.StringUtils;

public class arb
extends auz {
    public static final Gson a = new GsonBuilder().registerTypeAdapter(sw.class, (Object)new JsonDeserializer<sw>(){

        public tj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            if ($$0.isJsonPrimitive()) {
                return sw.b($$0.getAsString());
            }
            if ($$0.isJsonArray()) {
                JsonArray $$3 = $$0.getAsJsonArray();
                tj $$4 = null;
                for (JsonElement $$5 : $$3) {
                    tj $$6 = this.a($$5, $$5.getClass(), $$2);
                    if ($$4 == null) {
                        $$4 = $$6;
                        continue;
                    }
                    $$4.b($$6);
                }
                return $$4;
            }
            throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }).create();

    public arb(Schema $$0, boolean $$1) {
        super($$0, $$1, "BlockEntitySignTextStrictJsonFix", avw.l, "Sign");
    }

    private Dynamic<?> a(Dynamic<?> $$0, String $$1) {
        String $$2 = $$0.get($$1).asString("");
        sw $$3 = null;
        if ("null".equals($$2) || StringUtils.isEmpty((CharSequence)$$2)) {
            $$3 = sv.a;
        } else if ($$2.charAt(0) == '\"' && $$2.charAt($$2.length() - 1) == '\"' || $$2.charAt(0) == '{' && $$2.charAt($$2.length() - 1) == '}') {
            try {
                $$3 = aor.b(a, $$2, sw.class, true);
                if ($$3 == null) {
                    $$3 = sv.a;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            if ($$3 == null) {
                try {
                    $$3 = sw.a.a($$2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if ($$3 == null) {
                try {
                    $$3 = sw.a.b($$2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if ($$3 == null) {
                $$3 = sw.b($$2);
            }
        } else {
            $$3 = sw.b($$2);
        }
        return $$0.set($$1, $$0.createString(sw.a.a($$3)));
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> {
            $$0 = this.a((Dynamic<?>)$$0, "Text1");
            $$0 = this.a((Dynamic<?>)$$0, "Text2");
            $$0 = this.a((Dynamic<?>)$$0, "Text3");
            $$0 = this.a((Dynamic<?>)$$0, "Text4");
            return $$0;
        });
    }
}

