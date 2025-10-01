/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class efg {
    private static final Logger g = LogUtils.getLogger();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 18;
    public static final int f = 19;
    private final Map<String, efd> h = Maps.newHashMap();
    private final Map<efj, List<efd>> i = Maps.newHashMap();
    private final Map<String, Map<efd, eff>> j = Maps.newHashMap();
    private final efd[] k = new efd[19];
    private final Map<String, efe> l = Maps.newHashMap();
    private final Map<String, efe> m = Maps.newHashMap();
    @Nullable
    private static String[] n;

    public boolean b(String $$0) {
        return this.h.containsKey($$0);
    }

    public efd c(String $$0) {
        return this.h.get($$0);
    }

    @Nullable
    public efd d(@Nullable String $$0) {
        return this.h.get($$0);
    }

    public efd a(String $$02, efj $$1, sw $$2, efj.a $$3) {
        if (this.h.containsKey($$02)) {
            throw new IllegalArgumentException("An objective with the name '" + $$02 + "' already exists!");
        }
        efd $$4 = new efd(this, $$02, $$1, $$2, $$3);
        this.i.computeIfAbsent($$1, $$0 -> Lists.newArrayList()).add($$4);
        this.h.put($$02, $$4);
        this.a($$4);
        return $$4;
    }

    public final void a(efj $$0, String $$1, Consumer<eff> $$22) {
        this.i.getOrDefault($$0, Collections.emptyList()).forEach($$2 -> $$22.accept(this.c($$1, (efd)$$2)));
    }

    public boolean b(String $$0, efd $$1) {
        Map<efd, eff> $$2 = this.j.get($$0);
        if ($$2 == null) {
            return false;
        }
        eff $$3 = $$2.get($$1);
        return $$3 != null;
    }

    public eff c(String $$02, efd $$12) {
        Map $$2 = this.j.computeIfAbsent($$02, $$0 -> Maps.newHashMap());
        return $$2.computeIfAbsent($$12, $$1 -> {
            eff $$2 = new eff(this, (efd)$$1, $$02);
            $$2.b(0);
            return $$2;
        });
    }

    public Collection<eff> i(efd $$0) {
        ArrayList $$1 = Lists.newArrayList();
        for (Map<efd, eff> $$2 : this.j.values()) {
            eff $$3 = $$2.get($$0);
            if ($$3 == null) continue;
            $$1.add($$3);
        }
        $$1.sort(eff.a);
        return $$1;
    }

    public Collection<efd> c() {
        return this.h.values();
    }

    public Collection<String> d() {
        return this.h.keySet();
    }

    public Collection<String> e() {
        return Lists.newArrayList(this.j.keySet());
    }

    public void d(String $$0, @Nullable efd $$1) {
        if ($$1 == null) {
            Map<efd, eff> $$2 = this.j.remove($$0);
            if ($$2 != null) {
                this.a($$0);
            }
        } else {
            Map<efd, eff> $$3 = this.j.get($$0);
            if ($$3 != null) {
                eff $$4 = $$3.remove($$1);
                if ($$3.size() < 1) {
                    Map<efd, eff> $$5 = this.j.remove($$0);
                    if ($$5 != null) {
                        this.a($$0);
                    }
                } else if ($$4 != null) {
                    this.a($$0, $$1);
                }
            }
        }
    }

    public Map<efd, eff> e(String $$0) {
        HashMap $$1 = this.j.get($$0);
        if ($$1 == null) {
            $$1 = Maps.newHashMap();
        }
        return $$1;
    }

    public void j(efd $$0) {
        this.h.remove($$0.b());
        for (int $$1 = 0; $$1 < 19; ++$$1) {
            if (this.a($$1) != $$0) continue;
            this.a($$1, null);
        }
        List<efd> $$2 = this.i.get($$0.c());
        if ($$2 != null) {
            $$2.remove($$0);
        }
        for (Map<efd, eff> $$3 : this.j.values()) {
            $$3.remove($$0);
        }
        this.c($$0);
    }

    public void a(int $$0, @Nullable efd $$1) {
        this.k[$$0] = $$1;
    }

    @Nullable
    public efd a(int $$0) {
        return this.k[$$0];
    }

    @Nullable
    public efe f(String $$0) {
        return this.l.get($$0);
    }

    public efe g(String $$0) {
        efe $$1 = this.f($$0);
        if ($$1 != null) {
            g.warn("Requested creation of existing team '{}'", (Object)$$0);
            return $$1;
        }
        $$1 = new efe(this, $$0);
        this.l.put($$0, $$1);
        this.a($$1);
        return $$1;
    }

    public void d(efe $$0) {
        this.l.remove($$0.b());
        for (String $$1 : $$0.g()) {
            this.m.remove($$1);
        }
        this.c($$0);
    }

    public boolean a(String $$0, efe $$1) {
        if (this.i($$0) != null) {
            this.h($$0);
        }
        this.m.put($$0, $$1);
        return $$1.g().add($$0);
    }

    public boolean h(String $$0) {
        efe $$1 = this.i($$0);
        if ($$1 != null) {
            this.b($$0, $$1);
            return true;
        }
        return false;
    }

    public void b(String $$0, efe $$1) {
        if (this.i($$0) != $$1) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.b() + "'.");
        }
        this.m.remove($$0);
        $$1.g().remove($$0);
    }

    public Collection<String> f() {
        return this.l.keySet();
    }

    public Collection<efe> g() {
        return this.l.values();
    }

    @Nullable
    public efe i(String $$0) {
        return this.m.get($$0);
    }

    public void a(efd $$0) {
    }

    public void b(efd $$0) {
    }

    public void c(efd $$0) {
    }

    public void a(eff $$0) {
    }

    public void a(String $$0) {
    }

    public void a(String $$0, efd $$1) {
    }

    public void a(efe $$0) {
    }

    public void b(efe $$0) {
    }

    public void c(efe $$0) {
    }

    public static String b(int $$0) {
        n $$1;
        switch ($$0) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        if ($$0 >= 3 && $$0 <= 18 && ($$1 = n.a($$0 - 3)) != null && $$1 != n.v) {
            return "sidebar.team." + $$1.g();
        }
        return null;
    }

    public static int j(String $$0) {
        String $$1;
        n $$2;
        if ("list".equalsIgnoreCase($$0)) {
            return 0;
        }
        if ("sidebar".equalsIgnoreCase($$0)) {
            return 1;
        }
        if ("belowName".equalsIgnoreCase($$0)) {
            return 2;
        }
        if ($$0.startsWith("sidebar.team.") && ($$2 = n.b($$1 = $$0.substring("sidebar.team.".length()))) != null && $$2.b() >= 0) {
            return $$2.b() + 3;
        }
        return -1;
    }

    public static String[] h() {
        if (n == null) {
            n = new String[19];
            for (int $$0 = 0; $$0 < 19; ++$$0) {
                efg.n[$$0] = efg.b($$0);
            }
        }
        return n;
    }

    public void a(bfj $$0) {
        if ($$0 == null || $$0 instanceof byo || $$0.bs()) {
            return;
        }
        String $$1 = $$0.cu();
        this.d($$1, null);
        this.h($$1);
    }

    protected qx i() {
        qx $$0 = new qx();
        this.j.values().stream().map(Map::values).forEach($$12 -> $$12.stream().filter($$0 -> $$0.d() != null).forEach($$1 -> {
            qr $$2 = new qr();
            $$2.a("Name", $$1.e());
            $$2.a("Objective", $$1.d().b());
            $$2.a("Score", $$1.b());
            $$2.a("Locked", $$1.g());
            $$0.add($$2);
        }));
        return $$0;
    }

    protected void a(qx $$0) {
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            qr $$2 = $$0.a($$1);
            efd $$3 = this.c($$2.l("Objective"));
            String $$4 = $$2.l("Name");
            eff $$5 = this.c($$4, $$3);
            $$5.b($$2.h("Score"));
            if (!$$2.e("Locked")) continue;
            $$5.a($$2.q("Locked"));
        }
    }
}

