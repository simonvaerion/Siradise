/*
 * Decompiled with CFR 0.152.
 */
public final class fjo
extends Enum<fjo> {
    public static final /* enum */ fjo a = new fjo(new b(fjo$a.f, fjo$a.e, fjo$a.a), new b(fjo$a.f, fjo$a.e, fjo$a.d), new b(fjo$a.c, fjo$a.e, fjo$a.d), new b(fjo$a.c, fjo$a.e, fjo$a.a));
    public static final /* enum */ fjo b = new fjo(new b(fjo$a.f, fjo$a.b, fjo$a.d), new b(fjo$a.f, fjo$a.b, fjo$a.a), new b(fjo$a.c, fjo$a.b, fjo$a.a), new b(fjo$a.c, fjo$a.b, fjo$a.d));
    public static final /* enum */ fjo c = new fjo(new b(fjo$a.c, fjo$a.b, fjo$a.d), new b(fjo$a.c, fjo$a.e, fjo$a.d), new b(fjo$a.f, fjo$a.e, fjo$a.d), new b(fjo$a.f, fjo$a.b, fjo$a.d));
    public static final /* enum */ fjo d = new fjo(new b(fjo$a.f, fjo$a.b, fjo$a.a), new b(fjo$a.f, fjo$a.e, fjo$a.a), new b(fjo$a.c, fjo$a.e, fjo$a.a), new b(fjo$a.c, fjo$a.b, fjo$a.a));
    public static final /* enum */ fjo e = new fjo(new b(fjo$a.f, fjo$a.b, fjo$a.d), new b(fjo$a.f, fjo$a.e, fjo$a.d), new b(fjo$a.f, fjo$a.e, fjo$a.a), new b(fjo$a.f, fjo$a.b, fjo$a.a));
    public static final /* enum */ fjo f = new fjo(new b(fjo$a.c, fjo$a.b, fjo$a.a), new b(fjo$a.c, fjo$a.e, fjo$a.a), new b(fjo$a.c, fjo$a.e, fjo$a.d), new b(fjo$a.c, fjo$a.b, fjo$a.d));
    private static final fjo[] g;
    private final b[] h;
    private static final /* synthetic */ fjo[] i;

    public static fjo[] values() {
        return (fjo[])i.clone();
    }

    public static fjo valueOf(String $$0) {
        return Enum.valueOf(fjo.class, $$0);
    }

    public static fjo a(ha $$0) {
        return g[$$0.d()];
    }

    private fjo(b ... $$0) {
        this.h = $$0;
    }

    public b a(int $$0) {
        return this.h[$$0];
    }

    private static /* synthetic */ fjo[] a() {
        return new fjo[]{a, b, c, d, e, f};
    }

    static {
        i = fjo.a();
        g = ac.a(new fjo[6], $$0 -> {
            $$0[fjo$a.e] = a;
            $$0[fjo$a.b] = b;
            $$0[fjo$a.d] = c;
            $$0[fjo$a.a] = d;
            $$0[fjo$a.f] = e;
            $$0[fjo$a.c] = f;
        });
    }

    public static class b {
        public final int a;
        public final int b;
        public final int c;

        b(int $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }

    public static final class a {
        public static final int a = ha.d.d();
        public static final int b = ha.b.d();
        public static final int c = ha.f.d();
        public static final int d = ha.c.d();
        public static final int e = ha.a.d();
        public static final int f = ha.e.d();
    }
}

