/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class eng
extends Enum<eng>
implements apc {
    public static final /* enum */ eng a = new eng(0, "options.graphics.fast");
    public static final /* enum */ eng b = new eng(1, "options.graphics.fancy");
    public static final /* enum */ eng c = new eng(2, "options.graphics.fabulous");
    private static final IntFunction<eng> d;
    private final int e;
    private final String f;
    private static final /* synthetic */ eng[] g;

    public static eng[] values() {
        return (eng[])g.clone();
    }

    public static eng valueOf(String $$0) {
        return Enum.valueOf(eng.class, $$0);
    }

    private eng(int $$0, String $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public int a() {
        return this.e;
    }

    @Override
    public String b() {
        return this.f;
    }

    public String toString() {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> "fast";
            case b -> "fancy";
            case c -> "fabulous";
        };
    }

    public static eng a(int $$0) {
        return d.apply($$0);
    }

    private static /* synthetic */ eng[] d() {
        return new eng[]{a, b, c};
    }

    static {
        g = eng.d();
        d = anu.a(eng::a, eng.values(), anu.a.b);
    }
}

