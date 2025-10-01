/*
 * Decompiled with CFR 0.152.
 */
public class fpe
extends fox<bzb> {
    private final fpw a;

    public fpe(foy.a $$0) {
        super($$0);
        this.a = $$0.b();
    }

    @Override
    public void a(bzb $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        $$3.a(this.c.b());
        $$3.a(a.d.rotationDegrees(180.0f));
        if ($$0.k()) {
            $$3.a(a.f.rotationDegrees(180.0f));
            $$3.a(a.d.rotationDegrees(180.0f));
            $$3.a(a.b.rotationDegrees(90.0f));
        }
        this.a.a($$0.j(), cfw.h, $$5, fum.d, $$3, $$4, $$0.dI(), $$0.af());
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bzb $$0) {
        return fuu.e;
    }
}

