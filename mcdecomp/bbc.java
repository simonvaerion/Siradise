/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bbc(Instant a, Instant b, Duration c, @Nullable Duration d, List<bbm> e, List<bbh> f, bbj.a g, bbl.a h, bbk i, bbk j, bbi.a k, bbi.a l, List<bbg> m) {
    private final Instant a;
    private final Instant b;
    private final Duration c;
    @Nullable
    private final Duration d;
    private final List<bbm> e;
    private final List<bbh> f;
    private final bbj.a g;
    private final bbl.a h;
    private final bbk i;
    private final bbk j;
    private final bbi.a k;
    private final bbi.a l;
    private final List<bbg> m;

    public List<Pair<dec, bbp<bbg>>> a() {
        Map<dec, List<bbg>> $$02 = this.m.stream().collect(Collectors.groupingBy(bbg::d));
        return $$02.entrySet().stream().map($$0 -> Pair.of((Object)((dec)$$0.getKey()), bbp.a((List)$$0.getValue()))).sorted(Comparator.comparing($$0 -> ((bbp)$$0.getSecond()).f()).reversed()).toList();
    }

    public String b() {
        return new bbe().a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bbc.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;tickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;fileWrites;fileReads;chunkGenStats", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bbc.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;tickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;fileWrites;fileReads;chunkGenStats", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bbc.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;tickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;fileWrites;fileReads;chunkGenStats", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this, $$0);
    }

    public Instant c() {
        return this.a;
    }

    public Instant d() {
        return this.b;
    }

    public Duration e() {
        return this.c;
    }

    @Nullable
    public Duration f() {
        return this.d;
    }

    public List<bbm> g() {
        return this.e;
    }

    public List<bbh> h() {
        return this.f;
    }

    public bbj.a i() {
        return this.g;
    }

    public bbl.a j() {
        return this.h;
    }

    public bbk k() {
        return this.i;
    }

    public bbk l() {
        return this.j;
    }

    public bbi.a m() {
        return this.k;
    }

    public bbi.a n() {
        return this.l;
    }

    public List<bbg> o() {
        return this.m;
    }
}

