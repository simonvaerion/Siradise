/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2BooleanMap
 *  it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2BooleanMap;
import it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsb {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = -1;
    private final dex c;
    private final hs d;
    private final hr<cnk> e;
    private final hr<dsa> f;
    private final dvu g;
    private final acp<cmm> h;
    private final ddy i;
    private final dhy j;
    private final cmo k;
    private final cno l;
    private final long m;
    private final DataFixer n;
    private final Long2ObjectMap<Object2IntMap<dsa>> o = new Long2ObjectOpenHashMap();
    private final Map<dsa, Long2BooleanMap> p = new HashMap<dsa, Long2BooleanMap>();

    public dsb(dex $$0, hs $$1, dvu $$2, acp<cmm> $$3, ddy $$4, dhy $$5, cmo $$6, cno $$7, long $$8, DataFixer $$9) {
        this.c = $$0;
        this.d = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$5;
        this.k = $$6;
        this.l = $$7;
        this.m = $$8;
        this.n = $$9;
        this.e = $$1.d(jc.ap);
        this.f = $$1.d(jc.az);
    }

    public dsc a(clt $$02, dsa $$1, boolean $$22) {
        long $$3 = $$02.a();
        Object2IntMap $$4 = (Object2IntMap)this.o.get($$3);
        if ($$4 != null) {
            return this.a((Object2IntMap<dsa>)$$4, $$1, $$22);
        }
        dsc $$5 = this.a($$02, $$1, $$22, $$3);
        if ($$5 != null) {
            return $$5;
        }
        boolean $$6 = this.p.computeIfAbsent($$1, $$0 -> new Long2BooleanOpenHashMap()).computeIfAbsent($$3, $$2 -> this.b($$02, $$1));
        if (!$$6) {
            return dsc.b;
        }
        return dsc.c;
    }

    private boolean b(clt $$0, dsa $$1) {
        return $$1.b(new dsa.a(this.d, this.i, this.l, this.j, this.g, this.m, $$0, this.k, $$1.a()::a)).isPresent();
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    private dsc a(clt $$0, dsa $$1, boolean $$2, long $$3) {
        void $$11;
        rr $$4 = new rr(new rt(qw.a, "DataVersion"), new rt("Level", "Structures", qr.b, "Starts"), new rt("structures", qr.b, "starts"));
        try {
            this.c.a($$0, $$4).join();
        }
        catch (Exception $$5) {
            a.warn("Failed to read chunk {}", (Object)$$0, (Object)$$5);
            return dsc.c;
        }
        rk $$6 = $$4.d();
        if (!($$6 instanceof qr)) {
            return null;
        }
        qr $$7 = (qr)$$6;
        int $$8 = dez.a($$7);
        if ($$8 <= 1493) {
            return dsc.c;
        }
        dez.a($$7, this.h, this.i.b());
        try {
            qr $$9 = aqc.c.a(this.n, $$7, $$8);
        }
        catch (Exception $$10) {
            a.warn("Failed to partially datafix chunk {}", (Object)$$0, (Object)$$10);
            return dsc.c;
        }
        Object2IntMap<dsa> $$12 = this.a((qr)$$11);
        if ($$12 == null) {
            return null;
        }
        this.a($$3, $$12);
        return this.a($$12, $$1, $$2);
    }

    @Nullable
    private Object2IntMap<dsa> a(qr $$0) {
        if (!$$0.b("structures", 10)) {
            return null;
        }
        qr $$1 = $$0.p("structures");
        if (!$$1.b("starts", 10)) {
            return null;
        }
        qr $$2 = $$1.p("starts");
        if ($$2.g()) {
            return Object2IntMaps.emptyMap();
        }
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        hr<dsa> $$4 = this.d.d(jc.az);
        for (String $$5 : $$2.e()) {
            String $$9;
            qr $$8;
            dsa $$7;
            acq $$6 = acq.a($$5);
            if ($$6 == null || ($$7 = $$4.a($$6)) == null || ($$8 = $$2.p($$5)).g() || "INVALID".equals($$9 = $$8.l("id"))) continue;
            int $$10 = $$8.h("references");
            $$3.put((Object)$$7, $$10);
        }
        return $$3;
    }

    private static Object2IntMap<dsa> a(Object2IntMap<dsa> $$0) {
        return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
    }

    private dsc a(Object2IntMap<dsa> $$0, dsa $$1, boolean $$2) {
        int $$3 = $$0.getOrDefault((Object)$$1, -1);
        return $$3 != -1 && (!$$2 || $$3 == 0) ? dsc.a : dsc.b;
    }

    public void a(clt $$0, Map<dsa, dsi> $$1) {
        long $$2 = $$0.a();
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        $$1.forEach((arg_0, arg_1) -> dsb.a((Object2IntMap)$$3, arg_0, arg_1));
        this.a($$2, (Object2IntMap<dsa>)$$3);
    }

    private void a(long $$0, Object2IntMap<dsa> $$12) {
        this.o.put($$0, dsb.a($$12));
        this.p.values().forEach($$1 -> $$1.remove($$0));
    }

    public void a(clt $$0, dsa $$1) {
        this.o.compute($$0.a(), ($$12, $$2) -> {
            if ($$2 == null || $$2.isEmpty()) {
                $$2 = new Object2IntOpenHashMap();
            }
            $$2.computeInt((Object)$$1, ($$0, $$1) -> $$1 == null ? 1 : $$1 + 1);
            return $$2;
        });
    }

    private static /* synthetic */ void a(Object2IntMap $$0, dsa $$1, dsi $$2) {
        if ($$2.b()) {
            $$0.put((Object)$$1, $$2.f());
        }
    }
}

