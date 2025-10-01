/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class djo
extends djm {
    public djo(Codec<djl> $$0) {
        super($$0);
        this.h = ImmutableSet.of((Object)dxf.e, (Object)dxf.c);
    }

    @Override
    protected int a() {
        return 10;
    }

    @Override
    protected float a(apf $$0) {
        return ($$0.i() * 2.0f + $$0.i()) * 2.0f;
    }

    @Override
    protected double b() {
        return 5.0;
    }

    @Override
    protected boolean a(djk $$0, djl $$1, ddx $$2, Function<gu, he<cnk>> $$3, ddw $$4, gu.a $$5, gu.a $$6, dgw $$7, MutableBoolean $$8) {
        if (this.a($$1, $$2.a_($$5))) {
            dcb $$10;
            if ($$5.v() <= $$0.a() + 31) {
                dcb $$9 = g.g();
            } else {
                $$10 = e;
            }
            $$2.a($$5, $$10, false);
            return true;
        }
        return false;
    }
}

