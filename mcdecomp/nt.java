/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class nt {
    public static final acp<dtj> a = nt.a("empty");

    public static acp<dtj> a(String $$0) {
        return acp.a(jc.aC, new acq($$0));
    }

    public static void a(nm<dtj> $$0, String $$1, dtj $$2) {
        $$0.a(nt.a($$1), $$2);
    }

    public static void a(nm<dtj> $$0) {
        hf<dtj> $$1 = $$0.a(jc.aC);
        he.c<dtj> $$2 = $$1.b(a);
        $$0.a(a, new dtj($$2, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of(), dtj.a.b));
        ni.a($$0);
        nr.a($$0);
        od.a($$0);
        nd.a($$0);
        oc.a($$0);
    }
}

