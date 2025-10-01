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

public class dje
implements dir {
    public static final Codec<dje> a = RecordCodecBuilder.create($$02 -> $$02.group((App)hz.v(16).optionalFieldOf("offset", (Object)hz.g).forGetter($$0 -> $$0.e), (App)dcb.b.fieldOf("state").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, dje::new));
    private final hz e;
    private final dcb f;

    protected dje(hz $$0, dcb $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a(cng $$0, gu $$1) {
        return this.f.a($$0, $$1.a(this.e));
    }

    @Override
    public dis<?> a() {
        return dis.g;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((cng)object, (gu)object2);
    }
}

