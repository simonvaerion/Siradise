/*
 * Decompiled with CFR 0.152.
 */
public final class dcp
extends Enum<dcp>
implements apr {
    public static final /* enum */ dcp a = new dcp("floor");
    public static final /* enum */ dcp b = new dcp("ceiling");
    public static final /* enum */ dcp c = new dcp("single_wall");
    public static final /* enum */ dcp d = new dcp("double_wall");
    private final String e;
    private static final /* synthetic */ dcp[] f;

    public static dcp[] values() {
        return (dcp[])f.clone();
    }

    public static dcp valueOf(String $$0) {
        return Enum.valueOf(dcp.class, $$0);
    }

    private dcp(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ dcp[] a() {
        return new dcp[]{a, b, c, d};
    }

    static {
        f = dcp.a();
    }
}

