/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public abstract class bdn {
    private final UUID h;
    protected sw a;
    protected float b;
    protected a c;
    protected b d;
    protected boolean e;
    protected boolean f;
    protected boolean g;

    public bdn(UUID $$0, sw $$1, a $$2, b $$3) {
        this.h = $$0;
        this.a = $$1;
        this.c = $$2;
        this.d = $$3;
        this.b = 1.0f;
    }

    public UUID i() {
        return this.h;
    }

    public sw j() {
        return this.a;
    }

    public void a(sw $$0) {
        this.a = $$0;
    }

    public float k() {
        return this.b;
    }

    public void a(float $$0) {
        this.b = $$0;
    }

    public a l() {
        return this.c;
    }

    public void a(a $$0) {
        this.c = $$0;
    }

    public b m() {
        return this.d;
    }

    public void a(b $$0) {
        this.d = $$0;
    }

    public boolean n() {
        return this.e;
    }

    public bdn a(boolean $$0) {
        this.e = $$0;
        return this;
    }

    public boolean o() {
        return this.f;
    }

    public bdn b(boolean $$0) {
        this.f = $$0;
        return this;
    }

    public bdn c(boolean $$0) {
        this.g = $$0;
        return this;
    }

    public boolean p() {
        return this.g;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("pink", n.m);
        public static final /* enum */ a b = new a("blue", n.j);
        public static final /* enum */ a c = new a("red", n.e);
        public static final /* enum */ a d = new a("green", n.k);
        public static final /* enum */ a e = new a("yellow", n.o);
        public static final /* enum */ a f = new a("purple", n.b);
        public static final /* enum */ a g = new a("white", n.p);
        private final String h;
        private final n i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, n $$1) {
            this.h = $$0;
            this.i = $$1;
        }

        public n a() {
            return this.i;
        }

        public String b() {
            return this.h;
        }

        public static a a(String $$0) {
            for (a $$1 : bdn$a.values()) {
                if (!$$1.h.equals($$0)) continue;
                return $$1;
            }
            return g;
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d, e, f, g};
        }

        static {
            j = bdn$a.c();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("progress");
        public static final /* enum */ b b = new b("notched_6");
        public static final /* enum */ b c = new b("notched_10");
        public static final /* enum */ b d = new b("notched_12");
        public static final /* enum */ b e = new b("notched_20");
        private final String f;
        private static final /* synthetic */ b[] g;

        public static b[] values() {
            return (b[])g.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.f = $$0;
        }

        public String a() {
            return this.f;
        }

        public static b a(String $$0) {
            for (b $$1 : bdn$b.values()) {
                if (!$$1.f.equals($$0)) continue;
                return $$1;
            }
            return a;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e};
        }

        static {
            g = bdn$b.b();
        }
    }
}

