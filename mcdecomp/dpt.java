/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dpt
extends dpw {
    public static final Codec<dpt> a = RecordCodecBuilder.create($$0 -> dpt.a($$0).apply((Applicative)$$0, dpt::new));

    public dpt(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected dpx<?> a() {
        return dpx.c;
    }

    @Override
    public List<doe.a> a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, int $$3, gu $$4, dno $$5) {
        gu $$6 = $$4.d();
        dpt.a($$0, $$1, $$2, $$6, $$5);
        dpt.a($$0, $$1, $$2, $$6.h(), $$5);
        dpt.a($$0, $$1, $$2, $$6.f(), $$5);
        dpt.a($$0, $$1, $$2, $$6.f().h(), $$5);
        gu.a $$7 = new gu.a();
        for (int $$8 = 0; $$8 < $$3; ++$$8) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
            if ($$8 >= $$3 - 1) continue;
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
        }
        return ImmutableList.of((Object)new doe.a($$4.b($$3), 0, true));
    }

    private void a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, gu.a $$3, dno $$4, gu $$5, int $$6, int $$7, int $$8) {
        $$3.a($$5, $$6, $$7, $$8);
        this.a($$0, $$1, $$2, $$3, $$4);
    }
}

