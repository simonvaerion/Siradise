/*
 * Decompiled with CFR 0.152.
 */
public class frl
extends fny<byw> {
    public static final acq a = new acq("textures/entity/projectiles/arrow.png");
    public static final acq f = new acq("textures/entity/projectiles/tipped_arrow.png");

    public frl(foy.a $$0) {
        super($$0);
    }

    @Override
    public acq a(byw $$0) {
        return $$0.z() > 0 ? f : a;
    }
}

