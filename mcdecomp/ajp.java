/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class ajp {
    private static final Logger b = LogUtils.getLogger();
    public static Consumer<ajp> a = $$0 -> {};
    private static final Map<ajm, Path> c = (Map)ac.a(() -> {
        Class<ajo> clazz = ajo.class;
        synchronized (ajo.class) {
            ImmutableMap.Builder $$0 = ImmutableMap.builder();
            for (ajm $$1 : ajm.values()) {
                String $$2 = "/" + $$1.a() + "/.mcassetsroot";
                URL $$3 = ajo.class.getResource($$2);
                if ($$3 == null) {
                    b.error("File {} does not exist in classpath", (Object)$$2);
                    continue;
                }
                try {
                    URI $$4 = $$3.toURI();
                    String $$5 = $$4.getScheme();
                    if (!"jar".equals($$5) && !"file".equals($$5)) {
                        b.warn("Assets URL '{}' uses unexpected schema", (Object)$$4);
                    }
                    Path $$6 = ajp.a($$4);
                    $$0.put((Object)$$1, (Object)$$6.getParent());
                }
                catch (Exception $$7) {
                    b.error("Couldn't resolve path to vanilla assets", (Throwable)$$7);
                }
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return $$0.build();
        }
    });
    private final Set<Path> d = new LinkedHashSet<Path>();
    private final Map<ajm, Set<Path>> e = new EnumMap<ajm, Set<Path>>(ajm.class);
    private aji f = aji.a();
    private final Set<String> g = new HashSet<String>();

    private static Path a(URI $$0) throws IOException {
        try {
            return Paths.get($$0);
        }
        catch (FileSystemNotFoundException fileSystemNotFoundException) {
        }
        catch (Throwable $$1) {
            b.warn("Unable to get path for: {}", (Object)$$0, (Object)$$1);
        }
        try {
            FileSystems.newFileSystem($$0, Collections.emptyMap());
        }
        catch (FileSystemAlreadyExistsException fileSystemAlreadyExistsException) {
            // empty catch block
        }
        return Paths.get($$0);
    }

    private boolean b(Path $$0) {
        if (!Files.exists($$0, new LinkOption[0])) {
            return false;
        }
        if (!Files.isDirectory($$0, new LinkOption[0])) {
            throw new IllegalArgumentException("Path " + $$0.toAbsolutePath() + " is not directory");
        }
        return true;
    }

    private void c(Path $$0) {
        if (this.b($$0)) {
            this.d.add($$0);
        }
    }

    private void b(ajm $$02, Path $$1) {
        if (this.b($$1)) {
            this.e.computeIfAbsent($$02, $$0 -> new LinkedHashSet()).add($$1);
        }
    }

    public ajp a() {
        c.forEach(($$0, $$1) -> {
            this.c($$1.getParent());
            this.b((ajm)((Object)$$0), (Path)$$1);
        });
        return this;
    }

    public ajp a(ajm $$0, Class<?> $$1) {
        Enumeration<URL> $$2 = null;
        try {
            $$2 = $$1.getClassLoader().getResources($$0.a() + "/");
        }
        catch (IOException iOException) {
            // empty catch block
        }
        while ($$2 != null && $$2.hasMoreElements()) {
            URL $$3 = $$2.nextElement();
            try {
                URI $$4 = $$3.toURI();
                if (!"file".equals($$4.getScheme())) continue;
                Path $$5 = Paths.get($$4);
                this.c($$5.getParent());
                this.b($$0, $$5);
            }
            catch (Exception $$6) {
                b.error("Failed to extract path from {}", (Object)$$3, (Object)$$6);
            }
        }
        return this;
    }

    public ajp b() {
        a.accept(this);
        return this;
    }

    public ajp a(Path $$0) {
        this.c($$0);
        for (ajm $$1 : ajm.values()) {
            this.b($$1, $$0.resolve($$1.a()));
        }
        return this;
    }

    public ajp a(ajm $$0, Path $$1) {
        this.c($$1);
        this.b($$0, $$1);
        return this;
    }

    public ajp a(aji $$0) {
        this.f = $$0;
        return this;
    }

    public ajp a(String ... $$0) {
        this.g.addAll(Arrays.asList($$0));
        return this;
    }

    public ajo c() {
        EnumMap<ajm, List<Path>> $$0 = new EnumMap<ajm, List<Path>>(ajm.class);
        for (ajm $$1 : ajm.values()) {
            List<Path> $$2 = ajp.a(this.e.getOrDefault((Object)$$1, Set.of()));
            $$0.put($$1, $$2);
        }
        return new ajo(this.f, Set.copyOf(this.g), ajp.a(this.d), $$0);
    }

    private static List<Path> a(Collection<Path> $$0) {
        ArrayList<Path> $$1 = new ArrayList<Path>($$0);
        Collections.reverse($$1);
        return List.copyOf($$1);
    }
}

