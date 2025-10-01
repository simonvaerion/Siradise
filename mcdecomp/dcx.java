/*
 * Decompiled with CFR 0.152.
 */
public final class dcx
extends Enum<dcx>
implements apr {
    public static final /* enum */ dcx a = new dcx();
    public static final /* enum */ dcx b = new dcx();
    private static final /* synthetic */ dcx[] c;

    public static dcx[] values() {
        return (dcx[])c.clone();
    }

    public static dcx valueOf(String $$0) {
        return Enum.valueOf(dcx.class, $$0);
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this == a ? "upper" : "lower";
    }

    private static /* synthetic */ dcx[] a() {
        return new dcx[]{a, b};
    }

    static {
        c = dcx.a();
    }
}

