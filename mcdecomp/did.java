/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;

@Deprecated
public class did
implements dgz {
    private static final int d = 48;
    private static final long e = 0xFFFFFFFFFFFFL;
    private static final long f = 25214903917L;
    private static final long g = 11L;
    private final AtomicLong h = new AtomicLong();
    private final dhm i = new dhm(this);

    public did(long $$0) {
        this.b($$0);
    }

    @Override
    public apf d() {
        return new did(this.g());
    }

    @Override
    public dhx e() {
        return new dhl.a(this.g());
    }

    @Override
    public void b(long $$0) {
        this.h.set(($$0 ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL);
    }

    @Override
    public int c(int $$0) {
        long $$2;
        long $$1;
        while (!this.h.compareAndSet($$1 = this.h.get(), $$2 = $$1 * 25214903917L + 11L & 0xFFFFFFFFFFFFL)) {
        }
        return (int)($$2 >>> 48 - $$0);
    }

    @Override
    public double k() {
        return this.i.b();
    }
}

