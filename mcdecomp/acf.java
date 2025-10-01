/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public interface acf<T> {
    default public void a(int $$0, int $$1, int $$2, cjc<?> $$3, Iterator<T> $$4, int $$5) {
        int $$6 = $$0;
        int $$7 = $$1;
        if ($$3 instanceof cjh) {
            cjh $$8 = (cjh)$$3;
            $$6 = $$8.k();
            $$7 = $$8.l();
        }
        int $$9 = 0;
        block0: for (int $$10 = 0; $$10 < $$1; ++$$10) {
            if ($$9 == $$2) {
                ++$$9;
            }
            boolean $$11 = (float)$$7 < (float)$$1 / 2.0f;
            int $$12 = apa.d((float)$$1 / 2.0f - (float)$$7 / 2.0f);
            if ($$11 && $$12 > $$10) {
                $$9 += $$0;
                ++$$10;
            }
            for (int $$13 = 0; $$13 < $$0; ++$$13) {
                boolean $$15;
                if (!$$4.hasNext()) {
                    return;
                }
                $$11 = (float)$$6 < (float)$$0 / 2.0f;
                $$12 = apa.d((float)$$0 / 2.0f - (float)$$6 / 2.0f);
                int $$14 = $$6;
                boolean bl2 = $$15 = $$13 < $$6;
                if ($$11) {
                    $$14 = $$12 + $$6;
                    boolean bl3 = $$15 = $$12 <= $$13 && $$13 < $$12 + $$6;
                }
                if ($$15) {
                    this.a($$4, $$9, $$5, $$10, $$13);
                } else if ($$14 == $$13) {
                    $$9 += $$0 - $$13;
                    continue block0;
                }
                ++$$9;
            }
        }
    }

    public void a(Iterator<T> var1, int var2, int var3, int var4, int var5);
}

