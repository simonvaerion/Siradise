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

public class bec {
    public static final Codec<bec> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dil.b.fieldOf("source").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, bec::new));
    private final dil b;

    public bec(dil $$0) {
        this.b = $$0;
    }

    public bec(long $$0, acq $$1) {
        this(bec.a($$0, $$1));
    }

    private static dil a(long $$0, acq $$1) {
        return new dil(dhz.b($$0).a(bec.a($$1)).a());
    }

    public static dhz.a a(acq $$0) {
        return dhz.a($$0.toString());
    }

    public apf a() {
        return this.b;
    }
}

