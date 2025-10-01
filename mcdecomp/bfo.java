/*
 * Decompiled with CFR 0.152.
 */
public final class bfo
extends Enum<bfo> {
    public static final /* enum */ bfo a = new bfo(bfo$a.a, 0, 0, "mainhand");
    public static final /* enum */ bfo b = new bfo(bfo$a.a, 1, 5, "offhand");
    public static final /* enum */ bfo c = new bfo(bfo$a.b, 0, 1, "feet");
    public static final /* enum */ bfo d = new bfo(bfo$a.b, 1, 2, "legs");
    public static final /* enum */ bfo e = new bfo(bfo$a.b, 2, 3, "chest");
    public static final /* enum */ bfo f = new bfo(bfo$a.b, 3, 4, "head");
    private final a g;
    private final int h;
    private final int i;
    private final String j;
    private static final /* synthetic */ bfo[] k;

    public static bfo[] values() {
        return (bfo[])k.clone();
    }

    public static bfo valueOf(String $$0) {
        return Enum.valueOf(bfo.class, $$0);
    }

    private bfo(a $$0, int $$1, int $$2, String $$3) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.j = $$3;
    }

    public a a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int a(int $$0) {
        return $$0 + this.h;
    }

    public int c() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public boolean e() {
        return this.g == bfo$a.b;
    }

    public static bfo a(String $$0) {
        for (bfo $$1 : bfo.values()) {
            if (!$$1.d().equals($$0)) continue;
            return $$1;
        }
        throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
    }

    public static bfo a(a $$0, int $$1) {
        for (bfo $$2 : bfo.values()) {
            if ($$2.a() != $$0 || $$2.b() != $$1) continue;
            return $$2;
        }
        throw new IllegalArgumentException("Invalid slot '" + $$0 + "': " + $$1);
    }

    private static /* synthetic */ bfo[] f() {
        return new bfo[]{a, b, c, d, e, f};
    }

    static {
        k = bfo.f();
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
            c = bfo$a.a();
        }
    }
}

