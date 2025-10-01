/*
 * Decompiled with CFR 0.152.
 */
public final class ddr
extends Enum<ddr> {
    public static final /* enum */ ddr a = new ddr(4259712);
    public static final /* enum */ ddr b = new ddr(0xFF3030);
    public static final /* enum */ ddr c = new ddr(2138367);
    private final int d;
    private static final /* synthetic */ ddr[] e;

    public static ddr[] values() {
        return (ddr[])e.clone();
    }

    public static ddr valueOf(String $$0) {
        return Enum.valueOf(ddr.class, $$0);
    }

    private ddr(int $$0) {
        this.d = $$0;
    }

    public int a() {
        return this.d;
    }

    private static /* synthetic */ ddr[] b() {
        return new ddr[]{a, b, c};
    }

    static {
        e = ddr.b();
    }
}

