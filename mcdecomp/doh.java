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

public class doh
extends doe {
    public static final Codec<doh> a = RecordCodecBuilder.create($$02 -> doh.b($$02).and((App)bdc.b(0, 24).fieldOf("crown_height").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, doh::new));
    private final bdc b;

    public doh(bdc $$0, bdc $$1, bdc $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected dof<?> a() {
        return dof.h;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        gu $$9 = $$5.a();
        int $$10 = 0;
        for (int $$11 = $$9.v() - $$6 + $$8; $$11 <= $$9.v() + $$8; ++$$11) {
            int $$15;
            int $$12 = $$9.v() - $$11;
            int $$13 = $$7 + $$5.b() + apa.d((float)$$12 / (float)$$6 * 3.5f);
            if ($$12 > 0 && $$13 == $$10 && ($$11 & 1) == 0) {
                int $$14 = $$13 + 1;
            } else {
                $$15 = $$13;
            }
            this.a($$0, $$1, $$2, $$3, new gu($$9.u(), $$11, $$9.w()), $$15, 0, $$5.c());
            $$10 = $$13;
        }
    }

    @Override
    public int a(apf $$0, int $$1, dno $$2) {
        return this.b.a($$0);
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if ($$1 + $$3 >= 7) {
            return true;
        }
        return $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
    }
}

