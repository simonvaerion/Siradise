/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class enb
extends amk {
    private static final Logger c = LogUtils.getLogger();
    private Map<enw, List<eyg>> d = ImmutableMap.of();
    private List<eyg> e = ImmutableList.of();

    public void a(Iterable<cjc<?>> $$0, hs $$1) {
        Map<enw, List<List<cjc<?>>>> $$22 = enb.a($$0);
        HashMap $$32 = Maps.newHashMap();
        ImmutableList.Builder $$42 = ImmutableList.builder();
        $$22.forEach(($$3, $$4) -> $$32.put($$3, (List)$$4.stream().map($$1 -> new eyg($$1, (List<cjc<?>>)$$1)).peek(arg_0 -> ((ImmutableList.Builder)$$42).add(arg_0)).collect(ImmutableList.toImmutableList())));
        enw.w.forEach(($$12, $$2) -> $$32.put($$12, (List)$$2.stream().flatMap($$1 -> ((List)$$32.getOrDefault($$1, ImmutableList.of())).stream()).collect(ImmutableList.toImmutableList())));
        this.d = ImmutableMap.copyOf((Map)$$32);
        this.e = $$42.build();
    }

    private static Map<enw, List<List<cjc<?>>>> a(Iterable<cjc<?>> $$02) {
        HashMap $$1 = Maps.newHashMap();
        HashBasedTable $$2 = HashBasedTable.create();
        for (cjc<?> $$3 : $$02) {
            if ($$3.ai_() || $$3.j()) continue;
            enw $$4 = enb.g($$3);
            String $$5 = $$3.c();
            if ($$5.isEmpty()) {
                $$1.computeIfAbsent($$4, $$0 -> Lists.newArrayList()).add(ImmutableList.of($$3));
                continue;
            }
            List $$6 = (List)$$2.get((Object)$$4, (Object)$$5);
            if ($$6 == null) {
                $$6 = Lists.newArrayList();
                $$2.put((Object)$$4, (Object)$$5, (Object)$$6);
                $$1.computeIfAbsent($$4, $$0 -> Lists.newArrayList()).add($$6);
            }
            $$6.add($$3);
        }
        return $$1;
    }

    private static enw g(cjc<?> $$0) {
        if ($$0 instanceof cit) {
            cit $$1 = (cit)$$0;
            return switch ($$1.d()) {
                default -> throw new IncompatibleClassChangeError();
                case cis.a -> enw.b;
                case cis.c -> enw.d;
                case cis.b -> enw.c;
                case cis.d -> enw.e;
            };
        }
        cjf<?> $$2 = $$0.f();
        if ($$0 instanceof cil) {
            cil $$3 = (cil)$$0;
            cir $$4 = $$3.g();
            if ($$2 == cjf.b) {
                return switch ($$4) {
                    default -> throw new IncompatibleClassChangeError();
                    case cir.b -> enw.h;
                    case cir.a -> enw.g;
                    case cir.c -> enw.i;
                };
            }
            if ($$2 == cjf.c) {
                return $$4 == cir.b ? enw.k : enw.l;
            }
            if ($$2 == cjf.d) {
                return enw.n;
            }
            if ($$2 == cjf.e) {
                return enw.q;
            }
        }
        if ($$2 == cjf.f) {
            return enw.o;
        }
        if ($$2 == cjf.g) {
            return enw.p;
        }
        c.warn("Unknown recipe category: {}/{}", LogUtils.defer(() -> jb.t.b($$0.f())), LogUtils.defer($$0::e));
        return enw.r;
    }

    public List<eyg> b() {
        return this.e;
    }

    public List<eyg> a(enw $$0) {
        return this.d.getOrDefault((Object)$$0, Collections.emptyList());
    }
}

