/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aiq
implements aio {
    private static final Logger a = LogUtils.getLogger();
    private final int b;
    private int c;
    private long d;
    private long e = Long.MAX_VALUE;

    public aiq(int $$0) {
        int $$1 = $$0 * 2 + 1;
        this.b = $$1 * $$1;
    }

    @Override
    public void a(clt $$0) {
        this.d = this.e = ac.b();
    }

    @Override
    public void a(clt $$0, @Nullable dec $$1) {
        if ($$1 == dec.n) {
            ++this.c;
        }
        int $$2 = this.c();
        if (ac.b() > this.e) {
            this.e += 500L;
            a.info(sw.a("menu.preparingSpawn", apa.a($$2, 0, 100)).getString());
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        a.info("Time elapsed: {} ms", (Object)(ac.b() - this.d));
        this.e = Long.MAX_VALUE;
    }

    public int c() {
        return apa.d((float)this.c * 100.0f / (float)this.b);
    }
}

