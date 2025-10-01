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

public final class bep
extends Record {
    private final String b;
    private final bem c;
    private final float d;
    private final bel e;
    private final ber f;
    public static final Codec<bep> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("message_id").forGetter(bep::a), (App)bem.d.fieldOf("scaling").forGetter(bep::b), (App)Codec.FLOAT.fieldOf("exhaustion").forGetter(bep::c), (App)bel.g.optionalFieldOf("effects", (Object)bel.a).forGetter(bep::d), (App)ber.d.optionalFieldOf("death_message_type", (Object)ber.a).forGetter(bep::e)).apply((Applicative)$$0, bep::new));

    public bep(String $$0, bem $$1, float $$2) {
        this($$0, $$1, $$2, bel.a, ber.a);
    }

    public bep(String $$0, bem $$1, float $$2, bel $$3) {
        this($$0, $$1, $$2, $$3, ber.a);
    }

    public bep(String $$0, float $$1, bel $$2) {
        this($$0, bem.b, $$1, $$2);
    }

    public bep(String $$0, float $$1) {
        this($$0, bem.b, $$1);
    }

    public bep(String $$0, bem $$1, float $$2, bel $$3, ber $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bep.class, "msgId;scaling;exhaustion;effects;deathMessageType", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bep.class, "msgId;scaling;exhaustion;effects;deathMessageType", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bep.class, "msgId;scaling;exhaustion;effects;deathMessageType", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public String a() {
        return this.b;
    }

    public bem b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public bel d() {
        return this.e;
    }

    public ber e() {
        return this.f;
    }
}

