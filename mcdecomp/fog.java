/*
 * Decompiled with CFR 0.152.
 */
public class fog
extends fre<bvn> {
    private static final acq a = new acq("textures/entity/spider/cave_spider.png");
    private static final float i = 0.7f;

    public fog(foy.a $$0) {
        super($$0, fed.q);
        this.d *= 0.7f;
    }

    @Override
    protected void a(bvn $$0, eij $$1, float $$2) {
        $$1.b(0.7f, 0.7f, 0.7f);
    }

    @Override
    public acq a(bvn $$0) {
        return a;
    }
}

