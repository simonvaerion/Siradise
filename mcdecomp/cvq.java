/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class cvq
extends cxy {
    public static final dcs a = dcr.r;
    private static final Map<cls, List<a>> e = new WeakHashMap<cls, List<a>>();
    public static final int b = 60;
    public static final int c = 8;
    public static final int d = 160;
    private static final int f = 2;

    protected cvq(dca.d $$0) {
        super($$0, ip.b);
        this.k((dcb)((dcb)this.C.b()).a(a, true));
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        for (ha $$5 : ha.values()) {
            $$1.a($$2.a($$5), this);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$4) {
            return;
        }
        for (ha $$5 : ha.values()) {
            $$1.a($$2.a($$5), this);
        }
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if ($$0.c(a).booleanValue() && ha.b != $$3) {
            return 15;
        }
        return 0;
    }

    protected boolean a(cmm $$0, gu $$1, dcb $$2) {
        return $$0.b($$1.d(), ha.a);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        boolean $$4 = this.a((cmm)$$1, $$2, $$0);
        List<a> $$5 = e.get($$1);
        while ($$5 != null && !$$5.isEmpty() && $$1.V() - $$5.get((int)0).b > 60L) {
            $$5.remove(0);
        }
        if ($$0.c(a).booleanValue()) {
            if ($$4) {
                $$1.a($$2, (dcb)$$0.a(a, false), 3);
                if (cvq.a((cmm)$$1, $$2, true)) {
                    $$1.c(1502, $$2, 0);
                    $$1.a($$2, $$1.a_($$2).b(), 160);
                }
            }
        } else if (!$$4 && !cvq.a((cmm)$$1, $$2, false)) {
            $$1.a($$2, (dcb)$$0.a(a, true), 3);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        if ($$0.c(a).booleanValue() == this.a($$1, $$2, $$0) && !$$1.L().b($$2, this)) {
            $$1.a($$2, (cpn)this, 2);
        }
    }

    @Override
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if ($$3 == ha.a) {
            return $$0.b($$1, $$2, $$3);
        }
        return 0;
    }

    @Override
    public boolean f_(dcb $$0) {
        return true;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        if (!$$0.c(a).booleanValue()) {
            return;
        }
        double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
        double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
        double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
        $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }

    private static boolean a(cmm $$02, gu $$1, boolean $$2) {
        List $$3 = e.computeIfAbsent($$02, $$0 -> Lists.newArrayList());
        if ($$2) {
            $$3.add(new a($$1.i(), $$02.V()));
        }
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$3.size(); ++$$5) {
            a $$6 = (a)$$3.get($$5);
            if (!$$6.a.equals($$1) || ++$$4 < 8) continue;
            return true;
        }
        return false;
    }

    public static class a {
        final gu a;
        final long b;

        public a(gu $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

