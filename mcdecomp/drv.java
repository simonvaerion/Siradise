/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class drv {
    private static final Map<String, String> a = ac.a(Maps.newHashMap(), (T $$0) -> {
        $$0.put("Village", "Village");
        $$0.put("Mineshaft", "Mineshaft");
        $$0.put("Mansion", "Mansion");
        $$0.put("Igloo", "Temple");
        $$0.put("Desert_Pyramid", "Temple");
        $$0.put("Jungle_Pyramid", "Temple");
        $$0.put("Swamp_Hut", "Temple");
        $$0.put("Stronghold", "Stronghold");
        $$0.put("Monument", "Monument");
        $$0.put("Fortress", "Fortress");
        $$0.put("EndCity", "EndCity");
    });
    private static final Map<String, String> b = ac.a(Maps.newHashMap(), (T $$0) -> {
        $$0.put("Iglu", "Igloo");
        $$0.put("TeDP", "Desert_Pyramid");
        $$0.put("TeJP", "Jungle_Pyramid");
        $$0.put("TeSH", "Swamp_Hut");
    });
    private static final Set<String> c = Set.of("pillager_outpost", "mineshaft", "mansion", "jungle_pyramid", "desert_pyramid", "igloo", "ruined_portal", "shipwreck", "swamp_hut", "stronghold", "monument", "ocean_ruin", "fortress", "endcity", "buried_treasure", "village", "nether_fossil", "bastion_remnant");
    private final boolean d;
    private final Map<String, Long2ObjectMap<qr>> e = Maps.newHashMap();
    private final Map<String, dsd> f = Maps.newHashMap();
    private final List<String> g;
    private final List<String> h;

    public drv(@Nullable dyu $$0, List<String> $$1, List<String> $$2) {
        this.g = $$1;
        this.h = $$2;
        this.a($$0);
        boolean $$3 = false;
        for (String $$4 : this.h) {
            $$3 |= this.e.get($$4) != null;
        }
        this.d = $$3;
    }

    public void a(long $$0) {
        for (String $$1 : this.g) {
            dsd $$2 = this.f.get($$1);
            if ($$2 == null || !$$2.c($$0)) continue;
            $$2.d($$0);
            $$2.b();
        }
    }

    public qr a(qr $$0) {
        qr $$1 = $$0.p("Level");
        clt $$2 = new clt($$1.h("xPos"), $$1.h("zPos"));
        if (this.a($$2.e, $$2.f)) {
            $$0 = this.a($$0, $$2);
        }
        qr $$3 = $$1.p("Structures");
        qr $$4 = $$3.p("References");
        for (String $$5 : this.h) {
            boolean $$6 = c.contains($$5.toLowerCase(Locale.ROOT));
            if ($$4.b($$5, 12) || !$$6) continue;
            int $$7 = 8;
            LongArrayList $$8 = new LongArrayList();
            for (int $$9 = $$2.e - 8; $$9 <= $$2.e + 8; ++$$9) {
                for (int $$10 = $$2.f - 8; $$10 <= $$2.f + 8; ++$$10) {
                    if (!this.a($$9, $$10, $$5)) continue;
                    $$8.add(clt.c($$9, $$10));
                }
            }
            $$4.c($$5, (List<Long>)$$8);
        }
        $$3.a("References", $$4);
        $$1.a("Structures", $$3);
        $$0.a("Level", $$1);
        return $$0;
    }

    private boolean a(int $$0, int $$1, String $$2) {
        if (!this.d) {
            return false;
        }
        return this.e.get($$2) != null && this.f.get(a.get($$2)).b(clt.c($$0, $$1));
    }

    private boolean a(int $$0, int $$1) {
        if (!this.d) {
            return false;
        }
        for (String $$2 : this.h) {
            if (this.e.get($$2) == null || !this.f.get(a.get($$2)).c(clt.c($$0, $$1))) continue;
            return true;
        }
        return false;
    }

    private qr a(qr $$0, clt $$1) {
        qr $$2 = $$0.p("Level");
        qr $$3 = $$2.p("Structures");
        qr $$4 = $$3.p("Starts");
        for (String $$5 : this.h) {
            qr $$8;
            Long2ObjectMap<qr> $$6 = this.e.get($$5);
            if ($$6 == null) continue;
            long $$7 = $$1.a();
            if (!this.f.get(a.get($$5)).c($$7) || ($$8 = (qr)$$6.get($$7)) == null) continue;
            $$4.a($$5, $$8);
        }
        $$3.a("Starts", $$4);
        $$2.a("Structures", $$3);
        $$0.a("Level", $$2);
        return $$0;
    }

    private void a(@Nullable dyu $$02) {
        if ($$02 == null) {
            return;
        }
        for (String $$1 : this.g) {
            qr $$2 = new qr();
            try {
                $$2 = $$02.a($$1, 1493).p("data").p("Features");
                if ($$2.g()) {
                    continue;
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            for (String $$3 : $$2.e()) {
                String $$7;
                String $$8;
                qr $$4 = $$2.p($$3);
                long $$5 = clt.c($$4.h("ChunkX"), $$4.h("ChunkZ"));
                qx $$6 = $$4.c("Children", 10);
                if (!$$6.isEmpty() && ($$8 = b.get($$7 = $$6.a(0).l("id"))) != null) {
                    $$4.a("id", $$8);
                }
                String $$9 = $$4.l("id");
                this.e.computeIfAbsent($$9, $$0 -> new Long2ObjectOpenHashMap()).put($$5, (Object)$$4);
            }
            String $$10 = $$1 + "_index";
            dsd $$11 = $$02.a(dsd::b, dsd::new, $$10);
            if ($$11.a().isEmpty()) {
                dsd $$12 = new dsd();
                this.f.put($$1, $$12);
                for (String $$13 : $$2.e()) {
                    qr $$14 = $$2.p($$13);
                    $$12.a(clt.c($$14.h("ChunkX"), $$14.h("ChunkZ")));
                }
                $$12.b();
                continue;
            }
            this.f.put($$1, $$11);
        }
    }

    public static drv a(acp<cmm> $$0, @Nullable dyu $$1) {
        if ($$0 == cmm.h) {
            return new drv($$1, (List<String>)ImmutableList.of((Object)"Monument", (Object)"Stronghold", (Object)"Village", (Object)"Mineshaft", (Object)"Temple", (Object)"Mansion"), (List<String>)ImmutableList.of((Object)"Village", (Object)"Mineshaft", (Object)"Mansion", (Object)"Igloo", (Object)"Desert_Pyramid", (Object)"Jungle_Pyramid", (Object)"Swamp_Hut", (Object)"Stronghold", (Object)"Monument"));
        }
        if ($$0 == cmm.i) {
            ImmutableList $$2 = ImmutableList.of((Object)"Fortress");
            return new drv($$1, (List<String>)$$2, (List<String>)$$2);
        }
        if ($$0 == cmm.j) {
            ImmutableList $$3 = ImmutableList.of((Object)"EndCity");
            return new drv($$1, (List<String>)$$3, (List<String>)$$3);
        }
        throw new RuntimeException(String.format(Locale.ROOT, "Unknown dimension type : %s", $$0));
    }
}

