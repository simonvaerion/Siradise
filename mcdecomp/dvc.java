/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dvc
extends dvq {
    public static final Codec<dvc> a = Codec.unit(() -> b);
    public static final dvc b = new dvc();

    @Override
    @Nullable
    public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
        gu $$6 = $$4.a();
        boolean $$7 = $$0.a_($$6).a(cpo.H);
        if ($$7 && !cpn.a($$4.b().j($$0, $$6))) {
            return new dvt.c($$6, cpo.H.n(), $$4.c());
        }
        return $$4;
    }

    @Override
    protected dvs<?> a() {
        return dvs.m;
    }
}

