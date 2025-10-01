/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dne
implements dms {
    public static final Codec<dne> a = RecordCodecBuilder.create($$02 -> $$02.apply2(dne::new, (App)dmi.a.listOf().fieldOf("features").forGetter($$0 -> $$0.b), (App)dre.b.fieldOf("default").forGetter($$0 -> $$0.c)));
    public final List<dmi> b;
    public final he<dre> c;

    public dne(List<dmi> $$0, he<dre> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public Stream<dkb<?, ?>> e() {
        return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
    }
}

