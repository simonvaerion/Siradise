/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class eku {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public eku(int $$0, int $$1, int $$2, int $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
        int $$5 = $$1 + this.c;
        int $$6 = $$2 + this.d;
        boolean $$7 = $$3 >= $$5 && $$3 <= $$5 + this.a && $$4 >= $$6 && $$4 <= $$6 + this.b;
        this.a($$0, $$5, $$6, $$7);
    }

    protected abstract void a(eox var1, int var2, int var3, boolean var4);

    public int a() {
        return this.c + this.a;
    }

    public int b() {
        return this.d + this.b;
    }

    public abstract void a(int var1);

    public static void a(eox $$0, List<eku> $$1, gam<?> $$2, int $$3, int $$4, int $$5, int $$6) {
        for (eku $$7 : $$1) {
            if ($$2.b() <= $$7.a()) continue;
            $$7.a($$0, $$3, $$4, $$5, $$6);
        }
    }

    public static void a(gam<?> $$0, eqc.a<?> $$1, List<eku> $$2, int $$3, double $$4, double $$5) {
        int $$6;
        if ($$3 == 0 && ($$6 = $$0.i().indexOf($$1)) > -1) {
            $$0.a($$6);
            int $$7 = $$0.o();
            int $$8 = $$0.g($$6);
            int $$9 = (int)($$4 - (double)$$7);
            int $$10 = (int)($$5 - (double)$$8);
            for (eku $$11 : $$2) {
                if ($$9 < $$11.c || $$9 > $$11.a() || $$10 < $$11.d || $$10 > $$11.b()) continue;
                $$11.a($$6);
            }
        }
    }
}

