/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

public class dpi
extends dpk {
    public static final Codec<dpi> a = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(dpi::new, $$0 -> Float.valueOf($$0.b)).codec();
    private final float b;

    public dpi(float $$0) {
        this.b = $$0;
    }

    @Override
    protected dpl<?> a() {
        return dpl.c;
    }

    @Override
    public void a(dpk.a $$0) {
        apf $$12 = $$0.b();
        if ($$12.i() >= this.b) {
            return;
        }
        ObjectArrayList<gu> $$22 = $$0.c();
        int $$3 = ((gu)$$22.get(0)).v();
        $$22.stream().filter($$1 -> $$1.v() - $$3 <= 2).forEach($$2 -> {
            for (ha $$3 : ha.c.a) {
                ha $$4;
                gu $$5;
                if (!($$12.i() <= 0.25f) || !$$0.a($$5 = $$2.b(($$4 = $$3.g()).j(), 0, $$4.l()))) continue;
                $$0.a($$5, (dcb)((dcb)cpo.fC.n().a(cqt.b, $$12.a(3))).a(cqt.aC, $$3));
            }
        });
    }
}

