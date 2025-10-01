/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.atomic.AtomicLong;

public class dhl
implements dgz {
    private static final int d = 48;
    private static final long e = 0xFFFFFFFFFFFFL;
    private static final long f = 25214903917L;
    private static final long g = 11L;
    private final AtomicLong h = new AtomicLong();
    private final dhm i = new dhm(this);

    public dhl(long $$0) {
        this.b($$0);
    }

    @Override
    public apf d() {
        return new dhl(this.g());
    }

    @Override
    public dhx e() {
        return new a(this.g());
    }

    @Override
    public void b(long $$0) {
        if (!this.h.compareAndSet(this.h.get(), ($$0 ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL)) {
            throw apu.a("LegacyRandomSource", null);
        }
        this.i.a();
    }

    @Override
    public int c(int $$0) {
        long $$2;
        long $$1 = this.h.get();
        if (!this.h.compareAndSet($$1, $$2 = $$1 * 25214903917L + 11L & 0xFFFFFFFFFFFFL)) {
            throw apu.a("LegacyRandomSource", null);
        }
        return (int)($$2 >> 48 - $$0);
    }

    @Override
    public double k() {
        return this.i.b();
    }

    public static class a
    implements dhx {
        private final long a;

        public a(long $$0) {
            this.a = $$0;
        }

        @Override
        public apf a(int $$0, int $$1, int $$2) {
            long $$3 = apa.b($$0, $$1, $$2);
            long $$4 = $$3 ^ this.a;
            return new dhl($$4);
        }

        @Override
        public apf a(String $$0) {
            int $$1 = $$0.hashCode();
            return new dhl((long)$$1 ^ this.a);
        }

        @Override
        @VisibleForTesting
        public void a(StringBuilder $$0) {
            $$0.append("LegacyPositionalRandomFactory{").append(this.a).append("}");
        }
    }
}

