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

public class doc
extends doe {
    public static final Codec<doc> a = RecordCodecBuilder.create($$0 -> doc.b($$0).apply((Applicative)$$0, doc::new));

    public doc(bdc $$0, bdc $$1) {
        super($$0, $$1);
    }

    @Override
    protected dof<?> a() {
        return dof.i;
    }

    @Override
    protected void a(cms $$0, doe.b $$1, apf $$2, dno $$3, int $$4, doe.a $$5, int $$6, int $$7, int $$8) {
        gu $$9 = $$5.a().b($$8);
        boolean $$10 = $$5.c();
        if ($$10) {
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, -1, $$10);
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 3, 0, $$10);
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, 1, $$10);
            if ($$2.h()) {
                this.a($$0, $$1, $$2, $$3, $$9, $$7, 2, $$10);
            }
        } else {
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, -1, $$10);
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 1, 0, $$10);
        }
    }

    @Override
    public int a(apf $$0, int $$1, dno $$2) {
        return 4;
    }

    @Override
    protected boolean b(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if (!($$2 != 0 || !$$5 || $$1 != -$$4 && $$1 < $$4 || $$3 != -$$4 && $$3 < $$4)) {
            return true;
        }
        return super.b($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected boolean a(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if ($$2 == -1 && !$$5) {
            return $$1 == $$4 && $$3 == $$4;
        }
        if ($$2 == 1) {
            return $$1 + $$3 > $$4 * 2 - 2;
        }
        return false;
    }
}

