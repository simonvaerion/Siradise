/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public interface bcs<T, F> {
    @Nullable
    public F a();

    public boolean a(T var1);

    public boolean b();

    public int c();

    public static final class a
    implements bcs<b, Runnable> {
        private final Queue<Runnable>[] a;
        private final AtomicInteger b = new AtomicInteger();

        public a(int $$0) {
            this.a = new Queue[$$0];
            for (int $$1 = 0; $$1 < $$0; ++$$1) {
                this.a[$$1] = Queues.newConcurrentLinkedQueue();
            }
        }

        @Nullable
        public Runnable d() {
            for (Queue<Runnable> $$0 : this.a) {
                Runnable $$1 = $$0.poll();
                if ($$1 == null) continue;
                this.b.decrementAndGet();
                return $$1;
            }
            return null;
        }

        @Override
        public boolean a(b $$0) {
            int $$1 = $$0.a;
            if ($$1 >= this.a.length || $$1 < 0) {
                throw new IndexOutOfBoundsException(String.format(Locale.ROOT, "Priority %d not supported. Expected range [0-%d]", $$1, this.a.length - 1));
            }
            this.a[$$1].add($$0);
            this.b.incrementAndGet();
            return true;
        }

        @Override
        public boolean b() {
            return this.b.get() == 0;
        }

        @Override
        public int c() {
            return this.b.get();
        }

        @Override
        @Nullable
        public /* synthetic */ Object a() {
            return this.d();
        }
    }

    public static final class b
    implements Runnable {
        final int a;
        private final Runnable b;

        public b(int $$0, Runnable $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void run() {
            this.b.run();
        }

        public int a() {
            return this.a;
        }
    }

    public static final class c<T>
    implements bcs<T, T> {
        private final Queue<T> a;

        public c(Queue<T> $$0) {
            this.a = $$0;
        }

        @Override
        @Nullable
        public T a() {
            return this.a.poll();
        }

        @Override
        public boolean a(T $$0) {
            return this.a.add($$0);
        }

        @Override
        public boolean b() {
            return this.a.isEmpty();
        }

        @Override
        public int c() {
            return this.a.size();
        }
    }
}

