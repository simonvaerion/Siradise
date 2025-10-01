/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 */
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import java.util.stream.Stream;

public final class ddo
extends Record {
    private final String l;
    private final dcq m;
    private final cxa n;
    private final cxa o;
    private final amg p;
    private final amg q;
    private static final Set<ddo> r = new ObjectArraySet();
    public static final ddo a = ddo.a(new ddo("oak", dcq.e));
    public static final ddo b = ddo.a(new ddo("spruce", dcq.f));
    public static final ddo c = ddo.a(new ddo("birch", dcq.g));
    public static final ddo d = ddo.a(new ddo("acacia", dcq.h));
    public static final ddo e = ddo.a(new ddo("cherry", dcq.i, cxa.aQ, cxa.aT, amh.ef, amh.eg));
    public static final ddo f = ddo.a(new ddo("jungle", dcq.j));
    public static final ddo g = ddo.a(new ddo("dark_oak", dcq.k));
    public static final ddo h = ddo.a(new ddo("crimson", dcq.l, cxa.aP, cxa.aM, amh.pn, amh.po));
    public static final ddo i = ddo.a(new ddo("warped", dcq.m, cxa.aP, cxa.aM, amh.pn, amh.po));
    public static final ddo j = ddo.a(new ddo("mangrove", dcq.n));
    public static final ddo k = ddo.a(new ddo("bamboo", dcq.o, cxa.aO, cxa.aN, amh.bh, amh.bi));

    public ddo(String $$0, dcq $$1) {
        this($$0, $$1, cxa.b, cxa.aL, amh.hB, amh.hC);
    }

    public ddo(String $$0, dcq $$1, cxa $$2, cxa $$3, amg $$4, amg $$5) {
        this.l = $$0;
        this.m = $$1;
        this.n = $$2;
        this.o = $$3;
        this.p = $$4;
        this.q = $$5;
    }

    private static ddo a(ddo $$0) {
        r.add($$0);
        return $$0;
    }

    public static Stream<ddo> a() {
        return r.stream();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ddo.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "l", "m", "n", "o", "p", "q"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ddo.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "l", "m", "n", "o", "p", "q"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ddo.class, "name;setType;soundType;hangingSignSoundType;fenceGateClose;fenceGateOpen", "l", "m", "n", "o", "p", "q"}, this, $$0);
    }

    public String b() {
        return this.l;
    }

    public dcq c() {
        return this.m;
    }

    public cxa d() {
        return this.n;
    }

    public cxa e() {
        return this.o;
    }

    public amg f() {
        return this.p;
    }

    public amg g() {
        return this.q;
    }
}

