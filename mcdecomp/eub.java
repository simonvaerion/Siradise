/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class eub
extends euq {
    private static final long a = 2000L;
    private final ais b;
    private long c = -1L;
    private boolean k;
    private static final Object2IntMap<dec> l = (Object2IntMap)ac.a(new Object2IntOpenHashMap(), (T $$0) -> {
        $$0.defaultReturnValue(0);
        $$0.put((Object)dec.c, 0x545454);
        $$0.put((Object)dec.d, 0x999999);
        $$0.put((Object)dec.e, 6250897);
        $$0.put((Object)dec.f, 8434258);
        $$0.put((Object)dec.g, 0xD1D1D1);
        $$0.put((Object)dec.h, 7497737);
        $$0.put((Object)dec.i, 3159410);
        $$0.put((Object)dec.j, 2213376);
        $$0.put((Object)dec.k, 0xCCCCCC);
        $$0.put((Object)dec.l, 16769184);
        $$0.put((Object)dec.m, 15884384);
        $$0.put((Object)dec.n, 0xFFFFFF);
    });

    public eub(ais $$0) {
        super(enf.a);
        this.b = $$0;
    }

    @Override
    public boolean av_() {
        return false;
    }

    @Override
    protected boolean aH_() {
        return false;
    }

    @Override
    public void ax_() {
        this.k = true;
        this.d(true);
    }

    @Override
    protected void b(esp $$0) {
        if (this.k) {
            $$0.a(eso.a, (sw)sw.c("narrator.loading.done"));
        } else {
            String $$1 = this.l();
            $$0.a(eso.a, $$1);
        }
    }

    private String l() {
        return apa.a(this.b.e(), 0, 100) + "%";
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        long $$4 = ac.b();
        if ($$4 - this.c > 2000L) {
            this.c = $$4;
            this.d(true);
        }
        int $$5 = this.g / 2;
        int $$6 = this.h / 2;
        int $$7 = 30;
        eub.a($$0, this.b, $$5, $$6 + 30, 2, 0);
        $$0.a(this.i, this.l(), $$5, $$6 - this.i.b / 2 - 30, 0xFFFFFF);
    }

    public static void a(eox $$0, ais $$1, int $$2, int $$3, int $$4, int $$5) {
        int $$6 = $$4 + $$5;
        int $$7 = $$1.c();
        int $$8 = $$7 * $$6 - $$5;
        int $$9 = $$1.d();
        int $$10 = $$9 * $$6 - $$5;
        int $$11 = $$2 - $$10 / 2;
        int $$12 = $$3 - $$10 / 2;
        int $$13 = $$8 / 2 + 1;
        int $$14 = -16772609;
        $$0.a(() -> {
            if ($$5 != 0) {
                $$0.a($$2 - $$13, $$3 - $$13, $$2 - $$13 + 1, $$3 + $$13, -16772609);
                $$0.a($$2 + $$13 - 1, $$3 - $$13, $$2 + $$13, $$3 + $$13, -16772609);
                $$0.a($$2 - $$13, $$3 - $$13, $$2 + $$13, $$3 - $$13 + 1, -16772609);
                $$0.a($$2 - $$13, $$3 + $$13 - 1, $$2 + $$13, $$3 + $$13, -16772609);
            }
            for (int $$11 = 0; $$11 < $$9; ++$$11) {
                for (int $$12 = 0; $$12 < $$9; ++$$12) {
                    dec $$13 = $$1.a($$11, $$12);
                    int $$14 = $$11 + $$11 * $$6;
                    int $$15 = $$12 + $$12 * $$6;
                    $$0.a($$14, $$15, $$14 + $$4, $$15 + $$4, l.getInt((Object)$$13) | 0xFF000000);
                }
            }
        });
    }
}

