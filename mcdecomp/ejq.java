/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ComparisonChain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.builder.EqualsBuilder
 *  org.slf4j.Logger
 */
import com.google.common.base.Joiner;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.slf4j.Logger;

public class ejq
extends ekf {
    private static final Logger s = LogUtils.getLogger();
    public long a;
    public String b;
    public String c;
    public String d;
    public b e;
    public String f;
    public String g;
    public List<ejm> h;
    public Map<Integer, ejx> i;
    public boolean j;
    public boolean k;
    public int l;
    public c m;
    public int n;
    public String o;
    public int p;
    public String q;
    public ejt r = new ejt();

    public String a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.o;
    }

    public void a(String $$0) {
        this.c = $$0;
    }

    public void b(String $$0) {
        this.d = $$0;
    }

    public void a(eju $$0) {
        ArrayList $$1 = Lists.newArrayList();
        int $$2 = 0;
        for (String $$3 : $$0.b) {
            if ($$3.equals(enn.N().U().b())) continue;
            String $$4 = "";
            try {
                $$4 = emf.a($$3);
            }
            catch (Exception $$5) {
                s.error("Could not get name for {}", (Object)$$3, (Object)$$5);
                continue;
            }
            $$1.add($$4);
            ++$$2;
        }
        this.r.a = String.valueOf($$2);
        this.r.b = Joiner.on((char)'\n').join((Iterable)$$1);
    }

    public static ejq a(JsonObject $$0) {
        ejq $$1 = new ejq();
        try {
            $$1.a = emb.a("id", $$0, -1L);
            $$1.b = emb.a("remoteSubscriptionId", $$0, null);
            $$1.c = emb.a("name", $$0, null);
            $$1.d = emb.a("motd", $$0, null);
            $$1.e = ejq.e(emb.a("state", $$0, ejq$b.a.name()));
            $$1.f = emb.a("owner", $$0, null);
            if ($$0.get("players") != null && $$0.get("players").isJsonArray()) {
                $$1.h = ejq.a($$0.get("players").getAsJsonArray());
                ejq.a($$1);
            } else {
                $$1.h = Lists.newArrayList();
            }
            $$1.l = emb.a("daysLeft", $$0, 0);
            $$1.j = emb.a("expired", $$0, false);
            $$1.k = emb.a("expiredTrial", $$0, false);
            $$1.m = ejq.f(emb.a("worldType", $$0, ejq$c.a.name()));
            $$1.g = emb.a("ownerUUID", $$0, "");
            $$1.i = $$0.get("slots") != null && $$0.get("slots").isJsonArray() ? ejq.b($$0.get("slots").getAsJsonArray()) : ejq.e();
            $$1.o = emb.a("minigameName", $$0, null);
            $$1.n = emb.a("activeSlot", $$0, -1);
            $$1.p = emb.a("minigameId", $$0, -1);
            $$1.q = emb.a("minigameImage", $$0, null);
        }
        catch (Exception $$2) {
            s.error("Could not parse McoServer: {}", (Object)$$2.getMessage());
        }
        return $$1;
    }

    private static void a(ejq $$02) {
        $$02.h.sort(($$0, $$1) -> ComparisonChain.start().compareFalseFirst($$1.d(), $$0.d()).compare((Comparable)((Object)$$0.a().toLowerCase(Locale.ROOT)), (Comparable)((Object)$$1.a().toLowerCase(Locale.ROOT))).result());
    }

    private static List<ejm> a(JsonArray $$0) {
        ArrayList $$1 = Lists.newArrayList();
        for (JsonElement $$2 : $$0) {
            try {
                JsonObject $$3 = $$2.getAsJsonObject();
                ejm $$4 = new ejm();
                $$4.a(emb.a("name", $$3, null));
                $$4.b(emb.a("uuid", $$3, null));
                $$4.a(emb.a("operator", $$3, false));
                $$4.b(emb.a("accepted", $$3, false));
                $$4.c(emb.a("online", $$3, false));
                $$1.add($$4);
            }
            catch (Exception exception) {}
        }
        return $$1;
    }

    private static Map<Integer, ejx> b(JsonArray $$0) {
        HashMap $$1 = Maps.newHashMap();
        for (JsonElement $$2 : $$0) {
            try {
                ejx $$7;
                JsonObject $$3 = $$2.getAsJsonObject();
                JsonParser $$4 = new JsonParser();
                JsonElement $$5 = $$4.parse($$3.get("options").getAsString());
                if ($$5 == null) {
                    ejx $$6 = ejx.a();
                } else {
                    $$7 = ejx.a($$5.getAsJsonObject());
                }
                int $$8 = emb.a("slotId", $$3, -1);
                $$1.put($$8, $$7);
            }
            catch (Exception exception) {}
        }
        for (int $$9 = 1; $$9 <= 3; ++$$9) {
            if ($$1.containsKey($$9)) continue;
            $$1.put($$9, ejx.b());
        }
        return $$1;
    }

    private static Map<Integer, ejx> e() {
        HashMap $$0 = Maps.newHashMap();
        $$0.put(1, ejx.b());
        $$0.put(2, ejx.b());
        $$0.put(3, ejx.b());
        return $$0;
    }

    public static ejq c(String $$0) {
        try {
            return ejq.a(new JsonParser().parse($$0).getAsJsonObject());
        }
        catch (Exception $$1) {
            s.error("Could not parse McoServer: {}", (Object)$$1.getMessage());
            return new ejq();
        }
    }

    private static b e(String $$0) {
        try {
            return ejq$b.valueOf($$0);
        }
        catch (Exception $$1) {
            return ejq$b.a;
        }
    }

    private static c f(String $$0) {
        try {
            return ejq$c.valueOf($$0);
        }
        catch (Exception $$1) {
            return ejq$c.a;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.c, this.d, this.e, this.f, this.j});
    }

    public boolean equals(Object $$0) {
        if ($$0 == null) {
            return false;
        }
        if ($$0 == this) {
            return true;
        }
        if ($$0.getClass() != this.getClass()) {
            return false;
        }
        ejq $$1 = (ejq)$$0;
        return new EqualsBuilder().append(this.a, $$1.a).append((Object)this.c, (Object)$$1.c).append((Object)this.d, (Object)$$1.d).append((Object)this.e, (Object)$$1.e).append((Object)this.f, (Object)$$1.f).append(this.j, $$1.j).append((Object)this.m, (Object)this.m).isEquals();
    }

    public ejq d() {
        ejq $$0 = new ejq();
        $$0.a = this.a;
        $$0.b = this.b;
        $$0.c = this.c;
        $$0.d = this.d;
        $$0.e = this.e;
        $$0.f = this.f;
        $$0.h = this.h;
        $$0.i = this.a(this.i);
        $$0.j = this.j;
        $$0.k = this.k;
        $$0.l = this.l;
        $$0.r = new ejt();
        $$0.r.a = this.r.a;
        $$0.r.b = this.r.b;
        $$0.m = this.m;
        $$0.g = this.g;
        $$0.o = this.o;
        $$0.n = this.n;
        $$0.p = this.p;
        $$0.q = this.q;
        return $$0;
    }

    public Map<Integer, ejx> a(Map<Integer, ejx> $$0) {
        HashMap $$1 = Maps.newHashMap();
        for (Map.Entry<Integer, ejx> $$2 : $$0.entrySet()) {
            $$1.put($$2.getKey(), $$2.getValue().d());
        }
        return $$1;
    }

    public String a(int $$0) {
        return this.c + " (" + this.i.get($$0).a($$0) + ")";
    }

    public ffd d(String $$0) {
        return new ffd(this.c, $$0, false);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.d();
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = ejq$b.a();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        public static final /* enum */ c d = new c();
        public static final /* enum */ c e = new c();
        private static final /* synthetic */ c[] f;

        public static c[] values() {
            return (c[])f.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c, d, e};
        }

        static {
            f = ejq$c.a();
        }
    }

    public static class a
    implements Comparator<ejq> {
        private final String a;

        public a(String $$0) {
            this.a = $$0;
        }

        public int a(ejq $$0, ejq $$1) {
            return ComparisonChain.start().compareTrueFirst($$0.e == ejq$b.c, $$1.e == ejq$b.c).compareTrueFirst($$0.k, $$1.k).compareTrueFirst($$0.f.equals(this.a), $$1.f.equals(this.a)).compareFalseFirst($$0.j, $$1.j).compareTrueFirst($$0.e == ejq$b.b, $$1.e == ejq$b.b).compare($$0.a, $$1.a).result();
        }

        @Override
        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((ejq)object, (ejq)object2);
        }
    }
}

