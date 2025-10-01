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

public class chk
extends chn
implements cht {
    private final float a;
    private final Multimap<bhb, bhe> b;

    public chk(chm $$0, int $$1, float $$2, cfu.a $$3) {
        super($$0, $$3);
        this.a = (float)$$1 + $$0.c();
        ImmutableMultimap.Builder $$4 = ImmutableMultimap.builder();
        $$4.put((Object)bhg.f, (Object)new bhe(m, "Weapon modifier", (double)this.a, bhe.a.a));
        $$4.put((Object)bhg.h, (Object)new bhe(n, "Weapon modifier", (double)$$2, bhe.a.a));
        this.b = $$4.build();
    }

    public float h() {
        return this.a;
    }

    @Override
    public boolean a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
        return !$$3.f();
    }

    @Override
    public float a(cfz $$0, dcb $$1) {
        if ($$1.a(cpo.bs)) {
            return 15.0f;
        }
        return $$1.a(amw.bB) ? 1.5f : 1.0f;
    }

    @Override
    public boolean a(cfz $$02, bfz $$1, bfz $$2) {
        $$02.a(1, $$2, (T $$0) -> $$0.d(bfo.a));
        return true;
    }

    @Override
    public boolean a(cfz $$02, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
        if ($$2.h($$1, $$3) != 0.0f) {
            $$02.a(2, $$4, (T $$0) -> $$0.d(bfo.a));
        }
        return true;
    }

    @Override
    public boolean a_(dcb $$0) {
        return $$0.a(cpo.bs);
    }

    @Override
    public Multimap<bhb, bhe> a(bfo $$0) {
        if ($$0 == bfo.a) {
            return this.b;
        }
        return super.a($$0);
    }
}

