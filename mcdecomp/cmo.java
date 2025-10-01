/*
 * Decompiled with CFR 0.152.
 */
public interface cmo {
    public int D_();

    public int C_();

    default public int aj() {
        return this.C_() + this.D_();
    }

    default public int ak() {
        return this.am() - this.al();
    }

    default public int al() {
        return hx.a(this.C_());
    }

    default public int am() {
        return hx.a(this.aj() - 1) + 1;
    }

    default public boolean r(gu $$0) {
        return this.d($$0.v());
    }

    default public boolean d(int $$0) {
        return $$0 < this.C_() || $$0 >= this.aj();
    }

    default public int e(int $$0) {
        return this.f(hx.a($$0));
    }

    default public int f(int $$0) {
        return $$0 - this.al();
    }

    default public int g(int $$0) {
        return $$0 + this.al();
    }

    public static cmo e(final int $$0, final int $$1) {
        return new cmo(){

            @Override
            public int D_() {
                return $$1;
            }

            @Override
            public int C_() {
                return $$0;
            }
        };
    }
}

