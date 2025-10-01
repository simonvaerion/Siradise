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
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
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
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Function;
import javax.annotation.Nullable;

public class di {
    public static final di a = new di(null, null);
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)sw.c("argument.range.ints"));
    @Nullable
    private final Float c;
    @Nullable
    private final Float d;

    public di(@Nullable Float $$0, @Nullable Float $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public static di a(float $$0) {
        return new di(Float.valueOf($$0), Float.valueOf($$0));
    }

    public static di a(float $$0, float $$1) {
        return new di(Float.valueOf($$0), Float.valueOf($$1));
    }

    public static di b(float $$0) {
        return new di(Float.valueOf($$0), null);
    }

    public static di c(float $$0) {
        return new di(null, Float.valueOf($$0));
    }

    public boolean d(float $$0) {
        if (this.c != null && this.d != null && this.c.floatValue() > this.d.floatValue() && this.c.floatValue() > $$0 && this.d.floatValue() < $$0) {
            return false;
        }
        if (this.c != null && this.c.floatValue() > $$0) {
            return false;
        }
        return this.d == null || !(this.d.floatValue() < $$0);
    }

    public boolean a(double $$0) {
        if (this.c != null && this.d != null && this.c.floatValue() > this.d.floatValue() && (double)(this.c.floatValue() * this.c.floatValue()) > $$0 && (double)(this.d.floatValue() * this.d.floatValue()) < $$0) {
            return false;
        }
        if (this.c != null && (double)(this.c.floatValue() * this.c.floatValue()) > $$0) {
            return false;
        }
        return this.d == null || !((double)(this.d.floatValue() * this.d.floatValue()) < $$0);
    }

    @Nullable
    public Float a() {
        return this.c;
    }

    @Nullable
    public Float b() {
        return this.d;
    }

    public JsonElement c() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        if (this.c != null && this.d != null && this.c.equals(this.d)) {
            return new JsonPrimitive((Number)this.c);
        }
        JsonObject $$0 = new JsonObject();
        if (this.c != null) {
            $$0.addProperty("min", (Number)this.c);
        }
        if (this.d != null) {
            $$0.addProperty("max", (Number)this.c);
        }
        return $$0;
    }

    public static di a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        if (aor.b($$0)) {
            float $$1 = aor.e($$0, "value");
            return new di(Float.valueOf($$1), Float.valueOf($$1));
        }
        JsonObject $$2 = aor.m($$0, "value");
        Float $$3 = $$2.has("min") ? Float.valueOf(aor.m($$2, "min")) : null;
        Float $$4 = $$2.has("max") ? Float.valueOf(aor.m($$2, "max")) : null;
        return new di($$3, $$4);
    }

    public static di a(StringReader $$02, boolean $$1) throws CommandSyntaxException {
        return di.a($$02, $$1, $$0 -> $$0);
    }

    public static di a(StringReader $$0, boolean $$1, Function<Float, Float> $$2) throws CommandSyntaxException {
        Float $$6;
        if (!$$0.canRead()) {
            throw cj.a.createWithContext((ImmutableStringReader)$$0);
        }
        int $$3 = $$0.getCursor();
        Float $$4 = di.a(di.b($$0, $$1), $$2);
        if ($$0.canRead(2) && $$0.peek() == '.' && $$0.peek(1) == '.') {
            $$0.skip();
            $$0.skip();
            Float $$5 = di.a(di.b($$0, $$1), $$2);
            if ($$4 == null && $$5 == null) {
                $$0.setCursor($$3);
                throw cj.a.createWithContext((ImmutableStringReader)$$0);
            }
        } else {
            if (!$$1 && $$0.canRead() && $$0.peek() == '.') {
                $$0.setCursor($$3);
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            $$6 = $$4;
        }
        if ($$4 == null && $$6 == null) {
            $$0.setCursor($$3);
            throw cj.a.createWithContext((ImmutableStringReader)$$0);
        }
        return new di($$4, $$6);
    }

    @Nullable
    private static Float b(StringReader $$0, boolean $$1) throws CommandSyntaxException {
        int $$2 = $$0.getCursor();
        while ($$0.canRead() && di.c($$0, $$1)) {
            $$0.skip();
        }
        String $$3 = $$0.getString().substring($$2, $$0.getCursor());
        if ($$3.isEmpty()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat($$3));
        }
        catch (NumberFormatException $$4) {
            if ($$1) {
                throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext((ImmutableStringReader)$$0, (Object)$$3);
            }
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext((ImmutableStringReader)$$0, (Object)$$3);
        }
    }

    private static boolean c(StringReader $$0, boolean $$1) {
        char $$2 = $$0.peek();
        if ($$2 >= '0' && $$2 <= '9' || $$2 == '-') {
            return true;
        }
        if ($$1 && $$2 == '.') {
            return !$$0.canRead(2) || $$0.peek(1) != '.';
        }
        return false;
    }

    @Nullable
    private static Float a(@Nullable Float $$0, Function<Float, Float> $$1) {
        return $$0 == null ? null : $$1.apply($$0);
    }
}

