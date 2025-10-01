/*
 * Decompiled with CFR 0.152.
 */
public interface eig
extends ein {
    public eip i();

    public void f();

    public void a(int var1, byte var2);

    public void a(int var1, short var2);

    public void a(int var1, float var2);

    @Override
    default public ein a(double $$0, double $$1, double $$2) {
        if (this.i().b() != eip.b.a) {
            return this;
        }
        if (this.i().a() != eip.a.a || this.i().c() != 3) {
            throw new IllegalStateException();
        }
        this.a(0, (float)$$0);
        this.a(4, (float)$$1);
        this.a(8, (float)$$2);
        this.f();
        return this;
    }

    @Override
    default public ein a(int $$0, int $$1, int $$2, int $$3) {
        eip $$4 = this.i();
        if ($$4.b() != eip.b.c) {
            return this;
        }
        if ($$4.a() != eip.a.b || $$4.c() != 4) {
            throw new IllegalStateException();
        }
        this.a(0, (byte)$$0);
        this.a(1, (byte)$$1);
        this.a(2, (byte)$$2);
        this.a(3, (byte)$$3);
        this.f();
        return this;
    }

    @Override
    default public ein a(float $$0, float $$1) {
        eip $$2 = this.i();
        if ($$2.b() != eip.b.d || $$2.d() != 0) {
            return this;
        }
        if ($$2.a() != eip.a.a || $$2.c() != 2) {
            throw new IllegalStateException();
        }
        this.a(0, $$0);
        this.a(4, $$1);
        this.f();
        return this;
    }

    @Override
    default public ein a(int $$0, int $$1) {
        return this.a((short)$$0, (short)$$1, 1);
    }

    @Override
    default public ein b(int $$0, int $$1) {
        return this.a((short)$$0, (short)$$1, 2);
    }

    default public ein a(short $$0, short $$1, int $$2) {
        eip $$3 = this.i();
        if ($$3.b() != eip.b.d || $$3.d() != $$2) {
            return this;
        }
        if ($$3.a() != eip.a.e || $$3.c() != 2) {
            throw new IllegalStateException();
        }
        this.a(0, $$0);
        this.a(2, $$1);
        this.f();
        return this;
    }

    @Override
    default public ein a(float $$0, float $$1, float $$2) {
        eip $$3 = this.i();
        if ($$3.b() != eip.b.b) {
            return this;
        }
        if ($$3.a() != eip.a.c || $$3.c() != 3) {
            throw new IllegalStateException();
        }
        this.a(0, eig.a($$0));
        this.a(1, eig.a($$1));
        this.a(2, eig.a($$2));
        this.f();
        return this;
    }

    public static byte a(float $$0) {
        return (byte)((int)(apa.a($$0, -1.0f, 1.0f) * 127.0f) & 0xFF);
    }
}

