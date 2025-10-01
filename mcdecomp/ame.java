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

public class ame {
    public static final Codec<ame> a = RecordCodecBuilder.create($$02 -> $$02.group((App)amg.b.fieldOf("sound").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("min_delay").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("max_delay").forGetter($$0 -> $$0.d), (App)Codec.BOOL.fieldOf("replace_current_music").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, ame::new));
    private final he<amg> b;
    private final int c;
    private final int d;
    private final boolean e;

    public ame(he<amg> $$0, int $$1, int $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public he<amg> a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }
}

