/*
 * Decompiled with CFR 0.152.
 */
public class eua
extends eui {
    private static final sw c = sw.b("(").b(sw.c("options.languageWarning")).f(")").a(n.h);
    private a k;
    final fwb l;

    public eua(euq $$0, enr $$1, fwb $$2) {
        super($$0, $$1, sw.c("options.language"));
        this.l = $$2;
    }

    @Override
    protected void b() {
        this.k = new a(this.f);
        this.e(this.k);
        this.d(this.b.L().a(this.b, this.g / 2 - 155, this.h - 38, 150));
        this.d(epi.a(sv.d, (epi $$0) -> this.l()).a(this.g / 2 - 155 + 160, this.h - 38, 150, 20).a());
        super.b();
    }

    void l() {
        a.a $$0 = (a.a)this.k.f();
        if ($$0 != null && !$$0.b.equals(this.l.a())) {
            this.l.a($$0.b);
            this.b.ag = $$0.b;
            this.f.j();
            this.b.aq();
        }
        this.f.a(this.a);
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        a.a $$3;
        if (esu.a($$0) && ($$3 = (a.a)this.k.f()) != null) {
            $$3.b();
            this.l();
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.k.a($$0, $$1, $$2, $$3);
        $$0.a(this.i, this.e, this.g / 2, 16, 0xFFFFFF);
        $$0.a(this.i, c, this.g / 2, this.h - 56, 0x808080);
        super.a($$0, $$1, $$2, $$3);
    }

    class eua$a
    extends eqc<a> {
        public eua$a(enn $$0) {
            super($$0, eua.this.g, eua.this.h, 32, eua.this.h - 65 + 4, 18);
            String $$12 = eua.this.l.a();
            eua.this.l.b().forEach(($$1, $$2) -> {
                a $$3 = new a((String)$$1, (fwa)$$2);
                this.b($$3);
                if ($$12.equals($$1)) {
                    this.a($$3);
                }
            });
            if (this.f() != null) {
                this.e((a)this.f());
            }
        }

        @Override
        protected int c() {
            return super.c() + 20;
        }

        @Override
        public int b() {
            return super.b() + 50;
        }

        @Override
        protected void a(eox $$0) {
            eua.this.a($$0);
        }

        public class a
        extends eqc.a<a> {
            final String b;
            private final sw c;
            private long d;

            public a(String $$1, fwa $$2) {
                this.b = $$1;
                this.c = $$2.a();
            }

            @Override
            public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
                $$0.a(eua.this.i, this.c, a.this.d / 2, $$2 + 1, 0xFFFFFF);
            }

            @Override
            public boolean a(double $$0, double $$1, int $$2) {
                if ($$2 == 0) {
                    this.b();
                    if (ac.b() - this.d < 250L) {
                        eua.this.l();
                    }
                    this.d = ac.b();
                    return true;
                }
                this.d = ac.b();
                return false;
            }

            void b() {
                a.this.a(this);
            }

            @Override
            public sw a() {
                return sw.a("narrator.select", this.c);
            }
        }
    }
}

