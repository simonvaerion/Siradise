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

public class dmo
implements dms {
    public static final Codec<dmo> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dcb.b.fieldOf("contents").forGetter($$0 -> $$0.b), (App)dcb.b.fieldOf("rim").forGetter($$0 -> $$0.c), (App)bdc.b(0, 16).fieldOf("size").forGetter($$0 -> $$0.d), (App)bdc.b(0, 16).fieldOf("rim_size").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, dmo::new));
    private final dcb b;
    private final dcb c;
    private final bdc d;
    private final bdc e;

    public dmo(dcb $$0, dcb $$1, bdc $$2, bdc $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public dcb a() {
        return this.b;
    }

    public dcb b() {
        return this.c;
    }

    public bdc c() {
        return this.d;
    }

    public bdc d() {
        return this.e;
    }
}

