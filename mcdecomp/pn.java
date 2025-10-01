/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class pn {
    private static final Logger a = LogUtils.getLogger();
    private final gu b;
    final aif c;
    private final px d;
    private final int e;
    private final List<pr> f;
    private final List<Pair<pm, Collection<pr>>> g;
    private final gu.a h;

    public pn(Collection<pm> $$02, gu $$1, cvz $$2, aif $$3, px $$4, int $$5) {
        this.h = $$1.j();
        this.b = $$1;
        this.c = $$3;
        this.d = $$4;
        this.e = $$5;
        this.g = (List)$$02.stream().map($$22 -> {
            Collection $$3 = (Collection)$$22.b().stream().map($$2 -> new pr((qi)$$2, $$2, $$3)).collect(ImmutableList.toImmutableList());
            return Pair.of((Object)$$22, (Object)$$3);
        }).collect(ImmutableList.toImmutableList());
        this.f = (List)this.g.stream().flatMap($$0 -> ((Collection)$$0.getSecond()).stream()).collect(ImmutableList.toImmutableList());
    }

    public List<pr> a() {
        return this.f;
    }

    public void b() {
        this.a(0);
    }

    void a(final int $$0) {
        if ($$0 >= this.g.size()) {
            return;
        }
        Pair<pm, Collection<pr>> $$12 = this.g.get($$0);
        final pm $$2 = (pm)$$12.getFirst();
        Collection $$3 = (Collection)$$12.getSecond();
        Map<pr, gu> $$4 = this.a($$3);
        String $$5 = $$2.a();
        a.info("Running test batch '{}' ({} tests)...", (Object)$$5, (Object)$$3.size());
        $$2.a(this.c);
        final qc $$6 = new qc();
        $$3.forEach($$6::a);
        $$6.a(new ps(){

            private void a() {
                if ($$6.i()) {
                    $$2.b(pn.this.c);
                    pn.this.a($$0 + 1);
                }
            }

            @Override
            public void a(pr $$02) {
            }

            @Override
            public void b(pr $$02) {
                this.a();
            }

            @Override
            public void c(pr $$02) {
                this.a();
            }
        });
        $$3.forEach($$1 -> {
            gu $$2 = (gu)$$4.get($$1);
            pu.a($$1, $$2, this.d);
        });
    }

    private Map<pr, gu> a(Collection<pr> $$0) {
        HashMap $$1 = Maps.newHashMap();
        int $$2 = 0;
        eed $$3 = new eed(this.h);
        for (pr $$4 : $$0) {
            gu $$5 = new gu(this.h);
            dba $$6 = qe.a($$4.t(), $$5, $$4.u(), 2, this.c, true);
            eed $$7 = qe.a($$6);
            $$4.a($$6.p());
            $$1.put($$4, new gu(this.h));
            $$3 = $$3.b($$7);
            this.h.e((int)$$7.b() + 5, 0, 0);
            if ($$2++ % this.e != this.e - 1) continue;
            this.h.e(0, 0, (int)$$3.d() + 6);
            this.h.p(this.b.u());
            $$3 = new eed(this.h);
        }
        return $$1;
    }
}

