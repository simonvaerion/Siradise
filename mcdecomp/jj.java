/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hashing
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class jj {
    static final Logger a = LogUtils.getLogger();
    private static final String b = "// ";
    private final Path c;
    private final Path d;
    private final String e;
    private final Map<String, b> f;
    private final Set<String> g = new HashSet<String>();
    private final Set<Path> h = new HashSet<Path>();
    private final int i;
    private int j;

    private Path b(String $$0) {
        return this.d.resolve(Hashing.sha1().hashString((CharSequence)$$0, StandardCharsets.UTF_8).toString());
    }

    public jj(Path $$0, Collection<String> $$1, ad $$2) throws IOException {
        this.e = $$2.c();
        this.c = $$0;
        this.d = $$0.resolve(".cache");
        Files.createDirectories(this.d, new FileAttribute[0]);
        HashMap<String, b> $$3 = new HashMap<String, b>();
        int $$4 = 0;
        for (String $$5 : $$1) {
            Path $$6 = this.b($$5);
            this.h.add($$6);
            b $$7 = jj.a($$0, $$6);
            $$3.put($$5, $$7);
            $$4 += $$7.a();
        }
        this.f = $$3;
        this.i = $$4;
    }

    private static b a(Path $$0, Path $$1) {
        if (Files.isReadable($$1)) {
            try {
                return jj$b.a($$0, $$1);
            }
            catch (Exception $$2) {
                a.warn("Failed to parse cache {}, discarding", (Object)$$1, (Object)$$2);
            }
        }
        return new b("unknown", (ImmutableMap<Path, HashCode>)ImmutableMap.of());
    }

    public boolean a(String $$0) {
        b $$1 = this.f.get($$0);
        return $$1 == null || !$$1.a.equals(this.e);
    }

    public CompletableFuture<e> a(String $$0, d $$12) {
        b $$2 = this.f.get($$0);
        if ($$2 == null) {
            throw new IllegalStateException("Provider not registered: " + $$0);
        }
        a $$3 = new a($$0, this.e, $$2);
        return $$12.update($$3).thenApply($$1 -> $$3.a());
    }

    public void a(e $$0) {
        this.f.put($$0.a(), $$0.b());
        this.g.add($$0.a());
        this.j += $$0.c();
    }

    public void a() throws IOException {
        HashSet<Path> $$0 = new HashSet<Path>();
        this.f.forEach(($$1, $$2) -> {
            if (this.g.contains($$1)) {
                Path $$3 = this.b((String)$$1);
                $$2.a(this.c, $$3, DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()) + "\t" + $$1);
            }
            $$0.addAll((Collection<Path>)$$2.c().keySet());
        });
        $$0.add(this.c.resolve("version.json"));
        MutableInt $$12 = new MutableInt();
        MutableInt $$22 = new MutableInt();
        try (Stream<Path> $$32 = Files.walk(this.c, new FileVisitOption[0]);){
            $$32.forEach($$3 -> {
                if (Files.isDirectory($$3, new LinkOption[0])) {
                    return;
                }
                if (this.h.contains($$3)) {
                    return;
                }
                $$12.increment();
                if ($$0.contains($$3)) {
                    return;
                }
                try {
                    Files.delete($$3);
                }
                catch (IOException $$4) {
                    a.warn("Failed to delete file {}", $$3, (Object)$$4);
                }
                $$22.increment();
            });
        }
        a.info("Caching: total files: {}, old count: {}, new count: {}, removed stale: {}, written: {}", new Object[]{$$12, this.i, $$0.size(), $$22, this.j});
    }

    static final class b
    extends Record {
        final String a;
        private final ImmutableMap<Path, HashCode> b;

        b(String $$0, ImmutableMap<Path, HashCode> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Nullable
        public HashCode a(Path $$0) {
            return (HashCode)this.b.get((Object)$$0);
        }

        public int a() {
            return this.b.size();
        }

        public static b a(Path $$0, Path $$1) throws IOException {
            try (BufferedReader $$22 = Files.newBufferedReader($$1, StandardCharsets.UTF_8);){
                String $$3 = $$22.readLine();
                if (!$$3.startsWith(jj.b)) {
                    throw new IllegalStateException("Missing cache file header");
                }
                String[] $$4 = $$3.substring(jj.b.length()).split("\t", 2);
                String $$5 = $$4[0];
                ImmutableMap.Builder $$6 = ImmutableMap.builder();
                $$22.lines().forEach($$2 -> {
                    int $$3 = $$2.indexOf(32);
                    $$6.put((Object)$$0.resolve($$2.substring($$3 + 1)), (Object)HashCode.fromString((String)$$2.substring(0, $$3)));
                });
                b b2 = new b($$5, (ImmutableMap<Path, HashCode>)$$6.build());
                return b2;
            }
        }

        public void a(Path $$0, Path $$1, String $$2) {
            try (BufferedWriter $$3 = Files.newBufferedWriter($$1, StandardCharsets.UTF_8, new OpenOption[0]);){
                $$3.write(jj.b);
                $$3.write(this.a);
                $$3.write(9);
                $$3.write($$2);
                $$3.newLine();
                for (Map.Entry $$4 : this.b.entrySet()) {
                    $$3.write(((HashCode)$$4.getValue()).toString());
                    $$3.write(32);
                    $$3.write($$0.relativize((Path)$$4.getKey()).toString());
                    $$3.newLine();
                }
            }
            catch (IOException $$5) {
                a.warn("Unable write cachefile {}: {}", (Object)$$1, (Object)$$5);
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "version;data", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "version;data", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "version;data", "a", "b"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public ImmutableMap<Path, HashCode> c() {
            return this.b;
        }
    }

    class a
    implements jg {
        private final String c;
        private final b d;
        private final c e;
        private final AtomicInteger f = new AtomicInteger();
        private volatile boolean g;

        a(String $$0, String $$1, b $$2) {
            this.c = $$0;
            this.d = $$2;
            this.e = new c($$1);
        }

        private boolean a(Path $$0, HashCode $$1) {
            return !Objects.equals(this.d.a($$0), $$1) || !Files.exists($$0, new LinkOption[0]);
        }

        @Override
        public void writeIfNeeded(Path $$0, byte[] $$1, HashCode $$2) throws IOException {
            if (this.g) {
                throw new IllegalStateException("Cannot write to cache as it has already been closed");
            }
            if (this.a($$0, $$2)) {
                this.f.incrementAndGet();
                Files.createDirectories($$0.getParent(), new FileAttribute[0]);
                Files.write($$0, $$1, new OpenOption[0]);
            }
            this.e.a($$0, $$2);
        }

        public e a() {
            this.g = true;
            return new e(this.c, this.e.a(), this.f.get());
        }
    }

    @FunctionalInterface
    public static interface d {
        public CompletableFuture<?> update(jg var1);
    }

    public record e(String a, b b, int c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "providerId;cache;writes", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "providerId;cache;writes", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "providerId;cache;writes", "a", "b", "c"}, this, $$0);
        }
    }

    record c(String a, ConcurrentMap<Path, HashCode> b) {
        private final String a;
        private final ConcurrentMap<Path, HashCode> b;

        c(String $$0) {
            this($$0, new ConcurrentHashMap<Path, HashCode>());
        }

        public void a(Path $$0, HashCode $$1) {
            this.b.put($$0, $$1);
        }

        public b a() {
            return new b(this.a, (ImmutableMap<Path, HashCode>)ImmutableMap.copyOf(this.b));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "version;data", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "version;data", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "version;data", "a", "b"}, this, $$0);
        }

        public String b() {
            return this.a;
        }

        public ConcurrentMap<Path, HashCode> c() {
            return this.b;
        }
    }
}

