/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.Function;

public class iv {
    public static final iy a = iv.a("ambient_entity_effect", false);
    public static final iy b = iv.a("angry_villager", false);
    public static final iu<in> c = iv.a("block", false, in.a, in::a);
    public static final iu<in> d = iv.a("block_marker", false, in.a, in::a);
    public static final iy e = iv.a("bubble", false);
    public static final iy f = iv.a("cloud", false);
    public static final iy g = iv.a("crit", false);
    public static final iy h = iv.a("damage_indicator", true);
    public static final iy i = iv.a("dragon_breath", false);
    public static final iy j = iv.a("dripping_lava", false);
    public static final iy k = iv.a("falling_lava", false);
    public static final iy l = iv.a("landing_lava", false);
    public static final iy m = iv.a("dripping_water", false);
    public static final iy n = iv.a("falling_water", false);
    public static final iu<ip> o = iv.a("dust", false, ip.d, $$0 -> ip.c);
    public static final iu<io> p = iv.a("dust_color_transition", false, io.d, $$0 -> io.c);
    public static final iy q = iv.a("effect", false);
    public static final iy r = iv.a("elder_guardian", true);
    public static final iy s = iv.a("enchanted_hit", false);
    public static final iy t = iv.a("enchant", false);
    public static final iy u = iv.a("end_rod", false);
    public static final iy v = iv.a("entity_effect", false);
    public static final iy w = iv.a("explosion_emitter", true);
    public static final iy x = iv.a("explosion", true);
    public static final iy y = iv.a("sonic_boom", true);
    public static final iu<in> z = iv.a("falling_dust", false, in.a, in::a);
    public static final iy A = iv.a("firework", false);
    public static final iy B = iv.a("fishing", false);
    public static final iy C = iv.a("flame", false);
    public static final iy D = iv.a("cherry_leaves", false);
    public static final iy E = iv.a("sculk_soul", false);
    public static final iu<iw> F = iv.a("sculk_charge", true, iw.b, $$0 -> iw.a);
    public static final iy G = iv.a("sculk_charge_pop", true);
    public static final iy H = iv.a("soul_fire_flame", false);
    public static final iy I = iv.a("soul", false);
    public static final iy J = iv.a("flash", false);
    public static final iy K = iv.a("happy_villager", false);
    public static final iy L = iv.a("composter", false);
    public static final iy M = iv.a("heart", false);
    public static final iy N = iv.a("instant_effect", false);
    public static final iu<ir> O = iv.a("item", false, ir.a, ir::a);
    public static final iu<iz> P = iv.a("vibration", true, iz.b, $$0 -> iz.a);
    public static final iy Q = iv.a("item_slime", false);
    public static final iy R = iv.a("item_snowball", false);
    public static final iy S = iv.a("large_smoke", false);
    public static final iy T = iv.a("lava", false);
    public static final iy U = iv.a("mycelium", false);
    public static final iy V = iv.a("note", false);
    public static final iy W = iv.a("poof", true);
    public static final iy X = iv.a("portal", false);
    public static final iy Y = iv.a("rain", false);
    public static final iy Z = iv.a("smoke", false);
    public static final iy aa = iv.a("sneeze", false);
    public static final iy ab = iv.a("spit", true);
    public static final iy ac = iv.a("squid_ink", true);
    public static final iy ad = iv.a("sweep_attack", true);
    public static final iy ae = iv.a("totem_of_undying", false);
    public static final iy af = iv.a("underwater", false);
    public static final iy ag = iv.a("splash", false);
    public static final iy ah = iv.a("witch", false);
    public static final iy ai = iv.a("bubble_pop", false);
    public static final iy aj = iv.a("current_down", false);
    public static final iy ak = iv.a("bubble_column_up", false);
    public static final iy al = iv.a("nautilus", false);
    public static final iy am = iv.a("dolphin", false);
    public static final iy an = iv.a("campfire_cosy_smoke", true);
    public static final iy ao = iv.a("campfire_signal_smoke", true);
    public static final iy ap = iv.a("dripping_honey", false);
    public static final iy aq = iv.a("falling_honey", false);
    public static final iy ar = iv.a("landing_honey", false);
    public static final iy as = iv.a("falling_nectar", false);
    public static final iy at = iv.a("falling_spore_blossom", false);
    public static final iy au = iv.a("ash", false);
    public static final iy av = iv.a("crimson_spore", false);
    public static final iy aw = iv.a("warped_spore", false);
    public static final iy ax = iv.a("spore_blossom_air", false);
    public static final iy ay = iv.a("dripping_obsidian_tear", false);
    public static final iy az = iv.a("falling_obsidian_tear", false);
    public static final iy aA = iv.a("landing_obsidian_tear", false);
    public static final iy aB = iv.a("reverse_portal", false);
    public static final iy aC = iv.a("white_ash", false);
    public static final iy aD = iv.a("small_flame", false);
    public static final iy aE = iv.a("snowflake", false);
    public static final iy aF = iv.a("dripping_dripstone_lava", false);
    public static final iy aG = iv.a("falling_dripstone_lava", false);
    public static final iy aH = iv.a("dripping_dripstone_water", false);
    public static final iy aI = iv.a("falling_dripstone_water", false);
    public static final iy aJ = iv.a("glow_squid_ink", true);
    public static final iy aK = iv.a("glow", true);
    public static final iy aL = iv.a("wax_on", true);
    public static final iy aM = iv.a("wax_off", true);
    public static final iy aN = iv.a("electric_spark", true);
    public static final iy aO = iv.a("scrape", true);
    public static final iu<ix> aP = iv.a("shriek", false, ix.b, $$0 -> ix.a);
    public static final iy aQ = iv.a("egg_crack", false);
    public static final Codec<it> aR = jb.k.q().dispatch("type", it::b, iu::e);

    private static iy a(String $$0, boolean $$1) {
        return hr.a(jb.k, $$0, new iy($$1));
    }

    private static <T extends it> iu<T> a(String $$0, boolean $$1, it.a<T> $$2, final Function<iu<T>, Codec<T>> $$3) {
        return hr.a(jb.k, $$0, new iu<T>($$1, $$2){

            @Override
            public Codec<T> e() {
                return (Codec)$$3.apply(this);
            }
        });
    }
}

