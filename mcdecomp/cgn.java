/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class cgn
extends chi {
    public static final String c = "SkullOwner";

    public cgn(cpn $$0, cpn $$1, cfu.a $$2) {
        super($$0, $$1, $$2, ha.a);
    }

    @Override
    public sw m(cfz $$0) {
        if ($$0.a(cgc.tt) && $$0.u()) {
            qr $$3;
            String $$1 = null;
            qr $$2 = $$0.v();
            if ($$2.b(c, 8)) {
                $$1 = $$2.l(c);
            } else if ($$2.b(c, 10) && ($$3 = $$2.p(c)).b("Name", 8)) {
                $$1 = $$3.l("Name");
            }
            if ($$1 != null) {
                return sw.a(this.a() + ".named", new Object[]{$$1});
            }
        }
        return super.m($$0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        if ($$0.b(c, 8) && !ac.b($$0.l(c))) {
            GameProfile $$12 = new GameProfile(null, $$0.l(c));
            dax.a($$12, (GameProfile $$1) -> $$0.a(c, rd.a(new qr(), $$1)));
        }
    }
}

