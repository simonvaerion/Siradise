/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cea
extends cfu
implements cel {
    private final dxd a;

    public cea(dxd $$0, cfu.a $$1) {
        super($$1);
        this.a = $$0;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$12, bdw $$2) {
        cfz $$3 = $$12.b($$2);
        eee $$4 = cea.a($$0, $$12, this.a == dxf.a ? clv.b.b : clv.b.a);
        if ($$4.c() == eeg.a.a) {
            return bdy.c($$3);
        }
        if ($$4.c() == eeg.a.b) {
            gu $$13;
            gu $$5 = $$4.a();
            ha $$6 = $$4.b();
            gu $$7 = $$5.a($$6);
            if (!$$0.a($$12, $$5) || !$$12.a($$7, $$6, $$3)) {
                return bdy.d($$3);
            }
            if (this.a == dxf.a) {
                cpt $$9;
                cfz $$10;
                dcb $$8 = $$0.a_($$5);
                if ($$8.b() instanceof cpt && !($$10 = ($$9 = (cpt)((Object)$$8.b())).c($$0, $$5, $$8)).b()) {
                    $$12.b(amr.c.b(this));
                    $$9.am_().ifPresent($$1 -> $$12.a((amg)$$1, 1.0f, 1.0f));
                    $$0.a((bfj)$$12, dgl.z, $$5);
                    cfz $$11 = cgb.a($$3, $$12, $$10);
                    if (!$$0.B) {
                        ai.j.a((aig)$$12, $$10);
                    }
                    return bdy.a($$11, $$0.r_());
                }
                return bdy.d($$3);
            }
            dcb $$122 = $$0.a_($$5);
            gu gu2 = $$13 = $$122.b() instanceof cub && this.a == dxf.c ? $$5 : $$7;
            if (this.a($$12, $$0, $$13, $$4)) {
                this.a($$12, $$0, $$3, $$13);
                if ($$12 instanceof aig) {
                    ai.y.a((aig)$$12, $$13, $$3);
                }
                $$12.b(amr.c.b(this));
                return bdy.a(cea.a($$3, $$12), $$0.r_());
            }
            return bdy.d($$3);
        }
        return bdy.c($$3);
    }

    public static cfz a(cfz $$0, byo $$1) {
        if (!$$1.fO().d) {
            return new cfz(cgc.pK);
        }
        return $$0;
    }

    @Override
    public void a(@Nullable byo $$0, cmm $$1, cfz $$2, gu $$3) {
    }

    @Override
    public boolean a(@Nullable byo $$0, cmm $$1, gu $$2, @Nullable eee $$3) {
        boolean $$7;
        if (!(this.a instanceof dxc)) {
            return false;
        }
        dcb $$4 = $$1.a_($$2);
        cpn $$5 = $$4.b();
        boolean $$6 = $$4.a(this.a);
        boolean bl2 = $$7 = $$4.i() || $$6 || $$5 instanceof cub && ((cub)((Object)$$5)).a((cls)$$1, $$2, $$4, this.a);
        if (!$$7) {
            return $$3 != null && this.a($$0, $$1, $$3.a().a($$3.b()), null);
        }
        if ($$1.x_().i() && this.a.a(anb.a)) {
            int $$8 = $$2.u();
            int $$9 = $$2.v();
            int $$10 = $$2.w();
            $$1.a($$0, $$2, amh.hN, ami.e, 0.5f, 2.6f + ($$1.z.i() - $$1.z.i()) * 0.8f);
            for (int $$11 = 0; $$11 < 8; ++$$11) {
                $$1.a(iv.S, (double)$$8 + Math.random(), (double)$$9 + Math.random(), (double)$$10 + Math.random(), 0.0, 0.0, 0.0);
            }
            return true;
        }
        if ($$5 instanceof cub && this.a == dxf.c) {
            ((cub)((Object)$$5)).a($$1, $$2, $$4, ((dxc)this.a).a(false));
            this.a($$0, (cmn)$$1, $$2);
            return true;
        }
        if (!$$1.B && $$6 && !$$4.k()) {
            $$1.b($$2, true);
        }
        if ($$1.a($$2, this.a.g().g(), 11) || $$4.u().b()) {
            this.a($$0, (cmn)$$1, $$2);
            return true;
        }
        return false;
    }

    protected void a(@Nullable byo $$0, cmn $$1, gu $$2) {
        amg $$3 = this.a.a(anb.b) ? amh.cy : amh.cv;
        $$1.a($$0, $$2, $$3, ami.e, 1.0f, 1.0f);
        $$1.a((bfj)$$0, dgl.A, $$2);
    }
}

