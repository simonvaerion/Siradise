/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public class clv {
    private final eei a;
    private final eei b;
    private final a c;
    private final b d;
    private final een e;

    public clv(eei $$0, eei $$1, a $$2, b $$3, bfj $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = een.a($$4);
    }

    public eei a() {
        return this.b;
    }

    public eei b() {
        return this.a;
    }

    public efb a(dcb $$0, cls $$1, gu $$2) {
        return this.c.get($$0, $$1, $$2, this.e);
    }

    public efb a(dxe $$0, cls $$1, gu $$2) {
        return this.d.a($$0) ? $$0.d($$1, $$2) : eey.a();
    }

    public static final class a
    extends Enum<a>
    implements c {
        public static final /* enum */ a a = new a(dca.a::b);
        public static final /* enum */ a b = new a(dca.a::a);
        public static final /* enum */ a c = new a(dca.a::c);
        public static final /* enum */ a d = new a(($$0, $$1, $$2, $$3) -> {
            if ($$0.a(amw.aO)) {
                return eey.b();
            }
            return eey.a();
        });
        private final c e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(c $$0) {
            this.e = $$0;
        }

        @Override
        public efb get(dcb $$0, cls $$1, gu $$2, een $$3) {
            return this.e.get($$0, $$1, $$2, $$3);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            f = clv$a.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b($$0 -> false);
        public static final /* enum */ b b = new b(dxe::b);
        public static final /* enum */ b c = new b($$0 -> !$$0.c());
        public static final /* enum */ b d = new b($$0 -> $$0.a(anb.a));
        private final Predicate<dxe> e;
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(Predicate<dxe> $$0) {
            this.e = $$0;
        }

        public boolean a(dxe $$0) {
            return this.e.test($$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d};
        }

        static {
            f = clv$b.a();
        }
    }

    public static interface c {
        public efb get(dcb var1, cls var2, gu var3, een var4);
    }
}

