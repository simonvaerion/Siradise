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
import java.util.Optional;
import javax.annotation.Nullable;

public class dux
extends dvq {
    public static final Codec<dux> a = RecordCodecBuilder.create($$02 -> $$02.group((App)ht.a(jc.e).optionalFieldOf("rottable_blocks").forGetter($$0 -> $$0.b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("integrity").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, dux::new));
    private final Optional<hi<cpn>> b;
    private final float c;

    public dux(hi<cpn> $$0, float $$1) {
        this(Optional.of($$0), $$1);
    }

    public dux(float $$0) {
        this(Optional.empty(), $$0);
    }

    private dux(Optional<hi<cpn>> $$0, float $$1) {
        this.c = $$1;
        this.b = $$0;
    }

    @Override
    @Nullable
    public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
        apf $$6 = $$5.b($$4.a());
        if (this.b.isPresent() && !$$3.b().a(this.b.get()) || $$6.i() <= this.c) {
            return $$4;
        }
        return null;
    }

    @Override
    protected dvs<?> a() {
        return dvs.f;
    }
}

