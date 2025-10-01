/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class dvu {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "structures";
    private static final String c = "gameteststructures";
    private static final String d = ".nbt";
    private static final String e = ".snbt";
    private final Map<acq, Optional<dvt>> f = Maps.newConcurrentMap();
    private final DataFixer g;
    private akx h;
    private final Path i;
    private final List<b> j;
    private final hf<cpn> k;
    private static final acj l = new acj("structures", ".nbt");

    public dvu(akx $$0, dyy.c $$1, DataFixer $$2, hf<cpn> $$3) {
        this.h = $$0;
        this.g = $$2;
        this.i = $$1.a(dyw.i).normalize();
        this.k = $$3;
        ImmutableList.Builder $$4 = ImmutableList.builder();
        $$4.add((Object)new b(this::h, this::d));
        if (aa.aS) {
            $$4.add((Object)new b(this::g, this::c));
        }
        $$4.add((Object)new b(this::f, this::b));
        this.j = $$4.build();
    }

    public dvt a(acq $$0) {
        Optional<dvt> $$1 = this.b($$0);
        if ($$1.isPresent()) {
            return $$1.get();
        }
        dvt $$2 = new dvt();
        this.f.put($$0, Optional.of($$2));
        return $$2;
    }

    public Optional<dvt> b(acq $$0) {
        return this.f.computeIfAbsent($$0, this::e);
    }

    public Stream<acq> a() {
        return this.j.stream().flatMap($$0 -> $$0.b().get()).distinct();
    }

    private Optional<dvt> e(acq $$0) {
        for (b $$1 : this.j) {
            try {
                Optional<dvt> $$2 = $$1.a().apply($$0);
                if (!$$2.isPresent()) continue;
                return $$2;
            }
            catch (Exception exception) {
            }
        }
        return Optional.empty();
    }

    public void a(akx $$0) {
        this.h = $$0;
        this.f.clear();
    }

    private Optional<dvt> f(acq $$0) {
        acq $$12 = l.a($$0);
        return this.a(() -> this.h.open($$12), (Throwable $$1) -> a.error("Couldn't load structure {}", (Object)$$0, $$1));
    }

    private Stream<acq> b() {
        return l.a(this.h).keySet().stream().map(l::b);
    }

    private Optional<dvt> g(acq $$0) {
        return this.a($$0, Paths.get(c, new String[0]));
    }

    private Stream<acq> c() {
        return this.a(Paths.get(c, new String[0]), "minecraft", e);
    }

    private Optional<dvt> h(acq $$0) {
        if (!Files.isDirectory(this.i, new LinkOption[0])) {
            return Optional.empty();
        }
        Path $$12 = dvu.b(this.i, $$0, d);
        return this.a(() -> new FileInputStream($$12.toFile()), (Throwable $$1) -> a.error("Couldn't load structure from {}", (Object)$$12, $$1));
    }

    private Stream<acq> d() {
        if (!Files.isDirectory(this.i, new LinkOption[0])) {
            return Stream.empty();
        }
        try {
            return Files.list(this.i).filter($$0 -> Files.isDirectory($$0, new LinkOption[0])).flatMap($$0 -> this.a((Path)$$0));
        }
        catch (IOException $$02) {
            return Stream.empty();
        }
    }

    private Stream<acq> a(Path $$0) {
        Path $$1 = $$0.resolve(b);
        return this.a($$1, $$0.getFileName().toString(), d);
    }

    private Stream<acq> a(Path $$0, String $$12, String $$2) {
        if (!Files.isDirectory($$0, new LinkOption[0])) {
            return Stream.empty();
        }
        int $$32 = $$2.length();
        Function<String, String> $$42 = $$1 -> $$1.substring(0, $$1.length() - $$32);
        try {
            return Files.walk($$0, new FileVisitOption[0]).filter($$1 -> $$1.toString().endsWith($$2)).mapMulti(($$3, $$4) -> {
                try {
                    $$4.accept(new acq($$12, (String)$$42.apply(this.a($$0, (Path)$$3))));
                }
                catch (z $$5) {
                    a.error("Invalid location while listing pack contents", (Throwable)$$5);
                }
            });
        }
        catch (IOException $$5) {
            a.error("Failed to list folder contents", (Throwable)$$5);
            return Stream.empty();
        }
    }

    private String a(Path $$0, Path $$1) {
        return $$0.relativize($$1).toString().replace(File.separator, "/");
    }

    private Optional<dvt> a(acq $$0, Path $$1) {
        Optional<dvt> optional;
        block10: {
            if (!Files.isDirectory($$1, new LinkOption[0])) {
                return Optional.empty();
            }
            Path $$2 = v.b($$1, $$0.a(), e);
            BufferedReader $$3 = Files.newBufferedReader($$2);
            try {
                String $$4 = IOUtils.toString((Reader)$$3);
                optional = Optional.of(this.a(rd.a($$4)));
                if ($$3 == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if ($$3 != null) {
                        try {
                            $$3.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (NoSuchFileException $$5) {
                    return Optional.empty();
                }
                catch (CommandSyntaxException | IOException $$6) {
                    a.error("Couldn't load structure from {}", (Object)$$2, (Object)$$6);
                    return Optional.empty();
                }
            }
            $$3.close();
        }
        return optional;
    }

    private Optional<dvt> a(a $$0, Consumer<Throwable> $$1) {
        Optional<dvt> optional;
        block9: {
            InputStream $$2 = $$0.open();
            try {
                optional = Optional.of(this.a($$2));
                if ($$2 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            $$2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (FileNotFoundException $$3) {
                    return Optional.empty();
                }
                catch (Throwable $$4) {
                    $$1.accept($$4);
                    return Optional.empty();
                }
            }
            $$2.close();
        }
        return optional;
    }

    private dvt a(InputStream $$0) throws IOException {
        qr $$1 = rb.a($$0);
        return this.a($$1);
    }

    public dvt a(qr $$0) {
        dvt $$1 = new dvt();
        int $$2 = rd.b($$0, 500);
        $$1.a(this.k, aqc.f.a(this.g, $$0, $$2));
        return $$1;
    }

    public boolean c(acq $$0) {
        Optional<dvt> $$1 = this.f.get($$0);
        if (!$$1.isPresent()) {
            return false;
        }
        dvt $$2 = $$1.get();
        Path $$3 = dvu.b(this.i, $$0, d);
        Path $$4 = $$3.getParent();
        if ($$4 == null) {
            return false;
        }
        try {
            Files.createDirectories(Files.exists($$4, new LinkOption[0]) ? $$4.toRealPath(new LinkOption[0]) : $$4, new FileAttribute[0]);
        }
        catch (IOException $$5) {
            a.error("Failed to create parent directory: {}", (Object)$$4);
            return false;
        }
        qr $$6 = $$2.a(new qr());
        try (FileOutputStream $$7 = new FileOutputStream($$3.toFile());){
            rb.a($$6, $$7);
        }
        catch (Throwable $$8) {
            return false;
        }
        return true;
    }

    public Path a(acq $$0, String $$1) {
        return dvu.a(this.i, $$0, $$1);
    }

    public static Path a(Path $$0, acq $$1, String $$2) {
        try {
            Path $$3 = $$0.resolve($$1.b());
            Path $$4 = $$3.resolve(b);
            return v.b($$4, $$1.a(), $$2);
        }
        catch (InvalidPathException $$5) {
            throw new z("Invalid resource path: " + $$1, $$5);
        }
    }

    private static Path b(Path $$0, acq $$1, String $$2) {
        if ($$1.a().contains("//")) {
            throw new z("Invalid resource path: " + $$1);
        }
        Path $$3 = dvu.a($$0, $$1, $$2);
        if (!($$3.startsWith($$0) && v.a($$3) && v.b($$3))) {
            throw new z("Invalid resource path: " + $$3);
        }
        return $$3;
    }

    public void d(acq $$0) {
        this.f.remove($$0);
    }

    record b(Function<acq, Optional<dvt>> a, Supplier<Stream<acq>> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "loader;lister", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "loader;lister", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "loader;lister", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    static interface a {
        public InputStream open() throws IOException;
    }
}

