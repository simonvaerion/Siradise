/*
 * Decompiled with CFR 0.152.
 */
public class zk
implements uo<zb> {
    private final a a;

    public zk(a $$0) {
        this.a = $$0;
    }

    public zk(sf $$0) {
        this.a = $$0.b(a.class);
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    public a a() {
        return this.a;
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
            c = zk$a.a();
        }
    }
}

