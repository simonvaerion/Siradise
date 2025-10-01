/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class alp<K, V extends alo<K>> {
    private static final Logger a = LogUtils.getLogger();
    private static final Gson b = new GsonBuilder().setPrettyPrinting().create();
    private final File c;
    private final Map<String, V> d = Maps.newHashMap();

    public alp(File $$0) {
        this.c = $$0;
    }

    public File b() {
        return this.c;
    }

    public void a(V $$0) {
        this.d.put(this.a((K)((alo)$$0).g()), $$0);
        try {
            this.e();
        }
        catch (IOException $$1) {
            a.warn("Could not save the list after adding a user.", (Throwable)$$1);
        }
    }

    @Nullable
    public V b(K $$0) {
        this.g();
        return (V)((alo)this.d.get(this.a($$0)));
    }

    public void c(K $$0) {
        this.d.remove(this.a($$0));
        try {
            this.e();
        }
        catch (IOException $$1) {
            a.warn("Could not save the list after removing a user.", (Throwable)$$1);
        }
    }

    public void b(alo<K> $$0) {
        this.c($$0.g());
    }

    public String[] a() {
        return this.d.keySet().toArray(new String[0]);
    }

    public boolean c() {
        return this.d.size() < 1;
    }

    protected String a(K $$0) {
        return $$0.toString();
    }

    protected boolean d(K $$0) {
        return this.d.containsKey(this.a($$0));
    }

    private void g() {
        ArrayList $$0 = Lists.newArrayList();
        for (alo $$1 : this.d.values()) {
            if (!$$1.f()) continue;
            $$0.add($$1.g());
        }
        for (Object $$2 : $$0) {
            this.d.remove(this.a((K)$$2));
        }
    }

    protected abstract alo<K> a(JsonObject var1);

    public Collection<V> d() {
        return this.d.values();
    }

    public void e() throws IOException {
        JsonArray $$02 = new JsonArray();
        this.d.values().stream().map($$0 -> ac.a(new JsonObject(), $$0::a)).forEach(arg_0 -> ((JsonArray)$$02).add(arg_0));
        try (BufferedWriter $$1 = Files.newWriter((File)this.c, (Charset)StandardCharsets.UTF_8);){
            b.toJson((JsonElement)$$02, (Appendable)$$1);
        }
    }

    public void f() throws IOException {
        if (!this.c.exists()) {
            return;
        }
        try (BufferedReader $$0 = Files.newReader((File)this.c, (Charset)StandardCharsets.UTF_8);){
            JsonArray $$1 = (JsonArray)b.fromJson((Reader)$$0, JsonArray.class);
            this.d.clear();
            for (JsonElement $$2 : $$1) {
                JsonObject $$3 = aor.m($$2, "entry");
                alo<K> $$4 = this.a($$3);
                if ($$4.g() == null) continue;
                this.d.put(this.a($$4.g()), $$4);
            }
        }
    }
}

