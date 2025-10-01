/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

public class cyc
extends cpn {
    public static final dcs a = dcr.w;
    public static final dcs b = dcr.a;
    public static final dcs c = dcr.d;
    public static final dcs d = cuz.a;
    public static final dcs e = cuz.b;
    public static final dcs f = cuz.c;
    public static final dcs g = cuz.d;
    private static final Map<ha, dcs> j = crf.f;
    protected static final efb h = cpn.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
    protected static final efb i = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    private static final int k = 10;
    private final cyd l;

    public cyc(cyd $$0, dca.d $$1) {
        super($$1);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, false)).a(b, false)).a(c, false)).a(d, false)).a(e, false)).a(f, false)).a(g, false));
        this.l = $$0;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return $$0.c(b) != false ? h : i;
    }

    @Override
    public dcb a(cih $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        return (dcb)((dcb)((dcb)((dcb)this.n().a(d, this.a($$1.a_($$2.e()), ha.c))).a(e, this.a($$1.a_($$2.h()), ha.f))).a(f, this.a($$1.a_($$2.f()), ha.d))).a(g, this.a($$1.a_($$2.g()), ha.e));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1.o().d()) {
            return (dcb)$$0.a(j.get($$1), this.a($$2, $$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$1, $$2, $$0);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$4 || $$0.a($$3.b())) {
            return;
        }
        this.a($$1, $$2, (dcb)$$0.a(a, true));
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
        if (!$$0.B && !$$3.eO().b() && $$3.eO().a(cgc.rg)) {
            $$0.a($$1, (dcb)$$2.a(c, true), 4);
            $$0.a((bfj)$$3, dgl.N, $$1);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    private void a(cmm $$0, gu $$1, dcb $$2) {
        block0: for (ha $$3 : new ha[]{ha.d, ha.e}) {
            for (int $$4 = 1; $$4 < 42; ++$$4) {
                gu $$5 = $$1.a($$3, $$4);
                dcb $$6 = $$0.a_($$5);
                if ($$6.a(this.l)) {
                    if ($$6.c(cyd.a) != $$3.g()) continue block0;
                    this.l.a($$0, $$5, $$6, false, true, $$4, $$2);
                    continue block0;
                }
                if (!$$6.a(this)) continue block0;
            }
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
        if ($$1.B) {
            return;
        }
        if ($$0.c(a).booleanValue()) {
            return;
        }
        this.a($$1, $$2);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (!$$1.a_($$2).c(a).booleanValue()) {
            return;
        }
        this.a($$1, $$2);
    }

    private void a(cmm $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1);
        boolean $$3 = $$2.c(a);
        boolean $$4 = false;
        List<bfj> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
        if (!$$5.isEmpty()) {
            for (bfj $$6 : $$5) {
                if ($$6.c_()) continue;
                $$4 = true;
                break;
            }
        }
        if ($$4 != $$3) {
            $$2 = (dcb)$$2.a(a, $$4);
            $$0.a($$1, $$2, 3);
            this.a($$0, $$1, $$2);
        }
        if ($$4) {
            $$0.a(new gu($$1), (cpn)this, 10);
        }
    }

    public boolean a(dcb $$0, ha $$1) {
        if ($$0.a(this.l)) {
            return $$0.c(cyd.a) == $$1.g();
        }
        return $$0.a(this);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        switch ($$1) {
            case c: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(d, $$0.c(f))).a(e, $$0.c(g))).a(f, $$0.c(d))).a(g, $$0.c(e));
            }
            case d: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(d, $$0.c(e))).a(e, $$0.c(f))).a(f, $$0.c(g))).a(g, $$0.c(d));
            }
            case b: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(d, $$0.c(g))).a(e, $$0.c(d))).a(f, $$0.c(e))).a(g, $$0.c(f));
            }
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        switch ($$1) {
            case b: {
                return (dcb)((dcb)$$0.a(d, $$0.c(f))).a(f, $$0.c(d));
            }
            case c: {
                return (dcb)((dcb)$$0.a(e, $$0.c(g))).a(g, $$0.c(e));
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c, d, e, g, f);
    }
}

