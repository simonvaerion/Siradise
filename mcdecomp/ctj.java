/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class ctj
extends cpn {
    private final cpn a;
    private static final Map<cpn, cpn> b = Maps.newIdentityHashMap();
    private static final Map<dcb, dcb> c = Maps.newIdentityHashMap();
    private static final Map<dcb, dcb> d = Maps.newIdentityHashMap();

    public ctj(cpn $$0, dca.d $$1) {
        super($$1.e($$0.t() / 2.0f).f(0.75f));
        this.a = $$0;
        b.put($$0, this);
    }

    public cpn a() {
        return this.a;
    }

    public static boolean h(dcb $$0) {
        return b.containsKey($$0.b());
    }

    private void a(aif $$0, gu $$1) {
        bwj $$2 = bfn.aI.a($$0);
        if ($$2 != null) {
            $$2.b((double)$$1.u() + 0.5, $$1.v(), (double)$$1.w() + 0.5, 0.0f, 0.0f);
            $$0.b($$2);
            $$2.O();
        }
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$1.X().b(cmi.g) && cki.a(ckk.v, $$3) == 0) {
            this.a($$1, $$2);
        }
    }

    public static dcb n(dcb $$0) {
        return ctj.a(c, $$0, () -> b.get($$0.b()).n());
    }

    public dcb o(dcb $$0) {
        return ctj.a(d, $$0, () -> this.a().n());
    }

    private static dcb a(Map<dcb, dcb> $$0, dcb $$12, Supplier<dcb> $$2) {
        return $$0.computeIfAbsent($$12, $$1 -> {
            dcb $$2 = (dcb)$$2.get();
            for (dde<?> $$3 : $$1.B()) {
                $$2 = $$2.b($$3) ? (dcb)$$2.a($$3, $$1.c($$3)) : $$2;
            }
            return $$2;
        });
    }
}

