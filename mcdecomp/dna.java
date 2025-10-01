/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dna
implements dms {
    public static final Codec<dna> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.list(dna$a.a).fieldOf("targets").forGetter($$0 -> $$0.b), (App)Codec.intRange((int)0, (int)64).fieldOf("size").forGetter($$0 -> $$0.c), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("discard_chance_on_air_exposure").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, dna::new));
    public final List<a> b;
    public final int c;
    public final float d;

    public dna(List<a> $$0, int $$1, float $$2) {
        this.c = $$1;
        this.b = $$0;
        this.d = $$2;
    }

    public dna(List<a> $$0, int $$1) {
        this($$0, $$1, 0.0f);
    }

    public dna(dvn $$0, dcb $$1, int $$2, float $$3) {
        this((List<a>)ImmutableList.of((Object)new a($$0, $$1)), $$2, $$3);
    }

    public dna(dvn $$0, dcb $$1, int $$2) {
        this((List<a>)ImmutableList.of((Object)new a($$0, $$1)), $$2, 0.0f);
    }

    public static a a(dvn $$0, dcb $$1) {
        return new a($$0, $$1);
    }

    public static class a {
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dvn.c.fieldOf("target").forGetter($$0 -> $$0.b), (App)dcb.b.fieldOf("state").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, a::new));
        public final dvn b;
        public final dcb c;

        a(dvn $$0, dcb $$1) {
            this.b = $$0;
            this.c = $$1;
        }
    }
}

