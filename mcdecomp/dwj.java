/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntRBTreeSet
 *  it.unimi.dsi.fastutil.ints.IntSortedSet
 */
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;

public class dwj {
    private final dwk[] a;
    private final double b;
    private final double c;

    public dwj(apf $$0, List<Integer> $$1) {
        this($$0, (IntSortedSet)new IntRBTreeSet($$1));
    }

    private dwj(apf $$0, IntSortedSet $$1) {
        int $$3;
        if ($$1.isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        int $$2 = -$$1.firstInt();
        int $$4 = $$2 + ($$3 = $$1.lastInt()) + 1;
        if ($$4 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
        }
        dwk $$5 = new dwk($$0);
        int $$6 = $$3;
        this.a = new dwk[$$4];
        if ($$6 >= 0 && $$6 < $$4 && $$1.contains(0)) {
            this.a[$$6] = $$5;
        }
        for (int $$7 = $$6 + 1; $$7 < $$4; ++$$7) {
            if ($$7 >= 0 && $$1.contains($$6 - $$7)) {
                this.a[$$7] = new dwk($$0);
                continue;
            }
            $$0.b(262);
        }
        if ($$3 > 0) {
            long $$8 = (long)($$5.a($$5.b, $$5.c, $$5.d) * 9.223372036854776E18);
            dij $$9 = new dij(new dhl($$8));
            for (int $$10 = $$6 - 1; $$10 >= 0; --$$10) {
                if ($$10 < $$4 && $$1.contains($$6 - $$10)) {
                    this.a[$$10] = new dwk($$9);
                    continue;
                }
                $$9.b(262);
            }
        }
        this.c = Math.pow(2.0, $$3);
        this.b = 1.0 / (Math.pow(2.0, $$4) - 1.0);
    }

    public double a(double $$0, double $$1, boolean $$2) {
        double $$3 = 0.0;
        double $$4 = this.c;
        double $$5 = this.b;
        for (dwk $$6 : this.a) {
            if ($$6 != null) {
                $$3 += $$6.a($$0 * $$4 + ($$2 ? $$6.b : 0.0), $$1 * $$4 + ($$2 ? $$6.c : 0.0)) * $$5;
            }
            $$4 /= 2.0;
            $$5 *= 2.0;
        }
        return $$3;
    }
}

