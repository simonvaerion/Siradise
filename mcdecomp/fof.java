/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fof
extends fqe<bro, faq<bro>> {
    public fof(foy.a $$0) {
        super($$0, new faq($$0.a(fed.n)), 0.4f);
        this.a(new fsi(this, $$0.f()));
    }

    @Override
    public acq a(bro $$0) {
        return $$0.ge();
    }

    @Override
    protected void a(bro $$0, eij $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b(0.8f, 0.8f, 0.8f);
    }

    @Override
    protected void a(bro $$0, eij $$1, float $$2, float $$3, float $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        float $$5 = $$0.D($$4);
        if ($$5 > 0.0f) {
            $$1.a(0.4f * $$5, 0.15f * $$5, 0.1f * $$5);
            $$1.a(a.f.rotationDegrees(apa.j($$5, 0.0f, 90.0f)));
            gu $$6 = $$0.di();
            List<byo> $$7 = $$0.dI().a(byo.class, new eed($$6).c(2.0, 2.0, 2.0));
            for (byo $$8 : $$7) {
                if (!$$8.fy()) continue;
                $$1.a(0.15f * $$5, 0.0f, 0.0f);
                break;
            }
        }
    }
}

