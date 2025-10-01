/*
 * Decompiled with CFR 0.152.
 */
public abstract class ftp<T extends bfz, M extends fck<T>>
extends ftg<T, M> {
    public ftp(fpz<T, M> $$0) {
        super($$0);
    }

    protected abstract int a(T var1);

    protected abstract void a(eij var1, fjx var2, int var3, bfj var4, float var5, float var6, float var7, float var8);

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        int $$10 = this.a($$3);
        apf $$11 = apf.a(((bfj)$$3).af());
        if ($$10 <= 0) {
            return;
        }
        for (int $$12 = 0; $$12 < $$10; ++$$12) {
            $$0.a();
            fee $$13 = ((fck)this.c()).a($$11);
            fee.a $$14 = $$13.a($$11);
            $$13.a($$0);
            float $$15 = $$11.i();
            float $$16 = $$11.i();
            float $$17 = $$11.i();
            float $$18 = apa.i($$15, $$14.a, $$14.d) / 16.0f;
            float $$19 = apa.i($$16, $$14.b, $$14.e) / 16.0f;
            float $$20 = apa.i($$17, $$14.c, $$14.f) / 16.0f;
            $$0.a($$18, $$19, $$20);
            $$15 = -1.0f * ($$15 * 2.0f - 1.0f);
            $$16 = -1.0f * ($$16 * 2.0f - 1.0f);
            $$17 = -1.0f * ($$17 * 2.0f - 1.0f);
            this.a($$0, $$1, $$2, (bfj)$$3, $$15, $$16, $$17, $$6);
            $$0.b();
        }
    }
}

