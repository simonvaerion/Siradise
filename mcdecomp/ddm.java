/*
 * Decompiled with CFR 0.152.
 */
public final class ddm
extends Enum<ddm>
implements apr {
    public static final /* enum */ ddm a = new ddm("none", true);
    public static final /* enum */ ddm b = new ddm("unstable", false);
    public static final /* enum */ ddm c = new ddm("partial", true);
    public static final /* enum */ ddm d = new ddm("full", true);
    private final String e;
    private final boolean f;
    private static final /* synthetic */ ddm[] g;

    public static ddm[] values() {
        return (ddm[])g.clone();
    }

    public static ddm valueOf(String $$0) {
        return Enum.valueOf(ddm.class, $$0);
    }

    private ddm(String $$0, boolean $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public String c() {
        return this.e;
    }

    public boolean a() {
        return this.f;
    }

    private static /* synthetic */ ddm[] b() {
        return new ddm[]{a, b, c, d};
    }

    static {
        g = ddm.b();
    }
}

