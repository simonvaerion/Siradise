/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class dqv
extends Enum<dqv>
implements apr {
    public static final /* enum */ dqv a = new dqv(ha.b, 1, "ceiling");
    public static final /* enum */ dqv b = new dqv(ha.a, -1, "floor");
    public static final Codec<dqv> c;
    private final ha d;
    private final int e;
    private final String f;
    private static final /* synthetic */ dqv[] g;

    public static dqv[] values() {
        return (dqv[])g.clone();
    }

    public static dqv valueOf(String $$0) {
        return Enum.valueOf(dqv.class, $$0);
    }

    private dqv(ha $$0, int $$1, String $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public ha a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ dqv[] d() {
        return new dqv[]{a, b};
    }

    static {
        g = dqv.d();
        c = apr.a(dqv::values);
    }
}

