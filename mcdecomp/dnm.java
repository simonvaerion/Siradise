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
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnm
implements dms {
    public static final Codec<dnm> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.BOOL.fieldOf("crystal_invulnerable").orElse((Object)false).forGetter($$0 -> $$0.b), (App)dly.a.a.listOf().fieldOf("spikes").forGetter($$0 -> $$0.c), (App)gu.a.optionalFieldOf("crystal_beam_target").forGetter($$0 -> Optional.ofNullable($$0.d))).apply((Applicative)$$02, dnm::new));
    private final boolean b;
    private final List<dly.a> c;
    @Nullable
    private final gu d;

    public dnm(boolean $$0, List<dly.a> $$1, @Nullable gu $$2) {
        this($$0, $$1, Optional.ofNullable($$2));
    }

    private dnm(boolean $$0, List<dly.a> $$1, Optional<gu> $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2.orElse(null);
    }

    public boolean a() {
        return this.b;
    }

    public List<dly.a> b() {
        return this.c;
    }

    @Nullable
    public gu c() {
        return this.d;
    }
}

