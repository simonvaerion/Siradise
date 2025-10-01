/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.Codec
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bpb<U> {
    public static final bpb<Void> a = bpb.a("dummy");
    public static final bpb<hd> b = bpb.a("home", hd.a);
    public static final bpb<hd> c = bpb.a("job_site", hd.a);
    public static final bpb<hd> d = bpb.a("potential_job_site", hd.a);
    public static final bpb<hd> e = bpb.a("meeting_point", hd.a);
    public static final bpb<List<hd>> f = bpb.a("secondary_job_site");
    public static final bpb<List<bfz>> g = bpb.a("mobs");
    public static final bpb<bpd> h = bpb.a("visible_mobs");
    public static final bpb<List<bfz>> i = bpb.a("visible_villager_babies");
    public static final bpb<List<byo>> j = bpb.a("nearest_players");
    public static final bpb<byo> k = bpb.a("nearest_visible_player");
    public static final bpb<byo> l = bpb.a("nearest_visible_targetable_player");
    public static final bpb<bpe> m = bpb.a("walk_target");
    public static final bpb<bje> n = bpb.a("look_target");
    public static final bpb<bfz> o = bpb.a("attack_target");
    public static final bpb<Boolean> p = bpb.a("attack_cooling_down");
    public static final bpb<bfz> q = bpb.a("interaction_target");
    public static final bpb<bfe> r = bpb.a("breed_target");
    public static final bpb<bfj> s = bpb.a("ride_target");
    public static final bpb<dxt> t = bpb.a("path");
    public static final bpb<List<hd>> u = bpb.a("interactable_doors");
    public static final bpb<Set<hd>> v = bpb.a("doors_to_close");
    public static final bpb<gu> w = bpb.a("nearest_bed");
    public static final bpb<ben> x = bpb.a("hurt_by");
    public static final bpb<bfz> y = bpb.a("hurt_by_entity");
    public static final bpb<bfz> z = bpb.a("avoid_target");
    public static final bpb<bfz> A = bpb.a("nearest_hostile");
    public static final bpb<bfz> B = bpb.a("nearest_attackable");
    public static final bpb<hd> C = bpb.a("hiding_place");
    public static final bpb<Long> D = bpb.a("heard_bell_time");
    public static final bpb<Long> E = bpb.a("cant_reach_walk_target_since");
    public static final bpb<Boolean> F = bpb.a("golem_detected_recently", Codec.BOOL);
    public static final bpb<Long> G = bpb.a("last_slept", Codec.LONG);
    public static final bpb<Long> H = bpb.a("last_woken", Codec.LONG);
    public static final bpb<Long> I = bpb.a("last_worked_at_poi", Codec.LONG);
    public static final bpb<bfe> J = bpb.a("nearest_visible_adult");
    public static final bpb<bvh> K = bpb.a("nearest_visible_wanted_item");
    public static final bpb<bgb> L = bpb.a("nearest_visible_nemesis");
    public static final bpb<Integer> M = bpb.a("play_dead_ticks", Codec.INT);
    public static final bpb<byo> N = bpb.a("tempting_player");
    public static final bpb<Integer> O = bpb.a("temptation_cooldown_ticks", Codec.INT);
    public static final bpb<Integer> P = bpb.a("gaze_cooldown_ticks", Codec.INT);
    public static final bpb<Boolean> Q = bpb.a("is_tempted", Codec.BOOL);
    public static final bpb<Integer> R = bpb.a("long_jump_cooling_down", Codec.INT);
    public static final bpb<Boolean> S = bpb.a("long_jump_mid_jump");
    public static final bpb<Boolean> T = bpb.a("has_hunting_cooldown", Codec.BOOL);
    public static final bpb<Integer> U = bpb.a("ram_cooldown_ticks", Codec.INT);
    public static final bpb<eei> V = bpb.a("ram_target");
    public static final bpb<apz> W = bpb.a("is_in_water", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> X = bpb.a("is_pregnant", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<Boolean> Y = bpb.a("is_panicking", Codec.BOOL);
    public static final bpb<List<UUID>> Z = bpb.a("unreachable_tongue_targets");
    public static final bpb<UUID> aa = bpb.a("angry_at", hy.a);
    public static final bpb<Boolean> ab = bpb.a("universal_anger", Codec.BOOL);
    public static final bpb<Boolean> ac = bpb.a("admiring_item", Codec.BOOL);
    public static final bpb<Integer> ad = bpb.a("time_trying_to_reach_admire_item");
    public static final bpb<Boolean> ae = bpb.a("disable_walk_to_admire_item");
    public static final bpb<Boolean> af = bpb.a("admiring_disabled", Codec.BOOL);
    public static final bpb<Boolean> ag = bpb.a("hunted_recently", Codec.BOOL);
    public static final bpb<gu> ah = bpb.a("celebrate_location");
    public static final bpb<Boolean> ai = bpb.a("dancing");
    public static final bpb<bwy> aj = bpb.a("nearest_visible_huntable_hoglin");
    public static final bpb<bwy> ak = bpb.a("nearest_visible_baby_hoglin");
    public static final bpb<byo> al = bpb.a("nearest_targetable_player_not_wearing_gold");
    public static final bpb<List<bxd>> am = bpb.a("nearby_adult_piglins");
    public static final bpb<List<bxd>> an = bpb.a("nearest_visible_adult_piglins");
    public static final bpb<List<bwy>> ao = bpb.a("nearest_visible_adult_hoglins");
    public static final bpb<bxd> ap = bpb.a("nearest_visible_adult_piglin");
    public static final bpb<bfz> aq = bpb.a("nearest_visible_zombified");
    public static final bpb<Integer> ar = bpb.a("visible_adult_piglin_count");
    public static final bpb<Integer> as = bpb.a("visible_adult_hoglin_count");
    public static final bpb<byo> at = bpb.a("nearest_player_holding_wanted_item");
    public static final bpb<Boolean> au = bpb.a("ate_recently");
    public static final bpb<gu> av = bpb.a("nearest_repellent");
    public static final bpb<Boolean> aw = bpb.a("pacified");
    public static final bpb<bfz> ax = bpb.a("roar_target");
    public static final bpb<gu> ay = bpb.a("disturbance_location");
    public static final bpb<apz> az = bpb.a("recent_projectile", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aA = bpb.a("is_sniffing", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aB = bpb.a("is_emerging", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aC = bpb.a("roar_sound_delay", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aD = bpb.a("dig_cooldown", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aE = bpb.a("roar_sound_cooldown", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aF = bpb.a("sniff_cooldown", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aG = bpb.a("touch_cooldown", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aH = bpb.a("vibration_cooldown", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aI = bpb.a("sonic_boom_cooldown", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aJ = bpb.a("sonic_boom_sound_cooldown", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<apz> aK = bpb.a("sonic_boom_sound_delay", Codec.unit((Object)((Object)apz.a)));
    public static final bpb<UUID> aL = bpb.a("liked_player", hy.a);
    public static final bpb<hd> aM = bpb.a("liked_noteblock", hd.a);
    public static final bpb<Integer> aN = bpb.a("liked_noteblock_cooldown_ticks", Codec.INT);
    public static final bpb<Integer> aO = bpb.a("item_pickup_cooldown_ticks", Codec.INT);
    public static final bpb<List<hd>> aP = bpb.a("sniffer_explored_positions", Codec.list(hd.a));
    public static final bpb<gu> aQ = bpb.a("sniffer_sniffing_target");
    public static final bpb<Boolean> aR = bpb.a("sniffer_digging");
    public static final bpb<Boolean> aS = bpb.a("sniffer_happy");
    private final Optional<Codec<bpa<U>>> aT;

    @VisibleForTesting
    public bpb(Optional<Codec<U>> $$0) {
        this.aT = $$0.map(bpa::a);
    }

    public String toString() {
        return jb.C.b(this).toString();
    }

    public Optional<Codec<bpa<U>>> a() {
        return this.aT;
    }

    private static <U> bpb<U> a(String $$0, Codec<U> $$1) {
        return hr.a(jb.C, new acq($$0), new bpb<U>(Optional.of($$1)));
    }

    private static <U> bpb<U> a(String $$0) {
        return hr.a(jb.C, new acq($$0), new bpb<U>(Optional.empty()));
    }
}

