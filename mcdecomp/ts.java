/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ts {
    public static final ts a = new ts(null, null, null, null, null, null, null, null, null, null);
    public static final Codec<ts> b = RecordCodecBuilder.create($$02 -> $$02.group((App)tu.a.optionalFieldOf("color").forGetter($$0 -> Optional.ofNullable($$0.d)), (App)Codec.BOOL.optionalFieldOf("bold").forGetter($$0 -> Optional.ofNullable($$0.e)), (App)Codec.BOOL.optionalFieldOf("italic").forGetter($$0 -> Optional.ofNullable($$0.f)), (App)Codec.BOOL.optionalFieldOf("underlined").forGetter($$0 -> Optional.ofNullable($$0.g)), (App)Codec.BOOL.optionalFieldOf("strikethrough").forGetter($$0 -> Optional.ofNullable($$0.h)), (App)Codec.BOOL.optionalFieldOf("obfuscated").forGetter($$0 -> Optional.ofNullable($$0.i)), (App)Codec.STRING.optionalFieldOf("insertion").forGetter($$0 -> Optional.ofNullable($$0.l)), (App)acq.a.optionalFieldOf("font").forGetter($$0 -> Optional.ofNullable($$0.m))).apply((Applicative)$$02, ts::a));
    public static final acq c = new acq("minecraft", "default");
    @Nullable
    final tu d;
    @Nullable
    final Boolean e;
    @Nullable
    final Boolean f;
    @Nullable
    final Boolean g;
    @Nullable
    final Boolean h;
    @Nullable
    final Boolean i;
    @Nullable
    final su j;
    @Nullable
    final tb k;
    @Nullable
    final String l;
    @Nullable
    final acq m;

    private static ts a(Optional<tu> $$0, Optional<Boolean> $$1, Optional<Boolean> $$2, Optional<Boolean> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5, Optional<String> $$6, Optional<acq> $$7) {
        return new ts($$0.orElse(null), $$1.orElse(null), $$2.orElse(null), $$3.orElse(null), $$4.orElse(null), $$5.orElse(null), null, null, $$6.orElse(null), $$7.orElse(null));
    }

    ts(@Nullable tu $$0, @Nullable Boolean $$1, @Nullable Boolean $$2, @Nullable Boolean $$3, @Nullable Boolean $$4, @Nullable Boolean $$5, @Nullable su $$6, @Nullable tb $$7, @Nullable String $$8, @Nullable acq $$9) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$8;
        this.m = $$9;
    }

    @Nullable
    public tu a() {
        return this.d;
    }

    public boolean b() {
        return this.e == Boolean.TRUE;
    }

    public boolean c() {
        return this.f == Boolean.TRUE;
    }

    public boolean d() {
        return this.h == Boolean.TRUE;
    }

    public boolean e() {
        return this.g == Boolean.TRUE;
    }

    public boolean f() {
        return this.i == Boolean.TRUE;
    }

    public boolean g() {
        return this == a;
    }

    @Nullable
    public su h() {
        return this.j;
    }

    @Nullable
    public tb i() {
        return this.k;
    }

    @Nullable
    public String j() {
        return this.l;
    }

    public acq k() {
        return this.m != null ? this.m : c;
    }

    public ts a(@Nullable tu $$0) {
        return new ts($$0, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public ts a(@Nullable n $$0) {
        return this.a($$0 != null ? tu.a($$0) : null);
    }

    public ts a(int $$0) {
        return this.a(tu.a($$0));
    }

    public ts a(@Nullable Boolean $$0) {
        return new ts(this.d, $$0, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public ts b(@Nullable Boolean $$0) {
        return new ts(this.d, this.e, $$0, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public ts c(@Nullable Boolean $$0) {
        return new ts(this.d, this.e, this.f, $$0, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public ts d(@Nullable Boolean $$0) {
        return new ts(this.d, this.e, this.f, this.g, $$0, this.i, this.j, this.k, this.l, this.m);
    }

    public ts e(@Nullable Boolean $$0) {
        return new ts(this.d, this.e, this.f, this.g, this.h, $$0, this.j, this.k, this.l, this.m);
    }

    public ts a(@Nullable su $$0) {
        return new ts(this.d, this.e, this.f, this.g, this.h, this.i, $$0, this.k, this.l, this.m);
    }

    public ts a(@Nullable tb $$0) {
        return new ts(this.d, this.e, this.f, this.g, this.h, this.i, this.j, $$0, this.l, this.m);
    }

    public ts a(@Nullable String $$0) {
        return new ts(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, $$0, this.m);
    }

    public ts a(@Nullable acq $$0) {
        return new ts(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, $$0);
    }

    public ts b(n $$0) {
        tu $$1 = this.d;
        Boolean $$2 = this.e;
        Boolean $$3 = this.f;
        Boolean $$4 = this.h;
        Boolean $$5 = this.g;
        Boolean $$6 = this.i;
        switch ($$0) {
            case q: {
                $$6 = true;
                break;
            }
            case r: {
                $$2 = true;
                break;
            }
            case s: {
                $$4 = true;
                break;
            }
            case t: {
                $$5 = true;
                break;
            }
            case u: {
                $$3 = true;
                break;
            }
            case v: {
                return a;
            }
            default: {
                $$1 = tu.a($$0);
            }
        }
        return new ts($$1, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
    }

    public ts c(n $$0) {
        tu $$1 = this.d;
        Boolean $$2 = this.e;
        Boolean $$3 = this.f;
        Boolean $$4 = this.h;
        Boolean $$5 = this.g;
        Boolean $$6 = this.i;
        switch ($$0) {
            case q: {
                $$6 = true;
                break;
            }
            case r: {
                $$2 = true;
                break;
            }
            case s: {
                $$4 = true;
                break;
            }
            case t: {
                $$5 = true;
                break;
            }
            case u: {
                $$3 = true;
                break;
            }
            case v: {
                return a;
            }
            default: {
                $$6 = false;
                $$2 = false;
                $$4 = false;
                $$5 = false;
                $$3 = false;
                $$1 = tu.a($$0);
            }
        }
        return new ts($$1, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
    }

    public ts a(n ... $$0) {
        tu $$1 = this.d;
        Boolean $$2 = this.e;
        Boolean $$3 = this.f;
        Boolean $$4 = this.h;
        Boolean $$5 = this.g;
        Boolean $$6 = this.i;
        block8: for (n $$7 : $$0) {
            switch ($$7) {
                case q: {
                    $$6 = true;
                    continue block8;
                }
                case r: {
                    $$2 = true;
                    continue block8;
                }
                case s: {
                    $$4 = true;
                    continue block8;
                }
                case t: {
                    $$5 = true;
                    continue block8;
                }
                case u: {
                    $$3 = true;
                    continue block8;
                }
                case v: {
                    return a;
                }
                default: {
                    $$1 = tu.a($$7);
                }
            }
        }
        return new ts($$1, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
    }

    public ts a(ts $$0) {
        if (this == a) {
            return $$0;
        }
        if ($$0 == a) {
            return this;
        }
        return new ts(this.d != null ? this.d : $$0.d, this.e != null ? this.e : $$0.e, this.f != null ? this.f : $$0.f, this.g != null ? this.g : $$0.g, this.h != null ? this.h : $$0.h, this.i != null ? this.i : $$0.i, this.j != null ? this.j : $$0.j, this.k != null ? this.k : $$0.k, this.l != null ? this.l : $$0.l, this.m != null ? this.m : $$0.m);
    }

    public String toString() {
        final StringBuilder $$0 = new StringBuilder("{");
        class A {
            private boolean c;

            A() {
            }

            private void a() {
                if (this.c) {
                    $$0.append(',');
                }
                this.c = true;
            }

            void a(String $$02, @Nullable Boolean $$1) {
                if ($$1 != null) {
                    this.a();
                    if (!$$1.booleanValue()) {
                        $$0.append('!');
                    }
                    $$0.append($$02);
                }
            }

            void a(String $$02, @Nullable Object $$1) {
                if ($$1 != null) {
                    this.a();
                    $$0.append($$02);
                    $$0.append('=');
                    $$0.append($$1);
                }
            }
        }
        A $$1 = new A();
        $$1.a("color", this.d);
        $$1.a("bold", this.e);
        $$1.a("italic", this.f);
        $$1.a("underlined", this.g);
        $$1.a("strikethrough", this.h);
        $$1.a("obfuscated", this.i);
        $$1.a("clickEvent", this.j);
        $$1.a("hoverEvent", this.k);
        $$1.a("insertion", this.l);
        $$1.a("font", this.m);
        $$0.append("}");
        return $$0.toString();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof ts) {
            ts $$1 = (ts)$$0;
            return this.b() == $$1.b() && Objects.equals(this.a(), $$1.a()) && this.c() == $$1.c() && this.f() == $$1.f() && this.d() == $$1.d() && this.e() == $$1.e() && Objects.equals(this.h(), $$1.h()) && Objects.equals(this.i(), $$1.i()) && Objects.equals(this.j(), $$1.j()) && Objects.equals(this.k(), $$1.k());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public static class b
    implements JsonDeserializer<ts>,
    JsonSerializer<ts> {
        @Nullable
        public ts a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            if ($$0.isJsonObject()) {
                JsonObject $$3 = $$0.getAsJsonObject();
                if ($$3 == null) {
                    return null;
                }
                Boolean $$4 = ts$b.a($$3, "bold");
                Boolean $$5 = ts$b.a($$3, "italic");
                Boolean $$6 = ts$b.a($$3, "underlined");
                Boolean $$7 = ts$b.a($$3, "strikethrough");
                Boolean $$8 = ts$b.a($$3, "obfuscated");
                tu $$9 = ts$b.e($$3);
                String $$10 = ts$b.d($$3);
                su $$11 = ts$b.c($$3);
                tb $$12 = ts$b.b($$3);
                acq $$13 = ts$b.a($$3);
                return new ts($$9, $$4, $$5, $$6, $$7, $$8, $$11, $$12, $$10, $$13);
            }
            return null;
        }

        @Nullable
        private static acq a(JsonObject $$0) {
            if ($$0.has("font")) {
                String $$1 = aor.i($$0, "font");
                try {
                    return new acq($$1);
                }
                catch (z $$2) {
                    throw new JsonSyntaxException("Invalid font name: " + $$1);
                }
            }
            return null;
        }

        @Nullable
        private static tb b(JsonObject $$0) {
            JsonObject $$1;
            tb $$2;
            if ($$0.has("hoverEvent") && ($$2 = tb.a($$1 = aor.u($$0, "hoverEvent"))) != null && $$2.a().a()) {
                return $$2;
            }
            return null;
        }

        @Nullable
        private static su c(JsonObject $$0) {
            if ($$0.has("clickEvent")) {
                JsonObject $$1 = aor.u($$0, "clickEvent");
                String $$2 = aor.a($$1, "action", null);
                su.a $$3 = $$2 == null ? null : su.a.a($$2);
                String $$4 = aor.a($$1, "value", null);
                if ($$3 != null && $$4 != null && $$3.a()) {
                    return new su($$3, $$4);
                }
            }
            return null;
        }

        @Nullable
        private static String d(JsonObject $$0) {
            return aor.a($$0, "insertion", null);
        }

        @Nullable
        private static tu e(JsonObject $$0) {
            if ($$0.has("color")) {
                String $$1 = aor.i($$0, "color");
                return tu.a($$1);
            }
            return null;
        }

        @Nullable
        private static Boolean a(JsonObject $$0, String $$1) {
            if ($$0.has($$1)) {
                return $$0.get($$1).getAsBoolean();
            }
            return null;
        }

        @Nullable
        public JsonElement a(ts $$0, Type $$1, JsonSerializationContext $$2) {
            if ($$0.g()) {
                return null;
            }
            JsonObject $$3 = new JsonObject();
            if ($$0.e != null) {
                $$3.addProperty("bold", $$0.e);
            }
            if ($$0.f != null) {
                $$3.addProperty("italic", $$0.f);
            }
            if ($$0.g != null) {
                $$3.addProperty("underlined", $$0.g);
            }
            if ($$0.h != null) {
                $$3.addProperty("strikethrough", $$0.h);
            }
            if ($$0.i != null) {
                $$3.addProperty("obfuscated", $$0.i);
            }
            if ($$0.d != null) {
                $$3.addProperty("color", $$0.d.b());
            }
            if ($$0.l != null) {
                $$3.add("insertion", $$2.serialize((Object)$$0.l));
            }
            if ($$0.j != null) {
                JsonObject $$4 = new JsonObject();
                $$4.addProperty("action", $$0.j.a().b());
                $$4.addProperty("value", $$0.j.b());
                $$3.add("clickEvent", (JsonElement)$$4);
            }
            if ($$0.k != null) {
                $$3.add("hoverEvent", (JsonElement)$$0.k.b());
            }
            if ($$0.m != null) {
                $$3.addProperty("font", $$0.m.toString());
            }
            return $$3;
        }

        @Nullable
        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((ts)object, type, jsonSerializationContext);
        }

        @Nullable
        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

