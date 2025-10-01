/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class byg {
    public static final byg a = byg.a("desert");
    public static final byg b = byg.a("jungle");
    public static final byg c = byg.a("plains");
    public static final byg d = byg.a("savanna");
    public static final byg e = byg.a("snow");
    public static final byg f = byg.a("swamp");
    public static final byg g = byg.a("taiga");
    private final String h;
    private static final Map<acp<cnk>, byg> i = ac.a(Maps.newHashMap(), $$0 -> {
        $$0.put(cnr.A, a);
        $$0.put(cnr.f, a);
        $$0.put(cnr.B, a);
        $$0.put(cnr.C, a);
        $$0.put(cnr.z, b);
        $$0.put(cnr.x, b);
        $$0.put(cnr.y, b);
        $$0.put(cnr.s, d);
        $$0.put(cnr.r, d);
        $$0.put(cnr.w, d);
        $$0.put(cnr.X, e);
        $$0.put(cnr.W, e);
        $$0.put(cnr.L, e);
        $$0.put(cnr.e, e);
        $$0.put(cnr.N, e);
        $$0.put(cnr.q, e);
        $$0.put(cnr.d, e);
        $$0.put(cnr.F, e);
        $$0.put(cnr.G, e);
        $$0.put(cnr.H, e);
        $$0.put(cnr.I, e);
        $$0.put(cnr.g, f);
        $$0.put(cnr.h, f);
        $$0.put(cnr.o, g);
        $$0.put(cnr.n, g);
        $$0.put(cnr.u, g);
        $$0.put(cnr.t, g);
        $$0.put(cnr.p, g);
        $$0.put(cnr.v, g);
    });

    private byg(String $$0) {
        this.h = $$0;
    }

    public String toString() {
        return this.h;
    }

    private static byg a(String $$0) {
        return hr.a(jb.z, new acq($$0), new byg($$0));
    }

    public static byg a(he<cnk> $$0) {
        return $$0.e().map(i::get).orElse(c);
    }
}

