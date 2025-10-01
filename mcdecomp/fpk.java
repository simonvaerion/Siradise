/*
 * Decompiled with CFR 0.152.
 */
public class fpk
extends frf<bfr> {
    private static final acq a = new acq("textures/entity/squid/glow_squid.png");

    public fpk(foy.a $$0, fdh<bfr> $$1) {
        super($$0, $$1);
    }

    @Override
    public acq a(bfr $$0) {
        return a;
    }

    @Override
    protected int a(bfr $$0, gu $$1) {
        int $$2 = (int)apa.b(0.0f, 15.0f, 1.0f - (float)$$0.w() / 10.0f);
        if ($$2 == 15) {
            return 15;
        }
        return Math.max($$2, super.a($$0, $$1));
    }
}

