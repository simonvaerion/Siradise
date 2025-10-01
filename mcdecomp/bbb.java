/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

public class bbb {
    private Instant a = Instant.EPOCH;
    private Instant b = Instant.EPOCH;
    private final List<bbg> c = Lists.newArrayList();
    private final List<bbh> d = Lists.newArrayList();
    private final Map<bbk.b, a> e = Maps.newHashMap();
    private final Map<bbk.b, a> f = Maps.newHashMap();
    private final List<bbi> g = Lists.newArrayList();
    private final List<bbi> h = Lists.newArrayList();
    private int i;
    private Duration j = Duration.ZERO;
    private final List<bbj> k = Lists.newArrayList();
    private final List<bbl> l = Lists.newArrayList();
    private final List<bbm> m = Lists.newArrayList();
    @Nullable
    private Duration n = null;

    private bbb(Stream<RecordedEvent> $$0) {
        this.a($$0);
    }

    public static bbc a(Path $$0) {
        bbc bbc2;
        final RecordingFile $$1 = new RecordingFile($$0);
        try {
            Iterator<RecordedEvent> $$2 = new Iterator<RecordedEvent>(){

                @Override
                public boolean hasNext() {
                    return $$1.hasMoreEvents();
                }

                public RecordedEvent a() {
                    if (!this.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    try {
                        return $$1.readEvent();
                    }
                    catch (IOException $$0) {
                        throw new UncheckedIOException($$0);
                    }
                }

                @Override
                public /* synthetic */ Object next() {
                    return this.a();
                }
            };
            Stream<RecordedEvent> $$3 = StreamSupport.stream(Spliterators.spliteratorUnknownSize($$2, 1297), false);
            bbc2 = new bbb($$3).a();
        }
        catch (Throwable throwable) {
            try {
                try {
                    $$1.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException $$4) {
                throw new UncheckedIOException($$4);
            }
        }
        $$1.close();
        return bbc2;
    }

    private bbc a() {
        Duration $$0 = Duration.between(this.a, this.b);
        return new bbc(this.a, this.b, $$0, this.n, this.m, this.d, bbj.a($$0, this.k, this.j, this.i), bbl.a(this.l), bbb.a($$0, this.e), bbb.a($$0, this.f), bbi.a($$0, this.g), bbi.a($$0, this.h), this.c);
    }

    private void a(Stream<RecordedEvent> $$02) {
        $$02.forEach($$0 -> {
            if ($$0.getEndTime().isAfter(this.b) || this.b.equals(Instant.EPOCH)) {
                this.b = $$0.getEndTime();
            }
            if ($$0.getStartTime().isBefore(this.a) || this.a.equals(Instant.EPOCH)) {
                this.a = $$0.getStartTime();
            }
            switch ($$0.getEventType().getName()) {
                case "minecraft.ChunkGeneration": {
                    this.c.add(bbg.a($$0));
                    break;
                }
                case "minecraft.LoadWorld": {
                    this.n = $$0.getDuration();
                    break;
                }
                case "minecraft.ServerTickTime": {
                    this.m.add(bbm.a($$0));
                    break;
                }
                case "minecraft.PacketReceived": {
                    this.a((RecordedEvent)$$0, $$0.getInt("bytes"), this.e);
                    break;
                }
                case "minecraft.PacketSent": {
                    this.a((RecordedEvent)$$0, $$0.getInt("bytes"), this.f);
                    break;
                }
                case "jdk.ThreadAllocationStatistics": {
                    this.l.add(bbl.a($$0));
                    break;
                }
                case "jdk.GCHeapSummary": {
                    this.k.add(bbj.a($$0));
                    break;
                }
                case "jdk.CPULoad": {
                    this.d.add(bbh.a($$0));
                    break;
                }
                case "jdk.FileWrite": {
                    this.a((RecordedEvent)$$0, this.g, "bytesWritten");
                    break;
                }
                case "jdk.FileRead": {
                    this.a((RecordedEvent)$$0, this.h, "bytesRead");
                    break;
                }
                case "jdk.GarbageCollection": {
                    ++this.i;
                    this.j = this.j.plus($$0.getDuration());
                    break;
                }
            }
        });
    }

    private void a(RecordedEvent $$02, int $$1, Map<bbk.b, a> $$2) {
        $$2.computeIfAbsent(bbk.b.a($$02), $$0 -> new a()).a($$1);
    }

    private void a(RecordedEvent $$0, List<bbi> $$1, String $$2) {
        $$1.add(new bbi($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
    }

    private static bbk a(Duration $$02, Map<bbk.b, a> $$1) {
        List<Pair<bbk.b, bbk.a>> $$2 = $$1.entrySet().stream().map($$0 -> Pair.of((Object)((bbk.b)$$0.getKey()), (Object)((a)$$0.getValue()).a())).toList();
        return new bbk($$02, $$2);
    }

    public static final class a {
        private long a;
        private long b;

        public void a(int $$0) {
            this.b += (long)$$0;
            ++this.a;
        }

        public bbk.a a() {
            return new bbk.a(this.a, this.b);
        }
    }
}

