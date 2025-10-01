/*
 * Decompiled with CFR 0.152.
 */
public final class bft
extends Enum<bft>
implements apc {
    public static final /* enum */ bft a = new bft(0, "options.mainHand.left");
    public static final /* enum */ bft b = new bft(1, "options.mainHand.right");
    private final int c;
    private final String d;
    private static final /* synthetic */ bft[] e;

    public static bft[] values() {
        return (bft[])e.clone();
    }

    public static bft valueOf(String $$0) {
        return Enum.valueOf(bft.class, $$0);
    }

    private bft(int $$0, String $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public bft d() {
        if (this == a) {
            return b;
        }
        return a;
    }

    @Override
    public int a() {
        return this.c;
    }

    @Override
    public String b() {
        return this.d;
    }

    private static /* synthetic */ bft[] e() {
        return new bft[]{a, b};
    }

    static {
        e = bft.e();
    }
}

