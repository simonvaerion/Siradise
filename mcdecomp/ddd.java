/*
 * Decompiled with CFR 0.152.
 */
public final class ddd
extends Enum<ddd>
implements apr {
    public static final /* enum */ ddd a = new ddd("normal");
    public static final /* enum */ ddd b = new ddd("sticky");
    private final String c;
    private static final /* synthetic */ ddd[] d;

    public static ddd[] values() {
        return (ddd[])d.clone();
    }

    public static ddd valueOf(String $$0) {
        return Enum.valueOf(ddd.class, $$0);
    }

    private ddd(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ ddd[] a() {
        return new ddd[]{a, b};
    }

    static {
        d = ddd.a();
    }
}

