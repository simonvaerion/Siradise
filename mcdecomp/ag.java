/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ag
implements Comparable<ag> {
    final Map<String, ak> a;
    private String[][] b = new String[0][];

    private ag(Map<String, ak> $$0) {
        this.a = $$0;
    }

    public ag() {
        this.a = Maps.newHashMap();
    }

    public void a(Map<String, aj> $$0, String[][] $$12) {
        Set<String> $$2 = $$0.keySet();
        this.a.entrySet().removeIf($$1 -> !$$2.contains($$1.getKey()));
        for (String $$3 : $$2) {
            if (this.a.containsKey($$3)) continue;
            this.a.put($$3, new ak());
        }
        this.b = $$12;
    }

    public boolean a() {
        if (this.b.length == 0) {
            return false;
        }
        for (String[] $$0 : this.b) {
            boolean $$1 = false;
            for (String $$2 : $$0) {
                ak $$3 = this.c($$2);
                if ($$3 == null || !$$3.a()) continue;
                $$1 = true;
                break;
            }
            if ($$1) continue;
            return false;
        }
        return true;
    }

    public boolean b() {
        for (ak $$0 : this.a.values()) {
            if (!$$0.a()) continue;
            return true;
        }
        return false;
    }

    public boolean a(String $$0) {
        ak $$1 = this.a.get($$0);
        if ($$1 != null && !$$1.a()) {
            $$1.b();
            return true;
        }
        return false;
    }

    public boolean b(String $$0) {
        ak $$1 = this.a.get($$0);
        if ($$1 != null && $$1.a()) {
            $$1.c();
            return true;
        }
        return false;
    }

    public String toString() {
        return "AdvancementProgress{criteria=" + this.a + ", requirements=" + Arrays.deepToString((Object[])this.b) + "}";
    }

    public void a(sf $$02) {
        $$02.a(this.a, sf::a, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
    }

    public static ag b(sf $$0) {
        Map<String, ak> $$1 = $$0.a(sf::s, ak::b);
        return new ag($$1);
    }

    @Nullable
    public ak c(String $$0) {
        return this.a.get($$0);
    }

    public float c() {
        if (this.a.isEmpty()) {
            return 0.0f;
        }
        float $$0 = this.b.length;
        float $$1 = this.h();
        return $$1 / $$0;
    }

    @Nullable
    public String d() {
        if (this.a.isEmpty()) {
            return null;
        }
        int $$0 = this.b.length;
        if ($$0 <= 1) {
            return null;
        }
        int $$1 = this.h();
        return $$1 + "/" + $$0;
    }

    private int h() {
        int $$0 = 0;
        for (String[] $$1 : this.b) {
            boolean $$2 = false;
            for (String $$3 : $$1) {
                ak $$4 = this.c($$3);
                if ($$4 == null || !$$4.a()) continue;
                $$2 = true;
                break;
            }
            if (!$$2) continue;
            ++$$0;
        }
        return $$0;
    }

    public Iterable<String> e() {
        ArrayList $$0 = Lists.newArrayList();
        for (Map.Entry<String, ak> $$1 : this.a.entrySet()) {
            if ($$1.getValue().a()) continue;
            $$0.add($$1.getKey());
        }
        return $$0;
    }

    public Iterable<String> f() {
        ArrayList $$0 = Lists.newArrayList();
        for (Map.Entry<String, ak> $$1 : this.a.entrySet()) {
            if (!$$1.getValue().a()) continue;
            $$0.add($$1.getKey());
        }
        return $$0;
    }

    @Nullable
    public Date g() {
        Date $$0 = null;
        for (ak $$1 : this.a.values()) {
            if (!$$1.a() || $$0 != null && !$$1.d().before($$0)) continue;
            $$0 = $$1.d();
        }
        return $$0;
    }

    public int a(ag $$0) {
        Date $$1 = this.g();
        Date $$2 = $$0.g();
        if ($$1 == null && $$2 != null) {
            return 1;
        }
        if ($$1 != null && $$2 == null) {
            return -1;
        }
        if ($$1 == null && $$2 == null) {
            return 0;
        }
        return $$1.compareTo($$2);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((ag)object);
    }

    public static class a
    implements JsonDeserializer<ag>,
    JsonSerializer<ag> {
        public JsonElement a(ag $$0, Type $$1, JsonSerializationContext $$2) {
            JsonObject $$3 = new JsonObject();
            JsonObject $$4 = new JsonObject();
            for (Map.Entry<String, ak> $$5 : $$0.a.entrySet()) {
                ak $$6 = $$5.getValue();
                if (!$$6.a()) continue;
                $$4.add($$5.getKey(), $$6.e());
            }
            if (!$$4.entrySet().isEmpty()) {
                $$3.add("criteria", (JsonElement)$$4);
            }
            $$3.addProperty("done", Boolean.valueOf($$0.a()));
            return $$3;
        }

        public ag a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = aor.m($$0, "advancement");
            JsonObject $$4 = aor.a($$3, "criteria", new JsonObject());
            ag $$5 = new ag();
            for (Map.Entry $$6 : $$4.entrySet()) {
                String $$7 = (String)$$6.getKey();
                $$5.a.put($$7, ak.a(aor.a((JsonElement)$$6.getValue(), $$7)));
            }
            return $$5;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((ag)object, type, jsonSerializationContext);
        }
    }
}

