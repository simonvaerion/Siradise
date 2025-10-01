/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public interface cer {
    public static final String o_ = "color";
    public static final String p_ = "display";
    public static final int q_ = 10511680;

    default public boolean a(cfz $$0) {
        qr $$1 = $$0.b(p_);
        return $$1 != null && $$1.b(o_, 99);
    }

    default public int e_(cfz $$0) {
        qr $$1 = $$0.b(p_);
        if ($$1 != null && $$1.b(o_, 99)) {
            return $$1.h(o_);
        }
        return 10511680;
    }

    default public void f_(cfz $$0) {
        qr $$1 = $$0.b(p_);
        if ($$1 != null && $$1.e(o_)) {
            $$1.r(o_);
        }
    }

    default public void a(cfz $$0, int $$1) {
        $$0.a(p_).a(o_, $$1);
    }

    public static cfz a(cfz $$0, List<ceo> $$1) {
        cfz $$2 = cfz.b;
        int[] $$3 = new int[3];
        int $$4 = 0;
        int $$5 = 0;
        cer $$6 = null;
        cfu $$7 = $$0.d();
        if ($$7 instanceof cer) {
            $$6 = (cer)((Object)$$7);
            $$2 = $$0.c(1);
            if ($$6.a($$0)) {
                int $$8 = $$6.e_($$2);
                float $$9 = (float)($$8 >> 16 & 0xFF) / 255.0f;
                float $$10 = (float)($$8 >> 8 & 0xFF) / 255.0f;
                float $$11 = (float)($$8 & 0xFF) / 255.0f;
                $$4 += (int)(Math.max($$9, Math.max($$10, $$11)) * 255.0f);
                $$3[0] = $$3[0] + (int)($$9 * 255.0f);
                $$3[1] = $$3[1] + (int)($$10 * 255.0f);
                $$3[2] = $$3[2] + (int)($$11 * 255.0f);
                ++$$5;
            }
            for (ceo $$12 : $$1) {
                float[] $$13 = $$12.d().d();
                int $$14 = (int)($$13[0] * 255.0f);
                int $$15 = (int)($$13[1] * 255.0f);
                int $$16 = (int)($$13[2] * 255.0f);
                $$4 += Math.max($$14, Math.max($$15, $$16));
                $$3[0] = $$3[0] + $$14;
                $$3[1] = $$3[1] + $$15;
                $$3[2] = $$3[2] + $$16;
                ++$$5;
            }
        }
        if ($$6 == null) {
            return cfz.b;
        }
        int $$17 = $$3[0] / $$5;
        int $$18 = $$3[1] / $$5;
        int $$19 = $$3[2] / $$5;
        float $$20 = (float)$$4 / (float)$$5;
        float $$21 = Math.max($$17, Math.max($$18, $$19));
        $$17 = (int)((float)$$17 * $$20 / $$21);
        $$18 = (int)((float)$$18 * $$20 / $$21);
        $$19 = (int)((float)$$19 * $$20 / $$21);
        int $$22 = $$17;
        $$22 = ($$22 << 8) + $$18;
        $$22 = ($$22 << 8) + $$19;
        $$6.a($$2, $$22);
        return $$2;
    }
}

