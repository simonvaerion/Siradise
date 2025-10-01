/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public class fne
implements fnd.a {
    private final enn a;
    private static final int b = 32;
    private static final float c = 1.0f;
    private final List<a> d = Lists.newArrayList();
    private final List<b> e = Lists.newArrayList();

    public fne(enn $$0) {
        this.a = $$0;
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$22, double $$3, double $$4) {
        few $$52 = this.a.s;
        if ($$52 == null) {
            this.d.clear();
            this.e.clear();
            return;
        }
        eei $$62 = new eei($$22, 0.0, $$4);
        this.d.removeIf(a::a);
        this.e.removeIf($$2 -> $$2.a($$52, $$62));
        ein $$7 = $$1.getBuffer(fkf.x());
        for (b $$8 : this.e) {
            $$8.a($$52).ifPresent($$6 -> {
                double $$7 = $$6.a() - (double)$$8.b();
                double $$8 = $$6.b() - (double)$$8.b();
                double $$9 = $$6.c() - (double)$$8.b();
                double $$10 = $$6.a() + (double)$$8.b();
                double $$11 = $$6.b() + (double)$$8.b();
                double $$12 = $$6.c() + (double)$$8.b();
                fjv.a($$0, $$7, eey.a(new eed($$7, $$8, $$9, $$10, $$11, $$12)), -$$22, -$$3, -$$4, 1.0f, 1.0f, 0.0f, 0.35f, true);
            });
        }
        ein $$9 = $$1.getBuffer(fkf.z());
        for (b $$10 : this.e) {
            $$10.a($$52).ifPresent($$5 -> fjv.b($$0, $$9, $$5.a() - 0.25 - $$22, $$5.b() - $$3, $$5.c() - 0.25 - $$4, $$5.a() + 0.25 - $$22, $$5.b() - $$3 + 1.0, $$5.c() + 0.25 - $$4, 1.0f, 1.0f, 0.0f, 0.35f));
        }
        for (b $$11 : this.e) {
            $$11.a($$52).ifPresent($$2 -> {
                fnd.a($$0, $$1, "Listener Origin", $$2.a(), $$2.b() + (double)1.8f, $$2.c(), -1, 0.025f);
                fnd.a($$0, $$1, gu.a($$2).toString(), $$2.a(), $$2.b() + 1.5, $$2.c(), -6959665, 0.025f);
            });
        }
        for (a $$12 : this.d) {
            eei $$13 = $$12.c;
            double $$14 = 0.2f;
            double $$15 = $$13.c - (double)0.2f;
            double $$16 = $$13.d - (double)0.2f;
            double $$17 = $$13.e - (double)0.2f;
            double $$18 = $$13.c + (double)0.2f;
            double $$19 = $$13.d + (double)0.2f + 0.5;
            double $$20 = $$13.e + (double)0.2f;
            fne.a($$0, $$1, new eed($$15, $$16, $$17, $$18, $$19, $$20), 1.0f, 1.0f, 1.0f, 0.2f);
            fnd.a($$0, $$1, $$12.b.a(), $$13.c, $$13.d + (double)0.85f, $$13.e, -7564911, 0.0075f);
        }
    }

    private static void a(eij $$0, fjx $$1, eed $$2, float $$3, float $$4, float $$5, float $$6) {
        emz $$7 = enn.N().j.m();
        if (!$$7.h()) {
            return;
        }
        eei $$8 = $$7.b().e();
        fnd.a($$0, $$1, $$2.c($$8), $$3, $$4, $$5, $$6);
    }

    public void a(dgl $$0, eei $$1) {
        this.d.add(new a(ac.b(), $$0, $$1));
    }

    public void a(dgp $$0, int $$1) {
        this.e.add(new b($$0, $$1));
    }

    static class b
    implements dgn {
        public final dgp a;
        public final int b;

        public b(dgp $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public boolean a(cmm $$0, eei $$12) {
            return this.a.a($$0).filter($$1 -> $$1.g($$12) <= 1024.0).isPresent();
        }

        public Optional<eei> a(cmm $$0) {
            return this.a.a($$0);
        }

        @Override
        public dgp a() {
            return this.a;
        }

        @Override
        public int b() {
            return this.b;
        }

        @Override
        public boolean a(aif $$0, dgl $$1, dgl.a $$2, eei $$3) {
            return false;
        }
    }

    static final class a
    extends Record {
        private final long a;
        final dgl b;
        final eei c;

        a(long $$0, dgl $$1, eei $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public boolean a() {
            return ac.b() - this.a > 3000L;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "timeStamp;gameEvent;position", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "timeStamp;gameEvent;position", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "timeStamp;gameEvent;position", "a", "b", "c"}, this, $$0);
        }

        public long b() {
            return this.a;
        }

        public dgl c() {
            return this.b;
        }

        public eei d() {
            return this.c;
        }
    }
}

