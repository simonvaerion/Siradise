/*
 * Decompiled with CFR 0.152.
 */
public final class ena
extends Enum<ena> {
    public static final /* enum */ ena a = new ena(true, false);
    public static final /* enum */ ena b = new ena(false, false);
    public static final /* enum */ ena c = new ena(false, true);
    private static final ena[] d;
    private final boolean e;
    private final boolean f;
    private static final /* synthetic */ ena[] g;

    public static ena[] values() {
        return (ena[])g.clone();
    }

    public static ena valueOf(String $$0) {
        return Enum.valueOf(ena.class, $$0);
    }

    private ena(boolean $$0, boolean $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.f;
    }

    public ena c() {
        return d[(this.ordinal() + 1) % d.length];
    }

    private static /* synthetic */ ena[] d() {
        return new ena[]{a, b, c};
    }

    static {
        g = ena.d();
        d = ena.values();
    }
}

