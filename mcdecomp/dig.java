/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dig
extends Record {
    private final dii b;
    private final dif c;
    public static final Codec<dig> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dii.a.forGetter(dig::a), (App)dif.a.forGetter(dig::b)).apply((Applicative)$$0, $$0.stable(dig::new)));

    public dig(dii $$0, dif $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static <T> DataResult<T> a(DynamicOps<T> $$0, dii $$1, dif $$2) {
        return a.encodeStart($$0, (Object)new dig($$1, $$2));
    }

    public static <T> DataResult<T> a(DynamicOps<T> $$0, dii $$1, hs $$2) {
        return dig.a($$0, $$1, new dif($$2.d(jc.aI)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dig.class, "options;dimensions", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dig.class, "options;dimensions", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dig.class, "options;dimensions", "b", "c"}, this, $$0);
    }

    public dii a() {
        return this.b;
    }

    public dif b() {
        return this.c;
    }
}

