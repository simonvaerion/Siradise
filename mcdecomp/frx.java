/*
 * Decompiled with CFR 0.152.
 */
public class frx
extends fqe<buv, fdu<buv>> {
    private static final acq a = new acq("textures/entity/wither/wither_invulnerable.png");
    private static final acq i = new acq("textures/entity/wither/wither.png");

    public frx(foy.a $$0) {
        super($$0, new fdu($$0.a(fed.bO)), 1.0f);
        this.a(new ftu(this, $$0.f()));
    }

    @Override
    protected int a(buv $$0, gu $$1) {
        return 15;
    }

    @Override
    public acq a(buv $$0) {
        int $$1 = $$0.w();
        if ($$1 <= 0 || $$1 <= 80 && $$1 / 5 % 2 == 1) {
            return i;
        }
        return a;
    }

    @Override
    protected void a(buv $$0, eij $$1, float $$2) {
        float $$3 = 2.0f;
        int $$4 = $$0.w();
        if ($$4 > 0) {
            $$3 -= ((float)$$4 - $$2) / 220.0f * 0.5f;
        }
        $$1.b($$3, $$3, $$3);
    }
}

