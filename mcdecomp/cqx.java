/*
 * Decompiled with CFR 0.152.
 */
public class cqx
extends csf {
    private final dcb a;

    public cqx(cpn $$0, dca.d $$1) {
        super($$1);
        this.a = $$0.n();
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, dcb $$3, bvg $$4) {
        if (cqx.b($$0, $$1, $$3)) {
            $$0.a($$1, this.a, 3);
        }
    }

    @Override
    public dcb a(cih $$0) {
        dcb $$3;
        gu $$2;
        cmm $$1 = $$0.q();
        if (cqx.b($$1, $$2 = $$0.a(), $$3 = $$1.a_($$2))) {
            return this.a;
        }
        return super.a($$0);
    }

    private static boolean b(cls $$0, gu $$1, dcb $$2) {
        return cqx.n($$2) || cqx.a($$0, $$1);
    }

    private static boolean a(cls $$0, gu $$1) {
        boolean $$2 = false;
        gu.a $$3 = $$1.j();
        for (ha $$4 : ha.values()) {
            dcb $$5 = $$0.a_($$3);
            if ($$4 == ha.a && !cqx.n($$5)) continue;
            $$3.a((hz)$$1, $$4);
            $$5 = $$0.a_($$3);
            if (!cqx.n($$5) || $$5.d($$0, $$1, $$4.g())) continue;
            $$2 = true;
            break;
        }
        return $$2;
    }

    private static boolean n(dcb $$0) {
        return $$0.u().a(anb.a);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (cqx.a($$3, $$4)) {
            return this.a;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public int d(dcb $$0, cls $$1, gu $$2) {
        return $$0.d((cls)$$1, (gu)$$2).ak;
    }
}

