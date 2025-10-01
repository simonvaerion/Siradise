/*
 * Decompiled with CFR 0.152.
 */
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class fzv {
    private static final int a = -1;
    private Optional<Instant> b = Optional.empty();
    private long c;
    private long d;

    public void a() {
        this.d = -1L;
        if (this.b.isEmpty()) {
            this.b = Optional.of(Instant.now());
        }
    }

    public void a(long $$0) {
        if (this.d != -1L) {
            this.c += Math.max(0L, $$0 - this.d);
        }
        this.d = $$0;
    }

    private int a(Instant $$0) {
        Duration $$1 = Duration.between($$0, Instant.now());
        return (int)$$1.toSeconds();
    }

    public void a(fzk $$0) {
        this.b.ifPresent($$12 -> $$0.send(fzl.e, $$1 -> {
            $$1.a(fzn.p, this.a((Instant)$$12));
            $$1.a(fzn.q, (int)this.c);
        }));
    }
}

