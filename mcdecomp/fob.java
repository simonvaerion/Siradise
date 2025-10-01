/*
 * Decompiled with CFR 0.152.
 */
public class fob
extends fqe<brm, fal<brm>> {
    private static final acq a = new acq("textures/entity/bee/bee_angry.png");
    private static final acq i = new acq("textures/entity/bee/bee_angry_nectar.png");
    private static final acq j = new acq("textures/entity/bee/bee.png");
    private static final acq k = new acq("textures/entity/bee/bee_nectar.png");

    public fob(foy.a $$0) {
        super($$0, new fal($$0.a(fed.j)), 0.4f);
    }

    @Override
    public acq a(brm $$0) {
        if ($$0.S_()) {
            if ($$0.gi()) {
                return i;
            }
            return a;
        }
        if ($$0.gi()) {
            return k;
        }
        return j;
    }
}

