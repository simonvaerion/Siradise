/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmz
implements fnd.a {
    private static final Logger a = LogUtils.getLogger();
    private static final boolean b = true;
    private static final boolean c = false;
    private static final boolean d = false;
    private static final boolean e = false;
    private static final boolean f = false;
    private static final boolean g = false;
    private static final boolean h = false;
    private static final boolean i = false;
    private static final boolean j = true;
    private static final boolean k = false;
    private static final boolean l = true;
    private static final boolean m = true;
    private static final boolean n = true;
    private static final boolean o = true;
    private static final boolean p = true;
    private static final boolean q = true;
    private static final boolean r = true;
    private static final boolean s = true;
    private static final boolean t = true;
    private static final boolean u = true;
    private static final boolean v = true;
    private static final boolean w = true;
    private static final int x = 30;
    private static final int y = 30;
    private static final int z = 8;
    private static final float A = 0.02f;
    private static final int B = -1;
    private static final int C = -256;
    private static final int D = -16711681;
    private static final int E = -16711936;
    private static final int F = -3355444;
    private static final int G = -98404;
    private static final int H = -65536;
    private static final int I = -23296;
    private final enn J;
    private final Map<gu, b> K = Maps.newHashMap();
    private final Map<UUID, a> L = Maps.newHashMap();
    @Nullable
    private UUID M;

    public fmz(enn $$0) {
        this.J = $$0;
    }

    @Override
    public void a() {
        this.K.clear();
        this.L.clear();
        this.M = null;
    }

    public void a(b $$0) {
        this.K.put($$0.a, $$0);
    }

    public void a(gu $$0) {
        this.K.remove($$0);
    }

    public void a(gu $$0, int $$1) {
        b $$2 = this.K.get($$0);
        if ($$2 == null) {
            a.warn("Strange, setFreeTicketCount was called for an unknown POI: {}", (Object)$$0);
            return;
        }
        $$2.c = $$1;
    }

    public void a(a $$0) {
        this.L.put($$0.a, $$0);
    }

    public void a(int $$0) {
        this.L.values().removeIf($$1 -> $$1.b == $$0);
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        this.b();
        this.b($$0, $$1, $$2, $$3, $$4);
        if (!this.J.t.G_()) {
            this.d();
        }
    }

    private void b() {
        this.L.entrySet().removeIf($$0 -> {
            bfj $$1 = this.J.s.a(((a)$$0.getValue()).b);
            return $$1 == null || $$1.dD();
        });
    }

    private void b(eij $$0, fjx $$1, double $$2, double $$32, double $$42) {
        gu $$52 = gu.a($$2, $$32, $$42);
        this.L.values().forEach($$5 -> {
            if (this.c((a)$$5)) {
                this.b($$0, $$1, (a)$$5, $$2, $$32, $$42);
            }
        });
        for (gu $$6 : this.K.keySet()) {
            if (!$$52.a($$6, 30.0)) continue;
            fmz.a($$0, $$1, $$6);
        }
        this.K.values().forEach($$3 -> {
            if ($$52.a($$3.a, 30.0)) {
                this.a($$0, $$1, (b)$$3);
            }
        });
        this.c().forEach(($$3, $$4) -> {
            if ($$52.a((hz)$$3, 30.0)) {
                this.a($$0, $$1, (gu)$$3, (List<String>)$$4);
            }
        });
    }

    private static void a(eij $$0, fjx $$1, gu $$2) {
        float $$3 = 0.05f;
        fnd.a($$0, $$1, $$2, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
    }

    private void a(eij $$0, fjx $$1, gu $$2, List<String> $$3) {
        float $$4 = 0.05f;
        fnd.a($$0, $$1, $$2, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
        fmz.a($$0, $$1, "" + $$3, $$2, 0, -256);
        fmz.a($$0, $$1, "Ghost POI", $$2, 1, -65536);
    }

    private void a(eij $$0, fjx $$1, b $$2) {
        int $$3 = 0;
        Set<String> $$4 = this.b($$2);
        if ($$4.size() < 4) {
            fmz.a($$0, $$1, "Owners: " + $$4, $$2, $$3, -256);
        } else {
            fmz.a($$0, $$1, $$4.size() + " ticket holders", $$2, $$3, -256);
        }
        ++$$3;
        Set<String> $$5 = this.c($$2);
        if ($$5.size() < 4) {
            fmz.a($$0, $$1, "Candidates: " + $$5, $$2, $$3, -23296);
        } else {
            fmz.a($$0, $$1, $$5.size() + " potential owners", $$2, $$3, -23296);
        }
        fmz.a($$0, $$1, "Free tickets: " + $$2.c, $$2, ++$$3, -256);
        fmz.a($$0, $$1, $$2.b, $$2, ++$$3, -1);
    }

    private void a(eij $$0, fjx $$1, a $$2, double $$3, double $$4, double $$5) {
        if ($$2.j != null) {
            fnl.a($$0, $$1, $$2.j, 0.5f, false, false, $$3, $$4, $$5);
        }
    }

    private void b(eij $$0, fjx $$1, a $$2, double $$3, double $$4, double $$5) {
        boolean $$6 = this.b($$2);
        int $$7 = 0;
        fmz.a($$0, $$1, $$2.h, $$7, $$2.c, -1, 0.03f);
        ++$$7;
        if ($$6) {
            fmz.a($$0, $$1, $$2.h, $$7, $$2.d + " " + $$2.e + " xp", -1, 0.02f);
            ++$$7;
        }
        if ($$6) {
            int $$8 = $$2.f < $$2.g ? -23296 : -1;
            fmz.a($$0, $$1, $$2.h, $$7, "health: " + String.format(Locale.ROOT, "%.1f", Float.valueOf($$2.f)) + " / " + String.format(Locale.ROOT, "%.1f", Float.valueOf($$2.g)), $$8, 0.02f);
            ++$$7;
        }
        if ($$6 && !$$2.i.equals("")) {
            fmz.a($$0, $$1, $$2.h, $$7, $$2.i, -98404, 0.02f);
            ++$$7;
        }
        if ($$6) {
            for (String $$9 : $$2.n) {
                fmz.a($$0, $$1, $$2.h, $$7, $$9, -16711681, 0.02f);
                ++$$7;
            }
        }
        if ($$6) {
            for (String $$10 : $$2.m) {
                fmz.a($$0, $$1, $$2.h, $$7, $$10, -16711936, 0.02f);
                ++$$7;
            }
        }
        if ($$2.k) {
            fmz.a($$0, $$1, $$2.h, $$7, "Wants Golem", -23296, 0.02f);
            ++$$7;
        }
        if ($$6 && $$2.l != -1) {
            fmz.a($$0, $$1, $$2.h, $$7, "Anger Level: " + $$2.l, -98404, 0.02f);
            ++$$7;
        }
        if ($$6) {
            for (String $$11 : $$2.p) {
                if ($$11.startsWith($$2.c)) {
                    fmz.a($$0, $$1, $$2.h, $$7, $$11, -1, 0.02f);
                } else {
                    fmz.a($$0, $$1, $$2.h, $$7, $$11, -23296, 0.02f);
                }
                ++$$7;
            }
        }
        if ($$6) {
            for (String $$12 : Lists.reverse($$2.o)) {
                fmz.a($$0, $$1, $$2.h, $$7, $$12, -3355444, 0.02f);
                ++$$7;
            }
        }
        if ($$6) {
            this.a($$0, $$1, $$2, $$3, $$4, $$5);
        }
    }

    private static void a(eij $$0, fjx $$1, String $$2, b $$3, int $$4, int $$5) {
        fmz.a($$0, $$1, $$2, $$3.a, $$4, $$5);
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

    private Set<String> b(b $$0) {
        return this.b($$0.a).stream().map(yz::a).collect(Collectors.toSet());
    }

    private Set<String> c(b $$0) {
        return this.c($$0.a).stream().map(yz::a).collect(Collectors.toSet());
    }

    private boolean b(a $$0) {
        return Objects.equals(this.M, $$0.a);
    }

    private boolean c(a $$0) {
        fiy $$1 = this.J.t;
        gu $$2 = gu.a($$1.dn(), $$0.h.b(), $$1.dt());
        gu $$3 = gu.a($$0.h);
        return $$2.a($$3, 30.0);
    }

    private Collection<UUID> b(gu $$0) {
        return this.L.values().stream().filter($$1 -> $$1.a($$0)).map(a::a).collect(Collectors.toSet());
    }

    private Collection<UUID> c(gu $$0) {
        return this.L.values().stream().filter($$1 -> $$1.b($$0)).map(a::a).collect(Collectors.toSet());
    }

    private Map<gu, List<String>> c() {
        HashMap $$02 = Maps.newHashMap();
        for (a $$1 : this.L.values()) {
            for (gu $$2 : Iterables.concat($$1.q, $$1.r)) {
                if (this.K.containsKey($$2)) continue;
                $$02.computeIfAbsent($$2, $$0 -> Lists.newArrayList()).add($$1.c);
            }
        }
        return $$02;
    }

    private void d() {
        fnd.a(this.J.al(), 8).ifPresent($$0 -> {
            this.M = $$0.ct();
        });
    }

    public static class b {
        public final gu a;
        public String b;
        public int c;

        public b(gu $$0, String $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }

    public static class a {
        public final UUID a;
        public final int b;
        public final String c;
        public final String d;
        public final int e;
        public final float f;
        public final float g;
        public final ho h;
        public final String i;
        public final dxt j;
        public final boolean k;
        public final int l;
        public final List<String> m = Lists.newArrayList();
        public final List<String> n = Lists.newArrayList();
        public final List<String> o = Lists.newArrayList();
        public final List<String> p = Lists.newArrayList();
        public final Set<gu> q = Sets.newHashSet();
        public final Set<gu> r = Sets.newHashSet();

        public a(UUID $$0, int $$1, String $$2, String $$3, int $$4, float $$5, float $$6, ho $$7, String $$8, @Nullable dxt $$9, boolean $$10, int $$11) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
            this.i = $$8;
            this.j = $$9;
            this.k = $$10;
            this.l = $$11;
        }

        boolean a(gu $$0) {
            return this.q.stream().anyMatch($$0::equals);
        }

        boolean b(gu $$0) {
            return this.r.contains($$0);
        }

        public UUID a() {
            return this.a;
        }
    }
}

