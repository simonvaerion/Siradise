/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class bav {
    private static final Logger a = LogUtils.getLogger();
    private final Runnable b;

    protected bav(Runnable $$0) {
        this.b = $$0;
    }

    /*
     * WARNING - void declaration
     */
    public void a(@Nullable Path $$0) {
        if ($$0 == null) {
            return;
        }
        this.b.run();
        bav.a(() -> "Dumped flight recorder profiling to " + $$0);
        try {
            bbc $$1 = bbb.a($$0);
        }
        catch (Throwable $$2) {
            bav.a(() -> "Failed to parse JFR recording", $$2);
            return;
        }
        try {
            void $$3;
            bav.a(((bbc)$$3)::b);
            Path $$4 = $$0.resolveSibling("jfr-report-" + StringUtils.substringBefore((String)$$0.getFileName().toString(), (String)".jfr") + ".json");
            Files.writeString($$4, (CharSequence)$$3.b(), StandardOpenOption.CREATE);
            bav.a(() -> "Dumped recording summary to " + $$4);
        }
        catch (Throwable $$5) {
            bav.a(() -> "Failed to output JFR report", $$5);
        }
    }

    private static void a(Supplier<String> $$0) {
        if (LogUtils.isLoggerActive()) {
            a.info($$0.get());
        } else {
            acs.a($$0.get());
        }
    }

    private static void a(Supplier<String> $$0, Throwable $$1) {
        if (LogUtils.isLoggerActive()) {
            a.warn($$0.get(), $$1);
        } else {
            acs.a($$0.get());
            $$1.printStackTrace(acs.a);
        }
    }
}

