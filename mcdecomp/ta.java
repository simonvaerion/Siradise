/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface ta {
    public static final Optional<apz> a = Optional.of(apz.a);
    public static final ta b = new ta(){

        @Override
        public <T> Optional<T> a(a<T> $$0) {
            return Optional.empty();
        }

        @Override
        public <T> Optional<T> a(b<T> $$0, ts $$1) {
            return Optional.empty();
        }
    };

    public <T> Optional<T> a(a<T> var1);

    public <T> Optional<T> a(b<T> var1, ts var2);

    public static ta e(final String $$0) {
        return new ta(){

            @Override
            public <T> Optional<T> a(a<T> $$02) {
                return $$02.accept($$0);
            }

            @Override
            public <T> Optional<T> a(b<T> $$02, ts $$1) {
                return $$02.accept($$1, $$0);
            }
        };
    }

    public static ta a(final String $$0, final ts $$1) {
        return new ta(){

            @Override
            public <T> Optional<T> a(a<T> $$02) {
                return $$02.accept($$0);
            }

            @Override
            public <T> Optional<T> a(b<T> $$02, ts $$12) {
                return $$02.accept($$1.a($$12), $$0);
            }
        };
    }

    public static ta a(ta ... $$0) {
        return ta.a((List<? extends ta>)ImmutableList.copyOf((Object[])$$0));
    }

    public static ta a(final List<? extends ta> $$0) {
        return new ta(){

            @Override
            public <T> Optional<T> a(a<T> $$02) {
                for (ta $$1 : $$0) {
                    Optional<T> $$2 = $$1.a($$02);
                    if (!$$2.isPresent()) continue;
                    return $$2;
                }
                return Optional.empty();
            }

            @Override
            public <T> Optional<T> a(b<T> $$02, ts $$1) {
                for (ta $$2 : $$0) {
                    Optional<T> $$3 = $$2.a($$02, $$1);
                    if (!$$3.isPresent()) continue;
                    return $$3;
                }
                return Optional.empty();
            }
        };
    }

    default public String getString() {
        StringBuilder $$0 = new StringBuilder();
        this.a($$1 -> {
            $$0.append($$1);
            return Optional.empty();
        });
        return $$0.toString();
    }

    public static interface a<T> {
        public Optional<T> accept(String var1);
    }

    public static interface b<T> {
        public Optional<T> accept(ts var1, String var2);
    }
}

