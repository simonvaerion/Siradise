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

public class dpv
extends dpw {
    public static final Codec<dpv> a = RecordCodecBuilder.create($$0 -> dpv.a($$0).apply((Applicative)$$0, dpv::new));

    public dpv(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected dpx<?> a() {
        return dpx.a;
    }

    @Override
    public List<doe.a> a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, int $$3, gu $$4, dno $$5) {
        dpv.a($$0, $$1, $$2, $$4.d(), $$5);
        for (int $$6 = 0; $$6 < $$3; ++$$6) {
            this.b($$0, $$1, $$2, $$4.b($$6), $$5);
        }
        return ImmutableList.of((Object)new doe.a($$4.b($$3), 0, false));
    }
}

