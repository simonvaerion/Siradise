/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dpj
extends dpk {
    public static final Codec<dpj> a = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(dpj::new, $$0 -> Float.valueOf($$0.b)).codec();
    private final float b;

    @Override
    protected dpl<?> a() {
        return dpl.b;
    }

    public dpj(float $$0) {
        this.b = $$0;
    }

    @Override
    public void a(dpk.a $$0) {
        apf $$1 = $$0.b();
        $$0.d().forEach($$2 -> {
            gu $$6;
            gu $$5;
            gu $$4;
            gu $$3;
            if ($$1.i() < this.b && $$0.a($$3 = $$2.g())) {
                dpj.a($$3, cyh.c, $$0);
            }
            if ($$1.i() < this.b && $$0.a($$4 = $$2.h())) {
                dpj.a($$4, cyh.e, $$0);
            }
            if ($$1.i() < this.b && $$0.a($$5 = $$2.e())) {
                dpj.a($$5, cyh.d, $$0);
            }
            if ($$1.i() < this.b && $$0.a($$6 = $$2.f())) {
                dpj.a($$6, cyh.b, $$0);
            }
        });
    }

    private static void a(gu $$0, dcs $$1, dpk.a $$2) {
        $$2.a($$0, $$1);
        $$0 = $$0.d();
        for (int $$3 = 4; $$2.a($$0) && $$3 > 0; --$$3) {
            $$2.a($$0, $$1);
            $$0 = $$0.d();
        }
    }
}

