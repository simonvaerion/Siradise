/*
 * Decompiled with CFR 0.152.
 */
public class zq
implements uo<zb> {
    private static final int b = Short.MAX_VALUE;
    public static final acq a = new acq("brand");
    private final acq c;
    private final sf d;

    public zq(acq $$0, sf $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public zq(sf $$0) {
        this.c = $$0.t();
        int $$1 = $$0.readableBytes();
        if ($$1 < 0 || $$1 > Short.MAX_VALUE) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
        this.d = new sf($$0.readBytes($$1));
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.c);
        $$0.writeBytes(this.d);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
        this.d.release();
    }

    public acq a() {
        return this.c;
    }

    public sf c() {
        return this.d;
    }
}

