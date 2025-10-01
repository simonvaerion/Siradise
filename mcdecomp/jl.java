/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class jl
implements ji {
    private final jk.a d;
    private final List<jm> e;
    private final CompletableFuture<hg.b> f;

    public jl(jk $$0, CompletableFuture<hg.b> $$1, List<jm> $$2) {
        this.d = $$0.a(jk.b.a, "advancements");
        this.e = $$2;
        this.f = $$1;
    }

    @Override
    public CompletableFuture<?> a(jg $$0) {
        return this.f.thenCompose($$1 -> {
            HashSet $$2 = new HashSet();
            ArrayList $$32 = new ArrayList();
            Consumer<ae> $$4 = $$3 -> {
                if (!$$2.add($$3.j())) {
                    throw new IllegalStateException("Duplicate advancement " + $$3.j());
                }
                Path $$4 = this.d.a($$3.j());
                $$32.add(ji.a($$0, (JsonElement)$$3.a().c(), $$4));
            };
            for (jm $$5 : this.e) {
                $$5.a((hg.b)$$1, $$4);
            }
            return CompletableFuture.allOf((CompletableFuture[])$$32.toArray(CompletableFuture[]::new));
        });
    }

    @Override
    public final String a() {
        return "Advancements";
    }
}

