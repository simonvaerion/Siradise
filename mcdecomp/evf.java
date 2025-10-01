/*
 * Decompiled with CFR 0.152.
 */
public final class evf
extends Enum<evf> {
    public static final /* enum */ evf a = new evf(0);
    public static final /* enum */ evf b = new evf(1);
    private final int c;
    private static final /* synthetic */ evf[] d;

    public static evf[] values() {
        return (evf[])d.clone();
    }

    public static evf valueOf(String $$0) {
        return Enum.valueOf(evf.class, $$0);
    }

    private evf(int $$0) {
        this.c = $$0;
    }

    public int a() {
        return this.c;
    }

    private static /* synthetic */ evf[] b() {
        return new evf[]{a, b};
    }

    static {
        d = evf.b();
    }
}

