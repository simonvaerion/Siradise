/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

public class erh {
    private static final int a = 5;
    private static final int b = -1;
    final enn c;
    private final List<a<?>> d = new ArrayList();
    private final BitSet e = new BitSet(5);
    private final Deque<erg> f = Queues.newArrayDeque();

    public erh(enn $$0) {
        this.c = $$0;
    }

    public void a(eox $$02) {
        if (this.c.m.Z) {
            return;
        }
        int $$1 = $$02.a();
        this.d.removeIf($$2 -> {
            if ($$2 != null && $$2.a($$1, $$02)) {
                this.e.clear($$2.d, $$2.d + $$2.e);
                return true;
            }
            return false;
        });
        if (!this.f.isEmpty() && this.d() > 0) {
            this.f.removeIf($$0 -> {
                int $$1 = $$0.e();
                int $$2 = this.a($$1);
                if ($$2 != -1) {
                    this.d.add(new a(this, $$0, $$2, $$1));
                    this.e.set($$2, $$2 + $$1);
                    return true;
                }
                return false;
            });
        }
    }

    private int a(int $$0) {
        if (this.d() >= $$0) {
            int $$1 = 0;
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                if (this.e.get($$2)) {
                    $$1 = 0;
                    continue;
                }
                if (++$$1 != $$0) continue;
                return $$2 + 1 - $$1;
            }
        }
        return -1;
    }

    private int d() {
        return 5 - this.e.cardinality();
    }

    @Nullable
    public <T extends erg> T a(Class<? extends T> $$0, Object $$1) {
        for (a<?> $$2 : this.d) {
            if ($$2 == null || !$$0.isAssignableFrom($$2.a().getClass()) || !$$2.a().d().equals($$1)) continue;
            return (T)$$2.a();
        }
        for (erg $$3 : this.f) {
            if (!$$0.isAssignableFrom($$3.getClass()) || !$$3.d().equals($$1)) continue;
            return (T)$$3;
        }
        return null;
    }

    public void a() {
        this.e.clear();
        this.d.clear();
        this.f.clear();
    }

    public void a(erg $$0) {
        this.f.add($$0);
    }

    public enn b() {
        return this.c;
    }

    public double c() {
        return this.c.m.x().c();
    }

    class a<T extends erg> {
        private static final long b = 600L;
        private final T c;
        final int d;
        final int e;
        private long f = -1L;
        private long g = -1L;
        private erg.a h = erg.a.a;
        final /* synthetic */ erh a;

        /*
         * WARNING - Possible parameter corruption
         */
        a(T $$0, int $$1, int $$2) {
            this.a = (erh)n2;
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        public T a() {
            return this.c;
        }

        private float a(long $$0) {
            float $$1 = apa.a((float)($$0 - this.f) / 600.0f, 0.0f, 1.0f);
            $$1 *= $$1;
            if (this.h == erg.a.b) {
                return 1.0f - $$1;
            }
            return $$1;
        }

        public boolean a(int $$0, eox $$1) {
            long $$2 = ac.b();
            if (this.f == -1L) {
                this.f = $$2;
                this.h.a(this.a.c.ah());
            }
            if (this.h == erg.a.a && $$2 - this.f <= 600L) {
                this.g = $$2;
            }
            $$1.c().a();
            $$1.c().a((float)$$0 - (float)this.c.a() * this.a($$2), this.d * 32, 800.0f);
            erg.a $$3 = this.c.a($$1, this.a, $$2 - this.g);
            $$1.c().b();
            if ($$3 != this.h) {
                this.f = $$2 - (long)((int)((1.0f - this.a($$2)) * 600.0f));
                this.h = $$3;
                this.h.a(this.a.c.ah());
            }
            return this.h == erg.a.b && $$2 - this.f > 600L;
        }
    }
}

