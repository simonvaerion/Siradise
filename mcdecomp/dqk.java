/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dqk
extends dqh {
    public static final Codec<dqk> a = RecordCodecBuilder.create($$02 -> $$02.group((App)die.a.fieldOf("min_inclusive").forGetter($$0 -> $$0.d), (App)die.a.fieldOf("max_inclusive").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, dqk::new));
    private static final Logger b = LogUtils.getLogger();
    private final die d;
    private final die e;
    private final LongSet f = new LongOpenHashSet();

    private dqk(die $$0, die $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static dqk a(die $$0, die $$1) {
        return new dqk($$0, $$1);
    }

    @Override
    public int a(apf $$0, dih $$1) {
        int $$3;
        int $$2 = this.d.a($$1);
        if ($$2 > ($$3 = this.e.a($$1))) {
            if (this.f.add((long)$$2 << 32 | (long)$$3)) {
                b.warn("Empty height range: {}", (Object)this);
            }
            return $$2;
        }
        return apa.b($$0, $$2, $$3);
    }

    @Override
    public dqi<?> a() {
        return dqi.b;
    }

    public String toString() {
        return "[" + this.d + "-" + this.e + "]";
    }
}

