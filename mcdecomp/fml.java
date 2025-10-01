/*
 * Decompiled with CFR 0.152.
 */
public class fml
implements flu<dba> {
    public fml(flv.a $$0) {
    }

    @Override
    public void a(dba $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        double $$33;
        double $$32;
        double $$31;
        double $$30;
        double $$17;
        double $$16;
        if (!enn.N().t.gk() && !enn.N().t.G_()) {
            return;
        }
        gu $$6 = $$0.i();
        hz $$7 = $$0.j();
        if ($$7.u() < 1 || $$7.v() < 1 || $$7.w() < 1) {
            return;
        }
        if ($$0.y() != ddl.a && $$0.y() != ddl.b) {
            return;
        }
        double $$8 = $$6.u();
        double $$9 = $$6.w();
        double $$10 = $$6.v();
        double $$11 = $$10 + (double)$$7.v();
        switch ($$0.v()) {
            case b: {
                double $$12 = $$7.u();
                double $$13 = -$$7.w();
                break;
            }
            case c: {
                double $$14 = -$$7.u();
                double $$15 = $$7.w();
                break;
            }
            default: {
                $$16 = $$7.u();
                $$17 = $$7.w();
            }
        }
        switch ($$0.w()) {
            case b: {
                double $$18 = $$17 < 0.0 ? $$8 : $$8 + 1.0;
                double $$19 = $$16 < 0.0 ? $$9 + 1.0 : $$9;
                double $$20 = $$18 - $$17;
                double $$21 = $$19 + $$16;
                break;
            }
            case c: {
                double $$22 = $$16 < 0.0 ? $$8 : $$8 + 1.0;
                double $$23 = $$17 < 0.0 ? $$9 : $$9 + 1.0;
                double $$24 = $$22 - $$16;
                double $$25 = $$23 - $$17;
                break;
            }
            case d: {
                double $$26 = $$17 < 0.0 ? $$8 + 1.0 : $$8;
                double $$27 = $$16 < 0.0 ? $$9 : $$9 + 1.0;
                double $$28 = $$26 + $$17;
                double $$29 = $$27 - $$16;
                break;
            }
            default: {
                $$30 = $$16 < 0.0 ? $$8 + 1.0 : $$8;
                $$31 = $$17 < 0.0 ? $$9 + 1.0 : $$9;
                $$32 = $$30 + $$16;
                $$33 = $$31 + $$17;
            }
        }
        float $$34 = 1.0f;
        float $$35 = 0.9f;
        float $$36 = 0.5f;
        ein $$37 = $$3.getBuffer(fkf.x());
        if ($$0.y() == ddl.a || $$0.I()) {
            fjv.a($$2, $$37, $$30, $$10, $$31, $$32, $$11, $$33, 0.9f, 0.9f, 0.9f, 1.0f, 0.5f, 0.5f, 0.5f);
        }
        if ($$0.y() == ddl.a && $$0.H()) {
            this.a($$0, $$37, $$6, $$2);
        }
    }

    private void a(dba $$0, ein $$1, gu $$2, eij $$3) {
        cmm $$4 = $$0.k();
        gu $$5 = $$0.p();
        gu $$6 = $$5.a($$2);
        for (gu $$7 : gu.a($$6, $$6.a($$0.j()).b(-1, -1, -1))) {
            boolean $$13;
            dcb $$8 = $$4.a_($$7);
            boolean $$9 = $$8.i();
            boolean $$10 = $$8.a(cpo.kN);
            boolean $$11 = $$8.a(cpo.hW);
            boolean $$12 = $$8.a(cpo.hX);
            boolean bl2 = $$13 = $$10 || $$11 || $$12;
            if (!$$9 && !$$13) continue;
            float $$14 = $$9 ? 0.05f : 0.0f;
            double $$15 = (float)($$7.u() - $$5.u()) + 0.45f - $$14;
            double $$16 = (float)($$7.v() - $$5.v()) + 0.45f - $$14;
            double $$17 = (float)($$7.w() - $$5.w()) + 0.45f - $$14;
            double $$18 = (float)($$7.u() - $$5.u()) + 0.55f + $$14;
            double $$19 = (float)($$7.v() - $$5.v()) + 0.55f + $$14;
            double $$20 = (float)($$7.w() - $$5.w()) + 0.55f + $$14;
            if ($$9) {
                fjv.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 0.5f, 0.5f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f);
                continue;
            }
            if ($$10) {
                fjv.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 1.0f, 0.75f, 0.75f, 1.0f, 1.0f, 0.75f, 0.75f);
                continue;
            }
            if ($$11) {
                fjv.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f);
                continue;
            }
            if (!$$12) continue;
            fjv.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        }
    }

    @Override
    public boolean a(dba $$0) {
        return true;
    }

    @Override
    public int aK_() {
        return 96;
    }
}

