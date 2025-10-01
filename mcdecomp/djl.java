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

public class djl
extends dji {
    public static final Codec<djl> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dji.d.forGetter($$0 -> $$0), (App)bda.c.fieldOf("horizontal_radius_multiplier").forGetter($$0 -> $$0.b), (App)bda.c.fieldOf("vertical_radius_multiplier").forGetter($$0 -> $$0.c), (App)bda.a(-1.0f, 1.0f).fieldOf("floor_level").forGetter($$0 -> $$0.j)).apply((Applicative)$$02, djl::new));
    public final bda b;
    public final bda c;
    final bda j;

    public djl(float $$0, dqh $$1, bda $$2, die $$3, djj $$4, hi<cpn> $$5, bda $$6, bda $$7, bda $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
        this.b = $$6;
        this.c = $$7;
        this.j = $$8;
    }

    public djl(float $$0, dqh $$1, bda $$2, die $$3, hi<cpn> $$4, bda $$5, bda $$6, bda $$7) {
        this($$0, $$1, $$2, $$3, djj.a, $$4, $$5, $$6, $$7);
    }

    public djl(dji $$0, bda $$1, bda $$2, bda $$3) {
        this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
    }
}

