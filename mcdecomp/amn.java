/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.internal.Streams
 *  com.google.gson.stream.JsonReader
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class amn
extends ams {
    private static final Logger b = LogUtils.getLogger();
    private final MinecraftServer c;
    private final File d;
    private final Set<amo<?>> e = Sets.newHashSet();

    public amn(MinecraftServer $$0, File $$1) {
        this.c = $$0;
        this.d = $$1;
        if ($$1.isFile()) {
            try {
                this.a($$0.ay(), FileUtils.readFileToString((File)$$1));
            }
            catch (IOException $$2) {
                b.error("Couldn't read statistics file {}", (Object)$$1, (Object)$$2);
            }
            catch (JsonParseException $$3) {
                b.error("Couldn't parse statistics file {}", (Object)$$1, (Object)$$3);
            }
        }
    }

    public void a() {
        try {
            FileUtils.writeStringToFile((File)this.d, (String)this.b());
        }
        catch (IOException $$0) {
            b.error("Couldn't save stats", (Throwable)$$0);
        }
    }

    @Override
    public void a(byo $$0, amo<?> $$1, int $$2) {
        super.a($$0, $$1, $$2);
        this.e.add($$1);
    }

    private Set<amo<?>> d() {
        HashSet $$0 = Sets.newHashSet(this.e);
        this.e.clear();
        return $$0;
    }

    public void a(DataFixer $$0, String $$1) {
        try (JsonReader $$2 = new JsonReader((Reader)new StringReader($$1));){
            $$2.setLenient(false);
            JsonElement $$3 = Streams.parse((JsonReader)$$2);
            if ($$3.isJsonNull()) {
                b.error("Unable to parse Stat data from {}", (Object)this.d);
                return;
            }
            qr $$4 = amn.a($$3.getAsJsonObject());
            if (($$4 = aqc.g.a($$0, $$4, rd.b($$4, 1343))).b("stats", 10)) {
                qr $$5 = $$4.p("stats");
                for (String $$6 : $$5.e()) {
                    if (!$$5.b($$6, 10)) continue;
                    ac.a(jb.y.b(new acq($$6)), $$22 -> {
                        qr $$3 = $$5.p($$6);
                        for (String $$4 : $$3.e()) {
                            if ($$3.b($$4, 99)) {
                                ac.a(this.a((amq)$$22, $$4), $$2 -> this.a.put($$2, $$3.h($$4)), () -> b.warn("Invalid statistic in {}: Don't know what {} is", (Object)this.d, (Object)$$4));
                                continue;
                            }
                            b.warn("Invalid statistic value in {}: Don't know what {} is for key {}", new Object[]{this.d, $$3.c($$4), $$4});
                        }
                    }, () -> b.warn("Invalid statistic type in {}: Don't know what {} is", (Object)this.d, (Object)$$6));
                }
            }
        }
        catch (JsonParseException | IOException $$7) {
            b.error("Unable to parse Stat data from {}", (Object)this.d, (Object)$$7);
        }
    }

    private <T> Optional<amo<T>> a(amq<T> $$0, String $$1) {
        return Optional.ofNullable(acq.a($$1)).flatMap($$0.a()::b).map($$0::b);
    }

    private static qr a(JsonObject $$0) {
        qr $$1 = new qr();
        for (Map.Entry $$2 : $$0.entrySet()) {
            JsonPrimitive $$4;
            JsonElement $$3 = (JsonElement)$$2.getValue();
            if ($$3.isJsonObject()) {
                $$1.a((String)$$2.getKey(), amn.a($$3.getAsJsonObject()));
                continue;
            }
            if (!$$3.isJsonPrimitive() || !($$4 = $$3.getAsJsonPrimitive()).isNumber()) continue;
            $$1.a((String)$$2.getKey(), $$4.getAsInt());
        }
        return $$1;
    }

    protected String b() {
        HashMap $$02 = Maps.newHashMap();
        for (Object $$1 : this.a.object2IntEntrySet()) {
            amo amo2 = (amo)$$1.getKey();
            $$02.computeIfAbsent(amo2.a(), $$0 -> new JsonObject()).addProperty(amn.b(amo2).toString(), (Number)$$1.getIntValue());
        }
        JsonObject $$3 = new JsonObject();
        for (Map.Entry entry : $$02.entrySet()) {
            $$3.add(jb.y.b((amq)entry.getKey()).toString(), (JsonElement)entry.getValue());
        }
        JsonObject $$5 = new JsonObject();
        $$5.add("stats", (JsonElement)$$3);
        $$5.addProperty("DataVersion", (Number)aa.b().d().c());
        return $$5.toString();
    }

    private static <T> acq b(amo<T> $$0) {
        return $$0.a().a().b($$0.b());
    }

    public void c() {
        this.e.addAll((Collection<amo<?>>)this.a.keySet());
    }

    public void a(aig $$0) {
        Object2IntOpenHashMap $$1 = new Object2IntOpenHashMap();
        for (amo<?> $$2 : this.d()) {
            $$1.put($$2, this.a($$2));
        }
        $$0.c.a(new uw((Object2IntMap<amo<?>>)$$1));
    }
}

