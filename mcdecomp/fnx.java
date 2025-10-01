/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class fnx
extends fpz<bux, fah> {
    public static final acq a = new acq("textures/entity/armorstand/wood.png");

    public fnx(foy.a $$0) {
        super($$0, new fai($$0.a(fed.b)), 0.0f);
        this.a(new fsw<bux, fah, fah>(this, new fah($$0.a(fed.c)), new fah($$0.a(fed.d)), $$0.g()));
        this.a(new fsz<bux, fah>(this, $$0.d()));
        this.a(new fsp<bux, fah>(this, $$0.f()));
        this.a(new fsl<bux, fah>(this, $$0.f(), $$0.d()));
    }

    @Override
    public acq a(bux $$0) {
        return a;
    }

    @Override
    protected void a(bux $$0, eij $$1, float $$2, float $$3, float $$4) {
        $$1.a(a.d.rotationDegrees(180.0f - $$3));
        float $$5 = (float)($$0.dI().V() - $$0.bJ) + $$4;
        if ($$5 < 5.0f) {
            $$1.a(a.d.rotationDegrees(apa.a($$5 / 1.5f * (float)Math.PI) * 3.0f));
        }
    }

    @Override
    protected boolean b(bux $$0) {
        float $$2;
        double $$1 = this.c.b($$0);
        float f2 = $$2 = $$0.bU() ? 32.0f : 64.0f;
        if ($$1 >= (double)($$2 * $$2)) {
            return false;
        }
        return $$0.cy();
    }

    @Override
    @Nullable
    protected fkf a(bux $$0, boolean $$1, boolean $$2, boolean $$3) {
        if (!$$0.w()) {
            return super.a($$0, $$1, $$2, $$3);
        }
        acq $$4 = this.a($$0);
        if ($$2) {
            return fkf.c($$4, false);
        }
        if ($$1) {
            return fkf.a($$4, false);
        }
        return null;
    }
}

