/*
 * Decompiled with CFR 0.152.
 */
public final class ddn
extends Enum<ddn>
implements apr {
    public static final /* enum */ ddn a = new ddn("none");
    public static final /* enum */ ddn b = new ddn("low");
    public static final /* enum */ ddn c = new ddn("tall");
    private final String d;
    private static final /* synthetic */ ddn[] e;

    public static ddn[] values() {
        return (ddn[])e.clone();
    }

    public static ddn valueOf(String $$0) {
        return Enum.valueOf(ddn.class, $$0);
    }

    private ddn(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ ddn[] a() {
        return new ddn[]{a, b, c};
    }

    static {
        e = ddn.a();
    }
}

