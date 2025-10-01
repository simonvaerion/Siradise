/*
 * Decompiled with CFR 0.152.
 */
public final class emc
extends Enum<emc> {
    public static final /* enum */ emc a = new emc(0, drq.a);
    public static final /* enum */ emc b = new emc(1, drq.b);
    public static final /* enum */ emc c = new emc(2, drq.c);
    public static final /* enum */ emc d = new emc(3, drq.d);
    private final int e;
    private final sw f;
    private static final /* synthetic */ emc[] g;

    public static emc[] values() {
        return (emc[])g.clone();
    }

    public static emc valueOf(String $$0) {
        return Enum.valueOf(emc.class, $$0);
    }

    private emc(int $$0, acp<drp> $$1) {
        this.e = $$0;
        this.f = sw.c($$1.a().f("generator"));
    }

    public sw a() {
        return this.f;
    }

    public int b() {
        return this.e;
    }

    private static /* synthetic */ emc[] c() {
        return new emc[]{a, b, c, d};
    }

    static {
        g = emc.c();
    }
}

