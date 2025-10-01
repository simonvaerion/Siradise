/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bye
extends Record {
    private final String q;
    private final Predicate<he<brc>> r;
    private final Predicate<he<brc>> s;
    private final ImmutableSet<cfu> t;
    private final ImmutableSet<cpn> u;
    @Nullable
    private final amg v;
    public static final Predicate<he<brc>> a = $$0 -> $$0.a(ang.a);
    public static final bye b = bye.a("none", brc.a, a, null);
    public static final bye c = bye.a("armorer", brd.a, amh.yI);
    public static final bye d = bye.a("butcher", brd.b, amh.yJ);
    public static final bye e = bye.a("cartographer", brd.c, amh.yK);
    public static final bye f = bye.a("cleric", brd.d, amh.yL);
    public static final bye g = bye.a("farmer", brd.e, (ImmutableSet<cfu>)ImmutableSet.of((Object)cgc.oI, (Object)cgc.oH, (Object)cgc.ur, (Object)cgc.qK), (ImmutableSet<cpn>)ImmutableSet.of((Object)cpo.cC), amh.yM);
    public static final bye h = bye.a("fisherman", brd.f, amh.yN);
    public static final bye i = bye.a("fletcher", brd.g, amh.yO);
    public static final bye j = bye.a("leatherworker", brd.h, amh.yP);
    public static final bye k = bye.a("librarian", brd.i, amh.yQ);
    public static final bye l = bye.a("mason", brd.j, amh.yR);
    public static final bye m = bye.a("nitwit", brc.a, brc.a, null);
    public static final bye n = bye.a("shepherd", brd.k, amh.yS);
    public static final bye o = bye.a("toolsmith", brd.l, amh.yT);
    public static final bye p = bye.a("weaponsmith", brd.m, amh.yU);

    public bye(String $$0, Predicate<he<brc>> $$1, Predicate<he<brc>> $$2, ImmutableSet<cfu> $$3, ImmutableSet<cpn> $$4, @Nullable amg $$5) {
        this.q = $$0;
        this.r = $$1;
        this.s = $$2;
        this.t = $$3;
        this.u = $$4;
        this.v = $$5;
    }

    @Override
    public String toString() {
        return this.q;
    }

    private static bye a(String $$0, acp<brc> $$12, @Nullable amg $$2) {
        return bye.a($$0, $$1 -> $$1.a($$12), $$1 -> $$1.a($$12), $$2);
    }

    private static bye a(String $$0, Predicate<he<brc>> $$1, Predicate<he<brc>> $$2, @Nullable amg $$3) {
        return bye.a($$0, $$1, $$2, (ImmutableSet<cfu>)ImmutableSet.of(), (ImmutableSet<cpn>)ImmutableSet.of(), $$3);
    }

    private static bye a(String $$0, acp<brc> $$12, ImmutableSet<cfu> $$2, ImmutableSet<cpn> $$3, @Nullable amg $$4) {
        return bye.a($$0, $$1 -> $$1.a($$12), $$1 -> $$1.a($$12), $$2, $$3, $$4);
    }

    private static bye a(String $$0, Predicate<he<brc>> $$1, Predicate<he<brc>> $$2, ImmutableSet<cfu> $$3, ImmutableSet<cpn> $$4, @Nullable amg $$5) {
        return hr.a(jb.A, new acq($$0), new bye($$0, $$1, $$2, $$3, $$4, $$5));
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bye.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "q", "r", "s", "t", "u", "v"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bye.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "q", "r", "s", "t", "u", "v"}, this, $$0);
    }

    public String a() {
        return this.q;
    }

    public Predicate<he<brc>> b() {
        return this.r;
    }

    public Predicate<he<brc>> c() {
        return this.s;
    }

    public ImmutableSet<cfu> d() {
        return this.t;
    }

    public ImmutableSet<cpn> e() {
        return this.u;
    }

    @Nullable
    public amg f() {
        return this.v;
    }
}

