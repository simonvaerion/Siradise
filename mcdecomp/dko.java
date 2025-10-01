/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dko<FC extends dms> {
    public static final dko<dmz> e = dko.a("no_op", new dli(dmz.a));
    public static final dko<dno> f = dko.a("tree", new dma(dno.a));
    public static final dko<dnf> g = dko.a("flower", new dlm(dnf.a));
    public static final dko<dnf> h = dko.a("no_bonemeal_flower", new dlm(dnf.a));
    public static final dko<dnf> i = dko.a("random_patch", new dlm(dnf.a));
    public static final dko<dmk> j = dko.a("block_pile", new djx(dmk.a));
    public static final dko<dnn> k = dko.a("spring_feature", new dlz(dnn.a));
    public static final dko<dmz> l = dko.a("chorus_plant", new dka(dmz.a));
    public static final dko<dng> m = dko.a("replace_single_block", new dlp(dng.a));
    public static final dko<dmz> n = dko.a("void_start_platform", new dmf(dmz.a));
    public static final dko<dmz> o = dko.a("desert_well", new dkh(dmz.a));
    public static final dko<dkt> p = dko.a("fossil", new dks(dkt.a));
    public static final dko<dmu> q = dko.a("huge_red_mushroom", new dkz(dmu.a));
    public static final dko<dmu> r = dko.a("huge_brown_mushroom", new dkw(dmu.a));
    public static final dko<dmz> s = dko.a("ice_spike", new dla(dmz.a));
    public static final dko<dmz> t = dko.a("glowstone_blob", new dkv(dmz.a));
    public static final dko<dmz> u = dko.a("freeze_top_layer", new dlx(dmz.a));
    public static final dko<dmz> v = dko.a("vines", new dme(dmz.a));
    public static final dko<dmj> w = dko.a("block_column", new djw(dmj.a));
    public static final dko<dnr> x = dko.a("vegetation_patch", new dmd(dnr.a));
    public static final dko<dnr> y = dko.a("waterlogged_vegetation_patch", new dmg(dnr.a));
    public static final dko<dni> z = dko.a("root_system", new dlq(dni.a));
    public static final dko<dmx> A = dko.a("multiface_growth", new dlg(dmx.a));
    public static final dko<dnq> B = dko.a("underwater_magma", new dmc(dnq.a));
    public static final dko<dmz> C = dko.a("monster_room", new dlf(dmz.a));
    public static final dko<dmz> D = dko.a("blue_ice", new djy(dmz.a));
    public static final dko<dml> E = dko.a("iceberg", new dlb(dml.a));
    public static final dko<dml> F = dko.a("forest_rock", new djv(dml.a));
    public static final dko<dmp> G = dko.a("disk", new dki(dmp.a));
    public static final dko<dld.a> H = dko.a("lake", new dld(dld.a.a));
    public static final dko<dna> I = dko.a("ore", new dlj(dna.a));
    public static final dko<dnm> J = dko.a("end_spike", new dly(dnm.a));
    public static final dko<dmz> K = dko.a("end_island", new dkm(dmz.a));
    public static final dko<dmr> L = dko.a("end_gateway", new dkl(dmr.a));
    public static final dlu M = dko.a("seagrass", new dlu(dnc.k));
    public static final dko<dmz> N = dko.a("kelp", new dlc(dmz.a));
    public static final dko<dmz> O = dko.a("coral_tree", new dkf(dmz.a));
    public static final dko<dmz> P = dko.a("coral_mushroom", new dke(dmz.a));
    public static final dko<dmz> Q = dko.a("coral_claw", new dkc(dmz.a));
    public static final dko<dmn> R = dko.a("sea_pickle", new dlt(dmn.a));
    public static final dko<dnk> S = dko.a("simple_block", new dlv(dnk.a));
    public static final dko<dnc> T = dko.a("bamboo", new djs(dnc.k));
    public static final dko<dkx> U = dko.a("huge_fungus", new dky(dkx.a));
    public static final dko<dmy> V = dko.a("nether_forest_vegetation", new dlh(dmy.c));
    public static final dko<dmz> W = dko.a("weeping_vines", new dmh(dmz.a));
    public static final dko<dnp> X = dko.a("twisting_vines", new dmb(dnp.a));
    public static final dko<dmm> Y = dko.a("basalt_columns", new djt(dmm.a));
    public static final dko<dmo> Z = dko.a("delta_feature", new dkg(dmo.a));
    public static final dko<dnh> aa = dko.a("netherrack_replace_blobs", new dlo(dnh.a));
    public static final dko<dmw> ab = dko.a("fill_layer", new dkr(dmw.a));
    public static final djz ac = dko.a("bonus_chest", new djz(dmz.a));
    public static final dko<dmz> ad = dko.a("basalt_pillar", new dju(dmz.a));
    public static final dko<dna> ae = dko.a("scattered_ore", new dlr(dna.a));
    public static final dko<dne> af = dko.a("random_selector", new dln(dne.a));
    public static final dko<dnl> ag = dko.a("simple_random_selector", new dlw(dnl.a));
    public static final dko<dnd> ah = dko.a("random_boolean_selector", new dll(dnd.a));
    public static final dko<dmt> ai = dko.a("geode", new dku(dmt.b));
    public static final dko<dmq> aj = dko.a("dripstone_cluster", new dkj(dmq.a));
    public static final dko<dmv> ak = dko.a("large_dripstone", new dle(dmv.a));
    public static final dko<dnb> al = dko.a("pointed_dripstone", new dlk(dnb.a));
    public static final dko<dnj> am = dko.a("sculk_patch", new dls(dnj.a));
    private final Codec<dkb<FC, dko<FC>>> a;

    private static <C extends dms, F extends dko<C>> F a(String $$0, F $$1) {
        return (F)hr.a(jb.R, $$0, $$1);
    }

    public dko(Codec<FC> $$02) {
        this.a = $$02.fieldOf("config").xmap($$0 -> new dkb<dms, dko>(this, (dms)$$0), dkb::c).codec();
    }

    public Codec<dkb<FC, dko<FC>>> a() {
        return this.a;
    }

    protected void a(cmu $$0, gu $$1, dcb $$2) {
        $$0.a($$1, $$2, 3);
    }

    public static Predicate<dcb> a(anl<cpn> $$0) {
        return $$1 -> !$$1.a($$0);
    }

    protected void a(cng $$0, gu $$1, dcb $$2, Predicate<dcb> $$3) {
        if ($$3.test($$0.a_($$1))) {
            $$0.a($$1, $$2, 2);
        }
    }

    public abstract boolean a(dkq<FC> var1);

    public boolean a(FC $$0, cng $$1, ddy $$2, apf $$3, gu $$4) {
        if ($$1.f_($$4)) {
            return this.a(new dkq<FC>(Optional.empty(), $$1, $$2, $$3, $$4, $$0));
        }
        return false;
    }

    protected static boolean a(dcb $$0) {
        return $$0.a(amw.bc);
    }

    public static boolean b(dcb $$0) {
        return $$0.a(amw.af);
    }

    public static boolean a(cms $$0, gu $$1) {
        return $$0.a($$1, dko::b);
    }

    public static boolean a(Function<gu, dcb> $$0, gu $$1, Predicate<dcb> $$2) {
        gu.a $$3 = new gu.a();
        for (ha $$4 : ha.values()) {
            $$3.a((hz)$$1, $$4);
            if (!$$2.test($$0.apply($$3))) continue;
            return true;
        }
        return false;
    }

    public static boolean a(Function<gu, dcb> $$0, gu $$1) {
        return dko.a($$0, $$1, dca.a::i);
    }

    protected void a(cng $$0, gu $$1) {
        gu.a $$2 = $$1.j();
        for (int $$3 = 0; $$3 < 2; ++$$3) {
            $$2.c(ha.b);
            if ($$0.a_($$2).i()) {
                return;
            }
            $$0.x($$2).e($$2);
        }
    }
}

