/*
 * Decompiled with CFR 0.152.
 */
public final class dcy
extends Enum<dcy>
implements apr {
    public static final /* enum */ dcy a = new dcy("tip_merge");
    public static final /* enum */ dcy b = new dcy("tip");
    public static final /* enum */ dcy c = new dcy("frustum");
    public static final /* enum */ dcy d = new dcy("middle");
    public static final /* enum */ dcy e = new dcy("base");
    private final String f;
    private static final /* synthetic */ dcy[] g;

    public static dcy[] values() {
        return (dcy[])g.clone();
    }

    public static dcy valueOf(String $$0) {
        return Enum.valueOf(dcy.class, $$0);
    }

    private dcy(String $$0) {
        this.f = $$0;
    }

    public String toString() {
        return this.f;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ dcy[] a() {
        return new dcy[]{a, b, c, d, e};
    }

    static {
        g = dcy.a();
    }
}

