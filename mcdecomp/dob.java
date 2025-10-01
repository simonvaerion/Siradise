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

public class dob
extends doe {
    public static final Codec<dob> a = RecordCodecBuilder.create($$02 -> dob.b($$02).and($$02.group((App)bdc.b(4, 16).fieldOf("height").forGetter($$0 -> $$0.b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("wide_bottom_layer_hole_chance").forGetter($$0 -> Float.valueOf($$0.c)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("corner_hole_chance").forGetter($$0 -> Float.valueOf($$0.c)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("hanging_leaves_chance").forGetter($$0 -> Float.valueOf($$0.h)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("hanging_leaves_extension_chance").forGetter($$0 -> Float.valueOf($$0.i)))).apply((Applicative)$$02, dob::new));
    private final bdc b;
    private final float c;
    private final float g;
    private final float h;
    private final float i;

    public dob(bdc $$0, bdc $$1, bdc $$2, float $$3, float $$4, float $$5, float $$6) {
        super($$0, $$1);
        this.b = $$2;
        this.c = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
    }

    @Override
    protected dof<?> a() {
        return dof.k;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        boolean $$9 = $$5.c();
        gu $$10 = $$5.a().b($$8);
        int $$11 = $$7 + $$5.b() - 1;
        this.a($$0, $$1, $$2, $$3, $$10, $$11 - 2, $$6 - 3, $$9);
        this.a($$0, $$1, $$2, $$3, $$10, $$11 - 1, $$6 - 4, $$9);
        for (int $$12 = $$6 - 5; $$12 >= 0; --$$12) {
            this.a($$0, $$1, $$2, $$3, $$10, $$11, $$12, $$9);
        }
        this.a($$0, $$1, $$2, $$3, $$10, $$11, -1, $$9, this.h, this.i);
        this.a($$0, $$1, $$2, $$3, $$10, $$11 - 1, -2, $$9, this.h, this.i);
    }

    @Override
    public int a(apf $$0, int $$1, dno $$2) {
        return this.b.a($$0);
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        boolean $$7;
        if ($$2 == -1 && ($$1 == $$4 || $$3 == $$4) && $$0.i() < this.c) {
            return true;
        }
        boolean $$6 = $$1 == $$4 && $$3 == $$4;
        boolean bl2 = $$7 = $$4 > 2;
        if ($$7) {
            return $$6 || $$1 + $$3 > $$4 * 2 - 2 && $$0.i() < this.g;
        }
        return $$6 && $$0.i() < this.g;
    }
}

