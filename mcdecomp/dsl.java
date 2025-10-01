/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class dsl
extends Enum<dsl>
implements apr {
    public static final /* enum */ dsl a = new dsl("none");
    public static final /* enum */ dsl b = new dsl("bury");
    public static final /* enum */ dsl c = new dsl("beard_thin");
    public static final /* enum */ dsl d = new dsl("beard_box");
    public static final Codec<dsl> e;
    private final String f;
    private static final /* synthetic */ dsl[] g;

    public static dsl[] values() {
        return (dsl[])g.clone();
    }

    public static dsl valueOf(String $$0) {
        return Enum.valueOf(dsl.class, $$0);
    }

    private dsl(String $$0) {
        this.f = $$0;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ dsl[] a() {
        return new dsl[]{a, b, c, d};
    }

    static {
        g = dsl.a();
        e = apr.a(dsl::values);
    }
}

