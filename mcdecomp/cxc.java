/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class cxc
extends cpn {
    public static final int a = 6;
    public static final int b = 64;
    private static final ha[] c = ha.values();

    protected cxc(dca.d $$0) {
        super($$0);
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$1, $$2);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        this.a($$1, $$2);
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    protected void a(cmm $$0, gu $$1) {
        if (this.b($$0, $$1)) {
            $$0.a($$1, cpo.aP.n(), 2);
            $$0.c(2001, $$1, cpn.i(cpo.G.n()));
        }
    }

    private boolean b(cmm $$02, gu $$12) {
        return gu.a($$12, 6, 65, (gu $$0, Consumer<gu> $$1) -> {
            for (ha $$2 : c) {
                $$1.accept($$0.a($$2));
            }
        }, (gu $$2) -> {
            cpt $$6;
            if ($$2.equals($$12)) {
                return true;
            }
            dcb $$3 = $$02.a_((gu)$$2);
            dxe $$4 = $$02.b_((gu)$$2);
            if (!$$4.a(anb.a)) {
                return false;
            }
            cpn $$5 = $$3.b();
            if ($$5 instanceof cpt && !($$6 = (cpt)((Object)$$5)).c($$02, (gu)$$2, $$3).b()) {
                return true;
            }
            if ($$3.b() instanceof cua) {
                $$02.a((gu)$$2, cpo.a.n(), 3);
            } else if ($$3.a(cpo.mc) || $$3.a(cpo.md) || $$3.a(cpo.bw) || $$3.a(cpo.bx)) {
                czn $$7 = $$3.t() ? $$02.c_((gu)$$2) : null;
                cxc.a($$3, $$02, $$2, $$7);
                $$02.a((gu)$$2, cpo.a.n(), 3);
            } else {
                return false;
            }
            return true;
        }) > 1;
    }
}

