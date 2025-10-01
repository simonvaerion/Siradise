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

public class dkx
implements dms {
    public static final Codec<dkx> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dcb.b.fieldOf("valid_base_block").forGetter($$0 -> $$0.b), (App)dcb.b.fieldOf("stem_state").forGetter($$0 -> $$0.c), (App)dcb.b.fieldOf("hat_state").forGetter($$0 -> $$0.d), (App)dcb.b.fieldOf("decor_state").forGetter($$0 -> $$0.e), (App)dir.b.fieldOf("replaceable_blocks").forGetter($$0 -> $$0.f), (App)Codec.BOOL.fieldOf("planted").orElse((Object)false).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, dkx::new));
    public final dcb b;
    public final dcb c;
    public final dcb d;
    public final dcb e;
    public final dir f;
    public final boolean g;

    public dkx(dcb $$0, dcb $$1, dcb $$2, dcb $$3, dir $$4, boolean $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }
}

