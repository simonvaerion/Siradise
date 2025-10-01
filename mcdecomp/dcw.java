/*
 * Decompiled with CFR 0.152.
 */
public final class dcw
extends Enum<dcw>
implements apr {
    public static final /* enum */ dcw a = new dcw();
    public static final /* enum */ dcw b = new dcw();
    private static final /* synthetic */ dcw[] c;

    public static dcw[] values() {
        return (dcw[])c.clone();
    }

    public static dcw valueOf(String $$0) {
        return Enum.valueOf(dcw.class, $$0);
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this == a ? "left" : "right";
    }

    private static /* synthetic */ dcw[] a() {
        return new dcw[]{a, b};
    }

    static {
        c = dcw.a();
    }
}

