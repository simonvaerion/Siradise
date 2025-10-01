/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntFunction;

public final class enu
extends Enum<enu>
implements apc {
    public static final /* enum */ enu a = new enu(0, "options.prioritizeChunkUpdates.none");
    public static final /* enum */ enu b = new enu(1, "options.prioritizeChunkUpdates.byPlayer");
    public static final /* enum */ enu c = new enu(2, "options.prioritizeChunkUpdates.nearby");
    private static final IntFunction<enu> d;
    private final int e;
    private final String f;
    private static final /* synthetic */ enu[] g;

    public static enu[] values() {
        return (enu[])g.clone();
    }

    public static enu valueOf(String $$0) {
        return Enum.valueOf(enu.class, $$0);
    }

    private enu(int $$0, String $$1) {
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

    public static enu a(int $$0) {
        return d.apply($$0);
    }

    private static /* synthetic */ enu[] d() {
        return new enu[]{a, b, c};
    }

    static {
        g = enu.d();
        d = anu.a(enu::a, enu.values(), anu.a.b);
    }
}

