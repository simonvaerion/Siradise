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

public class diw
extends djc {
    final anl<cpn> a;
    public static final Codec<diw> e = RecordCodecBuilder.create($$02 -> diw.a($$02).and((App)anl.a(jc.e).fieldOf("tag").forGetter($$0 -> $$0.a)).apply((Applicative)$$02, diw::new));

    protected diw(hz $$0, anl<cpn> $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    protected boolean a(dcb $$0) {
        return $$0.a(this.a);
    }

    @Override
    public dis<?> a() {
        return dis.b;
    }
}

