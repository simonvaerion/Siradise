/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanMap
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.EnumMap;
import java.util.Map;

public abstract class dxc
extends dxd {
    public static final dcs a = dcr.i;
    public static final ddb b = dcr.aM;
    private static final int e = 200;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cpn.a>> f = ThreadLocal.withInitial(() -> {
        Object2ByteLinkedOpenHashMap<cpn.a> $$0 = new Object2ByteLinkedOpenHashMap<cpn.a>(200){

            protected void rehash(int $$0) {
            }
        };
        $$0.defaultReturnValue((byte)127);
        return $$0;
    });
    private final Map<dxe, efb> g = Maps.newIdentityHashMap();

    @Override
    protected void a(dcc.a<dxd, dxe> $$0) {
        $$0.a(new dde[]{a});
    }

    @Override
    public eei a(cls $$0, gu $$1, dxe $$2) {
        double $$3 = 0.0;
        double $$4 = 0.0;
        gu.a $$5 = new gu.a();
        for (ha $$6 : ha.c.a) {
            $$5.a((hz)$$1, $$6);
            dxe $$7 = $$0.b_($$5);
            if (!this.g($$7)) continue;
            float $$8 = $$7.d();
            float $$9 = 0.0f;
            if ($$8 == 0.0f) {
                gu $$10;
                dxe $$11;
                if (!$$0.a_($$5).d() && this.g($$11 = $$0.b_($$10 = $$5.d())) && ($$8 = $$11.d()) > 0.0f) {
                    $$9 = $$2.d() - ($$8 - 0.8888889f);
                }
            } else if ($$8 > 0.0f) {
                $$9 = $$2.d() - $$8;
            }
            if ($$9 == 0.0f) continue;
            $$3 += (double)((float)$$6.j() * $$9);
            $$4 += (double)((float)$$6.l() * $$9);
        }
        eei $$12 = new eei($$3, 0.0, $$4);
        if ($$2.c(a).booleanValue()) {
            for (ha $$13 : ha.c.a) {
                $$5.a((hz)$$1, $$13);
                if (!this.a($$0, (gu)$$5, $$13) && !this.a($$0, $$5.c(), $$13)) continue;
                $$12 = $$12.d().b(0.0, -6.0, 0.0);
                break;
            }
        }
        return $$12.d();
    }

    private boolean g(dxe $$0) {
        return $$0.c() || $$0.a().a(this);
    }

    protected boolean a(cls $$0, gu $$1, ha $$2) {
        dcb $$3 = $$0.a_($$1);
        dxe $$4 = $$0.b_($$1);
        if ($$4.a().a(this)) {
            return false;
        }
        if ($$2 == ha.b) {
            return true;
        }
        if ($$3.b() instanceof cti) {
            return false;
        }
        return $$3.d($$0, $$1, $$2);
    }

    protected void a(cmm $$0, gu $$1, dxe $$2) {
        if ($$2.c()) {
            return;
        }
        dcb $$3 = $$0.a_($$1);
        gu $$4 = $$1.d();
        dcb $$5 = $$0.a_($$4);
        dxe $$6 = this.a($$0, $$4, $$5);
        if (this.a((cls)$$0, $$1, $$3, ha.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a((cmn)$$0, $$4, $$5, ha.a, $$6);
            if (this.a($$0, $$1) >= 3) {
                this.a($$0, $$1, $$2, $$3);
            }
        } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
        }
    }

    private void a(cmm $$0, gu $$1, dxe $$2, dcb $$3) {
        int $$4 = $$2.e() - this.c($$0);
        if ($$2.c(a).booleanValue()) {
            $$4 = 7;
        }
        if ($$4 <= 0) {
            return;
        }
        Map<ha, dxe> $$5 = this.b($$0, $$1, $$3);
        for (Map.Entry<ha, dxe> $$6 : $$5.entrySet()) {
            dcb $$10;
            ha $$7 = $$6.getKey();
            dxe $$8 = $$6.getValue();
            gu $$9 = $$1.a($$7);
            if (!this.a((cls)$$0, $$1, $$3, $$7, $$9, $$10 = $$0.a_($$9), $$0.b_($$9), $$8.a())) continue;
            this.a((cmn)$$0, $$9, $$10, $$7, $$8);
        }
    }

    protected dxe a(cmm $$0, gu $$1, dcb $$2) {
        gu $$11;
        dcb $$12;
        dxe $$13;
        int $$3 = 0;
        int $$4 = 0;
        for (ha $$5 : ha.c.a) {
            gu $$6 = $$1.a($$5);
            dcb $$7 = $$0.a_($$6);
            dxe $$8 = $$7.u();
            if (!$$8.a().a(this) || !this.a($$5, $$0, $$1, $$2, $$6, $$7)) continue;
            if ($$8.b()) {
                ++$$4;
            }
            $$3 = Math.max($$3, $$8.e());
        }
        if (this.a($$0) && $$4 >= 2) {
            dcb $$9 = $$0.a_($$1.d());
            dxe $$10 = $$9.u();
            if ($$9.e() || this.h($$10)) {
                return this.a(false);
            }
        }
        if (!($$13 = ($$12 = $$0.a_($$11 = $$1.c())).u()).c() && $$13.a().a(this) && this.a(ha.b, $$0, $$1, $$2, $$11, $$12)) {
            return this.a(8, true);
        }
        int $$14 = $$3 - this.c($$0);
        if ($$14 <= 0) {
            return dxf.a.g();
        }
        return this.a($$14, false);
    }

    private boolean a(ha $$0, cls $$1, gu $$2, dcb $$3, gu $$4, dcb $$5) {
        efb $$12;
        efb $$11;
        boolean $$13;
        Object $$10;
        Object2ByteLinkedOpenHashMap<cpn.a> $$7;
        if ($$3.b().o() || $$5.b().o()) {
            Object $$6 = null;
        } else {
            $$7 = f.get();
        }
        if ($$7 != null) {
            cpn.a $$8 = new cpn.a($$3, $$5, $$0);
            byte $$9 = $$7.getAndMoveToFirst((Object)$$8);
            if ($$9 != 127) {
                return $$9 != 0;
            }
        } else {
            $$10 = null;
        }
        boolean bl2 = $$13 = !eey.b($$11 = $$3.k($$1, $$2), $$12 = $$5.k($$1, $$4), $$0);
        if ($$7 != null) {
            if ($$7.size() == 200) {
                $$7.removeLastByte();
            }
            $$7.putAndMoveToFirst($$10, (byte)($$13 ? 1 : 0));
        }
        return $$13;
    }

    public abstract dxd d();

    public dxe a(int $$0, boolean $$1) {
        return (dxe)((dxe)this.d().g().a(b, $$0)).a(a, $$1);
    }

    public abstract dxd e();

    public dxe a(boolean $$0) {
        return (dxe)this.e().g().a(a, $$0);
    }

    protected abstract boolean a(cmm var1);

    protected void a(cmn $$0, gu $$1, dcb $$2, ha $$3, dxe $$4) {
        if ($$2.b() instanceof cub) {
            ((cub)((Object)$$2.b())).a($$0, $$1, $$2, $$4);
        } else {
            if (!$$2.i()) {
                this.a($$0, $$1, $$2);
            }
            $$0.a($$1, $$4.g(), 3);
        }
    }

    protected abstract void a(cmn var1, gu var2, dcb var3);

    private static short a(gu $$0, gu $$1) {
        int $$2 = $$1.u() - $$0.u();
        int $$3 = $$1.w() - $$0.w();
        return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
    }

    protected int a(cmp $$0, gu $$1, int $$22, ha $$32, dcb $$4, gu $$5, Short2ObjectMap<Pair<dcb, dxe>> $$6, Short2BooleanMap $$7) {
        int $$8 = 1000;
        for (ha $$9 : ha.c.a) {
            int $$16;
            if ($$9 == $$32) continue;
            gu $$10 = $$1.a($$9);
            short $$11 = dxc.a($$5, $$10);
            Pair $$12 = (Pair)$$6.computeIfAbsent($$11, $$2 -> {
                dcb $$3 = $$0.a_($$10);
                return Pair.of((Object)$$3, (Object)$$3.u());
            });
            dcb $$13 = (dcb)$$12.getFirst();
            dxe $$14 = (dxe)$$12.getSecond();
            if (!this.a((cls)$$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) continue;
            boolean $$15 = $$7.computeIfAbsent($$11, $$3 -> {
                gu $$4 = $$10.d();
                dcb $$5 = $$0.a_($$4);
                return this.a($$0, this.d(), $$10, $$13, $$4, $$5);
            });
            if ($$15) {
                return $$22;
            }
            if ($$22 >= this.b($$0) || ($$16 = this.a($$0, $$10, $$22 + 1, $$9.g(), $$13, $$5, $$6, $$7)) >= $$8) continue;
            $$8 = $$16;
        }
        return $$8;
    }

    private boolean a(cls $$0, dxd $$1, gu $$2, dcb $$3, gu $$4, dcb $$5) {
        if (!this.a(ha.a, $$0, $$2, $$3, $$4, $$5)) {
            return false;
        }
        if ($$5.u().a().a(this)) {
            return true;
        }
        return this.a($$0, $$4, $$5, $$1);
    }

    private boolean a(cls $$0, dxd $$1, gu $$2, dcb $$3, ha $$4, gu $$5, dcb $$6, dxe $$7) {
        return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
    }

    private boolean h(dxe $$0) {
        return $$0.a().a(this) && $$0.b();
    }

    protected abstract int b(cmp var1);

    private int a(cmp $$0, gu $$1) {
        int $$2 = 0;
        for (ha $$3 : ha.c.a) {
            gu $$4 = $$1.a($$3);
            dxe $$5 = $$0.b_($$4);
            if (!this.h($$5)) continue;
            ++$$2;
        }
        return $$2;
    }

    protected Map<ha, dxe> b(cmm $$0, gu $$1, dcb $$22) {
        int $$3 = 1000;
        EnumMap $$42 = Maps.newEnumMap(ha.class);
        Short2ObjectOpenHashMap $$5 = new Short2ObjectOpenHashMap();
        Short2BooleanOpenHashMap $$6 = new Short2BooleanOpenHashMap();
        for (ha $$7 : ha.c.a) {
            int $$17;
            gu $$8 = $$1.a($$7);
            short $$9 = dxc.a($$1, $$8);
            Pair $$10 = (Pair)$$5.computeIfAbsent($$9, $$2 -> {
                dcb $$3 = $$0.a_($$8);
                return Pair.of((Object)$$3, (Object)$$3.u());
            });
            dcb $$11 = (dcb)$$10.getFirst();
            dxe $$12 = (dxe)$$10.getSecond();
            dxe $$13 = this.a($$0, $$8, $$11);
            if (!this.a((cls)$$0, $$13.a(), $$1, $$22, $$7, $$8, $$11, $$12)) continue;
            gu $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4 -> {
                dcb $$5 = $$0.a_($$14);
                return this.a($$0, this.d(), $$8, $$11, $$14, $$5);
            });
            if ($$15) {
                boolean $$16 = false;
            } else {
                $$17 = this.a($$0, $$8, 1, $$7.g(), $$11, $$1, (Short2ObjectMap<Pair<dcb, dxe>>)$$5, (Short2BooleanMap)$$6);
            }
            if ($$17 < $$3) {
                $$42.clear();
            }
            if ($$17 > $$3) continue;
            $$42.put($$7, $$13);
            $$3 = $$17;
        }
        return $$42;
    }

    private boolean a(cls $$0, gu $$1, dcb $$2, dxd $$3) {
        cpn $$4 = $$2.b();
        if ($$4 instanceof cub) {
            return ((cub)((Object)$$4)).a($$0, $$1, $$2, $$3);
        }
        if ($$4 instanceof crp || $$2.a(amw.av) || $$2.a(cpo.cO) || $$2.a(cpo.dS) || $$2.a(cpo.nd)) {
            return false;
        }
        if ($$2.a(cpo.ee) || $$2.a(cpo.fx) || $$2.a(cpo.kF) || $$2.a(cpo.kN)) {
            return false;
        }
        return !$$2.d();
    }

    protected boolean a(cls $$0, gu $$1, dcb $$2, ha $$3, gu $$4, dcb $$5, dxe $$6, dxd $$7) {
        return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
    }

    protected abstract int c(cmp var1);

    protected int a(cmm $$0, gu $$1, dxe $$2, dxe $$3) {
        return this.a((cmp)$$0);
    }

    @Override
    public void b(cmm $$0, gu $$1, dxe $$2) {
        if (!$$2.b()) {
            dxe $$3 = this.a($$0, $$1, $$0.a_($$1));
            int $$4 = this.a($$0, $$1, $$2, $$3);
            if ($$3.c()) {
                $$2 = $$3;
                $$0.a($$1, cpo.a.n(), 3);
            } else if (!$$3.equals($$2)) {
                $$2 = $$3;
                dcb $$5 = $$2.g();
                $$0.a($$1, $$5, 2);
                $$0.a($$1, $$2.a(), $$4);
                $$0.a($$1, $$5.b());
            }
        }
        this.a($$0, $$1, $$2);
    }

    protected static int e(dxe $$0) {
        if ($$0.b()) {
            return 0;
        }
        return 8 - Math.min($$0.e(), 8) + ($$0.c(a) != false ? 8 : 0);
    }

    private static boolean c(dxe $$0, cls $$1, gu $$2) {
        return $$0.a().a($$1.b_($$2.c()).a());
    }

    @Override
    public float a(dxe $$0, cls $$1, gu $$2) {
        if (dxc.c($$0, $$1, $$2)) {
            return 1.0f;
        }
        return $$0.d();
    }

    @Override
    public float a(dxe $$0) {
        return (float)$$0.e() / 9.0f;
    }

    @Override
    public abstract int d(dxe var1);

    @Override
    public efb b(dxe $$0, cls $$1, gu $$22) {
        if ($$0.e() == 9 && dxc.c($$0, $$1, $$22)) {
            return eey.b();
        }
        return this.g.computeIfAbsent($$0, $$2 -> eey.a(0.0, 0.0, 0.0, 1.0, $$2.a($$1, $$22), 1.0));
    }
}

