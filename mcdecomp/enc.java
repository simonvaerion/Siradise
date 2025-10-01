/*
 * Decompiled with CFR 0.152.
 */
public final class enc
extends Enum<enc>
implements apc {
    public static final /* enum */ enc a = new enc(0, "options.off");
    public static final /* enum */ enc b = new enc(1, "options.clouds.fast");
    public static final /* enum */ enc c = new enc(2, "options.clouds.fancy");
    private final int d;
    private final String e;
    private static final /* synthetic */ enc[] f;

    public static enc[] values() {
        return (enc[])f.clone();
    }

    public static enc valueOf(String $$0) {
        return Enum.valueOf(enc.class, $$0);
    }

    private enc(int $$0, String $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public int a() {
        return this.d;
    }

    @Override
    public String b() {
        return this.e;
    }

    private static /* synthetic */ enc[] d() {
        return new enc[]{a, b, c};
    }

    static {
        f = enc.d();
    }
}

