/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class esf
extends esd {
    private final List<esi> c = new ArrayList<esi>();
    private final List<a> d = new ArrayList<a>();
    private final esj e = esj.i();
    private int f = 0;
    private int g = 0;

    public esf() {
        this(0, 0);
    }

    public esf(int $$0, int $$1) {
        super($$0, $$1, 0, 0);
    }

    @Override
    public void c() {
        super.c();
        int $$0 = 0;
        int $$1 = 0;
        for (a $$2 : this.d) {
            $$0 = Math.max($$2.c(), $$0);
            $$1 = Math.max($$2.d(), $$1);
        }
        int[] $$3 = new int[$$1 + 1];
        int[] $$4 = new int[$$0 + 1];
        for (a $$5 : this.d) {
            int $$6 = $$5.a() - ($$5.e - 1) * this.f;
            c $$7 = new c($$6, $$5.e);
            for (int $$8 = $$5.c; $$8 <= $$5.c(); ++$$8) {
                $$4[$$8] = Math.max($$4[$$8], $$7.nextInt());
            }
            int $$9 = $$5.b() - ($$5.f - 1) * this.g;
            c $$10 = new c($$9, $$5.f);
            for (int $$11 = $$5.d; $$11 <= $$5.d(); ++$$11) {
                $$3[$$11] = Math.max($$3[$$11], $$10.nextInt());
            }
        }
        int[] $$12 = new int[$$1 + 1];
        int[] $$13 = new int[$$0 + 1];
        $$12[0] = 0;
        for (int $$14 = 1; $$14 <= $$1; ++$$14) {
            $$12[$$14] = $$12[$$14 - 1] + $$3[$$14 - 1] + this.g;
        }
        $$13[0] = 0;
        for (int $$15 = 1; $$15 <= $$0; ++$$15) {
            $$13[$$15] = $$13[$$15 - 1] + $$4[$$15 - 1] + this.f;
        }
        for (a $$16 : this.d) {
            int $$17 = 0;
            for (int $$18 = $$16.d; $$18 <= $$16.d(); ++$$18) {
                $$17 += $$3[$$18];
            }
            $$16.a(this.p() + $$12[$$16.d], $$17 += this.g * ($$16.f - 1));
            int $$19 = 0;
            for (int $$20 = $$16.c; $$20 <= $$16.c(); ++$$20) {
                $$19 += $$4[$$20];
            }
            $$16.b(this.r() + $$13[$$16.c], $$19 += this.f * ($$16.e - 1));
        }
        this.a = $$12[$$1] + $$3[$$1];
        this.b = $$13[$$0] + $$4[$$0];
    }

    public <T extends esi> T a(T $$0, int $$1, int $$2) {
        return this.a($$0, $$1, $$2, this.a());
    }

    public <T extends esi> T a(T $$0, int $$1, int $$2, esj $$3) {
        return this.a($$0, $$1, $$2, 1, 1, $$3);
    }

    public <T extends esi> T a(T $$0, int $$1, int $$2, int $$3, int $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4, this.a());
    }

    public <T extends esi> T a(T $$0, int $$1, int $$2, int $$3, int $$4, esj $$5) {
        if ($$3 < 1) {
            throw new IllegalArgumentException("Occupied rows must be at least 1");
        }
        if ($$4 < 1) {
            throw new IllegalArgumentException("Occupied columns must be at least 1");
        }
        this.d.add(new a($$0, $$1, $$2, $$3, $$4, $$5));
        this.c.add($$0);
        return $$0;
    }

    public esf a(int $$0) {
        this.g = $$0;
        return this;
    }

    public esf b(int $$0) {
        this.f = $$0;
        return this;
    }

    public esf c(int $$0) {
        return this.a($$0).b($$0);
    }

    @Override
    public void b(Consumer<esi> $$0) {
        this.c.forEach($$0);
    }

    public esj a() {
        return this.e.g();
    }

    public esj b() {
        return this.e;
    }

    public b d(int $$0) {
        return new b($$0);
    }

    static class a
    extends esd.a {
        final int c;
        final int d;
        final int e;
        final int f;

        a(esi $$0, int $$1, int $$2, int $$3, int $$4, esj $$5) {
            super($$0, $$5.h());
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        public int c() {
            return this.c + this.e - 1;
        }

        public int d() {
            return this.d + this.f - 1;
        }
    }

    public final class b {
        private final int b;
        private int c;

        b(int $$1) {
            this.b = $$1;
        }

        public <T extends esi> T a(T $$0) {
            return this.a($$0, 1);
        }

        public <T extends esi> T a(T $$0, int $$1) {
            return this.a($$0, $$1, this.c());
        }

        public <T extends esi> T a(T $$0, esj $$1) {
            return this.a($$0, 1, $$1);
        }

        public <T extends esi> T a(T $$0, int $$1, esj $$2) {
            int $$3 = this.c / this.b;
            int $$4 = this.c % this.b;
            if ($$4 + $$1 > this.b) {
                ++$$3;
                $$4 = 0;
                this.c = apa.d(this.c, this.b);
            }
            this.c += $$1;
            return esf.this.a($$0, $$3, $$4, 1, $$1, $$2);
        }

        public esf a() {
            return esf.this;
        }

        public esj b() {
            return esf.this.a();
        }

        public esj c() {
            return esf.this.b();
        }
    }
}

