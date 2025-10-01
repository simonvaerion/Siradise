/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumMap;
import javax.annotation.Nullable;

public class dxw
extends dxs {
    private final boolean k;
    private final Long2ObjectMap<dxp> l = new Long2ObjectOpenHashMap();

    public dxw(boolean $$0) {
        this.k = $$0;
    }

    @Override
    public void a(cmz $$0, bgb $$1) {
        super.a($$0, $$1);
        this.l.clear();
    }

    @Override
    public void b() {
        super.b();
        this.l.clear();
    }

    @Override
    public dxr a() {
        return this.b(apa.a(this.b.cE().a), apa.a(this.b.cE().b + 0.5), apa.a(this.b.cE().c));
    }

    @Override
    public dxx a(double $$0, double $$1, double $$2) {
        return this.a(this.b(apa.a($$0), apa.a($$1), apa.a($$2)));
    }

    @Override
    public int a(dxr[] $$0, dxr $$1) {
        int $$2 = 0;
        EnumMap $$3 = Maps.newEnumMap(ha.class);
        for (ha $$4 : ha.values()) {
            dxr $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
            $$3.put($$4, $$5);
            if (!this.b($$5)) continue;
            $$0[$$2++] = $$5;
        }
        for (ha $$6 : ha.c.a) {
            ha $$7 = $$6.h();
            dxr $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (!this.a($$8, (dxr)$$3.get($$6), (dxr)$$3.get($$7))) continue;
            $$0[$$2++] = $$8;
        }
        return $$2;
    }

    protected boolean b(@Nullable dxr $$0) {
        return $$0 != null && !$$0.i;
    }

    protected boolean a(@Nullable dxr $$0, @Nullable dxr $$1, @Nullable dxr $$2) {
        return this.b($$0) && $$1 != null && $$1.k >= 0.0f && $$2 != null && $$2.k >= 0.0f;
    }

    @Nullable
    protected dxr a(int $$0, int $$1, int $$2) {
        float $$5;
        dxr $$3 = null;
        dxp $$4 = this.c($$0, $$1, $$2);
        if ((this.k && $$4 == dxp.u || $$4 == dxp.j) && ($$5 = this.b.a($$4)) >= 0.0f) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new gu($$0, $$1, $$2)).c()) {
                $$3.k += 8.0f;
            }
        }
        return $$3;
    }

    protected dxp c(int $$0, int $$1, int $$2) {
        return (dxp)((Object)this.l.computeIfAbsent(gu.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2)));
    }

    @Override
    public dxp a(cls $$0, int $$1, int $$2, int $$3) {
        return this.a($$0, $$1, $$2, $$3, this.b);
    }

    @Override
    public dxp a(cls $$0, int $$1, int $$2, int $$3, bgb $$4) {
        gu.a $$5 = new gu.a();
        for (int $$6 = $$1; $$6 < $$1 + this.d; ++$$6) {
            for (int $$7 = $$2; $$7 < $$2 + this.e; ++$$7) {
                for (int $$8 = $$3; $$8 < $$3 + this.f; ++$$8) {
                    dxe $$9 = $$0.b_($$5.d($$6, $$7, $$8));
                    dcb $$10 = $$0.a_($$5.d($$6, $$7, $$8));
                    if ($$9.c() && $$10.a($$0, $$5.d(), dxu.b) && $$10.i()) {
                        return dxp.u;
                    }
                    if ($$9.a(anb.a)) continue;
                    return dxp.a;
                }
            }
        }
        dcb $$11 = $$0.a_($$5);
        if ($$11.a($$0, (gu)$$5, dxu.b)) {
            return dxp.j;
        }
        return dxp.a;
    }
}

