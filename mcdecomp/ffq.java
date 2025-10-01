/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$ClientInfo
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$RealmInfo
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$ThirdPartyServerInfo
 *  javax.annotation.Nullable
 */
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import javax.annotation.Nullable;

public final class ffq
extends Record {
    private final String a;
    @Nullable
    private final a b;

    public ffq(String $$0, @Nullable a $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static ffq a() {
        return ffq.a(null);
    }

    public static ffq a(String $$0) {
        return ffq.a(new a.b($$0));
    }

    public static ffq a(ejq $$0) {
        return ffq.a(new a.a($$0));
    }

    public static ffq a(@Nullable a $$0) {
        return new ffq(ffq.g(), $$0);
    }

    public AbuseReportRequest.ClientInfo b() {
        return new AbuseReportRequest.ClientInfo(this.a, Locale.getDefault().toLanguageTag());
    }

    @Nullable
    public AbuseReportRequest.ThirdPartyServerInfo c() {
        a a2 = this.b;
        if (a2 instanceof a.b) {
            a.b $$0 = (a.b)a2;
            return new AbuseReportRequest.ThirdPartyServerInfo($$0.a);
        }
        return null;
    }

    @Nullable
    public AbuseReportRequest.RealmInfo d() {
        a a2 = this.b;
        if (a2 instanceof a.a) {
            a.a $$0 = (a.a)a2;
            return new AbuseReportRequest.RealmInfo(String.valueOf($$0.a()), $$0.b());
        }
        return null;
    }

    private static String g() {
        StringBuilder $$0 = new StringBuilder();
        $$0.append("1.20.1");
        if (enn.d().a()) {
            $$0.append(" (modded)");
        }
        return $$0.toString();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ffq.class, "clientVersion;server", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ffq.class, "clientVersion;server", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ffq.class, "clientVersion;server", "a", "b"}, this, $$0);
    }

    public String e() {
        return this.a;
    }

    @Nullable
    public a f() {
        return this.b;
    }

    public static interface ffq$a {

        public record a(long a, int b) implements ffq$a
        {
            public a(ejq $$0) {
                this($$0.a, $$0.n);
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "realmId;slotId", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "realmId;slotId", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "realmId;slotId", "a", "b"}, this, $$0);
            }
        }

        public static final class b
        extends Record
        implements ffq$a {
            final String a;

            public b(String $$0) {
                this.a = $$0;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "ip", "a"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "ip", "a"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "ip", "a"}, this, $$0);
            }

            public String a() {
                return this.a;
            }
        }
    }
}

