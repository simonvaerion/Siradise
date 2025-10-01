/*
 * Decompiled with CFR 0.152.
 */
public final class cmy
implements ddu {
    private final int a;
    private final dcb[] b;

    public cmy(int $$0, dcb[] $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public dcb a(int $$0) {
        int $$1 = $$0 - this.a;
        if ($$1 < 0 || $$1 >= this.b.length) {
            return cpo.a.n();
        }
        return this.b[$$1];
    }

    @Override
    public void a(int $$0, dcb $$1) {
        int $$2 = $$0 - this.a;
        if ($$2 < 0 || $$2 >= this.b.length) {
            throw new IllegalArgumentException("Outside of column height: " + $$0);
        }
        this.b[$$2] = $$1;
    }
}

