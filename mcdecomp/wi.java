/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public final class wi
extends Record
implements uo<ur> {
    private final int a;
    private final boolean b;
    private final cmj c;
    @Nullable
    private final cmj d;
    private final Set<acp<cmm>> e;
    private final hs.b f;
    private final acp<dfk> g;
    private final acp<cmm> h;
    private final long i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final Optional<hd> q;
    private final int r;
    private static final aco<rk> s = aco.a(rc.a, hs.a(jb.ap));

    public wi(sf $$02) {
        this($$02.readInt(), $$02.readBoolean(), cmj.a($$02.readByte()), cmj.b($$02.readByte()), $$02.a(Sets::newHashSetWithExpectedSize, $$0 -> $$0.a(jc.aH)), $$02.a(s, hv.a).c(), $$02.a(jc.au), $$02.a(jc.aH), $$02.readLong(), $$02.m(), $$02.m(), $$02.m(), $$02.readBoolean(), $$02.readBoolean(), $$02.readBoolean(), $$02.readBoolean(), $$02.b(sf::i), $$02.m());
    }

    public wi(int $$0, boolean $$1, cmj $$2, @Nullable cmj $$3, Set<acp<cmm>> $$4, hs.b $$5, acp<dfk> $$6, acp<cmm> $$7, long $$8, int $$9, int $$10, int $$11, boolean $$12, boolean $$13, boolean $$14, boolean $$15, Optional<hd> $$16, int $$17) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
        this.i = $$8;
        this.j = $$9;
        this.k = $$10;
        this.l = $$11;
        this.m = $$12;
        this.n = $$13;
        this.o = $$14;
        this.p = $$15;
        this.q = $$16;
        this.r = $$17;
    }

    @Override
    public void a(sf $$0) {
        $$0.writeInt(this.a);
        $$0.writeBoolean(this.b);
        $$0.writeByte(this.c.a());
        $$0.writeByte(cmj.a(this.d));
        $$0.a(this.e, sf::b);
        $$0.a(s, hv.a, this.f);
        $$0.b(this.g);
        $$0.b(this.h);
        $$0.writeLong(this.i);
        $$0.d(this.j);
        $$0.d(this.k);
        $$0.d(this.l);
        $$0.writeBoolean(this.m);
        $$0.writeBoolean(this.n);
        $$0.writeBoolean(this.o);
        $$0.writeBoolean(this.p);
        $$0.a(this.q, sf::a);
        $$0.d(this.r);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{wi.class, "playerId;hardcore;gameType;previousGameType;levels;registryHolder;dimensionType;dimension;seed;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;isDebug;isFlat;lastDeathLocation;portalCooldown", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{wi.class, "playerId;hardcore;gameType;previousGameType;levels;registryHolder;dimensionType;dimension;seed;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;isDebug;isFlat;lastDeathLocation;portalCooldown", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{wi.class, "playerId;hardcore;gameType;previousGameType;levels;registryHolder;dimensionType;dimension;seed;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;isDebug;isFlat;lastDeathLocation;portalCooldown", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"}, this, $$0);
    }

    public int a() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public cmj d() {
        return this.c;
    }

    @Nullable
    public cmj e() {
        return this.d;
    }

    public Set<acp<cmm>> f() {
        return this.e;
    }

    public hs.b g() {
        return this.f;
    }

    public acp<dfk> h() {
        return this.g;
    }

    public acp<cmm> i() {
        return this.h;
    }

    public long j() {
        return this.i;
    }

    public int k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    public int m() {
        return this.l;
    }

    public boolean n() {
        return this.m;
    }

    public boolean o() {
        return this.n;
    }

    public boolean p() {
        return this.o;
    }

    public boolean q() {
        return this.p;
    }

    public Optional<hd> r() {
        return this.q;
    }

    public int s() {
        return this.r;
    }
}

