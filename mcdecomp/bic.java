/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class bic
implements bje {
    private final bfj a;
    private final boolean b;

    public bic(bfj $$0, boolean $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public eei a() {
        return this.b ? this.a.dg().b(0.0, this.a.cF(), 0.0) : this.a.dg();
    }

    @Override
    public gu b() {
        return this.a.di();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(bfz $$0) {
        void $$2;
        bfj bfj2 = this.a;
        if (!(bfj2 instanceof bfz)) {
            return true;
        }
        bfz $$1 = (bfz)bfj2;
        if (!$$2.bs()) {
            return false;
        }
        Optional<bpd> $$3 = $$0.dK().c(bpb.h);
        return $$3.isPresent() && $$3.get().a((bfz)$$2);
    }

    public bfj c() {
        return this.a;
    }

    public String toString() {
        return "EntityTracker for " + this.a;
    }
}

