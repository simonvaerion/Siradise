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

public class doi
extends doe {
    public static final Codec<doi> a = RecordCodecBuilder.create($$02 -> doi.b($$02).and((App)bdc.b(0, 24).fieldOf("height").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, doi::new));
    private final bdc b;

    public doi(bdc $$0, bdc $$1, bdc $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected dof<?> a() {
        return dof.c;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        int $$9 = 0;
        for (int $$10 = $$8; $$10 >= $$8 - $$6; --$$10) {
            this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
            if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
                --$$9;
                continue;
            }
            if ($$9 >= $$7 + $$5.b()) continue;
            ++$$9;
        }
    }

    @Override
    public int a(apf $$0, int $$1) {
        return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
    }

    @Override
    public int a(apf $$0, int $$1, dno $$2) {
        return this.b.a($$0);
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
    }
}

