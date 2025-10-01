/*
 * Decompiled with CFR 0.152.
 */
public final class dda
extends Enum<dda>
implements apr {
    public static final /* enum */ dda a = new dda("top");
    public static final /* enum */ dda b = new dda("bottom");
    private final String c;
    private static final /* synthetic */ dda[] d;

    public static dda[] values() {
        return (dda[])d.clone();
    }

    public static dda valueOf(String $$0) {
        return Enum.valueOf(dda.class, $$0);
    }

    private dda(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ dda[] a() {
        return new dda[]{a, b};
    }

    static {
        d = dda.a();
    }
}

