/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class alg {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 1000;
    private static final int c = 1;
    private static boolean d;
    private final Map<String, a> e = Maps.newConcurrentMap();
    private final Map<UUID, a> f = Maps.newConcurrentMap();
    private final Map<String, CompletableFuture<Optional<GameProfile>>> g = Maps.newConcurrentMap();
    private final GameProfileRepository h;
    private final Gson i = new GsonBuilder().create();
    private final File j;
    private final AtomicLong k = new AtomicLong();
    @Nullable
    private Executor l;

    public alg(GameProfileRepository $$0, File $$1) {
        this.h = $$0;
        this.j = $$1;
        Lists.reverse(this.b()).forEach(this::a);
    }

    private void a(a $$0) {
        UUID $$3;
        GameProfile $$1 = $$0.a();
        $$0.a(this.e());
        String $$2 = $$1.getName();
        if ($$2 != null) {
            this.e.put($$2.toLowerCase(Locale.ROOT), $$0);
        }
        if (($$3 = $$1.getId()) != null) {
            this.f.put($$3, $$0);
        }
    }

    private static Optional<GameProfile> a(GameProfileRepository $$0, String $$1) {
        final AtomicReference $$2 = new AtomicReference();
        ProfileLookupCallback $$3 = new ProfileLookupCallback(){

            public void onProfileLookupSucceeded(GameProfile $$0) {
                $$2.set($$0);
            }

            public void onProfileLookupFailed(GameProfile $$0, Exception $$1) {
                $$2.set(null);
            }
        };
        $$0.findProfilesByNames(new String[]{$$1}, Agent.MINECRAFT, $$3);
        GameProfile $$4 = (GameProfile)$$2.get();
        if (!alg.d() && $$4 == null) {
            UUID $$5 = hy.a(new GameProfile(null, $$1));
            return Optional.of(new GameProfile($$5, $$1));
        }
        return Optional.ofNullable($$4);
    }

    public static void a(boolean $$0) {
        d = $$0;
    }

    private static boolean d() {
        return d;
    }

    public void a(GameProfile $$0) {
        Calendar $$1 = Calendar.getInstance();
        $$1.setTime(new Date());
        $$1.add(2, 1);
        Date $$2 = $$1.getTime();
        a $$3 = new a($$0, $$2);
        this.a($$3);
        this.c();
    }

    private long e() {
        return this.k.incrementAndGet();
    }

    public Optional<GameProfile> a(String $$0) {
        Optional<GameProfile> $$5;
        String $$1 = $$0.toLowerCase(Locale.ROOT);
        a $$2 = this.e.get($$1);
        boolean $$3 = false;
        if ($$2 != null && new Date().getTime() >= $$2.b.getTime()) {
            this.f.remove($$2.a().getId());
            this.e.remove($$2.a().getName().toLowerCase(Locale.ROOT));
            $$3 = true;
            $$2 = null;
        }
        if ($$2 != null) {
            $$2.a(this.e());
            Optional<GameProfile> $$4 = Optional.of($$2.a());
        } else {
            $$5 = alg.a(this.h, $$1);
            if ($$5.isPresent()) {
                this.a($$5.get());
                $$3 = false;
            }
        }
        if ($$3) {
            this.c();
        }
        return $$5;
    }

    public void a(String $$0, Consumer<Optional<GameProfile>> $$12) {
        if (this.l == null) {
            throw new IllegalStateException("No executor");
        }
        CompletableFuture<Optional<GameProfile>> $$22 = this.g.get($$0);
        if ($$22 != null) {
            this.g.put($$0, (CompletableFuture<Optional<GameProfile>>)$$22.whenCompleteAsync(($$1, $$2) -> $$12.accept((Optional<GameProfile>)$$1), this.l));
        } else {
            this.g.put($$0, (CompletableFuture<Optional<GameProfile>>)((CompletableFuture)CompletableFuture.supplyAsync(() -> this.a($$0), ac.f()).whenCompleteAsync(($$1, $$2) -> this.g.remove($$0), this.l)).whenCompleteAsync(($$1, $$2) -> $$12.accept((Optional<GameProfile>)$$1), this.l));
        }
    }

    public Optional<GameProfile> a(UUID $$0) {
        a $$1 = this.f.get($$0);
        if ($$1 == null) {
            return Optional.empty();
        }
        $$1.a(this.e());
        return Optional.of($$1.a());
    }

    public void a(Executor $$0) {
        this.l = $$0;
    }

    public void a() {
        this.l = null;
    }

    private static DateFormat f() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<a> b() {
        ArrayList $$0 = Lists.newArrayList();
        try (BufferedReader $$12222 = Files.newReader((File)this.j, (Charset)StandardCharsets.UTF_8);){
            JsonArray $$22 = (JsonArray)this.i.fromJson((Reader)$$12222, JsonArray.class);
            if ($$22 == null) {
                ArrayList arrayList = $$0;
                return arrayList;
            }
            DateFormat $$3 = alg.f();
            $$22.forEach($$2 -> alg.a($$2, $$3).ifPresent($$0::add));
            return $$0;
        }
        catch (FileNotFoundException $$12222) {
            return $$0;
        }
        catch (JsonParseException | IOException $$4) {
            a.warn("Failed to load profile cache {}", (Object)this.j, (Object)$$4);
        }
        return $$0;
    }

    public void c() {
        JsonArray $$0 = new JsonArray();
        DateFormat $$1 = alg.f();
        this.a(1000).forEach($$2 -> $$0.add(alg.a($$2, $$1)));
        String $$22 = this.i.toJson((JsonElement)$$0);
        try (BufferedWriter $$3 = Files.newWriter((File)this.j, (Charset)StandardCharsets.UTF_8);){
            $$3.write($$22);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private Stream<a> a(int $$0) {
        return ImmutableList.copyOf(this.f.values()).stream().sorted(Comparator.comparing(a::c).reversed()).limit($$0);
    }

    private static JsonElement a(a $$0, DateFormat $$1) {
        JsonObject $$2 = new JsonObject();
        $$2.addProperty("name", $$0.a().getName());
        UUID $$3 = $$0.a().getId();
        $$2.addProperty("uuid", $$3 == null ? "" : $$3.toString());
        $$2.addProperty("expiresOn", $$1.format($$0.b()));
        return $$2;
    }

    /*
     * WARNING - void declaration
     */
    private static Optional<a> a(JsonElement $$0, DateFormat $$1) {
        if ($$0.isJsonObject()) {
            void $$11;
            JsonObject $$2 = $$0.getAsJsonObject();
            JsonElement $$3 = $$2.get("name");
            JsonElement $$4 = $$2.get("uuid");
            JsonElement $$5 = $$2.get("expiresOn");
            if ($$3 == null || $$4 == null) {
                return Optional.empty();
            }
            String $$6 = $$4.getAsString();
            String $$7 = $$3.getAsString();
            Date $$8 = null;
            if ($$5 != null) {
                try {
                    $$8 = $$1.parse($$5.getAsString());
                }
                catch (ParseException parseException) {
                    // empty catch block
                }
            }
            if ($$7 == null || $$6 == null || $$8 == null) {
                return Optional.empty();
            }
            try {
                UUID $$9 = UUID.fromString($$6);
            }
            catch (Throwable $$10) {
                return Optional.empty();
            }
            return Optional.of(new a(new GameProfile((UUID)$$11, $$7), $$8));
        }
        return Optional.empty();
    }

    static class a {
        private final GameProfile a;
        final Date b;
        private volatile long c;

        a(GameProfile $$0, Date $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public GameProfile a() {
            return this.a;
        }

        public Date b() {
            return this.b;
        }

        public void a(long $$0) {
            this.c = $$0;
        }

        public long c() {
            return this.c;
        }
    }
}

