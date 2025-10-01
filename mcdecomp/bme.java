/*
 * Decompiled with CFR 0.152.
 */
final class bme
extends Enum<bme> {
    public static final /* enum */ bme a = new bme();
    public static final /* enum */ bme b = new bme();
    private static final /* synthetic */ bme[] c;

    public static bme[] values() {
        return (bme[])c.clone();
    }

    public static bme valueOf(String $$0) {
        return Enum.valueOf(bme.class, $$0);
    }

    private static /* synthetic */ bme[] a() {
        return new bme[]{a, b};
    }

    static {
        c = bme.a();
    }
}

