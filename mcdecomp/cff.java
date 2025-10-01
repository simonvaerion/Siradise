/*
 * Decompiled with CFR 0.152.
 */
public class cff
extends cfu
implements cht {
    public cff(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$12, bdw $$2) {
        cfz $$3 = $$12.b($$2);
        if ($$12.cj != null) {
            if (!$$0.B) {
                int $$4 = $$12.cj.a($$3);
                $$3.a($$4, $$12, (T $$1) -> $$1.d($$2));
            }
            $$0.a(null, $$12.dn(), $$12.dp(), $$12.dt(), amh.hP, ami.g, 1.0f, 0.4f / ($$0.y_().i() * 0.4f + 0.8f));
            $$12.a(dgl.D);
        } else {
            $$0.a(null, $$12.dn(), $$12.dp(), $$12.dt(), amh.hR, ami.g, 0.5f, 0.4f / ($$0.y_().i() * 0.4f + 0.8f));
            if (!$$0.B) {
                int $$5 = cki.c($$3);
                int $$6 = cki.b($$3);
                $$0.b(new bzc($$12, $$0, $$6, $$5));
            }
            $$12.b(amr.c.b(this));
            $$12.a(dgl.E);
        }
        return bdy.a($$3, $$0.r_());
    }

    @Override
    public int c() {
        return 1;
    }
}

