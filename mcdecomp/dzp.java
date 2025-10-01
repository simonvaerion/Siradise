/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.lang.invoke.TypeDescriptor;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dzp<T> {
    private static final Logger d = LogUtils.getLogger();
    public static final dzp<eck> a = new dzp(dzh.a().create(), dzp.a(eck.class, dzn::a), "predicates", dzp.d());
    public static final dzp<eaz> b = new dzp(dzh.b().create(), dzp.a(eaz.class, dzn::a), "item_modifiers", dzp.d());
    public static final dzp<dzs> c = new dzp<dzs>(dzh.c().create(), dzp.a(dzs.class), "loot_tables", dzp.e());
    private final Gson e;
    private final BiFunction<acq, JsonElement, Optional<T>> f;
    private final String g;
    private final a<T> h;

    private dzp(Gson $$0, BiFunction<Gson, String, BiFunction<acq, JsonElement, Optional<T>>> $$1, String $$2, a<T> $$3) {
        this.e = $$0;
        this.g = $$2;
        this.h = $$3;
        this.f = $$1.apply($$0, $$2);
    }

    public Gson a() {
        return this.e;
    }

    public String b() {
        return this.g;
    }

    public void a(dzv $$0, dzm<T> $$1, T $$2) {
        this.h.run($$0, $$1, $$2);
    }

    public Optional<T> a(acq $$0, JsonElement $$1) {
        return this.f.apply($$0, $$1);
    }

    public static Stream<dzp<?>> c() {
        return Stream.of(a, b, c);
    }

    private static <T> BiFunction<Gson, String, BiFunction<acq, JsonElement, Optional<T>>> a(Class<T> $$0) {
        return ($$1, $$2) -> ($$3, $$4) -> {
            try {
                return Optional.of($$1.fromJson($$4, $$0));
            }
            catch (Exception $$5) {
                d.error("Couldn't parse element {}:{}", new Object[]{$$2, $$3, $$5});
                return Optional.empty();
            }
        };
    }

    private static <T> BiFunction<Gson, String, BiFunction<acq, JsonElement, Optional<T>>> a(Class<T> $$0, Function<T[], T> $$1) {
        TypeDescriptor.OfField $$2 = $$0.arrayType();
        return (arg_0, arg_1) -> dzp.a((Class)$$2, $$1, $$0, arg_0, arg_1);
    }

    private static <T extends dzl> a<T> d() {
        return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().g + ":" + $$1.b() + "}", $$1));
    }

    private static a<dzs> e() {
        return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().g + ":" + $$1.b() + "}", $$1));
    }

    private static /* synthetic */ BiFunction a(Class $$0, Function $$1, Class $$2, Gson $$3, String $$4) {
        return ($$5, $$6) -> {
            try {
                if ($$6.isJsonArray()) {
                    Object[] $$7 = (Object[])$$3.fromJson($$6, $$0);
                    return Optional.of($$1.apply($$7));
                }
                return Optional.of($$3.fromJson($$6, $$2));
            }
            catch (Exception $$8) {
                d.error("Couldn't parse element {}:{}", new Object[]{$$4, $$5, $$8});
                return Optional.empty();
            }
        };
    }

    @FunctionalInterface
    public static interface a<T> {
        public void run(dzv var1, dzm<T> var2, T var3);
    }
}

