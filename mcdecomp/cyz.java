/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cyz
extends cwp {
    @Nullable
    private static dcg e;
    @Nullable
    private static dcg f;

    protected cyz(dca.d $$0) {
        super(cwp.b.b, $$0);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        czn $$5 = $$0.c_($$1);
        if ($$5 instanceof dax) {
            cyz.a($$0, $$1, (dax)$$5);
        }
    }

    public static void a(cmm $$0, gu $$1, dax $$2) {
        boolean $$4;
        if ($$0.B) {
            return;
        }
        dcb $$3 = $$2.q();
        boolean bl2 = $$4 = $$3.a(cpo.gG) || $$3.a(cpo.gH);
        if (!$$4 || $$1.v() < $$0.C_() || $$0.ai() == bdu.a) {
            return;
        }
        dcg.b $$5 = cyz.u().a($$0, $$1);
        if ($$5 == null) {
            return;
        }
        buv $$6 = bfn.bk.a($$0);
        if ($$6 != null) {
            cqg.a($$0, $$5);
            gu $$7 = $$5.a(1, 2, 0).d();
            $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ha.a.a ? 0.0f : 90.0f, 0.0f);
            $$6.aV = $$5.b().o() == ha.a.a ? 0.0f : 90.0f;
            $$6.q();
            for (aig $$8 : $$0.a(aig.class, $$6.cE().g(50.0))) {
                ai.n.a($$8, $$6);
            }
            $$0.b($$6);
            cqg.b($$0, $$5);
        }
    }

    public static boolean b(cmm $$0, gu $$1, cfz $$2) {
        if ($$2.a(cgc.ts) && $$1.v() >= $$0.C_() + 2 && $$0.ai() != bdu.a && !$$0.B) {
            return cyz.v().a($$0, $$1) != null;
        }
        return false;
    }

    private static dcg u() {
        if (e == null) {
            e = dch.a().a("^^^", "###", "~#~").a('#', (dcf $$0) -> $$0.a().a(amw.aD)).a('^', dcf.a(dck.a(cpo.gG).or(dck.a(cpo.gH)))).a('~', (dcf $$0) -> $$0.a().i()).b();
        }
        return e;
    }

    private static dcg v() {
        if (f == null) {
            f = dch.a().a("   ", "###", "~#~").a('#', (dcf $$0) -> $$0.a().a(amw.aD)).a('~', (dcf $$0) -> $$0.a().i()).b();
        }
        return f;
    }
}

