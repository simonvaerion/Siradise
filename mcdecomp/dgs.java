/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public final class dgs
extends Record {
    private final dgl b;
    private final float c;
    private final eei d;
    @Nullable
    private final UUID e;
    @Nullable
    private final UUID f;
    @Nullable
    private final bfj g;
    public static final Codec<dgs> a = RecordCodecBuilder.create($$02 -> $$02.group((App)jb.b.q().fieldOf("game_event").forGetter(dgs::a), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).fieldOf("distance").forGetter(dgs::b), (App)eei.a.fieldOf("pos").forGetter(dgs::c), (App)hy.a.optionalFieldOf("source").forGetter($$0 -> Optional.ofNullable($$0.d())), (App)hy.a.optionalFieldOf("projectile_owner").forGetter($$0 -> Optional.ofNullable($$0.e()))).apply((Applicative)$$02, ($$0, $$1, $$2, $$3, $$4) -> new dgs((dgl)$$0, $$1.floatValue(), (eei)$$2, $$3.orElse(null), $$4.orElse(null))));

    public dgs(dgl $$0, float $$1, eei $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
        this($$0, $$1, $$2, $$3, $$4, null);
    }

    public dgs(dgl $$0, float $$1, eei $$2, @Nullable bfj $$3) {
        this($$0, $$1, $$2, $$3 == null ? null : $$3.ct(), dgs.a($$3), $$3);
    }

    public dgs(dgl $$0, float $$1, eei $$2, @Nullable UUID $$3, @Nullable UUID $$4, @Nullable bfj $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }

    @Nullable
    private static UUID a(@Nullable bfj $$0) {
        bzg $$1;
        if ($$0 instanceof bzg && ($$1 = (bzg)$$0).v() != null) {
            return $$1.v().ct();
        }
        return null;
    }

    public Optional<bfj> a(aif $$0) {
        return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
    }

    public Optional<bfj> b(aif $$02) {
        return this.a($$02).filter($$0 -> $$0 instanceof bzg).map($$0 -> (bzg)$$0).map(bzg::v).or(() -> Optional.ofNullable(this.f).map($$02::a));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dgs.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dgs.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dgs.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "b", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public dgl a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }

    public eei c() {
        return this.d;
    }

    @Nullable
    public UUID d() {
        return this.e;
    }

    @Nullable
    public UUID e() {
        return this.f;
    }

    @Nullable
    public bfj f() {
        return this.g;
    }
}

