/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class eqd
extends epo<a> {
    public eqd(enn $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
        this.j = false;
    }

    public int a(enq<?> $$0) {
        return this.b(a.a(this.b.m, this.d, $$0));
    }

    public void a(enq<?> $$0, @Nullable enq<?> $$1) {
        this.b(a.a(this.b.m, this.d, $$0, $$1));
    }

    @Override
    public void a(enq<?>[] $$0) {
        for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
            this.a($$0[$$1], $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null);
        }
    }

    @Override
    public int b() {
        return 400;
    }

    @Override
    protected int c() {
        return super.c() + 32;
    }

    @Nullable
    public epf b(enq<?> $$0) {
        for (a $$1 : this.i()) {
            epf $$2 = $$1.a.get($$0);
            if ($$2 == null) continue;
            return $$2;
        }
        return null;
    }

    public Optional<epf> c(double $$0, double $$1) {
        for (a $$2 : this.i()) {
            for (epf $$3 : $$2.b) {
                if (!$$3.a_($$0, $$1)) continue;
                return Optional.of($$3);
            }
        }
        return Optional.empty();
    }

    protected static class a
    extends epo.a<a> {
        final Map<enq<?>, epf> a;
        final List<epf> b;

        private a(Map<enq<?>, epf> $$0) {
            this.a = $$0;
            this.b = ImmutableList.copyOf($$0.values());
        }

        public static a a(enr $$0, int $$1, enq<?> $$2) {
            return new a((Map<enq<?>, epf>)ImmutableMap.of($$2, (Object)$$2.a($$0, $$1 / 2 - 155, 0, 310)));
        }

        public static a a(enr $$0, int $$1, enq<?> $$2, @Nullable enq<?> $$3) {
            epf $$4 = $$2.a($$0, $$1 / 2 - 155, 0, 150);
            if ($$3 == null) {
                return new a((Map<enq<?>, epf>)ImmutableMap.of($$2, (Object)$$4));
            }
            return new a((Map<enq<?>, epf>)ImmutableMap.of($$2, (Object)$$4, $$3, (Object)$$3.a($$0, $$1 / 2 - 155 + 160, 0, 150)));
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$52, int $$6, int $$7, boolean $$8, float $$9) {
            this.b.forEach($$5 -> {
                $$5.f($$2);
                $$5.a($$0, $$6, $$7, $$9);
            });
        }

        @Override
        public List<? extends eqt> i() {
            return this.b;
        }

        @Override
        public List<? extends esn> b() {
            return this.b;
        }
    }
}

