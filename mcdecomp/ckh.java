/*
 * Decompiled with CFR 0.152.
 */
/*
 * Uses 'sealed' constructs - enablewith --sealed true
 */
public abstract class ckh
extends Enum<ckh> {
    public static final /* enum */ ckh a = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof cdj;
        }
    };
    public static final /* enum */ ckh b = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            cdj $$1;
            return $$0 instanceof cdj && ($$1 = (cdj)$$0).g() == bfo.c;
        }
    };
    public static final /* enum */ ckh c = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            cdj $$1;
            return $$0 instanceof cdj && ($$1 = (cdj)$$0).g() == bfo.d;
        }
    };
    public static final /* enum */ ckh d = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            cdj $$1;
            return $$0 instanceof cdj && ($$1 = (cdj)$$0).g() == bfo.e;
        }
    };
    public static final /* enum */ ckh e = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            cdj $$1;
            return $$0 instanceof cdj && ($$1 = (cdj)$$0).g() == bfo.f;
        }
    };
    public static final /* enum */ ckh f = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof chk;
        }
    };
    public static final /* enum */ ckh g = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof cej;
        }
    };
    public static final /* enum */ ckh h = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof cff;
        }
    };
    public static final /* enum */ ckh i = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof chr;
        }
    };
    public static final /* enum */ ckh j = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0.o();
        }
    };
    public static final /* enum */ ckh k = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof cdx;
        }
    };
    public static final /* enum */ ckh l = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof cfa || cpn.a($$0) instanceof cfa;
        }
    };
    public static final /* enum */ ckh m = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof ceh;
        }
    };
    public static final /* enum */ ckh n = new ckh(){

        @Override
        public boolean a(cfu $$0) {
            return $$0 instanceof cht || cpn.a($$0) instanceof cht || j.a($$0);
        }
    };
    private static final /* synthetic */ ckh[] o;

    public static ckh[] values() {
        return (ckh[])o.clone();
    }

    public static ckh valueOf(String $$0) {
        return Enum.valueOf(ckh.class, $$0);
    }

    public abstract boolean a(cfu var1);

    private static /* synthetic */ ckh[] a() {
        return new ckh[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
    }

    static {
        o = ckh.a();
    }
}

