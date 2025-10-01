/*
 * Decompiled with CFR 0.152.
 */
public class fre<T extends bwn>
extends fqe<T, fdg<T>> {
    private static final acq a = new acq("textures/entity/spider/spider.png");

    public fre(foy.a $$0) {
        this($$0, fed.br);
    }

    public fre(foy.a $$0, fec $$1) {
        super($$0, new fdg($$0.a($$1)), 0.8f);
        this.a(new ftm(this));
    }

    protected float b(T $$0) {
        return 180.0f;
    }

    @Override
    public acq a(T $$0) {
        return a;
    }

    @Override
    protected /* synthetic */ float c(bfz bfz2) {
        return this.b((T)((bwn)bfz2));
    }
}

