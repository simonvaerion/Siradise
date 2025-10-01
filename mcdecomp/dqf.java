/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dqf
extends dqh {
    public static final Codec<dqf> a = RecordCodecBuilder.create($$02 -> $$02.group((App)die.a.fieldOf("min_inclusive").forGetter($$0 -> $$0.d), (App)die.a.fieldOf("max_inclusive").forGetter($$0 -> $$0.e), (App)Codec.intRange((int)1, (int)Integer.MAX_VALUE).optionalFieldOf("inner", (Object)1).forGetter($$0 -> $$0.f)).apply((Applicative)$$02, dqf::new));
    private static final Logger b = LogUtils.getLogger();
    private final die d;
    private final die e;
    private final int f;

    private dqf(die $$0, die $$1, int $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    public static dqf a(die $$0, die $$1, int $$2) {
        return new dqf($$0, $$1, $$2);
    }

    @Override
    public int a(apf $$0, dih $$1) {
        int $$2 = this.d.a($$1);
        int $$3 = this.e.a($$1);
        if ($$3 - $$2 - this.f + 1 <= 0) {
            b.warn("Empty height range: {}", (Object)this);
            return $$2;
        }
        int $$4 = $$0.a($$3 - $$2 - this.f + 1);
        return $$0.a($$4 + this.f) + $$2;
    }

    @Override
    public dqi<?> a() {
        return dqi.c;
    }

    public String toString() {
        return "biased[" + this.d + "-" + this.e + " inner: " + this.f + "]";
    }
}

