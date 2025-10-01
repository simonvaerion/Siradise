/*
 * Decompiled with CFR 0.152.
 */
public class fsg
extends ftg<fiv, fck<fiv>> {
    public fsg(fqt<fiv, fck<fiv>> $$0) {
        super($$0);
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, fiv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        if (!$$3.a() || $$3.cb() || !$$3.a(byp.a) || $$3.e() == null) {
            return;
        }
        cfz $$10 = $$3.c(bfo.e);
        if ($$10.a(cgc.nh)) {
            return;
        }
        $$0.a();
        $$0.a(0.0f, 0.0f, 0.125f);
        double $$11 = apa.d((double)$$6, $$3.bX, $$3.ca) - apa.d((double)$$6, $$3.J, $$3.dn());
        double $$12 = apa.d((double)$$6, $$3.bY, $$3.cb) - apa.d((double)$$6, $$3.K, $$3.dp());
        double $$13 = apa.d((double)$$6, $$3.bZ, $$3.cc) - apa.d((double)$$6, $$3.L, $$3.dt());
        float $$14 = apa.j($$6, $$3.aW, $$3.aV);
        double $$15 = apa.a($$14 * ((float)Math.PI / 180));
        double $$16 = -apa.b($$14 * ((float)Math.PI / 180));
        float $$17 = (float)$$12 * 10.0f;
        $$17 = apa.a($$17, -6.0f, 32.0f);
        float $$18 = (float)($$11 * $$15 + $$13 * $$16) * 100.0f;
        $$18 = apa.a($$18, 0.0f, 150.0f);
        float $$19 = (float)($$11 * $$16 - $$13 * $$15) * 100.0f;
        $$19 = apa.a($$19, -20.0f, 20.0f);
        if ($$18 < 0.0f) {
            $$18 = 0.0f;
        }
        float $$20 = apa.i($$6, $$3.bU, $$3.bV);
        $$17 += apa.a(apa.i($$6, $$3.W, $$3.X) * 6.0f) * 32.0f * $$20;
        if ($$3.bU()) {
            $$17 += 25.0f;
        }
        $$0.a(a.b.rotationDegrees(6.0f + $$18 / 2.0f + $$17));
        $$0.a(a.f.rotationDegrees($$19 / 2.0f));
        $$0.a(a.d.rotationDegrees(180.0f - $$19 / 2.0f));
        ein $$21 = $$1.getBuffer(fkf.b($$3.e()));
        ((fck)this.c()).b($$0, $$21, $$2, fum.d);
        $$0.b();
    }
}

