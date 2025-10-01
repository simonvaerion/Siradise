/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akf
implements akk {
    private static final Logger a = LogUtils.getLogger();
    private final Path b;
    private final ajm c;
    private final akj d;

    public akf(Path $$0, ajm $$1, akj $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    private static String a(Path $$0) {
        return $$0.getFileName().toString();
    }

    @Override
    public void a(Consumer<akg> $$0) {
        try {
            v.c(this.b);
            akf.a(this.b, false, (Path $$1, akg.c $$2) -> {
                String $$3 = akf.a($$1);
                akg $$4 = akg.a("file/" + $$3, sw.b($$3), false, $$2, this.c, akg.b.a, this.d);
                if ($$4 != null) {
                    $$0.accept($$4);
                }
            });
        }
        catch (IOException $$12) {
            a.warn("Failed to list packs in {}", (Object)this.b, (Object)$$12);
        }
    }

    public static void a(Path $$0, boolean $$1, BiConsumer<Path, akg.c> $$2) throws IOException {
        try (DirectoryStream<Path> $$3 = Files.newDirectoryStream($$0);){
            for (Path $$4 : $$3) {
                akg.c $$5 = akf.a($$4, $$1);
                if ($$5 == null) continue;
                $$2.accept($$4, $$5);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static akg.c a(Path $$0, boolean $$1) {
        FileSystem $$6;
        void $$5;
        try {
            BasicFileAttributes $$22 = Files.readAttributes($$0, BasicFileAttributes.class, new LinkOption[0]);
        }
        catch (NoSuchFileException $$3) {
            return null;
        }
        catch (IOException $$4) {
            a.warn("Failed to read properties of '{}', ignoring", (Object)$$0, (Object)$$4);
            return null;
        }
        if ($$5.isDirectory() && Files.isRegularFile($$0.resolve("pack.mcmeta"), new LinkOption[0])) {
            return $$2 -> new ajn($$2, $$0, $$1);
        }
        if ($$5.isRegularFile() && $$0.getFileName().toString().endsWith(".zip") && (($$6 = $$0.getFileSystem()) == FileSystems.getDefault() || $$6 instanceof aju)) {
            File $$7 = $$0.toFile();
            return $$2 -> new ajk($$2, $$7, $$1);
        }
        a.info("Found non-pack entry '{}', ignoring", (Object)$$0);
        return null;
    }
}

