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

public class fvd
implements fuz {
    public static final Codec<fvd> b = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.STRING.fieldOf("source").forGetter($$0 -> $$0.c), (App)Codec.STRING.fieldOf("prefix").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fvd::new));
    private final String c;
    private final String d;

    public fvd(String $$0, String $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(akx $$0, fuz.a $$1) {
        acj $$22 = new acj("textures/" + this.c, ".png");
        $$22.a($$0).forEach(($$2, $$3) -> {
            acq $$4 = $$22.b((acq)$$2).d(this.d);
            $$1.a($$4, (akv)$$3);
        });
    }

    @Override
    public fva a() {
        return fvb.b;
    }
}

