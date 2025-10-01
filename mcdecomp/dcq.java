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

public final class dcq
extends Record {
    private final String p;
    private final boolean q;
    private final cxa r;
    private final amg s;
    private final amg t;
    private final amg u;
    private final amg v;
    private final amg w;
    private final amg x;
    private final amg y;
    private final amg z;
    private static final Set<dcq> A = new ObjectArraySet();
    public static final dcq a = dcq.a(new dcq("iron", false, cxa.g, amh.lK, amh.lL, amh.lS, amh.lT, amh.nd, amh.ne, amh.xl, amh.xm));
    public static final dcq b = dcq.a(new dcq("gold", false, cxa.g, amh.lK, amh.lL, amh.lS, amh.lT, amh.nd, amh.ne, amh.xl, amh.xm));
    public static final dcq c = dcq.a(new dcq("stone", true, cxa.f, amh.lK, amh.lL, amh.lS, amh.lT, amh.xq, amh.xr, amh.xl, amh.xm));
    public static final dcq d = dcq.a(new dcq("polished_blackstone", true, cxa.f, amh.lK, amh.lL, amh.lS, amh.lT, amh.xq, amh.xr, amh.xl, amh.xm));
    public static final dcq e = dcq.a(new dcq("oak"));
    public static final dcq f = dcq.a(new dcq("spruce"));
    public static final dcq g = dcq.a(new dcq("birch"));
    public static final dcq h = dcq.a(new dcq("acacia"));
    public static final dcq i = dcq.a(new dcq("cherry", true, cxa.aQ, amh.dX, amh.dY, amh.dZ, amh.ea, amh.ed, amh.ee, amh.eb, amh.ec));
    public static final dcq j = dcq.a(new dcq("jungle"));
    public static final dcq k = dcq.a(new dcq("dark_oak"));
    public static final dcq l = dcq.a(new dcq("crimson", true, cxa.aP, amh.pf, amh.pg, amh.ph, amh.pi, amh.pl, amh.pm, amh.pj, amh.pk));
    public static final dcq m = dcq.a(new dcq("warped", true, cxa.aP, amh.pf, amh.pg, amh.ph, amh.pi, amh.pl, amh.pm, amh.pj, amh.pk));
    public static final dcq n = dcq.a(new dcq("mangrove"));
    public static final dcq o = dcq.a(new dcq("bamboo", true, cxa.aO, amh.aZ, amh.ba, amh.bb, amh.bc, amh.bf, amh.bg, amh.bd, amh.be));

    public dcq(String $$0) {
        this($$0, true, cxa.b, amh.Ar, amh.As, amh.At, amh.Au, amh.Ax, amh.Ay, amh.Av, amh.Aw);
    }

    public dcq(String $$0, boolean $$1, cxa $$2, amg $$3, amg $$4, amg $$5, amg $$6, amg $$7, amg $$8, amg $$9, amg $$10) {
        this.p = $$0;
        this.q = $$1;
        this.r = $$2;
        this.s = $$3;
        this.t = $$4;
        this.u = $$5;
        this.v = $$6;
        this.w = $$7;
        this.x = $$8;
        this.y = $$9;
        this.z = $$10;
    }

    private static dcq a(dcq $$0) {
        A.add($$0);
        return $$0;
    }

    public static Stream<dcq> a() {
        return A.stream();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dcq.class, "name;canOpenByHand;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dcq.class, "name;canOpenByHand;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dcq.class, "name;canOpenByHand;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, this, $$0);
    }

    public String b() {
        return this.p;
    }

    public boolean c() {
        return this.q;
    }

    public cxa d() {
        return this.r;
    }

    public amg e() {
        return this.s;
    }

    public amg f() {
        return this.t;
    }

    public amg g() {
        return this.u;
    }

    public amg h() {
        return this.v;
    }

    public amg i() {
        return this.w;
    }

    public amg j() {
        return this.x;
    }

    public amg k() {
        return this.y;
    }

    public amg l() {
        return this.z;
    }
}

