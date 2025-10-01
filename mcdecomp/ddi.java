/*
 * Decompiled with CFR 0.152.
 */
public final class ddi
extends Enum<ddi>
implements apr {
    public static final /* enum */ ddi a = new ddi("inactive");
    public static final /* enum */ ddi b = new ddi("active");
    public static final /* enum */ ddi c = new ddi("cooldown");
    private final String d;
    private static final /* synthetic */ ddi[] e;

    public static ddi[] values() {
        return (ddi[])e.clone();
    }

    public static ddi valueOf(String $$0) {
        return Enum.valueOf(ddi.class, $$0);
    }

    private ddi(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ ddi[] a() {
        return new ddi[]{a, b, c};
    }

    static {
        e = ddi.a();
    }
}

