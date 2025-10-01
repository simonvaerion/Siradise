/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aii
extends dwt
implements AutoCloseable {
    public static final int a = 1000;
    private static final Logger d = LogUtils.getLogger();
    private final bcq<Runnable> e;
    private final ObjectList<Pair<a, Runnable>> f = new ObjectArrayList();
    private final ahr g;
    private final bcp<aht.a<Runnable>> h;
    private final int i = 1000;
    private final AtomicBoolean j = new AtomicBoolean();

    public aii(del $$0, ahr $$1, boolean $$2, bcq<Runnable> $$3, bcp<aht.a<Runnable>> $$4) {
        super($$0, true, $$2);
        this.g = $$1;
        this.h = $$4;
        this.e = $$3;
    }

    @Override
    public void close() {
    }

    @Override
    public int a() {
        throw ac.b(new UnsupportedOperationException("Ran automatically on a different thread!"));
    }

    @Override
    public void a(gu $$0) {
        gu $$1 = $$0.i();
        this.a(hx.a($$0.u()), hx.a($$0.w()), aii$a.a, ac.a(() -> super.a($$1), () -> "checkBlock " + $$1));
    }

    protected void a(clt $$0) {
        this.a($$0.e, $$0.f, () -> 0, aii$a.a, ac.a(() -> {
            super.b($$0, false);
            super.a($$0, false);
            for (int $$1 = this.d(); $$1 < this.e(); ++$$1) {
                super.a(cmv.b, hx.a($$0, $$1), null);
                super.a(cmv.a, hx.a($$0, $$1), null);
            }
            for (int $$2 = this.c.al(); $$2 < this.c.am(); ++$$2) {
                super.a(hx.a($$0, $$2), true);
            }
        }, () -> "updateChunkStatus " + $$0 + " true"));
    }

    @Override
    public void a(hx $$0, boolean $$1) {
        this.a($$0.a(), $$0.c(), () -> 0, aii$a.a, ac.a(() -> super.a($$0, $$1), () -> "updateSectionStatus " + $$0 + " " + $$1));
    }

    @Override
    public void b(clt $$0) {
        this.a($$0.e, $$0.f, aii$a.a, ac.a(() -> super.b($$0), () -> "propagateLight " + $$0));
    }

    @Override
    public void a(clt $$0, boolean $$1) {
        this.a($$0.e, $$0.f, aii$a.a, ac.a(() -> super.a($$0, $$1), () -> "enableLight " + $$0 + " " + $$1));
    }

    @Override
    public void a(cmv $$0, hx $$1, @Nullable ded $$2) {
        this.a($$1.a(), $$1.c(), () -> 0, aii$a.a, ac.a(() -> super.a($$0, $$1, $$2), () -> "queueData " + $$1));
    }

    private void a(int $$0, int $$1, a $$2, Runnable $$3) {
        this.a($$0, $$1, this.g.c(clt.c($$0, $$1)), $$2, $$3);
    }

    private void a(int $$0, int $$1, IntSupplier $$2, a $$3, Runnable $$4) {
        this.h.a(aht.a(() -> {
            this.f.add((Object)Pair.of((Object)((Object)$$3), (Object)$$4));
            if (this.f.size() >= 1000) {
                this.f();
            }
        }, clt.c($$0, $$1), $$2));
    }

    @Override
    public void b(clt $$0, boolean $$1) {
        this.a($$0.e, $$0.f, () -> 0, aii$a.a, ac.a(() -> super.b($$0, $$1), () -> "retainData " + $$0));
    }

    public CompletableFuture<ddx> a(ddx $$0, boolean $$12) {
        clt $$2 = $$0.f();
        this.a($$2.e, $$2.f, aii$a.a, ac.a(() -> {
            dej[] $$2 = $$0.d();
            for (int $$3 = 0; $$3 < $$0.ak(); ++$$3) {
                dej $$4 = $$2[$$3];
                if ($$4.c()) continue;
                int $$5 = this.c.g($$3);
                super.a(hx.a($$2, $$5), false);
            }
        }, () -> "initializeLight: " + $$2));
        return CompletableFuture.supplyAsync(() -> {
            super.a($$2, $$12);
            super.b($$2, false);
            return $$0;
        }, $$1 -> this.a($$0.e, $$0.f, aii$a.b, $$1));
    }

    public CompletableFuture<ddx> b(ddx $$0, boolean $$12) {
        clt $$2 = $$0.f();
        $$0.b(false);
        this.a($$2.e, $$2.f, aii$a.a, ac.a(() -> {
            if (!$$12) {
                super.b($$2);
            }
        }, () -> "lightChunk " + $$2 + " " + $$12));
        return CompletableFuture.supplyAsync(() -> {
            $$0.b(true);
            this.g.b($$2);
            return $$0;
        }, $$1 -> this.a($$0.e, $$0.f, aii$a.b, $$1));
    }

    public void b() {
        if ((!this.f.isEmpty() || super.E_()) && this.j.compareAndSet(false, true)) {
            this.e.a(() -> {
                this.f();
                this.j.set(false);
            });
        }
    }

    private void f() {
        int $$2;
        int $$0 = Math.min(this.f.size(), 1000);
        ObjectListIterator $$1 = this.f.iterator();
        for ($$2 = 0; $$1.hasNext() && $$2 < $$0; ++$$2) {
            Pair $$3 = (Pair)$$1.next();
            if ($$3.getFirst() != aii$a.a) continue;
            ((Runnable)$$3.getSecond()).run();
        }
        $$1.back($$2);
        super.a();
        for ($$2 = 0; $$1.hasNext() && $$2 < $$0; ++$$2) {
            Pair $$4 = (Pair)$$1.next();
            if ($$4.getFirst() == aii$a.b) {
                ((Runnable)$$4.getSecond()).run();
            }
            $$1.remove();
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = aii$a.a();
        }
    }
}

