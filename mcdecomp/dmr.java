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
import java.util.Optional;

public class dmr
implements dms {
    public static final Codec<dmr> a = RecordCodecBuilder.create($$02 -> $$02.group((App)gu.a.optionalFieldOf("exit").forGetter($$0 -> $$0.b), (App)Codec.BOOL.fieldOf("exact").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dmr::new));
    private final Optional<gu> b;
    private final boolean c;

    private dmr(Optional<gu> $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static dmr a(gu $$0, boolean $$1) {
        return new dmr(Optional.of($$0), $$1);
    }

    public static dmr a() {
        return new dmr(Optional.empty(), false);
    }

    public Optional<gu> b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}

