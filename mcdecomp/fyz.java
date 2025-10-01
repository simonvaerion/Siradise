/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.joml.Vector3f
 *  org.slf4j.Logger
 *  org.slf4j.Marker
 *  org.slf4j.MarkerFactory
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class fyz {
    private static final Marker d = MarkerFactory.getMarker((String)"SOUNDS");
    private static final Logger e = LogUtils.getLogger();
    private static final float f = 0.5f;
    private static final float g = 2.0f;
    private static final float h = 0.0f;
    private static final float i = 1.0f;
    private static final int j = 20;
    private static final Set<acq> k = Sets.newHashSet();
    private static final long l = 1000L;
    public static final String a = "FOR THE DEBUG!";
    public static final String b = "OpenAL Soft on ";
    public static final int c = "OpenAL Soft on ".length();
    private final fzc m;
    private final enr n;
    private boolean o;
    private final egf p = new egf();
    private final egg q = this.p.e();
    private final fyy r;
    private final fza s = new fza();
    private final fyv t = new fyv(this.p, this.s);
    private int u;
    private long v;
    private final AtomicReference<a> w = new AtomicReference<a>(fyz$a.c);
    private final Map<fxy, fyv.a> x = Maps.newHashMap();
    private final Multimap<ami, fxy> y = HashMultimap.create();
    private final List<fxz> z = Lists.newArrayList();
    private final Map<fxy, Integer> A = Maps.newHashMap();
    private final Map<fxy, Integer> B = Maps.newHashMap();
    private final List<fzb> C = Lists.newArrayList();
    private final List<fxz> D = Lists.newArrayList();
    private final List<fxv> E = Lists.newArrayList();

    public fyz(fzc $$0, enr $$1, ala $$2) {
        this.m = $$0;
        this.n = $$1;
        this.r = new fyy($$2);
    }

    public void a() {
        k.clear();
        for (amg $$0 : jb.c) {
            acq $$1;
            if ($$0 == amh.pp || this.m.a($$1 = $$0.a()) != null) continue;
            e.warn("Missing sound for event: {}", (Object)jb.c.b($$0));
            k.add($$1);
        }
        this.b();
        this.h();
    }

    private synchronized void h() {
        if (this.o) {
            return;
        }
        try {
            String $$0 = this.n.ao().c();
            this.p.a("".equals($$0) ? null : $$0, this.n.S().c());
            this.q.c();
            this.q.a(this.n.a(ami.a));
            this.r.a(this.E).thenRun(this.E::clear);
            this.o = true;
            e.info(d, "Sound engine started");
        }
        catch (RuntimeException $$1) {
            e.error(d, "Error starting SoundSystem. Turning off sounds & music", (Throwable)$$1);
        }
    }

    private float a(@Nullable ami $$0) {
        if ($$0 == null || $$0 == ami.a) {
            return 1.0f;
        }
        return this.n.a($$0);
    }

    public void a(ami $$02, float $$1) {
        if (!this.o) {
            return;
        }
        if ($$02 == ami.a) {
            this.q.a($$1);
            return;
        }
        this.x.forEach(($$0, $$12) -> {
            float $$2 = this.h((fxy)$$0);
            $$12.a((ege $$1) -> {
                if ($$2 <= 0.0f) {
                    $$1.f();
                } else {
                    $$1.b($$2);
                }
            });
        });
    }

    public void b() {
        if (this.o) {
            this.c();
            this.r.a();
            this.p.d();
            this.o = false;
        }
    }

    public void a(fxy $$0) {
        fyv.a $$1;
        if (this.o && ($$1 = this.x.get($$0)) != null) {
            $$1.a(ege::f);
        }
    }

    public void c() {
        if (this.o) {
            this.s.a();
            this.x.values().forEach($$0 -> $$0.a(ege::f));
            this.x.clear();
            this.t.b();
            this.A.clear();
            this.z.clear();
            this.y.clear();
            this.B.clear();
            this.D.clear();
        }
    }

    public void a(fzb $$0) {
        this.C.add($$0);
    }

    public void b(fzb $$0) {
        this.C.remove($$0);
    }

    private boolean i() {
        boolean $$1;
        if (this.p.h()) {
            e.info("Audio device was lost!");
            return true;
        }
        long $$0 = ac.b();
        boolean bl2 = $$1 = $$0 - this.v >= 1000L;
        if ($$1) {
            this.v = $$0;
            if (this.w.compareAndSet(fyz$a.c, fyz$a.a)) {
                String $$2 = this.n.ao().c();
                ac.g().execute(() -> {
                    if ("".equals($$2)) {
                        if (this.p.c()) {
                            e.info("System default audio device has changed!");
                            this.w.compareAndSet(fyz$a.a, fyz$a.b);
                        }
                    } else if (!this.p.b().equals($$2) && this.p.g().contains($$2)) {
                        e.info("Preferred audio device has become available!");
                        this.w.compareAndSet(fyz$a.a, fyz$a.b);
                    }
                    this.w.compareAndSet(fyz$a.a, fyz$a.c);
                });
            }
        }
        return this.w.compareAndSet(fyz$a.b, fyz$a.c);
    }

    public void a(boolean $$0) {
        if (this.i()) {
            this.a();
        }
        if (!$$0) {
            this.j();
        }
        this.t.a();
    }

    private void j() {
        ++this.u;
        this.D.stream().filter(fxy::s).forEach(this::c);
        this.D.clear();
        for (fxz $$0 : this.z) {
            if (!$$0.s()) {
                this.a((fxy)$$0);
            }
            $$0.q();
            if ($$0.m()) {
                this.a((fxy)$$0);
                continue;
            }
            float $$1 = this.h($$0);
            float $$2 = this.g($$0);
            eei $$32 = new eei($$0.h(), $$0.i(), $$0.j());
            fyv.a $$4 = this.x.get($$0);
            if ($$4 == null) continue;
            $$4.a((ege $$3) -> {
                $$3.b($$1);
                $$3.a($$2);
                $$3.a($$32);
            });
        }
        Iterator<Map.Entry<fxy, fyv.a>> $$5 = this.x.entrySet().iterator();
        while ($$5.hasNext()) {
            int $$10;
            Map.Entry<fxy, fyv.a> $$6 = $$5.next();
            fyv.a $$7 = $$6.getValue();
            fxy $$8 = $$6.getKey();
            float $$9 = this.n.a($$8.c());
            if ($$9 <= 0.0f) {
                $$7.a(ege::f);
                $$5.remove();
                continue;
            }
            if (!$$7.a() || ($$10 = this.B.get($$8).intValue()) > this.u) continue;
            if (fyz.e($$8)) {
                this.A.put($$8, this.u + $$8.e());
            }
            $$5.remove();
            e.debug(d, "Removed channel {} because it's not playing anymore", (Object)$$7);
            this.B.remove($$8);
            try {
                this.y.remove((Object)$$8.c(), (Object)$$8);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!($$8 instanceof fxz)) continue;
            this.z.remove($$8);
        }
        Iterator<Map.Entry<fxy, Integer>> $$11 = this.A.entrySet().iterator();
        while ($$11.hasNext()) {
            Map.Entry<fxy, Integer> $$12 = $$11.next();
            if (this.u < $$12.getValue()) continue;
            fxy $$13 = $$12.getKey();
            if ($$13 instanceof fxz) {
                ((fxz)$$13).q();
            }
            this.c($$13);
            $$11.remove();
        }
    }

    private static boolean d(fxy $$0) {
        return $$0.e() > 0;
    }

    private static boolean e(fxy $$0) {
        return $$0.d() && fyz.d($$0);
    }

    private static boolean f(fxy $$0) {
        return $$0.d() && !fyz.d($$0);
    }

    public boolean b(fxy $$0) {
        if (!this.o) {
            return false;
        }
        if (this.B.containsKey($$0) && this.B.get($$0) <= this.u) {
            return true;
        }
        return this.x.containsKey($$0);
    }

    public void c(fxy $$0) {
        if (!this.o) {
            return;
        }
        if (!$$0.s()) {
            return;
        }
        fzd $$1 = $$0.a(this.m);
        acq $$2 = $$0.a();
        if ($$1 == null) {
            if (k.add($$2)) {
                e.warn(d, "Unable to play unknown soundEvent: {}", (Object)$$2);
            }
            return;
        }
        fxv $$3 = $$0.b();
        if ($$3 == fzc.d) {
            return;
        }
        if ($$3 == fzc.a) {
            if (k.add($$2)) {
                e.warn(d, "Unable to play empty soundEvent: {}", (Object)$$2);
            }
            return;
        }
        float $$4 = $$0.f();
        float $$5 = Math.max($$4, 1.0f) * (float)$$3.i();
        ami $$6 = $$0.c();
        float $$7 = this.a($$4, $$6);
        float $$82 = this.g($$0);
        fxy.a $$9 = $$0.k();
        boolean $$10 = $$0.l();
        if ($$7 == 0.0f && !$$0.r()) {
            e.debug(d, "Skipped playing sound {}, volume was zero.", (Object)$$3.a());
            return;
        }
        eei $$11 = new eei($$0.h(), $$0.i(), $$0.j());
        if (!this.C.isEmpty()) {
            boolean $$122;
            boolean bl2 = $$122 = $$10 || $$9 == fxy.a.a || this.q.a().g($$11) < (double)($$5 * $$5);
            if ($$122) {
                for (fzb $$13 : this.C) {
                    $$13.a($$0, $$1);
                }
            } else {
                e.debug(d, "Did not notify listeners of soundEvent: {}, it is too far away to hear", (Object)$$2);
            }
        }
        if (this.q.b() <= 0.0f) {
            e.debug(d, "Skipped playing soundEvent: {}, master volume was zero", (Object)$$2);
            return;
        }
        boolean $$14 = fyz.f($$0);
        boolean $$15 = $$3.g();
        CompletableFuture<fyv.a> $$16 = this.t.a($$3.g() ? egf.c.b : egf.c.a);
        fyv.a $$17 = $$16.join();
        if ($$17 == null) {
            if (aa.aS) {
                e.warn("Failed to create new sound handle");
            }
            return;
        }
        e.debug(d, "Playing sound {} for event {}", (Object)$$3.a(), (Object)$$2);
        this.B.put($$0, this.u + 20);
        this.x.put($$0, $$17);
        this.y.put((Object)$$6, (Object)$$0);
        $$17.a((ege $$8) -> {
            $$8.a($$82);
            $$8.b($$7);
            if ($$9 == fxy.a.b) {
                $$8.c($$5);
            } else {
                $$8.i();
            }
            $$8.a($$14 && !$$15);
            $$8.a($$11);
            $$8.b($$10);
        });
        if (!$$15) {
            this.r.a($$3.b()).thenAccept($$12 -> $$17.a((ege $$1) -> {
                $$1.a((egj)$$12);
                $$1.c();
            }));
        } else {
            this.r.a($$3.b(), $$14).thenAccept($$12 -> $$17.a((ege $$1) -> {
                $$1.a((fyu)$$12);
                $$1.c();
            }));
        }
        if ($$0 instanceof fxz) {
            this.z.add((fxz)$$0);
        }
    }

    public void a(fxz $$0) {
        this.D.add($$0);
    }

    public void a(fxv $$0) {
        this.E.add($$0);
    }

    private float g(fxy $$0) {
        return apa.a($$0.g(), 0.5f, 2.0f);
    }

    private float h(fxy $$0) {
        return this.a($$0.f(), $$0.c());
    }

    private float a(float $$0, ami $$1) {
        return apa.a($$0 * this.a($$1), 0.0f, 1.0f);
    }

    public void d() {
        if (this.o) {
            this.t.a((Stream<ege> $$0) -> $$0.forEach(ege::d));
        }
    }

    public void e() {
        if (this.o) {
            this.t.a((Stream<ege> $$0) -> $$0.forEach(ege::e));
        }
    }

    public void a(fxy $$0, int $$1) {
        this.A.put($$0, this.u + $$1);
    }

    public void a(emz $$0) {
        if (!this.o || !$$0.h()) {
            return;
        }
        eei $$1 = $$0.b();
        Vector3f $$2 = $$0.l();
        Vector3f $$3 = $$0.m();
        this.s.execute(() -> {
            this.q.a($$1);
            this.q.a($$2, $$3);
        });
    }

    public void a(@Nullable acq $$0, @Nullable ami $$1) {
        if ($$1 != null) {
            for (fxy $$2 : this.y.get((Object)$$1)) {
                if ($$0 != null && !$$2.a().equals($$0)) continue;
                this.a($$2);
            }
        } else if ($$0 == null) {
            this.c();
        } else {
            for (fxy $$3 : this.x.keySet()) {
                if (!$$3.a().equals($$0)) continue;
                this.a($$3);
            }
        }
    }

    public String f() {
        return this.p.f();
    }

    public List<String> g() {
        return this.p.g();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = fyz$a.a();
        }
    }
}

