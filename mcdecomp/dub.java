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
import java.util.Optional;

public class dub
extends dsa {
    public static final Codec<dub> d = RecordCodecBuilder.create($$02 -> $$02.group(dub.a($$02), (App)dqh.c.fieldOf("height").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, dub::new));
    public final dqh e;

    public dub(dsa.c $$0, dqh $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        dij $$1 = $$0.f();
        int $$2 = $$0.h().d() + $$1.a(16);
        int $$32 = $$0.h().e() + $$1.a(16);
        int $$4 = $$0.b().e();
        dih $$5 = new dih($$0.b(), $$0.i());
        int $$6 = this.e.a($$1, $$5);
        cmy $$7 = $$0.b().a($$2, $$32, $$0.i(), $$0.d());
        gu.a $$8 = new gu.a($$2, $$6, $$32);
        while ($$6 > $$4) {
            dcb $$9 = $$7.a($$6);
            dcb $$10 = $$7.a(--$$6);
            if (!$$9.i() || !$$10.a(cpo.dX) && !$$10.d(cmb.a, $$8.q($$6), ha.b)) continue;
            break;
        }
        if ($$6 <= $$4) {
            return Optional.empty();
        }
        gu $$11 = new gu($$2, $$6, $$32);
        return Optional.of(new dsa.b($$11, $$3 -> dua.a($$0.e(), $$3, $$1, $$11)));
    }

    @Override
    public dsj<?> e() {
        return dsj.i;
    }
}

