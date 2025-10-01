/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.reflect.Type;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class acq
implements Comparable<acq> {
    public static final Codec<acq> a = Codec.STRING.comapFlatMap(acq::b, acq::toString).stable();
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)sw.c("argument.id.invalid"));
    public static final char b = ':';
    public static final String c = "minecraft";
    public static final String d = "realms";
    private final String f;
    private final String g;

    protected acq(String $$0, String $$1, @Nullable a $$2) {
        this.f = $$0;
        this.g = $$1;
    }

    public acq(String $$0, String $$1) {
        this(acq.c($$0, $$1), acq.d($$0, $$1), null);
    }

    private acq(String[] $$0) {
        this($$0[0], $$0[1]);
    }

    public acq(String $$0) {
        this(acq.b($$0, ':'));
    }

    public static acq a(String $$0, char $$1) {
        return new acq(acq.b($$0, $$1));
    }

    @Nullable
    public static acq a(String $$0) {
        try {
            return new acq($$0);
        }
        catch (z $$1) {
            return null;
        }
    }

    @Nullable
    public static acq a(String $$0, String $$1) {
        try {
            return new acq($$0, $$1);
        }
        catch (z $$2) {
            return null;
        }
    }

    protected static String[] b(String $$0, char $$1) {
        String[] $$2 = new String[]{c, $$0};
        int $$3 = $$0.indexOf($$1);
        if ($$3 >= 0) {
            $$2[1] = $$0.substring($$3 + 1);
            if ($$3 >= 1) {
                $$2[0] = $$0.substring(0, $$3);
            }
        }
        return $$2;
    }

    public static DataResult<acq> b(String $$0) {
        try {
            return DataResult.success((Object)new acq($$0));
        }
        catch (z $$1) {
            return DataResult.error(() -> "Not a valid resource location: " + $$0 + " " + $$1.getMessage());
        }
    }

    public String a() {
        return this.g;
    }

    public String b() {
        return this.f;
    }

    public acq c(String $$0) {
        return new acq(this.f, acq.d(this.f, $$0), null);
    }

    public acq a(UnaryOperator<String> $$0) {
        return this.c((String)$$0.apply(this.g));
    }

    public acq d(String $$0) {
        return this.c($$0 + this.g);
    }

    public acq e(String $$0) {
        return this.c(this.g + $$0);
    }

    public String toString() {
        return this.f + ":" + this.g;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof acq) {
            acq $$1 = (acq)$$0;
            return this.f.equals($$1.f) && this.g.equals($$1.g);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.f.hashCode() + this.g.hashCode();
    }

    public int a(acq $$0) {
        int $$1 = this.g.compareTo($$0.g);
        if ($$1 == 0) {
            $$1 = this.f.compareTo($$0.f);
        }
        return $$1;
    }

    public String c() {
        return this.toString().replace('/', '_').replace(':', '_');
    }

    public String d() {
        return this.f + "." + this.g;
    }

    public String e() {
        return this.f.equals(c) ? this.g : this.d();
    }

    public String f(String $$0) {
        return $$0 + "." + this.d();
    }

    public String b(String $$0, String $$1) {
        return $$0 + "." + this.d() + "." + $$1;
    }

    public static acq a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        while ($$0.canRead() && acq.a($$0.peek())) {
            $$0.skip();
        }
        String $$2 = $$0.getString().substring($$1, $$0.getCursor());
        try {
            return new acq($$2);
        }
        catch (z $$3) {
            $$0.setCursor($$1);
            throw e.createWithContext((ImmutableStringReader)$$0);
        }
    }

    public static boolean a(char $$0) {
        return $$0 >= '0' && $$0 <= '9' || $$0 >= 'a' && $$0 <= 'z' || $$0 == '_' || $$0 == ':' || $$0 == '/' || $$0 == '.' || $$0 == '-';
    }

    private static boolean h(String $$0) {
        for (int $$1 = 0; $$1 < $$0.length(); ++$$1) {
            if (acq.b($$0.charAt($$1))) continue;
            return false;
        }
        return true;
    }

    private static boolean i(String $$0) {
        for (int $$1 = 0; $$1 < $$0.length(); ++$$1) {
            if (acq.c($$0.charAt($$1))) continue;
            return false;
        }
        return true;
    }

    private static String c(String $$0, String $$1) {
        if (!acq.i($$0)) {
            throw new z("Non [a-z0-9_.-] character in namespace of location: " + $$0 + ":" + $$1);
        }
        return $$0;
    }

    public static boolean b(char $$0) {
        return $$0 == '_' || $$0 == '-' || $$0 >= 'a' && $$0 <= 'z' || $$0 >= '0' && $$0 <= '9' || $$0 == '/' || $$0 == '.';
    }

    private static boolean c(char $$0) {
        return $$0 == '_' || $$0 == '-' || $$0 >= 'a' && $$0 <= 'z' || $$0 >= '0' && $$0 <= '9' || $$0 == '.';
    }

    public static boolean g(String $$0) {
        String[] $$1 = acq.b($$0, ':');
        return acq.i(StringUtils.isEmpty((CharSequence)$$1[0]) ? c : $$1[0]) && acq.h($$1[1]);
    }

    private static String d(String $$0, String $$1) {
        if (!acq.h($$1)) {
            throw new z("Non [a-z0-9/._-] character in path of location: " + $$0 + ":" + $$1);
        }
        return $$1;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((acq)object);
    }

    protected static interface a {
    }

    public static class b
    implements JsonDeserializer<acq>,
    JsonSerializer<acq> {
        public acq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            return new acq(aor.a($$0, "location"));
        }

        public JsonElement a(acq $$0, Type $$1, JsonSerializationContext $$2) {
            return new JsonPrimitive($$0.toString());
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((acq)object, type, jsonSerializationContext);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

