/*
 * Decompiled with CFR 0.152.
 */
public final class ami
extends Enum<ami> {
    public static final /* enum */ ami a = new ami("master");
    public static final /* enum */ ami b = new ami("music");
    public static final /* enum */ ami c = new ami("record");
    public static final /* enum */ ami d = new ami("weather");
    public static final /* enum */ ami e = new ami("block");
    public static final /* enum */ ami f = new ami("hostile");
    public static final /* enum */ ami g = new ami("neutral");
    public static final /* enum */ ami h = new ami("player");
    public static final /* enum */ ami i = new ami("ambient");
    public static final /* enum */ ami j = new ami("voice");
    private final String k;
    private static final /* synthetic */ ami[] l;

    public static ami[] values() {
        return (ami[])l.clone();
    }

    public static ami valueOf(String $$0) {
        return Enum.valueOf(ami.class, $$0);
    }

    private ami(String $$0) {
        this.k = $$0;
    }

    public String a() {
        return this.k;
    }

    private static /* synthetic */ ami[] b() {
        return new ami[]{a, b, c, d, e, f, g, h, i, j};
    }

    static {
        l = ami.b();
    }
}

