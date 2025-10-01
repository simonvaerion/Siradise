/*
 * Decompiled with CFR 0.152.
 */
public class fqa
extends fqe<btn, fby<btn>> {
    private static final acq a = new acq("textures/entity/llama/creamy.png");
    private static final acq i = new acq("textures/entity/llama/white.png");
    private static final acq j = new acq("textures/entity/llama/brown.png");
    private static final acq k = new acq("textures/entity/llama/gray.png");

    public fqa(foy.a $$0, fec $$1) {
        super($$0, new fby($$0.a($$1)), 0.7f);
        this.a(new fta(this, $$0.f()));
    }

    @Override
    public acq a(btn $$0) {
        return switch ($$0.gk()) {
            default -> throw new IncompatibleClassChangeError();
            case btn.d.a -> a;
            case btn.d.b -> i;
            case btn.d.c -> j;
            case btn.d.d -> k;
        };
    }
}

