/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fzo {
    final Map<fzn<?>, Object> a;

    fzo(Map<fzn<?>, Object> $$0) {
        this.a = $$0;
    }

    public static a a() {
        return new a();
    }

    public static Codec<fzo> a(final List<fzn<?>> $$0) {
        return new MapCodec<fzo>(){

            public <T> RecordBuilder<T> a(fzo $$02, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
                RecordBuilder<T> $$3 = $$2;
                for (fzn $$4 : $$0) {
                    $$3 = this.a($$02, $$3, $$4);
                }
                return $$3;
            }

            private <T, V> RecordBuilder<T> a(fzo $$02, RecordBuilder<T> $$1, fzn<V> $$2) {
                V $$3 = $$02.a($$2);
                if ($$3 != null) {
                    return $$1.add($$2.b(), $$3, $$2.d());
                }
                return $$1;
            }

            public <T> DataResult<fzo> decode(DynamicOps<T> $$02, MapLike<T> $$1) {
                DataResult<a> $$2 = DataResult.success((Object)new a());
                for (fzn $$3 : $$0) {
                    $$2 = this.a($$2, $$02, $$1, $$3);
                }
                return $$2.map(a::a);
            }

            private <T, V> DataResult<a> a(DataResult<a> $$02, DynamicOps<T> $$12, MapLike<T> $$22, fzn<V> $$3) {
                Object $$4 = $$22.get($$3.b());
                if ($$4 != null) {
                    DataResult $$5 = $$3.d().parse($$12, $$4);
                    return $$02.apply2stable(($$1, $$2) -> $$1.a($$3, $$2), $$5);
                }
                return $$02;
            }

            public <T> Stream<T> keys(DynamicOps<T> $$02) {
                return $$0.stream().map(fzn::b).map(arg_0 -> $$02.createString(arg_0));
            }

            public /* synthetic */ RecordBuilder encode(Object object, DynamicOps dynamicOps, RecordBuilder recordBuilder) {
                return this.a((fzo)object, dynamicOps, recordBuilder);
            }
        }.codec();
    }

    @Nullable
    public <T> T a(fzn<T> $$0) {
        return (T)this.a.get($$0);
    }

    public String toString() {
        return this.a.toString();
    }

    public Set<fzn<?>> b() {
        return this.a.keySet();
    }

    public static class a {
        private final Map<fzn<?>, Object> a = new Reference2ObjectOpenHashMap();

        a() {
        }

        public <T> a a(fzn<T> $$0, T $$1) {
            this.a.put($$0, $$1);
            return this;
        }

        public <T> a b(fzn<T> $$0, @Nullable T $$1) {
            if ($$1 != null) {
                this.a.put($$0, $$1);
            }
            return this;
        }

        public a a(fzo $$0) {
            this.a.putAll($$0.a);
            return this;
        }

        public fzo a() {
            return new fzo(this.a);
        }
    }
}

