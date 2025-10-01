/*
 * Decompiled with CFR 0.152.
 */
public final class bez
extends Enum<bez> {
    public static final /* enum */ bez a = new bez(n.j);
    public static final /* enum */ bez b = new bez(n.m);
    public static final /* enum */ bez c = new bez(n.j);
    private final n d;
    private static final /* synthetic */ bez[] e;

    public static bez[] values() {
        return (bez[])e.clone();
    }

    public static bez valueOf(String $$0) {
        return Enum.valueOf(bez.class, $$0);
    }

    private bez(n $$0) {
        this.d = $$0;
    }

    public n a() {
        return this.d;
    }

    private static /* synthetic */ bez[] b() {
        return new bez[]{a, b, c};
    }

    static {
        e = bez.b();
    }
}

