/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dgi<T extends dgn> {
    private final T a;
    @Nullable
    private hx b;

    public dgi(T $$0) {
        this.a = $$0;
    }

    public void a(aif $$0) {
        this.c($$0);
    }

    public T a() {
        return this.a;
    }

    public void b(aif $$02) {
        dgi.a($$02, this.b, $$0 -> $$0.b((dgn)this.a));
    }

    public void c(aif $$0) {
        this.a.a().a($$0).map(hx::a).ifPresent($$1 -> {
            if (this.b == null || !this.b.equals($$1)) {
                dgi.a($$0, this.b, $$0 -> $$0.b((dgn)this.a));
                this.b = $$1;
                dgi.a($$0, this.b, $$0 -> $$0.a((dgn)this.a));
            }
        });
    }

    private static void a(cmp $$0, @Nullable hx $$1, Consumer<dgo> $$2) {
        if ($$1 == null) {
            return;
        }
        ddx $$3 = $$0.a($$1.a(), $$1.c(), dec.n, false);
        if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
        }
    }
}

