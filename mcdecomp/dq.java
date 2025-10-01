/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import javax.annotation.Nullable;

public interface dq {
    public static final dq a = new dq(){

        @Override
        @Nullable
        public tl a(String $$0) {
            return null;
        }
    };

    @Nullable
    public tl a(String var1);

    public static final class a
    extends Record
    implements dq {
        private final Map<String, tl> b;

        public a(Map<String, tl> $$0) {
            this.b = $$0;
        }

        @Override
        @Nullable
        public tl a(String $$0) {
            return this.b.get($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "arguments", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "arguments", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "arguments", "b"}, this, $$0);
        }

        public Map<String, tl> a() {
            return this.b;
        }
    }
}

