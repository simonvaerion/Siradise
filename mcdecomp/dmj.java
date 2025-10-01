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

public final class dmj
extends Record
implements dms {
    private final List<a> b;
    private final ha c;
    private final dir d;
    private final boolean e;
    public static final Codec<dmj> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dmj$a.a.listOf().fieldOf("layers").forGetter(dmj::a), (App)ha.g.fieldOf("direction").forGetter(dmj::b), (App)dir.b.fieldOf("allowed_placement").forGetter(dmj::c), (App)Codec.BOOL.fieldOf("prioritize_tip").forGetter(dmj::d)).apply((Applicative)$$0, dmj::new));

    public dmj(List<a> $$0, ha $$1, dir $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static a a(bdc $$0, dot $$1) {
        return new a($$0, $$1);
    }

    public static dmj b(bdc $$0, dot $$1) {
        return new dmj(List.of(dmj.a($$0, $$1)), ha.b, dir.c, false);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dmj.class, "layers;direction;allowedPlacement;prioritizeTip", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dmj.class, "layers;direction;allowedPlacement;prioritizeTip", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dmj.class, "layers;direction;allowedPlacement;prioritizeTip", "b", "c", "d", "e"}, this, $$0);
    }

    public List<a> a() {
        return this.b;
    }

    public ha b() {
        return this.c;
    }

    public dir c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public static final class a
    extends Record {
        private final bdc b;
        private final dot c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bdc.d.fieldOf("height").forGetter(a::a), (App)dot.a.fieldOf("provider").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(bdc $$0, dot $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "height;state", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "height;state", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "height;state", "b", "c"}, this, $$0);
        }

        public bdc a() {
            return this.b;
        }

        public dot b() {
            return this.c;
        }
    }
}

