/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class ess {
    int a;
    final Map<a, b> b = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a).thenComparing($$0 -> $$0.b));

    public void a(Consumer<esp> $$0) {
        ++this.a;
        $$0.accept(new c(0));
    }

    public String a(boolean $$0) {
        final StringBuilder $$1 = new StringBuilder();
        Consumer<String> $$22 = new Consumer<String>(){
            private boolean c = true;

            public void a(String $$0) {
                if (!this.c) {
                    $$1.append(". ");
                }
                this.c = false;
                $$1.append($$0);
            }

            @Override
            public /* synthetic */ void accept(Object object) {
                this.a((String)object);
            }
        };
        this.b.forEach(($$2, $$3) -> {
            if ($$3.b == this.a && ($$0 || !$$3.c)) {
                $$3.a.a($$22);
                $$3.c = true;
            }
        });
        return $$1.toString();
    }

    class c
    implements esp {
        private final int b;

        c(int $$0) {
            this.b = $$0;
        }

        @Override
        public void a(eso $$02, esr<?> $$1) {
            ess.this.b.computeIfAbsent(new a($$02, this.b), $$0 -> new b()).a(ess.this.a, $$1);
        }

        @Override
        public esp a() {
            return new c(this.b + 1);
        }
    }

    static class b {
        esr<?> a = esr.a;
        int b = -1;
        boolean c;

        b() {
        }

        public b a(int $$0, esr<?> $$1) {
            if (!this.a.equals($$1)) {
                this.a = $$1;
                this.c = false;
            } else if (this.b + 1 != $$0) {
                this.c = false;
            }
            this.b = $$0;
            return this;
        }
    }

    static class a {
        final eso a;
        final int b;

        a(eso $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

