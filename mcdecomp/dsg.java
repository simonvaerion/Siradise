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
import java.util.List;

public final class dsg
extends Record {
    private final List<a> c;
    private final dsx d;
    public static final Codec<dsg> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dsg$a.a.listOf().fieldOf("structures").forGetter(dsg::a), (App)dsx.b.fieldOf("placement").forGetter(dsg::b)).apply((Applicative)$$0, dsg::new));
    public static final Codec<he<dsg>> b = acm.a(jc.aB, a);

    public dsg(he<dsa> $$0, dsx $$1) {
        this(List.of(new a($$0, 1)), $$1);
    }

    public dsg(List<a> $$0, dsx $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public static a a(he<dsa> $$0, int $$1) {
        return new a($$0, $$1);
    }

    public static a a(he<dsa> $$0) {
        return new a($$0, 1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsg.class, "structures;placement", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsg.class, "structures;placement", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsg.class, "structures;placement", "c", "d"}, this, $$0);
    }

    public List<a> a() {
        return this.c;
    }

    public dsx b() {
        return this.d;
    }

    public static final class a
    extends Record {
        private final he<dsa> b;
        private final int c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dsa.b.fieldOf("structure").forGetter(a::a), (App)aoi.j.fieldOf("weight").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(he<dsa> $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "structure;weight", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "structure;weight", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "structure;weight", "b", "c"}, this, $$0);
        }

        public he<dsa> a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }
}

