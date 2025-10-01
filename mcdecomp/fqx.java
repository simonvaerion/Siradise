/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class fqx
extends fqe<bwi, fcy<bwi>> {
    private static final acq a = new acq("textures/" + fkj.i.b().a() + ".png");
    private static final acq[] i = (acq[])fkj.j.stream().map($$0 -> new acq("textures/" + $$0.b().a() + ".png")).toArray(acq[]::new);

    public fqx(foy.a $$0) {
        super($$0, new fcy($$0.a(fed.be)), 0.0f);
        this.a(new ftj(this));
    }

    @Override
    public eei a(bwi $$0, float $$1) {
        return $$0.E($$1).orElse(super.a($$0, $$1));
    }

    @Override
    public boolean a(bwi $$0, fmw $$1, double $$22, double $$3, double $$4) {
        if (super.a($$0, $$1, $$22, $$3, $$4)) {
            return true;
        }
        return $$0.E(0.0f).filter($$2 -> {
            bfn<?> $$3 = $$0.ae();
            float $$4 = $$3.l() / 2.0f;
            float $$5 = $$3.k() / 2.0f;
            eei $$6 = eei.c($$0.di());
            return $$1.a(new eed($$2.c, $$2.d + (double)$$4, $$2.e, $$6.c, $$6.d + (double)$$4, $$6.e).c($$5, $$4, $$5));
        }).isPresent();
    }

    @Override
    public acq a(bwi $$0) {
        return fqx.a($$0.fZ());
    }

    public static acq a(@Nullable cen $$0) {
        if ($$0 == null) {
            return a;
        }
        return i[$$0.a()];
    }

    @Override
    protected void a(bwi $$0, eij $$1, float $$2, float $$3, float $$4) {
        super.a($$0, $$1, $$2, $$3 + 180.0f, $$4);
        $$1.a(0.0, 0.5, 0.0);
        $$1.a($$0.w().g().b());
        $$1.a(0.0, -0.5, 0.0);
    }
}

