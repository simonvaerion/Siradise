/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;

public class bbx
implements bbz {
    public static final int a = 10;
    @Nullable
    private static Consumer<Path> b = null;
    private final Map<bbs, List<bce>> c = new Object2ObjectOpenHashMap();
    private final bah d;
    private final Executor e;
    private final bcd f;
    private final Consumer<bam> g;
    private final Consumer<Path> h;
    private final bbu i;
    private final LongSupplier j;
    private final long k;
    private int l;
    private bal m;
    private volatile boolean n;
    private Set<bbs> o = ImmutableSet.of();

    private bbx(bbu $$0, LongSupplier $$1, Executor $$2, bcd $$3, Consumer<bam> $$4, Consumer<Path> $$5) {
        this.i = $$0;
        this.j = $$1;
        this.d = new bah($$1, () -> this.l);
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = b == null ? $$5 : $$5.andThen(b);
        this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
        this.m = new bag(this.j, () -> this.l, false);
        this.d.c();
    }

    public static bbx a(bbu $$0, LongSupplier $$1, Executor $$2, bcd $$3, Consumer<bam> $$4, Consumer<Path> $$5) {
        return new bbx($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public synchronized void a() {
        if (!this.e()) {
            return;
        }
        this.n = true;
    }

    @Override
    public synchronized void b() {
        if (!this.e()) {
            return;
        }
        this.m = bak.a;
        this.g.accept(bai.a);
        this.a(this.o);
    }

    @Override
    public void c() {
        this.g();
        this.o = this.i.a(() -> this.m);
        for (bbs $$0 : this.o) {
            $$0.a();
        }
        ++this.l;
    }

    @Override
    public void d() {
        this.g();
        if (this.l == 0) {
            return;
        }
        for (bbs $$02 : this.o) {
            $$02.a(this.l);
            if (!$$02.g()) continue;
            bce $$1 = new bce(Instant.now(), this.l, this.m.d());
            this.c.computeIfAbsent($$02, $$0 -> Lists.newArrayList()).add($$1);
        }
        if (this.n || this.j.getAsLong() > this.k) {
            this.n = false;
            bam $$2 = this.d.e();
            this.m = bak.a;
            this.g.accept($$2);
            this.a($$2);
            return;
        }
        this.m = new bag(this.j, () -> this.l, false);
    }

    @Override
    public boolean e() {
        return this.d.a();
    }

    @Override
    public ban f() {
        return ban.a(this.d.d(), this.m);
    }

    private void g() {
        if (!this.e()) {
            throw new IllegalStateException("Not started!");
        }
    }

    private void a(bam $$0) {
        HashSet<bbs> $$1 = new HashSet<bbs>(this.o);
        this.e.execute(() -> {
            Path $$2 = this.f.a($$1, this.c, $$0);
            this.a($$1);
            this.h.accept($$2);
        });
    }

    private void a(Collection<bbs> $$0) {
        for (bbs $$1 : $$0) {
            $$1.b();
        }
        this.c.clear();
        this.d.b();
    }

    public static void a(Consumer<Path> $$0) {
        b = $$0;
    }
}

