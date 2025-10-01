/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class su {
    private final a a;
    private final String b;

    public su(a $$0, String $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        su $$1 = (su)$$0;
        if (this.a != $$1.a) {
            return false;
        }
        return !(this.b != null ? !this.b.equals($$1.b) : $$1.b != null);
    }

    public String toString() {
        return "ClickEvent{action=" + this.a + ", value='" + this.b + "'}";
    }

    public int hashCode() {
        int $$0 = this.a.hashCode();
        $$0 = 31 * $$0 + (this.b != null ? this.b.hashCode() : 0);
        return $$0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("open_url", true);
        public static final /* enum */ a b = new a("open_file", false);
        public static final /* enum */ a c = new a("run_command", true);
        public static final /* enum */ a d = new a("suggest_command", true);
        public static final /* enum */ a e = new a("change_page", true);
        public static final /* enum */ a f = new a("copy_to_clipboard", true);
        private static final Map<String, a> g;
        private final boolean h;
        private final String i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, boolean $$1) {
            this.i = $$0;
            this.h = $$1;
        }

        public boolean a() {
            return this.h;
        }

        public String b() {
            return this.i;
        }

        public static a a(String $$0) {
            return g.get($$0);
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            j = su$a.c();
            g = Arrays.stream(su$a.values()).collect(Collectors.toMap(a::b, $$0 -> $$0));
        }
    }
}

