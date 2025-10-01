/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bch<E>
extends bcl<bcj.b<E>> {
    public static <E> Codec<bch<E>> a(Codec<E> $$0) {
        return bcj.b.a($$0).listOf().xmap(bch::new, bcl::e);
    }

    public static <E> Codec<bch<E>> b(Codec<E> $$0) {
        return aoi.a(bcj.b.a($$0).listOf()).xmap(bch::new, bcl::e);
    }

    bch(List<? extends bcj.b<E>> $$0) {
        super($$0);
    }

    public static <E> a<E> a() {
        return new a();
    }

    public static <E> bch<E> b() {
        return new bch<E>(List.of());
    }

    public static <E> bch<E> a(E $$0) {
        return new bch<E>(List.of(bcj.a($$0, 1)));
    }

    public Optional<E> a(apf $$0) {
        return this.b($$0).map(bcj.b::b);
    }

    public static class a<E> {
        private final ImmutableList.Builder<bcj.b<E>> a = ImmutableList.builder();

        public a<E> a(E $$0, int $$1) {
            this.a.add(bcj.a($$0, $$1));
            return this;
        }

        public bch<E> a() {
            return new bch(this.a.build());
        }
    }
}

