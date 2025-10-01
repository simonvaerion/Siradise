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

class diz
implements dir {
    public static final Codec<diz> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dir.b.fieldOf("predicate").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, diz::new));
    private final dir e;

    public diz(dir $$0) {
        this.e = $$0;
    }

    public boolean a(cng $$0, gu $$1) {
        return !this.e.test($$0, $$1);
    }

    @Override
    public dis<?> a() {
        return dis.k;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((cng)object, (gu)object2);
    }
}

