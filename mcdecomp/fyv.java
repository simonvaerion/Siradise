/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fyv {
    private final Set<a> a = Sets.newIdentityHashSet();
    final egf b;
    final Executor c;

    public fyv(egf $$0, Executor $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public CompletableFuture<a> a(egf.c $$0) {
        CompletableFuture<a> $$1 = new CompletableFuture<a>();
        this.c.execute(() -> {
            ege $$2 = this.b.a($$0);
            if ($$2 != null) {
                a $$3 = new a($$2);
                this.a.add($$3);
                $$1.complete($$3);
            } else {
                $$1.complete(null);
            }
        });
        return $$1;
    }

    public void a(Consumer<Stream<ege>> $$0) {
        this.c.execute(() -> $$0.accept(this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull)));
    }

    public void a() {
        this.c.execute(() -> {
            Iterator<a> $$0 = this.a.iterator();
            while ($$0.hasNext()) {
                a $$1 = $$0.next();
                $$1.b.j();
                if (!$$1.b.h()) continue;
                $$1.b();
                $$0.remove();
            }
        });
    }

    public void b() {
        this.a.forEach(a::b);
        this.a.clear();
    }

    public class a {
        @Nullable
        ege b;
        private boolean c;

        public boolean a() {
            return this.c;
        }

        public a(ege $$1) {
            this.b = $$1;
        }

        public void a(Consumer<ege> $$0) {
            fyv.this.c.execute(() -> {
                if (this.b != null) {
                    $$0.accept(this.b);
                }
            });
        }

        public void b() {
            this.c = true;
            fyv.this.b.a(this.b);
            this.b = null;
        }
    }
}

