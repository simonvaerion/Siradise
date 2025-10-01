/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.JsonOps
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class md
implements ji {
    private static final Logger d = LogUtils.getLogger();
    private final jk e;
    private final CompletableFuture<hg.b> f;

    public md(jk $$0, CompletableFuture<hg.b> $$1) {
        this.f = $$1;
        this.e = $$0;
    }

    @Override
    public CompletableFuture<?> a(jg $$0) {
        return this.f.thenCompose($$1 -> {
            aco $$2 = aco.a(JsonOps.INSTANCE, $$1);
            return CompletableFuture.allOf((CompletableFuture[])acl.a.stream().flatMap($$3 -> this.a($$0, (hg.b)$$1, $$2, (acl.b)$$3).stream()).toArray(CompletableFuture[]::new));
        });
    }

    private <T> Optional<CompletableFuture<?>> a(jg $$0, hg.b $$1, DynamicOps<JsonElement> $$2, acl.b<T> $$3) {
        acp $$4 = $$3.a();
        return $$1.a($$4).map($$42 -> {
            jk.a $$5 = this.e.a(jk.b.a, $$4.a().a());
            return CompletableFuture.allOf((CompletableFuture[])$$42.b().map($$4 -> md.a($$5.a($$4.g().a()), $$0, $$2, $$3.b(), $$4.a())).toArray(CompletableFuture[]::new));
        });
    }

    private static <E> CompletableFuture<?> a(Path $$0, jg $$12, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
        Optional $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1 -> d.error("Couldn't serialize element {}: {}", (Object)$$0, $$1));
        if ($$5.isPresent()) {
            return ji.a($$12, (JsonElement)$$5.get(), $$0);
        }
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public final String a() {
        return "Registries";
    }
}

