/*
 * Decompiled with CFR 0.152.
 */
public final class efx
extends Enum<efx> {
    public static final /* enum */ efx a = new efx(-3);
    public static final /* enum */ efx b = new efx(-2);
    public static final /* enum */ efx c = new efx(-1);
    public static final /* enum */ efx d = new efx(0);
    public static final /* enum */ efx e = new efx(1);
    public static final /* enum */ efx f = new efx(2);
    public static final /* enum */ efx g = new efx(3);
    private final int h;
    private static final /* synthetic */ efx[] i;

    public static efx[] values() {
        return (efx[])i.clone();
    }

    public static efx valueOf(String $$0) {
        return Enum.valueOf(efx.class, $$0);
    }

    private efx(int $$0) {
        this.h = $$0;
    }

    public static efx a(int $$0) {
        for (efx $$1 : efx.values()) {
            if ($$1.h != $$0) continue;
            return $$1;
        }
        if ($$0 < efx.a.h) {
            return a;
        }
        return g;
    }

    public int a() {
        return this.h;
    }

    private static /* synthetic */ efx[] b() {
        return new efx[]{a, b, c, d, e, f, g};
    }

    static {
        i = efx.b();
    }
}

