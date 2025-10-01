/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ajn
extends ajh {
    private static final Logger a = LogUtils.getLogger();
    private static final Joiner d = Joiner.on((String)"/");
    private final Path e;

    public ajn(String $$0, Path $$1, boolean $$2) {
        super($$0, $$2);
        this.e = $$1;
    }

    @Override
    @Nullable
    public akp<InputStream> a(String ... $$0) {
        v.a($$0);
        Path $$1 = v.a(this.e, List.of($$0));
        if (Files.exists($$1, new LinkOption[0])) {
            return akp.create($$1);
        }
        return null;
    }

    public static boolean a(Path $$0) {
        return true;
    }

    @Override
    @Nullable
    public akp<InputStream> a(ajm $$0, acq $$1) {
        Path $$2 = this.e.resolve($$0.a()).resolve($$1.b());
        return ajn.a($$1, $$2);
    }

    public static akp<InputStream> a(acq $$0, Path $$12) {
        return (akp)v.c($$0.a()).get().map($$1 -> {
            Path $$2 = v.a($$12, $$1);
            return ajn.b($$2);
        }, $$1 -> {
            a.error("Invalid path {}: {}", (Object)$$0, (Object)$$1.message());
            return null;
        });
    }

    @Nullable
    private static akp<InputStream> b(Path $$0) {
        if (Files.exists($$0, new LinkOption[0]) && ajn.a($$0)) {
            return akp.create($$0);
        }
        return null;
    }

    @Override
    public void a(ajm $$0, String $$12, String $$2, ajl.a $$32) {
        v.c($$2).get().ifLeft($$3 -> {
            Path $$4 = this.e.resolve($$0.a()).resolve($$12);
            ajn.a($$12, $$4, $$3, $$32);
        }).ifRight($$1 -> a.error("Invalid path {}: {}", (Object)$$2, (Object)$$1.message()));
    }

    public static void a(String $$02, Path $$12, List<String> $$2, ajl.a $$32) {
        Path $$4 = v.a($$12, $$2);
        try (Stream<Path> $$52 = Files.find($$4, Integer.MAX_VALUE, ($$0, $$1) -> $$1.isRegularFile(), new FileVisitOption[0]);){
            $$52.forEach($$3 -> {
                String $$4 = d.join((Iterable)$$12.relativize((Path)$$3));
                acq $$5 = acq.a($$02, $$4);
                if ($$5 == null) {
                    ac.a(String.format(Locale.ROOT, "Invalid path in pack: %s:%s, ignoring", $$02, $$4));
                } else {
                    $$32.accept($$5, akp.create($$3));
                }
            });
        }
        catch (NoSuchFileException $$52) {
        }
        catch (IOException $$6) {
            a.error("Failed to list path {}", (Object)$$4, (Object)$$6);
        }
    }

    @Override
    public Set<String> a(ajm $$0) {
        HashSet $$1 = Sets.newHashSet();
        Path $$2 = this.e.resolve($$0.a());
        try (DirectoryStream<Path> $$32 = Files.newDirectoryStream($$2);){
            for (Path $$4 : $$32) {
                String $$5 = $$4.getFileName().toString();
                if ($$5.equals($$5.toLowerCase(Locale.ROOT))) {
                    $$1.add($$5);
                    continue;
                }
                a.warn("Ignored non-lowercase namespace: {} in {}", (Object)$$5, (Object)this.e);
            }
        }
        catch (NoSuchFileException $$32) {
        }
        catch (IOException $$6) {
            a.error("Failed to list path {}", (Object)$$2, (Object)$$6);
        }
        return $$1;
    }

    @Override
    public void close() {
    }
}

