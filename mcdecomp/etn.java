/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class etn
extends euq {
    private static final int b = 128;
    private static final int c = 18;
    private static final int k = 20;
    private static final int l = 1;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 2;
    protected final eza a;
    private final Consumer<dqd> p;
    dqd q;
    private sw r;
    private sw s;
    private a t;
    private epi u;

    public etn(eza $$0, Consumer<dqd> $$1, dqd $$2) {
        super(sw.c("createWorld.customize.flat.title"));
        this.a = $$0;
        this.p = $$1;
        this.q = $$2;
    }

    public dqd j() {
        return this.q;
    }

    public void a(dqd $$0) {
        this.q = $$0;
    }

    @Override
    protected void b() {
        this.r = sw.c("createWorld.customize.flat.tile");
        this.s = sw.c("createWorld.customize.flat.height");
        this.t = new a();
        this.e(this.t);
        this.u = this.d(epi.a(sw.c("createWorld.customize.flat.removeLayer"), (epi $$0) -> {
            if (!this.B()) {
                return;
            }
            List<dqa> $$1 = this.q.e();
            int $$2 = this.t.i().indexOf(this.t.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.t.a($$1.isEmpty() ? null : (a.a)this.t.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.t.d();
            this.l();
        }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
        this.d(epi.a(sw.c("createWorld.customize.presets"), (epi $$0) -> {
            this.f.a(new eun(this));
            this.q.g();
            this.l();
        }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
        this.d(epi.a(sv.d, (epi $$0) -> {
            this.p.accept(this.q);
            this.f.a(this.a);
            this.q.g();
        }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
        this.d(epi.a(sv.e, (epi $$0) -> {
            this.f.a(this.a);
            this.q.g();
        }).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
        this.q.g();
        this.l();
    }

    void l() {
        this.u.r = this.B();
    }

    private boolean B() {
        return this.t.f() != null;
    }

    @Override
    public void aw_() {
        this.f.a(this.a);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        this.t.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 8, 0xFFFFFF);
        int $$4 = this.g / 2 - 92 - 16;
        $$0.b(this.i, this.r, $$4, 32, 0xFFFFFF);
        $$0.b(this.i, this.s, $$4 + 2 + 213 - this.i.a(this.s), 32, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }

    class etn$a
    extends eqc<a> {
        static final acq l = new acq("textures/gui/container/stats_icons.png");

        public etn$a() {
            super(etn.this.f, etn.this.g, etn.this.h, 43, etn.this.h - 60, 24);
            for (int $$0 = 0; $$0 < etn.this.q.e().size(); ++$$0) {
                this.b(new a());
            }
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            etn.this.l();
        }

        @Override
        protected int c() {
            return this.d - 70;
        }

        public void d() {
            int $$0 = this.i().indexOf(this.f());
            this.j();
            for (int $$1 = 0; $$1 < etn.this.q.e().size(); ++$$1) {
                this.b(new a());
            }
            List $$2 = this.i();
            if ($$0 >= 0 && $$0 < $$2.size()) {
                this.a((a)$$2.get($$0));
            }
        }

        class a
        extends eqc.a<a> {
            a() {
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                tj $$15;
                dqa $$10 = etn.this.q.e().get(etn.this.q.e().size() - $$1 - 1);
                dcb $$11 = $$10.b();
                cfz $$12 = this.a($$11);
                this.a($$0, $$3, $$2, $$12);
                $$0.a(etn.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 0xFFFFFF, false);
                if ($$1 == 0) {
                    tj $$13 = sw.a("createWorld.customize.flat.layer.top", $$10.a());
                } else if ($$1 == etn.this.q.e().size() - 1) {
                    tj $$14 = sw.a("createWorld.customize.flat.layer.bottom", $$10.a());
                } else {
                    $$15 = sw.a("createWorld.customize.flat.layer", $$10.a());
                }
                $$0.a(etn.this.i, $$15, $$3 + 2 + 213 - etn.this.i.a($$15), $$2 + 3, 0xFFFFFF, false);
            }

            private cfz a(dcb $$0) {
                cfu $$1 = $$0.b().k();
                if ($$1 == cgc.a) {
                    if ($$0.a(cpo.G)) {
                        $$1 = cgc.pL;
                    } else if ($$0.a(cpo.H)) {
                        $$1 = cgc.pM;
                    }
                }
                return new cfz($$1);
            }

            @Override
            public sw a() {
                dqa $$0 = etn.this.q.e().get(etn.this.q.e().size() - a.this.i().indexOf(this) - 1);
                cfz $$1 = this.a($$0.b());
                if (!$$1.b()) {
                    return sw.a("narrator.select", $$1.y());
                }
                return sv.a;
            }

            @Override
            public boolean a(double $$0, double $$1, int $$2) {
                if ($$2 == 0) {
                    a.this.a(this);
                    return true;
                }
                return false;
            }

            private void a(eox $$0, int $$1, int $$2, cfz $$3) {
                this.a($$0, $$1 + 1, $$2 + 1);
                if (!$$3.b()) {
                    $$0.b($$3, $$1 + 2, $$2 + 2);
                }
            }

            private void a(eox $$0, int $$1, int $$2) {
                $$0.a(l, $$1, $$2, 0, 0.0f, 0.0f, 18, 18, 128, 128);
            }
        }
    }
}

