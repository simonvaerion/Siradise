/*
 * Decompiled with CFR 0.152.
 */
public class ftf<T extends byo, M extends fbf<T> & fbn>
extends fsz<T, M> {
    private final fjt a;
    private static final float b = -0.5235988f;
    private static final float c = 1.5707964f;

    public ftf(fqt<T, M> $$0, fjt $$1) {
        super($$0, $$1);
        this.a = $$1;
    }

    @Override
    protected void a(bfz $$0, cfz $$1, cfw $$2, bft $$3, eij $$4, fjx $$5, int $$6) {
        if ($$1.a(cgc.qj) && $$0.fk() == $$1 && $$0.aI == 0) {
            this.a($$0, $$1, $$3, $$4, $$5, $$6);
        } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }
    }

    private void a(bfz $$0, cfz $$1, bft $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        fee $$6 = ((fbn)this.c()).d();
        float $$7 = $$6.e;
        $$6.e = apa.a($$6.e, -0.5235988f, 1.5707964f);
        $$6.a($$3);
        $$6.e = $$7;
        fsl.a($$3, false);
        boolean $$8 = $$2 == bft.a;
        $$3.a(($$8 ? -2.5f : 2.5f) / 16.0f, -0.0625f, 0.0f);
        this.a.a($$0, $$1, cfw.f, false, $$3, $$4, $$5);
        $$3.b();
    }
}

