/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class aal
implements uo<zb> {
    private final a a;
    @Nullable
    private final acq b;

    public aal(a $$0, @Nullable acq $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static aal a(ae $$0) {
        return new aal(aal$a.a, $$0.j());
    }

    public static aal a() {
        return new aal(aal$a.b, null);
    }

    public aal(sf $$0) {
        this.a = $$0.b(a.class);
        this.b = this.a == aal$a.a ? $$0.t() : null;
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
        if (this.a == aal$a.a) {
            $$0.a(this.b);
        }
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    public a c() {
        return this.a;
    }

    @Nullable
    public acq d() {
        return this.b;
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
            c = aal$a.a();
        }
    }
}

