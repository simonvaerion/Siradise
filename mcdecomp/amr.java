/*
 * Decompiled with CFR 0.152.
 */
public class amr {
    public static final amq<cpn> a = amr.a("mined", jb.f);
    public static final amq<cfu> b = amr.a("crafted", jb.i);
    public static final amq<cfu> c = amr.a("used", jb.i);
    public static final amq<cfu> d = amr.a("broken", jb.i);
    public static final amq<cfu> e = amr.a("picked_up", jb.i);
    public static final amq<cfu> f = amr.a("dropped", jb.i);
    public static final amq<bfn<?>> g = amr.a("killed", jb.h);
    public static final amq<bfn<?>> h = amr.a("killed_by", jb.h);
    public static final amq<acq> i = amr.a("custom", jb.n);
    public static final acq j = amr.a("leave_game", amp.b);
    public static final acq k = amr.a("play_time", amp.e);
    public static final acq l = amr.a("total_world_time", amp.e);
    public static final acq m = amr.a("time_since_death", amp.e);
    public static final acq n = amr.a("time_since_rest", amp.e);
    public static final acq o = amr.a("sneak_time", amp.e);
    public static final acq p = amr.a("walk_one_cm", amp.d);
    public static final acq q = amr.a("crouch_one_cm", amp.d);
    public static final acq r = amr.a("sprint_one_cm", amp.d);
    public static final acq s = amr.a("walk_on_water_one_cm", amp.d);
    public static final acq t = amr.a("fall_one_cm", amp.d);
    public static final acq u = amr.a("climb_one_cm", amp.d);
    public static final acq v = amr.a("fly_one_cm", amp.d);
    public static final acq w = amr.a("walk_under_water_one_cm", amp.d);
    public static final acq x = amr.a("minecart_one_cm", amp.d);
    public static final acq y = amr.a("boat_one_cm", amp.d);
    public static final acq z = amr.a("pig_one_cm", amp.d);
    public static final acq A = amr.a("horse_one_cm", amp.d);
    public static final acq B = amr.a("aviate_one_cm", amp.d);
    public static final acq C = amr.a("swim_one_cm", amp.d);
    public static final acq D = amr.a("strider_one_cm", amp.d);
    public static final acq E = amr.a("jump", amp.b);
    public static final acq F = amr.a("drop", amp.b);
    public static final acq G = amr.a("damage_dealt", amp.c);
    public static final acq H = amr.a("damage_dealt_absorbed", amp.c);
    public static final acq I = amr.a("damage_dealt_resisted", amp.c);
    public static final acq J = amr.a("damage_taken", amp.c);
    public static final acq K = amr.a("damage_blocked_by_shield", amp.c);
    public static final acq L = amr.a("damage_absorbed", amp.c);
    public static final acq M = amr.a("damage_resisted", amp.c);
    public static final acq N = amr.a("deaths", amp.b);
    public static final acq O = amr.a("mob_kills", amp.b);
    public static final acq P = amr.a("animals_bred", amp.b);
    public static final acq Q = amr.a("player_kills", amp.b);
    public static final acq R = amr.a("fish_caught", amp.b);
    public static final acq S = amr.a("talked_to_villager", amp.b);
    public static final acq T = amr.a("traded_with_villager", amp.b);
    public static final acq U = amr.a("eat_cake_slice", amp.b);
    public static final acq V = amr.a("fill_cauldron", amp.b);
    public static final acq W = amr.a("use_cauldron", amp.b);
    public static final acq X = amr.a("clean_armor", amp.b);
    public static final acq Y = amr.a("clean_banner", amp.b);
    public static final acq Z = amr.a("clean_shulker_box", amp.b);
    public static final acq aa = amr.a("interact_with_brewingstand", amp.b);
    public static final acq ab = amr.a("interact_with_beacon", amp.b);
    public static final acq ac = amr.a("inspect_dropper", amp.b);
    public static final acq ad = amr.a("inspect_hopper", amp.b);
    public static final acq ae = amr.a("inspect_dispenser", amp.b);
    public static final acq af = amr.a("play_noteblock", amp.b);
    public static final acq ag = amr.a("tune_noteblock", amp.b);
    public static final acq ah = amr.a("pot_flower", amp.b);
    public static final acq ai = amr.a("trigger_trapped_chest", amp.b);
    public static final acq aj = amr.a("open_enderchest", amp.b);
    public static final acq ak = amr.a("enchant_item", amp.b);
    public static final acq al = amr.a("play_record", amp.b);
    public static final acq am = amr.a("interact_with_furnace", amp.b);
    public static final acq an = amr.a("interact_with_crafting_table", amp.b);
    public static final acq ao = amr.a("open_chest", amp.b);
    public static final acq ap = amr.a("sleep_in_bed", amp.b);
    public static final acq aq = amr.a("open_shulker_box", amp.b);
    public static final acq ar = amr.a("open_barrel", amp.b);
    public static final acq as = amr.a("interact_with_blast_furnace", amp.b);
    public static final acq at = amr.a("interact_with_smoker", amp.b);
    public static final acq au = amr.a("interact_with_lectern", amp.b);
    public static final acq av = amr.a("interact_with_campfire", amp.b);
    public static final acq aw = amr.a("interact_with_cartography_table", amp.b);
    public static final acq ax = amr.a("interact_with_loom", amp.b);
    public static final acq ay = amr.a("interact_with_stonecutter", amp.b);
    public static final acq az = amr.a("bell_ring", amp.b);
    public static final acq aA = amr.a("raid_trigger", amp.b);
    public static final acq aB = amr.a("raid_win", amp.b);
    public static final acq aC = amr.a("interact_with_anvil", amp.b);
    public static final acq aD = amr.a("interact_with_grindstone", amp.b);
    public static final acq aE = amr.a("target_hit", amp.b);
    public static final acq aF = amr.a("interact_with_smithing_table", amp.b);

    private static acq a(String $$0, amp $$1) {
        acq $$2 = new acq($$0);
        hr.a(jb.n, $$0, $$2);
        i.a($$2, $$1);
        return $$2;
    }

    private static <T> amq<T> a(String $$0, hr<T> $$1) {
        return hr.a(jb.y, $$0, new amq<T>($$1));
    }
}

