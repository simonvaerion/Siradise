/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.authlib.minecraft.TelemetrySession
 *  com.mojang.authlib.minecraft.UserApiService
 *  javax.annotation.Nullable
 */
import com.google.common.base.Suppliers;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzg
implements AutoCloseable {
    private static final AtomicInteger a = new AtomicInteger(1);
    private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
        Thread $$1 = new Thread($$0);
        $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
        return $$1;
    });
    private final UserApiService c;
    private final fzo d;
    private final Path e;
    private final CompletableFuture<Optional<fzm>> f;
    private final Supplier<fzk> g = Suppliers.memoize(this::c);

    public fzg(enn $$0, UserApiService $$12, eoc $$2) {
        this.c = $$12;
        fzo.a $$3 = fzo.a();
        $$2.f().ifPresent($$1 -> $$3.a(fzn.a, $$1));
        $$2.e().ifPresent($$1 -> $$3.a(fzn.b, $$1));
        $$3.a(fzn.c, UUID.randomUUID());
        $$3.a(fzn.d, aa.b().b());
        $$3.a(fzn.e, ac.i().a());
        $$3.a(fzn.f, System.getProperty("os.name"));
        $$3.a(fzn.g, enn.d().a());
        $$3.b(fzn.h, System.getProperty("minecraft.launcher.brand"));
        this.d = $$3.a();
        this.e = $$0.p.toPath().resolve("logs/telemetry");
        this.f = fzm.a(this.e);
    }

    public fzp a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
        return new fzp(this.c(), $$0, $$1, $$2);
    }

    public fzk a() {
        return this.g.get();
    }

    private fzk c() {
        if (aa.aS) {
            return fzk.a;
        }
        TelemetrySession $$02 = this.c.newTelemetrySession(b);
        if (!$$02.isEnabled()) {
            return fzk.a;
        }
        CompletionStage $$1 = this.f.thenCompose($$0 -> $$0.map(fzm::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
        return (arg_0, arg_1) -> this.a((CompletableFuture)$$1, $$02, arg_0, arg_1);
    }

    public Path b() {
        return this.e;
    }

    @Override
    public void close() {
        this.f.thenAccept($$0 -> $$0.ifPresent(fzm::close));
    }

    private /* synthetic */ void a(CompletableFuture $$0, TelemetrySession $$1, fzl $$22, Consumer $$3) {
        if ($$22.d() && !enn.N().z()) {
            return;
        }
        fzo.a $$4 = fzo.a();
        $$4.a(this.d);
        $$4.a(fzn.m, Instant.now());
        $$4.a(fzn.l, $$22.d());
        $$3.accept($$4);
        fzh $$5 = new fzh($$22, $$4.a());
        $$0.thenAccept($$2 -> {
            if ($$2.isEmpty()) {
                return;
            }
            ((fzj)$$2.get()).log($$5);
            $$5.a($$1).send();
        });
    }
}

