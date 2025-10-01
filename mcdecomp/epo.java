/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

public abstract class epo<E extends a<E>>
extends epc<E> {
    public epo(enn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    @Nullable
    public eou a(esv $$02) {
        if (this.k() == 0) {
            return null;
        }
        if ($$02 instanceof esv.a) {
            eou $$6;
            esv.a $$1 = (esv.a)$$02;
            a $$2 = (a)this.h();
            if ($$1.b().a() == esw.a && $$2 != null) {
                return eou.a(this, $$2.a($$02));
            }
            int $$3 = -1;
            esx $$4 = $$1.b();
            if ($$2 != null) {
                $$3 = $$2.i().indexOf($$2.t());
            }
            if ($$3 == -1) {
                switch ($$4) {
                    case c: {
                        $$3 = Integer.MAX_VALUE;
                        $$4 = esx.b;
                        break;
                    }
                    case d: {
                        $$3 = 0;
                        $$4 = esx.b;
                        break;
                    }
                    default: {
                        $$3 = 0;
                    }
                }
            }
            a $$5 = $$2;
            do {
                if (($$5 = this.a($$4, $$0 -> !$$0.i().isEmpty(), $$5)) != null) continue;
                return null;
            } while (($$6 = $$5.a($$1, $$3)) == null);
            return eou.a(this, $$6);
        }
        return super.a($$02);
    }

    @Override
    public void a(@Nullable eqt $$0) {
        super.a($$0);
        if ($$0 == null) {
            this.a(null);
        }
    }

    @Override
    public esn.a q() {
        if (this.aB_()) {
            return esn.a.c;
        }
        return super.q();
    }

    @Override
    protected boolean e(int $$0) {
        return false;
    }

    @Override
    public void b(esp $$0) {
        a $$1 = (a)this.r();
        if ($$1 != null) {
            $$1.a($$0.a());
            this.a($$0, $$1);
        } else {
            a $$2 = (a)this.h();
            if ($$2 != null) {
                $$2.a($$0.a());
                this.a($$0, $$2);
            }
        }
        $$0.a(eso.d, (sw)sw.c("narration.component_list.usage"));
    }

    public static abstract class a<E extends a<E>>
    extends epc.a<E>
    implements eqs {
        @Nullable
        private eqt a;
        @Nullable
        private esn b;
        private boolean c;

        @Override
        public boolean aA_() {
            return this.c;
        }

        @Override
        public void c_(boolean $$0) {
            this.c = $$0;
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            return eqs.super.a($$0, $$1, $$2);
        }

        @Override
        public void a(@Nullable eqt $$0) {
            if (this.a != null) {
                this.a.b_(false);
            }
            if ($$0 != null) {
                $$0.b_(true);
            }
            this.a = $$0;
        }

        @Override
        @Nullable
        public eqt t() {
            return this.a;
        }

        @Nullable
        public eou a(esv $$0, int $$1) {
            if (this.i().isEmpty()) {
                return null;
            }
            eou $$2 = this.i().get(Math.min($$1, this.i().size() - 1)).a($$0);
            return eou.a(this, $$2);
        }

        @Override
        @Nullable
        public eou a(esv $$0) {
            if ($$0 instanceof esv.a) {
                int $$3;
                int $$2;
                esv.a $$1 = (esv.a)$$0;
                switch ($$1.b()) {
                    default: {
                        throw new IncompatibleClassChangeError();
                    }
                    case a: 
                    case b: {
                        int n2 = 0;
                        break;
                    }
                    case c: {
                        int n2 = -1;
                        break;
                    }
                    case d: {
                        int n2 = $$2 = 1;
                    }
                }
                if ($$2 == 0) {
                    return null;
                }
                for (int $$4 = $$3 = apa.a($$2 + this.i().indexOf(this.t()), 0, this.i().size() - 1); $$4 >= 0 && $$4 < this.i().size(); $$4 += $$2) {
                    eqt $$5 = this.i().get($$4);
                    eou $$6 = $$5.a($$0);
                    if ($$6 == null) continue;
                    return eou.a(this, $$6);
                }
            }
            return eqs.super.a($$0);
        }

        public abstract List<? extends esn> b();

        void a(esp $$0) {
            List<esn> $$1 = this.b();
            euq.b $$2 = euq.a($$1, this.b);
            if ($$2 != null) {
                if ($$2.c.a()) {
                    this.b = $$2.a;
                }
                if ($$1.size() > 1) {
                    $$0.a(eso.b, (sw)sw.a("narrator.position.object_list", $$2.b + 1, $$1.size()));
                    if ($$2.c == esn.a.c) {
                        $$0.a(eso.d, (sw)sw.c("narration.component_list.usage"));
                    }
                }
                $$2.a.b($$0.a());
            }
        }
    }
}

