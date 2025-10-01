/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class fyy {
    private final ala a;
    private final Map<acq, CompletableFuture<egj>> b = Maps.newHashMap();

    public fyy(ala $$0) {
        this.a = $$0;
    }

    public CompletableFuture<egj> a(acq $$02) {
        return this.b.computeIfAbsent($$02, $$0 -> CompletableFuture.supplyAsync(() -> {
            try (InputStream $$1 = this.a.open((acq)$$0);){
                egj egj2;
                try (egh $$2 = new egh($$1);){
                    ByteBuffer $$3 = $$2.b();
                    egj2 = new egj($$3, $$2.a());
                }
                return egj2;
            }
            catch (IOException $$4) {
                throw new CompletionException($$4);
            }
        }, ac.f()));
    }

    public CompletableFuture<fyu> a(acq $$0, boolean $$1) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                InputStream $$2 = this.a.open($$0);
                return $$1 ? new fyw(egh::new, $$2) : new egh($$2);
            }
            catch (IOException $$3) {
                throw new CompletionException($$3);
            }
        }, ac.f());
    }

    public void a() {
        this.b.values().forEach($$0 -> $$0.thenAccept(egj::b));
        this.b.clear();
    }

    public CompletableFuture<?> a(Collection<fxv> $$02) {
        return CompletableFuture.allOf((CompletableFuture[])$$02.stream().map($$0 -> this.a($$0.b())).toArray(CompletableFuture[]::new));
    }
}

