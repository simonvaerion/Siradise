/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dph
extends dpk {
    public static final Codec<dph> a = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(dph::new, $$0 -> Float.valueOf($$0.d)).codec();
    private static final ha b = ha.d;
    private static final ha[] c = (ha[])ha.c.a.a().filter($$0 -> $$0 != b.g()).toArray(ha[]::new);
    private final float d;

    public dph(float $$0) {
        this.d = $$0;
    }

    @Override
    protected dpl<?> a() {
        return dpl.d;
    }

    @Override
    public void a(dpk.a $$02) {
        apf $$12 = $$02.b();
        if ($$12.i() >= this.d) {
            return;
        }
        ObjectArrayList<gu> $$2 = $$02.d();
        ObjectArrayList<gu> $$3 = $$02.c();
        int $$4 = !$$2.isEmpty() ? Math.max(((gu)$$2.get(0)).v() - 1, ((gu)$$3.get(0)).v() + 1) : Math.min(((gu)$$3.get(0)).v() + 1 + $$12.a(3), ((gu)$$3.get($$3.size() - 1)).v());
        List $$5 = $$3.stream().filter($$1 -> $$1.v() == $$4).flatMap($$0 -> Stream.of(c).map($$0::a)).collect(Collectors.toList());
        if ($$5.isEmpty()) {
            return;
        }
        Collections.shuffle($$5);
        Optional<gu> $$6 = $$5.stream().filter($$1 -> $$02.a((gu)$$1) && $$02.a($$1.a(b))).findFirst();
        if ($$6.isEmpty()) {
            return;
        }
        $$02.a($$6.get(), (dcb)cpo.pe.n().a(cph.a, b));
        $$02.a().a($$6.get(), czp.H).ifPresent($$1 -> {
            int $$2 = 2 + $$12.a(2);
            for (int $$3 = 0; $$3 < $$2; ++$$3) {
                qr $$4 = new qr();
                $$4.a("id", jb.h.b(bfn.h).toString());
                $$1.a($$4, $$12.a(599), false);
            }
        });
    }
}

