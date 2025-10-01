/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.stream.JsonReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.Message;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public interface sw
extends Message,
ta {
    public ts a();

    public sx b();

    @Override
    default public String getString() {
        return ta.super.getString();
    }

    default public String a(int $$0) {
        StringBuilder $$1 = new StringBuilder();
        this.a((String $$2) -> {
            int $$3 = $$0 - $$1.length();
            if ($$3 <= 0) {
                return a;
            }
            $$1.append($$2.length() <= $$3 ? $$2 : $$2.substring(0, $$3));
            return Optional.empty();
        });
        return $$1.toString();
    }

    public List<sw> c();

    default public tj d() {
        return tj.a(this.b());
    }

    default public tj e() {
        return new tj(this.b(), new ArrayList<sw>(this.c()), this.a());
    }

    public aom f();

    @Override
    default public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
        ts $$2 = this.a().a($$1);
        Optional<T> $$3 = this.b().a($$0, $$2);
        if ($$3.isPresent()) {
            return $$3;
        }
        for (sw $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if (!$$5.isPresent()) continue;
            return $$5;
        }
        return Optional.empty();
    }

    @Override
    default public <T> Optional<T> a(ta.a<T> $$0) {
        Optional<T> $$1 = this.b().a($$0);
        if ($$1.isPresent()) {
            return $$1;
        }
        for (sw $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) continue;
            return $$3;
        }
        return Optional.empty();
    }

    default public List<sw> g() {
        return this.a(ts.a);
    }

    default public List<sw> a(ts $$0) {
        ArrayList $$12 = Lists.newArrayList();
        this.a(($$1, $$2) -> {
            if (!$$2.isEmpty()) {
                $$12.add(sw.b($$2).c($$1));
            }
            return Optional.empty();
        }, $$0);
        return $$12;
    }

    default public boolean a(sw $$0) {
        List<sw> $$2;
        if (this.equals($$0)) {
            return true;
        }
        List<sw> $$1 = this.g();
        return Collections.indexOfSubList($$1, $$2 = $$0.a(this.a())) != -1;
    }

    public static sw a(@Nullable String $$0) {
        return $$0 != null ? sw.b($$0) : sv.a;
    }

    public static tj b(String $$0) {
        return tj.a(new ub($$0));
    }

    public static tj c(String $$0) {
        return tj.a(new ug($$0, null, ug.b));
    }

    public static tj a(String $$0, Object ... $$1) {
        return tj.a(new ug($$0, null, $$1));
    }

    public static tj a(String $$0, @Nullable String $$1) {
        return tj.a(new ug($$0, $$1, ug.b));
    }

    public static tj a(String $$0, @Nullable String $$1, Object ... $$2) {
        return tj.a(new ug($$0, $$1, $$2));
    }

    public static tj h() {
        return tj.a(sx.a);
    }

    public static tj d(String $$0) {
        return tj.a(new tz($$0));
    }

    public static tj a(String $$0, boolean $$1, Optional<sw> $$2, tx $$3) {
        return tj.a(new uc($$0, $$1, $$2, $$3));
    }

    public static tj b(String $$0, String $$1) {
        return tj.a(new ud($$0, $$1));
    }

    public static tj a(String $$0, Optional<sw> $$1) {
        return tj.a(new ue($$0, $$1));
    }

    public static class a
    implements JsonDeserializer<tj>,
    JsonSerializer<sw> {
        private static final Gson a = ac.a(() -> {
            GsonBuilder $$0 = new GsonBuilder();
            $$0.disableHtmlEscaping();
            $$0.registerTypeHierarchyAdapter(sw.class, (Object)new a());
            $$0.registerTypeHierarchyAdapter(ts.class, (Object)new ts.b());
            $$0.registerTypeAdapterFactory((TypeAdapterFactory)new aox());
            return $$0.create();
        });
        private static final Field b = ac.a(() -> {
            try {
                new JsonReader((Reader)new StringReader(""));
                Field $$0 = JsonReader.class.getDeclaredField("pos");
                $$0.setAccessible(true);
                return $$0;
            }
            catch (NoSuchFieldException $$1) {
                throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", $$1);
            }
        });
        private static final Field c = ac.a(() -> {
            try {
                new JsonReader((Reader)new StringReader(""));
                Field $$0 = JsonReader.class.getDeclaredField("lineStart");
                $$0.setAccessible(true);
                return $$0;
            }
            catch (NoSuchFieldException $$1) {
                throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", $$1);
            }
        });

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public tj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            if ($$0.isJsonPrimitive()) {
                return sw.b($$0.getAsString());
            }
            if ($$0.isJsonObject()) {
                void $$27;
                JsonObject $$3 = $$0.getAsJsonObject();
                if ($$3.has("text")) {
                    String $$4 = aor.i($$3, "text");
                    tj $$5 = $$4.isEmpty() ? sw.h() : sw.b($$4);
                } else if ($$3.has("translate")) {
                    String $$6 = aor.i($$3, "translate");
                    String $$7 = aor.a($$3, "fallback", null);
                    if ($$3.has("with")) {
                        JsonArray $$8 = aor.v($$3, "with");
                        Object[] $$9 = new Object[$$8.size()];
                        for (int $$10 = 0; $$10 < $$9.length; ++$$10) {
                            $$9[$$10] = sw$a.a((Object)this.a($$8.get($$10), $$1, $$2));
                        }
                        tj $$11 = sw.a($$6, $$7, $$9);
                    } else {
                        tj $$12 = sw.a($$6, $$7);
                    }
                } else if ($$3.has("score")) {
                    JsonObject $$13 = aor.u($$3, "score");
                    if (!$$13.has("name") || !$$13.has("objective")) throw new JsonParseException("A score component needs a least a name and an objective");
                    tj $$14 = sw.b(aor.i($$13, "name"), aor.i($$13, "objective"));
                } else if ($$3.has("selector")) {
                    Optional<sw> $$16 = this.a($$1, $$2, $$3);
                    tj $$17 = sw.a(aor.i($$3, "selector"), $$16);
                } else if ($$3.has("keybind")) {
                    tj $$18 = sw.d(aor.i($$3, "keybind"));
                } else {
                    void $$25;
                    if (!$$3.has("nbt")) throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
                    String $$19 = aor.i($$3, "nbt");
                    Optional<sw> $$20 = this.a($$1, $$2, $$3);
                    boolean $$21 = aor.a($$3, "interpret", false);
                    if ($$3.has("block")) {
                        tw $$22 = new tw(aor.i($$3, "block"));
                    } else if ($$3.has("entity")) {
                        ty $$23 = new ty(aor.i($$3, "entity"));
                    } else {
                        if (!$$3.has("storage")) throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
                        uf $$24 = new uf(new acq(aor.i($$3, "storage")));
                    }
                    tj $$26 = sw.a($$19, $$21, $$20, (tx)$$25);
                }
                if ($$3.has("extra")) {
                    JsonArray $$28 = aor.v($$3, "extra");
                    if ($$28.size() <= 0) throw new JsonParseException("Unexpected empty array of components");
                    for (int $$29 = 0; $$29 < $$28.size(); ++$$29) {
                        $$27.b(this.a($$28.get($$29), $$1, $$2));
                    }
                }
                $$27.b((ts)$$2.deserialize($$0, ts.class));
                return $$27;
            }
            if (!$$0.isJsonArray()) throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
            JsonArray $$30 = $$0.getAsJsonArray();
            tj $$31 = null;
            for (JsonElement $$32 : $$30) {
                tj $$33 = this.a($$32, $$32.getClass(), $$2);
                if ($$31 == null) {
                    $$31 = $$33;
                    continue;
                }
                $$31.b($$33);
            }
            return $$31;
        }

        private static Object a(Object $$0) {
            sx $$2;
            sw $$1;
            if ($$0 instanceof sw && ($$1 = (sw)$$0).a().g() && $$1.c().isEmpty() && ($$2 = $$1.b()) instanceof ub) {
                ub $$3 = (ub)$$2;
                return $$3.a();
            }
            return $$0;
        }

        private Optional<sw> a(Type $$0, JsonDeserializationContext $$1, JsonObject $$2) {
            if ($$2.has("separator")) {
                return Optional.of(this.a($$2.get("separator"), $$0, $$1));
            }
            return Optional.empty();
        }

        private void a(ts $$0, JsonObject $$1, JsonSerializationContext $$2) {
            JsonElement $$3 = $$2.serialize((Object)$$0);
            if ($$3.isJsonObject()) {
                JsonObject $$4 = (JsonObject)$$3;
                for (Map.Entry $$5 : $$4.entrySet()) {
                    $$1.add((String)$$5.getKey(), (JsonElement)$$5.getValue());
                }
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public JsonElement a(sw $$0, Type $$1, JsonSerializationContext $$2) {
            sx $$6;
            JsonObject $$3 = new JsonObject();
            if (!$$0.a().g()) {
                this.a($$0.a(), $$3, $$2);
            }
            if (!$$0.c().isEmpty()) {
                JsonArray $$4 = new JsonArray();
                for (sw $$5 : $$0.c()) {
                    $$4.add(this.a($$5, (Type)((Object)sw.class), $$2));
                }
                $$3.add("extra", (JsonElement)$$4);
            }
            if (($$6 = $$0.b()) == sx.a) {
                $$3.addProperty("text", "");
                return $$3;
            } else if ($$6 instanceof ub) {
                ub $$7 = (ub)$$6;
                $$3.addProperty("text", $$7.a());
                return $$3;
            } else if ($$6 instanceof ug) {
                ug $$8 = (ug)$$6;
                $$3.addProperty("translate", $$8.a());
                String $$9 = $$8.b();
                if ($$9 != null) {
                    $$3.addProperty("fallback", $$9);
                }
                if ($$8.c().length <= 0) return $$3;
                JsonArray $$10 = new JsonArray();
                for (Object $$11 : $$8.c()) {
                    if ($$11 instanceof sw) {
                        $$10.add(this.a((sw)$$11, $$11.getClass(), $$2));
                        continue;
                    }
                    $$10.add((JsonElement)new JsonPrimitive(String.valueOf($$11)));
                }
                $$3.add("with", (JsonElement)$$10);
                return $$3;
            } else if ($$6 instanceof ud) {
                ud $$12 = (ud)$$6;
                JsonObject $$13 = new JsonObject();
                $$13.addProperty("name", $$12.a());
                $$13.addProperty("objective", $$12.c());
                $$3.add("score", (JsonElement)$$13);
                return $$3;
            } else if ($$6 instanceof ue) {
                ue $$14 = (ue)$$6;
                $$3.addProperty("selector", $$14.a());
                this.a($$2, $$3, $$14.c());
                return $$3;
            } else if ($$6 instanceof tz) {
                tz $$15 = (tz)$$6;
                $$3.addProperty("keybind", $$15.a());
                return $$3;
            } else {
                if (!($$6 instanceof uc)) throw new IllegalArgumentException("Don't know how to serialize " + $$6 + " as a Component");
                uc $$16 = (uc)$$6;
                $$3.addProperty("nbt", $$16.a());
                $$3.addProperty("interpret", Boolean.valueOf($$16.b()));
                this.a($$2, $$3, $$16.c());
                tx $$17 = $$16.d();
                if ($$17 instanceof tw) {
                    tw $$18 = (tw)$$17;
                    $$3.addProperty("block", $$18.a());
                    return $$3;
                } else if ($$17 instanceof ty) {
                    ty $$19 = (ty)$$17;
                    $$3.addProperty("entity", $$19.a());
                    return $$3;
                } else {
                    if (!($$17 instanceof uf)) throw new IllegalArgumentException("Don't know how to serialize " + $$6 + " as a Component");
                    uf $$20 = (uf)$$17;
                    $$3.addProperty("storage", $$20.a().toString());
                }
            }
            return $$3;
        }

        private void a(JsonSerializationContext $$0, JsonObject $$1, Optional<sw> $$22) {
            $$22.ifPresent($$2 -> $$1.add("separator", this.a((sw)$$2, (Type)$$2.getClass(), $$0)));
        }

        public static String a(sw $$0) {
            return a.toJson((Object)$$0);
        }

        public static String b(sw $$0) {
            return aor.e(sw$a.c($$0));
        }

        public static JsonElement c(sw $$0) {
            return a.toJsonTree((Object)$$0);
        }

        @Nullable
        public static tj a(String $$0) {
            return aor.b(a, $$0, tj.class, false);
        }

        @Nullable
        public static tj a(JsonElement $$0) {
            return (tj)a.fromJson($$0, tj.class);
        }

        @Nullable
        public static tj b(String $$0) {
            return aor.b(a, $$0, tj.class, true);
        }

        public static tj a(com.mojang.brigadier.StringReader $$0) {
            try {
                JsonReader $$1 = new JsonReader((Reader)new StringReader($$0.getRemaining()));
                $$1.setLenient(false);
                tj $$2 = (tj)a.getAdapter(tj.class).read($$1);
                $$0.setCursor($$0.getCursor() + sw$a.a($$1));
                return $$2;
            }
            catch (IOException | StackOverflowError $$3) {
                throw new JsonParseException($$3);
            }
        }

        private static int a(JsonReader $$0) {
            try {
                return b.getInt($$0) - c.getInt($$0) + 1;
            }
            catch (IllegalAccessException $$1) {
                throw new IllegalStateException("Couldn't read position of JsonReader", $$1);
            }
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((sw)object, type, jsonSerializationContext);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

