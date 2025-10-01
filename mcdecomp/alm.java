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
import java.util.UUID;
import javax.annotation.Nullable;

public class alm
extends alo<GameProfile> {
    private final int a;
    private final boolean b;

    public alm(GameProfile $$0, int $$1, boolean $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    public alm(JsonObject $$0) {
        super(alm.b($$0));
        this.a = $$0.has("level") ? $$0.get("level").getAsInt() : 0;
        this.b = $$0.has("bypassesPlayerLimit") && $$0.get("bypassesPlayerLimit").getAsBoolean();
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    @Override
    protected void a(JsonObject $$0) {
        if (this.g() == null) {
            return;
        }
        $$0.addProperty("uuid", ((GameProfile)this.g()).getId() == null ? "" : ((GameProfile)this.g()).getId().toString());
        $$0.addProperty("name", ((GameProfile)this.g()).getName());
        $$0.addProperty("level", (Number)this.a);
        $$0.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.b));
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
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

