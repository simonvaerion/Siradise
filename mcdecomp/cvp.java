/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cvp
extends cpn {
    public static final dcs a = cvq.a;

    public cvp(dca.d $$0) {
        super($$0);
        this.k((dcb)this.n().a(a, false));
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        return (dcb)this.n().a(a, $$0.q().B($$0.a()));
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        if ($$1.B) {
            return;
        }
        boolean $$6 = $$0.c(a);
        if ($$6 != $$1.B($$2)) {
            if ($$6) {
                $$1.a($$2, (cpn)this, 4);
            } else {
                $$1.a($$2, (dcb)$$0.a(a), 2);
            }
        }
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if ($$0.c(a).booleanValue() && !$$1.B($$2)) {
            $$1.a($$2, (dcb)$$0.a(a), 2);
        }
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }
}

