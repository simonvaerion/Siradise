/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public record dif(hr<dfl> b) {
    private final hr<dfl> b;
    public static final MapCodec<dif> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ht.b(jc.aI, Lifecycle.stable(), dfl.a).fieldOf("dimensions").forGetter(dif::d)).apply((Applicative)$$0, $$0.stable(dif::new)));
    private static final Set<acp<dfl>> c = ImmutableSet.of(dfl.b, dfl.c, dfl.d);
    private static final int d = c.size();

    public dif {
        dfl $$1 = $$0.a(dfl.b);
        if ($$1 == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
    }

    public static Stream<acp<dfl>> a(Stream<acp<dfl>> $$02) {
        return Stream.concat(c.stream(), $$02.filter($$0 -> !c.contains($$0)));
    }

    public dif a(hs $$0, ddy $$1) {
        hr<dfk> $$2 = $$0.d(jc.au);
        hr<dfl> $$3 = dif.a($$2, this.b, $$1);
        return new dif($$3);
    }

    public static hr<dfl> a(hr<dfk> $$0, hr<dfl> $$1, ddy $$2) {
        dfl $$3 = $$1.a(dfl.b);
        he<dfk> $$4 = $$3 == null ? $$0.f(dfi.a) : $$3.a();
        return dif.a($$1, $$4, $$2);
    }

    public static hr<dfl> a(hr<dfl> $$0, he<dfk> $$1, ddy $$2) {
        hm<dfl> $$3 = new hm<dfl>(jc.aI, Lifecycle.experimental());
        $$3.a(dfl.b, new dfl($$1, $$2), Lifecycle.stable());
        for (Map.Entry<acp<dfl>, dfl> $$4 : $$0.g()) {
            acp<dfl> $$5 = $$4.getKey();
            if ($$5 == dfl.b) continue;
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
        }
        return $$3.l();
    }

    public ddy a() {
        dfl $$0 = this.b.a(dfl.b);
        if ($$0 == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
        return $$0.b();
    }

    public Optional<dfl> a(acp<dfl> $$0) {
        return this.b.d($$0);
    }

    public ImmutableSet<acp<cmm>> b() {
        return (ImmutableSet)this.d().g().stream().map(Map.Entry::getKey).map(jc::a).collect(ImmutableSet.toImmutableSet());
    }

    public boolean c() {
        return this.a() instanceof dhb;
    }

    private static dzc.a b(hr<dfl> $$02) {
        return $$02.d(dfl.b).map($$0 -> {
            ddy $$1 = $$0.b();
            if ($$1 instanceof dhb) {
                return dzc.a.c;
            }
            if ($$1 instanceof dhf) {
                return dzc.a.b;
            }
            return dzc.a.a;
        }).orElse(dzc.a.a);
    }

    static Lifecycle a(acp<dfl> $$0, dfl $$1) {
        return dif.b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
    }

    private static boolean b(acp<dfl> $$0, dfl $$1) {
        if ($$0 == dfl.b) {
            return dif.a($$1);
        }
        if ($$0 == dfl.c) {
            return dif.b($$1);
        }
        if ($$0 == dfl.d) {
            return dif.c($$1);
        }
        return false;
    }

    private static boolean a(dfl $$0) {
        cnx $$2;
        he<dfk> $$1 = $$0.a();
        if (!$$1.a(dfi.a) && !$$1.a(dfi.d)) {
            return false;
        }
        cno cno2 = $$0.b().c();
        return !(cno2 instanceof cnx) || ($$2 = (cnx)cno2).a(cnz.b);
    }

    private static boolean b(dfl $$0) {
        cnx $$2;
        dhn $$1;
        Object object;
        return $$0.a().a(dfi.b) && (object = $$0.b()) instanceof dhn && ($$1 = (dhn)object).a(dhp.f) && (object = $$1.c()) instanceof cnx && ($$2 = (cnx)object).a(cnz.a);
    }

    private static boolean c(dfl $$0) {
        dhn $$1;
        ddy ddy2;
        return $$0.a().a(dfi.c) && (ddy2 = $$0.b()) instanceof dhn && ($$1 = (dhn)ddy2).a(dhp.g) && $$1.c() instanceof cob;
    }

    public b a(hr<dfl> $$0) {
        final class A
        extends Record {
            final acp<dfl> a;
            final dfl b;

            A(acp<dfl> $$0, dfl $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            Lifecycle c() {
                return dif.a(this.a, this.b);
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "key;value", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "key;value", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "key;value", "a", "b"}, this, $$0);
            }

            public acp<dfl> a() {
                return this.a;
            }

            public dfl b() {
                return this.b;
            }
        }
        Stream<acp<dfl>> $$12 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();
        ArrayList $$2 = new ArrayList();
        dif.a($$12).forEach($$22 -> $$0.d((acp<dfl>)$$22).or(() -> this.b.d((acp<dfl>)$$22)).ifPresent($$2 -> $$2.add(new A((acp<dfl>)$$22, (dfl)$$2))));
        Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
        hm<dfl> $$4 = new hm<dfl>(jc.aI, $$3);
        $$2.forEach($$1 -> $$4.a($$1.a, $$1.b, $$1.c()));
        hr<dfl> $$5 = $$4.l();
        dzc.a $$6 = dif.b($$5);
        return new b($$5.l(), $$6);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dif.class, "dimensions", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dif.class, "dimensions", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dif.class, "dimensions", "b"}, this, $$0);
    }

    public hr<dfl> d() {
        return this.b;
    }

    public record b(hr<dfl> a, dzc.a b) {
        private final hr<dfl> a;
        private final dzc.a b;

        public Lifecycle a() {
            return this.a.d();
        }

        public hs.b b() {
            return new hs.c(List.of(this.a)).c();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "dimensions;specialWorldProperty", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "dimensions;specialWorldProperty", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "dimensions;specialWorldProperty", "a", "b"}, this, $$0);
        }

        public hr<dfl> c() {
            return this.a;
        }

        public dzc.a d() {
            return this.b;
        }
    }
}

