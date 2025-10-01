/*
 * Decompiled with CFR 0.152.
 */
public final class ddg
extends Enum<ddg>
implements apr {
    public static final /* enum */ ddg a = new ddg("up");
    public static final /* enum */ ddg b = new ddg("side");
    public static final /* enum */ ddg c = new ddg("none");
    private final String d;
    private static final /* synthetic */ ddg[] e;

    public static ddg[] values() {
        return (ddg[])e.clone();
    }

    public static ddg valueOf(String $$0) {
        return Enum.valueOf(ddg.class, $$0);
    }

    private ddg(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this.d;
    }

    public boolean a() {
        return this != c;
    }

    private static /* synthetic */ ddg[] b() {
        return new ddg[]{a, b, c};
    }

    static {
        e = ddg.b();
    }
}

