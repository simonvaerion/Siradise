/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cac {
    private final cab a;
    private final List<a> b = Lists.newArrayList();

    public cac(cab $$0) {
        this.a = $$0;
    }

    public cac a(int $$0, bzz $$1) {
        this.b.add(new a($$0, $$1));
        return this;
    }

    public cab a() {
        this.b.stream().map(a::b).collect(Collectors.toSet()).forEach(this.a::a);
        this.b.forEach($$0 -> {
            bzz $$12 = $$0.b();
            this.a.c($$12).forEach($$1 -> $$1.a($$0.a(), 0.0f));
            this.a.b($$12).a($$0.a(), 1.0f);
        });
        return this.a;
    }

    static class a {
        private final int a;
        private final bzz b;

        public a(int $$0, bzz $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public int a() {
            return this.a;
        }

        public bzz b() {
            return this.b;
        }
    }
}

