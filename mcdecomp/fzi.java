/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class fzi
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private final baa<fzh> b;
    private final bcq<Runnable> c;

    public fzi(FileChannel $$0, Executor $$1) {
        this.b = new baa<fzh>(fzh.a, $$0);
        this.c = bcq.a($$1, "telemetry-event-log");
    }

    public fzj a() {
        return $$0 -> this.c.a(() -> {
            try {
                this.b.a($$0);
            }
            catch (IOException $$1) {
                a.error("Failed to write telemetry event to log", (Throwable)$$1);
            }
        });
    }

    @Override
    public void close() {
        this.c.a(() -> IOUtils.closeQuietly(this.b));
        this.c.close();
    }
}

