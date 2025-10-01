/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bhh {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<bfn<? extends bfz>, bhf> b = ImmutableMap.builder().put(bfn.b, (Object)bsp.q().a()).put(bfn.d, (Object)bfz.dM().a()).put(bfn.f, (Object)bss.gf().a()).put(bfn.g, (Object)brg.q().a()).put(bfn.h, (Object)brm.gk().a()).put(bfn.i, (Object)bvm.q().a()).put(bfn.m, (Object)bro.gk().a()).put(bfn.l, (Object)bsx.q().a()).put(bfn.n, (Object)bvn.q().a()).put(bfn.q, (Object)brq.q().a()).put(bfn.r, (Object)bri.q().a()).put(bfn.t, (Object)brs.q().a()).put(bfn.u, (Object)bvo.q().a()).put(bfn.v, (Object)brt.fY().a()).put(bfn.w, (Object)btj.q().a()).put(bfn.y, (Object)bwv.gc().a()).put(bfn.A, (Object)bvr.q().a()).put(bfn.E, (Object)bvs.q().a()).put(bfn.F, (Object)bvt.q().a()).put(bfn.C, (Object)bub.r().a()).put(bfn.G, (Object)bvv.r().a()).put(bfn.N, (Object)brv.q().a()).put(bfn.O, (Object)bta.fY().a()).put(bfn.Q, (Object)bvw.w().a()).put(bfn.R, (Object)bvx.q().a()).put(bfn.T, (Object)bfr.fY().a()).put(bfn.U, (Object)btg.r().a()).put(bfn.V, (Object)bvy.fY().a()).put(bfn.W, (Object)bwy.q().a()).put(bfn.Y, (Object)btk.gy().a()).put(bfn.Z, (Object)bwv.gc().a()).put(bfn.aa, (Object)bwa.r().a()).put(bfn.ac, (Object)brx.q().a()).put(bfn.aj, (Object)btn.gj().a()).put(bfn.al, (Object)bwb.q().a()).put(bfn.ao, (Object)brs.q().a()).put(bfn.ap, (Object)btj.q().a()).put(bfn.aq, (Object)brz.q().a()).put(bfn.as, (Object)bsa.gj().a()).put(bfn.at, (Object)bsb.ge().a()).put(bfn.au, (Object)bwc.ge().a()).put(bfn.av, (Object)bsc.q().a()).put(bfn.aw, (Object)bxe.gf().a()).put(bfn.ax, (Object)bxh.w().a()).put(bfn.ay, (Object)bwf.r().a()).put(bfn.bt, (Object)byo.fC().a()).put(bfn.az, (Object)bsd.q().a()).put(bfn.aB, (Object)bri.q().a()).put(bfn.aC, (Object)bsf.r().a()).put(bfn.aD, (Object)bwh.q().a()).put(bfn.aE, (Object)bri.q().a()).put(bfn.aF, (Object)bsh.q().a()).put(bfn.aG, (Object)bwi.q().a()).put(bfn.aI, (Object)bwj.q().a()).put(bfn.aJ, (Object)bvl.q().a()).put(bfn.aK, (Object)btq.q().a()).put(bfn.aL, (Object)bwc.ge().a()).put(bfn.aN, (Object)btx.q().a()).put(bfn.aO, (Object)bsj.q().a()).put(bfn.aS, (Object)bwn.r().a()).put(bfn.aT, (Object)bsk.fY().a()).put(bfn.aU, (Object)bvl.q().a()).put(bfn.aV, (Object)bwp.r().a()).put(bfn.aW, (Object)btd.ga().a()).put(bfn.ba, (Object)btn.gj().a()).put(bfn.bc, (Object)bri.q().a()).put(bfn.bd, (Object)bsm.w().a()).put(bfn.be, (Object)bwq.q().a()).put(bfn.bf, (Object)byb.gh().a()).put(bfn.bg, (Object)bwr.r().a()).put(bfn.bi, (Object)bxs.q().a()).put(bfn.bh, (Object)bgb.y().a()).put(bfn.bj, (Object)bws.r().a()).put(bfn.bk, (Object)buv.r().a()).put(bfn.bl, (Object)bvl.q().a()).put(bfn.bn, (Object)bso.ge().a()).put(bfn.bo, (Object)bwu.q().a()).put(bfn.bp, (Object)bwv.gc().a()).put(bfn.bq, (Object)btu.q().a()).put(bfn.br, (Object)bwv.gc().a()).put(bfn.bs, (Object)bwx.gi().a()).build();

    public static bhf a(bfn<? extends bfz> $$0) {
        return b.get($$0);
    }

    public static boolean b(bfn<?> $$0) {
        return b.containsKey($$0);
    }

    public static void a() {
        jb.h.s().filter($$0 -> $$0.f() != bgc.h).filter($$0 -> !bhh.b($$0)).map(jb.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
    }
}

