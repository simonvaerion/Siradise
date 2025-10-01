/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dac
extends czn {
    public static final String a = "sherds";
    private a b = dac$a.a;

    public dac(gu $$0, dcb $$1) {
        super(czp.O, $$0, $$1);
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        this.b.a($$0);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.b = dac$a.b($$0);
    }

    public uz c() {
        return uz.a(this);
    }

    @Override
    public qr ao_() {
        return this.o();
    }

    public ha d() {
        return this.q().c(dcr.R);
    }

    public a f() {
        return this.b;
    }

    public void a(cfz $$0) {
        this.b = dac$a.b(cds.a($$0));
    }

    public /* synthetic */ uo h() {
        return this.c();
    }

    public record a(cfu b, cfu c, cfu d, cfu e) {
        public static final a a = new a(cgc.pX, cgc.pX, cgc.pX, cgc.pX);

        public qr a(qr $$0) {
            qx $$12 = new qx();
            this.a().forEach($$1 -> $$12.add(ri.a(jb.i.b((cfu)$$1).toString())));
            $$0.a(dac.a, $$12);
            return $$0;
        }

        public Stream<cfu> a() {
            return Stream.of(this.b, this.c, this.d, this.e);
        }

        public static a b(@Nullable qr $$0) {
            if ($$0 == null || !$$0.b(dac.a, 9)) {
                return a;
            }
            qx $$1 = $$0.c(dac.a, 8);
            return new a(dac$a.a($$1, 0), dac$a.a($$1, 1), dac$a.a($$1, 2), dac$a.a($$1, 3));
        }

        private static cfu a(qx $$0, int $$1) {
            if ($$1 >= $$0.size()) {
                return cgc.pX;
            }
            rk $$2 = $$0.k($$1);
            return jb.i.a(new acq($$2.m_()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "back;left;right;front", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "back;left;right;front", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "back;left;right;front", "b", "c", "d", "e"}, this, $$0);
        }
    }
}

