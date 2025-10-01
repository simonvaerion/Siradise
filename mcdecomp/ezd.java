/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ezd
extends euq {
    private static final int a = 310;
    private final esg b = new esg(this);
    private final euq c;
    private final aki k;
    private final Consumer<aki> l;
    private final Object2BooleanMap<akg> m = new Object2BooleanLinkedOpenHashMap();

    protected ezd(euq $$0, aki $$1, Consumer<aki> $$2) {
        super(sw.c("experiments_screen.title"));
        this.c = $$0;
        this.k = $$1;
        this.l = $$2;
        for (akg $$3 : $$1.c()) {
            if ($$3.j() != akj.d) continue;
            this.m.put((Object)$$3, $$1.f().contains($$3));
        }
    }

    @Override
    protected void b() {
        this.b.a(new eqk(sw.c("selectWorld.experiments"), this.i));
        esf.b $$02 = this.b.c(new esf()).d(1);
        $$02.a(new eqa(sw.c("selectWorld.experiments.info").a(n.m), this.i).i(310), $$02.b().e(15));
        ezh.a $$13 = ezh.a(310).a(2, true).b(4);
        this.m.forEach(($$12, $$2) -> $$13.a(ezd.a($$12), () -> this.m.getBoolean($$12), (Boolean $$1) -> this.m.put($$12, $$1.booleanValue())).a($$12.b()));
        $$13.a($$02::a);
        esf.b $$22 = this.b.b(new esf().a(10)).d(2);
        $$22.a(epi.a(sv.d, (epi $$0) -> this.l()).a());
        $$22.a(epi.a(sv.e, (epi $$0) -> this.aw_()).a());
        this.b.a($$1 -> {
            epf cfr_ignored_0 = (epf)this.d($$1);
        });
        this.aG_();
    }

    private static sw a(akg $$0) {
        String $$1 = "dataPack." + $$0.f() + ".name";
        return fvz.a($$1) ? sw.c($$1) : $$0.a();
    }

    @Override
    public void aw_() {
        this.f.a(this.c);
    }

    private void l() {
        ArrayList<akg> $$0 = new ArrayList<akg>(this.k.f());
        ArrayList $$1 = new ArrayList();
        this.m.forEach(($$2, $$3) -> {
            $$0.remove($$2);
            if ($$3.booleanValue()) {
                $$1.add($$2);
            }
        });
        $$0.addAll(Lists.reverse($$1));
        this.k.a($$0.stream().map(akg::f).toList());
        this.l.accept(this.k);
    }

    @Override
    protected void aG_() {
        this.b.c();
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(0.125f, 0.125f, 0.125f, 1.0f);
        int $$4 = 32;
        $$0.a(d, 0, this.b.b(), 0.0f, 0.0f, this.g, this.h - this.b.b() - this.b.a(), 32, 32);
        $$0.a(1.0f, 1.0f, 1.0f, 1.0f);
        super.a($$0, $$1, $$2, $$3);
    }
}

