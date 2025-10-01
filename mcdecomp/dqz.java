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

public class dqz
extends drh {
    public static final Codec<dqz> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dqh.c.fieldOf("height").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dqz::new));
    private final dqh c;

    private dqz(dqh $$0) {
        this.c = $$0;
    }

    public static dqz a(dqh $$0) {
        return new dqz($$0);
    }

    public static dqz a(die $$0, die $$1) {
        return dqz.a(dqk.a($$0, $$1));
    }

    public static dqz b(die $$0, die $$1) {
        return dqz.a(dqj.a($$0, $$1));
    }

    @Override
    public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
        return Stream.of($$2.h(this.c.a($$1, $$0)));
    }

    @Override
    public dri<?> b() {
        return dri.l;
    }
}

