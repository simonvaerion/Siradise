/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Functions
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class aki {
    private final Set<akk> a;
    private Map<String, akg> b = ImmutableMap.of();
    private List<akg> c = ImmutableList.of();

    public aki(akk ... $$0) {
        this.a = ImmutableSet.copyOf((Object[])$$0);
    }

    public void a() {
        List $$0 = (List)this.c.stream().map(akg::f).collect(ImmutableList.toImmutableList());
        this.b = this.h();
        this.c = this.b($$0);
    }

    private Map<String, akg> h() {
        TreeMap $$0 = Maps.newTreeMap();
        for (akk $$12 : this.a) {
            $$12.a((akg $$1) -> $$0.put($$1.f(), $$1));
        }
        return ImmutableMap.copyOf((Map)$$0);
    }

    public void a(Collection<String> $$0) {
        this.c = this.b($$0);
    }

    public boolean a(String $$0) {
        akg $$1 = this.b.get($$0);
        if ($$1 != null && !this.c.contains($$1)) {
            ArrayList $$2 = Lists.newArrayList(this.c);
            $$2.add($$1);
            this.c = $$2;
            return true;
        }
        return false;
    }

    public boolean b(String $$0) {
        akg $$1 = this.b.get($$0);
        if ($$1 != null && this.c.contains($$1)) {
            ArrayList $$2 = Lists.newArrayList(this.c);
            $$2.remove($$1);
            this.c = $$2;
            return true;
        }
        return false;
    }

    private List<akg> b(Collection<String> $$0) {
        List $$1 = this.c($$0).collect(Collectors.toList());
        for (akg $$2 : this.b.values()) {
            if (!$$2.g() || $$1.contains($$2)) continue;
            $$2.i().a($$1, $$2, Functions.identity(), false);
        }
        return ImmutableList.copyOf($$1);
    }

    private Stream<akg> c(Collection<String> $$0) {
        return $$0.stream().map(this.b::get).filter(Objects::nonNull);
    }

    public Collection<String> b() {
        return this.b.keySet();
    }

    public Collection<akg> c() {
        return this.b.values();
    }

    public Collection<String> d() {
        return (Collection)this.c.stream().map(akg::f).collect(ImmutableSet.toImmutableSet());
    }

    public caw e() {
        return this.f().stream().map(akg::d).reduce(caw::b).orElse(caw.a());
    }

    public Collection<akg> f() {
        return this.c;
    }

    @Nullable
    public akg c(String $$0) {
        return this.b.get($$0);
    }

    public boolean d(String $$0) {
        return this.b.containsKey($$0);
    }

    public List<ajl> g() {
        return (List)this.c.stream().map(akg::e).collect(ImmutableList.toImmutableList());
    }
}

