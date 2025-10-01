/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class fhv
extends fim {
    private final fih a;

    fhv(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.B = 0.96f;
        this.a = $$7;
        this.d(1.5f);
        this.n = false;
        this.b($$7);
    }

    @Override
    public int a(float $$0) {
        return 240;
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    @Override
    public void a() {
        super.a();
        this.b(this.a);
    }

    public record a(fih a) implements fhp<iw>
    {
        public fhm a(iw $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhv $$8 = new fhv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$8.e(1.0f);
            $$8.b($$5, $$6, $$7);
            $$8.A = $$0.c();
            $$8.z = $$0.c();
            $$8.a($$1.z.a(12) + 8);
            return $$8;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "sprite", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "sprite", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "sprite", "a"}, this, $$0);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iw)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

