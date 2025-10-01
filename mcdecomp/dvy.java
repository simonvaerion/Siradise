/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dvy
implements dwb {
    public static final Codec<dvy> a = RecordCodecBuilder.create($$02 -> $$02.group((App)qr.a.fieldOf("data").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, dvy::new));
    private final qr b;

    public dvy(qr $$0) {
        this.b = $$0;
    }

    @Override
    public qr a(apf $$0, @Nullable qr $$1) {
        return $$1 == null ? this.b.h() : $$1.a(this.b);
    }

    @Override
    public dwc<?> a() {
        return dwc.c;
    }
}

