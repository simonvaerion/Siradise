/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class fvw
implements akr,
AutoCloseable {
    private final fuu a;
    private final acq b;

    public fvw(fuw $$0, acq $$1, acq $$2) {
        this.b = $$2;
        this.a = new fuu($$1);
        $$0.a(this.a.g(), this.a);
    }

    protected fuv a(acq $$0) {
        return this.a.a($$0);
    }

    @Override
    public final CompletableFuture<Void> a(akr.a $$0, akx $$12, ban $$2, ban $$3, Executor $$4, Executor $$5) {
        return ((CompletableFuture)((CompletableFuture)fuq.a(this.a).a($$12, this.b, 0, $$4).thenCompose(fuq.a::a)).thenCompose($$0::a)).thenAcceptAsync($$1 -> this.a((fuq.a)$$1, $$3), $$5);
    }

    private void a(fuq.a $$0, ban $$1) {
        $$1.a();
        $$1.a("upload");
        this.a.a($$0);
        $$1.c();
        $$1.b();
    }

    @Override
    public void close() {
        this.a.f();
    }
}

