/*
 * Decompiled with CFR 0.152.
 */
public class dia
implements dgz {
    private static final int d = 48;
    private static final long e = 0xFFFFFFFFFFFFL;
    private static final long f = 25214903917L;
    private static final long g = 11L;
    private long h;
    private final dhm i = new dhm(this);

    public dia(long $$0) {
        this.b($$0);
    }

    @Override
    public apf d() {
        return new dia(this.g());
    }

    @Override
    public dhx e() {
        return new dhl.a(this.g());
    }

    @Override
    public void b(long $$0) {
        this.h = ($$0 ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL;
        this.i.a();
    }

    @Override
    public int c(int $$0) {
        long $$1;
        this.h = $$1 = this.h * 25214903917L + 11L & 0xFFFFFFFFFFFFL;
        return (int)($$1 >> 48 - $$0);
    }

    @Override
    public double k() {
        return this.i.b();
    }
}

