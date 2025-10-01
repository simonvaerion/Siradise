/*
 * Decompiled with CFR 0.152.
 */
public abstract class bvk
extends bzw {
    protected bvk(bfn<? extends bvk> $$0, cmm $$1) {
        super((bfn<? extends bzw>)$$0, $$1);
    }

    @Override
    protected void x() {
        super.x();
    }

    @Override
    public bge eN() {
        return bge.d;
    }

    public a q() {
        return a.a;
    }

    @Override
    public boolean c(bfz $$0) {
        if ($$0 instanceof bxw && $$0.h_()) {
            return false;
        }
        return super.c($$0);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            i = bvk$a.a();
        }
    }

    protected class b
    extends bnn {
        public b(bzw $$1) {
            super($$1, false);
        }

        @Override
        public boolean a() {
            return super.a() && bvk.this.gn();
        }
    }
}

