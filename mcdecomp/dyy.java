/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyy {
    static final Logger b = LogUtils.getLogger();
    static final DateTimeFormatter c = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral('_').appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral('-').appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendLiteral('-').appendValue(ChronoField.SECOND_OF_MINUTE, 2).toFormatter();
    private static final ImmutableList<String> d = ImmutableList.of((Object)"RandomSeed", (Object)"generatorName", (Object)"generatorOptions", (Object)"generatorVersion", (Object)"legacy_custom_options", (Object)"MapFeatures", (Object)"BonusChest");
    private static final String e = "Data";
    private static final eea f = new eea(List.of());
    public static final String a = "allowed_symlinks.txt";
    private final Path g;
    private final Path h;
    final DataFixer i;
    private final edy j;

    public dyy(Path $$0, Path $$1, edy $$2, DataFixer $$3) {
        this.i = $$3;
        try {
            v.c($$0);
        }
        catch (IOException $$4) {
            throw new UncheckedIOException($$4);
        }
        this.g = $$0;
        this.h = $$1;
        this.j = $$2;
    }

    public static edy a(Path $$0) {
        if (Files.exists($$0, new LinkOption[0])) {
            edy edy2;
            block9: {
                BufferedReader $$1 = Files.newBufferedReader($$0);
                try {
                    edy2 = new edy(eea.a($$1));
                    if ($$1 == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if ($$1 != null) {
                            try {
                                $$1.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (Exception $$2) {
                        b.error("Failed to parse {}, disallowing all symbolic links", (Object)a, (Object)$$2);
                    }
                }
                $$1.close();
            }
            return edy2;
        }
        return new edy(f);
    }

    public static dyy b(Path $$0) {
        edy $$1 = dyy.a($$0.resolve(a));
        return new dyy($$0, $$0.resolve("../backups"), $$1, aqd.a());
    }

    private static <T> DataResult<dig> a(Dynamic<T> $$0, DataFixer $$1, int $$2) {
        Dynamic $$3 = $$0.get("WorldGenSettings").orElseEmptyMap();
        for (String $$4 : d) {
            Optional $$5 = $$0.get($$4).result();
            if (!$$5.isPresent()) continue;
            $$3 = $$3.set($$4, (Dynamic)$$5.get());
        }
        Dynamic $$6 = aqc.k.a($$1, $$3, $$2);
        return dig.a.parse($$6);
    }

    private static cnf a(Dynamic<?> $$0) {
        return cnf.b.parse($$0).resultOrPartial(arg_0 -> ((Logger)b).error(arg_0)).orElse(cnf.c);
    }

    public String a() {
        return "Anvil";
    }

    public a b() throws dyx {
        a a2;
        block9: {
            if (!Files.isDirectory(this.g, new LinkOption[0])) {
                throw new dyx(sw.c("selectWorld.load_folder_access"));
            }
            Stream<Path> $$02 = Files.list(this.g);
            try {
                List<b> $$1 = $$02.filter($$0 -> Files.isDirectory($$0, new LinkOption[0])).map(b::new).filter($$0 -> Files.isRegularFile($$0.b(), new LinkOption[0]) || Files.isRegularFile($$0.c(), new LinkOption[0])).toList();
                a2 = new a($$1);
                if ($$02 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if ($$02 != null) {
                        try {
                            $$02.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$2) {
                    throw new dyx(sw.c("selectWorld.load_folder_access"));
                }
            }
            $$02.close();
        }
        return a2;
    }

    public CompletableFuture<List<dyz>> a(a $$02) {
        ArrayList<CompletableFuture<dyz>> $$1 = new ArrayList<CompletableFuture<dyz>>($$02.a.size());
        for (b $$2 : $$02.a) {
            $$1.add(CompletableFuture.supplyAsync(() -> {
                try {
                    boolean $$1 = aog.b($$2.f());
                }
                catch (Exception $$2) {
                    b.warn("Failed to read {} lock", (Object)$$2.f(), (Object)$$2);
                    return null;
                }
                try {
                    void $$3;
                    dyz $$4 = this.a($$2, this.a($$2, (boolean)$$3));
                    if ($$4 != null) {
                        return $$4;
                    }
                }
                catch (OutOfMemoryError $$5) {
                    aoy.b();
                    System.gc();
                    b.error(LogUtils.FATAL_MARKER, "Ran out of memory trying to read summary of {}", (Object)$$2.a());
                    throw $$5;
                }
                catch (StackOverflowError $$6) {
                    b.error(LogUtils.FATAL_MARKER, "Ran out of stack trying to read summary of {}. Assuming corruption; attempting to restore from from level.dat_old.", (Object)$$2.a());
                    ac.a($$2.b(), $$2.c(), $$2.a(LocalDateTime.now()), true);
                    throw $$6;
                }
                return null;
            }, ac.f()));
        }
        return ac.d($$1).thenApply($$0 -> $$0.stream().filter(Objects::nonNull).sorted().toList());
    }

    private int f() {
        return 19133;
    }

    @Nullable
    <T> T a(b $$0, BiFunction<Path, DataFixer, T> $$1) {
        T $$3;
        if (!Files.exists($$0.f(), new LinkOption[0])) {
            return null;
        }
        Path $$2 = $$0.b();
        if (Files.exists($$2, new LinkOption[0]) && ($$3 = $$1.apply($$2, this.i)) != null) {
            return $$3;
        }
        $$2 = $$0.c();
        if (Files.exists($$2, new LinkOption[0])) {
            return $$1.apply($$2, this.i);
        }
        return null;
    }

    @Nullable
    private static cnf a(Path $$0, DataFixer $$1) {
        try {
            rk $$2 = dyy.c($$0);
            if ($$2 instanceof qr) {
                qr $$3 = (qr)$$2;
                qr $$4 = $$3.p(e);
                int $$5 = rd.b($$4, -1);
                Dynamic $$6 = aqc.a.a($$1, new Dynamic((DynamicOps)rc.a, (Object)$$4), $$5);
                return dyy.a($$6);
            }
        }
        catch (Exception $$7) {
            b.error("Exception reading {}", (Object)$$0, (Object)$$7);
        }
        return null;
    }

    static BiFunction<Path, DataFixer, Pair<dze, dif.b>> a(DynamicOps<rk> $$0, cnf $$1, hr<dfl> $$2, Lifecycle $$3) {
        return ($$4, $$5) -> {
            void $$8;
            try {
                qr $$6 = rb.a($$4.toFile());
            }
            catch (IOException $$7) {
                throw new UncheckedIOException($$7);
            }
            qr $$9 = $$8.p(e);
            qr $$10 = $$9.b("Player", 10) ? $$9.p("Player") : null;
            $$9.r("Player");
            int $$11 = rd.b($$9, -1);
            Dynamic $$12 = aqc.a.a((DataFixer)$$5, new Dynamic($$0, (Object)$$9), $$11);
            dig $$13 = (dig)dyy.a($$12, $$5, $$11).getOrThrow(false, ac.a("WorldGenSettings: ", arg_0 -> ((Logger)b).error(arg_0)));
            dza $$14 = dza.a($$12);
            cmq $$15 = cmq.a($$12, $$1);
            dif.b $$16 = $$13.b().a($$2);
            Lifecycle $$17 = $$16.a().add($$3);
            dzc $$18 = dzc.a($$12, $$5, $$11, $$10, $$15, $$14, $$16.d(), $$13.a(), $$17);
            return Pair.of((Object)$$18, (Object)$$16);
        };
    }

    BiFunction<Path, DataFixer, dyz> a(b $$0, boolean $$1) {
        return ($$2, $$3) -> {
            try {
                rk $$5;
                if (Files.isSymbolicLink($$2)) {
                    ArrayList<edz> $$4 = new ArrayList<edz>();
                    this.j.a((Path)$$2, (List<edz>)$$4);
                    if (!$$4.isEmpty()) {
                        b.warn(edx.a($$2, $$4));
                        return new dyz.b($$0.a(), $$0.d());
                    }
                }
                if (($$5 = dyy.c($$2)) instanceof qr) {
                    int $$8;
                    qr $$6 = (qr)$$5;
                    qr $$7 = $$6.p(e);
                    Dynamic $$9 = aqc.a.a((DataFixer)$$3, new Dynamic((DynamicOps)rc.a, (Object)$$7), $$8 = rd.b($$7, -1));
                    dza $$10 = dza.a($$9);
                    int $$11 = $$10.a();
                    if ($$11 == 19132 || $$11 == 19133) {
                        boolean $$12 = $$11 != this.f();
                        Path $$13 = $$0.d();
                        cnf $$14 = dyy.a($$9);
                        cmq $$15 = cmq.a($$9, $$14);
                        caw $$16 = dyy.b($$9);
                        boolean $$17 = cay.a($$16);
                        return new dyz($$15, $$10, $$0.a(), $$12, $$1, $$17, $$13);
                    }
                } else {
                    b.warn("Invalid root tag in {}", $$2);
                }
                return null;
            }
            catch (Exception $$18) {
                b.error("Exception reading {}", $$2, (Object)$$18);
                return null;
            }
        };
    }

    private static caw b(Dynamic<?> $$02) {
        Set<acq> $$1 = $$02.get("enabled_features").asStream().flatMap($$0 -> $$0.asString().result().map(acq::a).stream()).collect(Collectors.toSet());
        return cay.c.a($$1, (acq $$0) -> {});
    }

    @Nullable
    private static rk c(Path $$0) throws IOException {
        rw $$1 = new rw(new rt(e, qr.b, "Player"), new rt(e, qr.b, "WorldGenSettings"));
        rb.a($$0.toFile(), (rh)$$1);
        return $$1.d();
    }

    public boolean a(String $$0) {
        try {
            Path $$1 = this.e($$0);
            Files.createDirectory($$1, new FileAttribute[0]);
            Files.deleteIfExists($$1);
            return true;
        }
        catch (IOException $$2) {
            return false;
        }
    }

    public boolean b(String $$0) {
        return Files.isDirectory(this.e($$0), new LinkOption[0]);
    }

    private Path e(String $$0) {
        return this.g.resolve($$0);
    }

    public Path c() {
        return this.g;
    }

    public Path d() {
        return this.h;
    }

    public c c(String $$0) throws IOException, edx {
        Path $$1 = this.e($$0);
        List<edz> $$2 = this.j.a($$1, true);
        if (!$$2.isEmpty()) {
            throw new edx($$1, $$2);
        }
        return new c($$0, $$1);
    }

    public c d(String $$0) throws IOException {
        Path $$1 = this.e($$0);
        return new c($$0, $$1);
    }

    public edy e() {
        return this.j;
    }

    public static final class a
    extends Record
    implements Iterable<b> {
        final List<b> a;

        public a(List<b> $$0) {
            this.a = $$0;
        }

        public boolean a() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator<b> iterator() {
            return this.a.iterator();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "levels", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "levels", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "levels", "a"}, this, $$0);
        }

        public List<b> b() {
            return this.a;
        }
    }

    public record b(Path a) {
        private final Path a;

        public String a() {
            return this.a.getFileName().toString();
        }

        public Path b() {
            return this.a(dyw.e);
        }

        public Path c() {
            return this.a(dyw.f);
        }

        public Path a(LocalDateTime $$0) {
            return this.a.resolve(dyw.e.a() + "_corrupted_" + $$0.format(c));
        }

        public Path d() {
            return this.a(dyw.g);
        }

        public Path e() {
            return this.a(dyw.h);
        }

        public Path a(dyw $$0) {
            return this.a.resolve($$0.a());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "path", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "path", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "path", "a"}, this, $$0);
        }

        public Path f() {
            return this.a;
        }
    }

    public class c
    implements AutoCloseable {
        final aog b;
        final b c;
        private final String d;
        private final Map<dyw, Path> e = Maps.newHashMap();

        c(String $$1, Path $$2) throws IOException {
            this.d = $$1;
            this.c = new b($$2);
            this.b = aog.a($$2);
        }

        public String a() {
            return this.d;
        }

        public Path a(dyw $$0) {
            return this.e.computeIfAbsent($$0, this.c::a);
        }

        public Path a(acp<cmm> $$0) {
            return dfk.a($$0, this.c.f());
        }

        private void h() {
            if (!this.b.a()) {
                throw new IllegalStateException("Lock is no longer valid");
            }
        }

        public dzb b() {
            this.h();
            return new dzb(this, dyy.this.i);
        }

        @Nullable
        public dyz c() {
            this.h();
            return dyy.this.a(this.c, dyy.this.a(this.c, false));
        }

        @Nullable
        public Pair<dze, dif.b> a(DynamicOps<rk> $$0, cnf $$1, hr<dfl> $$2, Lifecycle $$3) {
            this.h();
            return dyy.this.a(this.c, dyy.a($$0, $$1, $$2, $$3));
        }

        @Nullable
        public cnf d() {
            this.h();
            return dyy.this.a(this.c, dyy::a);
        }

        public void a(hs $$0, dze $$1) {
            this.a($$0, $$1, null);
        }

        public void a(hs $$0, dze $$1, @Nullable qr $$2) {
            File $$3 = this.c.f().toFile();
            qr $$4 = $$1.a($$0, $$2);
            qr $$5 = new qr();
            $$5.a(dyy.e, $$4);
            try {
                File $$6 = File.createTempFile("level", ".dat", $$3);
                rb.a($$5, $$6);
                File $$7 = this.c.c().toFile();
                File $$8 = this.c.b().toFile();
                ac.a($$8, $$6, $$7);
            }
            catch (Exception $$9) {
                b.error("Failed to save level {}", (Object)$$3, (Object)$$9);
            }
        }

        public Optional<Path> e() {
            if (!this.b.a()) {
                return Optional.empty();
            }
            return Optional.of(this.c.d());
        }

        public void f() throws IOException {
            this.h();
            final Path $$0 = this.c.e();
            b.info("Deleting level {}", (Object)this.d);
            for (int $$1 = 1; $$1 <= 5; ++$$1) {
                b.info("Attempt {}...", (Object)$$1);
                try {
                    Files.walkFileTree(this.c.f(), (FileVisitor<? super Path>)new SimpleFileVisitor<Path>(){

                        public FileVisitResult a(Path $$02, BasicFileAttributes $$1) throws IOException {
                            if (!$$02.equals($$0)) {
                                dyy.b.debug("Deleting {}", (Object)$$02);
                                Files.delete($$02);
                            }
                            return FileVisitResult.CONTINUE;
                        }

                        public FileVisitResult a(Path $$02, @Nullable IOException $$1) throws IOException {
                            if ($$1 != null) {
                                throw $$1;
                            }
                            if ($$02.equals(c.this.c.f())) {
                                c.this.b.close();
                                Files.deleteIfExists($$0);
                            }
                            Files.delete($$02);
                            return FileVisitResult.CONTINUE;
                        }

                        @Override
                        public /* synthetic */ FileVisitResult postVisitDirectory(Object object, @Nullable IOException iOException) throws IOException {
                            return this.a((Path)object, iOException);
                        }

                        @Override
                        public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                            return this.a((Path)object, basicFileAttributes);
                        }
                    });
                    break;
                }
                catch (IOException $$2) {
                    if ($$1 < 5) {
                        b.warn("Failed to delete {}", (Object)this.c.f(), (Object)$$2);
                        try {
                            Thread.sleep(500L);
                        }
                        catch (InterruptedException interruptedException) {}
                        continue;
                    }
                    throw $$2;
                }
            }
        }

        public void a(String $$0) throws IOException {
            this.h();
            Path $$1 = this.c.b();
            if (Files.exists($$1, new LinkOption[0])) {
                qr $$2 = rb.a($$1.toFile());
                qr $$3 = $$2.p(dyy.e);
                $$3.a("LevelName", $$0);
                rb.a($$2, $$1.toFile());
            }
        }

        public long g() throws IOException {
            this.h();
            String $$0 = LocalDateTime.now().format(c) + "_" + this.d;
            Path $$1 = dyy.this.d();
            try {
                v.c($$1);
            }
            catch (IOException $$2) {
                throw new RuntimeException($$2);
            }
            Path $$3 = $$1.resolve(v.a($$1, $$0, ".zip"));
            try (final ZipOutputStream $$4 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream($$3, new OpenOption[0])));){
                final Path $$5 = Paths.get(this.d, new String[0]);
                Files.walkFileTree(this.c.f(), (FileVisitor<? super Path>)new SimpleFileVisitor<Path>(){

                    public FileVisitResult a(Path $$0, BasicFileAttributes $$1) throws IOException {
                        if ($$0.endsWith("session.lock")) {
                            return FileVisitResult.CONTINUE;
                        }
                        String $$2 = $$5.resolve(c.this.c.f().relativize($$0)).toString().replace('\\', '/');
                        ZipEntry $$3 = new ZipEntry($$2);
                        $$4.putNextEntry($$3);
                        com.google.common.io.Files.asByteSource((File)$$0.toFile()).copyTo((OutputStream)$$4);
                        $$4.closeEntry();
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
                        return this.a((Path)object, basicFileAttributes);
                    }
                });
            }
            return Files.size($$3);
        }

        @Override
        public void close() throws IOException {
            this.b.close();
        }
    }
}

