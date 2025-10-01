/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.google.common.primitives.Ints;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record tq(int b, UUID c, UUID d) {
    public static final Codec<tq> a = RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.i.fieldOf("index").forGetter(tq::b), (App)hy.a.fieldOf("sender").forGetter(tq::c), (App)hy.a.fieldOf("session_id").forGetter(tq::d)).apply((Applicative)$$0, tq::new));

    public static tq a(UUID $$0) {
        return tq.a($$0, ac.c);
    }

    public static tq a(UUID $$0, UUID $$1) {
        return new tq(0, $$0, $$1);
    }

    public void a(api.a $$0) throws SignatureException {
        $$0.update(hy.b(this.c));
        $$0.update(hy.b(this.d));
        $$0.update(Ints.toByteArray((int)this.b));
    }

    public boolean a(tq $$0) {
        return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
    }

    @Nullable
    public tq a() {
        if (this.b == Integer.MAX_VALUE) {
            return null;
        }
        return new tq(this.b + 1, this.c, this.d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tq.class, "index;sender;sessionId", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tq.class, "index;sender;sessionId", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tq.class, "index;sender;sessionId", "b", "c", "d"}, this, $$0);
    }
}

