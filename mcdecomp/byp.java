/*
 * Decompiled with CFR 0.152.
 */
public final class byp
extends Enum<byp> {
    public static final /* enum */ byp a = new byp(0, "cape");
    public static final /* enum */ byp b = new byp(1, "jacket");
    public static final /* enum */ byp c = new byp(2, "left_sleeve");
    public static final /* enum */ byp d = new byp(3, "right_sleeve");
    public static final /* enum */ byp e = new byp(4, "left_pants_leg");
    public static final /* enum */ byp f = new byp(5, "right_pants_leg");
    public static final /* enum */ byp g = new byp(6, "hat");
    private final int h;
    private final int i;
    private final String j;
    private final sw k;
    private static final /* synthetic */ byp[] l;

    public static byp[] values() {
        return (byp[])l.clone();
    }

    public static byp valueOf(String $$0) {
        return Enum.valueOf(byp.class, $$0);
    }

    private byp(int $$0, String $$1) {
        this.h = $$0;
        this.i = 1 << $$0;
        this.j = $$1;
        this.k = sw.c("options.modelPart." + $$1);
    }

    public int a() {
        return this.i;
    }

    public int b() {
        return this.h;
    }

    public String c() {
        return this.j;
    }

    public sw d() {
        return this.k;
    }

    private static /* synthetic */ byp[] e() {
        return new byp[]{a, b, c, d, e, f, g};
    }

    static {
        l = byp.e();
    }
}

