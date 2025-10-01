/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fww {
    public static final fwu a = new fwu(fuu.e, new acq("block/fire_0"));
    public static final fwu b = new fwu(fuu.e, new acq("block/fire_1"));
    public static final fwu c = new fwu(fuu.e, new acq("block/lava_flow"));
    public static final fwu d = new fwu(fuu.e, new acq("block/water_flow"));
    public static final fwu e = new fwu(fuu.e, new acq("block/water_overlay"));
    public static final fwu f = new fwu(fkj.c, new acq("entity/banner_base"));
    public static final fwu g = new fwu(fkj.d, new acq("entity/shield_base"));
    public static final fwu h = new fwu(fkj.d, new acq("entity/shield_base_nopattern"));
    public static final int i = 10;
    public static final List<acq> j = IntStream.range(0, 10).mapToObj($$0 -> new acq("block/destroy_stage_" + $$0)).collect(Collectors.toList());
    public static final List<acq> k = j.stream().map($$0 -> new acq("textures/" + $$0.a() + ".png")).collect(Collectors.toList());
    public static final List<fkf> l = k.stream().map(fkf::q).collect(Collectors.toList());
    static final int m = -1;
    private static final int t = 0;
    private static final Logger u = LogUtils.getLogger();
    private static final String v = "builtin/";
    private static final String w = "builtin/generated";
    private static final String x = "builtin/entity";
    private static final String y = "missing";
    public static final fwy n = fwy.c("builtin/missing", "missing");
    public static final acj o = acj.a("blockstates");
    public static final acj p = acj.a("models");
    @VisibleForTesting
    public static final String q = ("{    'textures': {       'particle': '" + ful.b().a() + "',       'missingno': '" + ful.b().a() + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}").replace('\'', '\"');
    private static final Map<String, String> z = Maps.newHashMap((Map)ImmutableMap.of((Object)"missing", (Object)q));
    private static final Splitter A = Splitter.on((char)',');
    private static final Splitter B = Splitter.on((char)'=').limit(2);
    public static final fkw r = ac.a(fkw.a("{\"gui_light\": \"front\"}"), (T $$0) -> {
        $$0.c = "generation marker";
    });
    public static final fkw s = ac.a(fkw.a("{\"gui_light\": \"side\"}"), (T $$0) -> {
        $$0.c = "block entity marker";
    });
    private static final dcc<cpn, dcb> C = new dcc.a(cpo.a).a(new dde[]{dcs.a("map")}).a(cpn::n, dcb::new);
    static final fkz D = new fkz();
    private static final Map<acq, dcc<cpn, dcb>> E = ImmutableMap.of((Object)new acq("item_frame"), C, (Object)new acq("glow_item_frame"), C);
    private final eoo F;
    private final Map<acq, fkw> G;
    private final Map<acq, List<c>> H;
    private final Set<acq> I = Sets.newHashSet();
    private final fkx.a J = new fkx.a();
    private final Map<acq, fxc> K = Maps.newHashMap();
    final Map<a, fwr> L = Maps.newHashMap();
    private final Map<acq, fxc> M = Maps.newHashMap();
    private final Map<acq, fwr> N = Maps.newHashMap();
    private int O = 1;
    private final Object2IntMap<dcb> P = (Object2IntMap)ac.a(new Object2IntOpenHashMap(), (T $$0) -> $$0.defaultReturnValue(-1));

    public fww(eoo $$02, ban $$1, Map<acq, fkw> $$2, Map<acq, List<c>> $$3) {
        this.F = $$02;
        this.G = $$2;
        this.H = $$3;
        $$1.a("missing_model");
        try {
            this.K.put(n, this.c(n));
            this.a(n);
        }
        catch (IOException $$4) {
            u.error("Error loading missing model, should never happen :(", (Throwable)$$4);
            throw new RuntimeException($$4);
        }
        $$1.b("static_definitions");
        E.forEach(($$0, $$12) -> $$12.a().forEach($$1 -> this.a(fkn.a($$0, $$1))));
        $$1.b("blocks");
        for (cpn $$5 : jb.f) {
            $$5.l().a().forEach($$0 -> this.a(fkn.c($$0)));
        }
        $$1.b("items");
        for (acq $$6 : jb.i.e()) {
            this.a(new fwy($$6, "inventory"));
        }
        $$1.b("special");
        this.a(fpw.i);
        this.a(fpw.j);
        this.M.values().forEach($$0 -> $$0.a(this::a));
        $$1.c();
    }

    public void a(BiFunction<acq, fwu, fuv> $$0) {
        this.M.keySet().forEach($$1 -> {
            fwr $$2 = null;
            try {
                $$2 = new d($$0, (acq)$$1).a((acq)$$1, fws.a);
            }
            catch (Exception $$3) {
                u.warn("Unable to bake model: '{}': {}", $$1, (Object)$$3);
            }
            if ($$2 != null) {
                this.N.put((acq)$$1, $$2);
            }
        });
    }

    private static Predicate<dcb> a(dcc<cpn, dcb> $$0, String $$1) {
        HashMap $$22 = Maps.newHashMap();
        for (String $$3 : A.split((CharSequence)$$1)) {
            Iterator $$4 = B.split((CharSequence)$$3).iterator();
            if (!$$4.hasNext()) continue;
            String $$5 = (String)$$4.next();
            dde<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
                String $$7 = (String)$$4.next();
                Object $$8 = fww.a($$6, $$7);
                if ($$8 != null) {
                    $$22.put($$6, $$8);
                    continue;
                }
                throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
            }
            if ($$5.isEmpty()) continue;
            throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
        }
        cpn $$9 = $$0.c();
        return $$2 -> {
            if ($$2 == null || !$$2.a($$9)) {
                return false;
            }
            for (Map.Entry $$3 : $$22.entrySet()) {
                if (Objects.equals($$2.c((dde)$$3.getKey()), $$3.getValue())) continue;
                return false;
            }
            return true;
        };
    }

    @Nullable
    static <T extends Comparable<T>> T a(dde<T> $$0, String $$1) {
        return (T)((Comparable)$$0.b($$1).orElse(null));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fxc a(acq $$0) {
        if (this.K.containsKey($$0)) {
            return this.K.get($$0);
        }
        if (this.I.contains($$0)) {
            throw new IllegalStateException("Circular reference while loading " + $$0);
        }
        this.I.add($$0);
        fxc $$1 = this.K.get(n);
        while (!this.I.isEmpty()) {
            acq $$2 = this.I.iterator().next();
            try {
                if (this.K.containsKey($$2)) continue;
                this.b($$2);
            }
            catch (b $$3) {
                u.warn($$3.getMessage());
                this.K.put($$2, $$1);
            }
            catch (Exception $$4) {
                u.warn("Unable to load model: '{}' referenced from: {}: {}", new Object[]{$$2, $$0, $$4});
                this.K.put($$2, $$1);
            }
            finally {
                this.I.remove($$2);
            }
        }
        return this.K.getOrDefault($$0, $$1);
    }

    private void b(acq $$02) throws Exception {
        if (!($$02 instanceof fwy)) {
            this.a($$02, this.c($$02));
            return;
        }
        fwy $$12 = (fwy)$$02;
        if (Objects.equals($$12.f(), "inventory")) {
            acq $$22 = $$02.d("item/");
            fkw $$3 = this.c($$22);
            this.a((acq)$$12, $$3);
            this.K.put($$22, $$3);
        } else {
            acq $$42 = new acq($$02.b(), $$02.a());
            dcc $$52 = Optional.ofNullable(E.get($$42)).orElseGet(() -> jb.f.a($$42).l());
            this.J.a($$52);
            ImmutableList $$6 = ImmutableList.copyOf(this.F.a((cpn)$$52.c()));
            ImmutableList $$7 = $$52.a();
            HashMap $$8 = Maps.newHashMap();
            $$7.forEach($$2 -> $$8.put(fkn.a($$42, $$2), $$2));
            HashMap $$9 = Maps.newHashMap();
            acq $$10 = o.a($$02);
            fxc $$11 = this.K.get(n);
            e $$122 = new e((List<fxc>)ImmutableList.of((Object)$$11), (List<Object>)ImmutableList.of());
            Pair $$13 = Pair.of((Object)$$11, () -> $$122);
            try {
                List<Pair> $$14 = this.H.getOrDefault($$10, List.of()).stream().map($$1 -> {
                    try {
                        return Pair.of((Object)$$1.a, (Object)fkx.a(this.J, $$1.b));
                    }
                    catch (Exception $$2) {
                        throw new b(String.format(Locale.ROOT, "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", $$10, $$1.a, $$2.getMessage()));
                    }
                }).toList();
                for (Pair $$15 : $$14) {
                    flj $$19;
                    fkx $$16 = (fkx)$$15.getSecond();
                    IdentityHashMap $$17 = Maps.newIdentityHashMap();
                    if ($$16.c()) {
                        flj $$18 = $$16.d();
                        $$7.forEach(arg_0 -> fww.a($$17, $$18, (List)$$6, arg_0));
                    } else {
                        $$19 = null;
                    }
                    $$16.a().forEach((arg_0, arg_1) -> fww.a($$7, $$52, $$17, (List)$$6, $$19, $$13, $$16, $$10, $$15, arg_0, arg_1));
                    $$9.putAll($$17);
                }
            }
            catch (b $$21) {
                throw $$21;
            }
            catch (Exception $$22) {
                throw new b(String.format(Locale.ROOT, "Exception loading blockstate definition: '%s': %s", $$10, $$22));
            }
            finally {
                HashMap $$23 = Maps.newHashMap();
                $$8.forEach(($$4, $$5) -> {
                    Pair $$6 = (Pair)$$9.get($$5);
                    if ($$6 == null) {
                        u.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", (Object)$$10, $$4);
                        $$6 = $$13;
                    }
                    this.a((acq)$$4, (fxc)$$6.getFirst());
                    try {
                        e $$7 = (e)((Supplier)$$6.getSecond()).get();
                        $$23.computeIfAbsent($$7, $$0 -> Sets.newIdentityHashSet()).add($$5);
                    }
                    catch (Exception $$8) {
                        u.warn("Exception evaluating model definition: '{}'", $$4, (Object)$$8);
                    }
                });
                $$23.forEach(($$0, $$1) -> {
                    Iterator $$2 = $$1.iterator();
                    while ($$2.hasNext()) {
                        dcb $$3 = (dcb)$$2.next();
                        if ($$3.l() == cvs.c) continue;
                        $$2.remove();
                        this.P.put((Object)$$3, 0);
                    }
                    if ($$1.size() > 1) {
                        this.a((Iterable<dcb>)$$1);
                    }
                });
            }
        }
    }

    private void a(acq $$0, fxc $$1) {
        this.K.put($$0, $$1);
        this.I.addAll($$1.f());
    }

    private void a(fwy $$0) {
        fxc $$1 = this.a((acq)$$0);
        this.K.put($$0, $$1);
        this.M.put($$0, $$1);
    }

    private void a(Iterable<dcb> $$0) {
        int $$12 = this.O++;
        $$0.forEach($$1 -> this.P.put($$1, $$12));
    }

    private fkw c(acq $$0) throws IOException {
        String $$1 = $$0.a();
        if (w.equals($$1)) {
            return r;
        }
        if (x.equals($$1)) {
            return s;
        }
        if ($$1.startsWith(v)) {
            String $$2 = $$1.substring(v.length());
            String $$3 = z.get($$2);
            if ($$3 == null) {
                throw new FileNotFoundException($$0.toString());
            }
            StringReader $$4 = new StringReader($$3);
            fkw $$5 = fkw.a($$4);
            $$5.c = $$0.toString();
            return $$5;
        }
        acq $$6 = p.a($$0);
        fkw $$7 = this.G.get($$6);
        if ($$7 == null) {
            throw new FileNotFoundException($$6.toString());
        }
        $$7.c = $$0.toString();
        return $$7;
    }

    public Map<acq, fwr> a() {
        return this.N;
    }

    public Object2IntMap<dcb> b() {
        return this.P;
    }

    private static /* synthetic */ void a(ImmutableList $$0, dcc $$1, Map $$2, List $$3, flj $$4, Pair $$5, fkx $$62, acq $$7, Pair $$8, String $$9, fle $$10) {
        try {
            $$0.stream().filter(fww.a($$1, $$9)).forEach($$6 -> {
                Pair $$7 = $$2.put($$6, Pair.of((Object)$$10, () -> fww$e.a($$6, $$10, $$3)));
                if ($$7 != null && $$7.getFirst() != $$4) {
                    $$2.put($$6, $$5);
                    throw new RuntimeException("Overlapping definition with: " + (String)$$62.a().entrySet().stream().filter($$1 -> $$1.getValue() == $$7.getFirst()).findFirst().get().getKey());
                }
            });
        }
        catch (Exception $$11) {
            u.warn("Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}", new Object[]{$$7, $$8.getFirst(), $$9, $$11.getMessage()});
        }
    }

    private static /* synthetic */ void a(Map $$0, flj $$1, List $$2, dcb $$3) {
        $$0.put($$3, Pair.of((Object)$$1, () -> fww$e.a($$3, $$1, $$2)));
    }

    static class b
    extends RuntimeException {
        public b(String $$0) {
            super($$0);
        }
    }

    static class e {
        private final List<fxc> a;
        private final List<Object> b;

        public e(List<fxc> $$0, List<Object> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 instanceof e) {
                e $$1 = (e)$$0;
                return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
            }
            return false;
        }

        public int hashCode() {
            return 31 * this.a.hashCode() + this.b.hashCode();
        }

        public static e a(dcb $$0, flj $$1, Collection<dde<?>> $$22) {
            dcc<cpn, dcb> $$3 = $$0.b().l();
            List $$4 = (List)$$1.a().stream().filter($$2 -> $$2.a($$3).test($$0)).map(fll::a).collect(ImmutableList.toImmutableList());
            List<Object> $$5 = fww$e.a($$0, $$22);
            return new e($$4, $$5);
        }

        public static e a(dcb $$0, fxc $$1, Collection<dde<?>> $$2) {
            List<Object> $$3 = fww$e.a($$0, $$2);
            return new e((List<fxc>)ImmutableList.of((Object)$$1), $$3);
        }

        private static List<Object> a(dcb $$0, Collection<dde<?>> $$1) {
            return (List)$$1.stream().map($$0::c).collect(ImmutableList.toImmutableList());
        }
    }

    public static final class c
    extends Record {
        final String a;
        final JsonElement b;

        public c(String $$0, JsonElement $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "source;data", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "source;data", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "source;data", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public JsonElement b() {
            return this.b;
        }
    }

    class d
    implements fwv {
        private final Function<fwu, fuv> b = $$2 -> (fuv)$$0.apply($$1, (fwu)$$2);

        d(BiFunction<acq, fwu, fuv> $$0, acq $$1) {
        }

        @Override
        public fxc a(acq $$0) {
            return fww.this.a($$0);
        }

        @Override
        public fwr a(acq $$0, fwz $$1) {
            fkw $$5;
            a $$2 = new a($$0, $$1.b(), $$1.c());
            fwr $$3 = fww.this.L.get($$2);
            if ($$3 != null) {
                return $$3;
            }
            fxc $$4 = this.a($$0);
            if ($$4 instanceof fkw && ($$5 = (fkw)$$4).g() == r) {
                return D.a(this.b, $$5).a(this, $$5, this.b, $$1, $$0, false);
            }
            fwr $$6 = $$4.a(this, this.b, $$1, $$0);
            fww.this.L.put($$2, $$6);
            return $$6;
        }
    }

    record a(acq a, j b, boolean c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;transformation;isUvLocked", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;transformation;isUvLocked", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;transformation;isUvLocked", "a", "b", "c"}, this, $$0);
        }
    }
}

