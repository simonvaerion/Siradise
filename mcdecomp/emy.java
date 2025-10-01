/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class emy
extends Enum<emy>
implements apc {
    public static final /* enum */ emy a = new emy(0, "options.off");
    public static final /* enum */ emy b = new emy(1, "options.attack.crosshair");
    public static final /* enum */ emy c = new emy(2, "options.attack.hotbar");
    private static final IntFunction<emy> d;
    private final int e;
    private final String f;
    private static final /* synthetic */ emy[] g;

    public static emy[] values() {
        return (emy[])g.clone();
    }

    public static emy valueOf(String $$0) {
        return Enum.valueOf(emy.class, $$0);
    }

    private emy(int $$0, String $$1) {
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

    public static emy a(int $$0) {
        return d.apply($$0);
    }

    private static /* synthetic */ emy[] d() {
        return new emy[]{a, b, c};
    }

    static {
        g = emy.d();
        d = anu.a(emy::a, emy.values(), anu.a.b);
    }
}

