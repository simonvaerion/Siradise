/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bmx
extends bns {
    private static final int i = 2;
    private static final int j = 32;
    private static final int k = 10;
    private static final int l = 7;

    public bmx(bgi $$0, double $$1) {
        super($$0, $$1, 240, false);
    }

    @Override
    @Nullable
    protected eei h() {
        eei $$2;
        float $$0 = this.b.dI().z.i();
        if (this.b.dI().z.i() < 0.3f) {
            return this.k();
        }
        if ($$0 < 0.7f) {
            eei $$1 = this.l();
            if ($$1 == null) {
                $$1 = this.m();
            }
        } else {
            $$2 = this.m();
            if ($$2 == null) {
                $$2 = this.l();
            }
        }
        return $$2 == null ? this.k() : $$2;
    }

    @Nullable
    private eei k() {
        return bqt.a(this.b, 10, 7);
    }

    @Nullable
    private eei l() {
        aif $$0 = (aif)this.b.dI();
        List<byb> $$1 = $$0.a(bfn.bf, this.b.cE().g(32.0), this::a);
        if ($$1.isEmpty()) {
            return null;
        }
        byb $$2 = $$1.get(this.b.dI().z.a($$1.size()));
        eei $$3 = $$2.dg();
        return bqt.a(this.b, 10, 7, $$3);
    }

    @Nullable
    private eei m() {
        hx $$0 = this.n();
        if ($$0 == null) {
            return null;
        }
        gu $$1 = this.a($$0);
        if ($$1 == null) {
            return null;
        }
        return bqt.a(this.b, 10, 7, eei.c($$1));
    }

    @Nullable
    private hx n() {
        aif $$0 = (aif)this.b.dI();
        List $$12 = hx.a(hx.a(this.b), 2).filter($$1 -> $$0.b((hx)$$1) == 0).collect(Collectors.toList());
        if ($$12.isEmpty()) {
            return null;
        }
        return (hx)$$12.get($$0.z.a($$12.size()));
    }

    @Nullable
    private gu a(hx $$02) {
        aif $$1 = (aif)this.b.dI();
        bqz $$2 = $$1.w();
        List $$3 = $$2.c($$0 -> true, $$02.q(), 8, bqz.b.b).map(bra::f).collect(Collectors.toList());
        if ($$3.isEmpty()) {
            return null;
        }
        return (gu)$$3.get($$1.z.a($$3.size()));
    }

    private boolean a(byb $$0) {
        return $$0.a(this.b.dI().V());
    }
}

