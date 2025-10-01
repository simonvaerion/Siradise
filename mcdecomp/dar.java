/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public class dar
extends czn
implements dgn.b<a> {
    private final a a;

    public dar(gu $$0, dcb $$1) {
        super(czp.K, $$0, $$1);
        this.a = new a($$1, new dgh($$0));
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, dar $$3) {
        $$3.a.d().a($$0, $$1, $$0.y_(), true);
    }

    @Override
    public void a(qr $$0) {
        this.a.b.a($$0);
    }

    @Override
    protected void b(qr $$0) {
        this.a.b.b($$0);
        super.b($$0);
    }

    public a c() {
        return this.a;
    }

    @Override
    public /* synthetic */ dgn d() {
        return this.c();
    }

    public static class a
    implements dgn {
        public static final int a = 8;
        final cwi b;
        private final dcb c;
        private final dgp d;

        public a(dcb $$0, dgp $$1) {
            this.c = $$0;
            this.d = $$1;
            this.b = cwi.a();
        }

        @Override
        public dgp a() {
            return this.d;
        }

        @Override
        public int b() {
            return 8;
        }

        @Override
        public dgn.a c() {
            return dgn.a.b;
        }

        @Override
        public boolean a(aif $$0, dgl $$12, dgl.a $$2, eei $$3) {
            bfj bfj2;
            if ($$12 == dgl.p && (bfj2 = $$2.a()) instanceof bfz) {
                bfz $$4 = (bfz)bfj2;
                if (!$$4.ez()) {
                    int $$5 = $$4.ea();
                    if ($$4.dY() && $$5 > 0) {
                        this.b.a(gu.a($$3.a(ha.b, 0.5)), $$5);
                        this.a((cmm)$$0, $$4);
                    }
                    $$4.ey();
                    this.d.a($$0).ifPresent($$1 -> this.a($$0, gu.a($$1), this.c, $$0.y_()));
                }
                return true;
            }
            return false;
        }

        @VisibleForTesting
        public cwi d() {
            return this.b;
        }

        private void a(aif $$0, gu $$1, dcb $$2, apf $$3) {
            $$0.a($$1, (dcb)$$2.a(cwf.a, true), 3);
            $$0.a($$1, $$2.b(), 8);
            $$0.a(iv.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
            $$0.a(null, $$1, amh.un, ami.e, 2.0f, 0.6f + $$3.i() * 0.4f);
        }

        private void a(cmm $$0, bfz $$1) {
            bfz $$2 = $$1.ed();
            if ($$2 instanceof aig) {
                aig $$3 = (aig)$$2;
                ben $$4 = $$1.et() == null ? $$0.ag().a($$3) : $$1.et();
                ai.W.a($$3, $$1, $$4);
            }
        }
    }
}

