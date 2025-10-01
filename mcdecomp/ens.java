/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class ens
extends Enum<ens>
implements apc {
    public static final /* enum */ ens a = new ens(0, "options.particles.all");
    public static final /* enum */ ens b = new ens(1, "options.particles.decreased");
    public static final /* enum */ ens c = new ens(2, "options.particles.minimal");
    private static final IntFunction<ens> d;
    private final int e;
    private final String f;
    private static final /* synthetic */ ens[] g;

    public static ens[] values() {
        return (ens[])g.clone();
    }

    public static ens valueOf(String $$0) {
        return Enum.valueOf(ens.class, $$0);
    }

    private ens(int $$0, String $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public String b() {
        return this.f;
    }

    @Override
    public int a() {
        return this.e;
    }

    public static ens a(int $$0) {
        return d.apply($$0);
    }

    private static /* synthetic */ ens[] d() {
        return new ens[]{a, b, c};
    }

    static {
        g = ens.d();
        d = anu.a(ens::a, ens.values(), anu.a.b);
    }
}

