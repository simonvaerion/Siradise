/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public class epv
extends bdn {
    private static final long j = 100L;
    protected float h;
    protected long i;

    public epv(UUID $$0, sw $$1, float $$2, bdn.a $$3, bdn.b $$4, boolean $$5, boolean $$6, boolean $$7) {
        super($$0, $$1, $$3, $$4);
        this.h = $$2;
        this.b = $$2;
        this.i = ac.b();
        this.a($$5);
        this.b($$6);
        this.c($$7);
    }

    @Override
    public void a(float $$0) {
        this.b = this.k();
        this.h = $$0;
        this.i = ac.b();
    }

    @Override
    public float k() {
        long $$0 = ac.b() - this.i;
        float $$1 = apa.a((float)$$0 / 100.0f, 0.0f, 1.0f);
        return apa.i($$1, this.b, this.h);
    }
}

