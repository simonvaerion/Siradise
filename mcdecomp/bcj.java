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

public interface bcj {
    public bci a();

    public static <T> b<T> a(T $$0, int $$1) {
        return new b<T>($$0, bci.a($$1));
    }

    public static class b<T>
    implements bcj {
        private final T a;
        private final bci b;

        b(T $$0, bci $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public T b() {
            return this.a;
        }

        @Override
        public bci a() {
            return this.b;
        }

        public static <E> Codec<b<E>> a(Codec<E> $$0) {
            return RecordCodecBuilder.create($$1 -> $$1.group((App)$$0.fieldOf("data").forGetter(b::b), (App)bci.a.fieldOf("weight").forGetter(b::a)).apply((Applicative)$$1, b::new));
        }
    }

    public static class a
    implements bcj {
        private final bci a;

        public a(int $$0) {
            this.a = bci.a($$0);
        }

        public a(bci $$0) {
            this.a = $$0;
        }

        @Override
        public bci a() {
            return this.a;
        }
    }
}

