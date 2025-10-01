/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.LongSerializationPolicy
 *  com.mojang.datafixers.util.Pair
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.LongSerializationPolicy;
import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;

public class bbe {
    private static final String b = "bytesPerSecond";
    private static final String c = "count";
    private static final String d = "durationNanosTotal";
    private static final String e = "totalBytes";
    private static final String f = "countPerSecond";
    final Gson a = new GsonBuilder().setPrettyPrinting().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();

    public String a(bbc $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.addProperty("startedEpoch", (Number)$$0.c().toEpochMilli());
        $$1.addProperty("endedEpoch", (Number)$$0.d().toEpochMilli());
        $$1.addProperty("durationMs", (Number)$$0.e().toMillis());
        Duration $$2 = $$0.f();
        if ($$2 != null) {
            $$1.addProperty("worldGenDurationMs", (Number)$$2.toMillis());
        }
        $$1.add("heap", this.a($$0.i()));
        $$1.add("cpuPercent", this.c($$0.h()));
        $$1.add("network", this.c($$0));
        $$1.add("fileIO", this.b($$0));
        $$1.add("serverTick", this.b($$0.g()));
        $$1.add("threadAllocation", this.a($$0.j()));
        $$1.add("chunkGen", this.a($$0.a()));
        return this.a.toJson((JsonElement)$$1);
    }

    private JsonElement a(bbj.a $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.addProperty("allocationRateBytesPerSecond", (Number)$$0.e());
        $$1.addProperty("gcCount", (Number)$$0.d());
        $$1.addProperty("gcOverHeadPercent", (Number)Float.valueOf($$0.a()));
        $$1.addProperty("gcTotalDurationMs", (Number)$$0.c().toMillis());
        return $$1;
    }

    private JsonElement a(List<Pair<dec, bbp<bbg>>> $$02) {
        JsonObject $$12 = new JsonObject();
        $$12.addProperty(d, (Number)$$02.stream().mapToDouble($$0 -> ((bbp)$$0.getSecond()).f().toNanos()).sum());
        JsonArray $$22 = ac.a(new JsonArray(), (T $$1) -> $$12.add("status", (JsonElement)$$1));
        for (Pair<dec, bbp<bbg>> $$3 : $$02) {
            bbp $$4 = (bbp)$$3.getSecond();
            JsonObject $$5 = ac.a(new JsonObject(), arg_0 -> ((JsonArray)$$22).add(arg_0));
            $$5.addProperty("state", ((dec)$$3.getFirst()).toString());
            $$5.addProperty(c, (Number)$$4.d());
            $$5.addProperty(d, (Number)$$4.f().toNanos());
            $$5.addProperty("durationNanosAvg", (Number)($$4.f().toNanos() / (long)$$4.d()));
            JsonObject $$6 = ac.a(new JsonObject(), (T $$1) -> $$5.add("durationNanosPercentiles", (JsonElement)$$1));
            $$4.e().forEach(($$1, $$2) -> $$6.addProperty("p" + $$1, (Number)$$2));
            Function<bbg, JsonElement> $$7 = $$0 -> {
                JsonObject $$1 = new JsonObject();
                $$1.addProperty("durationNanos", (Number)$$0.a().toNanos());
                $$1.addProperty("level", $$0.e());
                $$1.addProperty("chunkPosX", (Number)$$0.b().e);
                $$1.addProperty("chunkPosZ", (Number)$$0.b().f);
                $$1.addProperty("worldPosX", (Number)$$0.c().c());
                $$1.addProperty("worldPosZ", (Number)$$0.c().d());
                return $$1;
            };
            $$5.add("fastest", $$7.apply((bbg)$$4.a()));
            $$5.add("slowest", $$7.apply((bbg)$$4.b()));
            $$5.add("secondSlowest", (JsonElement)($$4.c() != null ? $$7.apply((bbg)$$4.c()) : JsonNull.INSTANCE));
        }
        return $$12;
    }

    private JsonElement a(bbl.a $$0) {
        JsonArray $$12 = new JsonArray();
        $$0.a().forEach(($$1, $$22) -> $$12.add((JsonElement)ac.a(new JsonObject(), (T $$2) -> {
            $$2.addProperty("thread", $$1);
            $$2.addProperty(b, (Number)$$22);
        })));
        return $$12;
    }

    private JsonElement b(List<bbm> $$02) {
        if ($$02.isEmpty()) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$12 = new JsonObject();
        double[] $$22 = $$02.stream().mapToDouble($$0 -> (double)$$0.b().toNanos() / 1000000.0).toArray();
        DoubleSummaryStatistics $$3 = DoubleStream.of($$22).summaryStatistics();
        $$12.addProperty("minMs", (Number)$$3.getMin());
        $$12.addProperty("averageMs", (Number)$$3.getAverage());
        $$12.addProperty("maxMs", (Number)$$3.getMax());
        Map<Integer, Double> $$4 = bau.a($$22);
        $$4.forEach(($$1, $$2) -> $$12.addProperty("p" + $$1, (Number)$$2));
        return $$12;
    }

    private JsonElement b(bbc $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.add("write", this.a($$0.m()));
        $$1.add("read", this.a($$0.n()));
        return $$1;
    }

    private JsonElement a(bbi.a $$0) {
        JsonObject $$12 = new JsonObject();
        $$12.addProperty(e, (Number)$$0.a());
        $$12.addProperty(c, (Number)$$0.c());
        $$12.addProperty(b, (Number)$$0.b());
        $$12.addProperty(f, (Number)$$0.d());
        JsonArray $$2 = new JsonArray();
        $$12.add("topContributors", (JsonElement)$$2);
        $$0.f().forEach($$1 -> {
            JsonObject $$2 = new JsonObject();
            $$2.add((JsonElement)$$2);
            $$2.addProperty("path", (String)$$1.getFirst());
            $$2.addProperty(e, (Number)$$1.getSecond());
        });
        return $$12;
    }

    private JsonElement c(bbc $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.add("sent", this.a($$0.l()));
        $$1.add("received", this.a($$0.k()));
        return $$1;
    }

    private JsonElement a(bbk $$0) {
        JsonObject $$12 = new JsonObject();
        $$12.addProperty(e, (Number)$$0.d());
        $$12.addProperty(c, (Number)$$0.c());
        $$12.addProperty(b, (Number)$$0.b());
        $$12.addProperty(f, (Number)$$0.a());
        JsonArray $$2 = new JsonArray();
        $$12.add("topContributors", (JsonElement)$$2);
        $$0.e().forEach($$1 -> {
            JsonObject $$2 = new JsonObject();
            $$2.add((JsonElement)$$2);
            bbk.b $$3 = (bbk.b)$$1.getFirst();
            bbk.a $$4 = (bbk.a)$$1.getSecond();
            $$2.addProperty("protocolId", (Number)$$3.c());
            $$2.addProperty("packetId", (Number)$$3.d());
            $$2.addProperty("packetName", $$3.a());
            $$2.addProperty(e, (Number)$$4.b());
            $$2.addProperty(c, (Number)$$4.a());
        });
        return $$12;
    }

    private JsonElement c(List<bbh> $$02) {
        JsonObject $$12 = new JsonObject();
        BiFunction<List, ToDoubleFunction, JsonObject> $$2 = ($$0, $$1) -> {
            JsonObject $$2 = new JsonObject();
            DoubleSummaryStatistics $$3 = $$0.stream().mapToDouble($$1).summaryStatistics();
            $$2.addProperty("min", (Number)$$3.getMin());
            $$2.addProperty("average", (Number)$$3.getAverage());
            $$2.addProperty("max", (Number)$$3.getMax());
            return $$2;
        };
        $$12.add("jvm", (JsonElement)$$2.apply($$02, bbh::a));
        $$12.add("userJvm", (JsonElement)$$2.apply($$02, bbh::b));
        $$12.add("system", (JsonElement)$$2.apply($$02, bbh::c));
        return $$12;
    }
}

