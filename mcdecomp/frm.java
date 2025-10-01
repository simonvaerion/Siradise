/*
 * Decompiled with CFR 0.152.
 */
public class frm
extends fqd<car> {
    private final fko f;

    public frm(foy.a $$0) {
        super($$0, fed.bA);
        this.f = $$0.c();
    }

    @Override
    protected void a(car $$0, float $$1, dcb $$2, eij $$3, fjx $$4, int $$5) {
        int $$6 = $$0.C();
        if ($$6 > -1 && (float)$$6 - $$1 + 1.0f < 10.0f) {
            float $$7 = 1.0f - ((float)$$6 - $$1 + 1.0f) / 10.0f;
            $$7 = apa.a($$7, 0.0f, 1.0f);
            $$7 *= $$7;
            $$7 *= $$7;
            float $$8 = 1.0f + $$7 * 0.3f;
            $$3.b($$8, $$8, $$8);
        }
        frm.a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
    }

    public static void a(fko $$0, dcb $$1, eij $$2, fjx $$3, int $$4, boolean $$5) {
        int $$7;
        if ($$5) {
            int $$6 = fum.a(fum.a(1.0f), 10);
        } else {
            $$7 = fum.d;
        }
        $$0.a($$1, $$2, $$3, $$4, $$7);
    }
}

