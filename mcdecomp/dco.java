/*
 * Decompiled with CFR 0.152.
 */
public final class dco
extends Enum<dco>
implements apr {
    public static final /* enum */ dco a = new dco("head");
    public static final /* enum */ dco b = new dco("foot");
    private final String c;
    private static final /* synthetic */ dco[] d;

    public static dco[] values() {
        return (dco[])d.clone();
    }

    public static dco valueOf(String $$0) {
        return Enum.valueOf(dco.class, $$0);
    }

    private dco(String $$0) {
        this.c = $$0;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String c() {
        return this.c;
    }

    private static /* synthetic */ dco[] a() {
        return new dco[]{a, b};
    }

    static {
        d = dco.a();
    }
}

