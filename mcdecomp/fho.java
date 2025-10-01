/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.EvictingQueue
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fho
implements akr {
    private static final Logger b = LogUtils.getLogger();
    private static final acj c = acj.a("particles");
    private static final acq d = new acq("particles");
    private static final int e = 16384;
    private static final List<fhq> f = ImmutableList.of((Object)fhq.a, (Object)fhq.b, (Object)fhq.d, (Object)fhq.c, (Object)fhq.e);
    protected few a;
    private final Map<fhq, Queue<fhm>> g = Maps.newIdentityHashMap();
    private final Queue<fio> h = Queues.newArrayDeque();
    private final fuw i;
    private final apf j = apf.a();
    private final Int2ObjectMap<fhp<?>> k = new Int2ObjectOpenHashMap();
    private final Queue<fhm> l = Queues.newArrayDeque();
    private final Map<acq, b> m = Maps.newHashMap();
    private final fuu n;
    private final Object2IntOpenHashMap<is> o = new Object2IntOpenHashMap();

    public fho(few $$0, fuw $$1) {
        this.n = new fuu(fuu.f);
        $$1.a(this.n.g(), this.n);
        this.a = $$0;
        this.i = $$1;
        this.e();
    }

    private void e() {
        this.a(iv.a, fie.a::new);
        this.a(iv.b, fhd.a::new);
        this.a(iv.d, new fgj.a());
        this.a(iv.c, new fil.a());
        this.a(iv.e, fgm.a::new);
        this.a(iv.ak, fgl.a::new);
        this.a(iv.ai, fgn.a::new);
        this.a(iv.an, fgo.a::new);
        this.a(iv.ao, fgo.b::new);
        this.a(iv.f, fhr.a::new);
        this.a(iv.L, fik.a::new);
        this.a(iv.g, fgq.c::new);
        this.a(iv.aj, fir.a::new);
        this.a(iv.h, fgq.a::new);
        this.a(iv.i, fgr.a::new);
        this.a(iv.am, fik.b::new);
        this.a(iv.j, fgs::c);
        this.a(iv.k, fgs::d);
        this.a(iv.l, fgs::e);
        this.a(iv.m, fgs::a);
        this.a(iv.n, fgs::b);
        this.a(iv.o, fgu.a::new);
        this.a(iv.p, fgt.a::new);
        this.a(iv.q, fie.d::new);
        this.a(iv.r, new fhj.a());
        this.a(iv.s, fgq.b::new);
        this.a(iv.t, fgw.b::new);
        this.a(iv.u, fgx.a::new);
        this.a(iv.v, fie.c::new);
        this.a(iv.w, new fhf.a());
        this.a(iv.x, fhe.a::new);
        this.a(iv.y, fic.a::new);
        this.a(iv.z, fgz.a::new);
        this.a(iv.A, fha.d::new);
        this.a(iv.B, fiq.a::new);
        this.a(iv.C, fhb.a::new);
        this.a(iv.E, fid.a::new);
        this.a(iv.F, fhv.a::new);
        this.a(iv.G, fhw.a::new);
        this.a(iv.I, fid.b::new);
        this.a(iv.H, fhb.a::new);
        this.a(iv.J, fha.a::new);
        this.a(iv.K, fik.d::new);
        this.a(iv.M, fhd.b::new);
        this.a(iv.N, fie.b::new);
        this.a(iv.O, new fgk.a());
        this.a(iv.Q, new fgk.b());
        this.a(iv.R, new fgk.c());
        this.a(iv.S, fhh.a::new);
        this.a(iv.T, fhi.a::new);
        this.a(iv.U, fik.e::new);
        this.a(iv.al, fgw.a::new);
        this.a(iv.V, fhl.a::new);
        this.a(iv.W, fgy.a::new);
        this.a(iv.X, fhs.a::new);
        this.a(iv.Y, fis.a::new);
        this.a(iv.Z, fia.a::new);
        this.a(iv.aa, fhr.b::new);
        this.a(iv.aE, fib.a::new);
        this.a(iv.ab, fif.a::new);
        this.a(iv.ad, fgh.a::new);
        this.a(iv.ae, fin.a::new);
        this.a(iv.ac, fii.b::new);
        this.a(iv.af, fij.c::new);
        this.a(iv.ag, fig.a::new);
        this.a(iv.ah, fie.e::new);
        this.a(iv.ap, fgs::f);
        this.a(iv.aq, fgs::g);
        this.a(iv.ar, fgs::h);
        this.a(iv.as, fgs::m);
        this.a(iv.at, fgs::n);
        this.a(iv.ax, fij.b::new);
        this.a(iv.au, fgg.a::new);
        this.a(iv.av, fij.a::new);
        this.a(iv.aw, fij.d::new);
        this.a(iv.ay, fgs::o);
        this.a(iv.az, fgs::p);
        this.a(iv.aA, fgs::q);
        this.a(iv.aB, fht.a::new);
        this.a(iv.aC, fit.a::new);
        this.a(iv.aD, fhb.b::new);
        this.a(iv.aH, fgs::i);
        this.a(iv.aI, fgs::j);
        this.a(iv.D, (fih $$0) -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fgp($$2, $$3, $$4, $$5, $$0));
        this.a(iv.aF, fgs::k);
        this.a(iv.aG, fgs::l);
        this.a(iv.P, fip.a::new);
        this.a(iv.aJ, fii.a::new);
        this.a(iv.aK, fhc.b::new);
        this.a(iv.aL, fhc.e::new);
        this.a(iv.aM, fhc.d::new);
        this.a(iv.aN, fhc.a::new);
        this.a(iv.aO, fhc.c::new);
        this.a(iv.aP, fhx.a::new);
        this.a(iv.aQ, fik.c::new);
    }

    private <T extends it> void a(iu<T> $$0, fhp<T> $$1) {
        this.k.put(jb.k.a($$0), $$1);
    }

    private <T extends it> void a(iu<T> $$0, fhp.a<T> $$12) {
        this.a($$0, (fih $$1) -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fim $$10 = $$12.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
                $$10.a($$1);
            }
            return $$10;
        });
    }

    private <T extends it> void a(iu<T> $$0, c<T> $$1) {
        b $$2 = new b();
        this.m.put(jb.k.b($$0), $$2);
        this.k.put(jb.k.a($$0), $$1.create($$2));
    }

    @Override
    public CompletableFuture<Void> a(akr.a $$0, akx $$12, ban $$2, ban $$3, Executor $$4, Executor $$5) {
        CompletionStage $$6 = CompletableFuture.supplyAsync(() -> c.a($$12), $$4).thenCompose($$1 -> {
            ArrayList $$22 = new ArrayList($$1.size());
            $$1.forEach(($$2, $$3) -> {
                acq $$4 = c.b((acq)$$2);
                $$22.add(CompletableFuture.supplyAsync(() -> {
                    record A(acq a, Optional<List<acq>> b) {
                        @Override
                        public final String toString() {
                            return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "id;sprites", "a", "b"}, this);
                        }

                        @Override
                        public final int hashCode() {
                            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "id;sprites", "a", "b"}, this);
                        }

                        @Override
                        public final boolean equals(Object $$0) {
                            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "id;sprites", "a", "b"}, this, $$0);
                        }
                    }
                    return new A($$4, this.a($$4, (akv)$$3));
                }, $$4));
            });
            return ac.b($$22);
        });
        CompletionStage $$7 = fuq.a(this.n).a($$12, d, 0, $$4).thenCompose(fuq.a::a);
        return ((CompletableFuture)CompletableFuture.allOf(new CompletableFuture[]{$$7, $$6}).thenCompose($$0::a)).thenAcceptAsync(arg_0 -> this.a($$3, (CompletableFuture)$$7, (CompletableFuture)$$6, arg_0), $$5);
    }

    public void a() {
        this.n.f();
    }

    private Optional<List<acq>> a(acq $$0, akv $$1) {
        Optional<List<acq>> optional;
        block9: {
            if (!this.m.containsKey($$0)) {
                b.debug("Redundant texture list for particle: {}", (Object)$$0);
                return Optional.empty();
            }
            BufferedReader $$2 = $$1.e();
            try {
                fhn $$3 = fhn.a(aor.a($$2));
                optional = Optional.of($$3.a());
                if ($$2 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            ((Reader)$$2).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$4) {
                    throw new IllegalStateException("Failed to load description for particle " + $$0, $$4);
                }
            }
            ((Reader)$$2).close();
        }
        return optional;
    }

    public void a(bfj $$0, it $$1) {
        this.h.add(new fio(this.a, $$0, $$1));
    }

    public void a(bfj $$0, it $$1, int $$2) {
        this.h.add(new fio(this.a, $$0, $$1, $$2));
    }

    @Nullable
    public fhm a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        fhm $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        if ($$7 != null) {
            this.a($$7);
            return $$7;
        }
        return null;
    }

    @Nullable
    private <T extends it> fhm b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        fhp $$7 = (fhp)this.k.get(jb.k.a($$0.b()));
        if ($$7 == null) {
            return null;
        }
        return $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    public void a(fhm $$0) {
        Optional<is> $$1 = $$0.o();
        if ($$1.isPresent()) {
            if (this.a($$1.get())) {
                this.l.add($$0);
                this.a($$1.get(), 1);
            }
        } else {
            this.l.add($$0);
        }
    }

    public void b() {
        this.g.forEach(($$0, $$1) -> {
            this.a.ad().a($$0.toString());
            this.a((Collection<fhm>)$$1);
            this.a.ad().c();
        });
        if (!this.h.isEmpty()) {
            ArrayList $$02 = Lists.newArrayList();
            for (fio $$12 : this.h) {
                $$12.a();
                if ($$12.m()) continue;
                $$02.add($$12);
            }
            this.h.removeAll($$02);
        }
        if (!this.l.isEmpty()) {
            fhm $$2;
            while (($$2 = this.l.poll()) != null) {
                this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create((int)16384)).add($$2);
            }
        }
    }

    private void a(Collection<fhm> $$02) {
        if (!$$02.isEmpty()) {
            Iterator<fhm> $$1 = $$02.iterator();
            while ($$1.hasNext()) {
                fhm $$2 = $$1.next();
                this.b($$2);
                if ($$2.m()) continue;
                $$2.o().ifPresent($$0 -> this.a((is)$$0, -1));
                $$1.remove();
            }
        }
    }

    private void a(is $$0, int $$1) {
        this.o.addTo((Object)$$0, $$1);
    }

    private void b(fhm $$0) {
        try {
            $$0.a();
        }
        catch (Throwable $$1) {
            o $$2 = o.a($$1, "Ticking Particle");
            p $$3 = $$2.a("Particle being ticked");
            $$3.a("Particle", $$0::toString);
            $$3.a("Particle Type", $$0.b()::toString);
            throw new y($$2);
        }
    }

    public void a(eij $$0, fjx.a $$1, fjw $$2, emz $$3, float $$4) {
        $$2.c();
        RenderSystem.enableDepthTest();
        eij $$5 = RenderSystem.getModelViewStack();
        $$5.a();
        $$5.a($$0.c().a());
        RenderSystem.applyModelViewMatrix();
        for (fhq $$6 : f) {
            Iterable $$7 = this.g.get($$6);
            if ($$7 == null) continue;
            RenderSystem.setShader(fjq::u);
            eil $$8 = eil.a();
            eie $$9 = $$8.c();
            $$6.a($$9, this.i);
            for (fhm $$10 : $$7) {
                try {
                    $$10.a($$9, $$3, $$4);
                }
                catch (Throwable $$11) {
                    o $$12 = o.a($$11, "Rendering Particle");
                    p $$13 = $$12.a("Particle being rendered");
                    $$13.a("Particle", $$10::toString);
                    $$13.a("Particle Type", $$6::toString);
                    throw new y($$12);
                }
            }
            $$6.a($$8);
        }
        $$5.b();
        RenderSystem.applyModelViewMatrix();
        RenderSystem.depthMask(true);
        RenderSystem.disableBlend();
        $$2.b();
    }

    public void a(@Nullable few $$0) {
        this.a = $$0;
        this.f();
        this.h.clear();
    }

    public void a(gu $$0, dcb $$1) {
        if ($$1.i() || !$$1.z()) {
            return;
        }
        efb $$22 = $$1.j(this.a, $$0);
        double $$32 = 0.25;
        $$22.b((double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) -> {
            double $$8 = Math.min(1.0, $$5 - $$2);
            double $$9 = Math.min(1.0, $$6 - $$3);
            double $$10 = Math.min(1.0, $$7 - $$4);
            int $$11 = Math.max(2, apa.c($$8 / 0.25));
            int $$12 = Math.max(2, apa.c($$9 / 0.25));
            int $$13 = Math.max(2, apa.c($$10 / 0.25));
            for (int $$14 = 0; $$14 < $$11; ++$$14) {
                for (int $$15 = 0; $$15 < $$12; ++$$15) {
                    for (int $$16 = 0; $$16 < $$13; ++$$16) {
                        double $$17 = ((double)$$14 + 0.5) / (double)$$11;
                        double $$18 = ((double)$$15 + 0.5) / (double)$$12;
                        double $$19 = ((double)$$16 + 0.5) / (double)$$13;
                        double $$20 = $$17 * $$8 + $$2;
                        double $$21 = $$18 * $$9 + $$3;
                        double $$22 = $$19 * $$10 + $$4;
                        this.a(new fil(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0));
                    }
                }
            }
        });
    }

    public void a(gu $$0, ha $$1) {
        dcb $$2 = this.a.a_($$0);
        if ($$2.l() == cvs.a) {
            return;
        }
        int $$3 = $$0.u();
        int $$4 = $$0.v();
        int $$5 = $$0.w();
        float $$6 = 0.1f;
        eed $$7 = $$2.j(this.a, $$0).a();
        double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - (double)0.2f) + (double)0.1f + $$7.a;
        double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - (double)0.2f) + (double)0.1f + $$7.b;
        double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - (double)0.2f) + (double)0.1f + $$7.c;
        if ($$1 == ha.a) {
            $$9 = (double)$$4 + $$7.b - (double)0.1f;
        }
        if ($$1 == ha.b) {
            $$9 = (double)$$4 + $$7.e + (double)0.1f;
        }
        if ($$1 == ha.c) {
            $$10 = (double)$$5 + $$7.c - (double)0.1f;
        }
        if ($$1 == ha.d) {
            $$10 = (double)$$5 + $$7.f + (double)0.1f;
        }
        if ($$1 == ha.e) {
            $$8 = (double)$$3 + $$7.a - (double)0.1f;
        }
        if ($$1 == ha.f) {
            $$8 = (double)$$3 + $$7.d + (double)0.1f;
        }
        this.a(new fil(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2f).d(0.6f));
    }

    public String d() {
        return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
    }

    private boolean a(is $$0) {
        return this.o.getInt((Object)$$0) < $$0.a();
    }

    private void f() {
        this.g.clear();
        this.l.clear();
        this.h.clear();
        this.o.clear();
    }

    private /* synthetic */ void a(ban $$0, CompletableFuture $$1, CompletableFuture $$2, Void $$32) {
        this.f();
        $$0.a();
        $$0.a("upload");
        fuq.a $$4 = (fuq.a)$$1.join();
        this.n.a($$4);
        $$0.b("bindSpriteSets");
        HashSet $$5 = new HashSet();
        fuv $$6 = $$4.e();
        ((List)$$2.join()).forEach($$3 -> {
            Optional<List<acq>> $$4 = $$3.b();
            if ($$4.isEmpty()) {
                return;
            }
            ArrayList<fuv> $$5 = new ArrayList<fuv>();
            for (acq $$6 : $$4.get()) {
                fuv $$7 = $$4.f().get($$6);
                if ($$7 == null) {
                    $$5.add($$6);
                    $$5.add($$6);
                    continue;
                }
                $$5.add($$7);
            }
            if ($$5.isEmpty()) {
                $$5.add($$6);
            }
            this.m.get($$3.a()).a($$5);
        });
        if (!$$5.isEmpty()) {
            b.warn("Missing particle sprites: {}", (Object)$$5.stream().sorted().map(acq::toString).collect(Collectors.joining(",")));
        }
        $$0.c();
        $$0.b();
    }

    @FunctionalInterface
    static interface c<T extends it> {
        public fhp<T> create(fih var1);
    }

    static class b
    implements fih {
        private List<fuv> a;

        b() {
        }

        @Override
        public fuv a(int $$0, int $$1) {
            return this.a.get($$0 * (this.a.size() - 1) / $$1);
        }

        @Override
        public fuv a(apf $$0) {
            return this.a.get($$0.a(this.a.size()));
        }

        public void a(List<fuv> $$0) {
            this.a = ImmutableList.copyOf($$0);
        }
    }
}

