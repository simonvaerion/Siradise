/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dgd<T extends dfs>
implements AutoCloseable {
    static final Logger a = LogUtils.getLogger();
    final Set<UUID> b = Sets.newHashSet();
    final dga<T> c;
    private final dfv<T> d;
    private final dfu<T> e;
    final dfx<T> f;
    private final dgb<T> g;
    private final Long2ObjectMap<dgf> h = new Long2ObjectOpenHashMap();
    private final Long2ObjectMap<b> i = new Long2ObjectOpenHashMap();
    private final LongSet j = new LongOpenHashSet();
    private final Queue<dfq<T>> k = Queues.newConcurrentLinkedQueue();

    public dgd(Class<T> $$0, dga<T> $$1, dfv<T> $$2) {
        this.e = new dfu();
        this.f = new dfx<T>($$0, (Long2ObjectFunction<dgf>)this.h);
        this.h.defaultReturnValue((Object)dgf.a);
        this.i.defaultReturnValue((Object)dgd$b.a);
        this.c = $$1;
        this.d = $$2;
        this.g = new dgc<T>(this.e, this.f);
    }

    void a(long $$0, dfw<T> $$1) {
        if ($$1.a()) {
            this.f.e($$0);
        }
    }

    private boolean b(T $$0) {
        if (!this.b.add($$0.ct())) {
            a.warn("UUID of added entity already exists: {}", $$0);
            return false;
        }
        return true;
    }

    public boolean a(T $$0) {
        return this.a($$0, false);
    }

    private boolean a(T $$0, boolean $$1) {
        dgf $$4;
        if (!this.b($$0)) {
            return false;
        }
        long $$2 = hx.c($$0.di());
        dfw<T> $$3 = this.f.c($$2);
        $$3.a($$0);
        $$0.a(new a(this, $$0, $$2, $$3));
        if (!$$1) {
            this.c.g($$0);
        }
        if (($$4 = dgd.a($$0, $$3.c())).b()) {
            this.e($$0);
        }
        if ($$4.a()) {
            this.c($$0);
        }
        return true;
    }

    static <T extends dfs> dgf a(T $$0, dgf $$1) {
        return $$0.dH() ? dgf.c : $$1;
    }

    public void a(Stream<T> $$02) {
        $$02.forEach($$0 -> this.a($$0, true));
    }

    public void b(Stream<T> $$02) {
        $$02.forEach($$0 -> this.a($$0, false));
    }

    void c(T $$0) {
        this.c.e($$0);
    }

    void d(T $$0) {
        this.c.d($$0);
    }

    void e(T $$0) {
        this.e.a($$0);
        this.c.c($$0);
    }

    void f(T $$0) {
        this.c.b($$0);
        this.e.b($$0);
    }

    public void a(clt $$0, ahy $$1) {
        dgf $$2 = dgf.a($$1);
        this.a($$0, $$2);
    }

    public void a(clt $$0, dgf $$12) {
        long $$2 = $$0.a();
        if ($$12 == dgf.a) {
            this.h.remove($$2);
            this.j.add($$2);
        } else {
            this.h.put($$2, (Object)$$12);
            this.j.remove($$2);
            this.b($$2);
        }
        this.f.b($$2).forEach($$1 -> {
            dgf $$2 = $$1.a($$12);
            boolean $$3 = $$2.b();
            boolean $$4 = $$12.b();
            boolean $$5 = $$2.a();
            boolean $$6 = $$12.a();
            if ($$5 && !$$6) {
                $$1.b().filter($$0 -> !$$0.dH()).forEach(this::d);
            }
            if ($$3 && !$$4) {
                $$1.b().filter($$0 -> !$$0.dH()).forEach(this::f);
            } else if (!$$3 && $$4) {
                $$1.b().filter($$0 -> !$$0.dH()).forEach(this::e);
            }
            if (!$$5 && $$6) {
                $$1.b().filter($$0 -> !$$0.dH()).forEach(this::c);
            }
        });
    }

    private void b(long $$0) {
        b $$1 = (b)((Object)this.i.get($$0));
        if ($$1 == dgd$b.a) {
            this.c($$0);
        }
    }

    private boolean a(long $$02, Consumer<T> $$1) {
        b $$2 = (b)((Object)this.i.get($$02));
        if ($$2 == dgd$b.b) {
            return false;
        }
        List<T> $$3 = this.f.b($$02).flatMap($$0 -> $$0.b().filter(dfs::dG)).collect(Collectors.toList());
        if ($$3.isEmpty()) {
            if ($$2 == dgd$b.c) {
                this.d.a(new dfq(new clt($$02), ImmutableList.of()));
            }
            return true;
        }
        if ($$2 == dgd$b.a) {
            this.c($$02);
            return false;
        }
        this.d.a(new dfq(new clt($$02), $$3));
        $$3.forEach($$1);
        return true;
    }

    private void c(long $$0) {
        this.i.put($$0, (Object)dgd$b.b);
        clt $$12 = new clt($$0);
        ((CompletableFuture)this.d.a($$12).thenAccept(this.k::add)).exceptionally($$1 -> {
            a.error("Failed to read chunk {}", (Object)$$12, $$1);
            return null;
        });
    }

    private boolean d(long $$02) {
        boolean $$1 = this.a($$02, (T $$0) -> $$0.cQ().forEach(this::g));
        if (!$$1) {
            return false;
        }
        this.i.remove($$02);
        return true;
    }

    private void g(dfs $$0) {
        $$0.b(bfj.c.c);
        $$0.a(dft.a);
    }

    private void f() {
        this.j.removeIf($$0 -> {
            if (this.h.get($$0) != dgf.a) {
                return true;
            }
            return this.d($$0);
        });
    }

    private void g() {
        dfq<T> $$02;
        while (($$02 = this.k.poll()) != null) {
            $$02.b().forEach($$0 -> this.a($$0, true));
            this.i.put($$02.a().a(), (Object)dgd$b.c);
        }
    }

    public void a() {
        this.g();
        this.f();
    }

    private LongSet h() {
        LongSet $$0 = this.f.a();
        for (Long2ObjectMap.Entry $$1 : Long2ObjectMaps.fastIterable(this.i)) {
            if ($$1.getValue() != dgd$b.c) continue;
            $$0.add($$1.getLongKey());
        }
        return $$0;
    }

    public void b() {
        this.h().forEach($$02 -> {
            boolean $$1;
            boolean bl2 = $$1 = this.h.get($$02) == dgf.a;
            if ($$1) {
                this.d($$02);
            } else {
                this.a($$02, (T $$0) -> {});
            }
        });
    }

    public void c() {
        LongSet $$0 = this.h();
        while (!$$0.isEmpty()) {
            this.d.a(false);
            this.g();
            $$0.removeIf($$02 -> {
                boolean $$1 = this.h.get($$02) == dgf.a;
                return $$1 ? this.d($$02) : this.a($$02, (T $$0) -> {});
            });
        }
        this.d.a(true);
    }

    @Override
    public void close() throws IOException {
        this.c();
        this.d.close();
    }

    public boolean a(UUID $$0) {
        return this.b.contains($$0);
    }

    public dgb<T> d() {
        return this.g;
    }

    public boolean a(gu $$0) {
        return ((dgf)((Object)this.h.get(clt.a($$0)))).a();
    }

    public boolean a(clt $$0) {
        return ((dgf)((Object)this.h.get($$0.a()))).a();
    }

    public boolean a(long $$0) {
        return this.i.get($$0) == dgd$b.c;
    }

    public void a(Writer $$0) throws IOException {
        aob $$12 = aob.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
        this.f.a().forEach($$1 -> {
            b $$22 = (b)((Object)((Object)this.i.get($$1)));
            this.f.a($$1).forEach($$2 -> {
                dfw<T> $$3 = this.f.d($$2);
                if ($$3 != null) {
                    try {
                        $$12.a(new Object[]{hx.b($$2), hx.c($$2), hx.d($$2), $$3.c(), $$22, $$3.d()});
                    }
                    catch (IOException $$4) {
                        throw new UncheckedIOException($$4);
                    }
                }
            });
        });
    }

    @aqa
    public String e() {
        return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = dgd$b.a();
        }
    }

    class a
    implements dft {
        private final T c;
        private long d;
        private dfw<T> e;
        final /* synthetic */ dgd b;

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        a(T t2, long $$2, dfw<T> dfw2) {
            void var3_3;
            void $$0;
            this.b = (dgd)l2;
            this.c = $$0;
            this.d = var3_3;
            this.e = (dfw)$$2;
        }

        @Override
        public void a() {
            gu $$0 = this.c.di();
            long $$1 = hx.c($$0);
            if ($$1 != this.d) {
                dgf $$2 = this.e.c();
                if (!this.e.b(this.c)) {
                    a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hx.a(this.d), $$1});
                }
                this.b.a(this.d, this.e);
                dfw $$3 = this.b.f.c($$1);
                $$3.a(this.c);
                this.e = $$3;
                this.d = $$1;
                this.a($$2, $$3.c());
            }
        }

        private void a(dgf $$0, dgf $$1) {
            dgf $$3;
            dgf $$2 = dgd.a(this.c, $$0);
            if ($$2 == ($$3 = dgd.a(this.c, $$1))) {
                if ($$3.b()) {
                    this.b.c.a(this.c);
                }
                return;
            }
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
                this.b.f(this.c);
            } else if (!$$4 && $$5) {
                this.b.e(this.c);
            }
            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
                this.b.d(this.c);
            } else if (!$$6 && $$7) {
                this.b.c(this.c);
            }
            if ($$5) {
                this.b.c.a(this.c);
            }
        }

        @Override
        public void a(bfj.c $$0) {
            dgf $$1;
            if (!this.e.b(this.c)) {
                a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hx.a(this.d), $$0});
            }
            if (($$1 = dgd.a(this.c, this.e.c())).a()) {
                this.b.d(this.c);
            }
            if ($$1.b()) {
                this.b.f(this.c);
            }
            if ($$0.a()) {
                this.b.c.f(this.c);
            }
            this.b.b.remove(this.c.ct());
            this.c.a(a);
            this.b.a(this.d, this.e);
        }
    }
}

