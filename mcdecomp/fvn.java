/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.comparator.LastModifiedFileComparator
 *  org.apache.commons.io.filefilter.IOFileFilter
 *  org.apache.commons.io.filefilter.TrueFileFilter
 *  org.slf4j.Logger
 */
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.slf4j.Logger;

public class fvn
implements akk {
    private static final Logger a = LogUtils.getLogger();
    private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
    private static final int c = 0xFA00000;
    private static final int d = 10;
    private static final String e = "server";
    private static final sw f = sw.c("resourcePack.server.name");
    private static final sw g = sw.c("multiplayer.applyingPack");
    private final File h;
    private final ReentrantLock i = new ReentrantLock();
    @Nullable
    private CompletableFuture<?> j;
    @Nullable
    private akg k;

    public fvn(File $$0) {
        this.h = $$0;
    }

    @Override
    public void a(Consumer<akg> $$0) {
        if (this.k != null) {
            $$0.accept(this.k);
        }
    }

    private static Map<String, String> b() {
        return Map.of("X-Minecraft-Username", enn.N().U().c(), "X-Minecraft-UUID", enn.N().U().b(), "X-Minecraft-Version", aa.b().c(), "X-Minecraft-Version-ID", aa.b().b(), "X-Minecraft-Pack-Format", String.valueOf(aa.b().a(ajm.a)), "User-Agent", "Minecraft Java/" + aa.b().c());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public CompletableFuture<?> a(URL $$02, String $$1, boolean $$2) {
        String $$3 = Hashing.sha1().hashString((CharSequence)$$02.toString(), StandardCharsets.UTF_8).toString();
        String $$42 = b.matcher($$1).matches() ? $$1 : "";
        this.i.lock();
        try {
            CompletableFuture<?> $$10;
            enn $$5 = enn.N();
            File $$6 = new File(this.h, $$3);
            if ($$6.exists()) {
                CompletableFuture<String> $$7 = CompletableFuture.completedFuture("");
            } else {
                euo $$8 = new euo($$2);
                Map<String, String> $$9 = fvn.b();
                $$5.h(() -> $$5.a($$8));
                $$10 = aos.a($$6, $$02, $$9, 0xFA00000, $$8, $$5.W());
            }
            CompletableFuture<?> completableFuture = this.j = ((CompletableFuture)((CompletableFuture)$$10.thenCompose($$4 -> {
                if (!this.a($$42, $$6)) {
                    return CompletableFuture.failedFuture(new RuntimeException("Hash check failure for file " + $$6 + ", see log"));
                }
                $$5.execute(() -> {
                    if (!$$2) {
                        $$5.a(new etx(g));
                    }
                });
                return this.a($$6, akj.f);
            })).exceptionallyCompose($$22 -> ((CompletableFuture)this.a().thenAcceptAsync($$2 -> {
                a.warn("Pack application failed: {}, deleting file {}", (Object)$$22.getMessage(), (Object)$$6);
                fvn.a($$6);
            }, (Executor)ac.g())).thenAcceptAsync($$12 -> $$5.a(new etk($$1 -> {
                if ($$1) {
                    $$5.a((euq)null);
                } else {
                    fex $$2 = $$5.I();
                    if ($$2 != null) {
                        $$2.g().a(sw.c("connect.aborted"));
                    }
                }
            }, sw.c("multiplayer.texturePrompt.failure.line1"), sw.c("multiplayer.texturePrompt.failure.line2"), sv.i, sw.c("menu.disconnect"))), (Executor)$$5))).thenAcceptAsync($$0 -> this.c(), (Executor)ac.g());
            return completableFuture;
        }
        finally {
            this.i.unlock();
        }
    }

    private static void a(File $$0) {
        try {
            Files.delete($$0.toPath());
        }
        catch (IOException $$1) {
            a.warn("Failed to delete file {}: {}", (Object)$$0, (Object)$$1.getMessage());
        }
    }

    public CompletableFuture<Void> a() {
        this.i.lock();
        try {
            if (this.j != null) {
                this.j.cancel(true);
            }
            this.j = null;
            if (this.k != null) {
                this.k = null;
                CompletableFuture<Void> completableFuture = enn.N().O();
                return completableFuture;
            }
        }
        finally {
            this.i.unlock();
        }
        return CompletableFuture.completedFuture(null);
    }

    private boolean a(String $$0, File $$1) {
        try {
            String $$2 = com.google.common.io.Files.asByteSource((File)$$1).hash(Hashing.sha1()).toString();
            if ($$0.isEmpty()) {
                a.info("Found file {} without verification hash", (Object)$$1);
                return true;
            }
            if ($$2.toLowerCase(Locale.ROOT).equals($$0.toLowerCase(Locale.ROOT))) {
                a.info("Found file {} matching requested hash {}", (Object)$$1, (Object)$$0);
                return true;
            }
            a.warn("File {} had wrong hash (expected {}, found {}).", new Object[]{$$1, $$0, $$2});
        }
        catch (IOException $$3) {
            a.warn("File {} couldn't be hashed.", (Object)$$1, (Object)$$3);
        }
        return false;
    }

    private void c() {
        if (!this.h.isDirectory()) {
            return;
        }
        try {
            ArrayList $$0 = new ArrayList(FileUtils.listFiles((File)this.h, (IOFileFilter)TrueFileFilter.TRUE, null));
            $$0.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            int $$1 = 0;
            for (File $$2 : $$0) {
                if ($$1++ < 10) continue;
                a.info("Deleting old server resource pack {}", (Object)$$2.getName());
                FileUtils.deleteQuietly((File)$$2);
            }
        }
        catch (Exception $$3) {
            a.error("Error while deleting old server resource pack : {}", (Object)$$3.getMessage());
        }
    }

    public CompletableFuture<Void> a(File $$0, akj $$12) {
        akg.c $$2 = $$1 -> new ajk($$1, $$0, false);
        akg.a $$3 = akg.a(e, $$2);
        if ($$3 == null) {
            return CompletableFuture.failedFuture(new IllegalArgumentException("Invalid pack metadata at " + $$0));
        }
        a.info("Applying server pack {}", (Object)$$0);
        this.k = akg.a(e, f, true, $$2, $$3, ajm.a, akg.b.a, true, $$12);
        return enn.N().O();
    }

    public CompletableFuture<Void> a(dyy.c $$0) {
        Path $$1 = $$0.a(dyw.k);
        if (Files.exists($$1, new LinkOption[0]) && !Files.isDirectory($$1, new LinkOption[0])) {
            return this.a($$1.toFile(), akj.e);
        }
        return CompletableFuture.completedFuture(null);
    }
}

