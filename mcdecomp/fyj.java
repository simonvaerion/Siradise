/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public interface fyj<T> {
    public static <T> fyj<T> a() {
        return new fyj<T>(){

            @Override
            public List<T> a(String $$0) {
                return List.of();
            }

            @Override
            public List<T> b(String $$0) {
                return List.of();
            }
        };
    }

    public static <T> fyj<T> a(List<T> $$0, Function<T, Stream<acq>> $$1) {
        if ($$0.isEmpty()) {
            return fyj.a();
        }
        final fym $$2 = new fym();
        final fym $$32 = new fym();
        for (Object $$4 : $$0) {
            $$1.apply($$4).forEach($$3 -> {
                $$2.a($$4, $$3.b().toLowerCase(Locale.ROOT));
                $$32.a($$4, $$3.a().toLowerCase(Locale.ROOT));
            });
        }
        $$2.a();
        $$32.a();
        return new fyj<T>(){

            @Override
            public List<T> a(String $$0) {
                return $$2.a($$0);
            }

            @Override
            public List<T> b(String $$0) {
                return $$32.a($$0);
            }
        };
    }

    public List<T> a(String var1);

    public List<T> b(String var1);
}

