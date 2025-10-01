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

public class ai {
    private static final Map<acq, al<?>> aa = Maps.newHashMap();
    public static final bw a = ai.a(new bw());
    public static final cc b = ai.a(new cc(new acq("player_killed_entity")));
    public static final cc c = ai.a(new cc(new acq("entity_killed_player")));
    public static final bk d = ai.a(new bk());
    public static final bx e = ai.a(new bx());
    public static final cs f = ai.a(new cs());
    public static final cn g = ai.a(new cn());
    public static final bn h = ai.a(new bn());
    public static final bi i = ai.a(new bi());
    public static final bs j = ai.a(new bs());
    public static final av k = ai.a(new av());
    public static final ay l = ai.a(new ay());
    public static final df m = ai.a(new df());
    public static final da n = ai.a(new da());
    public static final au o = ai.a(new au());
    public static final cq p = ai.a(new cq(new acq("location")));
    public static final cq q = ai.a(new cq(new acq("slept_in_bed")));
    public static final bb r = ai.a(new bb());
    public static final de s = ai.a(new de());
    public static final by t = ai.a(new by());
    public static final cd u = ai.a(new cd());
    public static final aw v = ai.a(new aw());
    public static final cq w = ai.a(new cq(new acq("tick")));
    public static final dc x = ai.a(new dc());
    public static final ca y = ai.a(new ca(new acq("placed_block")));
    public static final az z = ai.a(new az());
    public static final bh A = ai.a(new bh());
    public static final dg B = ai.a(new dg());
    public static final bg C = ai.a(new bg(new acq("nether_travel")));
    public static final bu D = ai.a(new bu());
    public static final ax E = ai.a(new ax());
    public static final cu F = ai.a(new cu());
    public static final cb G = ai.a(new cb());
    public static final cq H = ai.a(new cq(new acq("hero_of_the_village")));
    public static final cq I = ai.a(new cq(new acq("voluntary_exile")));
    public static final cw J = ai.a(new cw());
    public static final as K = ai.a(new as());
    public static final dd L = ai.a(new dd());
    public static final ca M = ai.a(new ca(new acq("item_used_on_block")));
    public static final ci N = ai.a(new ci());
    public static final cm O = ai.a(new cm(new acq("thrown_item_picked_up_by_entity")));
    public static final cm P = ai.a(new cm(new acq("thrown_item_picked_up_by_player")));
    public static final co Q = ai.a(new co());
    public static final cy R = ai.a(new cy());
    public static final cg S = ai.a(new cg());
    public static final dh T = ai.a(new dh());
    public static final bg U = ai.a(new bg(new acq("fall_from_height")));
    public static final bg V = ai.a(new bg(new acq("ride_entity_in_lava")));
    public static final cc W = ai.a(new cc(new acq("kill_mob_near_sculk_catalyst")));
    public static final ca X = ai.a(new ca(new acq("allay_drop_item_on_block")));
    public static final cq Y = ai.a(new cq(new acq("avoid_vibration")));
    public static final cr Z = ai.a(new cr());

    private static <T extends al<?>> T a(T $$0) {
        if (aa.containsKey($$0.a())) {
            throw new IllegalArgumentException("Duplicate criterion id " + $$0.a());
        }
        aa.put($$0.a(), $$0);
        return $$0;
    }

    @Nullable
    public static <T extends am> al<T> a(acq $$0) {
        return aa.get($$0);
    }

    public static Iterable<? extends al<?>> a() {
        return aa.values();
    }
}

