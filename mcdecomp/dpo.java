/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class dpo
extends dpw {
    public static final Codec<dpo> a = RecordCodecBuilder.create($$02 -> dpo.a($$02).and($$02.group((App)aoi.j.optionalFieldOf("min_height_for_leaves", (Object)1).forGetter($$0 -> $$0.b), (App)bdc.b(1, 64).fieldOf("bend_length").forGetter($$0 -> $$0.h))).apply((Applicative)$$02, dpo::new));
    private final int b;
    private final bdc h;

    public dpo(int $$0, int $$1, int $$2, int $$3, bdc $$4) {
        super($$0, $$1, $$2);
        this.b = $$3;
        this.h = $$4;
    }

    @Override
    protected dpx<?> a() {
        return dpx.g;
    }

    @Override
    public List<doe.a> a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, int $$3, gu $$4, dno $$5) {
        ha $$6 = ha.c.a.a($$2);
        int $$7 = $$3 - 1;
        gu.a $$8 = $$4.j();
        gu $$9 = $$8.d();
        dpo.a($$0, $$1, $$2, $$9, $$5);
        ArrayList $$10 = Lists.newArrayList();
        for (int $$11 = 0; $$11 <= $$7; ++$$11) {
            if ($$11 + 1 >= $$7 + $$2.a(2)) {
                $$8.c($$6);
            }
            if (dma.c($$0, $$8)) {
                this.b($$0, $$1, $$2, $$8, $$5);
            }
            if ($$11 >= this.b) {
                $$10.add(new doe.a($$8.i(), 0, false));
            }
            $$8.c(ha.b);
        }
        int $$12 = this.h.a($$2);
        for (int $$13 = 0; $$13 <= $$12; ++$$13) {
            if (dma.c($$0, $$8)) {
                this.b($$0, $$1, $$2, $$8, $$5);
            }
            $$10.add(new doe.a($$8.i(), 0, false));
            $$8.c($$6);
        }
        return $$10;
    }
}

