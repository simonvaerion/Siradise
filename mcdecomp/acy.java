/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.internal.Streams
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class acy {
    private static final Logger a = LogUtils.getLogger();
    private static final Gson b = new GsonBuilder().registerTypeAdapter(ag.class, (Object)new ag.a()).registerTypeAdapter(acq.class, (Object)new acq.b()).setPrettyPrinting().create();
    private static final TypeToken<Map<acq, ag>> c = new TypeToken<Map<acq, ag>>(){};
    private final DataFixer d;
    private final alk e;
    private final Path f;
    private final Map<ae, ag> g = new LinkedHashMap<ae, ag>();
    private final Set<ae> h = new HashSet<ae>();
    private final Set<ae> i = new HashSet<ae>();
    private final Set<ae> j = new HashSet<ae>();
    private aig k;
    @Nullable
    private ae l;
    private boolean m = true;

    public acy(DataFixer $$0, alk $$1, adc $$2, Path $$3, aig $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$3;
        this.k = $$4;
        this.d($$2);
    }

    public void a(aig $$0) {
        this.k = $$0;
    }

    public void a() {
        for (al<?> $$0 : ai.a()) {
            $$0.a(this);
        }
    }

    public void a(adc $$0) {
        this.a();
        this.g.clear();
        this.h.clear();
        this.j.clear();
        this.i.clear();
        this.m = true;
        this.l = null;
        this.d($$0);
    }

    private void b(adc $$0) {
        for (ae $$1 : $$0.a()) {
            this.d($$1);
        }
    }

    private void c(adc $$0) {
        for (ae $$1 : $$0.a()) {
            if (!$$1.h().isEmpty()) continue;
            this.a($$1, "");
            $$1.f().a(this.k);
        }
    }

    private void d(adc $$0) {
        if (Files.isRegularFile(this.f, new LinkOption[0])) {
            try (JsonReader $$12 = new JsonReader((Reader)Files.newBufferedReader(this.f, StandardCharsets.UTF_8));){
                $$12.setLenient(false);
                Dynamic $$2 = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)Streams.parse((JsonReader)$$12));
                int $$3 = $$2.get("DataVersion").asInt(1343);
                $$2 = $$2.remove("DataVersion");
                $$2 = aqc.i.a(this.d, $$2, $$3);
                Map $$4 = (Map)b.getAdapter(c).fromJsonTree((JsonElement)$$2.getValue());
                if ($$4 == null) {
                    throw new JsonParseException("Found null for advancements");
                }
                $$4.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach($$1 -> {
                    ae $$2 = $$0.a((acq)$$1.getKey());
                    if ($$2 == null) {
                        a.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", $$1.getKey(), (Object)this.f);
                        return;
                    }
                    this.a($$2, (ag)$$1.getValue());
                    this.i.add($$2);
                    this.c($$2);
                });
            }
            catch (JsonParseException $$5) {
                a.error("Couldn't parse player advancements in {}", (Object)this.f, (Object)$$5);
            }
            catch (IOException $$6) {
                a.error("Couldn't access player advancements in {}", (Object)this.f, (Object)$$6);
            }
        }
        this.c($$0);
        this.b($$0);
    }

    public void b() {
        LinkedHashMap<acq, ag> $$0 = new LinkedHashMap<acq, ag>();
        for (Map.Entry<ae, ag> $$1 : this.g.entrySet()) {
            ag $$2 = $$1.getValue();
            if (!$$2.b()) continue;
            $$0.put($$1.getKey().j(), $$2);
        }
        JsonElement $$3 = b.toJsonTree($$0);
        $$3.getAsJsonObject().addProperty("DataVersion", (Number)aa.b().d().c());
        try {
            v.c(this.f.getParent());
            try (BufferedWriter $$4 = Files.newBufferedWriter(this.f, StandardCharsets.UTF_8, new OpenOption[0]);){
                b.toJson($$3, (Appendable)$$4);
            }
        }
        catch (IOException $$5) {
            a.error("Couldn't save player advancements to {}", (Object)this.f, (Object)$$5);
        }
    }

    public boolean a(ae $$0, String $$1) {
        boolean $$2 = false;
        ag $$3 = this.b($$0);
        boolean $$4 = $$3.a();
        if ($$3.a($$1)) {
            this.e($$0);
            this.i.add($$0);
            $$2 = true;
            if (!$$4 && $$3.a()) {
                $$0.f().a(this.k);
                if ($$0.d() != null && $$0.d().i() && this.k.dI().X().b(cmi.y)) {
                    this.e.a(sw.a("chat.type.advancement." + $$0.d().e().a(), this.k.H_(), $$0.l()), false);
                }
            }
        }
        if (!$$4 && $$3.a()) {
            this.c($$0);
        }
        return $$2;
    }

    public boolean b(ae $$0, String $$1) {
        boolean $$2 = false;
        ag $$3 = this.b($$0);
        boolean $$4 = $$3.a();
        if ($$3.b($$1)) {
            this.d($$0);
            this.i.add($$0);
            $$2 = true;
        }
        if ($$4 && !$$3.a()) {
            this.c($$0);
        }
        return $$2;
    }

    private void c(ae $$0) {
        this.j.add($$0.c());
    }

    private void d(ae $$0) {
        ag $$1 = this.b($$0);
        if ($$1.a()) {
            return;
        }
        for (Map.Entry<String, aj> $$2 : $$0.h().entrySet()) {
            al<am> $$5;
            am $$4;
            ak $$3 = $$1.c($$2.getKey());
            if ($$3 == null || $$3.a() || ($$4 = $$2.getValue().a()) == null || ($$5 = ai.a($$4.a())) == null) continue;
            $$5.a(this, new al.a<am>($$4, $$0, $$2.getKey()));
        }
    }

    private void e(ae $$0) {
        ag $$1 = this.b($$0);
        for (Map.Entry<String, aj> $$2 : $$0.h().entrySet()) {
            al<am> $$5;
            am $$4;
            ak $$3 = $$1.c($$2.getKey());
            if ($$3 == null || !$$3.a() && !$$1.a() || ($$4 = $$2.getValue().a()) == null || ($$5 = ai.a($$4.a())) == null) continue;
            $$5.b(this, new al.a<am>($$4, $$0, $$2.getKey()));
        }
    }

    public void b(aig $$0) {
        if (this.m || !this.j.isEmpty() || !this.i.isEmpty()) {
            HashMap<acq, ag> $$1 = new HashMap<acq, ag>();
            HashSet<ae> $$2 = new HashSet<ae>();
            HashSet<acq> $$3 = new HashSet<acq>();
            for (ae $$4 : this.j) {
                this.a($$4, $$2, $$3);
            }
            this.j.clear();
            for (ae $$5 : this.i) {
                if (!this.h.contains($$5)) continue;
                $$1.put($$5.j(), this.g.get($$5));
            }
            this.i.clear();
            if (!($$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty())) {
                $$0.c.a(new yt(this.m, $$2, $$3, $$1));
            }
        }
        this.m = false;
    }

    public void a(@Nullable ae $$0) {
        ae $$1 = this.l;
        this.l = $$0 != null && $$0.b() == null && $$0.d() != null ? $$0 : null;
        if ($$1 != this.l) {
            this.k.c.a(new xi(this.l == null ? null : this.l.j()));
        }
    }

    public ag b(ae $$0) {
        ag $$1 = this.g.get($$0);
        if ($$1 == null) {
            $$1 = new ag();
            this.a($$0, $$1);
        }
        return $$1;
    }

    private void a(ae $$0, ag $$1) {
        $$1.a($$0.h(), $$0.k());
        this.g.put($$0, $$1);
    }

    private void a(ae $$02, Set<ae> $$1, Set<acq> $$22) {
        adl.a($$02, $$0 -> this.b((ae)$$0).a(), ($$2, $$3) -> {
            if ($$3) {
                if (this.h.add($$2)) {
                    $$1.add($$2);
                    if (this.g.containsKey($$2)) {
                        this.i.add($$2);
                    }
                }
            } else if (this.h.remove($$2)) {
                $$22.add($$2.j());
            }
        });
    }
}

