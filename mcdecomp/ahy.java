/*
 * Decompiled with CFR 0.152.
 */
public final class ahy
extends Enum<ahy> {
    public static final /* enum */ ahy a = new ahy();
    public static final /* enum */ ahy b = new ahy();
    public static final /* enum */ ahy c = new ahy();
    public static final /* enum */ ahy d = new ahy();
    private static final /* synthetic */ ahy[] e;

    public static ahy[] values() {
        return (ahy[])e.clone();
    }

    public static ahy valueOf(String $$0) {
        return Enum.valueOf(ahy.class, $$0);
    }

    public boolean a(ahy $$0) {
        return this.ordinal() >= $$0.ordinal();
    }

    private static /* synthetic */ ahy[] a() {
        return new ahy[]{a, b, c, d};
    }

    static {
        e = ahy.a();
    }
}

