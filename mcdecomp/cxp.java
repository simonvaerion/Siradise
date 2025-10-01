/*
 * Decompiled with CFR 0.152.
 */
/*
 * Uses 'sealed' constructs - enablewith --sealed true
 */
public abstract class cxp
extends Enum<cxp> {
    public static final /* enum */ cxp a = new cxp(){

        @Override
        public boolean a(dcb $$0, cls $$1, gu $$2, ha $$3) {
            return cpn.a($$0.l($$1, $$2), $$3);
        }
    };
    public static final /* enum */ cxp b = new cxp(){
        private final int d = 1;
        private final efb e = cpn.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

        @Override
        public boolean a(dcb $$0, cls $$1, gu $$2, ha $$3) {
            return !eey.c($$0.l($$1, $$2).a($$3), this.e, eem.c);
        }
    };
    public static final /* enum */ cxp c = new cxp(){
        private final int d = 2;
        private final efb e = eey.a(eey.b(), cpn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), eem.e);

        @Override
        public boolean a(dcb $$0, cls $$1, gu $$2, ha $$3) {
            return !eey.c($$0.l($$1, $$2).a($$3), this.e, eem.c);
        }
    };
    private static final /* synthetic */ cxp[] d;

    public static cxp[] values() {
        return (cxp[])d.clone();
    }

    public static cxp valueOf(String $$0) {
        return Enum.valueOf(cxp.class, $$0);
    }

    public abstract boolean a(dcb var1, cls var2, gu var3, ha var4);

    private static /* synthetic */ cxp[] a() {
        return new cxp[]{a, b, c};
    }

    static {
        d = cxp.a();
    }
}

