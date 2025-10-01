/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class fng
implements fnd.a {
    private static final int a = 160;
    private final enn b;
    private final Map<Integer, List<a>> c = Maps.newHashMap();

    @Override
    public void a() {
        this.c.clear();
    }

    public void a(int $$0, List<a> $$1) {
        this.c.put($$0, $$1);
    }

    public void a(int $$0) {
        this.c.remove($$0);
    }

    public fng(enn $$0) {
        this.b = $$0;
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$32, double $$42) {
        emz $$5 = this.b.j.m();
        gu $$6 = gu.a($$5.b().c, 0.0, $$5.b().e);
        this.c.forEach(($$3, $$4) -> {
            for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
                a $$6 = (a)$$4.get($$5);
                if (!$$6.a($$6.a, 160.0)) continue;
                double $$7 = (double)$$6.a.u() + 0.5;
                double $$8 = (double)$$6.a.v() + 2.0 + (double)$$5 * 0.25;
                double $$9 = (double)$$6.a.w() + 0.5;
                int $$10 = $$6.d ? -16711936 : -3355444;
                fnd.a($$0, $$1, $$6.c, $$7, $$8, $$9, $$10);
            }
        });
    }

    public static class a {
        public final gu a;
        public final int b;
        public final String c;
        public final boolean d;

        public a(gu $$0, int $$1, String $$2, boolean $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }
    }
}

