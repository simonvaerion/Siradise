/*
 * Decompiled with CFR 0.152.
 */
public interface bxz {
    public static final String c_ = "Inventory";

    public bee w();

    public static void a(bgb $$0, bxz $$1, bvh $$2) {
        cfz $$3 = $$2.j();
        if ($$0.k($$3)) {
            bee $$4 = $$1.w();
            boolean $$5 = $$4.b($$3);
            if (!$$5) {
                return;
            }
            $$0.a($$2);
            int $$6 = $$3.L();
            cfz $$7 = $$4.a($$3);
            $$0.a((bfj)$$2, $$6 - $$7.L());
            if ($$7.b()) {
                $$2.ai();
            } else {
                $$3.f($$7.L());
            }
        }
    }

    default public void c(qr $$0) {
        if ($$0.b(c_, 9)) {
            this.w().a($$0.c(c_, 10));
        }
    }

    default public void a_(qr $$0) {
        $$0.a(c_, this.w().g());
    }
}

