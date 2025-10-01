/*
 * Decompiled with CFR 0.152.
 */
public final class ddf
extends Enum<ddf>
implements apr {
    public static final /* enum */ ddf a = new ddf("north_south");
    public static final /* enum */ ddf b = new ddf("east_west");
    public static final /* enum */ ddf c = new ddf("ascending_east");
    public static final /* enum */ ddf d = new ddf("ascending_west");
    public static final /* enum */ ddf e = new ddf("ascending_north");
    public static final /* enum */ ddf f = new ddf("ascending_south");
    public static final /* enum */ ddf g = new ddf("south_east");
    public static final /* enum */ ddf h = new ddf("south_west");
    public static final /* enum */ ddf i = new ddf("north_west");
    public static final /* enum */ ddf j = new ddf("north_east");
    private final String k;
    private static final /* synthetic */ ddf[] l;

    public static ddf[] values() {
        return (ddf[])l.clone();
    }

    public static ddf valueOf(String $$0) {
        return Enum.valueOf(ddf.class, $$0);
    }

    private ddf(String $$0) {
        this.k = $$0;
    }

    public String a() {
        return this.k;
    }

    public String toString() {
        return this.k;
    }

    public boolean b() {
        return this == e || this == c || this == f || this == d;
    }

    @Override
    public String c() {
        return this.k;
    }

    private static /* synthetic */ ddf[] d() {
        return new ddf[]{a, b, c, d, e, f, g, h, i, j};
    }

    static {
        l = ddf.d();
    }
}

