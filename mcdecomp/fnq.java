/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Set;

public class fnq
implements fnd.a {
    private static final int a = 60;
    private final Set<hx> b = Sets.newHashSet();

    fnq() {
    }

    @Override
    public void a() {
        this.b.clear();
    }

    public void a(hx $$0) {
        this.b.add($$0);
    }

    public void b(hx $$0) {
        this.b.remove($$0);
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$32, double $$4) {
        gu $$5 = gu.a($$2, $$32, $$4);
        this.b.forEach($$3 -> {
            if ($$5.a($$3.q(), 60.0)) {
                fnq.a($$0, $$1, $$3);
            }
        });
    }

    private static void a(eij $$0, fjx $$1, hx $$2) {
        boolean $$3 = true;
        gu $$4 = $$2.q();
        gu $$5 = $$4.b(-1, -1, -1);
        gu $$6 = $$4.b(1, 1, 1);
        fnd.a($$0, $$1, $$5, $$6, 0.2f, 1.0f, 0.2f, 0.15f);
    }
}

