/*
 * Decompiled with CFR 0.152.
 */
public final class bdx
extends Enum<bdx> {
    public static final /* enum */ bdx a = new bdx();
    public static final /* enum */ bdx b = new bdx();
    public static final /* enum */ bdx c = new bdx();
    public static final /* enum */ bdx d = new bdx();
    public static final /* enum */ bdx e = new bdx();
    private static final /* synthetic */ bdx[] f;

    public static bdx[] values() {
        return (bdx[])f.clone();
    }

    public static bdx valueOf(String $$0) {
        return Enum.valueOf(bdx.class, $$0);
    }

    public boolean a() {
        return this == a || this == b || this == c;
    }

    public boolean b() {
        return this == a;
    }

    public boolean c() {
        return this == a || this == b;
    }

    public static bdx a(boolean $$0) {
        return $$0 ? a : b;
    }

    private static /* synthetic */ bdx[] d() {
        return new bdx[]{a, b, c, d, e};
    }

    static {
        f = bdx.d();
    }
}

