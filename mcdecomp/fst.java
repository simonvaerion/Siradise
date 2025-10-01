/*
 * Decompiled with CFR 0.152.
 */
public class fst
extends ftg<brv, fbh<brv>> {
    private final fjt a;

    public fst(fqt<brv, fbh<brv>> $$0, fjt $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, brv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        boolean $$10 = $$3.fy();
        boolean $$11 = $$3.h_();
        $$0.a();
        if ($$11) {
            float $$12 = 0.75f;
            $$0.b(0.75f, 0.75f, 0.75f);
            $$0.a(0.0f, 0.5f, 0.209375f);
        }
        $$0.a(((fbh)this.c()).a.b / 16.0f, ((fbh)this.c()).a.c / 16.0f, ((fbh)this.c()).a.d / 16.0f);
        float $$13 = $$3.D($$6);
        $$0.a(a.f.rotation($$13));
        $$0.a(a.d.rotationDegrees($$8));
        $$0.a(a.b.rotationDegrees($$9));
        if ($$3.h_()) {
            if ($$10) {
                $$0.a(0.4f, 0.26f, 0.15f);
            } else {
                $$0.a(0.06f, 0.26f, -0.5f);
            }
        } else if ($$10) {
            $$0.a(0.46f, 0.26f, 0.22f);
        } else {
            $$0.a(0.06f, 0.27f, -0.5f);
        }
        $$0.a(a.b.rotationDegrees(90.0f));
        if ($$10) {
            $$0.a(a.f.rotationDegrees(90.0f));
        }
        cfz $$14 = $$3.c(bfo.a);
        this.a.a($$3, $$14, cfw.h, false, $$0, $$1, $$2);
        $$0.b();
    }
}

