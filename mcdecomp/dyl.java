/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Objects;
import javax.annotation.Nullable;

public class dyl {
    private final a a;
    private final byte b;
    private final byte c;
    private final byte d;
    @Nullable
    private final sw e;

    public dyl(a $$0, byte $$1, byte $$2, byte $$3, @Nullable sw $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public byte a() {
        return this.a.a();
    }

    public a b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public byte e() {
        return this.d;
    }

    public boolean f() {
        return this.a.b();
    }

    @Nullable
    public sw g() {
        return this.e;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof dyl)) {
            return false;
        }
        dyl $$1 = (dyl)$$0;
        return this.a == $$1.a && this.d == $$1.d && this.b == $$1.b && this.c == $$1.c && Objects.equals(this.e, $$1.e);
    }

    public int hashCode() {
        int $$0 = this.a.a();
        $$0 = 31 * $$0 + this.b;
        $$0 = 31 * $$0 + this.c;
        $$0 = 31 * $$0 + this.d;
        $$0 = 31 * $$0 + Objects.hashCode(this.e);
        return $$0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(false, true);
        public static final /* enum */ a b = new a(true, true);
        public static final /* enum */ a c = new a(false, true);
        public static final /* enum */ a d = new a(false, true);
        public static final /* enum */ a e = new a(true, false);
        public static final /* enum */ a f = new a(true, false);
        public static final /* enum */ a g = new a(false, true);
        public static final /* enum */ a h = new a(false, true);
        public static final /* enum */ a i = new a(true, 5393476, false);
        public static final /* enum */ a j = new a(true, 3830373, false);
        public static final /* enum */ a k = new a(true, true);
        public static final /* enum */ a l = new a(true, true);
        public static final /* enum */ a m = new a(true, true);
        public static final /* enum */ a n = new a(true, true);
        public static final /* enum */ a o = new a(true, true);
        public static final /* enum */ a p = new a(true, true);
        public static final /* enum */ a q = new a(true, true);
        public static final /* enum */ a r = new a(true, true);
        public static final /* enum */ a s = new a(true, true);
        public static final /* enum */ a t = new a(true, true);
        public static final /* enum */ a u = new a(true, true);
        public static final /* enum */ a v = new a(true, true);
        public static final /* enum */ a w = new a(true, true);
        public static final /* enum */ a x = new a(true, true);
        public static final /* enum */ a y = new a(true, true);
        public static final /* enum */ a z = new a(true, true);
        public static final /* enum */ a A = new a(true, false);
        private final byte B;
        private final boolean C;
        private final int D;
        private final boolean E;
        private static final /* synthetic */ a[] F;

        public static a[] values() {
            return (a[])F.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, boolean $$1) {
            this($$0, -1, $$1);
        }

        private a(boolean $$0, int $$1, boolean $$2) {
            this.E = $$2;
            this.B = (byte)this.ordinal();
            this.C = $$0;
            this.D = $$1;
        }

        public byte a() {
            return this.B;
        }

        public boolean b() {
            return this.C;
        }

        public boolean c() {
            return this.D >= 0;
        }

        public int d() {
            return this.D;
        }

        public static a a(byte $$0) {
            return dyl$a.values()[apa.a((int)$$0, 0, dyl$a.values().length - 1)];
        }

        public boolean e() {
            return this.E;
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A};
        }

        static {
            F = dyl$a.f();
        }
    }
}

