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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dsh
extends Record {
    private final a b;
    private final bcl<cnw.c> c;
    public static final Codec<dsh> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dsh$a.c.fieldOf("bounding_box").forGetter(dsh::a), (App)bcl.c(cnw.c.a).fieldOf("spawns").forGetter(dsh::b)).apply((Applicative)$$0, dsh::new));

    public dsh(a $$0, bcl<cnw.c> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsh.class, "boundingBox;spawns", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsh.class, "boundingBox;spawns", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsh.class, "boundingBox;spawns", "b", "c"}, this, $$0);
    }

    public a a() {
        return this.b;
    }

    public bcl<cnw.c> b() {
        return this.c;
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("piece");
        public static final /* enum */ a b = new a("full");
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

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            e = dsh$a.a();
            c = apr.a(a::values);
        }
    }
}

