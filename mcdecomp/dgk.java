/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class dgk
implements dgo {
    private final List<dgn> b = Lists.newArrayList();
    private final Set<dgn> c = Sets.newHashSet();
    private final List<dgn> d = Lists.newArrayList();
    private boolean e;
    private final aif f;
    private final int g;
    private final a h;

    public dgk(aif $$0, int $$1, a $$2) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
    }

    @Override
    public boolean a() {
        return this.b.isEmpty();
    }

    @Override
    public void a(dgn $$0) {
        if (this.e) {
            this.d.add($$0);
        } else {
            this.b.add($$0);
        }
        za.a((cmm)this.f, $$0);
    }

    @Override
    public void b(dgn $$0) {
        if (this.e) {
            this.c.add($$0);
        } else {
            this.b.remove($$0);
        }
        if (this.b.isEmpty()) {
            this.h.apply(this.g);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(dgl $$0, eei $$1, dgl.a $$2, dgo.a $$3) {
        this.e = true;
        boolean $$4 = false;
        try {
            Iterator<dgn> $$5 = this.b.iterator();
            while ($$5.hasNext()) {
                dgn $$6 = $$5.next();
                if (this.c.remove($$6)) {
                    $$5.remove();
                    continue;
                }
                Optional<eei> $$7 = dgk.a(this.f, $$1, $$6);
                if (!$$7.isPresent()) continue;
                $$3.visit($$6, $$7.get());
                $$4 = true;
            }
        }
        finally {
            this.e = false;
        }
        if (!this.d.isEmpty()) {
            this.b.addAll(this.d);
            this.d.clear();
        }
        if (!this.c.isEmpty()) {
            this.b.removeAll(this.c);
            this.c.clear();
        }
        return $$4;
    }

    private static Optional<eei> a(aif $$0, eei $$1, dgn $$2) {
        int $$5;
        Optional<eei> $$3 = $$2.a().a($$0);
        if ($$3.isEmpty()) {
            return Optional.empty();
        }
        double $$4 = $$3.get().g($$1);
        if ($$4 > (double)($$5 = $$2.b() * $$2.b())) {
            return Optional.empty();
        }
        return $$3;
    }

    @FunctionalInterface
    public static interface a {
        public void apply(int var1);
    }
}

