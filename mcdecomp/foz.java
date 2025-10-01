/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class foz {
    private static final Logger b = LogUtils.getLogger();
    public static final String a = "default";
    private static final Map<bfn<?>, foy<?>> c = Maps.newHashMap();
    private static final Map<String, foy<fiv>> d = ImmutableMap.of((Object)"default", $$0 -> new fty($$0, false), (Object)"slim", $$0 -> new fty($$0, true));

    private static <T extends bfj> void a(bfn<? extends T> $$0, foy<T> $$1) {
        c.put($$0, $$1);
    }

    public static Map<bfn<?>, fox<?>> a(foy.a $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        c.forEach(($$2, $$3) -> {
            try {
                $$1.put($$2, $$3.create($$0));
            }
            catch (Exception $$4) {
                throw new IllegalArgumentException("Failed to create model for " + jb.h.b((bfn<?>)$$2), $$4);
            }
        });
        return $$1.build();
    }

    public static Map<String, fox<? extends byo>> b(foy.a $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        d.forEach(($$2, $$3) -> {
            try {
                $$1.put($$2, $$3.create($$0));
            }
            catch (Exception $$4) {
                throw new IllegalArgumentException("Failed to create player model for " + $$2, $$4);
            }
        });
        return $$1.build();
    }

    public static boolean a() {
        boolean $$0 = true;
        for (bfn bfn2 : jb.h) {
            if (bfn2 == bfn.bt || c.containsKey(bfn2)) continue;
            b.warn("No renderer registered for {}", (Object)jb.h.b(bfn2));
            $$0 = false;
        }
        return !$$0;
    }

    static {
        foz.a(bfn.b, fnw::new);
        foz.a(bfn.c, fqg::new);
        foz.a(bfn.d, fnx::new);
        foz.a(bfn.e, frl::new);
        foz.a(bfn.f, fnz::new);
        foz.a(bfn.g, foa::new);
        foz.a(bfn.h, fob::new);
        foz.a(bfn.i, foc::new);
        foz.a(bfn.j, fom.a::new);
        foz.a(bfn.k, $$0 -> new fod($$0, false));
        foz.a(bfn.m, fof::new);
        foz.a(bfn.l, $$0 -> new foe($$0, fed.p));
        foz.a(bfn.n, fog::new);
        foz.a(bfn.o, $$0 -> new fod($$0, true));
        foz.a(bfn.p, $$0 -> new fqd($$0, fed.s));
        foz.a(bfn.q, foi::new);
        foz.a(bfn.r, foj::new);
        foz.a(bfn.s, $$0 -> new fqd($$0, fed.v));
        foz.a(bfn.t, fok::new);
        foz.a(bfn.u, fol::new);
        foz.a(bfn.v, fon::new);
        foz.a(bfn.w, $$0 -> new foh($$0, 0.87f, fed.H));
        foz.a(bfn.x, foo::new);
        foz.a(bfn.y, fop::new);
        foz.a(bfn.z, frj::new);
        foz.a(bfn.A, foq::new);
        foz.a(bfn.E, fou::new);
        foz.a(bfn.F, fov::new);
        foz.a(bfn.C, fot::new);
        foz.a(bfn.D, frj::new);
        foz.a(bfn.B, fos::new);
        foz.a(bfn.G, fpb::new);
        foz.a(bfn.H, fpa::new);
        foz.a(bfn.I, frj::new);
        foz.a(bfn.J, fpc::new);
        foz.a(bfn.K, $$0 -> new frj($$0, 1.0f, true));
        foz.a(bfn.L, fpd::new);
        foz.a(bfn.ag, $$0 -> new frj($$0, 3.0f, true));
        foz.a(bfn.M, fpe::new);
        foz.a(bfn.bu, fpf::new);
        foz.a(bfn.N, fpg::new);
        foz.a(bfn.O, fph::new);
        foz.a(bfn.P, $$0 -> new fqd($$0, fed.Z));
        foz.a(bfn.Q, fpi::new);
        foz.a(bfn.R, $$0 -> new fpj($$0, 6.0f));
        foz.a(bfn.S, fpv::new);
        foz.a(bfn.T, $$0 -> new fpk($$0, new fdh<bfr>($$0.a(fed.ae))));
        foz.a(bfn.U, fpl::new);
        foz.a(bfn.V, fpm::new);
        foz.a(bfn.W, fpn::new);
        foz.a(bfn.X, $$0 -> new fqd($$0, fed.ai));
        foz.a(bfn.Y, fpo::new);
        foz.a(bfn.Z, fpq::new);
        foz.a(bfn.aa, fps::new);
        foz.a(bfn.ab, fqg::new);
        foz.a(bfn.ac, fpt::new);
        foz.a(bfn.ad, fpu::new);
        foz.a(bfn.ae, fom.b::new);
        foz.a(bfn.af, fpv::new);
        foz.a(bfn.ah, fpx::new);
        foz.a(bfn.ai, fpy::new);
        foz.a(bfn.aj, $$0 -> new fqa($$0, fed.ar));
        foz.a(bfn.ak, fqb::new);
        foz.a(bfn.al, fqc::new);
        foz.a(bfn.am, fqg::new);
        foz.a(bfn.an, $$0 -> new fqd($$0, fed.av));
        foz.a(bfn.ao, fqf::new);
        foz.a(bfn.ap, $$0 -> new foh($$0, 0.92f, fed.ax));
        foz.a(bfn.aq, fqh::new);
        foz.a(bfn.ar, fqi::new);
        foz.a(bfn.as, fqj::new);
        foz.a(bfn.at, fqk::new);
        foz.a(bfn.au, fql::new);
        foz.a(bfn.av, fqm::new);
        foz.a(bfn.aw, $$0 -> new fqn($$0, fed.aD, fed.aI, fed.aJ, false));
        foz.a(bfn.ax, $$0 -> new fqn($$0, fed.aE, fed.aF, fed.aG, false));
        foz.a(bfn.ay, fqo::new);
        foz.a(bfn.az, fqp::new);
        foz.a(bfn.aA, frj::new);
        foz.a(bfn.aB, fqq::new);
        foz.a(bfn.aC, fqr::new);
        foz.a(bfn.aD, fqs::new);
        foz.a(bfn.aE, fqu::new);
        foz.a(bfn.aF, fqv::new);
        foz.a(bfn.aG, fqx::new);
        foz.a(bfn.aH, fqw::new);
        foz.a(bfn.aI, fqy::new);
        foz.a(bfn.aJ, fqz::new);
        foz.a(bfn.aK, $$0 -> new frq($$0, fed.bi));
        foz.a(bfn.aL, fra::new);
        foz.a(bfn.aM, $$0 -> new frj($$0, 0.75f, true));
        foz.a(bfn.aN, frb::new);
        foz.a(bfn.aP, frj::new);
        foz.a(bfn.aO, frc::new);
        foz.a(bfn.aQ, $$0 -> new fqd($$0, fed.bq));
        foz.a(bfn.aR, frd::new);
        foz.a(bfn.aS, fre::new);
        foz.a(bfn.aT, $$0 -> new frf($$0, new fdh($$0.a(fed.bs))));
        foz.a(bfn.aU, frg::new);
        foz.a(bfn.aV, frh::new);
        foz.a(bfn.aW, fri::new);
        foz.a(bfn.aX, fom.c::new);
        foz.a(bfn.aY, frn::new);
        foz.a(bfn.aZ, frm::new);
        foz.a(bfn.ba, $$0 -> new fqa($$0, fed.bB));
        foz.a(bfn.bb, frk::new);
        foz.a(bfn.bc, fro::new);
        foz.a(bfn.bd, frp::new);
        foz.a(bfn.be, frr::new);
        foz.a(bfn.bf, frs::new);
        foz.a(bfn.bg, frt::new);
        foz.a(bfn.bi, frv::new);
        foz.a(bfn.bh, fru::new);
        foz.a(bfn.bj, frw::new);
        foz.a(bfn.bk, frx::new);
        foz.a(bfn.bl, fry::new);
        foz.a(bfn.bm, frz::new);
        foz.a(bfn.bn, fsa::new);
        foz.a(bfn.bo, fsb::new);
        foz.a(bfn.bp, fsc::new);
        foz.a(bfn.bq, $$0 -> new frq($$0, fed.bZ));
        foz.a(bfn.br, fsd::new);
        foz.a(bfn.bs, $$0 -> new fqn($$0, fed.cf, fed.cg, fed.ch, true));
    }
}

