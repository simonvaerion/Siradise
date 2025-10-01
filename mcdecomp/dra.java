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

public class dra
extends drh {
    public static final Codec<dra> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dhk.a.g.fieldOf("heightmap").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dra::new));
    private final dhk.a c;

    private dra(dhk.a $$0) {
        this.c = $$0;
    }

    public static dra a(dhk.a $$0) {
        return new dra($$0);
    }

    @Override
    public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
        int $$4;
        int $$3 = $$2.u();
        int $$5 = $$0.a(this.c, $$3, $$4 = $$2.w());
        if ($$5 > $$0.c()) {
            return Stream.of(new gu($$3, $$5, $$4));
        }
        return Stream.of(new gu[0]);
    }

    @Override
    public dri<?> b() {
        return dri.k;
    }
}

