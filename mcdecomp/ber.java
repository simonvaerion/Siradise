/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class ber
extends Enum<ber>
implements apr {
    public static final /* enum */ ber a = new ber("default");
    public static final /* enum */ ber b = new ber("fall_variants");
    public static final /* enum */ ber c = new ber("intentional_game_design");
    public static final Codec<ber> d;
    private final String e;
    private static final /* synthetic */ ber[] f;

    public static ber[] values() {
        return (ber[])f.clone();
    }

    public static ber valueOf(String $$0) {
        return Enum.valueOf(ber.class, $$0);
    }

    private ber(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ ber[] a() {
        return new ber[]{a, b, c};
    }

    static {
        f = ber.a();
        d = apr.a(ber::values);
    }
}

