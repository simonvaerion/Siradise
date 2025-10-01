/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface abz<T> {
    public void a(sf var1, T var2);

    public T a(sf var1);

    default public aby<T> a(int $$0) {
        return new aby($$0, this);
    }

    public T a(T var1);

    public static <T> abz<T> a(final sf.b<T> $$0, final sf.a<T> $$1) {
        return new a<T>(){

            @Override
            public void a(sf $$02, T $$12) {
                $$0.accept($$02, $$12);
            }

            @Override
            public T a(sf $$02) {
                return $$1.apply($$02);
            }
        };
    }

    public static <T> abz<Optional<T>> b(sf.b<T> $$0, sf.a<T> $$1) {
        return abz.a($$0.asOptional(), $$1.asOptional());
    }

    public static <T extends Enum<T>> abz<T> a(Class<T> $$0) {
        return abz.a(sf::a, $$1 -> $$1.b($$0));
    }

    public static <T> abz<T> a(hj<T> $$0) {
        return abz.a(($$1, $$2) -> $$1.a($$0, $$2), $$1 -> $$1.a($$0));
    }

    public static interface a<T>
    extends abz<T> {
        @Override
        default public T a(T $$0) {
            return $$0;
        }
    }
}

