/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dsa {
    public static final Codec<dsa> a = jb.U.q().dispatch(dsa::e, dsj::codec);
    public static final Codec<he<dsa>> b = acm.a(jc.az, a);
    protected final c c;

    public static <S extends dsa> RecordCodecBuilder<S, c> a(RecordCodecBuilder.Instance<S> $$02) {
        return dsa$c.a.forGetter($$0 -> $$0.c);
    }

    public static <S extends dsa> Codec<S> a(Function<c, S> $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group(dsa.a($$1)).apply((Applicative)$$1, $$0));
    }

    protected dsa(c $$0) {
        this.c = $$0;
    }

    public hi<cnk> a() {
        return this.c.b;
    }

    public Map<bgc, dsh> b() {
        return this.c.c;
    }

    public dhg.b c() {
        return this.c.d;
    }

    public dsl d() {
        return this.c.e;
    }

    public drs a(drs $$0) {
        if (this.d() != dsl.a) {
            return $$0.a(12);
        }
        return $$0;
    }

    public dsi a(hs $$0, ddy $$1, cno $$2, dhy $$3, dvu $$4, long $$5, clt $$6, int $$7, cmo $$8, Predicate<he<cnk>> $$9) {
        dss $$12;
        dsi $$13;
        a $$10 = new a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
        Optional<b> $$11 = this.b($$10);
        if ($$11.isPresent() && ($$13 = new dsi(this, $$6, $$7, ($$12 = $$11.get().a()).a())).b()) {
            return $$13;
        }
        return dsi.b;
    }

    protected static Optional<b> a(a $$0, dhk.a $$1, Consumer<dss> $$2) {
        clt $$3 = $$0.h();
        int $$4 = $$3.b();
        int $$5 = $$3.c();
        int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
        return Optional.of(new b(new gu($$4, $$6, $$5), $$2));
    }

    private static boolean a(b $$0, a $$1) {
        gu $$2 = $$0.b();
        return $$1.j.test($$1.b.c().getNoiseBiome(hq.a($$2.u()), hq.a($$2.v()), hq.a($$2.w()), $$1.d.b()));
    }

    public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, dsp $$6) {
    }

    private static int[] b(a $$0, int $$1, int $$2, int $$3, int $$4) {
        ddy $$5 = $$0.b();
        cmo $$6 = $$0.i();
        dhy $$7 = $$0.d();
        return new int[]{$$5.c($$1, $$3, dhk.a.a, $$6, $$7), $$5.c($$1, $$3 + $$4, dhk.a.a, $$6, $$7), $$5.c($$1 + $$2, $$3, dhk.a.a, $$6, $$7), $$5.c($$1 + $$2, $$3 + $$4, dhk.a.a, $$6, $$7)};
    }

    protected static int a(a $$0, int $$1, int $$2) {
        clt $$3 = $$0.h();
        int $$4 = $$3.d();
        int $$5 = $$3.e();
        return dsa.a($$0, $$4, $$5, $$1, $$2);
    }

    protected static int a(a $$0, int $$1, int $$2, int $$3, int $$4) {
        int[] $$5 = dsa.b($$0, $$1, $$3, $$2, $$4);
        return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
    }

    @Deprecated
    protected gu a(a $$0, cvz $$1) {
        int $$2 = 5;
        int $$3 = 5;
        if ($$1 == cvz.b) {
            $$2 = -5;
        } else if ($$1 == cvz.c) {
            $$2 = -5;
            $$3 = -5;
        } else if ($$1 == cvz.d) {
            $$3 = -5;
        }
        clt $$4 = $$0.h();
        int $$5 = $$4.a(7);
        int $$6 = $$4.b(7);
        return new gu($$5, dsa.a($$0, $$5, $$6, $$2, $$3), $$6);
    }

    protected abstract Optional<b> a(a var1);

    public Optional<b> b(a $$0) {
        return this.a($$0).filter($$1 -> dsa.a($$1, $$0));
    }

    public abstract dsj<?> e();

    public static final class c
    extends Record {
        final hi<cnk> b;
        final Map<bgc, dsh> c;
        final dhg.b d;
        final dsl e;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ht.a(jc.ap).fieldOf("biomes").forGetter(c::a), (App)Codec.simpleMap(bgc.i, dsh.a, (Keyable)apr.a(bgc.values())).fieldOf("spawn_overrides").forGetter(c::b), (App)dhg.b.l.fieldOf("step").forGetter(c::c), (App)dsl.e.optionalFieldOf("terrain_adaptation", (Object)dsl.a).forGetter(c::d)).apply((Applicative)$$0, c::new));

        public c(hi<cnk> $$0, Map<bgc, dsh> $$1, dhg.b $$2, dsl $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "biomes;spawnOverrides;step;terrainAdaptation", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "biomes;spawnOverrides;step;terrainAdaptation", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "biomes;spawnOverrides;step;terrainAdaptation", "b", "c", "d", "e"}, this, $$0);
        }

        public hi<cnk> a() {
            return this.b;
        }

        public Map<bgc, dsh> b() {
            return this.c;
        }

        public dhg.b c() {
            return this.d;
        }

        public dsl d() {
            return this.e;
        }
    }

    public static final class a
    extends Record {
        private final hs a;
        final ddy b;
        private final cno c;
        final dhy d;
        private final dvu e;
        private final dij f;
        private final long g;
        private final clt h;
        private final cmo i;
        final Predicate<he<cnk>> j;

        public a(hs $$0, ddy $$1, cno $$2, dhy $$3, dvu $$4, long $$5, clt $$6, cmo $$7, Predicate<he<cnk>> $$8) {
            this($$0, $$1, $$2, $$3, $$4, dsa$a.a($$5, $$6), $$5, $$6, $$7, $$8);
        }

        public a(hs $$0, ddy $$1, cno $$2, dhy $$3, dvu $$4, dij $$5, long $$6, clt $$7, cmo $$8, Predicate<he<cnk>> $$9) {
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
        }

        private static dij a(long $$0, clt $$1) {
            dij $$2 = new dij(new dhl(0L));
            $$2.c($$0, $$1.e, $$1.f);
            return $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }

        public hs a() {
            return this.a;
        }

        public ddy b() {
            return this.b;
        }

        public cno c() {
            return this.c;
        }

        public dhy d() {
            return this.d;
        }

        public dvu e() {
            return this.e;
        }

        public dij f() {
            return this.f;
        }

        public long g() {
            return this.g;
        }

        public clt h() {
            return this.h;
        }

        public cmo i() {
            return this.i;
        }

        public Predicate<he<cnk>> j() {
            return this.j;
        }
    }

    public record b(gu a, Either<Consumer<dss>, dss> b) {
        private final gu a;
        private final Either<Consumer<dss>, dss> b;

        public b(gu $$0, Consumer<dss> $$1) {
            this($$0, (Either<Consumer<dss>, dss>)Either.left($$1));
        }

        public dss a() {
            return (dss)this.b.map($$0 -> {
                dss $$1 = new dss();
                $$0.accept($$1);
                return $$1;
            }, $$0 -> $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "position;generator", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "position;generator", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "position;generator", "a", "b"}, this, $$0);
        }

        public gu b() {
            return this.a;
        }

        public Either<Consumer<dss>, dss> c() {
            return this.b;
        }
    }
}

