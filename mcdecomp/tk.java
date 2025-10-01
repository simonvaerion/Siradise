/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface tk {
    public sw a();

    public void a(aig var1, boolean var2, ss.a var3);

    public static tk a(tl $$0) {
        if ($$0.g()) {
            return new a($$0.c());
        }
        return new b($$0);
    }

    public record a(sw a) implements tk
    {
        @Override
        public void a(aig $$0, boolean $$1, ss.a $$2) {
            $$0.c.a(this.a, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "content", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "content", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "content", "a"}, this, $$0);
        }
    }

    public record b(tl a) implements tk
    {
        private final tl a;

        @Override
        public sw a() {
            return this.a.c();
        }

        @Override
        public void a(aig $$0, boolean $$1, ss.a $$2) {
            tl $$3 = this.a.a($$1);
            if (!$$3.i()) {
                $$0.c.a($$3, $$2);
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "message", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "message", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "message", "a"}, this, $$0);
        }

        public tl b() {
            return this.a;
        }
    }
}

