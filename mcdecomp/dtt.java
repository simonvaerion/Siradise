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

public final class dtt
extends dsa {
    public static final int d = 128;
    public static final Codec<dtt> e = aoi.a(RecordCodecBuilder.mapCodec($$02 -> $$02.group(dtt.a($$02), (App)dtj.b.fieldOf("start_pool").forGetter($$0 -> $$0.f), (App)acq.a.optionalFieldOf("start_jigsaw_name").forGetter($$0 -> $$0.g), (App)Codec.intRange((int)0, (int)7).fieldOf("size").forGetter($$0 -> $$0.h), (App)dqh.c.fieldOf("start_height").forGetter($$0 -> $$0.i), (App)Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0 -> $$0.j), (App)dhk.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0 -> $$0.k), (App)Codec.intRange((int)1, (int)128).fieldOf("max_distance_from_center").forGetter($$0 -> $$0.l)).apply((Applicative)$$02, dtt::new)), dtt::a).codec();
    private final he<dtj> f;
    private final Optional<acq> g;
    private final int h;
    private final dqh i;
    private final boolean j;
    private final Optional<dhk.a> k;
    private final int l;

    private static DataResult<dtt> a(dtt $$0) {
        int $$1;
        switch ($$0.d()) {
            default: {
                throw new IncompatibleClassChangeError();
            }
            case a: {
                int n2 = 0;
                break;
            }
            case b: 
            case c: 
            case d: {
                int n2 = $$1 = 12;
            }
        }
        if ($$0.l + $$1 > 128) {
            return DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128");
        }
        return DataResult.success((Object)$$0);
    }

    public dtt(dsa.c $$0, he<dtj> $$1, Optional<acq> $$2, int $$3, dqh $$4, boolean $$5, Optional<dhk.a> $$6, int $$7) {
        super($$0);
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$5;
        this.k = $$6;
        this.l = $$7;
    }

    public dtt(dsa.c $$0, he<dtj> $$1, int $$2, dqh $$3, boolean $$4, dhk.a $$5) {
        this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80);
    }

    public dtt(dsa.c $$0, he<dtj> $$1, int $$2, dqh $$3, boolean $$4) {
        this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80);
    }

    @Override
    public Optional<dsa.b> a(dsa.a $$0) {
        clt $$1 = $$0.h();
        int $$2 = this.i.a($$0.f(), new dih($$0.b(), $$0.i()));
        gu $$3 = new gu($$1.d(), $$2, $$1.e());
        return dtd.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l);
    }

    @Override
    public dsj<?> e() {
        return dsj.f;
    }
}

