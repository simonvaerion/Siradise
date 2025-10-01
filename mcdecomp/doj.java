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

public class doj
extends doe {
    public static final Codec<doj> a = RecordCodecBuilder.create($$02 -> doj.b($$02).and($$02.group((App)bdc.b(1, 512).fieldOf("foliage_height").forGetter($$0 -> $$0.b), (App)Codec.intRange((int)0, (int)256).fieldOf("leaf_placement_attempts").forGetter($$0 -> $$0.c))).apply((Applicative)$$02, doj::new));
    private final bdc b;
    private final int c;

    public doj(bdc $$0, bdc $$1, bdc $$2, int $$3) {
        super($$0, $$1);
        this.b = $$2;
        this.c = $$3;
    }

    @Override
    protected dof<?> a() {
        return dof.j;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        gu $$9 = $$5.a();
        gu.a $$10 = $$9.j();
        for (int $$11 = 0; $$11 < this.c; ++$$11) {
            $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
            doj.a($$0, $$1, $$2, $$3, $$10);
        }
    }

    @Override
    public int a(apf $$0, int $$1, dno $$2) {
        return this.b.a($$0);
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return false;
    }
}

