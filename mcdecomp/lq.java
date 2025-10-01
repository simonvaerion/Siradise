/*
 * Decompiled with CFR 0.152.
 */
public final class lq
extends Enum<lq> {
    public static final /* enum */ lq a = new lq("building_blocks");
    public static final /* enum */ lq b = new lq("decorations");
    public static final /* enum */ lq c = new lq("redstone");
    public static final /* enum */ lq d = new lq("transportation");
    public static final /* enum */ lq e = new lq("tools");
    public static final /* enum */ lq f = new lq("combat");
    public static final /* enum */ lq g = new lq("food");
    public static final /* enum */ lq h = new lq("brewing");
    public static final /* enum */ lq i = new lq("misc");
    private final String j;
    private static final /* synthetic */ lq[] k;

    public static lq[] values() {
        return (lq[])k.clone();
    }

    public static lq valueOf(String $$0) {
        return Enum.valueOf(lq.class, $$0);
    }

    private lq(String $$0) {
        this.j = $$0;
    }

    public String a() {
        return this.j;
    }

    private static /* synthetic */ lq[] b() {
        return new lq[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        k = lq.b();
    }
}

