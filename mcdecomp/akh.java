/*
 * Decompiled with CFR 0.152.
 */
public final class akh
extends Enum<akh> {
    public static final /* enum */ akh a = new akh("old");
    public static final /* enum */ akh b = new akh("new");
    public static final /* enum */ akh c = new akh("compatible");
    private final sw d;
    private final sw e;
    private static final /* synthetic */ akh[] f;

    public static akh[] values() {
        return (akh[])f.clone();
    }

    public static akh valueOf(String $$0) {
        return Enum.valueOf(akh.class, $$0);
    }

    private akh(String $$0) {
        this.d = sw.c("pack.incompatible." + $$0).a(n.h);
        this.e = sw.c("pack.incompatible.confirm." + $$0);
    }

    public boolean a() {
        return this == c;
    }

    public static akh a(int $$0, ajm $$1) {
        int $$2 = aa.b().a($$1);
        if ($$0 < $$2) {
            return a;
        }
        if ($$0 > $$2) {
            return b;
        }
        return c;
    }

    public sw b() {
        return this.d;
    }

    public sw c() {
        return this.e;
    }

    private static /* synthetic */ akh[] d() {
        return new akh[]{a, b, c};
    }

    static {
        f = akh.d();
    }
}

