/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public interface eou {
    public static eou a(eqt $$0) {
        return new a($$0);
    }

    @Nullable
    public static eou a(eqs $$0, @Nullable eou $$1) {
        if ($$1 == null) {
            return null;
        }
        return new b($$0, $$1);
    }

    public static eou a(eqt $$0, eqs ... $$1) {
        eou $$2 = eou.a($$0);
        for (eqs $$3 : $$1) {
            $$2 = eou.a($$3, $$2);
        }
        return $$2;
    }

    public eqt a();

    public void a(boolean var1);

    public record a(eqt a) implements eou
    {
        @Override
        public void a(boolean $$0) {
            this.a.b_($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "component", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "component", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "component", "a"}, this, $$0);
        }
    }

    public static final class b
    extends Record
    implements eou {
        private final eqs a;
        private final eou b;

        public b(eqs $$0, eou $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void a(boolean $$0) {
            if (!$$0) {
                this.a.a((eqt)null);
            } else {
                this.a.a(this.b.a());
            }
            this.b.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "component;childPath", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "component;childPath", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "component;childPath", "a", "b"}, this, $$0);
        }

        public eqs b() {
            return this.a;
        }

        public eou c() {
            return this.b;
        }

        @Override
        public /* synthetic */ eqt a() {
            return this.b();
        }
    }
}

