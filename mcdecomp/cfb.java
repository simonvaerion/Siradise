/*
 * Decompiled with CFR 0.152.
 */
public class cfb
extends cfu {
    public cfb(cfu.a $$0) {
        super($$0);
    }

    @Override
    public boolean i(cfz $$0) {
        return true;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.hz, ami.g, 0.5f, 0.4f / ($$0.y_().i() * 0.4f + 0.8f));
        if (!$$0.B) {
            bzq $$4 = new bzq($$0, $$1);
            $$4.a($$3);
            $$4.a($$1, $$1.dA(), $$1.dy(), -20.0f, 0.7f, 1.0f);
            $$0.b($$4);
        }
        $$1.b(amr.c.b(this));
        if (!$$1.fO().d) {
            $$3.h(1);
        }
        return bdy.a($$3, $$0.r_());
    }
}

