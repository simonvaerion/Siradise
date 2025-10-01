/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class all
extends alp<GameProfile, alm> {
    public all(File $$0) {
        super($$0);
    }

    @Override
    protected alo<GameProfile> a(JsonObject $$0) {
        return new alm($$0);
    }

    @Override
    public String[] a() {
        return (String[])this.d().stream().map(alo::g).filter(Objects::nonNull).map(GameProfile::getName).toArray(String[]::new);
    }

    public boolean a(GameProfile $$0) {
        alm $$1 = (alm)this.b($$0);
        if ($$1 != null) {
            return $$1.b();
        }
        return false;
    }

    @Override
    protected String b(GameProfile $$0) {
        return $$0.getId().toString();
    }

    @Override
    protected /* synthetic */ String a(Object object) {
        return this.b((GameProfile)object);
    }
}

