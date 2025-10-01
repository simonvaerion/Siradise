/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dox
extends dow {
    public static final Codec<dox> g = RecordCodecBuilder.create($$0 -> dox.b($$0).apply((Applicative)$$0, dox::new));
    protected final List<dcb> h;

    protected static <P extends dox> Products.P4<RecordCodecBuilder.Mu<P>, Long, dwh.a, Float, List<dcb>> b(RecordCodecBuilder.Instance<P> $$02) {
        return dox.a($$02).and((App)Codec.list(dcb.b).fieldOf("states").forGetter($$0 -> $$0.h));
    }

    public dox(long $$0, dwh.a $$1, float $$2, List<dcb> $$3) {
        super($$0, $$1, $$2);
        this.h = $$3;
    }

    @Override
    protected dou<?> a() {
        return dou.d;
    }

    @Override
    public dcb a(apf $$0, gu $$1) {
        return this.a(this.h, $$1, this.e);
    }

    protected dcb a(List<dcb> $$0, gu $$1, double $$2) {
        double $$3 = this.a($$1, $$2);
        return this.a($$0, $$3);
    }

    protected dcb a(List<dcb> $$0, double $$1) {
        double $$2 = apa.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
        return $$0.get((int)($$2 * (double)$$0.size()));
    }
}

