/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dva
extends dvq {
    public static final Codec<dva> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dhk.a.g.fieldOf("heightmap").orElse((Object)dhk.a.a).forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("offset").orElse((Object)0).forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dva::new));
    private final dhk.a b;
    private final int c;

    public dva(dhk.a $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    @Nullable
    public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
        dhk.a $$9;
        if ($$0 instanceof aif) {
            if (this.b == dhk.a.a) {
                dhk.a $$6 = dhk.a.b;
            } else if (this.b == dhk.a.c) {
                dhk.a $$7 = dhk.a.d;
            } else {
                dhk.a $$8 = this.b;
            }
        } else {
            $$9 = this.b;
        }
        gu $$10 = $$4.a();
        int $$11 = $$0.a($$9, $$10.u(), $$10.w()) + this.c;
        int $$12 = $$3.a().v();
        return new dvt.c(new gu($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
    }

    @Override
    protected dvs<?> a() {
        return dvs.g;
    }
}

