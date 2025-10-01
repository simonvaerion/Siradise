/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fd
implements Predicate<dcf> {
    private final dcb a;
    private final Set<dde<?>> b;
    @Nullable
    private final qr c;

    public fd(dcb $$0, Set<dde<?>> $$1, @Nullable qr $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public dcb a() {
        return this.a;
    }

    public Set<dde<?>> b() {
        return this.b;
    }

    public boolean a(dcf $$0) {
        dcb $$1 = $$0.a();
        if (!$$1.a(this.a.b())) {
            return false;
        }
        for (dde<?> $$2 : this.b) {
            if ($$1.c($$2) == this.a.c($$2)) continue;
            return false;
        }
        if (this.c != null) {
            czn $$3 = $$0.b();
            return $$3 != null && rd.a((rk)this.c, $$3.m(), true);
        }
        return true;
    }

    public boolean a(aif $$0, gu $$1) {
        return this.a(new dcf($$0, $$1, false));
    }

    public boolean a(aif $$0, gu $$1, int $$2) {
        czn $$4;
        dcb $$3 = cpn.b(this.a, $$0, $$1);
        if ($$3.i()) {
            $$3 = this.a;
        }
        if (!$$0.a($$1, $$3, $$2)) {
            return false;
        }
        if (this.c != null && ($$4 = $$0.c_($$1)) != null) {
            $$4.a(this.c);
        }
        return true;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dcf)object);
    }
}

