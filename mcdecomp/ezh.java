/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ezh {
    private static final int a = 44;
    private final List<c> b;

    ezh(List<c> $$0) {
        this.b = $$0;
    }

    public void a() {
        this.b.forEach(c::a);
    }

    public static a a(int $$0) {
        return new a($$0);
    }

    public static class a {
        final int a;
        private final List<d> b = new ArrayList<d>();
        int c;
        int d = 4;
        int e;
        Optional<b> f = Optional.empty();

        public a(int $$0) {
            this.a = $$0;
        }

        void a() {
            ++this.e;
        }

        public d a(sw $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
            d $$3 = new d($$0, $$1, $$2, 44);
            this.b.add($$3);
            return $$3;
        }

        public a a(int $$0) {
            this.c = $$0;
            return this;
        }

        public a b(int $$0) {
            this.d = $$0;
            return this;
        }

        public ezh a(Consumer<esi> $$0) {
            esf $$1 = new esf().b(this.d);
            $$1.a(esl.a(this.a - 44), 0, 0);
            $$1.a(esl.a(44), 0, 1);
            ArrayList<c> $$2 = new ArrayList<c>();
            this.e = 0;
            for (d $$3 : this.b) {
                $$2.add($$3.a(this, $$1, 0));
            }
            $$1.c();
            $$0.accept($$1);
            ezh $$4 = new ezh($$2);
            $$4.a();
            return $$4;
        }

        public a a(int $$0, boolean $$1) {
            this.f = Optional.of(new b($$0, $$1));
            return this;
        }
    }

    static final class b
    extends Record {
        final int a;
        final boolean b;

        b(int $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "maxInfoRows;alwaysMaxHeight", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "maxInfoRows;alwaysMaxHeight", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "maxInfoRows;alwaysMaxHeight", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    record c(epp<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
        private final epp<Boolean> a;
        private final BooleanSupplier b;
        @Nullable
        private final BooleanSupplier c;

        public void a() {
            this.a.a(this.b.getAsBoolean());
            if (this.c != null) {
                this.a.r = this.c.getAsBoolean();
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "button;stateSupplier;isActiveCondition", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "button;stateSupplier;isActiveCondition", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "button;stateSupplier;isActiveCondition", "a", "b", "c"}, this, $$0);
        }

        public epp<Boolean> b() {
            return this.a;
        }

        public BooleanSupplier c() {
            return this.b;
        }

        @Nullable
        public BooleanSupplier d() {
            return this.c;
        }
    }

    public static class d {
        private final sw a;
        private final BooleanSupplier b;
        private final Consumer<Boolean> c;
        @Nullable
        private sw d;
        @Nullable
        private BooleanSupplier e;
        private final int f;

        d(sw $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.f = $$3;
        }

        public d a(BooleanSupplier $$0) {
            this.e = $$0;
            return this;
        }

        public d a(sw $$0) {
            this.d = $$0;
            return this;
        }

        c a(a $$02, esf $$12, int $$2) {
            boolean $$6;
            $$02.a();
            eqk $$32 = new eqk(this.a, enn.N().h).e();
            $$12.a($$32, $$02.e, $$2, $$12.a().a(0.0f, 0.5f).b($$02.c));
            Optional<b> $$4 = $$02.f;
            epp.a<Boolean> $$5 = epp.b(this.b.getAsBoolean());
            $$5.a();
            boolean bl2 = $$6 = this.d != null && !$$4.isPresent();
            if ($$6) {
                eqp $$7 = eqp.a(this.d);
                $$5.a((Boolean)((Object)((enq.l<Boolean>)$$1 -> $$7)));
            }
            if (this.d != null && !$$6) {
                $$5.a((epp<T> $$0) -> sv.a(this.a, $$0.b(), this.d));
            } else {
                $$5.a((epp<T> $$0) -> sv.a(new sw[]{this.a, $$0.b()}));
            }
            epp<Boolean> $$8 = $$5.a(0, 0, this.f, 20, sw.h(), ($$0, $$1) -> this.c.accept((Boolean)$$1));
            if (this.e != null) {
                $$8.r = this.e.getAsBoolean();
            }
            $$12.a($$8, $$02.e, $$2 + 1, $$12.a().c());
            if (this.d != null) {
                $$4.ifPresent($$3 -> {
                    tj $$4 = this.d.e().a(n.h);
                    eov $$5 = enn.N().h;
                    eqa $$6 = new eqa($$4, $$5);
                    $$6.i($$0.a - $$0.c - this.f);
                    $$6.j($$3.a());
                    $$02.a();
                    int $$7 = $$3.b ? $$5.b * $$3.a - $$6.h() : 0;
                    $$12.a($$6, $$0.e, $$2, $$12.a().c(-$$0.d).e($$7));
                });
            }
            return new c($$8, this.b, this.e);
        }
    }
}

