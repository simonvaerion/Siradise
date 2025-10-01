/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class mu
extends mt<cfu> {
    private final CompletableFuture<my.c<cpn>> d;
    private final Map<anl<cpn>, anl<cfu>> g = new HashMap<anl<cpn>, anl<cfu>>();

    public mu(jk $$02, CompletableFuture<hg.b> $$1, CompletableFuture<my.c<cpn>> $$2) {
        super($$02, jc.D, $$1, (T $$0) -> $$0.j().g());
        this.d = $$2;
    }

    public mu(jk $$02, CompletableFuture<hg.b> $$1, CompletableFuture<my.c<cfu>> $$2, CompletableFuture<my.c<cpn>> $$3) {
        super($$02, jc.D, $$1, $$2, $$0 -> $$0.j().g());
        this.d = $$3;
    }

    protected void a(anl<cpn> $$0, anl<cfu> $$1) {
        this.g.put($$0, $$1);
    }

    @Override
    protected CompletableFuture<hg.b> b() {
        return super.b().thenCombineAsync(this.d, ($$0, $$12) -> {
            this.g.forEach(($$1, $$2) -> {
                ani $$3 = this.c($$2);
                Optional $$4 = (Optional)$$12.apply($$1);
                ((ani)$$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b()))).b().forEach($$3::a);
            });
            return $$0;
        });
    }
}

