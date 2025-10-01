/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dsv
extends dsx {
    public static final Codec<dsv> a = aoi.a(RecordCodecBuilder.mapCodec($$0 -> dsv.a($$0).and($$0.group((App)Codec.intRange((int)0, (int)4096).fieldOf("spacing").forGetter(dsv::a), (App)Codec.intRange((int)0, (int)4096).fieldOf("separation").forGetter(dsv::b), (App)dsw.c.optionalFieldOf("spread_type", (Object)dsw.a).forGetter(dsv::c))).apply((Applicative)$$0, dsv::new)), dsv::a).codec();
    private final int c;
    private final int d;
    private final dsw e;

    private static DataResult<dsv> a(dsv $$0) {
        if ($$0.c <= $$0.d) {
            return DataResult.error(() -> "Spacing has to be larger than separation");
        }
        return DataResult.success((Object)$$0);
    }

    public dsv(hz $$0, dsx.c $$1, float $$2, int $$3, Optional<dsx.a> $$4, int $$5, int $$6, dsw $$7) {
        super($$0, $$1, $$2, $$3, $$4);
        this.c = $$5;
        this.d = $$6;
        this.e = $$7;
    }

    public dsv(int $$0, int $$1, dsw $$2, int $$3) {
        this(hz.g, dsx.c.a, 1.0f, $$3, Optional.empty(), $$0, $$1, $$2);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public dsw c() {
        return this.e;
    }

    public clt a(long $$0, int $$1, int $$2) {
        int $$3 = Math.floorDiv($$1, this.c);
        int $$4 = Math.floorDiv($$2, this.c);
        dij $$5 = new dij(new dhl(0L));
        $$5.a($$0, $$3, $$4, this.i());
        int $$6 = this.c - this.d;
        int $$7 = this.e.a($$5, $$6);
        int $$8 = this.e.a($$5, $$6);
        return new clt($$3 * this.c + $$7, $$4 * this.c + $$8);
    }

    @Override
    protected boolean a(ddz $$0, int $$1, int $$2) {
        clt $$3 = this.a($$0.d(), $$1, $$2);
        return $$3.e == $$1 && $$3.f == $$2;
    }

    @Override
    public dsy<?> e() {
        return dsy.a;
    }
}

