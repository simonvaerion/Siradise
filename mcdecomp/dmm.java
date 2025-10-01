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

public class dmm
implements dms {
    public static final Codec<dmm> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bdc.b(0, 3).fieldOf("reach").forGetter($$0 -> $$0.b), (App)bdc.b(1, 10).fieldOf("height").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dmm::new));
    private final bdc b;
    private final bdc c;

    public dmm(bdc $$0, bdc $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public bdc a() {
        return this.b;
    }

    public bdc b() {
        return this.c;
    }
}

