/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bhc {
    private final bhb a;
    private final Map<bhe.a, Set<bhe>> b = Maps.newEnumMap(bhe.a.class);
    private final Map<UUID, bhe> c = new Object2ObjectArrayMap();
    private final Set<bhe> d = new ObjectArraySet();
    private double e;
    private boolean f = true;
    private double g;
    private final Consumer<bhc> h;

    public bhc(bhb $$0, Consumer<bhc> $$1) {
        this.a = $$0;
        this.h = $$1;
        this.e = $$0.a();
    }

    public bhb a() {
        return this.a;
    }

    public double b() {
        return this.e;
    }

    public void a(double $$0) {
        if ($$0 == this.e) {
            return;
        }
        this.e = $$0;
        this.d();
    }

    public Set<bhe> a(bhe.a $$02) {
        return this.b.computeIfAbsent($$02, $$0 -> Sets.newHashSet());
    }

    public Set<bhe> c() {
        return ImmutableSet.copyOf(this.c.values());
    }

    @Nullable
    public bhe a(UUID $$0) {
        return this.c.get($$0);
    }

    public boolean a(bhe $$0) {
        return this.c.get($$0.a()) != null;
    }

    private void e(bhe $$0) {
        bhe $$1 = this.c.putIfAbsent($$0.a(), $$0);
        if ($$1 != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        this.a($$0.c()).add($$0);
        this.d();
    }

    public void b(bhe $$0) {
        this.e($$0);
    }

    public void c(bhe $$0) {
        this.e($$0);
        this.d.add($$0);
    }

    protected void d() {
        this.f = true;
        this.h.accept(this);
    }

    public void d(bhe $$0) {
        this.a($$0.c()).remove($$0);
        this.c.remove($$0.a());
        this.d.remove($$0);
        this.d();
    }

    public void b(UUID $$0) {
        bhe $$1 = this.a($$0);
        if ($$1 != null) {
            this.d($$1);
        }
    }

    public boolean c(UUID $$0) {
        bhe $$1 = this.a($$0);
        if ($$1 != null && this.d.contains($$1)) {
            this.d($$1);
            return true;
        }
        return false;
    }

    public void e() {
        for (bhe $$0 : this.c()) {
            this.d($$0);
        }
    }

    public double f() {
        if (this.f) {
            this.g = this.h();
            this.f = false;
        }
        return this.g;
    }

    private double h() {
        double $$0 = this.b();
        for (bhe $$1 : this.b(bhe.a.a)) {
            $$0 += $$1.d();
        }
        double $$2 = $$0;
        for (bhe $$3 : this.b(bhe.a.b)) {
            $$2 += $$0 * $$3.d();
        }
        for (bhe $$4 : this.b(bhe.a.c)) {
            $$2 *= 1.0 + $$4.d();
        }
        return this.a.a($$2);
    }

    private Collection<bhe> b(bhe.a $$0) {
        return this.b.getOrDefault((Object)$$0, Collections.emptySet());
    }

    public void a(bhc $$02) {
        this.e = $$02.e;
        this.c.clear();
        this.c.putAll($$02.c);
        this.d.clear();
        this.d.addAll($$02.d);
        this.b.clear();
        $$02.b.forEach(($$0, $$1) -> this.a((bhe.a)((Object)$$0)).addAll((Collection<bhe>)$$1));
        this.d();
    }

    public qr g() {
        qr $$0 = new qr();
        $$0.a("Name", jb.v.b(this.a).toString());
        $$0.a("Base", this.e);
        if (!this.d.isEmpty()) {
            qx $$1 = new qx();
            for (bhe $$2 : this.d) {
                $$1.add($$2.e());
            }
            $$0.a("Modifiers", $$1);
        }
        return $$0;
    }

    public void a(qr $$0) {
        this.e = $$0.k("Base");
        if ($$0.b("Modifiers", 9)) {
            qx $$1 = $$0.c("Modifiers", 10);
            for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
                bhe $$3 = bhe.a($$1.a($$2));
                if ($$3 == null) continue;
                this.c.put($$3.a(), $$3);
                this.a($$3.c()).add($$3);
                this.d.add($$3);
            }
        }
        this.d();
    }
}

