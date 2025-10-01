/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public class cva
extends crr
implements cpp {
    public static final ddb b = dcr.at;
    public static final int c = 4;
    private static final int d = 3;
    private static final int e = 1;
    private static final efb f = cpn.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
    private static final efb g = cpn.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
    private static final efb h = cpn.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
    private static final efb i = cpn.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
    private static final efb[] j = new efb[]{cpn.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), f};
    private static final efb[] k = new efb[]{h, cpn.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), g, g, g};

    public cva(dca.d $$0) {
        super($$0);
    }

    private boolean h(dcb $$0) {
        return $$0.c(b) >= 4;
    }

    @Override
    public boolean e_(dcb $$0) {
        return $$0.c(a) == dcx.b && !this.h($$0);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        return this.n();
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (!$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return $$0;
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        if ($$0.c(b) == 0) {
            return h;
        }
        if ($$0.c(a) == dcx.b) {
            return i;
        }
        return super.c($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        if (cva.n($$0)) {
            return this.d($$1.a_($$2.d()), $$1, $$2.d()) && cva.b($$1, $$2) && ($$0.c(b) < 3 || cva.o($$1.a_($$2.c())));
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected boolean d(dcb $$0, cls $$1, gu $$2) {
        return $$0.a(cpo.cC);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{b});
        super.a($$0);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return $$0.c(a) == dcx.a ? j[Math.min(Math.abs(4 - ($$0.c(b) + 1)), j.length - 1)] : k[$$0.c(b)];
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
        if ($$3 instanceof bwh && $$1.X().b(cmi.c)) {
            $$1.a($$2, true, $$3);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        return false;
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        boolean $$5;
        float $$4 = cre.a(this, $$1, $$2);
        boolean bl2 = $$5 = $$3.a((int)(25.0f / $$4) + 1) == 0;
        if ($$5) {
            this.a($$1, $$0, $$2, 1);
        }
    }

    private void a(aif $$0, dcb $$1, gu $$2, int $$3) {
        int $$4 = Math.min($$1.c(b) + $$3, 4);
        if (!this.a((cmp)$$0, $$2, $$1, $$4)) {
            return;
        }
        $$0.a($$2, (dcb)$$1.a(b, $$4), 2);
        if ($$4 >= 3) {
            gu $$5 = $$2.c();
            $$0.a($$5, cva.a((cmp)$$0, $$2, (dcb)((dcb)this.n().a(b, $$4)).a(a, dcx.a)), 3);
        }
    }

    private static boolean a(cmp $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1);
        return $$2.i() || $$2.a(cpo.kB);
    }

    private static boolean b(cmp $$0, gu $$1) {
        return $$0.b($$1, 0) >= 8 || $$0.g($$1);
    }

    private static boolean n(dcb $$0) {
        return $$0.a(cpo.kB) && $$0.c(a) == dcx.b;
    }

    private static boolean o(dcb $$0) {
        return $$0.a(cpo.kB) && $$0.c(a) == dcx.a;
    }

    private boolean a(cmp $$0, gu $$1, dcb $$2, int $$3) {
        return !this.h($$2) && cva.b($$0, $$1) && ($$3 < 3 || cva.a($$0, $$1.c()));
    }

    @Nullable
    private a b(cmp $$0, gu $$1, dcb $$2) {
        if (cva.n($$2)) {
            return new a($$1, $$2);
        }
        gu $$3 = $$1.d();
        dcb $$4 = $$0.a_($$3);
        if (cva.n($$4)) {
            return new a($$3, $$4);
        }
        return null;
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        a $$4 = this.b($$0, $$1, $$2);
        if ($$4 == null) {
            return false;
        }
        return this.a($$0, $$4.a, $$4.b, $$4.b.c(b) + 1);
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        a $$4 = this.b($$0, $$2, $$3);
        if ($$4 == null) {
            return;
        }
        this.a($$0, $$4.b, $$4.a, 1);
    }

    static final class a
    extends Record {
        final gu a;
        final dcb b;

        a(gu $$0, dcb $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos;state", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos;state", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos;state", "a", "b"}, this, $$0);
        }

        public gu a() {
            return this.a;
        }

        public dcb b() {
            return this.b;
        }
    }
}

