/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class fnf
implements fnd.a {
    private static final float a = 0.02f;
    private final Map<gu, a> b = Maps.newHashMap();

    public void a(gu $$0, int $$1, String $$2, int $$3) {
        this.b.put($$0, new a($$1, $$2, ac.b() + (long)$$3));
    }

    @Override
    public void a() {
        this.b.clear();
    }

    @Override
    public void a(eij $$0, fjx $$12, double $$22, double $$32, double $$4) {
        long $$5 = ac.b();
        this.b.entrySet().removeIf($$1 -> $$5 > ((a)$$1.getValue()).c);
        this.b.forEach(($$2, $$3) -> this.a($$0, $$12, (gu)$$2, (a)$$3));
    }

    private void a(eij $$0, fjx $$1, gu $$2, a $$3) {
        fnd.a($$0, $$1, $$2, 0.02f, $$3.a(), $$3.b(), $$3.c(), $$3.d() * 0.75f);
        if (!$$3.b.isEmpty()) {
            double $$4 = (double)$$2.u() + 0.5;
            double $$5 = (double)$$2.v() + 1.2;
            double $$6 = (double)$$2.w() + 0.5;
            fnd.a($$0, $$1, $$3.b, $$4, $$5, $$6, -1, 0.01f, true, 0.0f, true);
        }
    }

    static class a {
        public int a;
        public String b;
        public long c;

        public a(int $$0, String $$1, long $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public float a() {
            return (float)(this.a >> 16 & 0xFF) / 255.0f;
        }

        public float b() {
            return (float)(this.a >> 8 & 0xFF) / 255.0f;
        }

        public float c() {
            return (float)(this.a & 0xFF) / 255.0f;
        }

        public float d() {
            return (float)(this.a >> 24 & 0xFF) / 255.0f;
        }
    }
}

