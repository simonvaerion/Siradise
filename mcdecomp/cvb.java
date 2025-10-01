/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class cvb
extends cwp {
    protected cvb(dca.d $$0) {
        super(cwp.b.c, $$0);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        czn $$5 = $$0.c_($$1);
        if ($$5 instanceof dax) {
            dax $$6 = (dax)$$5;
            GameProfile $$7 = null;
            if ($$4.u()) {
                qr $$8 = $$4.v();
                if ($$8.b("SkullOwner", 10)) {
                    $$7 = rd.a($$8.p("SkullOwner"));
                } else if ($$8.b("SkullOwner", 8) && !ac.b($$8.l("SkullOwner"))) {
                    $$7 = new GameProfile(null, $$8.l("SkullOwner"));
                }
            }
            $$6.a($$7);
        }
    }
}

