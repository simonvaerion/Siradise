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

public class diu
implements dir {
    private final hz e;
    private final ha f;
    public static final Codec<diu> a = RecordCodecBuilder.create($$02 -> $$02.group((App)hz.v(16).optionalFieldOf("offset", (Object)hz.g).forGetter($$0 -> $$0.e), (App)ha.g.fieldOf("direction").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, diu::new));

    public diu(hz $$0, ha $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a(cng $$0, gu $$1) {
        gu $$2 = $$1.a(this.e);
        return $$0.a_($$2).d($$0, $$2, this.f);
    }

    @Override
    public dis<?> a() {
        return dis.d;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((cng)object, (gu)object2);
    }
}

