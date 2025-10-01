/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

public class cej
extends chn
implements cht {
    private final anl<cpn> a;
    protected final float b;
    private final float c;
    private final Multimap<bhb, bhe> d;

    protected cej(float $$0, float $$1, chm $$2, anl<cpn> $$3, cfu.a $$4) {
        super($$2, $$4);
        this.a = $$3;
        this.b = $$2.b();
        this.c = $$0 + $$2.c();
        ImmutableMultimap.Builder $$5 = ImmutableMultimap.builder();
        $$5.put((Object)bhg.f, (Object)new bhe(m, "Tool modifier", (double)this.c, bhe.a.a));
        $$5.put((Object)bhg.h, (Object)new bhe(n, "Tool modifier", (double)$$1, bhe.a.a));
        this.d = $$5.build();
    }

    @Override
    public float a(cfz $$0, dcb $$1) {
        return $$1.a(this.a) ? this.b : 1.0f;
    }

    @Override
    public boolean a(cfz $$02, bfz $$1, bfz $$2) {
        $$02.a(2, $$2, (T $$0) -> $$0.d(bfo.a));
        return true;
    }

    @Override
    public boolean a(cfz $$02, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
        if (!$$1.B && $$2.h($$1, $$3) != 0.0f) {
            $$02.a(1, $$4, (T $$0) -> $$0.d(bfo.a));
        }
        return true;
    }

    @Override
    public Multimap<bhb, bhe> a(bfo $$0) {
        if ($$0 == bfo.a) {
            return this.d;
        }
        return super.a($$0);
    }

    public float d() {
        return this.c;
    }

    @Override
    public boolean a_(dcb $$0) {
        int $$1 = this.i().d();
        if ($$1 < 3 && $$0.a(amw.bC)) {
            return false;
        }
        if ($$1 < 2 && $$0.a(amw.bD)) {
            return false;
        }
        if ($$1 < 1 && $$0.a(amw.bE)) {
            return false;
        }
        return $$0.a(this.a);
    }
}

