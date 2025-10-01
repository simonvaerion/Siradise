/*
 * Decompiled with CFR 0.152.
 */
public class cwp
extends coj {
    public static final int a = ddh.a();
    private static final int e = a + 1;
    public static final ddb b = dcr.ba;
    protected static final efb c = cpn.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
    protected static final efb d = cpn.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

    protected cwp(a $$0, dca.d $$1) {
        super($$0, $$1);
        this.k((dcb)((dcb)this.C.b()).a(b, 0));
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        if (this.a() == cwp$b.f) {
            return d;
        }
        return c;
    }

    @Override
    public efb f(dcb $$0, cls $$1, gu $$2) {
        return eey.a();
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(b, ddh.a($$0.i()));
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(b, $$1.a($$0.c(b), e));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return (dcb)$$0.a(b, $$1.a($$0.c(b), e));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{b});
    }

    public static interface a {
    }

    public static final class b
    extends Enum<b>
    implements a {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        public static final /* enum */ b d = new b();
        public static final /* enum */ b e = new b();
        public static final /* enum */ b f = new b();
        public static final /* enum */ b g = new b();
        private static final /* synthetic */ b[] h;

        public static b[] values() {
            return (b[])h.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e, f, g};
        }

        static {
            h = cwp$b.a();
        }
    }
}

