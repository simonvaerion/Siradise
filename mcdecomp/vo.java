/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class vo
extends Record
implements uo<ur> {
    private final a a;
    private final List<String> b;

    public vo(sf $$0) {
        this($$0.b(a.class), $$0.a(sf::s));
    }

    public vo(a $$0, List<String> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
        $$0.a(this.b, sf::a);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vo.class, "action;entries", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vo.class, "action;entries", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vo.class, "action;entries", "a", "b"}, this, $$0);
    }

    public a a() {
        return this.a;
    }

    public List<String> c() {
        return this.b;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = vo$a.a();
        }
    }
}

