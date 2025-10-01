/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dwc<P extends dwb> {
    public static final dwc<dvz> a = dwc.a("clear", dvz.a);
    public static final dwc<dwa> b = dwc.a("passthrough", dwa.b);
    public static final dwc<dvy> c = dwc.a("append_static", dvy.a);
    public static final dwc<dvx> d = dwc.a("append_loot", dvx.a);

    public Codec<P> codec();

    private static <P extends dwb> dwc<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.q, $$0, () -> $$1);
    }
}

