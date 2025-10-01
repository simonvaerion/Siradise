/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class bff {
    private static final long a = Long.MAX_VALUE;
    private long b = Long.MAX_VALUE;
    private long c;

    public void a(int $$0) {
        this.b = (long)$$0 * 1000L / 20L;
        this.c = 0L;
    }

    public void b(int $$0) {
        if (!this.c()) {
            this.a($$0);
        }
    }

    public void a(boolean $$0, int $$1) {
        if ($$0) {
            this.b($$1);
        } else {
            this.a();
        }
    }

    public void a() {
        this.b = Long.MAX_VALUE;
    }

    public void a(Consumer<bff> $$0) {
        if (this.c()) {
            $$0.accept(this);
        }
    }

    public void a(float $$0, float $$1) {
        if (!this.c()) {
            return;
        }
        long $$2 = apa.b((double)($$0 * 1000.0f / 20.0f));
        this.c += (long)((float)($$2 - this.b) * $$1);
        this.b = $$2;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.b != Long.MAX_VALUE;
    }
}

