/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface esv {
    public esx a();

    public record a(esx a) implements esv
    {
        private final esx a;

        @Override
        public esx a() {
            return this.a.a() == esw.b ? this.a : esx.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "direction", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "direction", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "direction", "a"}, this, $$0);
        }

        public esx b() {
            return this.a;
        }
    }

    public static class b
    implements esv {
        @Override
        public esx a() {
            return esx.b;
        }
    }

    public record c(boolean a) implements esv
    {
        private final boolean a;

        @Override
        public esx a() {
            return this.a ? esx.b : esx.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "forward", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "forward", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "forward", "a"}, this, $$0);
        }

        public boolean b() {
            return this.a;
        }
    }
}

