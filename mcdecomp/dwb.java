/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dwb {
    public static final Codec<dwb> c = jb.q.q().dispatch(dwb::a, dwc::codec);

    @Nullable
    public qr a(apf var1, @Nullable qr var2);

    public dwc<?> a();
}

