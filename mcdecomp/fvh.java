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

public class fvh
implements fuz {
    public static final Codec<fvh> b = RecordCodecBuilder.create($$02 -> $$02.group((App)apg.a.fieldOf("pattern").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fvh::new));
    private final apg c;

    public fvh(apg $$0) {
        this.c = $$0;
    }

    @Override
    public void a(akx $$0, fuz.a $$1) {
        $$1.a(this.c.c());
    }

    @Override
    public fva a() {
        return fvb.c;
    }
}

