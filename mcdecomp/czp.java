/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class czp<T extends czn> {
    private static final Logger P = LogUtils.getLogger();
    public static final czp<dai> a = czp.a("furnace", czp$b.a(dai::new, cpo.cD));
    public static final czp<czu> b = czp.a("chest", czp$b.a(czu::new, cpo.cv));
    public static final czp<dbe> c = czp.a("trapped_chest", czp$b.a(dbe::new, cpo.gV));
    public static final czp<dah> d = czp.a("ender_chest", czp$b.a(dah::new, cpo.fG));
    public static final czp<dan> e = czp.a("jukebox", czp$b.a(dan::new, cpo.dT));
    public static final czp<dae> f = czp.a("dispenser", czp$b.a(dae::new, cpo.aU));
    public static final czp<daf> g = czp.a("dropper", czp$b.a(daf::new, cpo.hi));
    public static final czp<dav> h = czp.a("sign", czp$b.a(dav::new, cpo.cE, cpo.cF, cpo.cG, cpo.cH, cpo.cI, cpo.cJ, cpo.cK, cpo.cR, cpo.cS, cpo.cT, cpo.cU, cpo.cV, cpo.cW, cpo.cX, cpo.oW, cpo.oY, cpo.oX, cpo.oZ, cpo.cL, cpo.cY, cpo.cM, cpo.cZ));
    public static final czp<daj> i = czp.a("hanging_sign", czp$b.a(daj::new, cpo.da, cpo.db, cpo.dc, cpo.dd, cpo.de, cpo.df, cpo.dg, cpo.dh, cpo.di, cpo.dj, cpo.dk, cpo.dl, cpo.dm, cpo.dn, cpo.do, cpo.dp, cpo.dq, cpo.dr, cpo.dt, cpo.du, cpo.ds, cpo.dv));
    public static final czp<daz> j = czp.a("mob_spawner", czp$b.a(daz::new, cpo.ct));
    public static final czp<dbx> k = czp.a("piston", czp$b.a(dbx::new, cpo.bQ));
    public static final czp<czq> l = czp.a("brewing_stand", czp$b.a(czq::new, cpo.fs));
    public static final czp<dag> m = czp.a("enchanting_table", czp$b.a(dag::new, cpo.fr));
    public static final czp<dbc> n = czp.a("end_portal", czp$b.a(dbc::new, cpo.fx));
    public static final czp<czi> o = czp.a("beacon", czp$b.a(czi::new, cpo.fO));
    public static final czp<dax> p = czp.a("skull", czp$b.a(dax::new, cpo.gE, cpo.gF, cpo.gM, cpo.gN, cpo.gO, cpo.gP, cpo.gI, cpo.gJ, cpo.gG, cpo.gH, cpo.gK, cpo.gL, cpo.gQ, cpo.gR));
    public static final czp<dab> q = czp.a("daylight_detector", czp$b.a(dab::new, cpo.gZ));
    public static final czp<dal> r = czp.a("hopper", czp$b.a(dal::new, cpo.hc));
    public static final czp<czy> s = czp.a("comparator", czp$b.a(czy::new, cpo.gY));
    public static final czp<czd> t = czp.a("banner", czp$b.a(czd::new, cpo.iJ, cpo.iK, cpo.iL, cpo.iM, cpo.iN, cpo.iO, cpo.iP, cpo.iQ, cpo.iR, cpo.iS, cpo.iT, cpo.iU, cpo.iV, cpo.iW, cpo.iX, cpo.iY, cpo.iZ, cpo.ja, cpo.jb, cpo.jc, cpo.jd, cpo.je, cpo.jf, cpo.jg, cpo.jh, cpo.ji, cpo.jj, cpo.jk, cpo.jl, cpo.jm, cpo.jn, cpo.jo));
    public static final czp<dba> u = czp.a("structure_block", czp$b.a(dba::new, cpo.pa));
    public static final czp<dbb> v = czp.a("end_gateway", czp$b.a(dbb::new, cpo.kF));
    public static final czp<czx> w = czp.a("command_block", czp$b.a(czx::new, cpo.fN, cpo.kH, cpo.kG));
    public static final czp<dau> x = czp.a("shulker_box", czp$b.a(dau::new, cpo.kP, cpo.lf, cpo.lb, cpo.lc, cpo.kZ, cpo.kX, cpo.ld, cpo.kT, cpo.kY, cpo.kV, cpo.kS, cpo.kR, cpo.kW, cpo.la, cpo.le, cpo.kQ, cpo.kU));
    public static final czp<czj> y = czp.a("bed", czp$b.a(czj::new, cpo.bn, cpo.bo, cpo.bk, cpo.bl, cpo.bi, cpo.bg, cpo.bm, cpo.bc, cpo.bh, cpo.be, cpo.bb, cpo.ba, cpo.bf, cpo.bj, cpo.aZ, cpo.bd));
    public static final czp<czz> z = czp.a("conduit", czp$b.a(czz::new, cpo.mX));
    public static final czp<czg> A = czp.a("barrel", czp$b.a(czg::new, cpo.nU));
    public static final czp<day> B = czp.a("smoker", czp$b.a(day::new, cpo.nV));
    public static final czp<czm> C = czp.a("blast_furnace", czp$b.a(czm::new, cpo.nW));
    public static final czp<dao> D = czp.a("lectern", czp$b.a(dao::new, cpo.oa));
    public static final czp<czl> E = czp.a("bell", czp$b.a(czl::new, cpo.od));
    public static final czp<dam> F = czp.a("jigsaw", czp$b.a(dam::new, cpo.pb));
    public static final czp<czt> G = czp.a("campfire", czp$b.a(czt::new, cpo.og, cpo.oh));
    public static final czp<czk> H = czp.a("beehive", czp$b.a(czk::new, cpo.pe, cpo.pf));
    public static final czp<das> I = czp.a("sculk_sensor", czp$b.a(das::new, cpo.qD));
    public static final czp<czs> J = czp.a("calibrated_sculk_sensor", czp$b.a(czs::new, cpo.qE));
    public static final czp<dar> K = czp.a("sculk_catalyst", czp$b.a(dar::new, cpo.qH));
    public static final czp<dat> L = czp.a("sculk_shrieker", czp$b.a(dat::new, cpo.qI));
    public static final czp<czw> M = czp.a("chiseled_bookshelf", czp$b.a(czw::new, cpo.cm));
    public static final czp<czr> N = czp.a("brushable_block", czp$b.a(czr::new, cpo.J, cpo.M));
    public static final czp<dac> O = czp.a("decorated_pot", czp$b.a(dac::new, cpo.so));
    private final a<? extends T> Q;
    private final Set<cpn> R;
    private final Type<?> S;

    @Nullable
    public static acq a(czp<?> $$0) {
        return jb.l.b($$0);
    }

    private static <T extends czn> czp<T> a(String $$0, b<T> $$1) {
        if ($$1.b.isEmpty()) {
            P.warn("Block entity type {} requires at least one valid block to be defined!", (Object)$$0);
        }
        Type<?> $$2 = ac.a(avw.l, $$0);
        return hr.a(jb.l, $$0, $$1.a($$2));
    }

    public czp(a<? extends T> $$0, Set<cpn> $$1, Type<?> $$2) {
        this.Q = $$0;
        this.R = $$1;
        this.S = $$2;
    }

    @Nullable
    public T a(gu $$0, dcb $$1) {
        return this.Q.create($$0, $$1);
    }

    public boolean a(dcb $$0) {
        return this.R.contains($$0.b());
    }

    @Nullable
    public T a(cls $$0, gu $$1) {
        czn $$2 = $$0.c_($$1);
        if ($$2 == null || $$2.u() != this) {
            return null;
        }
        return (T)$$2;
    }

    public static final class b<T extends czn> {
        private final a<? extends T> a;
        final Set<cpn> b;

        private b(a<? extends T> $$0, Set<cpn> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static <T extends czn> b<T> a(a<? extends T> $$0, cpn ... $$1) {
            return new b<T>($$0, (Set<cpn>)ImmutableSet.copyOf((Object[])$$1));
        }

        public czp<T> a(Type<?> $$0) {
            return new czp<T>(this.a, this.b, $$0);
        }
    }

    @FunctionalInterface
    static interface a<T extends czn> {
        public T create(gu var1, dcb var2);
    }
}

