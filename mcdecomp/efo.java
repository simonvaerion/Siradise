/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class efo<T>
implements efu<T>,
efw<T> {
    private final Queue<eft<T>> a = new PriorityQueue(eft.a);
    @Nullable
    private List<efs<T>> b;
    private final Set<eft<?>> c = new ObjectOpenCustomHashSet(eft.c);
    @Nullable
    private BiConsumer<efo<T>, eft<T>> d;

    public efo() {
    }

    public efo(List<efs<T>> $$0) {
        this.b = $$0;
        for (efs<T> $$1 : $$0) {
            this.c.add(eft.a($$1.a(), $$1.b()));
        }
    }

    public void a(@Nullable BiConsumer<efo<T>, eft<T>> $$0) {
        this.d = $$0;
    }

    @Nullable
    public eft<T> b() {
        return this.a.peek();
    }

    @Nullable
    public eft<T> c() {
        eft<T> $$0 = this.a.poll();
        if ($$0 != null) {
            this.c.remove($$0);
        }
        return $$0;
    }

    @Override
    public void a(eft<T> $$0) {
        if (this.c.add($$0)) {
            this.b($$0);
        }
    }

    private void b(eft<T> $$0) {
        this.a.add($$0);
        if (this.d != null) {
            this.d.accept(this, $$0);
        }
    }

    @Override
    public boolean a(gu $$0, T $$1) {
        return this.c.contains(eft.a($$1, $$0));
    }

    @Override
    public void a(Predicate<eft<T>> $$0) {
        Iterator $$1 = this.a.iterator();
        while ($$1.hasNext()) {
            eft $$2 = (eft)$$1.next();
            if (!$$0.test($$2)) continue;
            $$1.remove();
            this.c.remove($$2);
        }
    }

    public Stream<eft<T>> d() {
        return this.a.stream();
    }

    @Override
    public int a() {
        return this.a.size() + (this.b != null ? this.b.size() : 0);
    }

    public qx a(long $$0, Function<T, String> $$1) {
        qx $$2 = new qx();
        if (this.b != null) {
            for (efs<Object> efs2 : this.b) {
                $$2.add(efs2.a($$1));
            }
        }
        for (eft eft2 : this.a) {
            $$2.add(efs.a(eft2, $$1, $$0));
        }
        return $$2;
    }

    public void a(long $$0) {
        if (this.b != null) {
            int $$1 = -this.b.size();
            for (efs<T> $$2 : this.b) {
                this.b($$2.a($$0, $$1++));
            }
        }
        this.b = null;
    }

    public static <T> efo<T> a(qx $$0, Function<String, Optional<T>> $$1, clt $$2) {
        ImmutableList.Builder $$3 = ImmutableList.builder();
        efs.a($$0, $$1, $$2, arg_0 -> ((ImmutableList.Builder)$$3).add(arg_0));
        return new efo<T>($$3.build());
    }

    @Override
    public /* synthetic */ rk b(long l2, Function function) {
        return this.a(l2, function);
    }
}

