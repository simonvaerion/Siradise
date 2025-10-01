/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;

public class eqa
extends epe {
    private OptionalInt a = OptionalInt.empty();
    private OptionalInt b = OptionalInt.empty();
    private final apm<a, epz> c = ac.a((K $$1) -> {
        if ($$1.c.isPresent()) {
            return epz.a($$3, (ta)$$1.a, $$1.b, $$1.c.getAsInt());
        }
        return epz.a($$3, (ta)$$1.a, $$1.b);
    });
    private boolean d = false;

    public eqa(sw $$0, eov $$1) {
        this(0, 0, $$0, $$1);
    }

    public eqa(int $$0, int $$12, sw $$2, eov $$3) {
        super($$0, $$12, 0, 0, $$2, $$3);
        this.r = false;
    }

    public eqa h(int $$0) {
        super.a($$0);
        return this;
    }

    public eqa i(int $$0) {
        this.a = OptionalInt.of($$0);
        return this;
    }

    public eqa j(int $$0) {
        this.b = OptionalInt.of($$0);
        return this;
    }

    public eqa b(boolean $$0) {
        this.d = $$0;
        return this;
    }

    @Override
    public int k() {
        return this.c.a(this.e()).b();
    }

    @Override
    public int h() {
        return this.c.a(this.e()).a() * this.a().b;
    }

    @Override
    public void b(eox $$0, int $$1, int $$2, float $$3) {
        epz $$4 = this.c.a(this.e());
        int $$5 = this.p();
        int $$6 = this.r();
        int $$7 = this.a().b;
        int $$8 = this.b();
        if (this.d) {
            $$4.a($$0, $$5 + this.k() / 2, $$6, $$7, $$8);
        } else {
            $$4.b($$0, $$5, $$6, $$7, $$8);
        }
    }

    private a e() {
        return new a(this.l(), this.a.orElse(Integer.MAX_VALUE), this.b);
    }

    @Override
    public /* synthetic */ epe a(int n2) {
        return this.h(n2);
    }

    static final class a
    extends Record {
        final sw a;
        final int b;
        final OptionalInt c;

        a(sw $$0, int $$1, OptionalInt $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "message;maxWidth;maxRows", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "message;maxWidth;maxRows", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "message;maxWidth;maxRows", "a", "b", "c"}, this, $$0);
        }

        public sw a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public OptionalInt c() {
            return this.c;
        }
    }
}

