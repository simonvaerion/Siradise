/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dpm
extends dpk {
    public static final Codec<dpm> a = Codec.unit(() -> b);
    public static final dpm b = new dpm();

    @Override
    protected dpl<?> a() {
        return dpl.a;
    }

    @Override
    public void a(dpk.a $$0) {
        apf $$1 = $$0.b();
        $$0.c().forEach($$2 -> {
            gu $$6;
            gu $$5;
            gu $$4;
            gu $$3;
            if ($$1.a(3) > 0 && $$0.a($$3 = $$2.g())) {
                $$0.a($$3, cyh.c);
            }
            if ($$1.a(3) > 0 && $$0.a($$4 = $$2.h())) {
                $$0.a($$4, cyh.e);
            }
            if ($$1.a(3) > 0 && $$0.a($$5 = $$2.e())) {
                $$0.a($$5, cyh.d);
            }
            if ($$1.a(3) > 0 && $$0.a($$6 = $$2.f())) {
                $$0.a($$6, cyh.b);
            }
        });
    }
}

