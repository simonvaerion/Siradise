/*
 * Decompiled with CFR 0.152.
 */
public final class ehw
extends Enum<ehw> {
    public static final /* enum */ ehw a = new ehw(0);
    public static final /* enum */ ehw b = new ehw(1);
    private final int c;
    private static final /* synthetic */ ehw[] d;

    public static ehw[] values() {
        return (ehw[])d.clone();
    }

    public static ehw valueOf(String $$0) {
        return Enum.valueOf(ehw.class, $$0);
    }

    private ehw(int $$0) {
        this.c = $$0;
    }

    public int a() {
        return this.c;
    }

    private static /* synthetic */ ehw[] b() {
        return new ehw[]{a, b};
    }

    static {
        d = ehw.b();
    }
}

