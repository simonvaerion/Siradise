/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class fun
extends fuo {
    @Nullable
    private CompletableFuture<fuo.a> f;

    public fun(akx $$0, acq $$1, Executor $$2) {
        super($$1);
        this.f = CompletableFuture.supplyAsync(() -> fuo.a.a($$0, $$1), $$2);
    }

    @Override
    protected fuo.a b(akx $$0) {
        if (this.f != null) {
            fuo.a $$1 = this.f.join();
            this.f = null;
            return $$1;
        }
        return fuo.a.a($$0, this.e);
    }

    public CompletableFuture<Void> d() {
        return this.f == null ? CompletableFuture.completedFuture(null) : this.f.thenApply($$0 -> null);
    }

    @Override
    public void a(fuw $$0, akx $$1, acq $$2, Executor $$3) {
        this.f = CompletableFuture.supplyAsync(() -> fuo.a.a($$1, this.e), ac.f());
        this.f.thenRunAsync(() -> $$0.a(this.e, (fug)this), fun.a($$3));
    }

    private static Executor a(Executor $$0) {
        return $$1 -> $$0.execute(() -> RenderSystem.recordRenderCall($$1::run));
    }
}

