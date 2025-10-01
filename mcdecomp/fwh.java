/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class fwh {
    public static final fwi a = new fwi();
    public static final String b = "villager";
    private final a c;

    public fwh(a $$0) {
        this.c = $$0;
    }

    public a a() {
        return this.c;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("none");
        public static final /* enum */ a b = new a("partial");
        public static final /* enum */ a c = new a("full");
        private static final Map<String, a> d;
        private final String e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.e = $$0;
        }

        public String a() {
            return this.e;
        }

        public static a a(String $$0) {
            return d.getOrDefault($$0, a);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            f = fwh$a.b();
            d = Arrays.stream(fwh$a.values()).collect(Collectors.toMap(a::a, $$0 -> $$0));
        }
    }
}

