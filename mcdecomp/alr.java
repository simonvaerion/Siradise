/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class alr
extends alf<GameProfile> {
    public alr(GameProfile $$0) {
        this($$0, (Date)null, (String)null, (Date)null, (String)null);
    }

    public alr(GameProfile $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    public alr(JsonObject $$0) {
        super(alr.b($$0), $$0);
    }

    @Override
    protected void a(JsonObject $$0) {
        if (this.g() == null) {
            return;
        }
        $$0.addProperty("uuid", ((GameProfile)this.g()).getId() == null ? "" : ((GameProfile)this.g()).getId().toString());
        $$0.addProperty("name", ((GameProfile)this.g()).getName());
        super.a($$0);
    }

    @Override
    public sw e() {
        GameProfile $$0 = (GameProfile)this.g();
        return sw.b($$0.getName() != null ? $$0.getName() : Objects.toString($$0.getId(), "(Unknown)"));
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

