/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clo {
    public static final String b = "SpawnData";
    private static final Logger a = LogUtils.getLogger();
    private static final int c = 1;
    private int d = 20;
    private bch<cnd> e = bch.b();
    @Nullable
    private cnd f;
    private double g;
    private double h;
    private int i = 200;
    private int j = 800;
    private int k = 4;
    @Nullable
    private bfj l;
    private int m = 6;
    private int n = 16;
    private int o = 4;

    public void a(bfn<?> $$0, @Nullable cmm $$1, apf $$2, gu $$3) {
        this.b($$1, $$2, $$3).a().a("id", jb.h.b($$0).toString());
    }

    private boolean b(cmm $$0, gu $$1) {
        return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.n);
    }

    public void a(cmm $$0, gu $$1) {
        if (!this.b($$0, $$1)) {
            this.h = this.g;
        } else if (this.l != null) {
            apf $$2 = $$0.y_();
            double $$3 = (double)$$1.u() + $$2.j();
            double $$4 = (double)$$1.v() + $$2.j();
            double $$5 = (double)$$1.w() + $$2.j();
            $$0.a(iv.Z, $$3, $$4, $$5, 0.0, 0.0, 0.0);
            $$0.a(iv.C, $$3, $$4, $$5, 0.0, 0.0, 0.0);
            if (this.d > 0) {
                --this.d;
            }
            this.h = this.g;
            this.g = (this.g + (double)(1000.0f / ((float)this.d + 200.0f))) % 360.0;
        }
    }

    public void a(aif $$0, gu $$1) {
        if (!this.b($$0, $$1)) {
            return;
        }
        if (this.d == -1) {
            this.c($$0, $$1);
        }
        if (this.d > 0) {
            --this.d;
            return;
        }
        boolean $$2 = false;
        apf $$32 = $$0.y_();
        cnd $$4 = this.b($$0, $$32, $$1);
        for (int $$5 = 0; $$5 < this.k; ++$$5) {
            cnd.a $$14;
            double $$12;
            qr $$6 = $$4.a();
            Optional<bfn<?>> $$7 = bfn.a($$6);
            if ($$7.isEmpty()) {
                this.c($$0, $$1);
                return;
            }
            qx $$8 = $$6.c("Pos", 6);
            int $$9 = $$8.size();
            double $$10 = $$9 >= 1 ? $$8.h(0) : (double)$$1.u() + ($$32.j() - $$32.j()) * (double)this.o + 0.5;
            double $$11 = $$9 >= 2 ? $$8.h(1) : (double)($$1.v() + $$32.a(3) - 1);
            double d2 = $$12 = $$9 >= 3 ? $$8.h(2) : (double)$$1.w() + ($$32.j() - $$32.j()) * (double)this.o + 0.5;
            if (!$$0.b($$7.get().a($$10, $$11, $$12))) continue;
            gu $$13 = gu.a($$10, $$11, $$12);
            if (!$$4.b().isPresent() ? !bgu.a($$7.get(), $$0, bgd.c, $$13, $$0.y_()) : !$$7.get().f().d() && $$0.ai() == bdu.a || !($$14 = $$4.b().get()).a().a($$0.a(cmv.b, $$13)) || !$$14.b().a($$0.a(cmv.a, $$13))) continue;
            bfj $$15 = bfn.a($$6, $$0, $$3 -> {
                $$3.b($$10, $$11, $$12, $$3.dy(), $$3.dA());
                return $$3;
            });
            if ($$15 == null) {
                this.c($$0, $$1);
                return;
            }
            int $$16 = $$0.a($$15.getClass(), new eed($$1.u(), $$1.v(), $$1.w(), $$1.u() + 1, $$1.v() + 1, $$1.w() + 1).g(this.o)).size();
            if ($$16 >= this.m) {
                this.c($$0, $$1);
                return;
            }
            $$15.b($$15.dn(), $$15.dp(), $$15.dt(), $$32.i() * 360.0f, 0.0f);
            if ($$15 instanceof bgb) {
                bgb $$17 = (bgb)$$15;
                if ($$4.b().isEmpty() && !$$17.a((cmn)$$0, bgd.c) || !$$17.a((cmp)$$0)) continue;
                if ($$4.a().f() == 1 && $$4.a().b("id", 8)) {
                    ((bgb)$$15).a($$0, $$0.d_($$15.di()), bgd.c, null, null);
                }
            }
            if (!$$0.e($$15)) {
                this.c($$0, $$1);
                return;
            }
            $$0.c(2004, $$1, 0);
            $$0.a($$15, dgl.t, $$13);
            if ($$15 instanceof bgb) {
                ((bgb)$$15).O();
            }
            $$2 = true;
        }
        if ($$2) {
            this.c($$0, $$1);
        }
    }

    private void c(cmm $$0, gu $$1) {
        apf $$22 = $$0.z;
        this.d = this.j <= this.i ? this.i : this.i + $$22.a(this.j - this.i);
        this.e.b($$22).ifPresent($$2 -> this.a($$0, $$1, (cnd)$$2.b()));
        this.a($$0, $$1, 1);
    }

    public void a(@Nullable cmm $$02, gu $$1, qr $$2) {
        boolean $$5;
        this.d = $$2.g("Delay");
        boolean $$3 = $$2.b(b, 10);
        if ($$3) {
            cnd $$4 = cnd.b.parse((DynamicOps)rc.a, (Object)$$2.p(b)).resultOrPartial($$0 -> a.warn("Invalid SpawnData: {}", $$0)).orElseGet(cnd::new);
            this.a($$02, $$1, $$4);
        }
        if ($$5 = $$2.b("SpawnPotentials", 9)) {
            qx $$6 = $$2.c("SpawnPotentials", 10);
            this.e = cnd.c.parse((DynamicOps)rc.a, (Object)$$6).resultOrPartial($$0 -> a.warn("Invalid SpawnPotentials list: {}", $$0)).orElseGet(bch::b);
        } else {
            this.e = bch.a(this.f != null ? this.f : new cnd());
        }
        if ($$2.b("MinSpawnDelay", 99)) {
            this.i = $$2.g("MinSpawnDelay");
            this.j = $$2.g("MaxSpawnDelay");
            this.k = $$2.g("SpawnCount");
        }
        if ($$2.b("MaxNearbyEntities", 99)) {
            this.m = $$2.g("MaxNearbyEntities");
            this.n = $$2.g("RequiredPlayerRange");
        }
        if ($$2.b("SpawnRange", 99)) {
            this.o = $$2.g("SpawnRange");
        }
        this.l = null;
    }

    public qr a(qr $$0) {
        $$0.a("Delay", (short)this.d);
        $$0.a("MinSpawnDelay", (short)this.i);
        $$0.a("MaxSpawnDelay", (short)this.j);
        $$0.a("SpawnCount", (short)this.k);
        $$0.a("MaxNearbyEntities", (short)this.m);
        $$0.a("RequiredPlayerRange", (short)this.n);
        $$0.a("SpawnRange", (short)this.o);
        if (this.f != null) {
            $$0.a(b, (rk)cnd.b.encodeStart((DynamicOps)rc.a, (Object)this.f).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData")));
        }
        $$0.a("SpawnPotentials", (rk)cnd.c.encodeStart((DynamicOps)rc.a, this.e).result().orElseThrow());
        return $$0;
    }

    @Nullable
    public bfj a(cmm $$0, apf $$1, gu $$2) {
        if (this.l == null) {
            qr $$3 = this.b($$0, $$1, $$2).a();
            if (!$$3.b("id", 8)) {
                return null;
            }
            this.l = bfn.a($$3, $$0, Function.identity());
            if ($$3.f() != 1 || this.l instanceof bgb) {
                // empty if block
            }
        }
        return this.l;
    }

    public boolean a(cmm $$0, int $$1) {
        if ($$1 == 1) {
            if ($$0.B) {
                this.d = this.i;
            }
            return true;
        }
        return false;
    }

    protected void a(@Nullable cmm $$0, gu $$1, cnd $$2) {
        this.f = $$2;
    }

    private cnd b(@Nullable cmm $$0, apf $$1, gu $$2) {
        if (this.f != null) {
            return this.f;
        }
        this.a($$0, $$2, this.e.b($$1).map(bcj.b::b).orElseGet(cnd::new));
        return this.f;
    }

    public abstract void a(cmm var1, gu var2, int var3);

    public double a() {
        return this.g;
    }

    public double b() {
        return this.h;
    }
}

