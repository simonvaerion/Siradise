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
import java.util.HashSet;
import java.util.List;

public class dpg
extends dpk {
    public static final Codec<dpg> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.intRange((int)0, (int)16).fieldOf("exclusion_radius_xz").forGetter($$0 -> $$0.c), (App)Codec.intRange((int)0, (int)16).fieldOf("exclusion_radius_y").forGetter($$0 -> $$0.d), (App)dot.a.fieldOf("block_provider").forGetter($$0 -> $$0.e), (App)Codec.intRange((int)1, (int)16).fieldOf("required_empty_blocks").forGetter($$0 -> $$0.f), (App)aoi.a(ha.g.listOf()).fieldOf("directions").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, dpg::new));
    protected final float b;
    protected final int c;
    protected final int d;
    protected final dot e;
    protected final int f;
    protected final List<ha> g;

    public dpg(float $$0, int $$1, int $$2, dot $$3, int $$4, List<ha> $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }

    @Override
    public void a(dpk.a $$0) {
        HashSet<gu> $$1 = new HashSet<gu>();
        apf $$2 = $$0.b();
        for (gu $$3 : ac.a($$0.d(), $$2)) {
            ha $$4;
            gu $$5 = $$3.a($$4 = ac.a(this.g, $$2));
            if ($$1.contains($$5) || !($$2.i() < this.b) || !this.a($$0, $$3, $$4)) continue;
            gu $$6 = $$5.b(-this.c, -this.d, -this.c);
            gu $$7 = $$5.b(this.c, this.d, this.c);
            for (gu $$8 : gu.a($$6, $$7)) {
                $$1.add($$8.i());
            }
            $$0.a($$5, this.e.a($$2, $$5));
        }
    }

    private boolean a(dpk.a $$0, gu $$1, ha $$2) {
        for (int $$3 = 1; $$3 <= this.f; ++$$3) {
            gu $$4 = $$1.a($$2, $$3);
            if ($$0.a($$4)) continue;
            return false;
        }
        return true;
    }

    @Override
    protected dpl<?> a() {
        return dpl.f;
    }
}

