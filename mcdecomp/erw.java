/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erw
implements egm {
    static final Logger a = LogUtils.getLogger();
    private final ehk b;
    private final erl<b> c;

    erw(ehk $$0, erl<b> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void close() {
        this.b.close();
    }

    @Override
    @Nullable
    public egl a(int $$0) {
        return this.c.a($$0);
    }

    @Override
    public IntSet a() {
        return IntSets.unmodifiable((IntSet)this.c.b());
    }

    static final class b
    extends Record
    implements egl {
        final float a;
        final ehk b;
        final int c;
        final int d;
        final int e;
        final int f;
        private final int g;
        final int h;

        b(float $$0, ehk $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
        }

        @Override
        public float getAdvance() {
            return this.g;
        }

        @Override
        public err bake(Function<egn, err> $$0) {
            return $$0.apply(new egn(){

                @Override
                public float d() {
                    return 1.0f / a;
                }

                @Override
                public int a() {
                    return e;
                }

                @Override
                public int b() {
                    return f;
                }

                @Override
                public float j() {
                    return egn.super.j() + 7.0f - (float)h;
                }

                @Override
                public void a(int $$0, int $$1) {
                    b.a(0, $$0, $$1, c, d, e, f, false, false);
                }

                @Override
                public boolean c() {
                    return b.c().a() > 1;
                }
            });
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public float c() {
            return this.a;
        }

        public ehk d() {
            return this.b;
        }

        public int e() {
            return this.c;
        }

        public int f() {
            return this.d;
        }

        public int g() {
            return this.e;
        }

        public int h() {
            return this.f;
        }

        public int i() {
            return this.g;
        }

        public int j() {
            return this.h;
        }
    }

    public record a(acq c, int d, int e, int[][] f) implements erx
    {
        private static final Codec<int[][]> g = aoi.a(Codec.STRING.listOf().xmap($$0 -> {
            int $$1 = $$0.size();
            int[][] $$2 = new int[$$1][];
            for (int $$3 = 0; $$3 < $$1; ++$$3) {
                $$2[$$3] = ((String)$$0.get($$3)).codePoints().toArray();
            }
            return $$2;
        }, $$0 -> {
            ArrayList<String> $$1 = new ArrayList<String>(((int[][])$$0).length);
            for (int[] $$2 : $$0) {
                $$1.add(new String($$2, 0, $$2.length));
            }
            return $$1;
        }), a::a);
        public static final MapCodec<a> a = aoi.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)acq.a.fieldOf("file").forGetter(a::c), (App)Codec.INT.optionalFieldOf("height", (Object)8).forGetter(a::d), (App)Codec.INT.fieldOf("ascent").forGetter(a::e), (App)g.fieldOf("chars").forGetter(a::f)).apply((Applicative)$$0, a::new)), a::a);

        private static DataResult<int[][]> a(int[][] $$0) {
            int $$1 = $$0.length;
            if ($$1 == 0) {
                return DataResult.error(() -> "Expected to find data in codepoint grid");
            }
            int[] $$2 = $$0[0];
            int $$3 = $$2.length;
            if ($$3 == 0) {
                return DataResult.error(() -> "Expected to find data in codepoint grid");
            }
            for (int $$4 = 1; $$4 < $$1; ++$$4) {
                int[] $$5 = $$0[$$4];
                if ($$5.length == $$3) continue;
                return DataResult.error(() -> "Lines in codepoint grid have to be the same length (found: " + $$5.length + " codepoints, expected: " + $$3 + "), pad with \\u0000");
            }
            return DataResult.success((Object)$$0);
        }

        private static DataResult<a> a(a $$0) {
            if ($$0.e > $$0.d) {
                return DataResult.error(() -> "Ascent " + $$0.e + " higher than height " + $$0.d);
            }
            return DataResult.success((Object)$$0);
        }

        @Override
        public ery a() {
            return ery.a;
        }

        @Override
        public Either<erx.a, erx.b> b() {
            return Either.left(this::a);
        }

        private egm a(akx $$02) throws IOException {
            acq $$1 = this.c.d("textures/");
            try (InputStream $$2 = $$02.open($$1);){
                ehk $$3 = ehk.a(ehk.a.a, $$2);
                int $$4 = $$3.a();
                int $$5 = $$3.b();
                int $$6 = $$4 / this.f[0].length;
                int $$7 = $$5 / this.f.length;
                float $$8 = (float)this.d / (float)$$7;
                erl<b> $$9 = new erl<b>(b[]::new, $$0 -> new b[$$0][]);
                for (int $$10 = 0; $$10 < this.f.length; ++$$10) {
                    int $$11 = 0;
                    for (int $$12 : this.f[$$10]) {
                        int $$14;
                        b $$15;
                        int $$13 = $$11++;
                        if ($$12 == 0 || ($$15 = $$9.a($$12, new b($$8, $$3, $$13 * $$6, $$10 * $$7, $$6, $$7, (int)(0.5 + (double)((float)($$14 = this.a($$3, $$6, $$7, $$13, $$10)) * $$8)) + 1, this.e))) == null) continue;
                        a.warn("Codepoint '{}' declared multiple times in {}", (Object)Integer.toHexString($$12), (Object)$$1);
                    }
                }
                erw erw2 = new erw($$3, $$9);
                return erw2;
            }
        }

        private int a(ehk $$0, int $$1, int $$2, int $$3, int $$4) {
            int $$5;
            for ($$5 = $$1 - 1; $$5 >= 0; --$$5) {
                int $$6 = $$3 * $$1 + $$5;
                for (int $$7 = 0; $$7 < $$2; ++$$7) {
                    int $$8 = $$4 * $$2 + $$7;
                    if ($$0.e($$6, $$8) == 0) continue;
                    return $$5 + 1;
                }
            }
            return $$5 + 1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "file;height;ascent;codepointGrid", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "file;height;ascent;codepointGrid", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "file;height;ascent;codepointGrid", "c", "d", "e", "f"}, this, $$0);
        }
    }
}

