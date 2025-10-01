/*
 * Decompiled with CFR 0.152.
 */
public final class ddl
extends Enum<ddl>
implements apr {
    public static final /* enum */ ddl a = new ddl("save");
    public static final /* enum */ ddl b = new ddl("load");
    public static final /* enum */ ddl c = new ddl("corner");
    public static final /* enum */ ddl d = new ddl("data");
    private final String e;
    private final sw f;
    private static final /* synthetic */ ddl[] g;

    public static ddl[] values() {
        return (ddl[])g.clone();
    }

    public static ddl valueOf(String $$0) {
        return Enum.valueOf(ddl.class, $$0);
    }

    private ddl(String $$0) {
        this.e = $$0;
        this.f = sw.c("structure_block.mode_info." + $$0);
    }

    @Override
    public String c() {
        return this.e;
    }

    public sw a() {
        return this.f;
    }

    private static /* synthetic */ ddl[] b() {
        return new ddl[]{a, b, c, d};
    }

    static {
        g = ddl.b();
    }
}

