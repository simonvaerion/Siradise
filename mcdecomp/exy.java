/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class exy
extends eyc {
    @Nullable
    private ciz h;

    @Override
    protected void a() {
        this.e.a(152, 182, 28, 18, a);
    }

    @Override
    public void a(@Nullable ccx $$0) {
        super.a($$0);
        if ($$0 != null && $$0.e < this.f.p()) {
            this.d.a();
        }
    }

    @Override
    public void a(cjc<?> $$02, List<ccx> $$1) {
        cfz $$2 = $$02.a(this.g.s.B_());
        this.d.a($$02);
        this.d.a(ciz.a($$2), $$1.get((int)2).f, $$1.get((int)2).g);
        hn<ciz> $$3 = $$02.a();
        ccx $$4 = $$1.get(1);
        if ($$4.e().b()) {
            if (this.h == null) {
                this.h = ciz.a(this.b().stream().filter($$0 -> $$0.a(this.g.s.G())).map(cfz::new));
            }
            this.d.a(this.h, $$4.f, $$4.g);
        }
        Iterator $$5 = $$3.iterator();
        for (int $$6 = 0; $$6 < 2; ++$$6) {
            if (!$$5.hasNext()) {
                return;
            }
            ciz $$7 = (ciz)$$5.next();
            if ($$7.d()) continue;
            ccx $$8 = $$1.get($$6);
            this.d.a($$7, $$8.f, $$8.g);
        }
    }

    protected abstract Set<cfu> b();
}

