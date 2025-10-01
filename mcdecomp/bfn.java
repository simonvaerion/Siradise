/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bfn<T extends bfj>
implements cat,
dfz<bfj, T> {
    private static final Logger bw = LogUtils.getLogger();
    public static final String a = "EntityTag";
    private final he.c<bfn<?>> bx = jb.h.f(this);
    private static final float by = 1.3964844f;
    private static final int bz = 10;
    public static final bfn<bsp> b = bfn.a("allay", bfn$a.a(bsp::new, bgc.b).a(0.35f, 0.6f).a(8).b(2));
    public static final bfn<bfg> c = bfn.a("area_effect_cloud", bfn$a.a(bfg::new, bgc.h).c().a(6.0f, 0.5f).a(10).b(Integer.MAX_VALUE));
    public static final bfn<bux> d = bfn.a("armor_stand", bfn$a.a(bux::new, bgc.h).a(0.5f, 1.975f).a(10));
    public static final bfn<byw> e = bfn.a("arrow", bfn$a.a(byw::new, bgc.h).a(0.5f, 0.5f).a(4).b(20));
    public static final bfn<bss> f = bfn.a("axolotl", bfn$a.a(bss::new, bgc.d).a(0.75f, 0.42f).a(10));
    public static final bfn<brg> g = bfn.a("bat", bfn$a.a(brg::new, bgc.c).a(0.5f, 0.9f).a(5));
    public static final bfn<brm> h = bfn.a("bee", bfn$a.a(brm::new, bgc.b).a(0.7f, 0.6f).a(8));
    public static final bfn<bvm> i = bfn.a("blaze", bfn$a.a(bvm::new, bgc.a).c().a(0.6f, 1.8f).a(8));
    public static final bfn<bfi.b> j = bfn.a("block_display", bfn$a.a(bfi.b::new, bgc.h).a(0.0f, 0.0f).a(10).b(1));
    public static final bfn<cah> k = bfn.a("boat", bfn$a.a(cah::new, bgc.h).a(1.375f, 0.5625f).a(10));
    public static final bfn<bsx> l = bfn.a("camel", bfn$a.a(bsx::new, bgc.b).a(1.7f, 2.375f).a(10));
    public static final bfn<bro> m = bfn.a("cat", bfn$a.a(bro::new, bgc.b).a(0.6f, 0.7f).a(8));
    public static final bfn<bvn> n = bfn.a("cave_spider", bfn$a.a(bvn::new, bgc.a).a(0.7f, 0.5f).a(8));
    public static final bfn<cai> o = bfn.a("chest_boat", bfn$a.a(cai::new, bgc.h).a(1.375f, 0.5625f).a(10));
    public static final bfn<cam> p = bfn.a("chest_minecart", bfn$a.a(cam::new, bgc.h).a(0.98f, 0.7f).a(8));
    public static final bfn<brq> q = bfn.a("chicken", bfn$a.a(brq::new, bgc.b).a(0.4f, 0.7f).a(10));
    public static final bfn<brr> r = bfn.a("cod", bfn$a.a(brr::new, bgc.g).a(0.5f, 0.3f).a(4));
    public static final bfn<can> s = bfn.a("command_block_minecart", bfn$a.a(can::new, bgc.h).a(0.98f, 0.7f).a(8));
    public static final bfn<brs> t = bfn.a("cow", bfn$a.a(brs::new, bgc.b).a(0.9f, 1.4f).a(10));
    public static final bfn<bvo> u = bfn.a("creeper", bfn$a.a(bvo::new, bgc.a).a(0.6f, 1.7f).a(8));
    public static final bfn<brt> v = bfn.a("dolphin", bfn$a.a(brt::new, bgc.f).a(0.9f, 0.6f));
    public static final bfn<btl> w = bfn.a("donkey", bfn$a.a(btl::new, bgc.b).a(1.3964844f, 1.5f).a(10));
    public static final bfn<byx> x = bfn.a("dragon_fireball", bfn$a.a(byx::new, bgc.h).a(1.0f, 1.0f).a(4).b(10));
    public static final bfn<bvq> y = bfn.a("drowned", bfn$a.a(bvq::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<bzo> z = bfn.a("egg", bfn$a.a(bzo::new, bgc.h).a(0.25f, 0.25f).a(4).b(10));
    public static final bfn<bvr> A = bfn.a("elder_guardian", bfn$a.a(bvr::new, bgc.a).a(1.9975f, 1.9975f).a(10));
    public static final bfn<bua> B = bfn.a("end_crystal", bfn$a.a(bua::new, bgc.h).a(2.0f, 2.0f).a(16).b(Integer.MAX_VALUE));
    public static final bfn<bub> C = bfn.a("ender_dragon", bfn$a.a(bub::new, bgc.a).c().a(16.0f, 8.0f).a(10));
    public static final bfn<bzp> D = bfn.a("ender_pearl", bfn$a.a(bzp::new, bgc.h).a(0.25f, 0.25f).a(4).b(10));
    public static final bfn<bvs> E = bfn.a("enderman", bfn$a.a(bvs::new, bgc.a).a(0.6f, 2.9f).a(8));
    public static final bfn<bvt> F = bfn.a("endermite", bfn$a.a(bvt::new, bgc.a).a(0.4f, 0.3f).a(8));
    public static final bfn<bvv> G = bfn.a("evoker", bfn$a.a(bvv::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<byy> H = bfn.a("evoker_fangs", bfn$a.a(byy::new, bgc.h).a(0.5f, 0.8f).a(6).b(2));
    public static final bfn<bzq> I = bfn.a("experience_bottle", bfn$a.a(bzq::new, bgc.h).a(0.25f, 0.25f).a(4).b(10));
    public static final bfn<bfp> J = bfn.a("experience_orb", bfn$a.a(bfp::new, bgc.h).a(0.5f, 0.5f).a(6).b(20));
    public static final bfn<byz> K = bfn.a("eye_of_ender", bfn$a.a(byz::new, bgc.h).a(0.25f, 0.25f).a(4).b(4));
    public static final bfn<bvg> L = bfn.a("falling_block", bfn$a.a(bvg::new, bgc.h).a(0.98f, 0.98f).a(10).b(20));
    public static final bfn<bzb> M = bfn.a("firework_rocket", bfn$a.a(bzb::new, bgc.h).a(0.25f, 0.25f).a(4).b(10));
    public static final bfn<brv> N = bfn.a("fox", bfn$a.a(brv::new, bgc.b).a(0.6f, 0.7f).a(8).a(cpo.oi));
    public static final bfn<bta> O = bfn.a("frog", bfn$a.a(bta::new, bgc.b).a(0.5f, 0.5f).a(10));
    public static final bfn<cao> P = bfn.a("furnace_minecart", bfn$a.a(cao::new, bgc.h).a(0.98f, 0.7f).a(8));
    public static final bfn<bvw> Q = bfn.a("ghast", bfn$a.a(bvw::new, bgc.a).c().a(4.0f, 4.0f).a(10));
    public static final bfn<bvx> R = bfn.a("giant", bfn$a.a(bvx::new, bgc.a).a(3.6f, 12.0f).a(10));
    public static final bfn<buy> S = bfn.a("glow_item_frame", bfn$a.a(buy::new, bgc.h).a(0.5f, 0.5f).a(10).b(Integer.MAX_VALUE));
    public static final bfn<bfr> T = bfn.a("glow_squid", bfn$a.a(bfr::new, bgc.e).a(0.8f, 0.8f).a(10));
    public static final bfn<btg> U = bfn.a("goat", bfn$a.a(btg::new, bgc.b).a(0.9f, 1.3f).a(10));
    public static final bfn<bvy> V = bfn.a("guardian", bfn$a.a(bvy::new, bgc.a).a(0.85f, 0.85f).a(8));
    public static final bfn<bwy> W = bfn.a("hoglin", bfn$a.a(bwy::new, bgc.a).a(1.3964844f, 1.4f).a(8));
    public static final bfn<cap> X = bfn.a("hopper_minecart", bfn$a.a(cap::new, bgc.h).a(0.98f, 0.7f).a(8));
    public static final bfn<btm> Y = bfn.a("horse", bfn$a.a(btm::new, bgc.b).a(1.3964844f, 1.6f).a(10));
    public static final bfn<bvz> Z = bfn.a("husk", bfn$a.a(bvz::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<bwa> aa = bfn.a("illusioner", bfn$a.a(bwa::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<bfu> ab = bfn.a("interaction", bfn$a.a(bfu::new, bgc.h).a(0.0f, 0.0f).a(10));
    public static final bfn<brx> ac = bfn.a("iron_golem", bfn$a.a(brx::new, bgc.h).a(1.4f, 2.7f).a(10));
    public static final bfn<bvh> ad = bfn.a("item", bfn$a.a(bvh::new, bgc.h).a(0.25f, 0.25f).a(6).b(20));
    public static final bfn<bfi.g> ae = bfn.a("item_display", bfn$a.a(bfi.g::new, bgc.h).a(0.0f, 0.0f).a(10).b(1));
    public static final bfn<bva> af = bfn.a("item_frame", bfn$a.a(bva::new, bgc.h).a(0.5f, 0.5f).a(10).b(Integer.MAX_VALUE));
    public static final bfn<bze> ag = bfn.a("fireball", bfn$a.a(bze::new, bgc.h).a(1.0f, 1.0f).a(4).b(10));
    public static final bfn<bvb> ah = bfn.a("leash_knot", bfn$a.a(bvb::new, bgc.h).b().a(0.375f, 0.5f).a(10).b(Integer.MAX_VALUE));
    public static final bfn<bfy> ai = bfn.a("lightning_bolt", bfn$a.a(bfy::new, bgc.h).b().a(0.0f, 0.0f).a(16).b(Integer.MAX_VALUE));
    public static final bfn<btn> aj = bfn.a("llama", bfn$a.a(btn::new, bgc.b).a(0.9f, 1.87f).a(10));
    public static final bfn<bzf> ak = bfn.a("llama_spit", bfn$a.a(bzf::new, bgc.h).a(0.25f, 0.25f).a(4).b(10));
    public static final bfn<bwb> al = bfn.a("magma_cube", bfn$a.a(bwb::new, bgc.a).c().a(2.04f, 2.04f).a(8));
    public static final bfn<bga> am = bfn.a("marker", bfn$a.a(bga::new, bgc.h).a(0.0f, 0.0f).a(0));
    public static final bfn<cal> an = bfn.a("minecart", bfn$a.a(cal::new, bgc.h).a(0.98f, 0.7f).a(8));
    public static final bfn<bry> ao = bfn.a("mooshroom", bfn$a.a(bry::new, bgc.b).a(0.9f, 1.4f).a(10));
    public static final bfn<btp> ap = bfn.a("mule", bfn$a.a(btp::new, bgc.b).a(1.3964844f, 1.6f).a(8));
    public static final bfn<brz> aq = bfn.a("ocelot", bfn$a.a(brz::new, bgc.b).a(0.6f, 0.7f).a(10));
    public static final bfn<bvc> ar = bfn.a("painting", bfn$a.a(bvc::new, bgc.h).a(0.5f, 0.5f).a(10).b(Integer.MAX_VALUE));
    public static final bfn<bsa> as = bfn.a("panda", bfn$a.a(bsa::new, bgc.b).a(1.3f, 1.25f).a(10));
    public static final bfn<bsb> at = bfn.a("parrot", bfn$a.a(bsb::new, bgc.b).a(0.5f, 0.9f).a(8));
    public static final bfn<bwe> au = bfn.a("phantom", bfn$a.a(bwe::new, bgc.a).a(0.9f, 0.5f).a(8));
    public static final bfn<bsc> av = bfn.a("pig", bfn$a.a(bsc::new, bgc.b).a(0.9f, 0.9f).a(10));
    public static final bfn<bxe> aw = bfn.a("piglin", bfn$a.a(bxe::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<bxh> ax = bfn.a("piglin_brute", bfn$a.a(bxh::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<bwf> ay = bfn.a("pillager", bfn$a.a(bwf::new, bgc.a).d().a(0.6f, 1.95f).a(8));
    public static final bfn<bsd> az = bfn.a("polar_bear", bfn$a.a(bsd::new, bgc.b).a(cpo.qC).a(1.4f, 1.4f).a(10));
    public static final bfn<bzr> aA = bfn.a("potion", bfn$a.a(bzr::new, bgc.h).a(0.25f, 0.25f).a(4).b(10));
    public static final bfn<bse> aB = bfn.a("pufferfish", bfn$a.a(bse::new, bgc.g).a(0.7f, 0.7f).a(4));
    public static final bfn<bsf> aC = bfn.a("rabbit", bfn$a.a(bsf::new, bgc.b).a(0.4f, 0.5f).a(8));
    public static final bfn<bwh> aD = bfn.a("ravager", bfn$a.a(bwh::new, bgc.a).a(1.95f, 2.2f).a(10));
    public static final bfn<bsg> aE = bfn.a("salmon", bfn$a.a(bsg::new, bgc.g).a(0.7f, 0.4f).a(4));
    public static final bfn<bsh> aF = bfn.a("sheep", bfn$a.a(bsh::new, bgc.b).a(0.9f, 1.3f).a(10));
    public static final bfn<bwi> aG = bfn.a("shulker", bfn$a.a(bwi::new, bgc.a).c().d().a(1.0f, 1.0f).a(10));
    public static final bfn<bzi> aH = bfn.a("shulker_bullet", bfn$a.a(bzi::new, bgc.h).a(0.3125f, 0.3125f).a(8));
    public static final bfn<bwj> aI = bfn.a("silverfish", bfn$a.a(bwj::new, bgc.a).a(0.4f, 0.3f).a(8));
    public static final bfn<bwk> aJ = bfn.a("skeleton", bfn$a.a(bwk::new, bgc.a).a(0.6f, 1.99f).a(8));
    public static final bfn<btq> aK = bfn.a("skeleton_horse", bfn$a.a(btq::new, bgc.b).a(1.3964844f, 1.6f).a(10));
    public static final bfn<bwl> aL = bfn.a("slime", bfn$a.a(bwl::new, bgc.a).a(2.04f, 2.04f).a(10));
    public static final bfn<bzj> aM = bfn.a("small_fireball", bfn$a.a(bzj::new, bgc.h).a(0.3125f, 0.3125f).a(4).b(10));
    public static final bfn<btx> aN = bfn.a("sniffer", bfn$a.a(btx::new, bgc.b).a(1.9f, 1.75f).a(10));
    public static final bfn<bsj> aO = bfn.a("snow_golem", bfn$a.a(bsj::new, bgc.h).a(cpo.qC).a(0.7f, 1.9f).a(8));
    public static final bfn<bzk> aP = bfn.a("snowball", bfn$a.a(bzk::new, bgc.h).a(0.25f, 0.25f).a(4).b(10));
    public static final bfn<caq> aQ = bfn.a("spawner_minecart", bfn$a.a(caq::new, bgc.h).a(0.98f, 0.7f).a(8));
    public static final bfn<bzl> aR = bfn.a("spectral_arrow", bfn$a.a(bzl::new, bgc.h).a(0.5f, 0.5f).a(4).b(20));
    public static final bfn<bwn> aS = bfn.a("spider", bfn$a.a(bwn::new, bgc.a).a(1.4f, 0.9f).a(8));
    public static final bfn<bsk> aT = bfn.a("squid", bfn$a.a(bsk::new, bgc.f).a(0.8f, 0.8f).a(8));
    public static final bfn<bwo> aU = bfn.a("stray", bfn$a.a(bwo::new, bgc.a).a(0.6f, 1.99f).a(cpo.qC).a(8));
    public static final bfn<bwp> aV = bfn.a("strider", bfn$a.a(bwp::new, bgc.b).c().a(0.9f, 1.7f).a(10));
    public static final bfn<btd> aW = bfn.a("tadpole", bfn$a.a(btd::new, bgc.b).a(btd.c, btd.d).a(10));
    public static final bfn<bfi.k> aX = bfn.a("text_display", bfn$a.a(bfi.k::new, bgc.h).a(0.0f, 0.0f).a(10).b(1));
    public static final bfn<bvi> aY = bfn.a("tnt", bfn$a.a(bvi::new, bgc.h).c().a(0.98f, 0.98f).a(10).b(10));
    public static final bfn<car> aZ = bfn.a("tnt_minecart", bfn$a.a(car::new, bgc.h).a(0.98f, 0.7f).a(8));
    public static final bfn<bts> ba = bfn.a("trader_llama", bfn$a.a(bts::new, bgc.b).a(0.9f, 1.87f).a(10));
    public static final bfn<bzs> bb = bfn.a("trident", bfn$a.a(bzs::new, bgc.h).a(0.5f, 0.5f).a(4).b(20));
    public static final bfn<bsl> bc = bfn.a("tropical_fish", bfn$a.a(bsl::new, bgc.g).a(0.5f, 0.4f).a(4));
    public static final bfn<bsm> bd = bfn.a("turtle", bfn$a.a(bsm::new, bgc.b).a(1.2f, 0.4f).a(10));
    public static final bfn<bwq> be = bfn.a("vex", bfn$a.a(bwq::new, bgc.a).c().a(0.4f, 0.8f).a(8));
    public static final bfn<byb> bf = bfn.a("villager", bfn$a.a(byb::new, bgc.h).a(0.6f, 1.95f).a(10));
    public static final bfn<bwr> bg = bfn.a("vindicator", bfn$a.a(bwr::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<byh> bh = bfn.a("wandering_trader", bfn$a.a(byh::new, bgc.b).a(0.6f, 1.95f).a(10));
    public static final bfn<bxs> bi = bfn.a("warden", bfn$a.a(bxs::new, bgc.a).a(0.9f, 2.9f).a(16).c());
    public static final bfn<bws> bj = bfn.a("witch", bfn$a.a(bws::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<buv> bk = bfn.a("wither", bfn$a.a(buv::new, bgc.a).c().a(cpo.cd).a(0.9f, 3.5f).a(10));
    public static final bfn<bwt> bl = bfn.a("wither_skeleton", bfn$a.a(bwt::new, bgc.a).c().a(cpo.cd).a(0.7f, 2.4f).a(8));
    public static final bfn<bzt> bm = bfn.a("wither_skull", bfn$a.a(bzt::new, bgc.h).a(0.3125f, 0.3125f).a(4).b(10));
    public static final bfn<bso> bn = bfn.a("wolf", bfn$a.a(bso::new, bgc.b).a(0.6f, 0.85f).a(10));
    public static final bfn<bwu> bo = bfn.a("zoglin", bfn$a.a(bwu::new, bgc.a).c().a(1.3964844f, 1.4f).a(8));
    public static final bfn<bwv> bp = bfn.a("zombie", bfn$a.a(bwv::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<btu> bq = bfn.a("zombie_horse", bfn$a.a(btu::new, bgc.b).a(1.3964844f, 1.6f).a(10));
    public static final bfn<bww> br = bfn.a("zombie_villager", bfn$a.a(bww::new, bgc.a).a(0.6f, 1.95f).a(8));
    public static final bfn<bwx> bs = bfn.a("zombified_piglin", bfn$a.a(bwx::new, bgc.a).c().a(0.6f, 1.95f).a(8));
    public static final bfn<byo> bt = bfn.a("player", bfn$a.a(bgc.h).b().a().a(0.6f, 1.8f).a(32).b(2));
    public static final bfn<bzc> bu = bfn.a("fishing_bobber", bfn$a.a(bzc::new, bgc.h).b().a().a(0.25f, 0.25f).a(4).b(5));
    private final b<T> bA;
    private final bgc bB;
    private final ImmutableSet<cpn> bC;
    private final boolean bD;
    private final boolean bE;
    private final boolean bF;
    private final boolean bG;
    private final int bH;
    private final int bI;
    @Nullable
    private String bJ;
    @Nullable
    private sw bK;
    @Nullable
    private acq bL;
    private final bfk bM;
    private final caw bN;

    private static <T extends bfj> bfn<T> a(String $$0, a<T> $$1) {
        return hr.a(jb.h, $$0, $$1.a($$0));
    }

    public static acq a(bfn<?> $$0) {
        return jb.h.b($$0);
    }

    public static Optional<bfn<?>> a(String $$0) {
        return jb.h.b(acq.a($$0));
    }

    public bfn(b<T> $$0, bgc $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<cpn> $$6, bfk $$7, int $$8, int $$9, caw $$10) {
        this.bA = $$0;
        this.bB = $$1;
        this.bG = $$5;
        this.bD = $$2;
        this.bE = $$3;
        this.bF = $$4;
        this.bC = $$6;
        this.bM = $$7;
        this.bH = $$8;
        this.bI = $$9;
        this.bN = $$10;
    }

    @Nullable
    public T a(aif $$02, @Nullable cfz $$1, @Nullable byo $$2, gu $$3, bgd $$4, boolean $$5, boolean $$6) {
        qr $$10;
        Consumer<bfj> $$9;
        if ($$1 != null) {
            qr $$7 = $$1.v();
            Consumer<T> $$8 = bfn.a($$02, $$1, $$2);
        } else {
            $$9 = $$0 -> {};
            $$10 = null;
        }
        return (T)this.a($$02, $$10, $$9, $$3, $$4, $$5, $$6);
    }

    public static <T extends bfj> Consumer<T> a(aif $$02, cfz $$1, @Nullable byo $$2) {
        return bfn.a((T $$0) -> {}, $$02, $$1, $$2);
    }

    public static <T extends bfj> Consumer<T> a(Consumer<T> $$0, aif $$1, cfz $$2, @Nullable byo $$3) {
        return bfn.b(bfn.a($$0, $$2), $$1, $$2, $$3);
    }

    public static <T extends bfj> Consumer<T> a(Consumer<T> $$0, cfz $$12) {
        if ($$12.A()) {
            return $$0.andThen($$1 -> $$1.b($$12.y()));
        }
        return $$0;
    }

    public static <T extends bfj> Consumer<T> b(Consumer<T> $$0, aif $$1, cfz $$2, @Nullable byo $$32) {
        qr $$4 = $$2.v();
        if ($$4 != null) {
            return $$0.andThen($$3 -> bfn.a((cmm)$$1, $$32, $$3, $$4));
        }
        return $$0;
    }

    @Nullable
    public T a(aif $$0, gu $$1, bgd $$2) {
        return this.a($$0, (qr)null, null, $$1, $$2, false, false);
    }

    @Nullable
    public T a(aif $$0, @Nullable qr $$1, @Nullable Consumer<T> $$2, gu $$3, bgd $$4, boolean $$5, boolean $$6) {
        T $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        if ($$7 != null) {
            $$0.a_((bfj)$$7);
        }
        return $$7;
    }

    @Nullable
    public T b(aif $$0, @Nullable qr $$1, @Nullable Consumer<T> $$2, gu $$3, bgd $$4, boolean $$5, boolean $$6) {
        double $$9;
        T $$7 = this.a($$0);
        if ($$7 == null) {
            return null;
        }
        if ($$5) {
            ((bfj)$$7).e((double)$$3.u() + 0.5, $$3.v() + 1, (double)$$3.w() + 0.5);
            double $$8 = bfn.a((cmp)$$0, $$3, $$6, ((bfj)$$7).cE());
        } else {
            $$9 = 0.0;
        }
        ((bfj)$$7).b((double)$$3.u() + 0.5, (double)$$3.v() + $$9, (double)$$3.w() + 0.5, apa.g($$0.z.i() * 360.0f), 0.0f);
        if ($$7 instanceof bgb) {
            bgb $$10 = (bgb)$$7;
            $$10.aX = $$10.dy();
            $$10.aV = $$10.dy();
            $$10.a($$0, $$0.d_($$10.di()), $$4, null, $$1);
            $$10.N();
        }
        if ($$2 != null) {
            $$2.accept($$7);
        }
        return $$7;
    }

    protected static double a(cmp $$0, gu $$1, boolean $$2, eed $$3) {
        eed $$4 = new eed($$1);
        if ($$2) {
            $$4 = $$4.b(0.0, -1.0, 0.0);
        }
        Iterable<efb> $$5 = $$0.c(null, $$4);
        return 1.0 + eey.a(ha.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
    }

    public static void a(cmm $$0, @Nullable byo $$1, @Nullable bfj $$2, @Nullable qr $$3) {
        if ($$3 == null || !$$3.b(a, 10)) {
            return;
        }
        MinecraftServer $$4 = $$0.n();
        if ($$4 == null || $$2 == null) {
            return;
        }
        if (!($$0.B || !$$2.cK() || $$1 != null && $$4.ac().f($$1.fM()))) {
            return;
        }
        qr $$5 = $$2.f(new qr());
        UUID $$6 = $$2.ct();
        $$5.a($$3.p(a));
        $$2.a_($$6);
        $$2.g($$5);
    }

    public boolean b() {
        return this.bD;
    }

    public boolean c() {
        return this.bE;
    }

    public boolean d() {
        return this.bF;
    }

    public boolean e() {
        return this.bG;
    }

    public bgc f() {
        return this.bB;
    }

    public String g() {
        if (this.bJ == null) {
            this.bJ = ac.a("entity", jb.h.b(this));
        }
        return this.bJ;
    }

    public sw h() {
        if (this.bK == null) {
            this.bK = sw.c(this.g());
        }
        return this.bK;
    }

    public String toString() {
        return this.g();
    }

    public String i() {
        int $$0 = this.g().lastIndexOf(46);
        return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
    }

    public acq j() {
        if (this.bL == null) {
            acq $$0 = jb.h.b(this);
            this.bL = $$0.d("entities/");
        }
        return this.bL;
    }

    public float k() {
        return this.bM.a;
    }

    public float l() {
        return this.bM.b;
    }

    @Override
    public caw m() {
        return this.bN;
    }

    @Override
    @Nullable
    public T a(cmm $$0) {
        if (!this.a($$0.G())) {
            return null;
        }
        return this.bA.create(this, $$0);
    }

    public static Optional<bfj> a(qr $$0, cmm $$12) {
        return ac.a(bfn.a($$0).map($$1 -> $$1.a($$12)), (T $$1) -> $$1.g($$0), () -> bw.warn("Skipping Entity with id {}", (Object)$$0.l("id")));
    }

    public eed a(double $$0, double $$1, double $$2) {
        float $$3 = this.k() / 2.0f;
        return new eed($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)this.l(), $$2 + (double)$$3);
    }

    @Override
    public boolean a(dcb $$0) {
        if (this.bC.contains((Object)$$0.b())) {
            return false;
        }
        if (!this.bF && dxy.a($$0)) {
            return true;
        }
        return $$0.a(cpo.cd) || $$0.a(cpo.oi) || $$0.a(cpo.dQ) || $$0.a(cpo.qC);
    }

    public bfk n() {
        return this.bM;
    }

    public static Optional<bfn<?>> a(qr $$0) {
        return jb.h.b(new acq($$0.l("id")));
    }

    @Nullable
    public static bfj a(qr $$0, cmm $$1, Function<bfj, bfj> $$2) {
        return bfn.b($$0, $$1).map($$2).map($$3 -> {
            if ($$0.b("Passengers", 9)) {
                qx $$4 = $$0.c("Passengers", 10);
                for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
                    bfj $$6 = bfn.a($$4.a($$5), $$1, $$2);
                    if ($$6 == null) continue;
                    $$6.a((bfj)$$3, true);
                }
            }
            return $$3;
        }).orElse(null);
    }

    public static Stream<bfj> a(final List<? extends rk> $$0, final cmm $$1) {
        final Spliterator<? extends rk> $$2 = $$0.spliterator();
        return StreamSupport.stream(new Spliterator<bfj>(){

            @Override
            public boolean tryAdvance(Consumer<? super bfj> $$02) {
                return $$2.tryAdvance((? super T $$2) -> bfn.a((qr)$$2, $$1, (bfj $$1) -> {
                    $$02.accept((bfj)$$1);
                    return $$1;
                }));
            }

            @Override
            public Spliterator<bfj> trySplit() {
                return null;
            }

            @Override
            public long estimateSize() {
                return $$0.size();
            }

            @Override
            public int characteristics() {
                return 1297;
            }
        }, false);
    }

    private static Optional<bfj> b(qr $$0, cmm $$1) {
        try {
            return bfn.a($$0, $$1);
        }
        catch (RuntimeException $$2) {
            bw.warn("Exception loading entity: ", (Throwable)$$2);
            return Optional.empty();
        }
    }

    public int o() {
        return this.bH;
    }

    public int p() {
        return this.bI;
    }

    public boolean q() {
        return this != bt && this != ak && this != bk && this != g && this != af && this != S && this != ah && this != ar && this != B && this != H;
    }

    @Override
    public boolean a(anl<bfn<?>> $$0) {
        return this.bx.a($$0);
    }

    @Override
    @Nullable
    public T a(bfj $$0) {
        return (T)($$0.ae() == this ? $$0 : null);
    }

    @Override
    public Class<? extends bfj> a() {
        return bfj.class;
    }

    @Deprecated
    public he.c<bfn<?>> r() {
        return this.bx;
    }

    public static class a<T extends bfj> {
        private final b<T> a;
        private final bgc b;
        private ImmutableSet<cpn> c = ImmutableSet.of();
        private boolean d = true;
        private boolean e = true;
        private boolean f;
        private boolean g;
        private int h = 5;
        private int i = 3;
        private bfk j = bfk.b(0.6f, 1.8f);
        private caw k = cay.e;

        private a(b<T> $$0, bgc $$1) {
            this.a = $$0;
            this.b = $$1;
            this.g = $$1 == bgc.b || $$1 == bgc.h;
        }

        public static <T extends bfj> a<T> a(b<T> $$0, bgc $$1) {
            return new a<T>($$0, $$1);
        }

        public static <T extends bfj> a<T> a(bgc $$02) {
            return new a<bfj>(($$0, $$1) -> null, $$02);
        }

        public a<T> a(float $$0, float $$1) {
            this.j = bfk.b($$0, $$1);
            return this;
        }

        public a<T> a() {
            this.e = false;
            return this;
        }

        public a<T> b() {
            this.d = false;
            return this;
        }

        public a<T> c() {
            this.f = true;
            return this;
        }

        public a<T> a(cpn ... $$0) {
            this.c = ImmutableSet.copyOf((Object[])$$0);
            return this;
        }

        public a<T> d() {
            this.g = true;
            return this;
        }

        public a<T> a(int $$0) {
            this.h = $$0;
            return this;
        }

        public a<T> b(int $$0) {
            this.i = $$0;
            return this;
        }

        public a<T> a(cau ... $$0) {
            this.k = cay.c.a($$0);
            return this;
        }

        public bfn<T> a(String $$0) {
            if (this.d) {
                ac.a(avw.p, $$0);
            }
            return new bfn<T>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i, this.k);
        }
    }

    public static interface b<T extends bfj> {
        public T create(bfn<T> var1, cmm var2);
    }
}

