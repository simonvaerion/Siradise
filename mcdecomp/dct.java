/*
 * Decompiled with CFR 0.152.
 */
public final class dct
extends Enum<dct>
implements apr {
    public static final /* enum */ dct a = new dct("single");
    public static final /* enum */ dct b = new dct("left");
    public static final /* enum */ dct c = new dct("right");
    private final String d;
    private static final /* synthetic */ dct[] e;

    public static dct[] values() {
        return (dct[])e.clone();
    }

    public static dct valueOf(String $$0) {
        return Enum.valueOf(dct.class, $$0);
    }

    private dct(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    public dct a() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> a;
            case b -> c;
            case c -> b;
        };
    }

    private static /* synthetic */ dct[] b() {
        return new dct[]{a, b, c};
    }

    static {
        e = dct.b();
    }
}

