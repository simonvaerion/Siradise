/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class duf
extends dsa {
    public static final Codec<duf> d = RecordCodecBuilder.create($$02 -> $$02.group(duf.a($$02), (App)duf$a.c.fieldOf("biome_temp").forGetter($$0 -> $$0.e), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("large_probability").forGetter($$0 -> Float.valueOf($$0.f)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("cluster_probability").forGetter($$0 -> Float.valueOf($$0.g))).apply((Applicative)$$02, duf::new));
    public final a e;
    public final float f;
    public final float g;

    public duf(dsa.c $$0, a $$1, float $$2, float $$3) {
        super($$0);
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        return duf.a($$0, dhk.a.c, $$1 -> this.a((dss)$$1, $$0));
    }

    private void a(dss $$0, dsa.a $$1) {
        gu $$2 = new gu($$1.h().d(), 90, $$1.h().e());
        cvz $$3 = cvz.a($$1.f());
        due.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
    }

    @Override
    public dsj<?> e() {
        return dsj.k;
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("warm");
        public static final /* enum */ a b = new a("cold");
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
            e = duf$a.b();
            c = apr.a(a::values);
        }
    }
}

