/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezk {
    private static final Logger a = LogUtils.getLogger();
    private final enn b;
    private final dyy c;

    public ezk(enn $$0, dyy $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public void a(euq $$0, String $$1) {
        this.a($$0, $$1, false, true);
    }

    public void a(String $$0, cmq $$1, dii $$2, Function<hs, dif> $$32) {
        dyy.c $$4 = this.a($$0);
        if ($$4 == null) {
            return;
        }
        aki $$5 = akl.a($$4);
        cnf $$6 = $$1.g();
        try {
            adj.d $$7 = new adj.d($$5, $$6, false, false);
            adk $$8 = this.a($$7, (adj.a $$3) -> {
                dif.b $$4 = ((dif)$$32.apply($$3.c())).a($$3.d().d(jc.aI));
                return new adj.b<dzc>(new dzc($$1, $$2, $$4.d(), $$4.a()), $$4.b());
            }, adk::new);
            this.b.a($$0, $$4, $$5, $$8, true);
        }
        catch (Exception $$9) {
            a.warn("Failed to load datapacks, can't proceed with server load", (Throwable)$$9);
            ezk.a($$4, $$0);
        }
    }

    @Nullable
    private dyy.c a(String $$0) {
        try {
            return this.c.c($$0);
        }
        catch (IOException $$1) {
            a.warn("Failed to read level {} data", (Object)$$0, (Object)$$1);
            erf.a(this.b, $$0);
            this.b.a((euq)null);
            return null;
        }
        catch (edx $$2) {
            a.warn("{}", (Object)$$2.getMessage());
            this.b.a(new euv(null));
            return null;
        }
    }

    public void a(dyy.c $$0, ada $$1, hl<acz> $$2, dze $$3) {
        aki $$4 = akl.a($$0);
        akn $$5 = (akn)new adj.d($$4, $$3.F(), false, false).a().getSecond();
        this.b.a($$0.a(), $$0, $$4, new adk($$5, $$1, $$2, $$3), true);
    }

    private adk a(dyy.c $$0, boolean $$12, aki $$2) throws Exception {
        adj.d $$3 = this.b($$0, $$12, $$2);
        return this.a($$3, (adj.a $$1) -> {
            aco<rk> $$2 = aco.a(rc.a, $$1.c());
            hr<dfl> $$3 = $$1.d().d(jc.aI);
            Pair<dze, dif.b> $$4 = $$0.a($$2, $$1.b(), $$3, $$1.c().d());
            if ($$4 == null) {
                throw new IllegalStateException("Failed to load world");
            }
            return new adj.b<dze>((dze)$$4.getFirst(), ((dif.b)$$4.getSecond()).b());
        }, adk::new);
    }

    public Pair<cmq, ezi> a(dyy.c $$02) throws Exception {
        final class A
        extends Record {
            final cmq a;
            final dii b;
            final hr<dfl> c;

            A(cmq $$0, dii $$1, hr<dfl> $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "levelSettings;options;existingDimensions", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "levelSettings;options;existingDimensions", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "levelSettings;options;existingDimensions", "a", "b", "c"}, this, $$0);
            }

            public cmq a() {
                return this.a;
            }

            public dii b() {
                return this.b;
            }

            public hr<dfl> c() {
                return this.c;
            }
        }
        aki $$12 = akl.a($$02);
        adj.d $$22 = this.b($$02, false, $$12);
        return this.a($$22, (adj.a $$1) -> {
            aco<rk> $$2 = aco.a(rc.a, $$1.c());
            hr<dfl> $$3 = new hm<dfl>(jc.aI, Lifecycle.stable()).l();
            Pair<dze, dif.b> $$4 = $$02.a($$2, $$1.b(), $$3, $$1.c().d());
            if ($$4 == null) {
                throw new IllegalStateException("Failed to load world");
            }
            return new adj.b<A>(new A(((dze)$$4.getFirst()).L(), ((dze)$$4.getFirst()).A(), ((dif.b)$$4.getSecond()).c()), $$1.d());
        }, (akn $$0, ada $$1, hl<acz> $$2, D $$3) -> {
            $$0.close();
            return Pair.of((Object)$$3.a, (Object)new ezi($$3.b, new dif($$3.c), $$2, $$1, $$3.a.g()));
        });
    }

    private adj.d b(dyy.c $$0, boolean $$1, aki $$2) {
        cnf $$3 = $$0.d();
        if ($$3 == null) {
            throw new IllegalStateException("Failed to load data pack config");
        }
        return new adj.d($$2, $$3, $$1, false);
    }

    public adk a(dyy.c $$0, boolean $$1) throws Exception {
        aki $$2 = akl.a($$0);
        return this.a($$0, $$1, $$2);
    }

    private <D, R> R a(adj.d $$0, adj.f<D> $$1, adj.e<D, R> $$2) throws Exception {
        adj.c $$3 = new adj.c($$0, dt.a.c, 2);
        CompletableFuture<R> $$4 = adj.a($$3, $$1, $$2, ac.f(), this.b);
        this.b.c($$4::isDone);
        return $$4.get();
    }

    /*
     * WARNING - void declaration
     */
    private void a(euq $$02, String $$1, boolean $$2, boolean $$3) {
        boolean $$11;
        void $$8;
        dyy.c $$4 = this.a($$1);
        if ($$4 == null) {
            return;
        }
        aki $$5 = akl.a($$4);
        try {
            adk $$6 = this.a($$4, $$2, $$5);
        }
        catch (Exception $$7) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", (Throwable)$$7);
            if (!$$2) {
                this.b.a(new etp(() -> this.a($$02, $$1, true, $$3)));
            } else {
                this.b.a(new ete(() -> this.b.a((euq)null), sw.c("datapackFailure.safeMode.failed.title"), sw.c("datapackFailure.safeMode.failed.description"), sv.l, true));
            }
            ezk.a($$4, $$1);
            return;
        }
        dze $$9 = $$8.d();
        boolean $$10 = $$9.A().e();
        boolean bl2 = $$11 = $$9.D() != Lifecycle.stable();
        if ($$3 && ($$10 || $$11)) {
            this.a($$02, $$1, $$10, () -> this.a($$02, $$1, $$2, false));
            $$8.close();
            ezk.a($$4, $$1);
            return;
        }
        ((CompletableFuture)((CompletableFuture)((CompletableFuture)this.b.ab().a($$4).thenApply($$0 -> true)).exceptionallyComposeAsync($$0 -> {
            a.warn("Failed to load pack: ", $$0);
            return this.a();
        }, (Executor)this.b)).thenAcceptAsync(arg_0 -> this.a($$1, $$4, $$5, (adk)$$8, $$02, arg_0), (Executor)this.b)).exceptionally($$0 -> {
            this.b.a(o.a($$0, "Load world"));
            return null;
        });
    }

    private CompletableFuture<Boolean> a() {
        CompletableFuture<Boolean> $$0 = new CompletableFuture<Boolean>();
        this.b.a(new etk($$0::complete, sw.c("multiplayer.texturePrompt.failure.line1"), sw.c("multiplayer.texturePrompt.failure.line2"), sv.i, sv.e));
        return $$0;
    }

    private static void a(dyy.c $$0, String $$1) {
        try {
            $$0.close();
        }
        catch (IOException $$2) {
            a.warn("Failed to unlock access to level {}", (Object)$$1, (Object)$$2);
        }
    }

    private void a(euq $$0, String $$1, boolean $$22, Runnable $$32) {
        tj $$7;
        tj $$6;
        if ($$22) {
            tj $$4 = sw.c("selectWorld.backupQuestion.customized");
            tj $$5 = sw.c("selectWorld.backupWarning.customized");
        } else {
            $$6 = sw.c("selectWorld.backupQuestion.experimental");
            $$7 = sw.c("selectWorld.backupWarning.experimental");
        }
        this.b.a(new etf($$0, ($$2, $$3) -> {
            if ($$2) {
                ezc.a(this.c, $$1);
            }
            $$32.run();
        }, $$6, $$7, false));
    }

    public static void a(enn $$0, eza $$1, Lifecycle $$2, Runnable $$32, boolean $$4) {
        BooleanConsumer $$5 = $$3 -> {
            if ($$3) {
                $$32.run();
            } else {
                $$0.a($$1);
            }
        };
        if ($$4 || $$2 == Lifecycle.stable()) {
            $$32.run();
        } else if ($$2 == Lifecycle.experimental()) {
            $$0.a(new etk($$5, sw.c("selectWorld.warning.experimental.title"), sw.c("selectWorld.warning.experimental.question")));
        } else {
            $$0.a(new etk($$5, sw.c("selectWorld.warning.deprecated.title"), sw.c("selectWorld.warning.deprecated.question")));
        }
    }

    private /* synthetic */ void a(String $$0, dyy.c $$1, aki $$2, adk $$3, euq $$4, Boolean $$5) {
        if ($$5.booleanValue()) {
            this.b.a($$0, $$1, $$2, $$3, false);
        } else {
            $$3.close();
            ezk.a($$1, $$0);
            this.b.ab().a().thenRunAsync(() -> this.b.a($$4), this.b);
        }
    }
}

