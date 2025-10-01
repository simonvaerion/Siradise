/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public final class enw
extends Enum<enw> {
    public static final /* enum */ enw a = new enw(new cfz(cgc.qe));
    public static final /* enum */ enw b = new enw(new cfz(cpo.cj));
    public static final /* enum */ enw c = new enw(new cfz(cgc.ll));
    public static final /* enum */ enw d = new enw(new cfz(cgc.op), new cfz(cgc.oh));
    public static final /* enum */ enw e = new enw(new cfz(cgc.pM), new cfz(cgc.nF));
    public static final /* enum */ enw f = new enw(new cfz(cgc.qe));
    public static final /* enum */ enw g = new enw(new cfz(cgc.pj));
    public static final /* enum */ enw h = new enw(new cfz(cpo.b));
    public static final /* enum */ enw i = new enw(new cfz(cgc.pM), new cfz(cgc.nL));
    public static final /* enum */ enw j = new enw(new cfz(cgc.qe));
    public static final /* enum */ enw k = new enw(new cfz(cpo.dI));
    public static final /* enum */ enw l = new enw(new cfz(cgc.on), new cfz(cgc.pc));
    public static final /* enum */ enw m = new enw(new cfz(cgc.qe));
    public static final /* enum */ enw n = new enw(new cfz(cgc.pj));
    public static final /* enum */ enw o = new enw(new cfz(cgc.fj));
    public static final /* enum */ enw p = new enw(new cfz(cgc.pf));
    public static final /* enum */ enw q = new enw(new cfz(cgc.pj));
    public static final /* enum */ enw r = new enw(new cfz(cgc.hf));
    public static final List<enw> s;
    public static final List<enw> t;
    public static final List<enw> u;
    public static final List<enw> v;
    public static final Map<enw, List<enw>> w;
    private final List<cfz> x;
    private static final /* synthetic */ enw[] y;

    public static enw[] values() {
        return (enw[])y.clone();
    }

    public static enw valueOf(String $$0) {
        return Enum.valueOf(enw.class, $$0);
    }

    private enw(cfz ... $$0) {
        this.x = ImmutableList.copyOf((Object[])$$0);
    }

    public static List<enw> a(ccq $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case ccq.a -> v;
            case ccq.b -> u;
            case ccq.c -> t;
            case ccq.d -> s;
        };
    }

    public List<cfz> a() {
        return this.x;
    }

    private static /* synthetic */ enw[] b() {
        return new enw[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
    }

    static {
        y = enw.b();
        s = ImmutableList.of((Object)((Object)m), (Object)((Object)n));
        t = ImmutableList.of((Object)((Object)j), (Object)((Object)k), (Object)((Object)l));
        u = ImmutableList.of((Object)((Object)f), (Object)((Object)g), (Object)((Object)h), (Object)((Object)i));
        v = ImmutableList.of((Object)((Object)a), (Object)((Object)d), (Object)((Object)b), (Object)((Object)e), (Object)((Object)c));
        w = ImmutableMap.of((Object)((Object)a), (Object)ImmutableList.of((Object)((Object)d), (Object)((Object)b), (Object)((Object)e), (Object)((Object)c)), (Object)((Object)f), (Object)ImmutableList.of((Object)((Object)g), (Object)((Object)h), (Object)((Object)i)), (Object)((Object)j), (Object)ImmutableList.of((Object)((Object)k), (Object)((Object)l)), (Object)((Object)m), (Object)ImmutableList.of((Object)((Object)n)));
    }
}

