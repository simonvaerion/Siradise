/*
 * Decompiled with CFR 0.152.
 */
public class ciw
extends ciu {
    private static final ciz a = ciz.a(cgc.qa);
    private static final ciz b = ciz.a(cgc.oG);
    private static final ciz c = ciz.a(cgc.tB);

    public ciw(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        boolean $$2 = false;
        int $$3 = 0;
        for (int $$4 = 0; $$4 < $$0.b(); ++$$4) {
            cfz $$5 = $$0.a($$4);
            if ($$5.b()) continue;
            if (a.a($$5)) {
                if ($$2) {
                    return false;
                }
                $$2 = true;
                continue;
            }
            if (!(b.a($$5) ? ++$$3 > 3 : !c.a($$5))) continue;
            return false;
        }
        return $$2 && $$3 >= 1;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        cfz $$2 = new cfz(cgc.tA, 3);
        qr $$3 = $$2.a("Fireworks");
        qx $$4 = new qx();
        int $$5 = 0;
        for (int $$6 = 0; $$6 < $$0.b(); ++$$6) {
            qr $$8;
            cfz $$7 = $$0.a($$6);
            if ($$7.b()) continue;
            if (b.a($$7)) {
                ++$$5;
                continue;
            }
            if (!c.a($$7) || ($$8 = $$7.b("Explosion")) == null) continue;
            $$4.add($$8);
        }
        $$3.a("Flight", (byte)$$5);
        if (!$$4.isEmpty()) {
            $$3.a("Explosions", $$4);
        }
        return $$2;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 * $$1 >= 2;
    }

    @Override
    public cfz a(hs $$0) {
        return new cfz(cgc.tA);
    }

    @Override
    public cje<?> aj_() {
        return cje.g;
    }
}

