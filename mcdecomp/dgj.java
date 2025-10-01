/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class dgj
implements dgp {
    public static final Codec<dgj> a = RecordCodecBuilder.create($$02 -> $$02.group((App)hy.a.fieldOf("source_entity").forGetter(dgj::b), (App)Codec.FLOAT.fieldOf("y_offset").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, ($$0, $$1) -> new dgj((Either<bfj, Either<UUID, Integer>>)Either.right((Object)Either.left((Object)$$0)), $$1.floatValue())));
    private Either<bfj, Either<UUID, Integer>> c;
    final float d;

    public dgj(bfj $$0, float $$1) {
        this((Either<bfj, Either<UUID, Integer>>)Either.left((Object)$$0), $$1);
    }

    dgj(Either<bfj, Either<UUID, Integer>> $$0, float $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public Optional<eei> a(cmm $$02) {
        if (this.c.left().isEmpty()) {
            this.b($$02);
        }
        return this.c.left().map($$0 -> $$0.dg().b(0.0, this.d, 0.0));
    }

    private void b(cmm $$02) {
        ((Optional)this.c.map(Optional::of, $$12 -> Optional.ofNullable((bfj)$$12.map($$1 -> {
            bfj bfj2;
            if ($$02 instanceof aif) {
                aif $$2 = (aif)$$02;
                bfj2 = $$2.a((UUID)$$1);
            } else {
                bfj2 = null;
            }
            return bfj2;
        }, $$02::a)))).ifPresent($$0 -> {
            this.c = Either.left((Object)$$0);
        });
    }

    private UUID b() {
        return (UUID)this.c.map(bfj::ct, $$02 -> (UUID)$$02.map(Function.identity(), $$0 -> {
            throw new RuntimeException("Unable to get entityId from uuid");
        }));
    }

    int c() {
        return (Integer)this.c.map(bfj::af, $$02 -> (Integer)$$02.map($$0 -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
        }, Function.identity()));
    }

    @Override
    public dgq<?> a() {
        return dgq.b;
    }

    public static class a
    implements dgq<dgj> {
        public dgj a(sf $$0) {
            return new dgj((Either<bfj, Either<UUID, Integer>>)Either.right((Object)Either.right((Object)$$0.m())), $$0.readFloat());
        }

        @Override
        public void a(sf $$0, dgj $$1) {
            $$0.d($$1.c());
            $$0.writeFloat($$1.d);
        }

        @Override
        public Codec<dgj> a() {
            return a;
        }

        @Override
        public /* synthetic */ dgp b(sf sf2) {
            return this.a(sf2);
        }
    }
}

