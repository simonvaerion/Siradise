/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P2
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class doe {
    public static final Codec<doe> d = jb.X.q().dispatch(doe::a, dof::a);
    protected final bdc e;
    protected final bdc f;

    protected static <P extends doe> Products.P2<RecordCodecBuilder.Mu<P>, bdc, bdc> b(RecordCodecBuilder.Instance<P> $$02) {
        return $$02.group((App)bdc.b(0, 16).fieldOf("radius").forGetter($$0 -> $$0.e), (App)bdc.b(0, 16).fieldOf("offset").forGetter($$0 -> $$0.f));
    }

    public doe(bdc $$0, bdc $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    protected abstract dof<?> a();

    public void a(cms $$0, b $$1, apf $$2, dno $$3, int $$4, a $$5, int $$6, int $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
    }

    protected abstract void a(cms var1, b var2, apf var3, dno var4, int var5, a var6, int var7, int var8, int var9);

    public abstract int a(apf var1, int var2, dno var3);

    public int a(apf $$0, int $$1) {
        return this.e.a($$0);
    }

    private int a(apf $$0) {
        return this.f.a($$0);
    }

    protected abstract boolean a(apf var1, int var2, int var3, int var4, int var5, boolean var6);

    protected boolean b(apf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        int $$9;
        int $$8;
        if ($$5) {
            int $$6 = Math.min(Math.abs($$1), Math.abs($$1 - 1));
            int $$7 = Math.min(Math.abs($$3), Math.abs($$3 - 1));
        } else {
            $$8 = Math.abs($$1);
            $$9 = Math.abs($$3);
        }
        return this.a($$0, $$8, $$2, $$9, $$4, $$5);
    }

    protected void a(cms $$0, b $$1, apf $$2, dno $$3, gu $$4, int $$5, int $$6, boolean $$7) {
        int $$8 = $$7 ? 1 : 0;
        gu.a $$9 = new gu.a();
        for (int $$10 = -$$5; $$10 <= $$5 + $$8; ++$$10) {
            for (int $$11 = -$$5; $$11 <= $$5 + $$8; ++$$11) {
                if (this.b($$2, $$10, $$6, $$11, $$5, $$7)) continue;
                $$9.a($$4, $$10, $$6, $$11);
                doe.a($$0, $$1, $$2, $$3, $$9);
            }
        }
    }

    protected final void a(cms $$0, b $$1, apf $$2, dno $$3, gu $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        int $$10 = $$7 ? 1 : 0;
        gu $$11 = $$4.d();
        gu.a $$12 = new gu.a();
        for (ha $$13 : ha.c.a) {
            ha $$14 = $$13.h();
            int $$15 = $$14.f() == ha.b.a ? $$5 + $$10 : $$5;
            $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
            for (int $$16 = -$$5; $$16 < $$5 + $$10; ++$$16) {
                boolean $$17 = $$1.a($$12.c(ha.b));
                $$12.c(ha.a);
                if ($$17 && doe.a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
                    $$12.c(ha.a);
                    doe.a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
                    $$12.c(ha.b);
                }
                $$12.c($$13);
            }
        }
    }

    private static boolean a(cms $$0, b $$1, apf $$2, dno $$3, float $$4, gu $$5, gu.a $$6) {
        if ($$6.k($$5) >= 7) {
            return false;
        }
        if ($$2.i() > $$4) {
            return false;
        }
        return doe.a($$0, $$1, $$2, $$3, $$6);
    }

    protected static boolean a(cms $$02, b $$1, apf $$2, dno $$3, gu $$4) {
        if (!dma.c($$02, $$4)) {
            return false;
        }
        dcb $$5 = $$3.e.a($$2, $$4);
        if ($$5.b(dcr.C)) {
            $$5 = (dcb)$$5.a(dcr.C, $$02.b($$4, $$0 -> $$0.a(dxf.c)));
        }
        $$1.a($$4, $$5);
        return true;
    }

    public static interface b {
        public void a(gu var1, dcb var2);

        public boolean a(gu var1);
    }

    public static final class a {
        private final gu a;
        private final int b;
        private final boolean c;

        public a(gu $$0, int $$1, boolean $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public gu a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }
}

