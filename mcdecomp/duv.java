/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class duv
extends dvq {
    public static final Codec<duv> a = dcb.b.xmap(dca.a::b, cpn::n).listOf().fieldOf("blocks").xmap(duv::new, $$0 -> $$0.e).codec();
    public static final duv b = new duv((List<cpn>)ImmutableList.of((Object)cpo.pa));
    public static final duv c = new duv((List<cpn>)ImmutableList.of((Object)cpo.a));
    public static final duv d = new duv((List<cpn>)ImmutableList.of((Object)cpo.a, (Object)cpo.pa));
    private final ImmutableList<cpn> e;

    public duv(List<cpn> $$0) {
        this.e = ImmutableList.copyOf($$0);
    }

    @Override
    @Nullable
    public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
        if (this.e.contains((Object)$$4.b().b())) {
            return null;
        }
        return $$4;
    }

    @Override
    protected dvs<?> a() {
        return dvs.e;
    }
}

