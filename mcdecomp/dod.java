/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dod
extends dnz {
    public static final Codec<dod> c = RecordCodecBuilder.create($$0 -> dod.a($$0).apply((Applicative)$$0, dod::new));

    public dod(bdc $$0, bdc $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected dof<?> a() {
        return dof.f;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        for (int $$9 = $$8; $$9 >= $$8 - $$6; --$$9) {
            int $$10 = $$7 + ($$9 == $$8 || $$9 == $$8 - $$6 ? 0 : 1);
            this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
        }
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return apa.k((float)$$1 + 0.5f) + apa.k((float)$$3 + 0.5f) > (float)($$4 * $$4);
    }
}

