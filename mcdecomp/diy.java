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

class diy
extends djc {
    private final hi<dxd> e;
    public static final Codec<diy> a = RecordCodecBuilder.create($$02 -> diy.a($$02).and((App)ht.a(jc.w).fieldOf("fluids").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, diy::new));

    public diy(hz $$0, hi<dxd> $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    protected boolean a(dcb $$0) {
        return $$0.u().a(this.e);
    }

    @Override
    public dis<?> a() {
        return dis.c;
    }
}

