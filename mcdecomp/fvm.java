/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public class fvm {
    private static final b[] a = new b[]{new b("textures/entity/player/slim/alex.png", fvm$a.a), new b("textures/entity/player/slim/ari.png", fvm$a.a), new b("textures/entity/player/slim/efe.png", fvm$a.a), new b("textures/entity/player/slim/kai.png", fvm$a.a), new b("textures/entity/player/slim/makena.png", fvm$a.a), new b("textures/entity/player/slim/noor.png", fvm$a.a), new b("textures/entity/player/slim/steve.png", fvm$a.a), new b("textures/entity/player/slim/sunny.png", fvm$a.a), new b("textures/entity/player/slim/zuri.png", fvm$a.a), new b("textures/entity/player/wide/alex.png", fvm$a.b), new b("textures/entity/player/wide/ari.png", fvm$a.b), new b("textures/entity/player/wide/efe.png", fvm$a.b), new b("textures/entity/player/wide/kai.png", fvm$a.b), new b("textures/entity/player/wide/makena.png", fvm$a.b), new b("textures/entity/player/wide/noor.png", fvm$a.b), new b("textures/entity/player/wide/steve.png", fvm$a.b), new b("textures/entity/player/wide/sunny.png", fvm$a.b), new b("textures/entity/player/wide/zuri.png", fvm$a.b)};

    public static acq a() {
        return a[6].a();
    }

    public static acq a(UUID $$0) {
        return fvm.c((UUID)$$0).a;
    }

    public static String b(UUID $$0) {
        return fvm.c((UUID)$$0).b.c;
    }

    private static b c(UUID $$0) {
        return a[Math.floorMod($$0.hashCode(), a.length)];
    }

    static final class b
    extends Record {
        final acq a;
        final a b;

        public b(String $$0, a $$1) {
            this(new acq($$0), $$1);
        }

        private b(acq $$0, a $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "texture;model", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "texture;model", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "texture;model", "a", "b"}, this, $$0);
        }

        public acq a() {
            return this.a;
        }

        public a b() {
            return this.b;
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("slim");
        public static final /* enum */ a b = new a("default");
        final String c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.c = $$0;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = fvm$a.a();
        }
    }
}

