/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.Codec
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;

public class dil
implements apf {
    private static final float c = 5.9604645E-8f;
    private static final double d = (double)1.110223E-16f;
    public static final Codec<dil> b = dik.a.xmap($$0 -> new dil((dik)$$0), $$0 -> $$0.e);
    private dik e;
    private final dhm f = new dhm(this);

    public dil(long $$0) {
        this.e = new dik(dhz.c($$0));
    }

    public dil(dhz.a $$0) {
        this.e = new dik($$0);
    }

    public dil(long $$0, long $$1) {
        this.e = new dik($$0, $$1);
    }

    private dil(dik $$0) {
        this.e = $$0;
    }

    @Override
    public apf d() {
        return new dil(this.e.a(), this.e.a());
    }

    @Override
    public dhx e() {
        return new a(this.e.a(), this.e.a());
    }

    @Override
    public void b(long $$0) {
        this.e = new dik(dhz.c($$0));
        this.f.a();
    }

    @Override
    public int f() {
        return (int)this.e.a();
    }

    @Override
    public int a(int $$0) {
        if ($$0 <= 0) {
            throw new IllegalArgumentException("Bound must be positive");
        }
        long $$1 = Integer.toUnsignedLong(this.f());
        long $$2 = $$1 * (long)$$0;
        long $$3 = $$2 & 0xFFFFFFFFL;
        if ($$3 < (long)$$0) {
            int $$4 = Integer.remainderUnsigned(~$$0 + 1, $$0);
            while ($$3 < (long)$$4) {
                $$1 = Integer.toUnsignedLong(this.f());
                $$2 = $$1 * (long)$$0;
                $$3 = $$2 & 0xFFFFFFFFL;
            }
        }
        long $$5 = $$2 >> 32;
        return (int)$$5;
    }

    @Override
    public long g() {
        return this.e.a();
    }

    @Override
    public boolean h() {
        return (this.e.a() & 1L) != 0L;
    }

    @Override
    public float i() {
        return (float)this.c(24) * 5.9604645E-8f;
    }

    @Override
    public double j() {
        return (double)this.c(53) * (double)1.110223E-16f;
    }

    @Override
    public double k() {
        return this.f.b();
    }

    @Override
    public void b(int $$0) {
        for (int $$1 = 0; $$1 < $$0; ++$$1) {
            this.e.a();
        }
    }

    private long c(int $$0) {
        return this.e.a() >>> 64 - $$0;
    }

    public static class a
    implements dhx {
        private final long a;
        private final long b;

        public a(long $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public apf a(int $$0, int $$1, int $$2) {
            long $$3 = apa.b($$0, $$1, $$2);
            long $$4 = $$3 ^ this.a;
            return new dil($$4, this.b);
        }

        @Override
        public apf a(String $$0) {
            dhz.a $$1 = dhz.a($$0);
            return new dil($$1.a(this.a, this.b));
        }

        @Override
        @VisibleForTesting
        public void a(StringBuilder $$0) {
            $$0.append("seedLo: ").append(this.a).append(", seedHi: ").append(this.b);
        }
    }
}

