/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class div
implements dir {
    public static final Codec<div> a = RecordCodecBuilder.create($$02 -> $$02.group((App)hz.v(16).optionalFieldOf("offset", (Object)gu.b).forGetter($$0 -> $$0.e)).apply((Applicative)$$02, div::new));
    private final hz e;

    public div(hz $$0) {
        this.e = $$0;
    }

    public boolean a(cng $$0, gu $$1) {
        return !$$0.r($$1.a(this.e));
    }

    @Override
    public dis<?> a() {
        return dis.h;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((cng)object, (gu)object2);
    }
}

