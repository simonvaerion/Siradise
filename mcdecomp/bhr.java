/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public abstract class bhr<E extends bfz>
implements bhs<E> {
    public static final int a = 60;
    protected final Map<bpb<?>, bpc> b;
    private a c = bhr$a.a;
    private long d;
    private final int e;
    private final int f;

    public bhr(Map<bpb<?>, bpc> $$0) {
        this($$0, 60);
    }

    public bhr(Map<bpb<?>, bpc> $$0, int $$1) {
        this($$0, $$1, $$1);
    }

    public bhr(Map<bpb<?>, bpc> $$0, int $$1, int $$2) {
        this.e = $$1;
        this.f = $$2;
        this.b = $$0;
    }

    @Override
    public a a() {
        return this.c;
    }

    @Override
    public final boolean e(aif $$0, E $$1, long $$2) {
        if (this.a($$1) && this.a($$0, $$1)) {
            this.c = bhr$a.b;
            int $$3 = this.e + $$0.y_().a(this.f + 1 - this.e);
            this.d = $$2 + (long)$$3;
            this.d($$0, $$1, $$2);
            return true;
        }
        return false;
    }

    protected void d(aif $$0, E $$1, long $$2) {
    }

    @Override
    public final void f(aif $$0, E $$1, long $$2) {
        if (!this.a($$2) && this.a($$0, $$1, $$2)) {
            this.c($$0, $$1, $$2);
        } else {
            this.g($$0, $$1, $$2);
        }
    }

    protected void c(aif $$0, E $$1, long $$2) {
    }

    @Override
    public final void g(aif $$0, E $$1, long $$2) {
        this.c = bhr$a.a;
        this.b($$0, $$1, $$2);
    }

    protected void b(aif $$0, E $$1, long $$2) {
    }

    protected boolean a(aif $$0, E $$1, long $$2) {
        return false;
    }

    protected boolean a(long $$0) {
        return $$0 > this.d;
    }

    protected boolean a(aif $$0, E $$1) {
        return true;
    }

    @Override
    public String b() {
        return this.getClass().getSimpleName();
    }

    protected boolean a(E $$0) {
        for (Map.Entry<bpb<?>, bpc> $$1 : this.b.entrySet()) {
            bpb<?> $$2 = $$1.getKey();
            bpc $$3 = $$1.getValue();
            if (((bfz)$$0).dK().a($$2, $$3)) continue;
            return false;
        }
        return true;
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
            c = bhr$a.a();
        }
    }
}

