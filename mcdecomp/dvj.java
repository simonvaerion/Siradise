/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dvj
extends dvq {
    public final anl<cpn> a;
    public static final Codec<dvj> b = anl.b(jc.e).xmap(dvj::new, $$0 -> $$0.a);

    public dvj(anl<cpn> $$0) {
        this.a = $$0;
    }

    @Override
    @Nullable
    public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
        if (dko.a(this.a).test($$0.a_($$4.a()))) {
            return $$4;
        }
        return null;
    }

    @Override
    protected dvs<?> a() {
        return dvs.n;
    }
}

