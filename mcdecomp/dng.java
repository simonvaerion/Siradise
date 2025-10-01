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

public class dng
implements dms {
    public static final Codec<dng> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.list(dna.a.a).fieldOf("targets").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, dng::new));
    public final List<dna.a> b;

    public dng(dcb $$0, dcb $$1) {
        this((List<dna.a>)ImmutableList.of((Object)dna.a(new duy($$0), $$1)));
    }

    public dng(List<dna.a> $$0) {
        this.b = $$0;
    }
}

