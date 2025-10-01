/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class fnl
implements fnd.a {
    private final Map<Integer, dxt> a = Maps.newHashMap();
    private final Map<Integer, Float> b = Maps.newHashMap();
    private final Map<Integer, Long> c = Maps.newHashMap();
    private static final long d = 5000L;
    private static final float e = 80.0f;
    private static final boolean f = true;
    private static final boolean g = false;
    private static final boolean h = false;
    private static final boolean i = true;
    private static final boolean j = true;
    private static final float k = 0.02f;

    public void a(int $$0, dxt $$1, float $$2) {
        this.a.put($$0, $$1);
        this.c.put($$0, ac.b());
        this.b.put($$0, Float.valueOf($$2));
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        if (this.a.isEmpty()) {
            return;
        }
        long $$5 = ac.b();
        for (Integer $$6 : this.a.keySet()) {
            dxt $$7 = this.a.get($$6);
            float $$8 = this.b.get($$6).floatValue();
            fnl.a($$0, $$1, $$7, $$8, true, true, $$2, $$3, $$4);
        }
        for (Integer $$9 : this.c.keySet().toArray(new Integer[0])) {
            if ($$5 - this.c.get($$9) <= 5000L) continue;
            this.a.remove($$9);
            this.c.remove($$9);
        }
    }

    public static void a(eij $$0, fjx $$1, dxt $$2, float $$3, boolean $$4, boolean $$5, double $$6, double $$7, double $$8) {
        fnl.a($$0, $$1.getBuffer(fkf.a(6.0)), $$2, $$6, $$7, $$8);
        gu $$9 = $$2.m();
        if (fnl.a($$9, $$6, $$7, $$8) <= 80.0f) {
            fnd.a($$0, $$1, new eed((float)$$9.u() + 0.25f, (float)$$9.v() + 0.25f, (double)$$9.w() + 0.25, (float)$$9.u() + 0.75f, (float)$$9.v() + 0.75f, (float)$$9.w() + 0.75f).d(-$$6, -$$7, -$$8), 0.0f, 1.0f, 0.0f, 0.5f);
            for (int $$10 = 0; $$10 < $$2.e(); ++$$10) {
                dxr $$11 = $$2.a($$10);
                if (!(fnl.a($$11.a(), $$6, $$7, $$8) <= 80.0f)) continue;
                float $$12 = $$10 == $$2.f() ? 1.0f : 0.0f;
                float $$13 = $$10 == $$2.f() ? 0.0f : 1.0f;
                fnd.a($$0, $$1, new eed((float)$$11.a + 0.5f - $$3, (float)$$11.b + 0.01f * (float)$$10, (float)$$11.c + 0.5f - $$3, (float)$$11.a + 0.5f + $$3, (float)$$11.b + 0.25f + 0.01f * (float)$$10, (float)$$11.c + 0.5f + $$3).d(-$$6, -$$7, -$$8), $$12, 0.0f, $$13, 0.5f);
            }
        }
        if ($$4) {
            for (dxr $$14 : $$2.l()) {
                if (!(fnl.a($$14.a(), $$6, $$7, $$8) <= 80.0f)) continue;
                fnd.a($$0, $$1, new eed((float)$$14.a + 0.5f - $$3 / 2.0f, (float)$$14.b + 0.01f, (float)$$14.c + 0.5f - $$3 / 2.0f, (float)$$14.a + 0.5f + $$3 / 2.0f, (double)$$14.b + 0.1, (float)$$14.c + 0.5f + $$3 / 2.0f).d(-$$6, -$$7, -$$8), 1.0f, 0.8f, 0.8f, 0.5f);
            }
            for (dxr $$15 : $$2.k()) {
                if (!(fnl.a($$15.a(), $$6, $$7, $$8) <= 80.0f)) continue;
                fnd.a($$0, $$1, new eed((float)$$15.a + 0.5f - $$3 / 2.0f, (float)$$15.b + 0.01f, (float)$$15.c + 0.5f - $$3 / 2.0f, (float)$$15.a + 0.5f + $$3 / 2.0f, (double)$$15.b + 0.1, (float)$$15.c + 0.5f + $$3 / 2.0f).d(-$$6, -$$7, -$$8), 0.8f, 1.0f, 1.0f, 0.5f);
            }
        }
        if ($$5) {
            for (int $$16 = 0; $$16 < $$2.e(); ++$$16) {
                dxr $$17 = $$2.a($$16);
                if (!(fnl.a($$17.a(), $$6, $$7, $$8) <= 80.0f)) continue;
                fnd.a($$0, $$1, String.valueOf((Object)$$17.l), (double)$$17.a + 0.5, (double)$$17.b + 0.75, (double)$$17.c + 0.5, -1, 0.02f, true, 0.0f, true);
                fnd.a($$0, $$1, String.format(Locale.ROOT, "%.2f", Float.valueOf($$17.k)), (double)$$17.a + 0.5, (double)$$17.b + 0.25, (double)$$17.c + 0.5, -1, 0.02f, true, 0.0f, true);
            }
        }
    }

    public static void a(eij $$0, ein $$1, dxt $$2, double $$3, double $$4, double $$5) {
        for (int $$6 = 0; $$6 < $$2.e(); ++$$6) {
            dxr $$7 = $$2.a($$6);
            if (fnl.a($$7.a(), $$3, $$4, $$5) > 80.0f) continue;
            float $$8 = (float)$$6 / (float)$$2.e() * 0.33f;
            int $$9 = $$6 == 0 ? 0 : apa.h($$8, 0.9f, 0.9f);
            int $$10 = $$9 >> 16 & 0xFF;
            int $$11 = $$9 >> 8 & 0xFF;
            int $$12 = $$9 & 0xFF;
            $$1.a($$0.c().a(), (float)((double)$$7.a - $$3 + 0.5), (float)((double)$$7.b - $$4 + 0.5), (float)((double)$$7.c - $$5 + 0.5)).a($$10, $$11, $$12, 255).e();
        }
    }

    private static float a(gu $$0, double $$1, double $$2, double $$3) {
        return (float)(Math.abs((double)$$0.u() - $$1) + Math.abs((double)$$0.v() - $$2) + Math.abs((double)$$0.w() - $$3));
    }
}

