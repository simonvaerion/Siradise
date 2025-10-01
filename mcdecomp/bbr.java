/*
 * Decompiled with CFR 0.152.
 */
public final class bbr
extends Enum<bbr> {
    public static final /* enum */ bbr a = new bbr("pathfinding");
    public static final /* enum */ bbr b = new bbr("event-loops");
    public static final /* enum */ bbr c = new bbr("mailboxes");
    public static final /* enum */ bbr d = new bbr("ticking");
    public static final /* enum */ bbr e = new bbr("jvm");
    public static final /* enum */ bbr f = new bbr("chunk rendering");
    public static final /* enum */ bbr g = new bbr("chunk rendering dispatching");
    public static final /* enum */ bbr h = new bbr("cpu");
    public static final /* enum */ bbr i = new bbr("gpu");
    private final String j;
    private static final /* synthetic */ bbr[] k;

    public static bbr[] values() {
        return (bbr[])k.clone();
    }

    public static bbr valueOf(String $$0) {
        return Enum.valueOf(bbr.class, $$0);
    }

    private bbr(String $$0) {
        this.j = $$0;
    }

    public String a() {
        return this.j;
    }

    private static /* synthetic */ bbr[] b() {
        return new bbr[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        k = bbr.b();
    }
}

