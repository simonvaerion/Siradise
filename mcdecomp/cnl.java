/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class cnl {
    private static final Logger c = LogUtils.getLogger();
    public static final cnl a = new cnl((Map<dhg.a, hi<djn<?>>>)ImmutableMap.of(), (List<hi<dre>>)ImmutableList.of());
    public static final MapCodec<cnl> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.simpleMap(dhg.a.c, (Codec)djn.c.promotePartial(ac.a("Carver: ", arg_0 -> ((Logger)c).error(arg_0))), (Keyable)apr.a(dhg.a.values())).fieldOf("carvers").forGetter($$0 -> $$0.d), (App)dre.d.promotePartial(ac.a("Features: ", arg_0 -> ((Logger)c).error(arg_0))).fieldOf("features").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, cnl::new));
    private final Map<dhg.a, hi<djn<?>>> d;
    private final List<hi<dre>> e;
    private final Supplier<List<dkb<?, ?>>> f;
    private final Supplier<Set<dre>> g;

    cnl(Map<dhg.a, hi<djn<?>>> $$0, List<hi<dre>> $$1) {
        this.d = $$0;
        this.e = $$1;
        this.f = Suppliers.memoize(() -> (List)$$1.stream().flatMap(hi::a).map(he::a).flatMap(dre::a).filter($$0 -> $$0.b() == dko.g).collect(ImmutableList.toImmutableList()));
        this.g = Suppliers.memoize(() -> $$1.stream().flatMap(hi::a).map(he::a).collect(Collectors.toSet()));
    }

    public Iterable<he<djn<?>>> a(dhg.a $$0) {
        return Objects.requireNonNullElseGet((Iterable)this.d.get($$0), List::of);
    }

    public List<dkb<?, ?>> a() {
        return this.f.get();
    }

    public List<hi<dre>> b() {
        return this.e;
    }

    public boolean a(dre $$0) {
        return this.g.get().contains($$0);
    }

    public static class a
    extends b {
        private final hf<dre> a;
        private final hf<djn<?>> b;

        public a(hf<dre> $$0, hf<djn<?>> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(dhg.b $$0, acp<dre> $$1) {
            this.a($$0.ordinal(), this.a.b($$1));
            return this;
        }

        public a a(dhg.a $$0, acp<djn<?>> $$1) {
            this.a($$0, this.b.b($$1));
            return this;
        }
    }

    public static class b {
        private final Map<dhg.a, List<he<djn<?>>>> a = Maps.newLinkedHashMap();
        private final List<List<he<dre>>> b = Lists.newArrayList();

        public b a(dhg.b $$0, he<dre> $$1) {
            return this.a($$0.ordinal(), $$1);
        }

        public b a(int $$0, he<dre> $$1) {
            this.a($$0);
            this.b.get($$0).add($$1);
            return this;
        }

        public b a(dhg.a $$02, he<djn<?>> $$1) {
            this.a.computeIfAbsent($$02, $$0 -> Lists.newArrayList()).add($$1);
            return this;
        }

        private void a(int $$0) {
            while (this.b.size() <= $$0) {
                this.b.add(Lists.newArrayList());
            }
        }

        public cnl a() {
            return new cnl((Map)this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, $$0 -> hi.a((List)$$0.getValue()))), (List)this.b.stream().map(hi::a).collect(ImmutableList.toImmutableList()));
        }
    }
}

