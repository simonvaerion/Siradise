/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2IntMap
 *  it.unimi.dsi.fastutil.longs.Long2IntMaps
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ahx {
    static final Logger a = LogUtils.getLogger();
    static final int b = ahq.a(ahy.d);
    private static final int c = 4;
    final Long2ObjectMap<ObjectSet<aig>> d = new Long2ObjectOpenHashMap();
    final Long2ObjectOpenHashMap<apo<aij<?>>> e = new Long2ObjectOpenHashMap();
    private final a f = new a();
    private final b g = new b(8);
    private final ail h = new ail();
    private final c i = new c(32);
    final Set<ahp> j = Sets.newHashSet();
    final aht k;
    final bcp<aht.a<Runnable>> l;
    final bcp<aht.b> m;
    final LongSet n = new LongOpenHashSet();
    final Executor o;
    private long p;
    private int q = 10;

    protected ahx(Executor $$0, Executor $$1) {
        aht $$3;
        bcp<Runnable> $$2 = bcp.a("player ticket throttler", $$1::execute);
        this.k = $$3 = new aht((List<bcp<?>>)ImmutableList.of($$2), $$0, 4);
        this.l = $$3.a($$2, true);
        this.m = $$3.a($$2);
        this.o = $$1;
    }

    protected void a() {
        ++this.p;
        ObjectIterator $$0 = this.e.long2ObjectEntrySet().fastIterator();
        while ($$0.hasNext()) {
            Long2ObjectMap.Entry $$1 = (Long2ObjectMap.Entry)$$0.next();
            Iterator $$2 = ((apo)$$1.getValue()).iterator();
            boolean $$3 = false;
            while ($$2.hasNext()) {
                aij $$4 = (aij)$$2.next();
                if (!$$4.b(this.p)) continue;
                $$2.remove();
                $$3 = true;
                this.h.b($$1.getLongKey(), $$4);
            }
            if ($$3) {
                this.f.b($$1.getLongKey(), ahx.a((apo)$$1.getValue()), false);
            }
            if (!((apo)$$1.getValue()).isEmpty()) continue;
            $$0.remove();
        }
    }

    private static int a(apo<aij<?>> $$0) {
        return !$$0.isEmpty() ? $$0.b().b() : ahq.a + 1;
    }

    protected abstract boolean a(long var1);

    @Nullable
    protected abstract ahp b(long var1);

    @Nullable
    protected abstract ahp a(long var1, int var3, @Nullable ahp var4, int var5);

    public boolean a(ahr $$02) {
        boolean $$2;
        this.g.a();
        this.h.a();
        this.i.a();
        int $$12 = Integer.MAX_VALUE - this.f.a(Integer.MAX_VALUE);
        boolean bl2 = $$2 = $$12 != 0;
        if ($$2) {
            // empty if block
        }
        if (!this.j.isEmpty()) {
            this.j.forEach($$1 -> $$1.a($$02, this.o));
            this.j.clear();
            return true;
        }
        if (!this.n.isEmpty()) {
            LongIterator $$3 = this.n.iterator();
            while ($$3.hasNext()) {
                long $$4 = $$3.nextLong();
                if (!this.g($$4).stream().anyMatch($$0 -> $$0.a() == aik.c)) continue;
                ahp $$5 = $$02.a($$4);
                if ($$5 == null) {
                    throw new IllegalStateException();
                }
                CompletableFuture<Either<dei, ahp.a>> $$6 = $$5.b();
                $$6.thenAccept($$1 -> this.o.execute(() -> this.m.a(aht.a(() -> {}, $$4, false))));
            }
            this.n.clear();
        }
        return $$2;
    }

    void a(long $$0, aij<?> $$1) {
        apo<aij<?>> $$2 = this.g($$0);
        int $$3 = ahx.a($$2);
        aij<?> $$4 = $$2.a($$1);
        $$4.a(this.p);
        if ($$1.b() < $$3) {
            this.f.b($$0, $$1.b(), true);
        }
    }

    void b(long $$0, aij<?> $$1) {
        apo<aij<?>> $$2 = this.g($$0);
        if ($$2.remove($$1)) {
            // empty if block
        }
        if ($$2.isEmpty()) {
            this.e.remove($$0);
        }
        this.f.b($$0, ahx.a($$2), false);
    }

    public <T> void a(aik<T> $$0, clt $$1, int $$2, T $$3) {
        this.a($$1.a(), new aij<T>($$0, $$2, $$3));
    }

    public <T> void b(aik<T> $$0, clt $$1, int $$2, T $$3) {
        aij<T> $$4 = new aij<T>($$0, $$2, $$3);
        this.b($$1.a(), $$4);
    }

    public <T> void c(aik<T> $$0, clt $$1, int $$2, T $$3) {
        aij<T> $$4 = new aij<T>($$0, ahq.a(ahy.b) - $$2, $$3);
        long $$5 = $$1.a();
        this.a($$5, $$4);
        this.h.a($$5, $$4);
    }

    public <T> void d(aik<T> $$0, clt $$1, int $$2, T $$3) {
        aij<T> $$4 = new aij<T>($$0, ahq.a(ahy.b) - $$2, $$3);
        long $$5 = $$1.a();
        this.b($$5, $$4);
        this.h.b($$5, $$4);
    }

    private apo<aij<?>> g(long $$02) {
        return (apo)this.e.computeIfAbsent($$02, $$0 -> apo.a(4));
    }

    protected void a(clt $$0, boolean $$1) {
        aij<clt> $$2 = new aij<clt>(aik.d, ahr.b, $$0);
        long $$3 = $$0.a();
        if ($$1) {
            this.a($$3, $$2);
            this.h.a($$3, $$2);
        } else {
            this.b($$3, $$2);
            this.h.b($$3, $$2);
        }
    }

    public void a(hx $$02, aig $$1) {
        clt $$2 = $$02.r();
        long $$3 = $$2.a();
        ((ObjectSet)this.d.computeIfAbsent($$3, $$0 -> new ObjectOpenHashSet())).add((Object)$$1);
        this.g.b($$3, 0, true);
        this.i.b($$3, 0, true);
        this.h.a(aik.c, $$2, this.g(), $$2);
    }

    public void b(hx $$0, aig $$1) {
        clt $$2 = $$0.r();
        long $$3 = $$2.a();
        ObjectSet $$4 = (ObjectSet)this.d.get($$3);
        $$4.remove((Object)$$1);
        if ($$4.isEmpty()) {
            this.d.remove($$3);
            this.g.b($$3, Integer.MAX_VALUE, false);
            this.i.b($$3, Integer.MAX_VALUE, false);
            this.h.b(aik.c, $$2, this.g(), $$2);
        }
    }

    private int g() {
        return Math.max(0, ahq.a(ahy.d) - this.q);
    }

    public boolean c(long $$0) {
        return ahq.c(this.h.c($$0));
    }

    public boolean d(long $$0) {
        return ahq.d(this.h.c($$0));
    }

    protected String e(long $$0) {
        apo $$1 = (apo)this.e.get($$0);
        if ($$1 == null || $$1.isEmpty()) {
            return "no_ticket";
        }
        return ((aij)$$1.b()).toString();
    }

    protected void a(int $$0) {
        this.i.a($$0);
    }

    public void b(int $$0) {
        if ($$0 != this.q) {
            this.q = $$0;
            this.h.a(this.g());
        }
    }

    public int b() {
        this.g.a();
        return this.g.a.size();
    }

    public boolean f(long $$0) {
        this.g.a();
        return this.g.a.containsKey($$0);
    }

    public String c() {
        return this.k.b();
    }

    private void a(String $$0) {
        try (FileOutputStream $$1 = new FileOutputStream(new File($$0));){
            for (Long2ObjectMap.Entry $$2 : this.e.long2ObjectEntrySet()) {
                clt $$3 = new clt($$2.getLongKey());
                for (aij $$4 : (apo)$$2.getValue()) {
                    $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4.a() + "\t" + $$4.b() + "\t\n").getBytes(StandardCharsets.UTF_8));
                }
            }
        }
        catch (IOException $$5) {
            a.error("Failed to dump tickets to {}", (Object)$$0, (Object)$$5);
        }
    }

    @VisibleForTesting
    ail d() {
        return this.h;
    }

    public void e() {
        ImmutableSet $$0 = ImmutableSet.of(aik.h, aik.g, aik.e);
        ObjectIterator $$1 = this.e.long2ObjectEntrySet().fastIterator();
        while ($$1.hasNext()) {
            Long2ObjectMap.Entry $$2 = (Long2ObjectMap.Entry)$$1.next();
            Iterator $$3 = ((apo)$$2.getValue()).iterator();
            boolean $$4 = false;
            while ($$3.hasNext()) {
                aij $$5 = (aij)$$3.next();
                if ($$0.contains($$5.a())) continue;
                $$3.remove();
                $$4 = true;
                this.h.b($$2.getLongKey(), $$5);
            }
            if ($$4) {
                this.f.b($$2.getLongKey(), ahx.a((apo)$$2.getValue()), false);
            }
            if (!((apo)$$2.getValue()).isEmpty()) continue;
            $$1.remove();
        }
    }

    public boolean f() {
        return !this.e.isEmpty();
    }

    class a
    extends ahu {
        private static final int b = ahq.a + 1;

        public a() {
            super(b + 1, 16, 256);
        }

        @Override
        protected int b(long $$0) {
            apo $$1 = (apo)ahx.this.e.get($$0);
            if ($$1 == null) {
                return Integer.MAX_VALUE;
            }
            if ($$1.isEmpty()) {
                return Integer.MAX_VALUE;
            }
            return ((aij)$$1.b()).b();
        }

        @Override
        protected int c(long $$0) {
            ahp $$1;
            if (!ahx.this.a($$0) && ($$1 = ahx.this.b($$0)) != null) {
                return $$1.k();
            }
            return b;
        }

        @Override
        protected void a(long $$0, int $$1) {
            int $$3;
            ahp $$2 = ahx.this.b($$0);
            int n2 = $$3 = $$2 == null ? b : $$2.k();
            if ($$3 == $$1) {
                return;
            }
            if (($$2 = ahx.this.a($$0, $$1, $$2, $$3)) != null) {
                ahx.this.j.add($$2);
            }
        }

        public int a(int $$0) {
            return this.b($$0);
        }
    }

    class b
    extends ahu {
        protected final Long2ByteMap a;
        protected final int b;

        protected b(int $$0) {
            super($$0 + 2, 16, 256);
            this.a = new Long2ByteOpenHashMap();
            this.b = $$0;
            this.a.defaultReturnValue((byte)($$0 + 2));
        }

        @Override
        protected int c(long $$0) {
            return this.a.get($$0);
        }

        @Override
        protected void a(long $$0, int $$1) {
            byte $$3;
            if ($$1 > this.b) {
                byte $$2 = this.a.remove($$0);
            } else {
                $$3 = this.a.put($$0, (byte)$$1);
            }
            this.a($$0, (int)$$3, $$1);
        }

        protected void a(long $$0, int $$1, int $$2) {
        }

        @Override
        protected int b(long $$0) {
            return this.d($$0) ? 0 : Integer.MAX_VALUE;
        }

        private boolean d(long $$0) {
            ObjectSet $$1 = (ObjectSet)ahx.this.d.get($$0);
            return $$1 != null && !$$1.isEmpty();
        }

        public void a() {
            this.b(Integer.MAX_VALUE);
        }

        private void a(String $$0) {
            try (FileOutputStream $$1 = new FileOutputStream(new File($$0));){
                for (Long2ByteMap.Entry $$2 : this.a.long2ByteEntrySet()) {
                    clt $$3 = new clt($$2.getLongKey());
                    String $$4 = Byte.toString($$2.getByteValue());
                    $$1.write(($$3.e + "\t" + $$3.f + "\t" + $$4 + "\n").getBytes(StandardCharsets.UTF_8));
                }
            }
            catch (IOException $$5) {
                a.error("Failed to dump chunks to {}", (Object)$$0, (Object)$$5);
            }
        }
    }

    class c
    extends b {
        private int g;
        private final Long2IntMap h;
        private final LongSet i;

        protected c(int $$0) {
            super($$0);
            this.h = Long2IntMaps.synchronize((Long2IntMap)new Long2IntOpenHashMap());
            this.i = new LongOpenHashSet();
            this.g = 0;
            this.h.defaultReturnValue($$0 + 2);
        }

        @Override
        protected void a(long $$0, int $$1, int $$2) {
            this.i.add($$0);
        }

        public void a(int $$0) {
            for (Long2ByteMap.Entry $$1 : this.a.long2ByteEntrySet()) {
                byte $$2 = $$1.getByteValue();
                long $$3 = $$1.getLongKey();
                this.a($$3, $$2, this.c($$2), $$2 <= $$0);
            }
            this.g = $$0;
        }

        private void a(long $$0, int $$1, boolean $$2, boolean $$3) {
            if ($$2 != $$3) {
                aij<clt> $$4 = new aij<clt>(aik.c, b, new clt($$0));
                if ($$3) {
                    ahx.this.l.a(aht.a(() -> ahx.this.o.execute(() -> {
                        if (this.c(this.c($$0))) {
                            ahx.this.a($$0, $$4);
                            ahx.this.n.add($$0);
                        } else {
                            ahx.this.m.a(aht.a(() -> {}, $$0, false));
                        }
                    }), $$0, () -> $$1));
                } else {
                    ahx.this.m.a(aht.a(() -> ahx.this.o.execute(() -> ahx.this.b($$0, $$4)), $$0, true));
                }
            }
        }

        @Override
        public void a() {
            super.a();
            if (!this.i.isEmpty()) {
                LongIterator $$0 = this.i.iterator();
                while ($$0.hasNext()) {
                    int $$3;
                    long $$12 = $$0.nextLong();
                    int $$2 = this.h.get($$12);
                    if ($$2 == ($$3 = this.c($$12))) continue;
                    ahx.this.k.onLevelChange(new clt($$12), () -> this.h.get($$12), $$3, $$1 -> {
                        if ($$1 >= this.h.defaultReturnValue()) {
                            this.h.remove($$12);
                        } else {
                            this.h.put($$12, $$1);
                        }
                    });
                    this.a($$12, $$3, this.c($$2), this.c($$3));
                }
                this.i.clear();
            }
        }

        private boolean c(int $$0) {
            return $$0 <= this.g;
        }
    }
}

