/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;

public class dpf
extends dpk {
    public static final Codec<dpf> a = dot.a.fieldOf("provider").xmap(dpf::new, $$0 -> $$0.b).codec();
    private final dot b;

    public dpf(dot $$0) {
        this.b = $$0;
    }

    @Override
    protected dpl<?> a() {
        return dpl.e;
    }

    @Override
    public void a(dpk.a $$0) {
        ArrayList $$12 = Lists.newArrayList();
        ObjectArrayList<gu> $$2 = $$0.e();
        ObjectArrayList<gu> $$3 = $$0.c();
        if ($$2.isEmpty()) {
            $$12.addAll($$3);
        } else if (!$$3.isEmpty() && ((gu)$$2.get(0)).v() == ((gu)$$3.get(0)).v()) {
            $$12.addAll($$3);
            $$12.addAll($$2);
        } else {
            $$12.addAll($$2);
        }
        if ($$12.isEmpty()) {
            return;
        }
        int $$4 = ((gu)$$12.get(0)).v();
        $$12.stream().filter($$1 -> $$1.v() == $$4).forEach($$1 -> {
            this.a($$0, $$1.g().e());
            this.a($$0, $$1.g(2).e());
            this.a($$0, $$1.g().e(2));
            this.a($$0, $$1.g(2).e(2));
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                int $$3 = $$0.b().a(64);
                int $$4 = $$3 % 8;
                int $$5 = $$3 / 8;
                if ($$4 != 0 && $$4 != 7 && $$5 != 0 && $$5 != 7) continue;
                this.a($$0, $$1.b(-3 + $$4, 0, -3 + $$5));
            }
        });
    }

    private void a(dpk.a $$0, gu $$1) {
        for (int $$2 = -2; $$2 <= 2; ++$$2) {
            for (int $$3 = -2; $$3 <= 2; ++$$3) {
                if (Math.abs($$2) == 2 && Math.abs($$3) == 2) continue;
                this.b($$0, $$1.b($$2, 0, $$3));
            }
        }
    }

    private void b(dpk.a $$0, gu $$1) {
        for (int $$2 = 2; $$2 >= -3; --$$2) {
            gu $$3 = $$1.b($$2);
            if (dko.a($$0.a(), $$3)) {
                $$0.a($$3, this.b.a($$0.b(), $$1));
                break;
            }
            if (!$$0.a($$3) && $$2 < 0) break;
        }
    }
}

