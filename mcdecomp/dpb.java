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

public final class dpb
extends Record {
    private final dot b;
    private final List<a> c;
    public static final Codec<dpb> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dot.a.fieldOf("fallback").forGetter(dpb::a), (App)dpb$a.a.listOf().fieldOf("rules").forGetter(dpb::b)).apply((Applicative)$$0, dpb::new));

    public dpb(dot $$0, List<a> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static dpb a(dot $$0) {
        return new dpb($$0, List.of());
    }

    public static dpb a(cpn $$0) {
        return dpb.a(dot.a($$0));
    }

    public dcb a(cng $$0, apf $$1, gu $$2) {
        for (a $$3 : this.c) {
            if (!$$3.a().test($$0, $$2)) continue;
            return $$3.b().a($$1, $$2);
        }
        return this.b.a($$1, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpb.class, "fallback;rules", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpb.class, "fallback;rules", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpb.class, "fallback;rules", "b", "c"}, this, $$0);
    }

    public dot a() {
        return this.b;
    }

    public List<a> b() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final dir b;
        private final dot c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dir.b.fieldOf("if_true").forGetter(a::a), (App)dot.a.fieldOf("then").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(dir $$0, dot $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "ifTrue;then", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "ifTrue;then", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "ifTrue;then", "b", "c"}, this, $$0);
        }

        public dir a() {
            return this.b;
        }

        public dot b() {
            return this.c;
        }
    }
}

