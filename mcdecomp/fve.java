/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class fve {
    private final acq a;
    private final akv b;
    private final AtomicReference<ehk> c = new AtomicReference();
    private final AtomicInteger d;

    public fve(acq $$0, akv $$1, int $$2) {
        this.a = $$0;
        this.b = $$1;
        this.d = new AtomicInteger($$2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ehk a() throws IOException {
        ehk $$0 = this.c.get();
        if ($$0 == null) {
            fve fve2 = this;
            synchronized (fve2) {
                $$0 = this.c.get();
                if ($$0 == null) {
                    try (InputStream $$1 = this.b.d();){
                        $$0 = ehk.a($$1);
                        this.c.set($$0);
                    }
                    catch (IOException $$2) {
                        throw new IOException("Failed to load image " + this.a, $$2);
                    }
                }
            }
        }
        return $$0;
    }

    public void b() {
        ehk $$1;
        int $$0 = this.d.decrementAndGet();
        if ($$0 <= 0 && ($$1 = (ehk)this.c.getAndSet(null)) != null) {
            $$1.close();
        }
    }
}

