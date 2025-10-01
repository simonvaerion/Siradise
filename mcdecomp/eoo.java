/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class eoo {
    private static final int a = -1;
    private final hk<eon> b = new hk(32);
    private final Map<cpn, Set<dde<?>>> c = Maps.newHashMap();

    public static eoo a() {
        eoo $$02 = new eoo();
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return cmk.a();
            }
            return fji.a($$1, $$0.c(crr.a) == dcx.a ? $$2.d() : $$2);
        }, cpo.iI, cpo.iH);
        $$02.a(crr.a, cpo.iI, cpo.iH);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return cmk.a();
            }
            return fji.a($$1, $$2);
        }, cpo.i, cpo.bu, cpo.bt, cpo.gb);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            if ($$3 != 0) {
                if ($$1 == null || $$2 == null) {
                    return cmk.a();
                }
                return fji.a($$1, $$2);
            }
            return -1;
        }, cpo.rA);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> cmg.a(), cpo.aF);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> cmg.b(), cpo.aG);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return cmg.c();
            }
            return fji.b($$1, $$2);
        }, cpo.aE, cpo.aH, cpo.aI, cpo.aK, cpo.ff, cpo.aL);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return -1;
            }
            return fji.c($$1, $$2);
        }, cpo.G, cpo.nd, cpo.fu);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> cvo.b($$0.c(cvo.e)), cpo.cw);
        $$02.a(cvo.e, cpo.cw);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return -1;
            }
            return fji.a($$1, $$2);
        }, cpo.dS);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> 14731036, cpo.fc, cpo.fb);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            int $$4 = $$0.c(cxj.b);
            int $$5 = $$4 * 32;
            int $$6 = 255 - $$4 * 8;
            int $$7 = $$4 * 4;
            return $$5 << 16 | $$6 << 8 | $$7;
        }, cpo.fe, cpo.fd);
        $$02.a(cxj.b, cpo.fe, cpo.fd);
        $$02.a((dcb $$0, clp $$1, gu $$2, int $$3) -> {
            if ($$1 == null || $$2 == null) {
                return 7455580;
            }
            return 2129968;
        }, cpo.fm);
        return $$02;
    }

    public int a(dcb $$0, cmm $$1, gu $$2) {
        eon $$3 = this.b.a(jb.f.a($$0.b()));
        if ($$3 != null) {
            return $$3.getColor($$0, null, null, 0);
        }
        dxi $$4 = $$0.d($$1, $$2);
        return $$4 != null ? $$4.ak : -1;
    }

    public int a(dcb $$0, @Nullable clp $$1, @Nullable gu $$2, int $$3) {
        eon $$4 = this.b.a(jb.f.a($$0.b()));
        return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
    }

    public void a(eon $$0, cpn ... $$1) {
        for (cpn $$2 : $$1) {
            this.b.a($$0, jb.f.a($$2));
        }
    }

    private void a(Set<dde<?>> $$0, cpn ... $$1) {
        for (cpn $$2 : $$1) {
            this.c.put($$2, $$0);
        }
    }

    private void a(dde<?> $$0, cpn ... $$1) {
        this.a((Set<dde<?>>)ImmutableSet.of($$0), $$1);
    }

    public Set<dde<?>> a(cpn $$0) {
        return (Set)this.c.getOrDefault($$0, (Set<dde<?>>)ImmutableSet.of());
    }
}

