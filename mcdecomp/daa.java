/*
 * Decompiled with CFR 0.152.
 */
public abstract class daa {
    private static final int a = 5;
    private int b;

    protected abstract void a(cmm var1, gu var2, dcb var3);

    protected abstract void b(cmm var1, gu var2, dcb var3);

    protected abstract void a(cmm var1, gu var2, dcb var3, int var4, int var5);

    protected abstract boolean a(byo var1);

    public void a(byo $$0, cmm $$1, gu $$2, dcb $$3) {
        int $$4;
        if (($$4 = this.b++) == 0) {
            this.a($$1, $$2, $$3);
            $$1.a((bfj)$$0, dgl.k, $$2);
            daa.d($$1, $$2, $$3);
        }
        this.a($$1, $$2, $$3, $$4, this.b);
    }

    public void b(byo $$0, cmm $$1, gu $$2, dcb $$3) {
        int $$4 = this.b--;
        if (this.b == 0) {
            this.b($$1, $$2, $$3);
            $$1.a((bfj)$$0, dgl.j, $$2);
        }
        this.a($$1, $$2, $$3, $$4, this.b);
    }

    private int a(cmm $$0, gu $$1) {
        int $$2 = $$1.u();
        int $$3 = $$1.v();
        int $$4 = $$1.w();
        float $$5 = 5.0f;
        eed $$6 = new eed((float)$$2 - 5.0f, (float)$$3 - 5.0f, (float)$$4 - 5.0f, (float)($$2 + 1) + 5.0f, (float)($$3 + 1) + 5.0f, (float)($$4 + 1) + 5.0f);
        return $$0.a(dfz.a(byo.class), $$6, this::a).size();
    }

    public void c(cmm $$0, gu $$1, dcb $$2) {
        int $$4 = this.b;
        int $$3 = this.a($$0, $$1);
        if ($$4 != $$3) {
            boolean $$6;
            boolean $$5 = $$3 != 0;
            boolean bl2 = $$6 = $$4 != 0;
            if ($$5 && !$$6) {
                this.a($$0, $$1, $$2);
                $$0.a(null, dgl.k, $$1);
            } else if (!$$5) {
                this.b($$0, $$1, $$2);
                $$0.a(null, dgl.j, $$1);
            }
            this.b = $$3;
        }
        this.a($$0, $$1, $$2, $$4, $$3);
        if ($$3 > 0) {
            daa.d($$0, $$1, $$2);
        }
    }

    public int a() {
        return this.b;
    }

    private static void d(cmm $$0, gu $$1, dcb $$2) {
        $$0.a($$1, $$2.b(), 5);
    }
}

