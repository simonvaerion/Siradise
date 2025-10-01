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

public final class dqb
extends Record {
    private final he<cfu> c;
    private final dqd d;
    public static final Codec<dqb> a = RecordCodecBuilder.create($$02 -> $$02.group((App)acn.a(jc.D).fieldOf("display").forGetter($$0 -> $$0.c), (App)dqd.a.fieldOf("settings").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dqb::new));
    public static final Codec<he<dqb>> b = acm.a(jc.av, a);

    public dqb(he<cfu> $$0, dqd $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dqb.class, "displayItem;settings", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dqb.class, "displayItem;settings", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dqb.class, "displayItem;settings", "c", "d"}, this, $$0);
    }

    public he<cfu> a() {
        return this.c;
    }

    public dqd b() {
        return this.d;
    }
}

