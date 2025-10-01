/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cj<T extends Number> {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)sw.c("argument.range.empty"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("argument.range.swapped"));
    @Nullable
    protected final T c;
    @Nullable
    protected final T d;

    protected cj(@Nullable T $$0, @Nullable T $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Nullable
    public T a() {
        return this.c;
    }

    @Nullable
    public T b() {
        return this.d;
    }

    public boolean c() {
        return this.c == null && this.d == null;
    }

    public JsonElement d() {
        if (this.c()) {
            return JsonNull.INSTANCE;
        }
        if (this.c != null && this.c.equals(this.d)) {
            return new JsonPrimitive(this.c);
        }
        JsonObject $$0 = new JsonObject();
        if (this.c != null) {
            $$0.addProperty("min", this.c);
        }
        if (this.d != null) {
            $$0.addProperty("max", this.d);
        }
        return $$0;
    }

    protected static <T extends Number, R extends cj<T>> R a(@Nullable JsonElement $$0, R $$1, BiFunction<JsonElement, String, T> $$2, a<T, R> $$3) {
        if ($$0 == null || $$0.isJsonNull()) {
            return $$1;
        }
        if (aor.b($$0)) {
            Number $$4 = (Number)$$2.apply($$0, "value");
            return $$3.create($$4, $$4);
        }
        JsonObject $$5 = aor.m($$0, "value");
        Number $$6 = $$5.has("min") ? (Number)((Number)$$2.apply($$5.get("min"), "min")) : (Number)null;
        Number $$7 = $$5.has("max") ? (Number)((Number)$$2.apply($$5.get("max"), "max")) : (Number)null;
        return $$3.create($$6, $$7);
    }

    protected static <T extends Number, R extends cj<T>> R a(StringReader $$0, b<T, R> $$1, Function<String, T> $$2, Supplier<DynamicCommandExceptionType> $$3, Function<T, T> $$4) throws CommandSyntaxException {
        if (!$$0.canRead()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        int $$5 = $$0.getCursor();
        try {
            Number $$8;
            Number $$6 = (Number)cj.a(cj.a($$0, $$2, $$3), $$4);
            if ($$0.canRead(2) && $$0.peek() == '.' && $$0.peek(1) == '.') {
                $$0.skip();
                $$0.skip();
                Number $$7 = (Number)cj.a(cj.a($$0, $$2, $$3), $$4);
                if ($$6 == null && $$7 == null) {
                    throw a.createWithContext((ImmutableStringReader)$$0);
                }
            } else {
                $$8 = $$6;
            }
            if ($$6 == null && $$8 == null) {
                throw a.createWithContext((ImmutableStringReader)$$0);
            }
            return $$1.create($$0, $$6, $$8);
        }
        catch (CommandSyntaxException $$9) {
            $$0.setCursor($$5);
            throw new CommandSyntaxException($$9.getType(), $$9.getRawMessage(), $$9.getInput(), $$5);
        }
    }

    @Nullable
    private static <T extends Number> T a(StringReader $$0, Function<String, T> $$1, Supplier<DynamicCommandExceptionType> $$2) throws CommandSyntaxException {
        int $$3 = $$0.getCursor();
        while ($$0.canRead() && cj.a($$0)) {
            $$0.skip();
        }
        String $$4 = $$0.getString().substring($$3, $$0.getCursor());
        if ($$4.isEmpty()) {
            return null;
        }
        try {
            return (T)((Number)$$1.apply($$4));
        }
        catch (NumberFormatException $$5) {
            throw $$2.get().createWithContext((ImmutableStringReader)$$0, (Object)$$4);
        }
    }

    private static boolean a(StringReader $$0) {
        char $$1 = $$0.peek();
        if ($$1 >= '0' && $$1 <= '9' || $$1 == '-') {
            return true;
        }
        if ($$1 == '.') {
            return !$$0.canRead(2) || $$0.peek(1) != '.';
        }
        return false;
    }

    @Nullable
    private static <T> T a(@Nullable T $$0, Function<T, T> $$1) {
        return $$0 == null ? null : (T)$$1.apply($$0);
    }

    @FunctionalInterface
    protected static interface a<T extends Number, R extends cj<T>> {
        public R create(@Nullable T var1, @Nullable T var2);
    }

    @FunctionalInterface
    protected static interface b<T extends Number, R extends cj<T>> {
        public R create(StringReader var1, @Nullable T var2, @Nullable T var3) throws CommandSyntaxException;
    }

    public static class c
    extends cj<Double> {
        public static final c e = new c(null, null);
        @Nullable
        private final Double f;
        @Nullable
        private final Double g;

        private static c a(StringReader $$0, @Nullable Double $$1, @Nullable Double $$2) throws CommandSyntaxException {
            if ($$1 != null && $$2 != null && $$1 > $$2) {
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            return new c($$1, $$2);
        }

        @Nullable
        private static Double a(@Nullable Double $$0) {
            return $$0 == null ? null : Double.valueOf($$0 * $$0);
        }

        private c(@Nullable Double $$0, @Nullable Double $$1) {
            super($$0, $$1);
            this.f = cj$c.a($$0);
            this.g = cj$c.a($$1);
        }

        public static c a(double $$0) {
            return new c($$0, $$0);
        }

        public static c a(double $$0, double $$1) {
            return new c($$0, $$1);
        }

        public static c b(double $$0) {
            return new c($$0, null);
        }

        public static c c(double $$0) {
            return new c(null, $$0);
        }

        public boolean d(double $$0) {
            if (this.c != null && (Double)this.c > $$0) {
                return false;
            }
            return this.d == null || !((Double)this.d < $$0);
        }

        public boolean e(double $$0) {
            if (this.f != null && this.f > $$0) {
                return false;
            }
            return this.g == null || !(this.g < $$0);
        }

        public static c a(@Nullable JsonElement $$0) {
            return cj$c.a($$0, e, aor::d, c::new);
        }

        public static c a(StringReader $$02) throws CommandSyntaxException {
            return cj$c.a($$02, (Double $$0) -> $$0);
        }

        public static c a(StringReader $$0, Function<Double, Double> $$1) throws CommandSyntaxException {
            return cj$c.a($$0, c::a, Double::parseDouble, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidDouble(), $$1);
        }
    }

    public static class d
    extends cj<Integer> {
        public static final d e = new d(null, null);
        @Nullable
        private final Long f;
        @Nullable
        private final Long g;

        private static d a(StringReader $$0, @Nullable Integer $$1, @Nullable Integer $$2) throws CommandSyntaxException {
            if ($$1 != null && $$2 != null && $$1 > $$2) {
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            return new d($$1, $$2);
        }

        @Nullable
        private static Long a(@Nullable Integer $$0) {
            return $$0 == null ? null : Long.valueOf($$0.longValue() * $$0.longValue());
        }

        private d(@Nullable Integer $$0, @Nullable Integer $$1) {
            super($$0, $$1);
            this.f = cj$d.a($$0);
            this.g = cj$d.a($$1);
        }

        public static d a(int $$0) {
            return new d($$0, $$0);
        }

        public static d a(int $$0, int $$1) {
            return new d($$0, $$1);
        }

        public static d b(int $$0) {
            return new d($$0, null);
        }

        public static d c(int $$0) {
            return new d(null, $$0);
        }

        public boolean d(int $$0) {
            if (this.c != null && (Integer)this.c > $$0) {
                return false;
            }
            return this.d == null || (Integer)this.d >= $$0;
        }

        public boolean a(long $$0) {
            if (this.f != null && this.f > $$0) {
                return false;
            }
            return this.g == null || this.g >= $$0;
        }

        public static d a(@Nullable JsonElement $$0) {
            return cj$d.a($$0, e, aor::g, d::new);
        }

        public static d a(StringReader $$02) throws CommandSyntaxException {
            return cj$d.a($$02, (Integer $$0) -> $$0);
        }

        public static d a(StringReader $$0, Function<Integer, Integer> $$1) throws CommandSyntaxException {
            return cj$d.a($$0, d::a, Integer::parseInt, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidInt(), $$1);
        }
    }
}

