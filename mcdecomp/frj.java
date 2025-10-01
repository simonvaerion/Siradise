/*
 * Decompiled with CFR 0.152.
 */
public class frj<T extends bfj>
extends fox<T> {
    private static final float a = 12.25f;
    private final fpw f;
    private final float g;
    private final boolean h;

    public frj(foy.a $$0, float $$1, boolean $$2) {
        super($$0);
        this.f = $$0.b();
        this.g = $$1;
        this.h = $$2;
    }

    public frj(foy.a $$0) {
        this($$0, 1.0f, false);
    }

    @Override
    protected int a(T $$0, gu $$1) {
        return this.h ? 15 : super.a($$0, $$1);
    }

    @Override
    public void a(T $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        if (((bfj)$$0).ag < 2 && this.c.b.g().f((bfj)$$0) < 12.25) {
            return;
        }
        $$3.a();
        $$3.b(this.g, this.g, this.g);
        $$3.a(this.c.b());
        $$3.a(a.d.rotationDegrees(180.0f));
        this.f.a(((bzd)$$0).j(), cfw.h, $$5, fum.d, $$3, $$4, ((bfj)$$0).dI(), ((bfj)$$0).af());
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bfj $$0) {
        return fuu.e;
    }
}

