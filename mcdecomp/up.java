/*
 * Decompiled with CFR 0.152.
 */
public final class up
extends Enum<up> {
    public static final /* enum */ up a = new up();
    public static final /* enum */ up b = new up();
    private static final /* synthetic */ up[] c;

    public static up[] values() {
        return (up[])c.clone();
    }

    public static up valueOf(String $$0) {
        return Enum.valueOf(up.class, $$0);
    }

    public up a() {
        return this == b ? a : b;
    }

    private static /* synthetic */ up[] b() {
        return new up[]{a, b};
    }

    static {
        c = up.b();
    }
}

