/*
 * Decompiled with CFR 0.152.
 */
public class fth<T extends bfj, M extends fbf<T>>
extends ftg<T, M> {
    private final acq a;
    private final M b;

    public fth(fqt<T, M> $$0, M $$1, acq $$2) {
        super($$0);
        this.b = $$1;
        this.a = $$2;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        if (!((bgq)$$3).i()) {
            return;
        }
        ((fbf)this.c()).a(this.b);
        ((fbf)this.b).a($$3, $$4, $$5, $$6);
        ((fbf)this.b).a($$3, $$4, $$5, $$7, $$8, $$9);
        ein $$10 = $$1.getBuffer(fkf.d(this.a));
        ((fcb)this.b).a($$0, $$10, $$2, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
    }
}

