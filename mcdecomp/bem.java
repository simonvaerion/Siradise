/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class bem
extends Enum<bem>
implements apr {
    public static final /* enum */ bem a = new bem("never");
    public static final /* enum */ bem b = new bem("when_caused_by_living_non_player");
    public static final /* enum */ bem c = new bem("always");
    public static final Codec<bem> d;
    private final String e;
    private static final /* synthetic */ bem[] f;

    public static bem[] values() {
        return (bem[])f.clone();
    }

    public static bem valueOf(String $$0) {
        return Enum.valueOf(bem.class, $$0);
    }

    private bem(String $$0) {
        this.e = $$0;
    }

    @Override
    public String c() {
        return this.e;
    }

    private static /* synthetic */ bem[] a() {
        return new bem[]{a, b, c};
    }

    static {
        f = bem.a();
        d = apr.a(bem::values);
    }
}

