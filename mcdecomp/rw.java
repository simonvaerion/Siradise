/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class rw
extends rs {
    private final Deque<ru> a = new ArrayDeque<ru>();

    public rw(rt ... $$0) {
        ru $$1 = ru.a();
        for (rt $$2 : $$0) {
            $$1.a($$2);
        }
        this.a.push($$1);
    }

    @Override
    public rh.a a(rm<?> $$0, String $$1) {
        ru $$3;
        ru $$2 = this.a.element();
        if ($$2.a($$0, $$1)) {
            return rh.a.b;
        }
        if ($$0 == qr.b && ($$3 = $$2.d().get($$1)) != null) {
            this.a.push($$3);
        }
        return super.a($$0, $$1);
    }

    @Override
    public rh.b b() {
        if (this.e() == this.a.element().b()) {
            this.a.pop();
        }
        return super.b();
    }
}

