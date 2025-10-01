/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dhg {

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("air");
        public static final /* enum */ a b = new a("liquid");
        public static final Codec<a> c;
        private final String d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        public String a() {
            return this.d;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            e = dhg$a.b();
            c = apr.a(a::values);
        }
    }

    public static final class b
    extends Enum<b>
    implements apr {
        public static final /* enum */ b a = new b("raw_generation");
        public static final /* enum */ b b = new b("lakes");
        public static final /* enum */ b c = new b("local_modifications");
        public static final /* enum */ b d = new b("underground_structures");
        public static final /* enum */ b e = new b("surface_structures");
        public static final /* enum */ b f = new b("strongholds");
        public static final /* enum */ b g = new b("underground_ores");
        public static final /* enum */ b h = new b("underground_decoration");
        public static final /* enum */ b i = new b("fluid_springs");
        public static final /* enum */ b j = new b("vegetal_decoration");
        public static final /* enum */ b k = new b("top_layer_modification");
        public static final Codec<b> l;
        private final String m;
        private static final /* synthetic */ b[] n;

        public static b[] values() {
            return (b[])n.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.m = $$0;
        }

        public String a() {
            return this.m;
        }

        @Override
        public String c() {
            return this.m;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k};
        }

        static {
            n = dhg$b.b();
            l = apr.a(b::values);
        }
    }
}

