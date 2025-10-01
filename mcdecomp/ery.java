/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public final class ery
extends Enum<ery>
implements apr {
    public static final /* enum */ ery a = new ery("bitmap", erw.a.a);
    public static final /* enum */ ery b = new ery("ttf", esa.a);
    public static final /* enum */ ery c = new ery("space", ego.a.a);
    public static final /* enum */ ery d = new ery("unihex", esb.b.a);
    public static final /* enum */ ery e = new ery("reference", erz.a);
    public static final Codec<ery> f;
    private final String g;
    private final MapCodec<? extends erx> h;
    private static final /* synthetic */ ery[] i;

    public static ery[] values() {
        return (ery[])i.clone();
    }

    public static ery valueOf(String $$0) {
        return Enum.valueOf(ery.class, $$0);
    }

    private ery(String $$0, MapCodec<? extends erx> $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    @Override
    public String c() {
        return this.g;
    }

    public MapCodec<? extends erx> a() {
        return this.h;
    }

    private static /* synthetic */ ery[] b() {
        return new ery[]{a, b, c, d, e};
    }

    static {
        i = ery.b();
        f = apr.a(ery::values);
    }
}

