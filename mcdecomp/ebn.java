/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class ebn
extends eay {
    final qr a;

    ebn(eck[] $$0, qr $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public eba b() {
        return ebb.f;
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        $$0.w().a(this.a);
        return $$0;
    }

    @Deprecated
    public static eay.a<?> a(qr $$0) {
        return ebn.a((eck[] $$1) -> new ebn((eck[])$$1, $$0));
    }

    public static class a
    extends eay.c<ebn> {
        @Override
        public void a(JsonObject $$0, ebn $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.addProperty("tag", $$1.a.toString());
        }

        public ebn a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            try {
                qr $$3 = rl.a(aor.i($$0, "tag"));
                return new ebn($$2, $$3);
            }
            catch (CommandSyntaxException $$4) {
                throw new JsonSyntaxException($$4.getMessage());
            }
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

