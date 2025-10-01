/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dey {
    private static final Codec<deq<dcb>> h = deq.a(cpn.o, dcb.b, deq.d.d, cpo.a.n());
    private static final Logger i = LogUtils.getLogger();
    private static final String j = "UpgradeData";
    private static final String k = "block_ticks";
    private static final String l = "fluid_ticks";
    public static final String a = "xPos";
    public static final String b = "zPos";
    public static final String c = "Heightmaps";
    public static final String d = "isLightOn";
    public static final String e = "sections";
    public static final String f = "BlockLight";
    public static final String g = "SkyLight";

    public static des a(aif $$02, bqz $$1, clt $$22, qr $$3) {
        des $$38;
        din $$31;
        clt $$4 = new clt($$3.h(a), $$3.h(b));
        if (!Objects.equals($$22, $$4)) {
            i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$22, $$22, $$4});
        }
        dev $$5 = $$3.b(j, 10) ? new dev($$3.p(j), $$02) : dev.a;
        boolean $$6 = $$3.q(d);
        qx $$7 = $$3.c(e, 10);
        int $$8 = $$02.ak();
        dej[] $$9 = new dej[$$8];
        boolean $$10 = $$02.x_().g();
        aid $$11 = $$02.k();
        dwt $$12 = ((deb)$$11).p();
        hr<cnk> $$13 = $$02.B_().d(jc.ap);
        Codec<der<he<cnk>>> $$14 = dey.a($$13);
        boolean $$15 = false;
        for (int $$16 = 0; $$16 < $$7.size(); ++$$16) {
            boolean $$27;
            qr $$17 = $$7.a($$16);
            byte $$18 = $$17.f("Y");
            int $$19 = $$02.f($$18);
            if ($$19 >= 0 && $$19 < $$9.length) {
                dej $$24;
                deq<he<cnk>> $$23;
                deq<dcb> $$21;
                if ($$17.b("block_states", 10)) {
                    deq $$20 = (deq)h.parse((DynamicOps)rc.a, (Object)$$17.p("block_states")).promotePartial($$2 -> dey.a($$22, $$18, $$2)).getOrThrow(false, arg_0 -> ((Logger)i).error(arg_0));
                } else {
                    $$21 = new deq<dcb>(cpn.o, cpo.a.n(), deq.d.d);
                }
                if ($$17.b("biomes", 10)) {
                    der $$222 = (der)$$14.parse((DynamicOps)rc.a, (Object)$$17.p("biomes")).promotePartial($$2 -> dey.a($$22, $$18, $$2)).getOrThrow(false, arg_0 -> ((Logger)i).error(arg_0));
                } else {
                    $$23 = new deq<he<cnk>>($$13.t(), $$13.f(cnr.b), deq.d.e);
                }
                $$9[$$19] = $$24 = new dej($$21, $$23);
                hx $$25 = hx.a($$22, (int)$$18);
                $$1.a($$25, $$24);
            }
            boolean $$26 = $$17.b(f, 7);
            boolean bl2 = $$27 = $$10 && $$17.b(g, 7);
            if (!$$26 && !$$27) continue;
            if (!$$15) {
                $$12.b($$22, true);
                $$15 = true;
            }
            if ($$26) {
                $$12.a(cmv.b, hx.a($$22, (int)$$18), new ded($$17.m(f)));
            }
            if (!$$27) continue;
            $$12.a(cmv.a, hx.a($$22, (int)$$18), new ded($$17.m(g)));
        }
        long $$28 = $$3.i("InhabitedTime");
        dec.a $$29 = dey.a($$3);
        if ($$3.b("blending_data", 10)) {
            din $$30 = din.e.parse(new Dynamic((DynamicOps)rc.a, (Object)$$3.p("blending_data"))).resultOrPartial(arg_0 -> ((Logger)i).error(arg_0)).orElse(null);
        } else {
            $$31 = null;
        }
        if ($$29 == dec.a.b) {
            efo<cpn> $$32 = efo.a($$3.c(k, 10), (String $$0) -> jb.f.b(acq.a($$0)), $$22);
            efo<dxd> $$33 = efo.a($$3.c(l, 10), (String $$0) -> jb.d.b(acq.a($$0)), $$22);
            dei $$34 = new dei($$02.C(), $$22, $$5, $$32, $$33, $$28, $$9, dey.a($$02, $$3), $$31);
        } else {
            efr<cpn> $$35 = efr.a($$3.c(k, 10), (String $$0) -> jb.f.b(acq.a($$0)), $$22);
            efr<dxd> $$36 = efr.a($$3.c(l, 10), (String $$0) -> jb.d.b(acq.a($$0)), $$22);
            des $$37 = new des($$22, $$5, $$9, $$35, $$36, $$02, $$13, $$31);
            $$38 = $$37;
            $$38.b($$28);
            if ($$3.b("below_zero_retrogen", 10)) {
                dgy.a.parse(new Dynamic((DynamicOps)rc.a, (Object)$$3.p("below_zero_retrogen"))).resultOrPartial(arg_0 -> ((Logger)i).error(arg_0)).ifPresent($$37::a);
            }
            dec $$39 = dec.a($$3.l("Status"));
            $$37.a($$39);
            if ($$39.b(dec.k)) {
                $$37.a($$12);
            }
        }
        $$38.b($$6);
        qr $$40 = $$3.p(c);
        EnumSet<dhk.a> $$41 = EnumSet.noneOf(dhk.a.class);
        for (dhk.a $$42 : ((ddx)$$38).j().h()) {
            String $$43 = $$42.a();
            if ($$40.b($$43, 12)) {
                $$38.a($$42, $$40.o($$43));
                continue;
            }
            $$41.add($$42);
        }
        dhk.a($$38, $$41);
        qr $$44 = $$3.p("structures");
        $$38.a(dey.a(dsq.a($$02), $$44, $$02.A()));
        $$38.b(dey.a($$02.B_(), $$22, $$44));
        if ($$3.q("shouldSave")) {
            $$38.a(true);
        }
        qx $$45 = $$3.c("PostProcessing", 9);
        for (int $$46 = 0; $$46 < $$45.size(); ++$$46) {
            qx $$47 = $$45.b($$46);
            for (int $$48 = 0; $$48 < $$47.size(); ++$$48) {
                ((ddx)$$38).a($$47.d($$48), $$46);
            }
        }
        if ($$29 == dec.a.b) {
            return new deh((dei)((Object)$$38), false);
        }
        des $$49 = $$38;
        qx $$50 = $$3.c("entities", 10);
        for (int $$51 = 0; $$51 < $$50.size(); ++$$51) {
            $$49.b($$50.a($$51));
        }
        qx $$52 = $$3.c("block_entities", 10);
        for (int $$53 = 0; $$53 < $$52.size(); ++$$53) {
            qr $$54 = $$52.a($$53);
            $$38.a($$54);
        }
        qr $$55 = $$3.p("CarvingMasks");
        for (String $$56 : $$55.e()) {
            dhg.a $$57 = dhg.a.valueOf($$56);
            $$49.a($$57, new ddw($$55.o($$56), $$38.C_()));
        }
        return $$49;
    }

    private static void a(clt $$0, int $$1, String $$2) {
        i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
    }

    private static Codec<der<he<cnk>>> a(hr<cnk> $$0) {
        return deq.b($$0.t(), $$0.r(), deq.d.e, $$0.f(cnr.b));
    }

    public static qr a(aif $$0, ddx $$12) {
        dev $$6;
        dgy $$5;
        clt $$2 = $$12.f();
        qr $$3 = rd.g(new qr());
        $$3.a(a, $$2.e);
        $$3.a("yPos", $$12.al());
        $$3.a(b, $$2.f);
        $$3.a("LastUpdate", $$0.V());
        $$3.a("InhabitedTime", $$12.u());
        $$3.a("Status", jb.o.b($$12.j()).toString());
        din $$4 = $$12.t();
        if ($$4 != null) {
            din.e.encodeStart((DynamicOps)rc.a, (Object)$$4).resultOrPartial(arg_0 -> ((Logger)i).error(arg_0)).ifPresent($$1 -> $$3.a("blending_data", (rk)$$1));
        }
        if (($$5 = $$12.x()) != null) {
            dgy.a.encodeStart((DynamicOps)rc.a, (Object)$$5).resultOrPartial(arg_0 -> ((Logger)i).error(arg_0)).ifPresent($$1 -> $$3.a("below_zero_retrogen", (rk)$$1));
        }
        if (!($$6 = $$12.r()).a()) {
            $$3.a(j, $$6.b());
        }
        dej[] $$7 = $$12.d();
        qx $$8 = new qx();
        aii $$9 = $$0.k().a();
        hr<cnk> $$10 = $$0.B_().d(jc.ap);
        Codec<der<he<cnk>>> $$11 = dey.a($$10);
        boolean $$122 = $$12.v();
        for (int $$13 = $$9.d(); $$13 < $$9.e(); ++$$13) {
            int $$14 = $$12.f($$13);
            boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
            ded $$16 = $$9.a(cmv.b).a(hx.a($$2, $$13));
            ded $$17 = $$9.a(cmv.a).a(hx.a($$2, $$13));
            if (!$$15 && $$16 == null && $$17 == null) continue;
            qr $$18 = new qr();
            if ($$15) {
                dej $$19 = $$7[$$14];
                $$18.a("block_states", (rk)h.encodeStart((DynamicOps)rc.a, $$19.h()).getOrThrow(false, arg_0 -> ((Logger)i).error(arg_0)));
                $$18.a("biomes", (rk)$$11.encodeStart((DynamicOps)rc.a, $$19.i()).getOrThrow(false, arg_0 -> ((Logger)i).error(arg_0)));
            }
            if ($$16 != null && !$$16.d()) {
                $$18.a(f, $$16.a());
            }
            if ($$17 != null && !$$17.d()) {
                $$18.a(g, $$17.a());
            }
            if ($$18.g()) continue;
            $$18.a("Y", (byte)$$13);
            $$8.add($$18);
        }
        $$3.a(e, $$8);
        if ($$122) {
            $$3.a(d, true);
        }
        qx $$20 = new qx();
        for (gu $$21 : $$12.c()) {
            qr $$22 = $$12.g($$21);
            if ($$22 == null) continue;
            $$20.add($$22);
        }
        $$3.a("block_entities", $$20);
        if ($$12.j().g() == dec.a.a) {
            des $$23 = (des)$$12;
            qx $$24 = new qx();
            $$24.addAll($$23.E());
            $$3.a("entities", $$24);
            qr $$25 = new qr();
            for (dhg.a $$26 : dhg.a.values()) {
                ddw $$27 = $$23.a($$26);
                if ($$27 == null) continue;
                $$25.a($$26.toString(), $$27.a());
            }
            $$3.a("CarvingMasks", $$25);
        }
        dey.a($$0, $$3, $$12.q());
        $$3.a("PostProcessing", dey.a($$12.n()));
        qr $$28 = new qr();
        for (Map.Entry<dhk.a, dhk> $$29 : $$12.e()) {
            if (!$$12.j().h().contains($$29.getKey())) continue;
            $$28.a($$29.getKey().a(), new qy($$29.getValue().a()));
        }
        $$3.a(c, $$28);
        $$3.a("structures", dey.a(dsq.a($$0), $$2, $$12.g(), $$12.h()));
        return $$3;
    }

    private static void a(aif $$02, qr $$1, ddx.a $$2) {
        long $$3 = $$02.u_().e();
        $$1.a(k, $$2.a().b($$3, $$0 -> jb.f.b((cpn)$$0).toString()));
        $$1.a(l, $$2.b().b($$3, $$0 -> jb.d.b((dxd)$$0).toString()));
    }

    public static dec.a a(@Nullable qr $$0) {
        if ($$0 != null) {
            return dec.a($$0.l("Status")).g();
        }
        return dec.a.a;
    }

    @Nullable
    private static dei.c a(aif $$0, qr $$1) {
        qx $$2 = dey.a($$1, "entities");
        qx $$32 = dey.a($$1, "block_entities");
        if ($$2 == null && $$32 == null) {
            return null;
        }
        return $$3 -> {
            if ($$2 != null) {
                $$0.a(bfn.a($$2, (cmm)$$0));
            }
            if ($$32 != null) {
                for (int $$4 = 0; $$4 < $$32.size(); ++$$4) {
                    qr $$5 = $$32.a($$4);
                    boolean $$6 = $$5.q("keepPacked");
                    if ($$6) {
                        $$3.a($$5);
                        continue;
                    }
                    gu $$7 = czn.c($$5);
                    czn $$8 = czn.a($$7, $$3.a_($$7), $$5);
                    if ($$8 == null) continue;
                    $$3.a($$8);
                }
            }
        };
    }

    @Nullable
    private static qx a(qr $$0, String $$1) {
        qx $$2 = $$0.c($$1, 10);
        return $$2.isEmpty() ? null : $$2;
    }

    private static qr a(dsq $$0, clt $$1, Map<dsa, dsi> $$2, Map<dsa, LongSet> $$3) {
        qr $$4 = new qr();
        qr $$5 = new qr();
        hr<dsa> $$6 = $$0.b().d(jc.az);
        for (Map.Entry<dsa, dsi> $$7 : $$2.entrySet()) {
            acq $$8 = $$6.b($$7.getKey());
            $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
        }
        $$4.a("starts", $$5);
        qr $$9 = new qr();
        for (Map.Entry<dsa, LongSet> $$10 : $$3.entrySet()) {
            if ($$10.getValue().isEmpty()) continue;
            acq $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new qy($$10.getValue()));
        }
        $$4.a("References", $$9);
        return $$4;
    }

    private static Map<dsa, dsi> a(dsq $$0, qr $$1, long $$2) {
        HashMap $$3 = Maps.newHashMap();
        hr<dsa> $$4 = $$0.b().d(jc.az);
        qr $$5 = $$1.p("starts");
        for (String $$6 : $$5.e()) {
            acq $$7 = acq.a($$6);
            dsa $$8 = $$4.a($$7);
            if ($$8 == null) {
                i.error("Unknown structure start: {}", (Object)$$7);
                continue;
            }
            dsi $$9 = dsi.a($$0, $$5.p($$6), $$2);
            if ($$9 == null) continue;
            $$3.put($$8, $$9);
        }
        return $$3;
    }

    private static Map<dsa, LongSet> a(hs $$0, clt $$1, qr $$22) {
        HashMap $$3 = Maps.newHashMap();
        hr<dsa> $$4 = $$0.d(jc.az);
        qr $$5 = $$22.p("References");
        for (String $$6 : $$5.e()) {
            acq $$7 = acq.a($$6);
            dsa $$8 = $$4.a($$7);
            if ($$8 == null) {
                i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", (Object)$$7, (Object)$$1);
                continue;
            }
            long[] $$9 = $$5.o($$6);
            if ($$9.length == 0) continue;
            $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2 -> {
                clt $$3 = new clt($$2);
                if ($$3.a($$1) > 8) {
                    i.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3, $$1});
                    return false;
                }
                return true;
            }).toArray()));
        }
        return $$3;
    }

    public static qx a(ShortList[] $$0) {
        qx $$1 = new qx();
        for (ShortList $$2 : $$0) {
            qx $$3 = new qx();
            if ($$2 != null) {
                for (Short $$4 : $$2) {
                    $$3.add(rf.a($$4));
                }
            }
            $$1.add($$3);
        }
        return $$1;
    }
}

