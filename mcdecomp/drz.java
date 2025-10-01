/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public abstract class drz
extends dsa {
    private final a d;
    private final int e;
    private final int f;

    protected drz(a $$0, int $$1, int $$2, dsa.c $$3) {
        super($$3);
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        if (drz.a($$0, this.e, this.f) < $$0.b().e()) {
            return Optional.empty();
        }
        return drz.a($$0, dhk.a.a, $$1 -> this.a((dss)$$1, $$0));
    }

    private void a(dss $$0, dsa.a $$1) {
        clt $$2 = $$1.h();
        $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
    }

    @FunctionalInterface
    protected static interface a {
        public dse construct(dij var1, int var2, int var3);
    }
}

