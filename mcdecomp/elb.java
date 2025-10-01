/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class elb
extends gan {
    protected BooleanConsumer a;
    private final sw b;
    private final sw c;

    public elb(BooleanConsumer $$0, sw $$1, sw $$2) {
        super(enf.a);
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public void b() {
        this.d(epi.a(sv.f, (epi $$0) -> this.a.accept(true)).a(this.g / 2 - 105, elb.h(9), 100, 20).a());
        this.d(epi.a(sv.g, (epi $$0) -> this.a.accept(false)).a(this.g / 2 + 5, elb.h(9), 100, 20).a());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.b, this.g / 2, elb.h(3), 0xFFFFFF);
        $$0.a(this.i, this.c, this.g / 2, elb.h(5), 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }
}

