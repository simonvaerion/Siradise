/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class ezn
implements ezr {
    private final GameProfile a;
    private final acq b;
    private final sw c;

    public ezn(GameProfile $$0) {
        this.a = $$0;
        enn $$1 = enn.N();
        this.b = $$1.ak().b($$0);
        this.c = sw.b($$0.getName());
    }

    @Override
    public void a(ezp $$0) {
        enn.N().I().a(new aaw(this.a.getId()));
    }

    @Override
    public sw aI_() {
        return this.c;
    }

    @Override
    public void a(eox $$0, float $$1, int $$2) {
        $$0.a(1.0f, 1.0f, 1.0f, (float)$$2 / 255.0f);
        eqf.a($$0, this.b, 2, 2, 12);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public boolean aJ_() {
        return true;
    }
}

