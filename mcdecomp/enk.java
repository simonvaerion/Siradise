/*
 * Decompiled with CFR 0.152.
 */
public final class enk
extends Enum<enk> {
    public static final /* enum */ enk a = new enk();
    public static final /* enum */ enk b = new enk();
    public static final /* enum */ enk c = new enk();
    public static final /* enum */ enk d = new enk();
    private static final /* synthetic */ enk[] e;

    public static enk[] values() {
        return (enk[])e.clone();
    }

    public static enk valueOf(String $$0) {
        return Enum.valueOf(enk.class, $$0);
    }

    public boolean a() {
        return this == b;
    }

    public boolean b() {
        return this == c || this == d;
    }

    private static /* synthetic */ enk[] c() {
        return new enk[]{a, b, c, d};
    }

    static {
        e = enk.c();
    }
}

