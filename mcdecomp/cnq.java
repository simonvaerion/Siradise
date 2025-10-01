/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cnq {
    public static final Codec<cnq> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("fog_color").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("water_color").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("water_fog_color").forGetter($$0 -> $$0.d), (App)Codec.INT.fieldOf("sky_color").forGetter($$0 -> $$0.e), (App)Codec.INT.optionalFieldOf("foliage_color").forGetter($$0 -> $$0.f), (App)Codec.INT.optionalFieldOf("grass_color").forGetter($$0 -> $$0.g), (App)cnq$b.d.optionalFieldOf("grass_color_modifier", (Object)cnq$b.a).forGetter($$0 -> $$0.h), (App)cnj.a.optionalFieldOf("particle").forGetter($$0 -> $$0.i), (App)amg.b.optionalFieldOf("ambient_sound").forGetter($$0 -> $$0.j), (App)cni.a.optionalFieldOf("mood_sound").forGetter($$0 -> $$0.k), (App)cnh.a.optionalFieldOf("additions_sound").forGetter($$0 -> $$0.l), (App)ame.a.optionalFieldOf("music").forGetter($$0 -> $$0.m)).apply((Applicative)$$02, cnq::new));
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final Optional<Integer> f;
    private final Optional<Integer> g;
    private final b h;
    private final Optional<cnj> i;
    private final Optional<he<amg>> j;
    private final Optional<cni> k;
    private final Optional<cnh> l;
    private final Optional<ame> m;

    cnq(int $$0, int $$1, int $$2, int $$3, Optional<Integer> $$4, Optional<Integer> $$5, b $$6, Optional<cnj> $$7, Optional<he<amg>> $$8, Optional<cni> $$9, Optional<cnh> $$10, Optional<ame> $$11) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
        this.m = $$11;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public Optional<Integer> e() {
        return this.f;
    }

    public Optional<Integer> f() {
        return this.g;
    }

    public b g() {
        return this.h;
    }

    public Optional<cnj> h() {
        return this.i;
    }

    public Optional<he<amg>> i() {
        return this.j;
    }

    public Optional<cni> j() {
        return this.k;
    }

    public Optional<cnh> k() {
        return this.l;
    }

    public Optional<ame> l() {
        return this.m;
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static abstract class b
    extends Enum<b>
    implements apr {
        public static final /* enum */ b a = new b("none"){

            @Override
            public int a(double $$0, double $$1, int $$2) {
                return $$2;
            }
        };
        public static final /* enum */ b b = new b("dark_forest"){

            @Override
            public int a(double $$0, double $$1, int $$2) {
                return ($$2 & 0xFEFEFE) + 2634762 >> 1;
            }
        };
        public static final /* enum */ b c = new b("swamp"){

            @Override
            public int a(double $$0, double $$1, int $$2) {
                double $$3 = cnk.e.a($$0 * 0.0225, $$1 * 0.0225, false);
                if ($$3 < -0.1) {
                    return 5011004;
                }
                return 6975545;
            }
        };
        private final String e;
        public static final Codec<b> d;
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        public abstract int a(double var1, double var3, int var5);

        b(String $$0) {
            this.e = $$0;
        }

        public String a() {
            return this.e;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c};
        }

        static {
            f = cnq$b.b();
            d = apr.a(b::values);
        }
    }

    public static class a {
        private OptionalInt a = OptionalInt.empty();
        private OptionalInt b = OptionalInt.empty();
        private OptionalInt c = OptionalInt.empty();
        private OptionalInt d = OptionalInt.empty();
        private Optional<Integer> e = Optional.empty();
        private Optional<Integer> f = Optional.empty();
        private b g = cnq$b.a;
        private Optional<cnj> h = Optional.empty();
        private Optional<he<amg>> i = Optional.empty();
        private Optional<cni> j = Optional.empty();
        private Optional<cnh> k = Optional.empty();
        private Optional<ame> l = Optional.empty();

        public a a(int $$0) {
            this.a = OptionalInt.of($$0);
            return this;
        }

        public a b(int $$0) {
            this.b = OptionalInt.of($$0);
            return this;
        }

        public a c(int $$0) {
            this.c = OptionalInt.of($$0);
            return this;
        }

        public a d(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
        }

        public a e(int $$0) {
            this.e = Optional.of($$0);
            return this;
        }

        public a f(int $$0) {
            this.f = Optional.of($$0);
            return this;
        }

        public a a(b $$0) {
            this.g = $$0;
            return this;
        }

        public a a(cnj $$0) {
            this.h = Optional.of($$0);
            return this;
        }

        public a a(he<amg> $$0) {
            this.i = Optional.of($$0);
            return this;
        }

        public a a(cni $$0) {
            this.j = Optional.of($$0);
            return this;
        }

        public a a(cnh $$0) {
            this.k = Optional.of($$0);
            return this;
        }

        public a a(@Nullable ame $$0) {
            this.l = Optional.ofNullable($$0);
            return this;
        }

        public cnq a() {
            return new cnq(this.a.orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")), this.b.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")), this.c.orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")), this.d.orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
    }
}

