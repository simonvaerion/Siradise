/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;

public class jk {
    private final Path a;

    public jk(Path $$0) {
        this.a = $$0;
    }

    public Path a() {
        return this.a;
    }

    public Path a(b $$0) {
        return this.a().resolve($$0.d);
    }

    public a a(b $$0, String $$1) {
        return new a(this, $$0, $$1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("data");
        public static final /* enum */ b b = new b("assets");
        public static final /* enum */ b c = new b("reports");
        final String d;
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.d = $$0;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            e = jk$b.a();
        }
    }

    public static class a {
        private final Path a;
        private final String b;

        a(jk $$0, b $$1, String $$2) {
            this.a = $$0.a($$1);
            this.b = $$2;
        }

        public Path a(acq $$0, String $$1) {
            return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
        }

        public Path a(acq $$0) {
            return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
        }
    }
}

