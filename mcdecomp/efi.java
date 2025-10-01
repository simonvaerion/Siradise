/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class efi {
    public boolean a(@Nullable efi $$0) {
        if ($$0 == null) {
            return false;
        }
        return this == $$0;
    }

    public abstract String b();

    public abstract tj d(sw var1);

    public abstract boolean i();

    public abstract boolean h();

    public abstract b j();

    public abstract n n();

    public abstract Collection<String> g();

    public abstract b k();

    public abstract a l();

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("always", 0);
        public static final /* enum */ a b = new a("never", 1);
        public static final /* enum */ a c = new a("pushOtherTeams", 2);
        public static final /* enum */ a d = new a("pushOwnTeam", 3);
        private static final Map<String, a> g;
        public final String e;
        public final int f;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        @Nullable
        public static a a(String $$0) {
            return g.get($$0);
        }

        private a(String $$0, int $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        public sw a() {
            return sw.c("team.collision." + this.e);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            h = efi$a.b();
            g = Arrays.stream(efi$a.values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> $$0));
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("always", 0);
        public static final /* enum */ b b = new b("never", 1);
        public static final /* enum */ b c = new b("hideForOtherTeams", 2);
        public static final /* enum */ b d = new b("hideForOwnTeam", 3);
        private static final Map<String, b> g;
        public final String e;
        public final int f;
        private static final /* synthetic */ b[] h;

        public static b[] values() {
            return (b[])h.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        public static String[] a() {
            return g.keySet().toArray(new String[0]);
        }

        @Nullable
        public static b a(String $$0) {
            return g.get($$0);
        }

        private b(String $$0, int $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        public sw b() {
            return sw.c("team.visibility." + this.e);
        }

        private static /* synthetic */ b[] c() {
            return new b[]{a, b, c, d};
        }

        static {
            h = efi$b.c();
            g = Arrays.stream(efi$b.values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> $$0));
        }
    }
}

