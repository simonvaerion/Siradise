/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2FloatMap
 *  it.unimi.dsi.fastutil.objects.Object2FloatMaps
 *  it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class bdl {
    private static final Logger a = LogUtils.getLogger();
    private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
    private final hr<dfl> c;
    private final Set<acp<cmm>> d;
    private final boolean e;
    private final dyy.c f;
    private final Thread g;
    private final DataFixer h;
    private volatile boolean i = true;
    private volatile boolean j;
    private volatile float k;
    private volatile int l;
    private volatile int m;
    private volatile int n;
    private final Object2FloatMap<acp<cmm>> o = Object2FloatMaps.synchronize((Object2FloatMap)new Object2FloatOpenCustomHashMap(ac.k()));
    private volatile sw p = sw.c("optimizeWorld.stage.counting");
    private static final Pattern q = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
    private final dyu r;

    public bdl(dyy.c $$02, DataFixer $$12, hr<dfl> $$2, boolean $$3) {
        this.c = $$2;
        this.d = $$2.f().stream().map(jc::a).collect(Collectors.toUnmodifiableSet());
        this.e = $$3;
        this.h = $$12;
        this.f = $$02;
        this.r = new dyu(this.f.a(cmm.h).resolve("data").toFile(), $$12);
        this.g = b.newThread(this::i);
        this.g.setUncaughtExceptionHandler(($$0, $$1) -> {
            a.error("Error upgrading world", $$1);
            this.p = sw.c("optimizeWorld.stage.failed");
            this.j = true;
        });
        this.g.start();
    }

    public void a() {
        this.i = false;
        try {
            this.g.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    private void i() {
        this.l = 0;
        ImmutableMap.Builder $$0 = ImmutableMap.builder();
        for (acp<cmm> $$1 : this.d) {
            List<clt> $$2 = this.b($$1);
            $$0.put($$1, $$2.listIterator());
            this.l += $$2.size();
        }
        if (this.l == 0) {
            this.j = true;
            return;
        }
        float $$3 = this.l;
        ImmutableMap $$4 = $$0.build();
        ImmutableMap.Builder $$5 = ImmutableMap.builder();
        for (acp<cmm> $$6 : this.d) {
            Path $$7 = this.f.a($$6);
            $$5.put($$6, (Object)new dez($$7.resolve("region"), this.h, true));
        }
        ImmutableMap $$8 = $$5.build();
        long $$9 = ac.b();
        this.p = sw.c("optimizeWorld.stage.upgrading");
        while (this.i) {
            boolean $$10 = false;
            float $$11 = 0.0f;
            for (acp<cmm> $$12 : this.d) {
                ListIterator $$13 = (ListIterator)$$4.get($$12);
                dez $$14 = (dez)$$8.get($$12);
                if ($$13.hasNext()) {
                    clt $$15 = (clt)$$13.next();
                    boolean $$16 = false;
                    try {
                        qr $$17 = $$14.e($$15).join().orElse(null);
                        if ($$17 != null) {
                            boolean $$22;
                            int $$18 = dez.a($$17);
                            ddy $$19 = this.c.e(jc.b($$12)).b();
                            qr $$20 = $$14.a($$12, () -> this.r, $$17, $$19.b());
                            clt $$21 = new clt($$20.h("xPos"), $$20.h("zPos"));
                            if (!$$21.equals($$15)) {
                                a.warn("Chunk {} has invalid position {}", (Object)$$15, (Object)$$21);
                            }
                            boolean bl2 = $$22 = $$18 < aa.b().d().c();
                            if (this.e) {
                                $$22 = $$22 || $$20.e("Heightmaps");
                                $$20.r("Heightmaps");
                                $$22 = $$22 || $$20.e("isLightOn");
                                $$20.r("isLightOn");
                                qx $$23 = $$20.c("sections", 10);
                                for (int $$24 = 0; $$24 < $$23.size(); ++$$24) {
                                    qr $$25 = $$23.a($$24);
                                    $$22 = $$22 || $$25.e("BlockLight");
                                    $$25.r("BlockLight");
                                    $$22 = $$22 || $$25.e("SkyLight");
                                    $$25.r("SkyLight");
                                }
                            }
                            if ($$22) {
                                $$14.a($$15, $$20);
                                $$16 = true;
                            }
                        }
                    }
                    catch (CompletionException | y $$26) {
                        Throwable $$27 = $$26.getCause();
                        if ($$27 instanceof IOException) {
                            a.error("Error upgrading chunk {}", (Object)$$15, (Object)$$27);
                        }
                        throw $$26;
                    }
                    if ($$16) {
                        ++this.m;
                    } else {
                        ++this.n;
                    }
                    $$10 = true;
                }
                float $$28 = (float)$$13.nextIndex() / $$3;
                this.o.put($$12, $$28);
                $$11 += $$28;
            }
            this.k = $$11;
            if ($$10) continue;
            this.i = false;
        }
        this.p = sw.c("optimizeWorld.stage.finished");
        for (dez $$29 : $$8.values()) {
            try {
                $$29.close();
            }
            catch (IOException $$30) {
                a.error("Error upgrading chunk", (Throwable)$$30);
            }
        }
        this.r.a();
        $$9 = ac.b() - $$9;
        a.info("World optimizaton finished after {} ms", (Object)$$9);
        this.j = true;
    }

    private List<clt> b(acp<cmm> $$02) {
        File $$12 = this.f.a($$02).toFile();
        File $$2 = new File($$12, "region");
        File[] $$3 = $$2.listFiles(($$0, $$1) -> $$1.endsWith(".mca"));
        if ($$3 == null) {
            return ImmutableList.of();
        }
        ArrayList $$4 = Lists.newArrayList();
        for (File $$5 : $$3) {
            Matcher $$6 = q.matcher($$5.getName());
            if (!$$6.matches()) continue;
            int $$7 = Integer.parseInt($$6.group(1)) << 5;
            int $$8 = Integer.parseInt($$6.group(2)) << 5;
            try (dfd $$9 = new dfd($$5.toPath(), $$2.toPath(), true);){
                for (int $$10 = 0; $$10 < 32; ++$$10) {
                    for (int $$11 = 0; $$11 < 32; ++$$11) {
                        clt $$122 = new clt($$10 + $$7, $$11 + $$8);
                        if (!$$9.b($$122)) continue;
                        $$4.add($$122);
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return $$4;
    }

    public boolean b() {
        return this.j;
    }

    public Set<acp<cmm>> c() {
        return this.d;
    }

    public float a(acp<cmm> $$0) {
        return this.o.getFloat($$0);
    }

    public float d() {
        return this.k;
    }

    public int e() {
        return this.l;
    }

    public int f() {
        return this.m;
    }

    public int g() {
        return this.n;
    }

    public sw h() {
        return this.p;
    }
}

