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

public class chr
extends cfu
implements cht {
    public static final int a = 10;
    public static final float b = 8.0f;
    public static final float c = 2.5f;
    private final Multimap<bhb, bhe> d;

    public chr(cfu.a $$0) {
        super($$0);
        ImmutableMultimap.Builder $$1 = ImmutableMultimap.builder();
        $$1.put((Object)bhg.f, (Object)new bhe(m, "Tool modifier", 8.0, bhe.a.a));
        $$1.put((Object)bhg.h, (Object)new bhe(n, "Tool modifier", (double)-2.9f, bhe.a.a));
        this.d = $$1.build();
    }

    @Override
    public boolean a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
        return !$$3.f();
    }

    @Override
    public chs c(cfz $$0) {
        return chs.f;
    }

    @Override
    public int b(cfz $$0) {
        return 72000;
    }

    @Override
    public void a(cfz $$0, cmm $$12, bfz $$2, int $$3) {
        if (!($$2 instanceof byo)) {
            return;
        }
        byo $$4 = (byo)$$2;
        int $$5 = this.b($$0) - $$3;
        if ($$5 < 10) {
            return;
        }
        int $$6 = cki.h($$0);
        if ($$6 > 0 && !$$4.aW()) {
            return;
        }
        if (!$$12.B) {
            $$0.a(1, $$4, (T $$1) -> $$1.d($$2.fj()));
            if ($$6 == 0) {
                bzs $$7 = new bzs($$12, (bfz)$$4, $$0);
                $$7.a($$4, $$4.dA(), $$4.dy(), 0.0f, 2.5f + (float)$$6 * 0.5f, 1.0f);
                if ($$4.fO().d) {
                    $$7.d = byu.a.c;
                }
                $$12.b($$7);
                $$12.a(null, $$7, amh.xN, ami.h, 1.0f, 1.0f);
                if (!$$4.fO().d) {
                    $$4.fN().g($$0);
                }
            }
        }
        $$4.b(amr.c.b(this));
        if ($$6 > 0) {
            amg $$18;
            float $$8 = $$4.dy();
            float $$9 = $$4.dA();
            float $$10 = -apa.a($$8 * ((float)Math.PI / 180)) * apa.b($$9 * ((float)Math.PI / 180));
            float $$11 = -apa.a($$9 * ((float)Math.PI / 180));
            float $$122 = apa.b($$8 * ((float)Math.PI / 180)) * apa.b($$9 * ((float)Math.PI / 180));
            float $$13 = apa.c($$10 * $$10 + $$11 * $$11 + $$122 * $$122);
            float $$14 = 3.0f * ((1.0f + (float)$$6) / 4.0f);
            $$4.j($$10 *= $$14 / $$13, $$11 *= $$14 / $$13, $$122 *= $$14 / $$13);
            $$4.t(20);
            if ($$4.ay()) {
                float $$15 = 1.1999999f;
                $$4.a(bgf.a, new eei(0.0, 1.1999999284744263, 0.0));
            }
            if ($$6 >= 3) {
                amg $$16 = amh.xM;
            } else if ($$6 == 2) {
                amg $$17 = amh.xL;
            } else {
                $$18 = amh.xK;
            }
            $$12.a(null, $$4, $$18, ami.h, 1.0f, 1.0f);
        }
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        if ($$3.k() >= $$3.l() - 1) {
            return bdy.d($$3);
        }
        if (cki.h($$3) > 0 && !$$1.aW()) {
            return bdy.d($$3);
        }
        $$1.c($$2);
        return bdy.b($$3);
    }

    @Override
    public boolean a(cfz $$02, bfz $$1, bfz $$2) {
        $$02.a(1, $$2, (T $$0) -> $$0.d(bfo.a));
        return true;
    }

    @Override
    public boolean a(cfz $$02, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
        if ((double)$$2.h($$1, $$3) != 0.0) {
            $$02.a(2, $$4, (T $$0) -> $$0.d(bfo.a));
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

    @Override
    public int c() {
        return 1;
    }
}

