/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.internal.Streams
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aje
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final AtomicInteger b = new AtomicInteger(1);
    private static final ThreadFactory c = $$0 -> {
        Thread $$1 = new Thread($$0);
        $$1.setName("Chat-Filter-Worker-" + b.getAndIncrement());
        return $$1;
    };
    private static final String d = "v1/chat";
    private final URL e;
    private final c f;
    final URL g;
    final b h;
    final URL i;
    final b j;
    private final String k;
    final a l;
    final ExecutorService m;

    private aje(URL $$0, c $$1, URL $$2, b $$3, URL $$4, b $$5, String $$6, a $$7, int $$8) {
        this.k = $$6;
        this.l = $$7;
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$5;
        this.m = Executors.newFixedThreadPool($$8, c);
    }

    private static URL a(URI $$0, @Nullable JsonObject $$1, String $$2, String $$3) throws MalformedURLException {
        String $$4 = aje.a($$1, $$2, $$3);
        return $$0.resolve("/" + $$4).toURL();
    }

    private static String a(@Nullable JsonObject $$0, String $$1, String $$2) {
        return $$0 != null ? aor.a($$0, $$1, $$2) : $$2;
    }

    @Nullable
    public static aje a(String $$0) {
        if (Strings.isNullOrEmpty((String)$$0)) {
            return null;
        }
        try {
            c $$18;
            JsonObject $$1 = aor.a($$0);
            URI $$22 = new URI(aor.i($$1, "apiServer"));
            String $$32 = aor.i($$1, "apiKey");
            if ($$32.isEmpty()) {
                throw new IllegalArgumentException("Missing API key");
            }
            int $$42 = aor.a($$1, "ruleId", 1);
            String $$5 = aor.a($$1, "serverId", "");
            String $$6 = aor.a($$1, "roomId", "Java:Chat");
            int $$7 = aor.a($$1, "hashesToDrop", -1);
            int $$8 = aor.a($$1, "maxConcurrentRequests", 7);
            JsonObject $$9 = aor.a($$1, "endpoints", null);
            String $$10 = aje.a($$9, "chat", d);
            boolean $$11 = $$10.equals(d);
            URL $$12 = $$22.resolve("/" + $$10).toURL();
            URL $$13 = aje.a($$22, $$9, "join", "v1/join");
            URL $$14 = aje.a($$22, $$9, "leave", "v1/leave");
            b $$15 = $$2 -> {
                JsonObject $$3 = new JsonObject();
                $$3.addProperty("server", $$5);
                $$3.addProperty("room", $$6);
                $$3.addProperty("user_id", $$2.getId().toString());
                $$3.addProperty("user_display_name", $$2.getName());
                return $$3;
            };
            if ($$11) {
                c $$16 = ($$3, $$4) -> {
                    JsonObject $$5 = new JsonObject();
                    $$5.addProperty("rule", (Number)$$42);
                    $$5.addProperty("server", $$5);
                    $$5.addProperty("room", $$6);
                    $$5.addProperty("player", $$3.getId().toString());
                    $$5.addProperty("player_display_name", $$3.getName());
                    $$5.addProperty("text", $$4);
                    $$5.addProperty("language", "*");
                    return $$5;
                };
            } else {
                String $$17 = String.valueOf($$42);
                $$18 = ($$3, $$4) -> {
                    JsonObject $$5 = new JsonObject();
                    $$5.addProperty("rule_id", $$17);
                    $$5.addProperty("category", $$5);
                    $$5.addProperty("subcategory", $$6);
                    $$5.addProperty("user_id", $$3.getId().toString());
                    $$5.addProperty("user_display_name", $$3.getName());
                    $$5.addProperty("text", $$4);
                    $$5.addProperty("language", "*");
                    return $$5;
                };
            }
            a $$19 = aje$a.select($$7);
            String $$20 = Base64.getEncoder().encodeToString($$32.getBytes(StandardCharsets.US_ASCII));
            return new aje($$12, $$18, $$13, $$15, $$14, $$15, $$20, $$19, $$8);
        }
        catch (Exception $$21) {
            a.warn("Failed to parse chat filter config {}", (Object)$$0, (Object)$$21);
            return null;
        }
    }

    void a(GameProfile $$0, URL $$1, b $$2, Executor $$3) {
        $$3.execute(() -> {
            JsonObject $$3 = $$2.encode($$0);
            try {
                this.b($$3, $$1);
            }
            catch (Exception $$4) {
                a.warn("Failed to send join/leave packet to {} for player {}", new Object[]{$$1, $$0, $$4});
            }
        });
    }

    CompletableFuture<aiu> a(GameProfile $$0, String $$1, a $$2, Executor $$3) {
        if ($$1.isEmpty()) {
            return CompletableFuture.completedFuture(aiu.a);
        }
        return CompletableFuture.supplyAsync(() -> {
            JsonObject $$3 = this.f.encode($$0, $$1);
            try {
                JsonObject $$4 = this.a($$3, this.e);
                boolean $$5 = aor.a($$4, "response", false);
                if ($$5) {
                    return aiu.a($$1);
                }
                String $$6 = aor.a($$4, "hashed", null);
                if ($$6 == null) {
                    return aiu.b($$1);
                }
                JsonArray $$7 = aor.v($$4, "hashes");
                sz $$8 = this.a($$1, $$7, $$2);
                return new aiu($$1, $$8);
            }
            catch (Exception $$9) {
                a.warn("Failed to validate message '{}'", (Object)$$1, (Object)$$9);
                return aiu.b($$1);
            }
        }, $$3);
    }

    private sz a(String $$0, JsonArray $$1, a $$2) {
        if ($$1.isEmpty()) {
            return sz.c;
        }
        if ($$2.shouldIgnore($$0, $$1.size())) {
            return sz.b;
        }
        sz $$3 = new sz($$0.length());
        for (int $$4 = 0; $$4 < $$1.size(); ++$$4) {
            $$3.a($$1.get($$4).getAsInt());
        }
        return $$3;
    }

    @Override
    public void close() {
        this.m.shutdownNow();
    }

    private void a(InputStream $$0) throws IOException {
        byte[] $$1 = new byte[1024];
        while ($$0.read($$1) != -1) {
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private JsonObject a(JsonObject $$0, URL $$1) throws IOException {
        HttpURLConnection $$2 = this.c($$0, $$1);
        try (InputStream $$3 = $$2.getInputStream();){
            JsonObject jsonObject;
            if ($$2.getResponseCode() == 204) {
                JsonObject jsonObject2 = new JsonObject();
                return jsonObject2;
            }
            try {
                jsonObject = Streams.parse((JsonReader)new JsonReader((Reader)new InputStreamReader($$3, StandardCharsets.UTF_8))).getAsJsonObject();
            }
            catch (Throwable throwable) {
                this.a($$3);
                throw throwable;
            }
            this.a($$3);
            return jsonObject;
        }
    }

    private void b(JsonObject $$0, URL $$1) throws IOException {
        HttpURLConnection $$2 = this.c($$0, $$1);
        try (InputStream $$3 = $$2.getInputStream();){
            this.a($$3);
        }
    }

    private HttpURLConnection c(JsonObject $$0, URL $$1) throws IOException {
        HttpURLConnection $$2 = (HttpURLConnection)$$1.openConnection();
        $$2.setConnectTimeout(15000);
        $$2.setReadTimeout(2000);
        $$2.setUseCaches(false);
        $$2.setDoOutput(true);
        $$2.setDoInput(true);
        $$2.setRequestMethod("POST");
        $$2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        $$2.setRequestProperty("Accept", "application/json");
        $$2.setRequestProperty("Authorization", "Basic " + this.k);
        $$2.setRequestProperty("User-Agent", "Minecraft server" + aa.b().c());
        try (OutputStreamWriter $$3 = new OutputStreamWriter($$2.getOutputStream(), StandardCharsets.UTF_8);
             JsonWriter $$4 = new JsonWriter((Writer)$$3);){
            Streams.write((JsonElement)$$0, (JsonWriter)$$4);
        }
        int $$5 = $$2.getResponseCode();
        if ($$5 < 200 || $$5 >= 300) {
            throw new e($$5 + " " + $$2.getResponseMessage());
        }
        return $$2;
    }

    public ajd a(GameProfile $$0) {
        return new d($$0);
    }

    @FunctionalInterface
    public static interface a {
        public static final a a = ($$0, $$1) -> false;
        public static final a b = ($$0, $$1) -> $$0.length() == $$1;

        public static a ignoreOverThreshold(int $$0) {
            return ($$1, $$2) -> $$2 >= $$0;
        }

        public static a select(int $$0) {
            return switch ($$0) {
                case -1 -> a;
                case 0 -> b;
                default -> aje$a.ignoreOverThreshold($$0);
            };
        }

        public boolean shouldIgnore(String var1, int var2);
    }

    @FunctionalInterface
    static interface c {
        public JsonObject encode(GameProfile var1, String var2);
    }

    @FunctionalInterface
    static interface b {
        public JsonObject encode(GameProfile var1);
    }

    public static class e
    extends RuntimeException {
        e(String $$0) {
            super($$0);
        }
    }

    class d
    implements ajd {
        private final GameProfile c;
        private final Executor d;

        d(GameProfile $$0) {
            this.c = $$0;
            bcq<Runnable> $$1 = bcq.a(aje.this.m, "chat stream for " + $$0.getName());
            this.d = $$1::a;
        }

        @Override
        public void a() {
            aje.this.a(this.c, aje.this.g, aje.this.h, this.d);
        }

        @Override
        public void b() {
            aje.this.a(this.c, aje.this.i, aje.this.j, this.d);
        }

        @Override
        public CompletableFuture<List<aiu>> a(List<String> $$02) {
            List $$1 = (List)$$02.stream().map($$0 -> aje.this.a(this.c, (String)$$0, aje.this.l, this.d)).collect(ImmutableList.toImmutableList());
            return ac.c($$1).exceptionally($$0 -> ImmutableList.of());
        }

        @Override
        public CompletableFuture<aiu> a(String $$0) {
            return aje.this.a(this.c, $$0, aje.this.l, this.d);
        }
    }
}

