/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class alt
extends alo<GameProfile> {
    public alt(GameProfile $$0) {
        super($$0);
    }

    public alt(JsonObject $$0) {
        super(alt.b($$0));
    }

    @Override
    protected void a(JsonObject $$0) {
        if (this.g() == null) {
            return;
        }
        $$0.addProperty("uuid", ((GameProfile)this.g()).getId() == null ? "" : ((GameProfile)this.g()).getId().toString());
        $$0.addProperty("name", ((GameProfile)this.g()).getName());
    }

    /*
     * WARNING - void declaration
     */
    private static GameProfile b(JsonObject $$0) {
        void $$4;
        if (!$$0.has("uuid") || !$$0.has("name")) {
            return null;
        }
        String $$1 = $$0.get("uuid").getAsString();
        try {
            UUID $$2 = UUID.fromString($$1);
        }
        catch (Throwable $$3) {
            return null;
        }
        return new GameProfile((UUID)$$4, $$0.get("name").getAsString());
    }
}

