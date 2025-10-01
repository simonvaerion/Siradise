/*
 * Decompiled with CFR 0.152.
 */
public final class esw
extends Enum<esw> {
    public static final /* enum */ esw a = new esw();
    public static final /* enum */ esw b = new esw();
    private static final /* synthetic */ esw[] c;

    public static esw[] values() {
        return (esw[])c.clone();
    }

    public static esw valueOf(String $$0) {
        return Enum.valueOf(esw.class, $$0);
    }

    public esw a() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> b;
            case b -> a;
        };
    }

    public esx b() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> esx.d;
            case b -> esx.b;
        };
    }

    public esx c() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> esx.c;
            case b -> esx.a;
        };
    }

    public esx a(boolean $$0) {
        return $$0 ? this.b() : this.c();
    }

    private static /* synthetic */ esw[] d() {
        return new esw[]{a, b};
    }

    static {
        c = esw.d();
    }
}

