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

public class drj
extends drh {
    public static final Codec<drj> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bdc.b(-16, 16).fieldOf("xz_spread").forGetter($$0 -> $$0.c), (App)bdc.b(-16, 16).fieldOf("y_spread").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, drj::new));
    private final bdc c;
    private final bdc d;

    public static drj a(bdc $$0, bdc $$1) {
        return new drj($$0, $$1);
    }

    public static drj a(bdc $$0) {
        return new drj(bcz.a(0), $$0);
    }

    public static drj b(bdc $$0) {
        return new drj($$0, bcz.a(0));
    }

    private drj(bdc $$0, bdc $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
        int $$3 = $$2.u() + this.c.a($$1);
        int $$4 = $$2.v() + this.d.a($$1);
        int $$5 = $$2.w() + this.c.a($$1);
        return Stream.of(new gu($$3, $$4, $$5));
    }

    @Override
    public dri<?> b() {
        return dri.n;
    }
}

