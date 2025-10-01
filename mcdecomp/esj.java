/*
 * Decompiled with CFR 0.152.
 */
public interface esj {
    public esj a(int var1);

    public esj a(int var1, int var2);

    public esj a(int var1, int var2, int var3, int var4);

    public esj b(int var1);

    public esj c(int var1);

    public esj d(int var1);

    public esj e(int var1);

    public esj f(int var1);

    public esj g(int var1);

    public esj a(float var1, float var2);

    public esj a(float var1);

    public esj b(float var1);

    default public esj a() {
        return this.a(0.0f);
    }

    default public esj b() {
        return this.a(0.5f);
    }

    default public esj c() {
        return this.a(1.0f);
    }

    default public esj d() {
        return this.b(0.0f);
    }

    default public esj e() {
        return this.b(0.5f);
    }

    default public esj f() {
        return this.b(1.0f);
    }

    public esj g();

    public a h();

    public static esj i() {
        return new a();
    }

    public static class a
    implements esj {
        public int a;
        public int b;
        public int c;
        public int d;
        public float e;
        public float f;

        public a() {
        }

        public a(a $$0) {
            this.a = $$0.a;
            this.b = $$0.b;
            this.c = $$0.c;
            this.d = $$0.d;
            this.e = $$0.e;
            this.f = $$0.f;
        }

        public a h(int $$0) {
            return this.b($$0, $$0);
        }

        public a b(int $$0, int $$1) {
            return this.m($$0).n($$1);
        }

        public a b(int $$0, int $$1, int $$2, int $$3) {
            return this.i($$0).k($$2).j($$1).l($$3);
        }

        public a i(int $$0) {
            this.a = $$0;
            return this;
        }

        public a j(int $$0) {
            this.b = $$0;
            return this;
        }

        public a k(int $$0) {
            this.c = $$0;
            return this;
        }

        public a l(int $$0) {
            this.d = $$0;
            return this;
        }

        public a m(int $$0) {
            return this.i($$0).k($$0);
        }

        public a n(int $$0) {
            return this.j($$0).l($$0);
        }

        public a b(float $$0, float $$1) {
            this.e = $$0;
            this.f = $$1;
            return this;
        }

        public a c(float $$0) {
            this.e = $$0;
            return this;
        }

        public a d(float $$0) {
            this.f = $$0;
            return this;
        }

        public a j() {
            return new a(this);
        }

        @Override
        public a h() {
            return this;
        }

        @Override
        public /* synthetic */ esj g() {
            return this.j();
        }

        @Override
        public /* synthetic */ esj b(float f2) {
            return this.d(f2);
        }

        @Override
        public /* synthetic */ esj a(float f2) {
            return this.c(f2);
        }

        @Override
        public /* synthetic */ esj a(float f2, float f3) {
            return this.b(f2, f3);
        }

        @Override
        public /* synthetic */ esj g(int n2) {
            return this.n(n2);
        }

        @Override
        public /* synthetic */ esj f(int n2) {
            return this.m(n2);
        }

        @Override
        public /* synthetic */ esj e(int n2) {
            return this.l(n2);
        }

        @Override
        public /* synthetic */ esj d(int n2) {
            return this.k(n2);
        }

        @Override
        public /* synthetic */ esj c(int n2) {
            return this.j(n2);
        }

        @Override
        public /* synthetic */ esj b(int n2) {
            return this.i(n2);
        }

        @Override
        public /* synthetic */ esj a(int n2, int n3, int n4, int n5) {
            return this.b(n2, n3, n4, n5);
        }

        @Override
        public /* synthetic */ esj a(int n2, int n3) {
            return this.b(n2, n3);
        }

        @Override
        public /* synthetic */ esj a(int n2) {
            return this.h(n2);
        }
    }
}

