/*
 * Decompiled with CFR 0.152.
 */
public final class dgf
extends Enum<dgf> {
    public static final /* enum */ dgf a = new dgf(false, false);
    public static final /* enum */ dgf b = new dgf(true, false);
    public static final /* enum */ dgf c = new dgf(true, true);
    private final boolean d;
    private final boolean e;
    private static final /* synthetic */ dgf[] f;

    public static dgf[] values() {
        return (dgf[])f.clone();
    }

    public static dgf valueOf(String $$0) {
        return Enum.valueOf(dgf.class, $$0);
    }

    private dgf(boolean $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.d;
    }

    public static dgf a(ahy $$0) {
        if ($$0.a(ahy.d)) {
            return c;
        }
        if ($$0.a(ahy.b)) {
            return b;
        }
        return a;
    }

    private static /* synthetic */ dgf[] c() {
        return new dgf[]{a, b, c};
    }

    static {
        f = dgf.c();
    }
}

