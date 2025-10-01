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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public final class st
extends Record {
    private final String b;
    private final List<a> c;
    private final ts d;
    public static final Codec<st> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("translation_key").forGetter(st::a), (App)st$a.d.listOf().fieldOf("parameters").forGetter(st::b), (App)ts.b.optionalFieldOf("style", (Object)ts.a).forGetter(st::c)).apply((Applicative)$$0, st::new));

    public st(String $$0, List<a> $$1, ts $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public static st a(String $$0) {
        return new st($$0, List.of(st$a.a, st$a.c), ts.a);
    }

    public static st b(String $$0) {
        ts $$1 = ts.a.a(n.h).b(true);
        return new st($$0, List.of(st$a.a, st$a.c), $$1);
    }

    public static st c(String $$0) {
        ts $$1 = ts.a.a(n.h).b(true);
        return new st($$0, List.of(st$a.b, st$a.c), $$1);
    }

    public static st d(String $$0) {
        return new st($$0, List.of(st$a.b, st$a.a, st$a.c), ts.a);
    }

    public sw a(sw $$0, ss.a $$1) {
        Object[] $$2 = this.b($$0, $$1);
        return sw.a(this.b, $$2).c(this.d);
    }

    private sw[] b(sw $$0, ss.a $$1) {
        sw[] $$2 = new sw[this.c.size()];
        for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
            a $$4 = this.c.get($$3);
            $$2[$$3] = $$4.a($$0, $$1);
        }
        return $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{st.class, "translationKey;parameters;style", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{st.class, "translationKey;parameters;style", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{st.class, "translationKey;parameters;style", "b", "c", "d"}, this, $$0);
    }

    public String a() {
        return this.b;
    }

    public List<a> b() {
        return this.c;
    }

    public ts c() {
        return this.d;
    }

    public static final class st$a
    extends Enum<st$a>
    implements apr {
        public static final /* enum */ st$a a = new st$a("sender", ($$0, $$1) -> $$1.b());
        public static final /* enum */ st$a b = new st$a("target", ($$0, $$1) -> $$1.c());
        public static final /* enum */ st$a c = new st$a("content", ($$0, $$1) -> $$0);
        public static final Codec<st$a> d;
        private final String e;
        private final a f;
        private static final /* synthetic */ st$a[] g;

        public static st$a[] values() {
            return (st$a[])g.clone();
        }

        public static st$a valueOf(String $$0) {
            return Enum.valueOf(st$a.class, $$0);
        }

        private st$a(String $$0, a $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        public sw a(sw $$0, ss.a $$1) {
            sw $$2 = this.f.select($$0, $$1);
            return Objects.requireNonNullElse($$2, sv.a);
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ st$a[] a() {
            return new st$a[]{a, b, c};
        }

        static {
            g = st$a.a();
            d = apr.a(st$a::values);
        }

        public static interface a {
            @Nullable
            public sw select(sw var1, ss.a var2);
        }
    }
}

