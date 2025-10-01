/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dgu {
    public static final dgl[] d_ = new dgl[]{dgl.T, dgl.U, dgl.V, dgl.W, dgl.X, dgl.Y, dgl.Z, dgl.aa, dgl.ab, dgl.ac, dgl.ad, dgl.ae, dgl.af, dgl.ag, dgl.ah};
    public static final ToIntFunction<dgl> e_ = (ToIntFunction)ac.a(new Object2IntOpenHashMap(), $$0 -> {
        $$0.defaultReturnValue(0);
        $$0.put((Object)dgl.Q, 1);
        $$0.put((Object)dgl.R, 1);
        $$0.put((Object)dgl.y, 1);
        $$0.put((Object)dgl.K, 2);
        $$0.put((Object)dgl.B, 2);
        $$0.put((Object)dgl.P, 2);
        $$0.put((Object)dgl.D, 3);
        $$0.put((Object)dgl.L, 3);
        $$0.put((Object)dgl.C, 3);
        $$0.put((Object)dgl.u, 4);
        $$0.put((Object)dgl.v, 4);
        $$0.put((Object)dgl.n, 4);
        $$0.put((Object)dgl.q, 5);
        $$0.put((Object)dgl.w, 5);
        $$0.put((Object)dgl.r, 6);
        $$0.put((Object)dgl.N, 6);
        $$0.put((Object)dgl.s, 6);
        $$0.put((Object)dgl.o, 7);
        $$0.put((Object)dgl.l, 8);
        $$0.put((Object)dgl.m, 8);
        $$0.put((Object)dgl.j, 9);
        $$0.put((Object)dgl.d, 9);
        $$0.put((Object)dgl.e, 9);
        $$0.put((Object)dgl.g, 9);
        $$0.put((Object)dgl.k, 10);
        $$0.put((Object)dgl.h, 10);
        $$0.put((Object)dgl.a, 10);
        $$0.put((Object)dgl.b, 10);
        $$0.put((Object)dgl.J, 10);
        $$0.put((Object)dgl.I, 10);
        $$0.put((Object)dgl.c, 11);
        $$0.put((Object)dgl.f, 12);
        $$0.put((Object)dgl.z, 12);
        $$0.put((Object)dgl.i, 13);
        $$0.put((Object)dgl.A, 13);
        $$0.put((Object)dgl.t, 14);
        $$0.put((Object)dgl.H, 14);
        $$0.put((Object)dgl.S, 14);
        $$0.put((Object)dgl.p, 15);
        $$0.put((Object)dgl.x, 15);
        for (int $$1 = 1; $$1 <= 15; ++$$1) {
            $$0.put((Object)dgu.b($$1), $$1);
        }
    });

    public a gb();

    public d gc();

    public static int a_(dgl $$0) {
        return e_.applyAsInt($$0);
    }

    public static dgl b(int $$0) {
        return d_[$$0 - 1];
    }

    public static int a_(float $$0, int $$1) {
        double $$2 = 15.0 / (double)$$1;
        return Math.max(1, 15 - apa.a($$2 * (double)$$0));
    }

    public static interface d {
        public int a();

        public dgp b();

        public boolean a(aif var1, gu var2, dgl var3, dgl.a var4);

        public void a(aif var1, gu var2, dgl var3, @Nullable bfj var4, @Nullable bfj var5, float var6);

        default public anl<dgl> c() {
            return anc.a;
        }

        default public boolean d() {
            return false;
        }

        default public boolean f() {
            return false;
        }

        default public int a(float $$0) {
            return apa.d($$0);
        }

        default public boolean a(dgl $$0, dgl.a $$1) {
            if (!$$0.a(this.c())) {
                return false;
            }
            bfj $$2 = $$1.a();
            if ($$2 != null) {
                if ($$2.G_()) {
                    return false;
                }
                if ($$2.bQ() && $$0.a(anc.d)) {
                    if (this.d() && $$2 instanceof aig) {
                        aig $$3 = (aig)$$2;
                        ai.Y.a($$3);
                    }
                    return false;
                }
                if ($$2.aT()) {
                    return false;
                }
            }
            if ($$1.b() != null) {
                return !$$1.b().a(amw.bo);
            }
            return true;
        }

        default public void e() {
        }
    }

    public static interface c {
        /*
         * WARNING - void declaration
         */
        public static void a(cmm $$0, a $$1, d $$2) {
            void $$4;
            if (!($$0 instanceof aif)) {
                return;
            }
            aif $$3 = (aif)$$0;
            if ($$1.c == null) {
                c.a((aif)$$4, $$1, $$2);
            }
            if ($$1.c == null) {
                return;
            }
            boolean $$5 = $$1.c() > 0;
            c.b((aif)$$4, $$1, $$2);
            $$1.d();
            if ($$1.c() <= 0) {
                $$5 = c.a((aif)$$4, $$1, $$2, $$1.c);
            }
            if ($$5) {
                $$2.e();
            }
        }

        private static void a(aif $$0, a $$1, d $$2) {
            $$1.a().a($$0.V()).ifPresent($$3 -> {
                $$1.a((dgs)$$3);
                eei $$4 = $$3.c();
                $$1.a($$2.a($$3.b()));
                $$0.a(new iz($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
                $$2.e();
                $$1.a().a();
            });
        }

        private static void b(aif $$0, a $$1, d $$2) {
            double $$11;
            double $$10;
            int $$7;
            double $$8;
            double $$9;
            boolean $$12;
            if (!$$1.e()) {
                return;
            }
            if ($$1.c == null) {
                $$1.a(false);
                return;
            }
            eei $$3 = $$1.c.c();
            dgp $$4 = $$2.b();
            eei $$5 = $$4.a($$0).orElse($$3);
            int $$6 = $$1.c();
            boolean bl2 = $$12 = $$0.a(new iz($$4, $$6), $$9 = apa.d($$8 = 1.0 - (double)$$6 / (double)($$7 = $$2.a($$1.c.b())), $$3.c, $$5.c), $$10 = apa.d($$8, $$3.d, $$5.d), $$11 = apa.d($$8, $$3.e, $$5.e), 1, 0.0, 0.0, 0.0, 0.0) > 0;
            if ($$12) {
                $$1.a(false);
            }
        }

        private static boolean a(aif $$0, a $$1, d $$2, dgs $$3) {
            gu $$4 = gu.a($$3.c());
            gu $$5 = $$2.b().a($$0).map(gu::a).orElse($$4);
            if ($$2.f() && !c.a($$0, $$5)) {
                return false;
            }
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), b.a($$4, $$5));
            $$1.a(null);
            return true;
        }

        private static boolean a(cmm $$0, gu $$1) {
            clt $$2 = new clt($$1);
            for (int $$3 = $$2.e - 1; $$3 < $$2.e + 1; ++$$3) {
                for (int $$4 = $$2.f - 1; $$4 < $$2.f + 1; ++$$4) {
                    dei $$5 = $$0.J().a($$3, $$4);
                    if ($$5 != null && $$0.a($$5.f().a())) continue;
                    return false;
                }
            }
            return true;
        }
    }

    public static class b
    implements dgn {
        private final dgu a;

        public b(dgu $$0) {
            this.a = $$0;
        }

        @Override
        public dgp a() {
            return this.a.gc().b();
        }

        @Override
        public int b() {
            return this.a.gc().a();
        }

        @Override
        public boolean a(aif $$0, dgl $$1, dgl.a $$2, eei $$3) {
            a $$4 = this.a.gb();
            d $$5 = this.a.gc();
            if ($$4.b() != null) {
                return false;
            }
            if (!$$5.a($$1, $$2)) {
                return false;
            }
            Optional<eei> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
                return false;
            }
            eei $$7 = $$6.get();
            if (!$$5.a($$0, gu.a($$3), $$1, $$2)) {
                return false;
            }
            if (b.a($$0, $$3, $$7)) {
                return false;
            }
            this.a($$0, $$4, $$1, $$2, $$3, $$7);
            return true;
        }

        public void b(aif $$0, dgl $$1, dgl.a $$2, eei $$3) {
            this.a.gc().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gb(), $$1, $$2, $$3, (eei)$$4));
        }

        private void a(aif $$0, a $$1, dgl $$2, dgl.a $$3, eei $$4, eei $$5) {
            $$1.e.a(new dgs($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
        }

        public static float a(gu $$0, gu $$1) {
            return (float)Math.sqrt($$0.j($$1));
        }

        private static boolean a(cmm $$02, eei $$1, eei $$2) {
            eei $$3 = new eei((double)apa.a($$1.c) + 0.5, (double)apa.a($$1.d) + 0.5, (double)apa.a($$1.e) + 0.5);
            eei $$4 = new eei((double)apa.a($$2.c) + 0.5, (double)apa.a($$2.d) + 0.5, (double)apa.a($$2.e) + 0.5);
            for (ha $$5 : ha.values()) {
                eei $$6 = $$3.a($$5, (double)1.0E-5f);
                if ($$02.a(new clu($$6, $$4, $$0 -> $$0.a(amw.bn))).c() == eeg.a.b) continue;
                return false;
            }
            return true;
        }
    }

    public static final class a {
        public static Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dgs.a.optionalFieldOf("event").forGetter($$0 -> Optional.ofNullable($$0.c)), (App)dgt.a.fieldOf("selector").forGetter(a::a), (App)aoi.i.fieldOf("event_delay").orElse((Object)0).forGetter(a::c)).apply((Applicative)$$02, ($$0, $$1, $$2) -> new a($$0.orElse(null), (dgt)$$1, (int)$$2, true)));
        public static final String b = "listener";
        @Nullable
        dgs c;
        private int d;
        final dgt e;
        private boolean f;

        private a(@Nullable dgs $$0, dgt $$1, int $$2, boolean $$3) {
            this.c = $$0;
            this.d = $$2;
            this.e = $$1;
            this.f = $$3;
        }

        public a() {
            this(null, new dgt(), 0, false);
        }

        public dgt a() {
            return this.e;
        }

        @Nullable
        public dgs b() {
            return this.c;
        }

        public void a(@Nullable dgs $$0) {
            this.c = $$0;
        }

        public int c() {
            return this.d;
        }

        public void a(int $$0) {
            this.d = $$0;
        }

        public void d() {
            this.d = Math.max(0, this.d - 1);
        }

        public boolean e() {
            return this.f;
        }

        public void a(boolean $$0) {
            this.f = $$0;
        }
    }
}

