/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class eyz
extends euq {
    private static final sw a = sw.c("selectWorld.experimental.title");
    private static final sw b = sw.c("selectWorld.experimental.message");
    private static final sw c = sw.c("selectWorld.experimental.details");
    private static final int k = 10;
    private static final int l = 100;
    private final BooleanConsumer m;
    final Collection<akg> n;
    private final esf o = new esf().a(10).b(20);

    public eyz(Collection<akg> $$0, BooleanConsumer $$1) {
        super(a);
        this.n = $$0;
        this.m = $$1;
    }

    @Override
    public sw au_() {
        return sv.a(new sw[]{super.au_(), b});
    }

    @Override
    protected void b() {
        super.b();
        esf.b $$02 = this.o.d(2);
        esj $$12 = $$02.b().b();
        $$02.a(new eqk(this.e, this.i), 2, $$12);
        eqa $$2 = $$02.a(new eqa(b, this.i).b(true), 2, $$12);
        $$2.i(310);
        $$02.a(epi.a(c, (epi $$0) -> this.f.a(new a())).a(100).a(), 2, $$12);
        $$02.a(epi.a(sv.i, (epi $$0) -> this.m.accept(true)).a());
        $$02.a(epi.a(sv.k, (epi $$0) -> this.m.accept(false)).a());
        this.o.a((epf $$1) -> {
            epf cfr_ignored_0 = (epf)this.d($$1);
        });
        this.o.c();
        this.aG_();
    }

    @Override
    protected void aG_() {
        ese.a(this.o, 0, 0, this.g, this.h, 0.5f, 0.5f);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void aw_() {
        this.m.accept(false);
    }

    class eyz$a
    extends euq {
        private a b;

        eyz$a() {
            super(sw.c("selectWorld.experimental.details.title"));
        }

        @Override
        public void aw_() {
            this.f.a(eyz.this);
        }

        @Override
        protected void b() {
            super.b();
            this.d(epi.a(sv.k, (epi $$0) -> this.aw_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
            this.b = new a(this.f, eyz.this.n);
            this.e(this.b);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, float $$3) {
            this.a($$0);
            this.b.a($$0, $$1, $$2, $$3);
            $$0.a(this.i, this.e, this.g / 2, 10, 0xFFFFFF);
            super.a($$0, $$1, $$2, $$3);
        }

        class a
        extends eqc<b> {
            public a(enn $$0, Collection<akg> $$1) {
                super($$0, a.this.g, a.this.h, 32, a.this.h - 64, ($$0.h.b + 2) * 3);
                for (akg $$2 : $$1) {
                    String $$3 = cay.a(cay.e, $$2.d());
                    if ($$3.isEmpty()) continue;
                    tj $$4 = sy.a($$2.a().e(), ts.a.a(true));
                    tj $$5 = sw.a("selectWorld.experimental.details.entry", new Object[]{$$3});
                    this.b(new b($$4, $$5, epz.a(a.this.i, (ta)$$5, this.b())));
                }
            }

            @Override
            public int b() {
                return this.d * 3 / 4;
            }
        }

        class b
        extends eqc.a<b> {
            private final sw b;
            private final sw c;
            private final epz d;

            b(sw $$0, sw $$1, epz $$2) {
                this.b = $$0;
                this.c = $$1;
                this.d = $$2;
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                $$0.b(((eyz$a)a.this).f.h, this.b, $$3, $$2, 0xFFFFFF);
                this.d.b($$0, $$3, $$2 + 12, ((eyz$a)a.this).i.b, 0xFFFFFF);
            }

            @Override
            public sw a() {
                return sw.a("narrator.select", sv.a(new sw[]{this.b, this.c}));
            }
        }
    }
}

