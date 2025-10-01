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

class dix
extends djc {
    private final hi<cpn> e;
    public static final Codec<dix> a = RecordCodecBuilder.create($$02 -> dix.a($$02).and((App)ht.a(jc.e).fieldOf("blocks").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, dix::new));

    public dix(hz $$0, hi<cpn> $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    protected boolean a(dcb $$0) {
        return $$0.a(this.e);
    }

    @Override
    public dis<?> a() {
        return dis.a;
    }
}

