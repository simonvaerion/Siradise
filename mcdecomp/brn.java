/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface brn {
    public boolean r();

    public void w(boolean var1);

    public void l(cfz var1);

    public void c(qr var1);

    public cfz b();

    public amg w();

    @Deprecated
    public static void a(bgb $$0, cfz $$1) {
        qr $$2 = $$1.w();
        if ($$0.aa()) {
            $$1.a($$0.ab());
        }
        if ($$0.fQ()) {
            $$2.a("NoAI", $$0.fQ());
        }
        if ($$0.aQ()) {
            $$2.a("Silent", $$0.aQ());
        }
        if ($$0.aR()) {
            $$2.a("NoGravity", $$0.aR());
        }
        if ($$0.bZ()) {
            $$2.a("Glowing", $$0.bZ());
        }
        if ($$0.co()) {
            $$2.a("Invulnerable", $$0.co());
        }
        $$2.a("Health", $$0.er());
    }

    @Deprecated
    public static void a(bgb $$0, qr $$1) {
        if ($$1.e("NoAI")) {
            $$0.t($$1.q("NoAI"));
        }
        if ($$1.e("Silent")) {
            $$0.d($$1.q("Silent"));
        }
        if ($$1.e("NoGravity")) {
            $$0.e($$1.q("NoGravity"));
        }
        if ($$1.e("Glowing")) {
            $$0.i($$1.q("Glowing"));
        }
        if ($$1.e("Invulnerable")) {
            $$0.m($$1.q("Invulnerable"));
        }
        if ($$1.b("Health", 99)) {
            $$0.t($$1.j("Health"));
        }
    }

    public static <T extends bfz> Optional<bdx> a(byo $$0, bdw $$1, T $$2) {
        cfz $$3 = $$0.b($$1);
        if ($$3.d() == cgc.pL && $$2.bs()) {
            $$2.a(((brn)((Object)$$2)).w(), 1.0f, 1.0f);
            cfz $$4 = ((brn)((Object)$$2)).b();
            ((brn)((Object)$$2)).l($$4);
            cfz $$5 = cgb.a($$3, $$0, $$4, false);
            $$0.a($$1, $$5);
            cmm $$6 = $$2.dI();
            if (!$$6.B) {
                ai.j.a((aig)$$0, $$4);
            }
            $$2.ai();
            return Optional.of(bdx.a($$6.B));
        }
        return Optional.empty();
    }
}

