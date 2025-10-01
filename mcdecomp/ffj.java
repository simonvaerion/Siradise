/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface ffj {
    public static final Codec<ffj> a = apr.a(a::values).dispatch(ffj::a, a::a);

    public a a();

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("player", () -> ffk.a.b);
        public static final /* enum */ a b = new a("system", () -> ffk.b.b);
        private final String c;
        private final Supplier<Codec<? extends ffj>> d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, Supplier<Codec<? extends ffj>> $$1) {
            this.c = $$0;
            this.d = $$1;
        }

        private Codec<? extends ffj> a() {
            return this.d.get();
        }

        @Override
        public String c() {
            return this.c;
        }

        private static /* synthetic */ a[] e() {
            return new a[]{a, b};
        }

        static {
            e = ffj$a.e();
        }
    }
}

