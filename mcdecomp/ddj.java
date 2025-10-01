/*
 * Decompiled with CFR 0.152.
 */
public final class ddj
extends Enum<ddj>
implements apr {
    public static final /* enum */ ddj a = new ddj("top");
    public static final /* enum */ ddj b = new ddj("bottom");
    public static final /* enum */ ddj c = new ddj("double");
    private final String d;
    private static final /* synthetic */ ddj[] e;

    public static ddj[] values() {
        return (ddj[])e.clone();
    }

    public static ddj valueOf(String $$0) {
        return Enum.valueOf(ddj.class, $$0);
    }

    private ddj(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ ddj[] a() {
        return new ddj[]{a, b, c};
    }

    static {
        e = ddj.a();
    }
}

