/*
 * Decompiled with CFR 0.152.
 */
public abstract class ahu
extends dwq {
    protected ahu(int $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected boolean a(long $$0) {
        return $$0 == clt.a;
    }

    @Override
    protected void a(long $$0, int $$1, boolean $$2) {
        if ($$2 && $$1 >= this.f - 2) {
            return;
        }
        clt $$3 = new clt($$0);
        int $$4 = $$3.e;
        int $$5 = $$3.f;
        for (int $$6 = -1; $$6 <= 1; ++$$6) {
            for (int $$7 = -1; $$7 <= 1; ++$$7) {
                long $$8 = clt.c($$4 + $$6, $$5 + $$7);
                if ($$8 == $$0) continue;
                this.b($$0, $$8, $$1, $$2);
            }
        }
    }

    @Override
    protected int a(long $$0, long $$1, int $$2) {
        int $$3 = $$2;
        clt $$4 = new clt($$0);
        int $$5 = $$4.e;
        int $$6 = $$4.f;
        for (int $$7 = -1; $$7 <= 1; ++$$7) {
            for (int $$8 = -1; $$8 <= 1; ++$$8) {
                long $$9 = clt.c($$5 + $$7, $$6 + $$8);
                if ($$9 == $$0) {
                    $$9 = clt.a;
                }
                if ($$9 == $$1) continue;
                int $$10 = this.b($$9, $$0, this.c($$9));
                if ($$3 > $$10) {
                    $$3 = $$10;
                }
                if ($$3 != 0) continue;
                return $$3;
            }
        }
        return $$3;
    }

    @Override
    protected int b(long $$0, long $$1, int $$2) {
        if ($$0 == clt.a) {
            return this.b($$1);
        }
        return $$2 + 1;
    }

    protected abstract int b(long var1);

    public void b(long $$0, int $$1, boolean $$2) {
        this.a(clt.a, $$0, $$1, $$2);
    }
}

