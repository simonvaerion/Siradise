/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class apu {
    private static final Logger a = LogUtils.getLogger();
    private final String b;
    private final Semaphore c = new Semaphore(1);
    private final Lock d = new ReentrantLock();
    @Nullable
    private volatile Thread e;
    @Nullable
    private volatile y f;

    public apu(String $$0) {
        this.b = $$0;
    }

    public void a() {
        block6: {
            boolean $$0 = false;
            try {
                this.d.lock();
                if (this.c.tryAcquire()) break block6;
                this.e = Thread.currentThread();
                $$0 = true;
                this.d.unlock();
                try {
                    this.c.acquire();
                }
                catch (InterruptedException $$1) {
                    Thread.currentThread().interrupt();
                }
                throw this.f;
            }
            finally {
                if (!$$0) {
                    this.d.unlock();
                }
            }
        }
    }

    public void b() {
        try {
            this.d.lock();
            Thread $$0 = this.e;
            if ($$0 != null) {
                y $$1;
                this.f = $$1 = apu.a(this.b, $$0);
                this.c.release();
                throw $$1;
            }
            this.c.release();
        }
        finally {
            this.d.unlock();
        }
    }

    public static y a(String $$0, @Nullable Thread $$1) {
        String $$2 = Stream.of(Thread.currentThread(), $$1).filter(Objects::nonNull).map(apu::a).collect(Collectors.joining("\n"));
        String $$3 = "Accessing " + $$0 + " from multiple threads";
        o $$4 = new o($$3, new IllegalStateException($$3));
        p $$5 = $$4.a("Thread dumps");
        $$5.a("Thread dumps", $$2);
        a.error("Thread dumps: \n" + $$2);
        return new y($$4);
    }

    private static String a(Thread $$0) {
        return $$0.getName() + ": \n\tat " + Arrays.stream($$0.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat "));
    }
}

