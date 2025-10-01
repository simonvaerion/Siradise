/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class dgx
implements dhe.c {
    public static final int a = 12;
    private static final int f = 24;
    private static final float[] g = ac.a(new float[13824], (T $$0) -> {
        for (int $$1 = 0; $$1 < 24; ++$$1) {
            for (int $$2 = 0; $$2 < 24; ++$$2) {
                for (int $$3 = 0; $$3 < 24; ++$$3) {
                    $$0[$$1 * 24 * 24 + $$2 * 24 + $$3] = (float)dgx.b($$2 - 12, $$3 - 12, $$1 - 12);
                }
            }
        }
    });
    private final ObjectListIterator<a> h;
    private final ObjectListIterator<dtc> i;

    public static dgx a(cne $$02, clt $$1) {
        int $$2 = $$1.d();
        int $$3 = $$1.e();
        ObjectArrayList $$4 = new ObjectArrayList(10);
        ObjectArrayList $$5 = new ObjectArrayList(32);
        $$02.a($$1, (dsa $$0) -> $$0.d() != dsl.a).forEach(arg_0 -> dgx.a($$1, (ObjectList)$$4, $$2, $$3, (ObjectList)$$5, arg_0));
        return new dgx((ObjectListIterator<a>)$$4.iterator(), (ObjectListIterator<dtc>)$$5.iterator());
    }

    @VisibleForTesting
    public dgx(ObjectListIterator<a> $$0, ObjectListIterator<dtc> $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    @Override
    public double a(dhd.b $$0) {
        int $$1 = $$0.a();
        int $$2 = $$0.b();
        int $$3 = $$0.c();
        double $$4 = 0.0;
        while (this.h.hasNext()) {
            a $$5 = (a)this.h.next();
            drs $$6 = $$5.a();
            int $$7 = $$5.c();
            int $$8 = Math.max(0, Math.max($$6.g() - $$1, $$1 - $$6.j()));
            int $$9 = Math.max(0, Math.max($$6.i() - $$3, $$3 - $$6.l()));
            int $$10 = $$6.h() + $$7;
            int $$11 = $$2 - $$10;
            int $$12 = switch ($$5.b()) {
                default -> throw new IncompatibleClassChangeError();
                case dsl.a -> 0;
                case dsl.b, dsl.c -> $$11;
                case dsl.d -> Math.max(0, Math.max($$10 - $$2, $$2 - $$6.k()));
            };
            $$4 += (switch ($$5.b()) {
                default -> throw new IncompatibleClassChangeError();
                case dsl.a -> 0.0;
                case dsl.b -> dgx.a($$8, $$12, $$9);
                case dsl.c, dsl.d -> dgx.a($$8, $$12, $$9, $$11) * 0.8;
            });
        }
        this.h.back(Integer.MAX_VALUE);
        while (this.i.hasNext()) {
            dtc $$13 = (dtc)this.i.next();
            int $$14 = $$1 - $$13.a();
            int $$15 = $$2 - $$13.b();
            int $$16 = $$3 - $$13.c();
            $$4 += dgx.a($$14, $$15, $$16, $$15) * 0.4;
        }
        this.i.back(Integer.MAX_VALUE);
        return $$4;
    }

    @Override
    public double a() {
        return Double.NEGATIVE_INFINITY;
    }

    @Override
    public double b() {
        return Double.POSITIVE_INFINITY;
    }

    private static double a(int $$0, int $$1, int $$2) {
        double $$3 = apa.f((double)$$0, (double)$$1 / 2.0, (double)$$2);
        return apa.a($$3, 0.0, 6.0, 1.0, 0.0);
    }

    private static double a(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = $$0 + 12;
        int $$5 = $$1 + 12;
        int $$6 = $$2 + 12;
        if (!(dgx.a($$4) && dgx.a($$5) && dgx.a($$6))) {
            return 0.0;
        }
        double $$7 = (double)$$3 + 0.5;
        double $$8 = apa.e((double)$$0, $$7, (double)$$2);
        double $$9 = -$$7 * apa.g($$8 / 2.0) / 2.0;
        return $$9 * (double)g[$$6 * 24 * 24 + $$4 * 24 + $$5];
    }

    private static boolean a(int $$0) {
        return $$0 >= 0 && $$0 < 24;
    }

    private static double b(int $$0, int $$1, int $$2) {
        return dgx.a($$0, (double)$$1 + 0.5, $$2);
    }

    private static double a(int $$0, double $$1, int $$2) {
        double $$3 = apa.e((double)$$0, $$1, (double)$$2);
        double $$4 = Math.pow(Math.E, -$$3 / 16.0);
        return $$4;
    }

    private static /* synthetic */ void a(clt $$0, ObjectList $$1, int $$2, int $$3, ObjectList $$4, dsi $$5) {
        dsl $$6 = $$5.h().d();
        for (dse $$7 : $$5.i()) {
            if (!$$7.a($$0, 12)) continue;
            if ($$7 instanceof drw) {
                drw $$8 = (drw)$$7;
                dtj.a $$9 = $$8.b().e();
                if ($$9 == dtj.a.b) {
                    $$1.add((Object)new a($$8.f(), $$6, $$8.d()));
                }
                for (dtc $$10 : $$8.e()) {
                    int $$11 = $$10.a();
                    int $$12 = $$10.c();
                    if ($$11 <= $$2 - 12 || $$12 <= $$3 - 12 || $$11 >= $$2 + 15 + 12 || $$12 >= $$3 + 15 + 12) continue;
                    $$4.add((Object)$$10);
                }
                continue;
            }
            $$1.add((Object)new a($$7.f(), $$6, 0));
        }
    }

    @VisibleForTesting
    public record a(drs a, dsl b, int c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "box;terrainAdjustment;groundLevelDelta", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "box;terrainAdjustment;groundLevelDelta", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "box;terrainAdjustment;groundLevelDelta", "a", "b", "c"}, this, $$0);
        }
    }
}

