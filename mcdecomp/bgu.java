/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bgu {
    private static final Map<bfn<?>, a> a = Maps.newHashMap();

    private static <T extends bgb> void a(bfn<T> $$0, c $$1, dhk.a $$2, b<T> $$3) {
        a $$4 = a.put($$0, new a($$2, $$1, $$3));
        if ($$4 != null) {
            throw new IllegalStateException("Duplicate registration for type " + jb.h.b($$0));
        }
    }

    public static c a(bfn<?> $$0) {
        a $$1 = a.get($$0);
        return $$1 == null ? c.c : $$1.b;
    }

    public static dhk.a b(@Nullable bfn<?> $$0) {
        a $$1 = a.get($$0);
        return $$1 == null ? dhk.a.f : $$1.a;
    }

    public static <T extends bfj> boolean a(bfn<T> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
        a $$5 = a.get($$0);
        return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
    }

    static {
        bgu.a(bfn.f, c.b, dhk.a.f, bss::a);
        bgu.a(bfn.r, c.b, dhk.a.f, bsn::c);
        bgu.a(bfn.v, c.b, dhk.a.f, bsn::c);
        bgu.a(bfn.y, c.b, dhk.a.f, bvq::a);
        bgu.a(bfn.V, c.b, dhk.a.f, bvy::b);
        bgu.a(bfn.aB, c.b, dhk.a.f, bsn::c);
        bgu.a(bfn.aE, c.b, dhk.a.f, bsn::c);
        bgu.a(bfn.aT, c.b, dhk.a.f, bsn::c);
        bgu.a(bfn.bc, c.b, dhk.a.f, bsl::b);
        bgu.a(bfn.g, c.a, dhk.a.f, brg::b);
        bgu.a(bfn.i, c.a, dhk.a.f, bwc::c);
        bgu.a(bfn.n, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.q, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.t, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.u, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.w, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.E, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.F, c.a, dhk.a.f, bvt::b);
        bgu.a(bfn.C, c.a, dhk.a.f, bgb::a);
        bgu.a(bfn.O, c.a, dhk.a.f, bta::c);
        bgu.a(bfn.Q, c.a, dhk.a.f, bvw::b);
        bgu.a(bfn.R, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.T, c.b, dhk.a.f, bfr::a);
        bgu.a(bfn.U, c.a, dhk.a.f, btg::c);
        bgu.a(bfn.Y, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.Z, c.a, dhk.a.f, bvz::a);
        bgu.a(bfn.ac, c.a, dhk.a.f, bgb::a);
        bgu.a(bfn.aj, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.al, c.a, dhk.a.f, bwb::b);
        bgu.a(bfn.ao, c.a, dhk.a.f, bry::c);
        bgu.a(bfn.ap, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.aq, c.a, dhk.a.e, brz::c);
        bgu.a(bfn.at, c.a, dhk.a.e, bsb::c);
        bgu.a(bfn.av, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.W, c.a, dhk.a.f, bwy::c);
        bgu.a(bfn.aw, c.a, dhk.a.f, bxe::b);
        bgu.a(bfn.ay, c.a, dhk.a.f, bwd::b);
        bgu.a(bfn.az, c.a, dhk.a.f, bsd::c);
        bgu.a(bfn.aC, c.a, dhk.a.f, bsf::c);
        bgu.a(bfn.aF, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.aI, c.a, dhk.a.f, bwj::b);
        bgu.a(bfn.aJ, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.aK, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.aL, c.a, dhk.a.f, bwl::c);
        bgu.a(bfn.aO, c.a, dhk.a.f, bgb::a);
        bgu.a(bfn.aS, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.aU, c.a, dhk.a.f, bwo::a);
        bgu.a(bfn.aV, c.d, dhk.a.f, bwp::c);
        bgu.a(bfn.bd, c.a, dhk.a.f, bsm::c);
        bgu.a(bfn.bf, c.a, dhk.a.f, bgb::a);
        bgu.a(bfn.bj, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.bk, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.bl, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.bn, c.a, dhk.a.f, bso::c);
        bgu.a(bfn.bp, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.bq, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.bs, c.a, dhk.a.f, bwx::b);
        bgu.a(bfn.br, c.a, dhk.a.f, bwc::b);
        bgu.a(bfn.m, c.a, dhk.a.f, brl::b);
        bgu.a(bfn.A, c.b, dhk.a.f, bvy::b);
        bgu.a(bfn.G, c.c, dhk.a.f, bwc::b);
        bgu.a(bfn.N, c.c, dhk.a.f, brv::c);
        bgu.a(bfn.aa, c.c, dhk.a.f, bwc::b);
        bgu.a(bfn.as, c.c, dhk.a.f, brl::b);
        bgu.a(bfn.au, c.c, dhk.a.f, bgb::a);
        bgu.a(bfn.aD, c.c, dhk.a.f, bwc::b);
        bgu.a(bfn.aG, c.c, dhk.a.f, bgb::a);
        bgu.a(bfn.ba, c.c, dhk.a.f, brl::b);
        bgu.a(bfn.be, c.c, dhk.a.f, bwc::b);
        bgu.a(bfn.bg, c.c, dhk.a.f, bwc::b);
        bgu.a(bfn.bh, c.c, dhk.a.f, bgb::a);
        bgu.a(bfn.bi, c.c, dhk.a.f, bgb::a);
    }

    static class a {
        final dhk.a a;
        final c b;
        final b<?> c;

        public a(dhk.a $$0, c $$1, b<?> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        public static final /* enum */ c d = new c();
        private static final /* synthetic */ c[] e;

        public static c[] values() {
            return (c[])e.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c, d};
        }

        static {
            e = bgu$c.a();
        }
    }

    @FunctionalInterface
    public static interface b<T extends bfj> {
        public boolean test(bfn<T> var1, cnb var2, bgd var3, gu var4, apf var5);
    }
}

