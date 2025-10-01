/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fmy
implements fnd.a {
    private static final boolean a = true;
    private static final boolean b = true;
    private static final boolean c = true;
    private static final boolean d = true;
    private static final boolean e = true;
    private static final boolean f = false;
    private static final boolean g = true;
    private static final boolean h = true;
    private static final boolean i = true;
    private static final boolean j = true;
    private static final boolean k = true;
    private static final boolean l = true;
    private static final boolean m = true;
    private static final boolean n = true;
    private static final int o = 30;
    private static final int p = 30;
    private static final int q = 8;
    private static final int r = 20;
    private static final float s = 0.02f;
    private static final int t = -1;
    private static final int u = -256;
    private static final int v = -23296;
    private static final int w = -16711936;
    private static final int x = -3355444;
    private static final int y = -98404;
    private static final int z = -65536;
    private final enn A;
    private final Map<gu, b> B = Maps.newHashMap();
    private final Map<UUID, a> C = Maps.newHashMap();
    private UUID D;

    public fmy(enn $$0) {
        this.A = $$0;
    }

    @Override
    public void a() {
        this.B.clear();
        this.C.clear();
        this.D = null;
    }

    public void a(b $$0) {
        this.B.put($$0.a, $$0);
    }

    public void a(a $$0) {
        this.C.put($$0.a, $$0);
    }

    public void a(int $$0) {
        this.C.values().removeIf($$1 -> $$1.b == $$0);
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        this.c();
        this.b();
        this.a($$0, $$1);
        if (!this.A.t.G_()) {
            this.g();
        }
    }

    private void b() {
        this.C.entrySet().removeIf($$0 -> this.A.s.a(((a)$$0.getValue()).b) == null);
    }

    private void c() {
        long $$0 = this.A.s.V() - 20L;
        this.B.entrySet().removeIf($$1 -> ((b)$$1.getValue()).f < $$0);
    }

    private void a(eij $$0, fjx $$1) {
        gu $$22 = this.e().c();
        this.C.values().forEach($$2 -> {
            if (this.c((a)$$2)) {
                this.b($$0, $$1, (a)$$2);
            }
        });
        this.b($$0, $$1);
        for (gu $$32 : this.B.keySet()) {
            if (!$$22.a($$32, 30.0)) continue;
            fmy.a($$0, $$1, $$32);
        }
        Map<gu, Set<UUID>> $$42 = this.d();
        this.B.values().forEach($$4 -> {
            if ($$22.a($$4.a, 30.0)) {
                Set $$5 = (Set)$$42.get($$4.a);
                this.a($$0, $$1, (b)$$4, $$5 == null ? Sets.newHashSet() : $$5);
            }
        });
        this.f().forEach(($$3, $$4) -> {
            if ($$22.a((hz)$$3, 30.0)) {
                this.a($$0, $$1, (gu)$$3, (List<String>)$$4);
            }
        });
    }

    private Map<gu, Set<UUID>> d() {
        HashMap $$0 = Maps.newHashMap();
        this.C.values().forEach($$1 -> $$1.i.forEach($$2 -> $$0.computeIfAbsent($$2, $$0 -> Sets.newHashSet()).add($$1.a())));
        return $$0;
    }

    private void b(eij $$0, fjx $$12) {
        HashMap $$22 = Maps.newHashMap();
        this.C.values().stream().filter(a::c).forEach($$1 -> $$22.computeIfAbsent($$1.f, $$0 -> Sets.newHashSet()).add($$1.a()));
        $$22.entrySet().forEach($$2 -> {
            gu $$3 = (gu)$$2.getKey();
            Set $$4 = (Set)$$2.getValue();
            Set $$5 = $$4.stream().map(yz::a).collect(Collectors.toSet());
            int $$6 = 1;
            fmy.a($$0, $$12, $$5.toString(), $$3, $$6++, -256);
            fmy.a($$0, $$12, "Flower", $$3, $$6++, -1);
            float $$7 = 0.05f;
            fnd.a($$0, $$12, $$3, 0.05f, 0.8f, 0.8f, 0.0f, 0.3f);
        });
    }

    private static String a(Collection<UUID> $$0) {
        if ($$0.isEmpty()) {
            return "-";
        }
        if ($$0.size() > 3) {
            return $$0.size() + " bees";
        }
        return $$0.stream().map(yz::a).collect(Collectors.toSet()).toString();
    }

    private static void a(eij $$0, fjx $$1, gu $$2) {
        float $$3 = 0.05f;
        fnd.a($$0, $$1, $$2, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
    }

    private void a(eij $$0, fjx $$1, gu $$2, List<String> $$3) {
        float $$4 = 0.05f;
        fnd.a($$0, $$1, $$2, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
        fmy.a($$0, $$1, "" + $$3, $$2, 0, -256);
        fmy.a($$0, $$1, "Ghost Hive", $$2, 1, -65536);
    }

    private void a(eij $$0, fjx $$1, b $$2, Collection<UUID> $$3) {
        int $$4 = 0;
        if (!$$3.isEmpty()) {
            fmy.a($$0, $$1, "Blacklisted by " + fmy.a($$3), $$2, $$4++, -65536);
        }
        fmy.a($$0, $$1, "Out: " + fmy.a(this.a($$2.a)), $$2, $$4++, -3355444);
        if ($$2.c == 0) {
            fmy.a($$0, $$1, "In: -", $$2, $$4++, -256);
        } else if ($$2.c == 1) {
            fmy.a($$0, $$1, "In: 1 bee", $$2, $$4++, -256);
        } else {
            fmy.a($$0, $$1, "In: " + $$2.c + " bees", $$2, $$4++, -256);
        }
        fmy.a($$0, $$1, "Honey: " + $$2.d, $$2, $$4++, -23296);
        fmy.a($$0, $$1, $$2.b + ($$2.e ? " (sedated)" : ""), $$2, $$4++, -1);
    }

    private void a(eij $$0, fjx $$1, a $$2) {
        if ($$2.d != null) {
            fnl.a($$0, $$1, $$2.d, 0.5f, false, false, this.e().b().a(), this.e().b().b(), this.e().b().c());
        }
    }

    private void b(eij $$0, fjx $$1, a $$2) {
        boolean $$3 = this.b($$2);
        int $$4 = 0;
        fmy.a($$0, $$1, $$2.c, $$4++, $$2.toString(), -1, 0.03f);
        if ($$2.e == null) {
            fmy.a($$0, $$1, $$2.c, $$4++, "No hive", -98404, 0.02f);
        } else {
            fmy.a($$0, $$1, $$2.c, $$4++, "Hive: " + this.a($$2, $$2.e), -256, 0.02f);
        }
        if ($$2.f == null) {
            fmy.a($$0, $$1, $$2.c, $$4++, "No flower", -98404, 0.02f);
        } else {
            fmy.a($$0, $$1, $$2.c, $$4++, "Flower: " + this.a($$2, $$2.f), -256, 0.02f);
        }
        for (String $$5 : $$2.h) {
            fmy.a($$0, $$1, $$2.c, $$4++, $$5, -16711936, 0.02f);
        }
        if ($$3) {
            this.a($$0, $$1, $$2);
        }
        if ($$2.g > 0) {
            int $$6 = $$2.g < 600 ? -3355444 : -23296;
            fmy.a($$0, $$1, $$2.c, $$4++, "Travelling: " + $$2.g + " ticks", $$6, 0.02f);
        }
    }

    private static void a(eij $$0, fjx $$1, String $$2, b $$3, int $$4, int $$5) {
        gu $$6 = $$3.a;
        fmy.a($$0, $$1, $$2, $$6, $$4, $$5);
    }

    private static void a(eij $$0, fjx $$1, String $$2, gu $$3, int $$4, int $$5) {
        double $$6 = 1.3;
        double $$7 = 0.2;
        double $$8 = (double)$$3.u() + 0.5;
        double $$9 = (double)$$3.v() + 1.3 + (double)$$4 * 0.2;
        double $$10 = (double)$$3.w() + 0.5;
        fnd.a($$0, $$1, $$2, $$8, $$9, $$10, $$5, 0.02f, true, 0.0f, true);
    }

    private static void a(eij $$0, fjx $$1, ho $$2, int $$3, String $$4, int $$5, float $$6) {
        double $$7 = 2.4;
        double $$8 = 0.25;
        gu $$9 = gu.a($$2);
        double $$10 = (double)$$9.u() + 0.5;
        double $$11 = $$2.b() + 2.4 + (double)$$3 * 0.25;
        double $$12 = (double)$$9.w() + 0.5;
        float $$13 = 0.5f;
        fnd.a($$0, $$1, $$4, $$10, $$11, $$12, $$5, $$6, false, 0.5f, true);
    }

    private emz e() {
        return this.A.j.m();
    }

    private Set<String> b(b $$0) {
        return this.a($$0.a).stream().map(yz::a).collect(Collectors.toSet());
    }

    private String a(a $$0, gu $$1) {
        double $$2 = Math.sqrt($$1.b($$0.c));
        double $$3 = (double)Math.round($$2 * 10.0) / 10.0;
        return $$1.x() + " (dist " + $$3 + ")";
    }

    private boolean b(a $$0) {
        return Objects.equals(this.D, $$0.a);
    }

    private boolean c(a $$0) {
        fiy $$1 = this.A.t;
        gu $$2 = gu.a($$1.dn(), $$0.c.b(), $$1.dt());
        gu $$3 = gu.a($$0.c);
        return $$2.a($$3, 30.0);
    }

    private Collection<UUID> a(gu $$0) {
        return this.C.values().stream().filter($$1 -> $$1.a($$0)).map(a::a).collect(Collectors.toSet());
    }

    private Map<gu, List<String>> f() {
        HashMap $$02 = Maps.newHashMap();
        for (a $$1 : this.C.values()) {
            if ($$1.e == null || this.B.containsKey($$1.e)) continue;
            $$02.computeIfAbsent($$1.e, $$0 -> Lists.newArrayList()).add($$1.b());
        }
        return $$02;
    }

    private void g() {
        fnd.a(this.A.al(), 8).ifPresent($$0 -> {
            this.D = $$0.ct();
        });
    }

    public static class b {
        public final gu a;
        public final String b;
        public final int c;
        public final int d;
        public final boolean e;
        public final long f;

        public b(gu $$0, String $$1, int $$2, int $$3, boolean $$4, long $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }
    }

    public static class a {
        public final UUID a;
        public final int b;
        public final ho c;
        @Nullable
        public final dxt d;
        @Nullable
        public final gu e;
        @Nullable
        public final gu f;
        public final int g;
        public final List<String> h = Lists.newArrayList();
        public final Set<gu> i = Sets.newHashSet();

        public a(UUID $$0, int $$1, ho $$2, @Nullable dxt $$3, @Nullable gu $$4, @Nullable gu $$5, int $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        public boolean a(gu $$0) {
            return this.e != null && this.e.equals($$0);
        }

        public UUID a() {
            return this.a;
        }

        public String b() {
            return yz.a(this.a);
        }

        public String toString() {
            return this.b();
        }

        public boolean c() {
            return this.f != null;
        }
    }
}

