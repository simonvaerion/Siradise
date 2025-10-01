/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class yt
implements uo<ur> {
    private final boolean a;
    private final Map<acq, ae.a> b;
    private final Set<acq> c;
    private final Map<acq, ag> d;

    public yt(boolean $$0, Collection<ae> $$1, Set<acq> $$2, Map<acq, ag> $$3) {
        this.a = $$0;
        ImmutableMap.Builder $$4 = ImmutableMap.builder();
        for (ae $$5 : $$1) {
            $$4.put((Object)$$5.j(), (Object)$$5.a());
        }
        this.b = $$4.build();
        this.c = ImmutableSet.copyOf($$2);
        this.d = ImmutableMap.copyOf($$3);
    }

    public yt(sf $$0) {
        this.a = $$0.readBoolean();
        this.b = $$0.a(sf::t, ae.a::b);
        this.c = $$0.a(Sets::newLinkedHashSetWithExpectedSize, sf::t);
        this.d = $$0.a(sf::t, ag::b);
    }

    @Override
    public void a(sf $$02) {
        $$02.writeBoolean(this.a);
        $$02.a(this.b, sf::a, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
        $$02.a(this.c, sf::a);
        $$02.a(this.d, sf::a, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    public Map<acq, ae.a> a() {
        return this.b;
    }

    public Set<acq> c() {
        return this.c;
    }

    public Map<acq, ag> d() {
        return this.d;
    }

    public boolean e() {
        return this.a;
    }
}

