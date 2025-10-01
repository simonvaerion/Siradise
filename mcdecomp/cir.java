/*
 * Decompiled with CFR 0.152.
 */
public final class cir
extends Enum<cir>
implements apr {
    public static final /* enum */ cir a = new cir("food");
    public static final /* enum */ cir b = new cir("blocks");
    public static final /* enum */ cir c = new cir("misc");
    public static final apr.a<cir> d;
    private final String e;
    private static final /* synthetic */ cir[] f;

    public static cir[] values() {
        return (cir[])f.clone();
    }

    public static cir valueOf(String $$0) {
        return Enum.valueOf(cir.class, $$0);
    }

    private cir(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ cir[] a() {
        return new cir[]{a, b, c};
    }

    static {
        f = cir.a();
        d = apr.a(cir::values);
    }
}

