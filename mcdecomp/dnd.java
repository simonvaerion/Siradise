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
import java.util.stream.Stream;

public class dnd
implements dms {
    public static final Codec<dnd> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dre.b.fieldOf("feature_true").forGetter($$0 -> $$0.b), (App)dre.b.fieldOf("feature_false").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dnd::new));
    public final he<dre> b;
    public final he<dre> c;

    public dnd(he<dre> $$0, he<dre> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public Stream<dkb<?, ?>> e() {
        return Stream.concat(this.b.a().a(), this.c.a().a());
    }
}

