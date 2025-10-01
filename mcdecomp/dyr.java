/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class dyr {
    private static final String a = "command_storage_";
    private final Map<String, a> b = Maps.newHashMap();
    private final dyu c;

    public dyr(dyu $$0) {
        this.c = $$0;
    }

    private a a(String $$0) {
        a $$1 = new a();
        this.b.put($$0, $$1);
        return $$1;
    }

    public qr a(acq $$0) {
        String $$12 = $$0.b();
        a $$2 = this.c.a((qr $$1) -> this.a($$12).b((qr)$$1), dyr.b($$12));
        return $$2 != null ? $$2.a($$0.a()) : new qr();
    }

    public void a(acq $$0, qr $$12) {
        String $$2 = $$0.b();
        this.c.a($$1 -> this.a($$2).b((qr)$$1), () -> this.a($$2), dyr.b($$2)).a($$0.a(), $$12);
    }

    public Stream<acq> a() {
        return this.b.entrySet().stream().flatMap($$0 -> ((a)$$0.getValue()).b((String)$$0.getKey()));
    }

    private static String b(String $$0) {
        return a + $$0;
    }

    static class a
    extends dyj {
        private static final String a = "contents";
        private final Map<String, qr> b = Maps.newHashMap();

        a() {
        }

        a b(qr $$0) {
            qr $$1 = $$0.p(a);
            for (String $$2 : $$1.e()) {
                this.b.put($$2, $$1.p($$2));
            }
            return this;
        }

        @Override
        public qr a(qr $$0) {
            qr $$12 = new qr();
            this.b.forEach(($$1, $$2) -> $$12.a((String)$$1, $$2.h()));
            $$0.a(a, $$12);
            return $$0;
        }

        public qr a(String $$0) {
            qr $$1 = this.b.get($$0);
            return $$1 != null ? $$1 : new qr();
        }

        public void a(String $$0, qr $$1) {
            if ($$1.g()) {
                this.b.remove($$0);
            } else {
                this.b.put($$0, $$1);
            }
            this.b();
        }

        public Stream<acq> b(String $$0) {
            return this.b.keySet().stream().map($$1 -> new acq($$0, (String)$$1));
        }
    }
}

