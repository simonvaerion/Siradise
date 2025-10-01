/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public abstract class qm {
    private static final Logger b = LogUtils.getLogger();
    private static final Gson c = new Gson();
    private static final Pattern d = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
    public static final String a = "en_us";
    private static volatile qm e = qm.c();

    private static qm c() {
        ImmutableMap.Builder $$0 = ImmutableMap.builder();
        BiConsumer<String, String> $$1 = (arg_0, arg_1) -> ((ImmutableMap.Builder)$$0).put(arg_0, arg_1);
        qm.a($$1, "/assets/minecraft/lang/en_us.json");
        ImmutableMap $$2 = $$0.build();
        return new qm((Map)$$2){
            final /* synthetic */ Map b;
            {
                this.b = map;
            }

            @Override
            public String a(String $$0, String $$1) {
                return this.b.getOrDefault($$0, $$1);
            }

            @Override
            public boolean b(String $$0) {
                return this.b.containsKey($$0);
            }

            @Override
            public boolean b() {
                return false;
            }

            @Override
            public aom a(ta $$0) {
                return $$12 -> $$0.a((ts $$1, String $$2) -> apq.c($$2, $$1, $$12) ? Optional.empty() : ta.a, ts.a).isPresent();
            }
        };
    }

    private static void a(BiConsumer<String, String> $$0, String $$1) {
        try (InputStream $$2 = qm.class.getResourceAsStream($$1);){
            qm.a($$2, $$0);
        }
        catch (JsonParseException | IOException $$3) {
            b.error("Couldn't read strings from {}", (Object)$$1, (Object)$$3);
        }
    }

    public static void a(InputStream $$0, BiConsumer<String, String> $$1) {
        JsonObject $$2 = (JsonObject)c.fromJson((Reader)new InputStreamReader($$0, StandardCharsets.UTF_8), JsonObject.class);
        for (Map.Entry $$3 : $$2.entrySet()) {
            String $$4 = d.matcher(aor.a((JsonElement)$$3.getValue(), (String)$$3.getKey())).replaceAll("%$1s");
            $$1.accept((String)$$3.getKey(), $$4);
        }
    }

    public static qm a() {
        return e;
    }

    public static void a(qm $$0) {
        e = $$0;
    }

    public String a(String $$0) {
        return this.a($$0, $$0);
    }

    public abstract String a(String var1, String var2);

    public abstract boolean b(String var1);

    public abstract boolean b();

    public abstract aom a(ta var1);

    public List<aom> a(List<ta> $$0) {
        return (List)$$0.stream().map(this::a).collect(ImmutableList.toImmutableList());
    }
}

