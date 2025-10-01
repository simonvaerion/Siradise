/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class fyk
implements aky {
    public static final a<cfz> a = new a();
    public static final a<cfz> b = new a();
    public static final a<eyg> c = new a();
    private final Map<a<?>, c<?>> d = new HashMap();

    @Override
    public void a(akx $$0) {
        for (c<?> $$1 : this.d.values()) {
            $$1.a();
        }
    }

    public <T> void a(a<T> $$0, b<T> $$1) {
        this.d.put($$0, new c<T>($$1));
    }

    private <T> c<T> b(a<T> $$0) {
        c<?> $$1 = this.d.get($$0);
        if ($$1 == null) {
            throw new IllegalStateException("Tree builder not registered");
        }
        return $$1;
    }

    public <T> void a(a<T> $$0, List<T> $$1) {
        this.b($$0).a($$1);
    }

    public <T> fyl<T> a(a<T> $$0) {
        return this.b($$0).b;
    }

    static class c<T> {
        private final b<T> a;
        fyi<T> b = fyi.b();

        c(b<T> $$0) {
            this.a = $$0;
        }

        void a(List<T> $$0) {
            this.b = (fyi)this.a.apply($$0);
            this.b.a();
        }

        void a() {
            this.b.a();
        }
    }

    public static interface b<T>
    extends Function<List<T>, fyi<T>> {
    }

    public static class a<T> {
    }
}

