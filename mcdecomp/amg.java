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
import java.util.Optional;

public class amg {
    public static final Codec<amg> a = RecordCodecBuilder.create($$0 -> $$0.group((App)acq.a.fieldOf("sound_id").forGetter(amg::a), (App)Codec.FLOAT.optionalFieldOf("range").forGetter(amg::b)).apply((Applicative)$$0, amg::a));
    public static final Codec<he<amg>> b = acm.a(jc.ad, a);
    private static final float c = 16.0f;
    private final acq d;
    private final float e;
    private final boolean f;

    private static amg a(acq $$0, Optional<Float> $$12) {
        return $$12.map($$1 -> amg.a($$0, $$1.floatValue())).orElseGet(() -> amg.a($$0));
    }

    public static amg a(acq $$0) {
        return new amg($$0, 16.0f, false);
    }

    public static amg a(acq $$0, float $$1) {
        return new amg($$0, $$1, true);
    }

    private amg(acq $$0, float $$1, boolean $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public acq a() {
        return this.d;
    }

    public float a(float $$0) {
        if (this.f) {
            return this.e;
        }
        return $$0 > 1.0f ? 16.0f * $$0 : 16.0f;
    }

    private Optional<Float> b() {
        return this.f ? Optional.of(Float.valueOf(this.e)) : Optional.empty();
    }

    public void a(sf $$0) {
        $$0.a(this.d);
        $$0.a(this.b(), sf::writeFloat);
    }

    public static amg b(sf $$0) {
        acq $$1 = $$0.t();
        Optional<Float> $$2 = $$0.b(sf::readFloat);
        return amg.a($$1, $$2);
    }
}

