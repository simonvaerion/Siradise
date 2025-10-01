/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 */
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class rr
extends rs {
    private int a;
    private final Set<rm<?>> b;
    private final Deque<ru> c = new ArrayDeque<ru>();

    public rr(rt ... $$0) {
        this.a = $$0.length;
        ImmutableSet.Builder $$1 = ImmutableSet.builder();
        ru $$2 = ru.a();
        for (rt $$3 : $$0) {
            $$2.a($$3);
            $$1.add($$3.b());
        }
        this.c.push($$2);
        $$1.add(qr.b);
        this.b = $$1.build();
    }

    @Override
    public rh.b b(rm<?> $$0) {
        if ($$0 != qr.b) {
            return rh.b.c;
        }
        return super.b($$0);
    }

    @Override
    public rh.a a(rm<?> $$0) {
        ru $$1 = this.c.element();
        if (this.e() > $$1.b()) {
            return super.a($$0);
        }
        if (this.a <= 0) {
            return rh.a.d;
        }
        if (!this.b.contains($$0)) {
            return rh.a.b;
        }
        return super.a($$0);
    }

    @Override
    public rh.a a(rm<?> $$0, String $$1) {
        ru $$3;
        ru $$2 = this.c.element();
        if (this.e() > $$2.b()) {
            return super.a($$0, $$1);
        }
        if ($$2.c().remove($$1, $$0)) {
            --this.a;
            return super.a($$0, $$1);
        }
        if ($$0 == qr.b && ($$3 = $$2.d().get($$1)) != null) {
            this.c.push($$3);
            return super.a($$0, $$1);
        }
        return rh.a.b;
    }

    @Override
    public rh.b b() {
        if (this.e() == this.c.element().b()) {
            this.c.pop();
        }
        return super.b();
    }

    public int c() {
        return this.a;
    }
}

