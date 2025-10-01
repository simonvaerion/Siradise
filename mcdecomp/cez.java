/*
 * Decompiled with CFR 0.152.
 */
public class cez
extends cfu {
    public cez(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.hm, ami.g, 0.5f, 0.4f / ($$0.y_().i() * 0.4f + 0.8f));
        $$1.gi().a((cfu)this, 20);
        if (!$$0.B) {
            bzp $$4 = new bzp($$0, $$1);
            $$4.a($$3);
            $$4.a($$1, $$1.dA(), $$1.dy(), 0.0f, 1.5f, 1.0f);
            $$0.b($$4);
        }
        $$1.b(amr.c.b(this));
        if (!$$1.fO().d) {
            $$3.h(1);
        }
        return bdy.a($$3, $$0.r_());
    }
}

