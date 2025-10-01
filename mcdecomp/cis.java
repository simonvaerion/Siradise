/*
 * Decompiled with CFR 0.152.
 */
public final class cis
extends Enum<cis>
implements apr {
    public static final /* enum */ cis a = new cis("building");
    public static final /* enum */ cis b = new cis("redstone");
    public static final /* enum */ cis c = new cis("equipment");
    public static final /* enum */ cis d = new cis("misc");
    public static final apr.a<cis> e;
    private final String f;
    private static final /* synthetic */ cis[] g;

    public static cis[] values() {
        return (cis[])g.clone();
    }

    public static cis valueOf(String $$0) {
        return Enum.valueOf(cis.class, $$0);
    }

    private cis(String $$0) {
        this.f = $$0;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ cis[] a() {
        return new cis[]{a, b, c, d};
    }

    static {
        g = cis.a();
        e = apr.a(cis::values);
    }
}

