/*
 * Decompiled with CFR 0.152.
 */
public final class ddk
extends Enum<ddk>
implements apr {
    public static final /* enum */ ddk a = new ddk("straight");
    public static final /* enum */ ddk b = new ddk("inner_left");
    public static final /* enum */ ddk c = new ddk("inner_right");
    public static final /* enum */ ddk d = new ddk("outer_left");
    public static final /* enum */ ddk e = new ddk("outer_right");
    private final String f;
    private static final /* synthetic */ ddk[] g;

    public static ddk[] values() {
        return (ddk[])g.clone();
    }

    public static ddk valueOf(String $$0) {
        return Enum.valueOf(ddk.class, $$0);
    }

    private ddk(String $$0) {
        this.f = $$0;
    }

    public String toString() {
        return this.f;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ ddk[] a() {
        return new ddk[]{a, b, c, d, e};
    }

    static {
        g = ddk.a();
    }
}

