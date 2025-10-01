/*
 * Decompiled with CFR 0.152.
 */
public class cvj
extends cpc {
    public static final dcs d = dcr.w;
    private final a e;

    protected cvj(a $$0, dca.d $$1, dcq $$2) {
        super($$1, $$2);
        this.k((dcb)((dcb)this.C.b()).a(d, false));
        this.e = $$0;
    }

    @Override
    protected int g(dcb $$0) {
        return $$0.c(d) != false ? 15 : 0;
    }

    @Override
    protected dcb a(dcb $$0, int $$1) {
        return (dcb)$$0.a(d, $$1 > 0);
    }

    @Override
    protected int b(cmm $$0, gu $$1) {
        Class<bfj> $$2 = switch (this.e) {
            default -> throw new IncompatibleClassChangeError();
            case cvj$a.a -> bfj.class;
            case cvj$a.b -> bfz.class;
        };
        return cvj.a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{d});
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = cvj$a.a();
        }
    }
}

