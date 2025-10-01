/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class efj {
    private static final Map<String, efj> n = Maps.newHashMap();
    private static final Map<String, efj> o = Maps.newHashMap();
    public static final efj a = efj.b("dummy");
    public static final efj b = efj.b("trigger");
    public static final efj c = efj.b("deathCount");
    public static final efj d = efj.b("playerKillCount");
    public static final efj e = efj.b("totalKillCount");
    public static final efj f = efj.a("health", true, efj$a.b);
    public static final efj g = efj.a("food", true, efj$a.a);
    public static final efj h = efj.a("air", true, efj$a.a);
    public static final efj i = efj.a("armor", true, efj$a.a);
    public static final efj j = efj.a("xp", true, efj$a.a);
    public static final efj k = efj.a("level", true, efj$a.a);
    public static final efj[] l = new efj[]{efj.b("teamkill." + n.a.g()), efj.b("teamkill." + n.b.g()), efj.b("teamkill." + n.c.g()), efj.b("teamkill." + n.d.g()), efj.b("teamkill." + n.e.g()), efj.b("teamkill." + n.f.g()), efj.b("teamkill." + n.g.g()), efj.b("teamkill." + n.h.g()), efj.b("teamkill." + n.i.g()), efj.b("teamkill." + n.j.g()), efj.b("teamkill." + n.k.g()), efj.b("teamkill." + n.l.g()), efj.b("teamkill." + n.m.g()), efj.b("teamkill." + n.n.g()), efj.b("teamkill." + n.o.g()), efj.b("teamkill." + n.p.g())};
    public static final efj[] m = new efj[]{efj.b("killedByTeam." + n.a.g()), efj.b("killedByTeam." + n.b.g()), efj.b("killedByTeam." + n.c.g()), efj.b("killedByTeam." + n.d.g()), efj.b("killedByTeam." + n.e.g()), efj.b("killedByTeam." + n.f.g()), efj.b("killedByTeam." + n.g.g()), efj.b("killedByTeam." + n.h.g()), efj.b("killedByTeam." + n.i.g()), efj.b("killedByTeam." + n.j.g()), efj.b("killedByTeam." + n.k.g()), efj.b("killedByTeam." + n.l.g()), efj.b("killedByTeam." + n.m.g()), efj.b("killedByTeam." + n.n.g()), efj.b("killedByTeam." + n.o.g()), efj.b("killedByTeam." + n.p.g())};
    private final String p;
    private final boolean q;
    private final a r;

    private static efj a(String $$0, boolean $$1, a $$2) {
        efj $$3 = new efj($$0, $$1, $$2);
        n.put($$0, $$3);
        return $$3;
    }

    private static efj b(String $$0) {
        return efj.a($$0, false, efj$a.a);
    }

    protected efj(String $$0) {
        this($$0, false, efj$a.a);
    }

    protected efj(String $$0, boolean $$1, a $$2) {
        this.p = $$0;
        this.q = $$1;
        this.r = $$2;
        o.put($$0, this);
    }

    public static Set<String> c() {
        return ImmutableSet.copyOf(n.keySet());
    }

    public static Optional<efj> a(String $$0) {
        efj $$1 = o.get($$0);
        if ($$1 != null) {
            return Optional.of($$1);
        }
        int $$22 = $$0.indexOf(58);
        if ($$22 < 0) {
            return Optional.empty();
        }
        return jb.y.b(acq.a($$0.substring(0, $$22), '.')).flatMap($$2 -> efj.a($$2, acq.a($$0.substring($$22 + 1), '.')));
    }

    private static <T> Optional<efj> a(amq<T> $$0, acq $$1) {
        return $$0.a().b($$1).map($$0::b);
    }

    public String d() {
        return this.p;
    }

    public boolean e() {
        return this.q;
    }

    public a f() {
        return this.r;
    }

    public static final class a
    extends Enum<a>
    implements apr {
        public static final /* enum */ a a = new a("integer");
        public static final /* enum */ a b = new a("hearts");
        private final String d;
        public static final apr.a<a> c;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.d = $$0;
        }

        public String a() {
            return this.d;
        }

        @Override
        public String c() {
            return this.d;
        }

        public static a a(String $$0) {
            return c.a($$0, a);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            e = efj$a.b();
            c = apr.a(a::values);
        }
    }
}

