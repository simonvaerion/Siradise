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

public class dog
extends doe {
    public static final Codec<dog> a = RecordCodecBuilder.create($$02 -> dog.b($$02).and((App)Codec.intRange((int)0, (int)16).fieldOf("height").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, dog::new));
    protected final int b;

    public dog(bdc $$0, bdc $$1, int $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected dof<?> a() {
        return dof.g;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        int $$9 = $$5.c() ? $$6 : 1 + $$2.a(2);
        for (int $$10 = $$8; $$10 >= $$8 - $$9; --$$10) {
            int $$11 = $$7 + $$5.b() + 1 - $$10;
            this.a($$0, $$1, $$2, $$3, $$5.a(), $$11, $$10, $$5.c());
        }
    }

    @Override
    public int a(apf $$0, int $$1, dno $$2) {
        return this.b;
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if ($$1 + $$3 >= 7) {
            return true;
        }
        return $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
    }
}

