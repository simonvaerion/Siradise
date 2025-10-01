/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fme
extends fmi {
    private static final String a = "plank";
    private static final String b = "vChains";
    private static final String c = "normalChains";
    private static final String d = "chainL1";
    private static final String e = "chainL2";
    private static final String f = "chainR1";
    private static final String g = "chainR2";
    private static final String h = "board";
    private static final float i = 1.0f;
    private static final float j = 0.9f;
    private static final eei k = new eei(0.0, -0.32f, 0.073f);
    private final Map<ddo, a> l = (Map)ddo.a().collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$1 -> new a($$02.a(fed.b($$1)))));

    public fme(flv.a $$02) {
        super($$02);
    }

    @Override
    public float b() {
        return 1.0f;
    }

    @Override
    public float c() {
        return 0.9f;
    }

    @Override
    public void a(dav $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        dcb $$6 = $$0.q();
        cwn $$7 = (cwn)$$6.b();
        ddo $$8 = cwn.a($$7);
        a $$9 = this.l.get($$8);
        $$9.a($$6);
        this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }

    @Override
    void a(eij $$0, float $$1, dcb $$2) {
        $$0.a(0.5, 0.9375, 0.5);
        $$0.a(a.d.rotationDegrees($$1));
        $$0.a(0.0f, -0.3125f, 0.0f);
    }

    @Override
    void a(eij $$0, int $$1, int $$2, fcb $$3, ein $$4) {
        a $$5 = (a)$$3;
        $$5.a.a($$0, $$4, $$1, $$2);
    }

    @Override
    fwu a(ddo $$0) {
        return fkj.b($$0);
    }

    @Override
    eei d() {
        return k;
    }

    public static fek e() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a(h, fej.c().a(0, 12).a(-7.0f, 0.0f, -1.0f, 14.0f, 10.0f, 2.0f), feg.a);
        $$1.a(a, fej.c().a(0, 0).a(-8.0f, -6.0f, -2.0f, 16.0f, 2.0f, 4.0f), feg.a);
        fen $$2 = $$1.a(c, fej.c(), feg.a);
        $$2.a(d, fej.c().a(0, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), feg.a(-5.0f, -6.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        $$2.a(e, fej.c().a(6, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), feg.a(-5.0f, -6.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        $$2.a(f, fej.c().a(0, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), feg.a(5.0f, -6.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        $$2.a(g, fej.c().a(6, 6).a(-1.5f, 0.0f, 0.0f, 3.0f, 6.0f, 0.0f), feg.a(5.0f, -6.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        $$1.a(b, fej.c().a(14, 6).a(-6.0f, -6.0f, 0.0f, 12.0f, 6.0f, 0.0f), feg.a);
        return fek.a($$0, 64, 32);
    }

    public static final class a
    extends fcb {
        public final fee a;
        public final fee b;
        public final fee c;
        public final fee d;

        public a(fee $$0) {
            super(fkf::d);
            this.a = $$0;
            this.b = $$0.b(fme.a);
            this.d = $$0.b(fme.c);
            this.c = $$0.b(fme.b);
        }

        public void a(dcb $$0) {
            boolean $$1;
            this.b.k = $$1 = !($$0.b() instanceof cql);
            this.c.k = false;
            this.d.k = true;
            if (!$$1) {
                boolean $$2 = $$0.c(dcr.a);
                this.d.k = !$$2;
                this.c.k = $$2;
            }
        }

        @Override
        public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
            this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
    }
}

