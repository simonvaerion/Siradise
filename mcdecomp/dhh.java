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
import java.util.List;

public class dhh {
    public final dot a;
    public final dot b;
    public final dot c;
    public final dot d;
    public final dot e;
    public final List<dcb> f;
    public final anl<cpn> g;
    public final anl<cpn> h;
    public static final Codec<dhh> i = RecordCodecBuilder.create($$02 -> $$02.group((App)dot.a.fieldOf("filling_provider").forGetter($$0 -> $$0.a), (App)dot.a.fieldOf("inner_layer_provider").forGetter($$0 -> $$0.b), (App)dot.a.fieldOf("alternate_inner_layer_provider").forGetter($$0 -> $$0.c), (App)dot.a.fieldOf("middle_layer_provider").forGetter($$0 -> $$0.d), (App)dot.a.fieldOf("outer_layer_provider").forGetter($$0 -> $$0.e), (App)aoi.a(dcb.b.listOf()).fieldOf("inner_placements").forGetter($$0 -> $$0.f), (App)anl.b(jc.e).fieldOf("cannot_replace").forGetter($$0 -> $$0.g), (App)anl.b(jc.e).fieldOf("invalid_blocks").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, dhh::new));

    public dhh(dot $$0, dot $$1, dot $$2, dot $$3, dot $$4, List<dcb> $$5, anl<cpn> $$6, anl<cpn> $$7) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
    }
}

