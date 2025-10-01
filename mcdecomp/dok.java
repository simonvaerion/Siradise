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

public class dok
extends doe {
    public static final Codec<dok> a = RecordCodecBuilder.create($$02 -> dok.b($$02).and((App)bdc.b(0, 24).fieldOf("trunk_height").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, dok::new));
    private final bdc b;

    public dok(bdc $$0, bdc $$1, bdc $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected dof<?> a() {
        return dof.b;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        gu $$9 = $$5.a();
        int $$10 = $$2.a(2);
        int $$11 = 1;
        int $$12 = 0;
        for (int $$13 = $$8; $$13 >= -$$6; --$$13) {
            this.a($$0, $$1, $$2, $$3, $$9, $$10, $$13, $$5.c());
            if ($$10 >= $$11) {
                $$10 = $$12;
                $$12 = 1;
                $$11 = Math.min($$11 + 1, $$7 + $$5.b());
                continue;
            }
            ++$$10;
        }
    }

    @Override
    public int a(apf $$0, int $$1, dno $$2) {
        return Math.max(4, $$1 - this.b.a($$0));
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
    }
}

