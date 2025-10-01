/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class djb
extends djc {
    public static final Codec<djb> a = RecordCodecBuilder.create($$0 -> djb.a($$0).apply((Applicative)$$0, djb::new));

    public djb(hz $$0) {
        super($$0);
    }

    @Override
    protected boolean a(dcb $$0) {
        return $$0.e();
    }

    @Override
    public dis<?> a() {
        return dis.e;
    }
}

