/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public final class dgy {
    private static final BitSet c = new BitSet(0);
    private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
    private static final Codec<dec> e = jb.o.q().comapFlatMap($$0 -> $$0 == dec.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success((Object)$$0), Function.identity());
    public static final Codec<dgy> a = RecordCodecBuilder.create($$02 -> $$02.group((App)e.fieldOf("target_status").forGetter(dgy::a), (App)d.optionalFieldOf("missing_bedrock").forGetter($$0 -> $$0.h.isEmpty() ? Optional.empty() : Optional.of($$0.h))).apply((Applicative)$$02, dgy::new));
    private static final Set<acp<cnk>> f = Set.of(cnr.aa, cnr.Z);
    public static final cmo b = new cmo(){

        @Override
        public int D_() {
            return 64;
        }

        @Override
        public int C_() {
            return -64;
        }
    };
    private final dec g;
    private final BitSet h;

    private dgy(dec $$0, Optional<BitSet> $$1) {
        this.g = $$0;
        this.h = $$1.orElse(c);
    }

    @Nullable
    public static dgy a(qr $$0) {
        dec $$1 = dec.a($$0.l("target_status"));
        if ($$1 == dec.c) {
            return null;
        }
        return new dgy($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
    }

    public static void a(des $$0) {
        int $$12 = 4;
        gu.b(0, 0, 0, 15, 4, 15).forEach($$1 -> {
            if ($$0.a_((gu)$$1).a(cpo.F)) {
                $$0.a((gu)$$1, cpo.rI.n(), false);
            }
        });
    }

    public void b(des $$0) {
        cmo $$12 = $$0.z();
        int $$2 = $$12.C_();
        int $$3 = $$12.aj() - 1;
        for (int $$4 = 0; $$4 < 16; ++$$4) {
            for (int $$5 = 0; $$5 < 16; ++$$5) {
                if (!this.a($$4, $$5)) continue;
                gu.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1 -> $$0.a((gu)$$1, cpo.a.n(), false));
            }
        }
    }

    public dec a() {
        return this.g;
    }

    public boolean b() {
        return !this.h.isEmpty();
    }

    public boolean a(int $$0, int $$1) {
        return this.h.get(($$1 & 0xF) * 16 + ($$0 & 0xF));
    }

    public static cnn a(cnn $$0, ddx $$1) {
        if (!$$1.y()) {
            return $$0;
        }
        Predicate<acp> $$2 = f::contains;
        return ($$3, $$4, $$5, $$6) -> {
            he<cnk> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            if ($$7.a($$2)) {
                return $$7;
            }
            return $$1.getNoiseBiome($$3, 0, $$5);
        };
    }
}

