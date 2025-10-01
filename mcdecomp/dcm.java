/*
 * Decompiled with CFR 0.152.
 */
public final class dcm
extends Enum<dcm>
implements apr {
    public static final /* enum */ dcm a = new dcm("floor");
    public static final /* enum */ dcm b = new dcm("wall");
    public static final /* enum */ dcm c = new dcm("ceiling");
    private final String d;
    private static final /* synthetic */ dcm[] e;

    public static dcm[] values() {
        return (dcm[])e.clone();
    }

    public static dcm valueOf(String $$0) {
        return Enum.valueOf(dcm.class, $$0);
    }

    private dcm(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ dcm[] a() {
        return new dcm[]{a, b, c};
    }

    static {
        e = dcm.a();
    }
}

