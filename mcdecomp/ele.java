/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class ele
extends gan {
    private final euq a;
    private final a b;
    private epz c = epz.a;

    public ele(ekm $$0, euq $$1) {
        super(enf.a);
        this.a = $$1;
        this.b = ele.a($$0);
    }

    public ele(sw $$0, euq $$1) {
        super(enf.a);
        this.a = $$1;
        this.b = ele.a($$0);
    }

    public ele(sw $$0, sw $$1, euq $$2) {
        super(enf.a);
        this.a = $$2;
        this.b = ele.a($$0, $$1);
    }

    private static a a(ekm $$0) {
        ejb $$1 = $$0.c;
        if ($$1 == null) {
            return ele.a(sw.a("mco.errorMessage.realmsService", $$0.a), sw.b($$0.b));
        }
        int $$2 = $$1.b();
        String $$3 = "mco.errorMessage." + $$2;
        return ele.a(sw.a("mco.errorMessage.realmsService.realmsError", $$2), fvz.a($$3) ? sw.c($$3) : sw.a($$1.a()));
    }

    private static a a(sw $$0) {
        return ele.a(sw.c("mco.errorMessage.generic"), $$0);
    }

    private static a a(sw $$0, sw $$1) {
        return new a($$0, $$1);
    }

    @Override
    public void b() {
        this.d(epi.a(sv.h, (epi $$0) -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
        this.c = epz.a(this.i, (ta)this.b.b, this.g * 3 / 4);
    }

    @Override
    public sw au_() {
        return sw.h().b(this.b.a).f(": ").b(this.b.b);
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        $$0.a(this.i, this.b.a, this.g / 2, 80, 0xFFFFFF);
        this.c.a($$0, this.g / 2, 100, this.f.h.b, 0xFF0000);
        super.a($$0, $$1, $$2, $$3);
    }

    static final class a
    extends Record {
        final sw a;
        final sw b;

        a(sw $$0, sw $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "title;detail", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "title;detail", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "title;detail", "a", "b"}, this, $$0);
        }

        public sw a() {
            return this.a;
        }

        public sw b() {
            return this.b;
        }
    }
}

