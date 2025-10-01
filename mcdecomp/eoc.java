/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 *  javax.annotation.Nullable
 */
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class eoc {
    private final String a;
    private final String b;
    private final String c;
    private final Optional<String> d;
    private final Optional<String> e;
    private final a f;

    public eoc(String $$0, String $$1, String $$2, Optional<String> $$3, Optional<String> $$4, a $$5) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
    }

    public String a() {
        return "token:" + this.c + ":" + this.b;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public Optional<String> e() {
        return this.e;
    }

    public Optional<String> f() {
        return this.d;
    }

    @Nullable
    public UUID g() {
        try {
            return UUIDTypeAdapter.fromString((String)this.b());
        }
        catch (IllegalArgumentException $$0) {
            return null;
        }
    }

    public GameProfile h() {
        return new GameProfile(this.g(), this.c());
    }

    public a i() {
        return this.f;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("legacy");
        public static final /* enum */ a b = new a("mojang");
        public static final /* enum */ a c = new a("msa");
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

        @Nullable
        public static a a(String $$0) {
            return d.get($$0.toLowerCase(Locale.ROOT));
        }

        public String a() {
            return this.e;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c};
        }

        static {
            f = eoc$a.b();
            d = Arrays.stream(eoc$a.values()).collect(Collectors.toMap($$0 -> $$0.e, Function.identity()));
        }
    }
}

