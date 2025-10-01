/*
 * Decompiled with CFR 0.152.
 */
public final class dcn
extends Enum<dcn>
implements apr {
    public static final /* enum */ dcn a = new dcn("none");
    public static final /* enum */ dcn b = new dcn("small");
    public static final /* enum */ dcn c = new dcn("large");
    private final String d;
    private static final /* synthetic */ dcn[] e;

    public static dcn[] values() {
        return (dcn[])e.clone();
    }

    public static dcn valueOf(String $$0) {
        return Enum.valueOf(dcn.class, $$0);
    }

    private dcn(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ dcn[] a() {
        return new dcn[]{a, b, c};
    }

    static {
        e = dcn.a();
    }
}

