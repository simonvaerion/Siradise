/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class dsw
extends Enum<dsw>
implements apr {
    public static final /* enum */ dsw a = new dsw("linear");
    public static final /* enum */ dsw b = new dsw("triangular");
    public static final Codec<dsw> c;
    private final String d;
    private static final /* synthetic */ dsw[] e;

    public static dsw[] values() {
        return (dsw[])e.clone();
    }

    public static dsw valueOf(String $$0) {
        return Enum.valueOf(dsw.class, $$0);
    }

    private dsw(String $$0) {
        this.d = $$0;
    }

    @Override
    public String c() {
        return this.d;
    }

    public int a(apf $$0, int $$1) {
        return switch (this) {
            default -> throw new IncompatibleClassChangeError();
            case a -> $$0.a($$1);
            case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
        };
    }

    private static /* synthetic */ dsw[] a() {
        return new dsw[]{a, b};
    }

    static {
        e = dsw.a();
        c = apr.a(dsw::values);
    }
}

