/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P4
 *  com.mojang.datafixers.Products$P5
 *  com.mojang.datafixers.Products$P9
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
import java.util.Optional;

public class dsu
extends dsx {
    public static final Codec<dsu> a = RecordCodecBuilder.create($$0 -> dsu.b((RecordCodecBuilder.Instance<dsu>)$$0).apply((Applicative)$$0, dsu::new));
    private final int c;
    private final int d;
    private final int e;
    private final hi<cnk> f;

    private static Products.P9<RecordCodecBuilder.Mu<dsu>, hz, dsx.c, Float, Integer, Optional<dsx.a>, Integer, Integer, Integer, hi<cnk>> b(RecordCodecBuilder.Instance<dsu> $$0) {
        Products.P5<RecordCodecBuilder.Mu<dsu>, hz, dsx.c, Float, Integer, Optional<dsx.a>> $$1 = dsu.a($$0);
        Products.P4 $$2 = $$0.group((App)Codec.intRange((int)0, (int)1023).fieldOf("distance").forGetter(dsu::a), (App)Codec.intRange((int)0, (int)1023).fieldOf("spread").forGetter(dsu::b), (App)Codec.intRange((int)1, (int)4095).fieldOf("count").forGetter(dsu::c), (App)ht.a(jc.ap).fieldOf("preferred_biomes").forGetter(dsu::d));
        return new Products.P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
    }

    public dsu(hz $$0, dsx.c $$1, float $$2, int $$3, Optional<dsx.a> $$4, int $$5, int $$6, int $$7, hi<cnk> $$8) {
        super($$0, $$1, $$2, $$3, $$4);
        this.c = $$5;
        this.d = $$6;
        this.e = $$7;
        this.f = $$8;
    }

    public dsu(int $$0, int $$1, int $$2, hi<cnk> $$3) {
        this(hz.g, dsx.c.a, 1.0f, 0, Optional.empty(), $$0, $$1, $$2, $$3);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public hi<cnk> d() {
        return this.f;
    }

    @Override
    protected boolean a(ddz $$0, int $$1, int $$2) {
        List<clt> $$3 = $$0.a(this);
        if ($$3 == null) {
            return false;
        }
        return $$3.contains(new clt($$1, $$2));
    }

    @Override
    public dsy<?> e() {
        return dsy.b;
    }
}

