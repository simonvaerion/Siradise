/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class eau
extends eay {
    final dzk.b a;

    public eau(eck[] $$0, dzk.b $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public eba b() {
        return ebb.u;
    }

    @Override
    public Set<ebt<?>> a() {
        return ImmutableSet.of(this.a.a());
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        bfj $$2;
        if ($$0.a(cgc.tt) && ($$2 = $$1.c(this.a.a())) instanceof byo) {
            GameProfile $$3 = ((byo)$$2).fM();
            $$0.w().a("SkullOwner", rd.a(new qr(), $$3));
        }
        return $$0;
    }

    public static eay.a<?> a(dzk.b $$0) {
        return eau.a((eck[] $$1) -> new eau((eck[])$$1, $$0));
    }

    public static class a
    extends eay.c<eau> {
        @Override
        public void a(JsonObject $$0, eau $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.add("entity", $$2.serialize((Object)$$1.a));
        }

        public eau a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            dzk.b $$3 = aor.a($$0, "entity", $$1, dzk.b.class);
            return new eau($$2, $$3);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

