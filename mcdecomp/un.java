/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 */
import io.netty.util.AttributeKey;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface un {
    public static final AttributeKey<b> a = AttributeKey.valueOf((String)"bundler");
    public static final int b = 4096;
    public static final un c = new un(){

        @Override
        public void a(uo<?> $$0, Consumer<uo<?>> $$1) {
            $$1.accept($$0);
        }

        @Override
        @Nullable
        public a a(uo<?> $$0) {
            return null;
        }
    };

    public static <T extends sk, P extends um<T>> un a(final Class<P> $$0, final Function<Iterable<uo<T>>, P> $$1, final ul<T> $$2) {
        return new un(){

            @Override
            public void a(uo<?> $$02, Consumer<uo<?>> $$12) {
                if ($$02.getClass() == $$0) {
                    um $$22 = (um)$$02;
                    $$12.accept($$2);
                    $$22.a().forEach($$12);
                    $$12.accept($$2);
                } else {
                    $$12.accept($$02);
                }
            }

            @Override
            @Nullable
            public a a(uo<?> $$02) {
                if ($$02 == $$2) {
                    return new a(){
                        private final List<uo<T>> b = new ArrayList();

                        @Override
                        @Nullable
                        public uo<?> a(uo<?> $$0) {
                            if ($$0 == $$2) {
                                return (uo)$$1.apply(this.b);
                            }
                            uo<?> $$1 = $$0;
                            if (this.b.size() >= 4096) {
                                throw new IllegalStateException("Too many packets in a bundle");
                            }
                            this.b.add($$1);
                            return null;
                        }
                    };
                }
                return null;
            }
        };
    }

    public void a(uo<?> var1, Consumer<uo<?>> var2);

    @Nullable
    public a a(uo<?> var1);

    public static interface b {
        public un a(up var1);
    }

    public static interface a {
        @Nullable
        public uo<?> a(uo<?> var1);
    }
}

