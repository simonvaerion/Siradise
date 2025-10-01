/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P1
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class djc
implements dir {
    protected final hz f;

    protected static <P extends djc> Products.P1<RecordCodecBuilder.Mu<P>, hz> a(RecordCodecBuilder.Instance<P> $$02) {
        return $$02.group((App)hz.v(16).optionalFieldOf("offset", (Object)hz.g).forGetter($$0 -> $$0.f));
    }

    protected djc(hz $$0) {
        this.f = $$0;
    }

    public final boolean a(cng $$0, gu $$1) {
        return this.a($$0.a_($$1.a(this.f)));
    }

    protected abstract boolean a(dcb var1);

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((cng)object, (gu)object2);
    }
}

