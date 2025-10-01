/*
 * Decompiled with CFR 0.152.
 */
public final class dcu
extends Enum<dcu>
implements apr {
    public static final /* enum */ dcu a = new dcu("compare");
    public static final /* enum */ dcu b = new dcu("subtract");
    private final String c;
    private static final /* synthetic */ dcu[] d;

    public static dcu[] values() {
        return (dcu[])d.clone();
    }

    public static dcu valueOf(String $$0) {
        return Enum.valueOf(dcu.class, $$0);
    }

    private dcu(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ dcu[] a() {
        return new dcu[]{a, b};
    }

    static {
        d = dcu.a();
    }
}

