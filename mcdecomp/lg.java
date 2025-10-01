/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.stream.IntStream;

public class lg {
    public static final lf a = lg.a("cube", li.c, li.j, li.k, li.l, li.m, li.n, li.o);
    public static final lf b = lg.a("cube_directional", li.c, li.j, li.k, li.l, li.m, li.n, li.o);
    public static final lf c = lg.a("cube_all", li.a);
    public static final lf d = lg.a("cube_mirrored_all", "_mirrored", li.a);
    public static final lf e = lg.a("cube_north_west_mirrored_all", "_north_west_mirrored", li.a);
    public static final lf f = lg.a("cube_column_uv_locked_x", "_x", li.d, li.i);
    public static final lf g = lg.a("cube_column_uv_locked_y", "_y", li.d, li.i);
    public static final lf h = lg.a("cube_column_uv_locked_z", "_z", li.d, li.i);
    public static final lf i = lg.a("cube_column", li.d, li.i);
    public static final lf j = lg.a("cube_column_horizontal", "_horizontal", li.d, li.i);
    public static final lf k = lg.a("cube_column_mirrored", "_mirrored", li.d, li.i);
    public static final lf l = lg.a("cube_top", li.f, li.i);
    public static final lf m = lg.a("cube_bottom_top", li.f, li.e, li.i);
    public static final lf n = lg.a("orientable", li.f, li.g, li.i);
    public static final lf o = lg.a("orientable_with_bottom", li.f, li.e, li.i, li.g);
    public static final lf p = lg.a("orientable_vertical", "_vertical", li.g, li.i);
    public static final lf q = lg.a("button", li.b);
    public static final lf r = lg.a("button_pressed", "_pressed", li.b);
    public static final lf s = lg.a("button_inventory", "_inventory", li.b);
    public static final lf t = lg.a("door_bottom_left", "_bottom_left", li.f, li.e);
    public static final lf u = lg.a("door_bottom_left_open", "_bottom_left_open", li.f, li.e);
    public static final lf v = lg.a("door_bottom_right", "_bottom_right", li.f, li.e);
    public static final lf w = lg.a("door_bottom_right_open", "_bottom_right_open", li.f, li.e);
    public static final lf x = lg.a("door_top_left", "_top_left", li.f, li.e);
    public static final lf y = lg.a("door_top_left_open", "_top_left_open", li.f, li.e);
    public static final lf z = lg.a("door_top_right", "_top_right", li.f, li.e);
    public static final lf A = lg.a("door_top_right_open", "_top_right_open", li.f, li.e);
    public static final lf B = lg.a("custom_fence_post", "_post", li.b, li.c);
    public static final lf C = lg.a("custom_fence_side_north", "_side_north", li.b);
    public static final lf D = lg.a("custom_fence_side_east", "_side_east", li.b);
    public static final lf E = lg.a("custom_fence_side_south", "_side_south", li.b);
    public static final lf F = lg.a("custom_fence_side_west", "_side_west", li.b);
    public static final lf G = lg.a("custom_fence_inventory", "_inventory", li.b);
    public static final lf H = lg.a("fence_post", "_post", li.b);
    public static final lf I = lg.a("fence_side", "_side", li.b);
    public static final lf J = lg.a("fence_inventory", "_inventory", li.b);
    public static final lf K = lg.a("template_wall_post", "_post", li.r);
    public static final lf L = lg.a("template_wall_side", "_side", li.r);
    public static final lf M = lg.a("template_wall_side_tall", "_side_tall", li.r);
    public static final lf N = lg.a("wall_inventory", "_inventory", li.r);
    public static final lf O = lg.a("template_custom_fence_gate", li.b, li.c);
    public static final lf P = lg.a("template_custom_fence_gate_open", "_open", li.b, li.c);
    public static final lf Q = lg.a("template_custom_fence_gate_wall", "_wall", li.b, li.c);
    public static final lf R = lg.a("template_custom_fence_gate_wall_open", "_wall_open", li.b, li.c);
    public static final lf S = lg.a("template_fence_gate", li.b);
    public static final lf T = lg.a("template_fence_gate_open", "_open", li.b);
    public static final lf U = lg.a("template_fence_gate_wall", "_wall", li.b);
    public static final lf V = lg.a("template_fence_gate_wall_open", "_wall_open", li.b);
    public static final lf W = lg.a("pressure_plate_up", li.b);
    public static final lf X = lg.a("pressure_plate_down", "_down", li.b);
    public static final lf Y = lg.a(li.c);
    public static final lf Z = lg.a("slab", li.e, li.f, li.i);
    public static final lf aa = lg.a("slab_top", "_top", li.e, li.f, li.i);
    public static final lf ab = lg.a("leaves", li.a);
    public static final lf ac = lg.a("stairs", li.e, li.f, li.i);
    public static final lf ad = lg.a("inner_stairs", "_inner", li.e, li.f, li.i);
    public static final lf ae = lg.a("outer_stairs", "_outer", li.e, li.f, li.i);
    public static final lf af = lg.a("template_trapdoor_top", "_top", li.b);
    public static final lf ag = lg.a("template_trapdoor_bottom", "_bottom", li.b);
    public static final lf ah = lg.a("template_trapdoor_open", "_open", li.b);
    public static final lf ai = lg.a("template_orientable_trapdoor_top", "_top", li.b);
    public static final lf aj = lg.a("template_orientable_trapdoor_bottom", "_bottom", li.b);
    public static final lf ak = lg.a("template_orientable_trapdoor_open", "_open", li.b);
    public static final lf al = lg.a("pointed_dripstone", li.p);
    public static final lf am = lg.a("cross", li.p);
    public static final lf an = lg.a("tinted_cross", li.p);
    public static final lf ao = lg.a("flower_pot_cross", li.q);
    public static final lf ap = lg.a("tinted_flower_pot_cross", li.q);
    public static final lf aq = lg.a("rail_flat", li.s);
    public static final lf ar = lg.a("rail_curved", "_corner", li.s);
    public static final lf as = lg.a("template_rail_raised_ne", "_raised_ne", li.s);
    public static final lf at = lg.a("template_rail_raised_sw", "_raised_sw", li.s);
    public static final lf au = lg.a("carpet", li.t);
    public static final lf av = lg.a("flowerbed_1", "_1", li.P, li.y);
    public static final lf aw = lg.a("flowerbed_2", "_2", li.P, li.y);
    public static final lf ax = lg.a("flowerbed_3", "_3", li.P, li.y);
    public static final lf ay = lg.a("flowerbed_4", "_4", li.P, li.y);
    public static final lf az = lg.a("coral_fan", li.x);
    public static final lf aA = lg.a("coral_wall_fan", li.x);
    public static final lf aB = lg.a("template_glazed_terracotta", li.u);
    public static final lf aC = lg.a("template_chorus_flower", li.b);
    public static final lf aD = lg.a("template_daylight_detector", li.f, li.i);
    public static final lf aE = lg.a("template_glass_pane_noside", "_noside", li.v);
    public static final lf aF = lg.a("template_glass_pane_noside_alt", "_noside_alt", li.v);
    public static final lf aG = lg.a("template_glass_pane_post", "_post", li.v, li.w);
    public static final lf aH = lg.a("template_glass_pane_side", "_side", li.v, li.w);
    public static final lf aI = lg.a("template_glass_pane_side_alt", "_side_alt", li.v, li.w);
    public static final lf aJ = lg.a("template_command_block", li.g, li.h, li.i);
    public static final lf aK = lg.a("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", li.b);
    public static final lf aL = lg.a("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", li.b);
    public static final lf aM = lg.a("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", li.b);
    public static final lf aN = lg.a("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", li.b);
    public static final lf aO = lg.a("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", li.b);
    public static final lf aP = lg.a("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", li.b);
    public static final lf aQ = lg.a("template_anvil", li.f);
    public static final lf[] aR = (lf[])IntStream.range(0, 8).mapToObj($$0 -> lg.a("stem_growth" + $$0, "_stage" + $$0, li.y)).toArray(lf[]::new);
    public static final lf aS = lg.a("stem_fruit", li.y, li.z);
    public static final lf aT = lg.a("crop", li.A);
    public static final lf aU = lg.a("template_farmland", li.B, li.f);
    public static final lf aV = lg.a("template_fire_floor", li.C);
    public static final lf aW = lg.a("template_fire_side", li.C);
    public static final lf aX = lg.a("template_fire_side_alt", li.C);
    public static final lf aY = lg.a("template_fire_up", li.C);
    public static final lf aZ = lg.a("template_fire_up_alt", li.C);
    public static final lf ba = lg.a("template_campfire", li.C, li.K);
    public static final lf bb = lg.a("template_lantern", li.D);
    public static final lf bc = lg.a("template_hanging_lantern", "_hanging", li.D);
    public static final lf bd = lg.a("template_torch", li.G);
    public static final lf be = lg.a("template_torch_wall", li.G);
    public static final lf bf = lg.a("template_piston", li.E, li.e, li.i);
    public static final lf bg = lg.a("template_piston_head", li.E, li.i, li.F);
    public static final lf bh = lg.a("template_piston_head_short", li.E, li.i, li.F);
    public static final lf bi = lg.a("template_seagrass", li.b);
    public static final lf bj = lg.a("template_turtle_egg", li.a);
    public static final lf bk = lg.a("template_two_turtle_eggs", li.a);
    public static final lf bl = lg.a("template_three_turtle_eggs", li.a);
    public static final lf bm = lg.a("template_four_turtle_eggs", li.a);
    public static final lf bn = lg.a("template_single_face", li.b);
    public static final lf bo = lg.a("template_cauldron_level1", li.N, li.M, li.c, li.f, li.e, li.i);
    public static final lf bp = lg.a("template_cauldron_level2", li.N, li.M, li.c, li.f, li.e, li.i);
    public static final lf bq = lg.a("template_cauldron_full", li.N, li.M, li.c, li.f, li.e, li.i);
    public static final lf br = lg.a("template_azalea", li.f, li.i);
    public static final lf bs = lg.a("template_potted_azalea_bush", li.q, li.f, li.i);
    public static final lf bt = lg.a("template_potted_azalea_bush", li.q, li.f, li.i);
    public static final lf bu = lg.a("sniffer_egg", li.f, li.e, li.j, li.k, li.l, li.m);
    public static final lf bv = lg.b("generated", li.H);
    public static final lf bw = lg.b("template_music_disc", li.H);
    public static final lf bx = lg.b("handheld", li.H);
    public static final lf by = lg.b("handheld_rod", li.H);
    public static final lf bz = lg.b("generated", li.H, li.I);
    public static final lf bA = lg.b("generated", li.H, li.I, li.J);
    public static final lf bB = lg.b("template_shulker_box", li.c);
    public static final lf bC = lg.b("template_bed", li.c);
    public static final lf bD = lg.b("template_banner", new li[0]);
    public static final lf bE = lg.b("template_skull", new li[0]);
    public static final lf bF = lg.a("template_candle", li.a, li.c);
    public static final lf bG = lg.a("template_two_candles", li.a, li.c);
    public static final lf bH = lg.a("template_three_candles", li.a, li.c);
    public static final lf bI = lg.a("template_four_candles", li.a, li.c);
    public static final lf bJ = lg.a("template_cake_with_candle", li.L, li.e, li.i, li.f, li.c);
    public static final lf bK = lg.a("template_sculk_shrieker", li.e, li.i, li.f, li.c, li.O);

    private static lf a(li ... $$0) {
        return new lf(Optional.empty(), Optional.empty(), $$0);
    }

    private static lf a(String $$0, li ... $$1) {
        return new lf(Optional.of(new acq("minecraft", "block/" + $$0)), Optional.empty(), $$1);
    }

    private static lf b(String $$0, li ... $$1) {
        return new lf(Optional.of(new acq("minecraft", "item/" + $$0)), Optional.empty(), $$1);
    }

    private static lf a(String $$0, String $$1, li ... $$2) {
        return new lf(Optional.of(new acq("minecraft", "block/" + $$0)), Optional.of($$1), $$2);
    }
}

