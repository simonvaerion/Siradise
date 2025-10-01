/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Ticker
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ListeningExecutorService
 *  com.google.common.util.concurrent.MoreExecutors
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$PartialResult
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Ticker;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ac {
    static final Logger e = LogUtils.getLogger();
    private static final int f = 255;
    private static final String g = "max.bg.threads";
    private static final AtomicInteger h = new AtomicInteger(1);
    private static final ExecutorService i = ac.c("Main");
    private static final ExecutorService j = ac.n();
    private static final DateTimeFormatter k = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss", Locale.ROOT);
    public static apv.a a = System::nanoTime;
    public static final Ticker b = new Ticker(){

        public long read() {
            return a.getAsLong();
        }
    };
    public static final UUID c = new UUID(0L, 0L);
    public static final FileSystemProvider d = FileSystemProvider.installedProviders().stream().filter($$0 -> $$0.getScheme().equalsIgnoreCase("jar")).findFirst().orElseThrow(() -> new IllegalStateException("No jar file system provider found"));
    private static Consumer<String> l = $$0 -> {};

    public static <K, V> Collector<Map.Entry<? extends K, ? extends V>, ?, Map<K, V>> a() {
        return Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue);
    }

    public static <T extends Comparable<T>> String a(dde<T> $$0, Object $$1) {
        return $$0.a((Comparable)$$1);
    }

    public static String a(String $$0, @Nullable acq $$1) {
        if ($$1 == null) {
            return $$0 + ".unregistered_sadface";
        }
        return $$0 + "." + $$1.b() + "." + $$1.a().replace('/', '.');
    }

    public static long b() {
        return ac.c() / 1000000L;
    }

    public static long c() {
        return a.getAsLong();
    }

    public static long d() {
        return Instant.now().toEpochMilli();
    }

    public static String e() {
        return k.format(ZonedDateTime.now());
    }

    private static ExecutorService c(String $$0) {
        ForkJoinPool $$3;
        int $$12 = apa.a(Runtime.getRuntime().availableProcessors() - 1, 1, ac.m());
        if ($$12 <= 0) {
            ListeningExecutorService $$2 = MoreExecutors.newDirectExecutorService();
        } else {
            $$3 = new ForkJoinPool($$12, $$1 -> {
                ForkJoinWorkerThread $$2 = new ForkJoinWorkerThread($$1){

                    @Override
                    protected void onTermination(Throwable $$0) {
                        if ($$0 != null) {
                            e.warn("{} died", (Object)this.getName(), (Object)$$0);
                        } else {
                            e.debug("{} shutdown", (Object)this.getName());
                        }
                        super.onTermination($$0);
                    }
                };
                $$2.setName("Worker-" + $$0 + "-" + h.getAndIncrement());
                return $$2;
            }, ac::a, true);
        }
        return $$3;
    }

    private static int m() {
        String $$0 = System.getProperty(g);
        if ($$0 != null) {
            try {
                int $$1 = Integer.parseInt($$0);
                if ($$1 >= 1 && $$1 <= 255) {
                    return $$1;
                }
                e.error("Wrong {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{g, $$0, 255});
            }
            catch (NumberFormatException $$2) {
                e.error("Could not parse {} property value '{}'. Should be an integer value between 1 and {}.", new Object[]{g, $$0, 255});
            }
        }
        return 255;
    }

    public static ExecutorService f() {
        return i;
    }

    public static ExecutorService g() {
        return j;
    }

    public static void h() {
        ac.a(i);
        ac.a(j);
    }

    private static void a(ExecutorService $$0) {
        boolean $$3;
        $$0.shutdown();
        try {
            boolean $$1 = $$0.awaitTermination(3L, TimeUnit.SECONDS);
        }
        catch (InterruptedException $$2) {
            $$3 = false;
        }
        if (!$$3) {
            $$0.shutdownNow();
        }
    }

    private static ExecutorService n() {
        return Executors.newCachedThreadPool($$0 -> {
            Thread $$1 = new Thread($$0);
            $$1.setName("IO-Worker-" + h.getAndIncrement());
            $$1.setUncaughtExceptionHandler(ac::a);
            return $$1;
        });
    }

    public static void a(Throwable $$0) {
        throw $$0 instanceof RuntimeException ? (RuntimeException)$$0 : new RuntimeException($$0);
    }

    private static void a(Thread $$0, Throwable $$1) {
        ac.b($$1);
        if ($$1 instanceof CompletionException) {
            $$1 = $$1.getCause();
        }
        if ($$1 instanceof y) {
            acs.a(((y)$$1).a().e());
            System.exit(-1);
        }
        e.error(String.format(Locale.ROOT, "Caught exception in thread %s", $$0), $$1);
    }

    @Nullable
    public static Type<?> a(DSL.TypeReference $$0, String $$1) {
        if (!aa.aR) {
            return null;
        }
        return ac.b($$0, $$1);
    }

    @Nullable
    private static Type<?> b(DSL.TypeReference $$0, String $$1) {
        Type $$2;
        block2: {
            $$2 = null;
            try {
                $$2 = aqd.a().getSchema(DataFixUtils.makeKey((int)aa.b().d().c())).getChoiceType($$0, $$1);
            }
            catch (IllegalArgumentException $$3) {
                e.error("No data fixer registered for {}", (Object)$$1);
                if (!aa.aS) break block2;
                throw $$3;
            }
        }
        return $$2;
    }

    public static Runnable a(String $$0, Runnable $$1) {
        if (aa.aS) {
            return () -> {
                Thread $$2 = Thread.currentThread();
                String $$3 = $$2.getName();
                $$2.setName($$0);
                try {
                    $$1.run();
                }
                finally {
                    $$2.setName($$3);
                }
            };
        }
        return $$1;
    }

    public static <V> Supplier<V> a(String $$0, Supplier<V> $$1) {
        if (aa.aS) {
            return () -> {
                Thread $$2 = Thread.currentThread();
                String $$3 = $$2.getName();
                $$2.setName($$0);
                try {
                    Object t2 = $$1.get();
                    return t2;
                }
                finally {
                    $$2.setName($$3);
                }
            };
        }
        return $$1;
    }

    public static b i() {
        String $$0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if ($$0.contains("win")) {
            return ac$b.c;
        }
        if ($$0.contains("mac")) {
            return ac$b.d;
        }
        if ($$0.contains("solaris")) {
            return ac$b.b;
        }
        if ($$0.contains("sunos")) {
            return ac$b.b;
        }
        if ($$0.contains("linux")) {
            return ac$b.a;
        }
        if ($$0.contains("unix")) {
            return ac$b.a;
        }
        return ac$b.e;
    }

    public static Stream<String> j() {
        RuntimeMXBean $$02 = ManagementFactory.getRuntimeMXBean();
        return $$02.getInputArguments().stream().filter($$0 -> $$0.startsWith("-X"));
    }

    public static <T> T a(List<T> $$0) {
        return $$0.get($$0.size() - 1);
    }

    public static <T> T a(Iterable<T> $$0, @Nullable T $$1) {
        Iterator<T> $$2 = $$0.iterator();
        T $$3 = $$2.next();
        if ($$1 != null) {
            T $$4 = $$3;
            while (true) {
                if ($$4 == $$1) {
                    if (!$$2.hasNext()) break;
                    return $$2.next();
                }
                if (!$$2.hasNext()) continue;
                $$4 = $$2.next();
            }
        }
        return $$3;
    }

    public static <T> T b(Iterable<T> $$0, @Nullable T $$1) {
        Iterator<T> $$2 = $$0.iterator();
        T $$3 = null;
        while ($$2.hasNext()) {
            T $$4 = $$2.next();
            if ($$4 == $$1) {
                if ($$3 != null) break;
                $$3 = (T)($$2.hasNext() ? Iterators.getLast($$2) : $$1);
                break;
            }
            $$3 = $$4;
        }
        return $$3;
    }

    public static <T> T a(Supplier<T> $$0) {
        return $$0.get();
    }

    public static <T> T a(T $$0, Consumer<T> $$1) {
        $$1.accept($$0);
        return $$0;
    }

    public static <K> Hash.Strategy<K> k() {
        return ac$a.a;
    }

    public static <V> CompletableFuture<List<V>> b(List<? extends CompletableFuture<V>> $$0) {
        if ($$0.isEmpty()) {
            return CompletableFuture.completedFuture(List.of());
        }
        if ($$0.size() == 1) {
            return $$0.get(0).thenApply(List::of);
        }
        CompletableFuture<Void> $$12 = CompletableFuture.allOf($$0.toArray(new CompletableFuture[0]));
        return $$12.thenApply($$1 -> $$0.stream().map(CompletableFuture::join).toList());
    }

    public static <V> CompletableFuture<List<V>> c(List<? extends CompletableFuture<? extends V>> $$0) {
        CompletableFuture $$1 = new CompletableFuture();
        return ac.a($$0, $$1::completeExceptionally).applyToEither((CompletionStage)$$1, Function.identity());
    }

    public static <V> CompletableFuture<List<V>> d(List<? extends CompletableFuture<? extends V>> $$0) {
        CompletableFuture $$1 = new CompletableFuture();
        return ac.a($$0, (Throwable $$2) -> {
            if ($$1.completeExceptionally((Throwable)$$2)) {
                for (CompletableFuture $$3 : $$0) {
                    $$3.cancel(true);
                }
            }
        }).applyToEither((CompletionStage)$$1, Function.identity());
    }

    private static <V> CompletableFuture<List<V>> a(List<? extends CompletableFuture<? extends V>> $$0, Consumer<Throwable> $$12) {
        ArrayList $$2 = Lists.newArrayListWithCapacity((int)$$0.size());
        CompletableFuture[] $$3 = new CompletableFuture[$$0.size()];
        $$0.forEach($$32 -> {
            int $$42 = $$2.size();
            $$2.add(null);
            $$1[$$42] = $$32.whenComplete(($$3, $$4) -> {
                if ($$4 != null) {
                    $$12.accept((Throwable)$$4);
                } else {
                    $$2.set($$42, $$3);
                }
            });
        });
        return CompletableFuture.allOf($$3).thenApply($$1 -> $$2);
    }

    public static <T> Optional<T> a(Optional<T> $$0, Consumer<T> $$1, Runnable $$2) {
        if ($$0.isPresent()) {
            $$1.accept($$0.get());
        } else {
            $$2.run();
        }
        return $$0;
    }

    public static <T> Supplier<T> a(Supplier<T> $$0, Supplier<String> $$1) {
        return $$0;
    }

    public static Runnable a(Runnable $$0, Supplier<String> $$1) {
        return $$0;
    }

    public static void a(String $$0) {
        e.error($$0);
        if (aa.aS) {
            ac.d($$0);
        }
    }

    public static void a(String $$0, Throwable $$1) {
        e.error($$0, $$1);
        if (aa.aS) {
            ac.d($$0);
        }
    }

    public static <T extends Throwable> T b(T $$0) {
        if (aa.aS) {
            e.error("Trying to throw a fatal exception, pausing in IDE", $$0);
            ac.d($$0.getMessage());
        }
        return $$0;
    }

    public static void a(Consumer<String> $$0) {
        l = $$0;
    }

    private static void d(String $$0) {
        boolean $$2;
        Instant $$1 = Instant.now();
        e.warn("Did you remember to set a breakpoint here?");
        boolean bl2 = $$2 = Duration.between($$1, Instant.now()).toMillis() > 500L;
        if (!$$2) {
            l.accept($$0);
        }
    }

    public static String c(Throwable $$0) {
        if ($$0.getCause() != null) {
            return ac.c($$0.getCause());
        }
        if ($$0.getMessage() != null) {
            return $$0.getMessage();
        }
        return $$0.toString();
    }

    public static <T> T a(T[] $$0, apf $$1) {
        return $$0[$$1.a($$0.length)];
    }

    public static int a(int[] $$0, apf $$1) {
        return $$0[$$1.a($$0.length)];
    }

    public static <T> T a(List<T> $$0, apf $$1) {
        return $$0.get($$1.a($$0.size()));
    }

    public static <T> Optional<T> b(List<T> $$0, apf $$1) {
        if ($$0.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(ac.a($$0, $$1));
    }

    private static BooleanSupplier a(final Path $$0, final Path $$1) {
        return new BooleanSupplier(){

            @Override
            public boolean getAsBoolean() {
                try {
                    Files.move($$0, $$1, new CopyOption[0]);
                    return true;
                }
                catch (IOException $$02) {
                    e.error("Failed to rename", (Throwable)$$02);
                    return false;
                }
            }

            public String toString() {
                return "rename " + $$0 + " to " + $$1;
            }
        };
    }

    private static BooleanSupplier a(final Path $$0) {
        return new BooleanSupplier(){

            @Override
            public boolean getAsBoolean() {
                try {
                    Files.deleteIfExists($$0);
                    return true;
                }
                catch (IOException $$02) {
                    e.warn("Failed to delete", (Throwable)$$02);
                    return false;
                }
            }

            public String toString() {
                return "delete old " + $$0;
            }
        };
    }

    private static BooleanSupplier b(final Path $$0) {
        return new BooleanSupplier(){

            @Override
            public boolean getAsBoolean() {
                return !Files.exists($$0, new LinkOption[0]);
            }

            public String toString() {
                return "verify that " + $$0 + " is deleted";
            }
        };
    }

    private static BooleanSupplier c(final Path $$0) {
        return new BooleanSupplier(){

            @Override
            public boolean getAsBoolean() {
                return Files.isRegularFile($$0, new LinkOption[0]);
            }

            public String toString() {
                return "verify that " + $$0 + " is present";
            }
        };
    }

    private static boolean a(BooleanSupplier ... $$0) {
        for (BooleanSupplier $$1 : $$0) {
            if ($$1.getAsBoolean()) continue;
            e.warn("Failed to execute {}", (Object)$$1);
            return false;
        }
        return true;
    }

    private static boolean a(int $$0, String $$1, BooleanSupplier ... $$2) {
        for (int $$3 = 0; $$3 < $$0; ++$$3) {
            if (ac.a($$2)) {
                return true;
            }
            e.error("Failed to {}, retrying {}/{}", new Object[]{$$1, $$3, $$0});
        }
        e.error("Failed to {}, aborting, progress might be lost", (Object)$$1);
        return false;
    }

    public static void a(File $$0, File $$1, File $$2) {
        ac.a($$0.toPath(), $$1.toPath(), $$2.toPath());
    }

    public static void a(Path $$0, Path $$1, Path $$2) {
        ac.a($$0, $$1, $$2, false);
    }

    public static void a(File $$0, File $$1, File $$2, boolean $$3) {
        ac.a($$0.toPath(), $$1.toPath(), $$2.toPath(), $$3);
    }

    public static void a(Path $$0, Path $$1, Path $$2, boolean $$3) {
        int $$4 = 10;
        if (Files.exists($$0, new LinkOption[0]) && !ac.a(10, "create backup " + $$2, ac.a($$2), ac.a($$0, $$2), ac.c($$2))) {
            return;
        }
        if (!ac.a(10, "remove old " + $$0, ac.a($$0), ac.b($$0))) {
            return;
        }
        if (!ac.a(10, "replace " + $$0 + " with " + $$1, ac.a($$1, $$0), ac.c($$0)) && !$$3) {
            ac.a(10, "restore " + $$0 + " from " + $$2, ac.a($$2, $$0), ac.c($$0));
        }
    }

    public static int a(String $$0, int $$1, int $$2) {
        int $$3 = $$0.length();
        if ($$2 >= 0) {
            for (int $$4 = 0; $$1 < $$3 && $$4 < $$2; ++$$4) {
                if (!Character.isHighSurrogate($$0.charAt($$1++)) || $$1 >= $$3 || !Character.isLowSurrogate($$0.charAt($$1))) continue;
                ++$$1;
            }
        } else {
            for (int $$5 = $$2; $$1 > 0 && $$5 < 0; ++$$5) {
                if (!Character.isLowSurrogate($$0.charAt(--$$1)) || $$1 <= 0 || !Character.isHighSurrogate($$0.charAt($$1 - 1))) continue;
                --$$1;
            }
        }
        return $$1;
    }

    public static Consumer<String> a(String $$0, Consumer<String> $$1) {
        return $$2 -> $$1.accept($$0 + $$2);
    }

    public static DataResult<int[]> a(IntStream $$0, int $$1) {
        int[] $$2 = $$0.limit($$1 + 1).toArray();
        if ($$2.length != $$1) {
            Supplier<String> $$3 = () -> "Input is not a list of " + $$1 + " ints";
            if ($$2.length >= $$1) {
                return DataResult.error($$3, (Object)Arrays.copyOf($$2, $$1));
            }
            return DataResult.error($$3);
        }
        return DataResult.success((Object)$$2);
    }

    public static DataResult<long[]> a(LongStream $$0, int $$1) {
        long[] $$2 = $$0.limit($$1 + 1).toArray();
        if ($$2.length != $$1) {
            Supplier<String> $$3 = () -> "Input is not a list of " + $$1 + " longs";
            if ($$2.length >= $$1) {
                return DataResult.error($$3, (Object)Arrays.copyOf($$2, $$1));
            }
            return DataResult.error($$3);
        }
        return DataResult.success((Object)$$2);
    }

    public static <T> DataResult<List<T>> a(List<T> $$0, int $$1) {
        if ($$0.size() != $$1) {
            Supplier<String> $$2 = () -> "Input is not a list of " + $$1 + " elements";
            if ($$0.size() >= $$1) {
                return DataResult.error($$2, $$0.subList(0, $$1));
            }
            return DataResult.error($$2);
        }
        return DataResult.success($$0);
    }

    public static void l() {
        Thread $$0 = new Thread("Timer hack thread"){

            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(Integer.MAX_VALUE);
                    }
                }
                catch (InterruptedException $$0) {
                    e.warn("Timer hack thread interrupted, that really should not happen");
                    return;
                }
            }
        };
        $$0.setDaemon(true);
        $$0.setUncaughtExceptionHandler(new r(e));
        $$0.start();
    }

    public static void b(Path $$0, Path $$1, Path $$2) throws IOException {
        Path $$3 = $$0.relativize($$2);
        Path $$4 = $$1.resolve($$3);
        Files.copy($$2, $$4, new CopyOption[0]);
    }

    public static String a(String $$0, m $$12) {
        return $$0.toLowerCase(Locale.ROOT).chars().mapToObj($$1 -> $$12.test((char)$$1) ? Character.toString((char)$$1) : "_").collect(Collectors.joining());
    }

    public static <K, V> apm<K, V> a(Function<K, V> $$0) {
        return new apm<K, V>($$0);
    }

    public static <T, R> Function<T, R> b(final Function<T, R> $$0) {
        return new Function<T, R>(){
            private final Map<T, R> b = new ConcurrentHashMap();

            @Override
            public R apply(T $$02) {
                return this.b.computeIfAbsent($$02, $$0);
            }

            public String toString() {
                return "memoize/1[function=" + $$0 + ", size=" + this.b.size() + "]";
            }
        };
    }

    public static <T, U, R> BiFunction<T, U, R> a(final BiFunction<T, U, R> $$0) {
        return new BiFunction<T, U, R>(){
            private final Map<Pair<T, U>, R> b = new ConcurrentHashMap();

            @Override
            public R apply(T $$02, U $$12) {
                return this.b.computeIfAbsent(Pair.of($$02, $$12), $$1 -> $$0.apply($$1.getFirst(), $$1.getSecond()));
            }

            public String toString() {
                return "memoize/2[function=" + $$0 + ", size=" + this.b.size() + "]";
            }
        };
    }

    public static <T> List<T> a(Stream<T> $$0, apf $$1) {
        ObjectArrayList $$2 = (ObjectArrayList)$$0.collect(ObjectArrayList.toList());
        ac.b($$2, $$1);
        return $$2;
    }

    public static IntArrayList a(IntStream $$0, apf $$1) {
        int $$3;
        IntArrayList $$2 = IntArrayList.wrap((int[])$$0.toArray());
        for (int $$4 = $$3 = $$2.size(); $$4 > 1; --$$4) {
            int $$5 = $$1.a($$4);
            $$2.set($$4 - 1, $$2.set($$5, $$2.getInt($$4 - 1)));
        }
        return $$2;
    }

    public static <T> List<T> b(T[] $$0, apf $$1) {
        ObjectArrayList $$2 = new ObjectArrayList((Object[])$$0);
        ac.b($$2, $$1);
        return $$2;
    }

    public static <T> List<T> a(ObjectArrayList<T> $$0, apf $$1) {
        ObjectArrayList $$2 = new ObjectArrayList($$0);
        ac.b($$2, $$1);
        return $$2;
    }

    public static <T> void b(ObjectArrayList<T> $$0, apf $$1) {
        int $$2;
        for (int $$3 = $$2 = $$0.size(); $$3 > 1; --$$3) {
            int $$4 = $$1.a($$3);
            $$0.set($$3 - 1, $$0.set($$4, $$0.get($$3 - 1)));
        }
    }

    public static <T> CompletableFuture<T> c(Function<Executor, CompletableFuture<T>> $$0) {
        return ac.a($$0, CompletableFuture::isDone);
    }

    public static <T> T a(Function<Executor, T> $$0, Predicate<T> $$1) {
        int $$6;
        LinkedBlockingQueue $$2 = new LinkedBlockingQueue();
        T $$3 = $$0.apply($$2::add);
        while (!$$1.test($$3)) {
            try {
                Runnable $$4 = (Runnable)$$2.poll(100L, TimeUnit.MILLISECONDS);
                if ($$4 == null) continue;
                $$4.run();
            }
            catch (InterruptedException $$5) {
                e.warn("Interrupted wait");
                break;
            }
        }
        if (($$6 = $$2.size()) > 0) {
            e.warn("Tasks left in queue: {}", (Object)$$6);
        }
        return $$3;
    }

    public static <T> ToIntFunction<T> e(List<T> $$0) {
        return ac.a($$0, Object2IntOpenHashMap::new);
    }

    public static <T> ToIntFunction<T> a(List<T> $$0, IntFunction<Object2IntMap<T>> $$1) {
        Object2IntMap<T> $$2 = $$1.apply($$0.size());
        for (int $$3 = 0; $$3 < $$0.size(); ++$$3) {
            $$2.put($$0.get($$3), $$3);
        }
        return $$2;
    }

    public static <T, E extends Exception> T a(DataResult<T> $$0, Function<String, E> $$1) throws E {
        Optional $$2 = $$0.error();
        if ($$2.isPresent()) {
            throw (Exception)$$1.apply(((DataResult.PartialResult)$$2.get()).message());
        }
        return $$0.result().orElseThrow();
    }

    public static boolean a(int $$0) {
        return Character.isWhitespace($$0) || Character.isSpaceChar($$0);
    }

    public static boolean b(@Nullable String $$0) {
        if ($$0 == null || $$0.length() == 0) {
            return true;
        }
        return $$0.chars().allMatch(ac::a);
    }

    /*
     * Uses 'sealed' constructs - enablewith --sealed true
     */
    public static class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("linux");
        public static final /* enum */ b b = new b("solaris");
        public static final /* enum */ b c = new b("windows"){

            @Override
            protected String[] b(URL $$0) {
                return new String[]{"rundll32", "url.dll,FileProtocolHandler", $$0.toString()};
            }
        };
        public static final /* enum */ b d = new b("mac"){

            @Override
            protected String[] b(URL $$0) {
                return new String[]{"open", $$0.toString()};
            }
        };
        public static final /* enum */ b e = new b("unknown");
        private final String f;
        private static final /* synthetic */ b[] g;

        public static b[] values() {
            return (b[])g.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        b(String $$0) {
            this.f = $$0;
        }

        public void a(URL $$0) {
            try {
                Process $$1 = AccessController.doPrivileged(() -> Runtime.getRuntime().exec(this.b($$0)));
                $$1.getInputStream().close();
                $$1.getErrorStream().close();
                $$1.getOutputStream().close();
            }
            catch (IOException | PrivilegedActionException $$2) {
                e.error("Couldn't open url '{}'", (Object)$$0, (Object)$$2);
            }
        }

        public void a(URI $$0) {
            try {
                this.a($$0.toURL());
            }
            catch (MalformedURLException $$1) {
                e.error("Couldn't open uri '{}'", (Object)$$0, (Object)$$1);
            }
        }

        public void a(File $$0) {
            try {
                this.a($$0.toURI().toURL());
            }
            catch (MalformedURLException $$1) {
                e.error("Couldn't open file '{}'", (Object)$$0, (Object)$$1);
            }
        }

        protected String[] b(URL $$0) {
            String $$1 = $$0.toString();
            if ("file".equals($$0.getProtocol())) {
                $$1 = $$1.replace("file:", "file://");
            }
            return new String[]{"xdg-open", $$1};
        }

        public void a(String $$0) {
            try {
                this.a(new URI($$0).toURL());
            }
            catch (IllegalArgumentException | MalformedURLException | URISyntaxException $$1) {
                e.error("Couldn't open uri '{}'", (Object)$$0, (Object)$$1);
            }
        }

        public String a() {
            return this.f;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e};
        }

        static {
            g = ac$b.b();
        }
    }

    static final class a
    extends Enum<a>
    implements Hash.Strategy<Object> {
        public static final /* enum */ a a = new a();
        private static final /* synthetic */ a[] b;

        public static a[] values() {
            return (a[])b.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public int hashCode(Object $$0) {
            return System.identityHashCode($$0);
        }

        public boolean equals(Object $$0, Object $$1) {
            return $$0 == $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a};
        }

        static {
            b = ac$a.a();
        }
    }
}

