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

public class dnh
implements dms {
    public static final Codec<dnh> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dcb.b.fieldOf("target").forGetter($$0 -> $$0.b), (App)dcb.b.fieldOf("state").forGetter($$0 -> $$0.c), (App)bdc.b(0, 12).fieldOf("radius").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dnh::new));
    public final dcb b;
    public final dcb c;
    private final bdc d;

    public dnh(dcb $$0, dcb $$1, bdc $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public bdc a() {
        return this.d;
    }
}

