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

public class dus
extends dvg {
    public static final Codec<dus> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("min_chance").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("max_chance").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.d)), (App)Codec.INT.fieldOf("min_dist").orElse((Object)0).forGetter($$0 -> $$0.e), (App)Codec.INT.fieldOf("max_dist").orElse((Object)0).forGetter($$0 -> $$0.f), (App)ha.a.e.fieldOf("axis").orElse((Object)ha.a.b).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, dus::new));
    private final float b;
    private final float d;
    private final int e;
    private final int f;
    private final ha.a g;

    public dus(float $$0, float $$1, int $$2, int $$3, ha.a $$4) {
        if ($$2 >= $$3) {
            throw new IllegalArgumentException("Invalid range: [" + $$2 + "," + $$3 + "]");
        }
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    @Override
    public boolean a(gu $$0, gu $$1, gu $$2, apf $$3) {
        ha $$4 = ha.a(ha.b.a, this.g);
        float $$5 = Math.abs(($$1.u() - $$2.u()) * $$4.j());
        float $$6 = Math.abs(($$1.v() - $$2.v()) * $$4.k());
        float $$7 = Math.abs(($$1.w() - $$2.w()) * $$4.l());
        int $$8 = (int)($$5 + $$6 + $$7);
        float $$9 = $$3.i();
        return $$9 <= apa.b(this.b, this.d, apa.g($$8, this.e, this.f));
    }

    @Override
    protected dvh<?> a() {
        return dvh.c;
    }
}

