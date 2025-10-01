/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public interface die {
    public static final Codec<die> a = aoi.a(die$b.d, aoi.a(die$a.d, die$c.d)).xmap(die::a, die::a);
    public static final die b = die.b(0);
    public static final die c = die.c(0);

    public static die a(int $$0) {
        return new b($$0);
    }

    public static die b(int $$0) {
        return new a($$0);
    }

    public static die c(int $$0) {
        return new c($$0);
    }

    public static die a() {
        return b;
    }

    public static die b() {
        return c;
    }

    private static die a(Either<b, Either<a, c>> $$02) {
        return (die)$$02.map(Function.identity(), $$0 -> (Record)$$0.map(Function.identity(), Function.identity()));
    }

    private static Either<b, Either<a, c>> a(die $$0) {
        if ($$0 instanceof b) {
            return Either.left((Object)((b)$$0));
        }
        return Either.right((Object)($$0 instanceof a ? Either.left((Object)((a)$$0)) : Either.right((Object)((c)$$0))));
    }

    public int a(dih var1);

    public static final class b
    extends Record
    implements die {
        private final int e;
        public static final Codec<b> d = Codec.intRange((int)dfk.e, (int)dfk.d).fieldOf("absolute").xmap(b::new, b::c).codec();

        public b(int $$0) {
            this.e = $$0;
        }

        @Override
        public int a(dih $$0) {
            return this.e;
        }

        @Override
        public String toString() {
            return this.e + " absolute";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "y", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "y", "e"}, this, $$0);
        }

        public int c() {
            return this.e;
        }
    }

    public static final class a
    extends Record
    implements die {
        private final int e;
        public static final Codec<a> d = Codec.intRange((int)dfk.e, (int)dfk.d).fieldOf("above_bottom").xmap(a::new, a::c).codec();

        public a(int $$0) {
            this.e = $$0;
        }

        @Override
        public int a(dih $$0) {
            return $$0.a() + this.e;
        }

        @Override
        public String toString() {
            return this.e + " above bottom";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "offset", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "offset", "e"}, this, $$0);
        }

        public int c() {
            return this.e;
        }
    }

    public static final class c
    extends Record
    implements die {
        private final int e;
        public static final Codec<c> d = Codec.intRange((int)dfk.e, (int)dfk.d).fieldOf("below_top").xmap(c::new, c::c).codec();

        public c(int $$0) {
            this.e = $$0;
        }

        @Override
        public int a(dih $$0) {
            return $$0.b() - 1 + $$0.a() - this.e;
        }

        @Override
        public String toString() {
            return this.e + " below top";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "offset", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "offset", "e"}, this, $$0);
        }

        public int c() {
            return this.e;
        }
    }
}

