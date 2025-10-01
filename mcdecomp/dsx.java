/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P5
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public abstract class dsx {
    public static final Codec<dsx> b = jb.S.q().dispatch(dsx::e, dsy::codec);
    private static final int a = 10387320;
    private final hz c;
    private final c d;
    private final float e;
    private final int f;
    private final Optional<a> g;

    protected static <S extends dsx> Products.P5<RecordCodecBuilder.Mu<S>, hz, c, Float, Integer, Optional<a>> a(RecordCodecBuilder.Instance<S> $$0) {
        return $$0.group((App)hz.v(16).optionalFieldOf("locate_offset", (Object)hz.g).forGetter(dsx::f), (App)dsx$c.e.optionalFieldOf("frequency_reduction_method", (Object)dsx$c.a).forGetter(dsx::g), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("frequency", (Object)Float.valueOf(1.0f)).forGetter(dsx::h), (App)aoi.i.fieldOf("salt").forGetter(dsx::i), (App)dsx$a.a.optionalFieldOf("exclusion_zone").forGetter(dsx::j));
    }

    protected dsx(hz $$0, c $$1, float $$2, int $$3, Optional<a> $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    protected hz f() {
        return this.c;
    }

    protected c g() {
        return this.d;
    }

    protected float h() {
        return this.e;
    }

    protected int i() {
        return this.f;
    }

    protected Optional<a> j() {
        return this.g;
    }

    public boolean b(ddz $$0, int $$1, int $$2) {
        if (!this.a($$0, $$1, $$2)) {
            return false;
        }
        if (this.e < 1.0f && !this.d.a($$0.d(), this.f, $$1, $$2, this.e)) {
            return false;
        }
        return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
    }

    protected abstract boolean a(ddz var1, int var2, int var3);

    public gu a(clt $$0) {
        return new gu($$0.d(), 0, $$0.e()).a(this.f());
    }

    public abstract dsy<?> e();

    private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
        dij $$5 = new dij(new dhl(0L));
        $$5.a($$0, $$1, $$2, $$3);
        return $$5.i() < $$4;
    }

    private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
        dij $$5 = new dij(new dhl(0L));
        $$5.c($$0, $$2, $$3);
        return $$5.j() < (double)$$4;
    }

    private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
        dij $$5 = new dij(new dhl(0L));
        $$5.a($$0, $$2, $$3, 10387320);
        return $$5.i() < $$4;
    }

    private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
        int $$5 = $$2 >> 4;
        int $$6 = $$3 >> 4;
        dij $$7 = new dij(new dhl(0L));
        $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
        $$7.f();
        return $$7.a((int)(1.0f / $$4)) == 0;
    }

    public static final class c
    extends Enum<c>
    implements apr {
        public static final /* enum */ c a = new c("default", dsx::a);
        public static final /* enum */ c b = new c("legacy_type_1", dsx::d);
        public static final /* enum */ c c = new c("legacy_type_2", dsx::c);
        public static final /* enum */ c d = new c("legacy_type_3", dsx::b);
        public static final Codec<c> e;
        private final String f;
        private final b g;
        private static final /* synthetic */ c[] h;

        public static c[] values() {
            return (c[])h.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0, b $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
            return this.g.shouldGenerate($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public String c() {
            return this.f;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c, d};
        }

        static {
            h = dsx$c.a();
            e = apr.a(c::values);
        }
    }

    @Deprecated
    public static final class a
    extends Record {
        private final he<dsg> b;
        private final int c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)acm.a(jc.aB, dsg.a, false).fieldOf("other_set").forGetter(a::a), (App)Codec.intRange((int)1, (int)16).fieldOf("chunk_count").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(he<dsg> $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        boolean a(ddz $$0, int $$1, int $$2) {
            return $$0.a(this.b, $$1, $$2, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "otherSet;chunkCount", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "otherSet;chunkCount", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "otherSet;chunkCount", "b", "c"}, this, $$0);
        }

        public he<dsg> a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }

    @FunctionalInterface
    public static interface b {
        public boolean shouldGenerate(long var1, int var3, int var4, int var5, float var6);
    }
}

