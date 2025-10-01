/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arr
extends DataFix {
    private static final int a = 128;
    private static final int b = 64;
    private static final int c = 32;
    private static final int d = 16;
    private static final int e = 8;
    private static final int f = 4;
    private static final int g = 2;
    private static final int h = 1;
    static final Logger i = LogUtils.getLogger();
    static final BitSet j = new BitSet(256);
    static final BitSet k = new BitSet(256);
    static final Dynamic<?> l = arg.b("{Name:'minecraft:pumpkin'}");
    static final Dynamic<?> m = arg.b("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
    static final Dynamic<?> n = arg.b("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
    static final Dynamic<?> o = arg.b("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
    static final Dynamic<?> p = arg.b("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
    static final Dynamic<?> q = arg.b("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
    static final Dynamic<?> r = arg.b("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
    static final Dynamic<?> s = arg.b("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
    static final Dynamic<?> t = arg.b("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
    static final Dynamic<?> u = arg.b("{Name:'minecraft:peony',Properties:{half:'upper'}}");
    static final Map<String, Dynamic<?>> v = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        $$0.put("minecraft:air0", arg.b("{Name:'minecraft:flower_pot'}"));
        $$0.put("minecraft:red_flower0", arg.b("{Name:'minecraft:potted_poppy'}"));
        $$0.put("minecraft:red_flower1", arg.b("{Name:'minecraft:potted_blue_orchid'}"));
        $$0.put("minecraft:red_flower2", arg.b("{Name:'minecraft:potted_allium'}"));
        $$0.put("minecraft:red_flower3", arg.b("{Name:'minecraft:potted_azure_bluet'}"));
        $$0.put("minecraft:red_flower4", arg.b("{Name:'minecraft:potted_red_tulip'}"));
        $$0.put("minecraft:red_flower5", arg.b("{Name:'minecraft:potted_orange_tulip'}"));
        $$0.put("minecraft:red_flower6", arg.b("{Name:'minecraft:potted_white_tulip'}"));
        $$0.put("minecraft:red_flower7", arg.b("{Name:'minecraft:potted_pink_tulip'}"));
        $$0.put("minecraft:red_flower8", arg.b("{Name:'minecraft:potted_oxeye_daisy'}"));
        $$0.put("minecraft:yellow_flower0", arg.b("{Name:'minecraft:potted_dandelion'}"));
        $$0.put("minecraft:sapling0", arg.b("{Name:'minecraft:potted_oak_sapling'}"));
        $$0.put("minecraft:sapling1", arg.b("{Name:'minecraft:potted_spruce_sapling'}"));
        $$0.put("minecraft:sapling2", arg.b("{Name:'minecraft:potted_birch_sapling'}"));
        $$0.put("minecraft:sapling3", arg.b("{Name:'minecraft:potted_jungle_sapling'}"));
        $$0.put("minecraft:sapling4", arg.b("{Name:'minecraft:potted_acacia_sapling'}"));
        $$0.put("minecraft:sapling5", arg.b("{Name:'minecraft:potted_dark_oak_sapling'}"));
        $$0.put("minecraft:red_mushroom0", arg.b("{Name:'minecraft:potted_red_mushroom'}"));
        $$0.put("minecraft:brown_mushroom0", arg.b("{Name:'minecraft:potted_brown_mushroom'}"));
        $$0.put("minecraft:deadbush0", arg.b("{Name:'minecraft:potted_dead_bush'}"));
        $$0.put("minecraft:tallgrass2", arg.b("{Name:'minecraft:potted_fern'}"));
        $$0.put("minecraft:cactus0", arg.b(2240));
    });
    static final Map<String, Dynamic<?>> w = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        arr.a($$0, 0, "skeleton", "skull");
        arr.a($$0, 1, "wither_skeleton", "skull");
        arr.a($$0, 2, "zombie", "head");
        arr.a($$0, 3, "player", "head");
        arr.a($$0, 4, "creeper", "head");
        arr.a($$0, 5, "dragon", "head");
    });
    static final Map<String, Dynamic<?>> x = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        arr.a($$0, "oak_door", 1024);
        arr.a($$0, "iron_door", 1136);
        arr.a($$0, "spruce_door", 3088);
        arr.a($$0, "birch_door", 3104);
        arr.a($$0, "jungle_door", 3120);
        arr.a($$0, "acacia_door", 3136);
        arr.a($$0, "dark_oak_door", 3152);
    });
    static final Map<String, Dynamic<?>> y = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        for (int $$1 = 0; $$1 < 26; ++$$1) {
            $$0.put("true" + $$1, arg.b("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + $$1 + "'}}"));
            $$0.put("false" + $$1, arg.b("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + $$1 + "'}}"));
        }
    });
    private static final Int2ObjectMap<String> z = (Int2ObjectMap)DataFixUtils.make((Object)new Int2ObjectOpenHashMap(), $$0 -> {
        $$0.put(0, (Object)"white");
        $$0.put(1, (Object)"orange");
        $$0.put(2, (Object)"magenta");
        $$0.put(3, (Object)"light_blue");
        $$0.put(4, (Object)"yellow");
        $$0.put(5, (Object)"lime");
        $$0.put(6, (Object)"pink");
        $$0.put(7, (Object)"gray");
        $$0.put(8, (Object)"light_gray");
        $$0.put(9, (Object)"cyan");
        $$0.put(10, (Object)"purple");
        $$0.put(11, (Object)"blue");
        $$0.put(12, (Object)"brown");
        $$0.put(13, (Object)"green");
        $$0.put(14, (Object)"red");
        $$0.put(15, (Object)"black");
    });
    static final Map<String, Dynamic<?>> A = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        for (Int2ObjectMap.Entry $$1 : z.int2ObjectEntrySet()) {
            if (Objects.equals($$1.getValue(), "red")) continue;
            arr.a($$0, $$1.getIntKey(), (String)$$1.getValue());
        }
    });
    static final Map<String, Dynamic<?>> B = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        for (Int2ObjectMap.Entry $$1 : z.int2ObjectEntrySet()) {
            if (Objects.equals($$1.getValue(), "white")) continue;
            arr.b($$0, 15 - $$1.getIntKey(), (String)$$1.getValue());
        }
    });
    static final Dynamic<?> C;
    private static final int D = 4096;

    public arr(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2, String $$3) {
        $$0.put($$1 + "north", arg.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'north'}}"));
        $$0.put($$1 + "east", arg.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'east'}}"));
        $$0.put($$1 + "south", arg.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'south'}}"));
        $$0.put($$1 + "west", arg.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'west'}}"));
        for (int $$4 = 0; $$4 < 16; ++$$4) {
            $$0.put("" + $$1 + $$4, arg.b("{Name:'minecraft:" + $$2 + "_" + $$3 + "',Properties:{rotation:'" + $$4 + "'}}"));
        }
    }

    private static void a(Map<String, Dynamic<?>> $$0, String $$1, int $$2) {
        $$0.put("minecraft:" + $$1 + "eastlowerleftfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "eastlowerleftfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "eastlowerlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "eastlowerlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "eastlowerrightfalsefalse", arg.b($$2));
        $$0.put("minecraft:" + $$1 + "eastlowerrightfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "eastlowerrighttruefalse", arg.b($$2 + 4));
        $$0.put("minecraft:" + $$1 + "eastlowerrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "eastupperleftfalsefalse", arg.b($$2 + 8));
        $$0.put("minecraft:" + $$1 + "eastupperleftfalsetrue", arg.b($$2 + 10));
        $$0.put("minecraft:" + $$1 + "eastupperlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "eastupperlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "eastupperrightfalsefalse", arg.b($$2 + 9));
        $$0.put("minecraft:" + $$1 + "eastupperrightfalsetrue", arg.b($$2 + 11));
        $$0.put("minecraft:" + $$1 + "eastupperrighttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "eastupperrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northlowerleftfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "northlowerleftfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northlowerlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "northlowerlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northlowerrightfalsefalse", arg.b($$2 + 3));
        $$0.put("minecraft:" + $$1 + "northlowerrightfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northlowerrighttruefalse", arg.b($$2 + 7));
        $$0.put("minecraft:" + $$1 + "northlowerrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northupperleftfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "northupperleftfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northupperlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "northupperlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northupperrightfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "northupperrightfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "northupperrighttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "northupperrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southlowerleftfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "southlowerleftfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southlowerlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "southlowerlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southlowerrightfalsefalse", arg.b($$2 + 1));
        $$0.put("minecraft:" + $$1 + "southlowerrightfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southlowerrighttruefalse", arg.b($$2 + 5));
        $$0.put("minecraft:" + $$1 + "southlowerrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southupperleftfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "southupperleftfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southupperlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "southupperlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southupperrightfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "southupperrightfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "southupperrighttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "southupperrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westlowerleftfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "westlowerleftfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westlowerlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "westlowerlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westlowerrightfalsefalse", arg.b($$2 + 2));
        $$0.put("minecraft:" + $$1 + "westlowerrightfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westlowerrighttruefalse", arg.b($$2 + 6));
        $$0.put("minecraft:" + $$1 + "westlowerrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westupperleftfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "westupperleftfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westupperlefttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "westupperlefttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westupperrightfalsefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "westupperrightfalsetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
        $$0.put("minecraft:" + $$1 + "westupperrighttruefalse", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
        $$0.put("minecraft:" + $$1 + "westupperrighttruetrue", arg.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}"));
    }

    private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
        $$0.put("southfalsefoot" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}"));
        $$0.put("westfalsefoot" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}"));
        $$0.put("northfalsefoot" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}"));
        $$0.put("eastfalsefoot" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}"));
        $$0.put("southfalsehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}"));
        $$0.put("westfalsehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}"));
        $$0.put("northfalsehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}"));
        $$0.put("eastfalsehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}"));
        $$0.put("southtruehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}"));
        $$0.put("westtruehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}"));
        $$0.put("northtruehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}"));
        $$0.put("easttruehead" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}"));
    }

    private static void b(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
        for (int $$3 = 0; $$3 < 16; ++$$3) {
            $$0.put($$3 + "_" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_banner',Properties:{rotation:'" + $$3 + "'}}"));
        }
        $$0.put("north_" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'north'}}"));
        $$0.put("south_" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'south'}}"));
        $$0.put("west_" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'west'}}"));
        $$0.put("east_" + $$1, arg.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'east'}}"));
    }

    public static String a(Dynamic<?> $$0) {
        return $$0.get("Name").asString("");
    }

    public static String a(Dynamic<?> $$0, String $$1) {
        return $$0.get("Properties").get($$1).asString("");
    }

    public static int a(any<Dynamic<?>> $$0, Dynamic<?> $$1) {
        int $$2 = $$0.a($$1);
        if ($$2 == -1) {
            $$2 = $$0.c($$1);
        }
        return $$2;
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        Optional $$1 = $$0.get("Level").result();
        if ($$1.isPresent() && ((Dynamic)$$1.get()).get("Sections").asStreamOpt().result().isPresent()) {
            return $$0.set("Level", new d((Dynamic)$$1.get()).a());
        }
        return $$0;
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.c);
        Type $$1 = this.getOutputSchema().getType(avw.c);
        return this.writeFixAndRead("ChunkPalettedStorageFix", $$0, $$1, this::b);
    }

    public static int a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
        int $$4 = 0;
        if ($$2) {
            $$4 = $$1 ? ($$4 |= 2) : ($$0 ? ($$4 |= 0x80) : ($$4 |= 1));
        } else if ($$3) {
            $$4 = $$0 ? ($$4 |= 0x20) : ($$1 ? ($$4 |= 8) : ($$4 |= 0x10));
        } else if ($$1) {
            $$4 |= 4;
        } else if ($$0) {
            $$4 |= 0x40;
        }
        return $$4;
    }

    static {
        k.set(2);
        k.set(3);
        k.set(110);
        k.set(140);
        k.set(144);
        k.set(25);
        k.set(86);
        k.set(26);
        k.set(176);
        k.set(177);
        k.set(175);
        k.set(64);
        k.set(71);
        k.set(193);
        k.set(194);
        k.set(195);
        k.set(196);
        k.set(197);
        j.set(54);
        j.set(146);
        j.set(25);
        j.set(26);
        j.set(51);
        j.set(53);
        j.set(67);
        j.set(108);
        j.set(109);
        j.set(114);
        j.set(128);
        j.set(134);
        j.set(135);
        j.set(136);
        j.set(156);
        j.set(163);
        j.set(164);
        j.set(180);
        j.set(203);
        j.set(55);
        j.set(85);
        j.set(113);
        j.set(188);
        j.set(189);
        j.set(190);
        j.set(191);
        j.set(192);
        j.set(93);
        j.set(94);
        j.set(101);
        j.set(102);
        j.set(160);
        j.set(106);
        j.set(107);
        j.set(183);
        j.set(184);
        j.set(185);
        j.set(186);
        j.set(187);
        j.set(132);
        j.set(139);
        j.set(199);
        C = arg.b(0);
    }

    static final class d {
        private int a;
        private final c[] b = new c[16];
        private final Dynamic<?> c;
        private final int d;
        private final int e;
        private final Int2ObjectMap<Dynamic<?>> f = new Int2ObjectLinkedOpenHashMap(16);

        public d(Dynamic<?> $$0) {
            this.c = $$0;
            this.d = $$0.get("xPos").asInt(0) << 4;
            this.e = $$0.get("zPos").asInt(0) << 4;
            $$0.get("TileEntities").asStreamOpt().result().ifPresent($$02 -> $$02.forEach($$0 -> {
                int $$3;
                int $$1 = $$0.get("x").asInt(0) - this.d & 0xF;
                int $$2 = $$0.get("y").asInt(0);
                int $$4 = $$2 << 8 | ($$3 = $$0.get("z").asInt(0) - this.e & 0xF) << 4 | $$1;
                if (this.f.put($$4, $$0) != null) {
                    i.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", new Object[]{this.d, this.e, $$1, $$2, $$3});
                }
            }));
            boolean $$1 = $$0.get("convertedFromAlphaFormat").asBoolean(false);
            $$0.get("Sections").asStreamOpt().result().ifPresent($$02 -> $$02.forEach($$0 -> {
                c $$1 = new c((Dynamic<?>)$$0);
                this.a = $$1.b(this.a);
                this.b[$$1.a] = $$1;
            }));
            for (c $$2 : this.b) {
                if ($$2 == null) continue;
                block14: for (Map.Entry $$3 : $$2.f.entrySet()) {
                    int $$4 = $$2.a << 12;
                    switch ((Integer)$$3.getKey()) {
                        case 2: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$7;
                                int $$5 = (Integer)intListIterator.next();
                                Dynamic<?> $$6 = this.a($$5 |= $$4);
                                if (!"minecraft:grass_block".equals(arr.a($$6)) || !"minecraft:snow".equals($$7 = arr.a(this.a(arr$d.a($$5, arr$b.b)))) && !"minecraft:snow_layer".equals($$7)) continue;
                                this.a($$5, n);
                            }
                            continue block14;
                        }
                        case 3: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$10;
                                int $$8 = (Integer)intListIterator.next();
                                Dynamic<?> $$9 = this.a($$8 |= $$4);
                                if (!"minecraft:podzol".equals(arr.a($$9)) || !"minecraft:snow".equals($$10 = arr.a(this.a(arr$d.a($$8, arr$b.b)))) && !"minecraft:snow_layer".equals($$10)) continue;
                                this.a($$8, m);
                            }
                            continue block14;
                        }
                        case 110: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$13;
                                int $$11 = (Integer)intListIterator.next();
                                Dynamic<?> $$12 = this.a($$11 |= $$4);
                                if (!"minecraft:mycelium".equals(arr.a($$12)) || !"minecraft:snow".equals($$13 = arr.a(this.a(arr$d.a($$11, arr$b.b)))) && !"minecraft:snow_layer".equals($$13)) continue;
                                this.a($$11, o);
                            }
                            continue block14;
                        }
                        case 25: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                int $$14 = (Integer)intListIterator.next();
                                Dynamic<?> $$15 = this.c($$14 |= $$4);
                                if ($$15 == null) continue;
                                String $$16 = Boolean.toString($$15.get("powered").asBoolean(false)) + (byte)Math.min(Math.max($$15.get("note").asInt(0), 0), 24);
                                this.a($$14, y.getOrDefault($$16, y.get("false0")));
                            }
                            continue block14;
                        }
                        case 26: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$21;
                                int $$20;
                                int $$17 = (Integer)intListIterator.next();
                                Dynamic<?> $$18 = this.b($$17 |= $$4);
                                Dynamic<?> $$19 = this.a($$17);
                                if ($$18 == null || ($$20 = $$18.get("color").asInt(0)) == 14 || $$20 < 0 || $$20 >= 16 || !A.containsKey($$21 = arr.a($$19, "facing") + arr.a($$19, "occupied") + arr.a($$19, "part") + $$20)) continue;
                                this.a($$17, A.get($$21));
                            }
                            continue block14;
                        }
                        case 176: 
                        case 177: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$26;
                                int $$25;
                                int $$22 = (Integer)intListIterator.next();
                                Dynamic<?> $$23 = this.b($$22 |= $$4);
                                Dynamic<?> $$24 = this.a($$22);
                                if ($$23 == null || ($$25 = $$23.get("Base").asInt(0)) == 15 || $$25 < 0 || $$25 >= 16 || !B.containsKey($$26 = arr.a($$24, (Integer)$$3.getKey() == 176 ? "rotation" : "facing") + "_" + $$25)) continue;
                                this.a($$22, B.get($$26));
                            }
                            continue block14;
                        }
                        case 86: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$29;
                                int $$27 = (Integer)intListIterator.next();
                                Dynamic<?> $$28 = this.a($$27 |= $$4);
                                if (!"minecraft:carved_pumpkin".equals(arr.a($$28)) || !"minecraft:grass_block".equals($$29 = arr.a(this.a(arr$d.a($$27, arr$b.a)))) && !"minecraft:dirt".equals($$29)) continue;
                                this.a($$27, l);
                            }
                            continue block14;
                        }
                        case 140: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                int $$30 = (Integer)intListIterator.next();
                                Dynamic<?> $$31 = this.c($$30 |= $$4);
                                if ($$31 == null) continue;
                                String $$32 = $$31.get("Item").asString("") + $$31.get("Data").asInt(0);
                                this.a($$30, v.getOrDefault($$32, v.get("minecraft:air0")));
                            }
                            continue block14;
                        }
                        case 144: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                String $$38;
                                int $$33 = (Integer)intListIterator.next();
                                Dynamic<?> $$34 = this.b($$33 |= $$4);
                                if ($$34 == null) continue;
                                String $$35 = String.valueOf($$34.get("SkullType").asInt(0));
                                String $$36 = arr.a(this.a($$33), "facing");
                                if ("up".equals($$36) || "down".equals($$36)) {
                                    String $$37 = $$35 + String.valueOf($$34.get("Rot").asInt(0));
                                } else {
                                    $$38 = $$35 + $$36;
                                }
                                $$34.remove("SkullType");
                                $$34.remove("facing");
                                $$34.remove("Rot");
                                this.a($$33, w.getOrDefault($$38, w.get("0north")));
                            }
                            continue block14;
                        }
                        case 64: 
                        case 71: 
                        case 193: 
                        case 194: 
                        case 195: 
                        case 196: 
                        case 197: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                Dynamic<?> $$41;
                                int $$39 = (Integer)intListIterator.next();
                                Dynamic<?> $$40 = this.a($$39 |= $$4);
                                if (!arr.a($$40).endsWith("_door") || !"lower".equals(arr.a($$41 = this.a($$39), "half"))) continue;
                                int $$42 = arr$d.a($$39, arr$b.b);
                                Dynamic<?> $$43 = this.a($$42);
                                String $$44 = arr.a($$41);
                                if (!$$44.equals(arr.a($$43))) continue;
                                String $$45 = arr.a($$41, "facing");
                                String $$46 = arr.a($$41, "open");
                                String $$47 = $$1 ? "left" : arr.a($$43, "hinge");
                                String $$48 = $$1 ? "false" : arr.a($$43, "powered");
                                this.a($$39, x.get($$44 + $$45 + "lower" + $$47 + $$46 + $$48));
                                this.a($$42, x.get($$44 + $$45 + "upper" + $$47 + $$46 + $$48));
                            }
                            continue block14;
                        }
                        case 175: {
                            IntListIterator intListIterator = ((IntList)$$3.getValue()).iterator();
                            while (intListIterator.hasNext()) {
                                int $$49 = (Integer)intListIterator.next();
                                Dynamic<?> $$50 = this.a($$49 |= $$4);
                                if (!"upper".equals(arr.a($$50, "half"))) continue;
                                Dynamic<?> $$51 = this.a(arr$d.a($$49, arr$b.a));
                                String $$52 = arr.a($$51);
                                if ("minecraft:sunflower".equals($$52)) {
                                    this.a($$49, p);
                                    continue;
                                }
                                if ("minecraft:lilac".equals($$52)) {
                                    this.a($$49, q);
                                    continue;
                                }
                                if ("minecraft:tall_grass".equals($$52)) {
                                    this.a($$49, r);
                                    continue;
                                }
                                if ("minecraft:large_fern".equals($$52)) {
                                    this.a($$49, s);
                                    continue;
                                }
                                if ("minecraft:rose_bush".equals($$52)) {
                                    this.a($$49, t);
                                    continue;
                                }
                                if (!"minecraft:peony".equals($$52)) continue;
                                this.a($$49, u);
                            }
                            break;
                        }
                    }
                }
            }
        }

        @Nullable
        private Dynamic<?> b(int $$0) {
            return (Dynamic)this.f.get($$0);
        }

        @Nullable
        private Dynamic<?> c(int $$0) {
            return (Dynamic)this.f.remove($$0);
        }

        public static int a(int $$0, b $$1) {
            switch ($$1.b()) {
                case a: {
                    int $$2 = ($$0 & 0xF) + $$1.a().a();
                    return $$2 < 0 || $$2 > 15 ? -1 : $$0 & 0xFFFFFFF0 | $$2;
                }
                case b: {
                    int $$3 = ($$0 >> 8) + $$1.a().a();
                    return $$3 < 0 || $$3 > 255 ? -1 : $$0 & 0xFF | $$3 << 8;
                }
                case c: {
                    int $$4 = ($$0 >> 4 & 0xF) + $$1.a().a();
                    return $$4 < 0 || $$4 > 15 ? -1 : $$0 & 0xFFFFFF0F | $$4 << 4;
                }
            }
            return -1;
        }

        private void a(int $$0, Dynamic<?> $$1) {
            if ($$0 < 0 || $$0 > 65535) {
                return;
            }
            c $$2 = this.d($$0);
            if ($$2 == null) {
                return;
            }
            $$2.a($$0 & 0xFFF, $$1);
        }

        @Nullable
        private c d(int $$0) {
            int $$1 = $$0 >> 12;
            return $$1 < this.b.length ? this.b[$$1] : null;
        }

        public Dynamic<?> a(int $$0) {
            if ($$0 < 0 || $$0 > 65535) {
                return C;
            }
            c $$1 = this.d($$0);
            if ($$1 == null) {
                return C;
            }
            return $$1.a($$0 & 0xFFF);
        }

        public Dynamic<?> a() {
            Dynamic $$0 = this.c;
            $$0 = this.f.isEmpty() ? $$0.remove("TileEntities") : $$0.set("TileEntities", $$0.createList(this.f.values().stream()));
            Dynamic $$1 = $$0.emptyMap();
            ArrayList $$2 = Lists.newArrayList();
            for (c $$3 : this.b) {
                if ($$3 == null) continue;
                $$2.add($$3.a());
                $$1 = $$1.set(String.valueOf($$3.a), $$1.createIntList(Arrays.stream($$3.g.toIntArray())));
            }
            Dynamic $$4 = $$0.emptyMap();
            $$4 = $$4.set("Sides", $$4.createByte((byte)this.a));
            $$4 = $$4.set("Indices", $$1);
            return $$0.set("UpgradeData", $$4).set("Sections", $$4.createList($$2.stream()));
        }
    }

    public static final class arr$b
    extends Enum<arr$b> {
        public static final /* enum */ arr$b a = new arr$b(b.b, a.b);
        public static final /* enum */ arr$b b = new arr$b(b.a, a.b);
        public static final /* enum */ arr$b c = new arr$b(b.b, a.c);
        public static final /* enum */ arr$b d = new arr$b(b.a, a.c);
        public static final /* enum */ arr$b e = new arr$b(b.b, a.a);
        public static final /* enum */ arr$b f = new arr$b(b.a, a.a);
        private final a g;
        private final b h;
        private static final /* synthetic */ arr$b[] i;

        public static arr$b[] values() {
            return (arr$b[])i.clone();
        }

        public static arr$b valueOf(String $$0) {
            return Enum.valueOf(arr$b.class, $$0);
        }

        private arr$b(b $$0, a $$1) {
            this.g = $$1;
            this.h = $$0;
        }

        public b a() {
            return this.h;
        }

        public a b() {
            return this.g;
        }

        private static /* synthetic */ arr$b[] c() {
            return new arr$b[]{a, b, c, d, e, f};
        }

        static {
            i = arr$b.c();
        }

        public static final class a
        extends Enum<a> {
            public static final /* enum */ a a = new a();
            public static final /* enum */ a b = new a();
            public static final /* enum */ a c = new a();
            private static final /* synthetic */ a[] d;

            public static a[] values() {
                return (a[])d.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c};
            }

            static {
                d = arr$b$a.a();
            }
        }

        public static final class b
        extends Enum<b> {
            public static final /* enum */ b a = new b(1);
            public static final /* enum */ b b = new b(-1);
            private final int c;
            private static final /* synthetic */ b[] d;

            public static b[] values() {
                return (b[])d.clone();
            }

            public static b valueOf(String $$0) {
                return Enum.valueOf(b.class, $$0);
            }

            private b(int $$0) {
                this.c = $$0;
            }

            public int a() {
                return this.c;
            }

            private static /* synthetic */ b[] b() {
                return new b[]{a, b};
            }

            static {
                d = arr$b$b.b();
            }
        }
    }

    static class a {
        private static final int a = 2048;
        private static final int b = 4;
        private final byte[] c;

        public a() {
            this.c = new byte[2048];
        }

        public a(byte[] $$0) {
            this.c = $$0;
            if ($$0.length != 2048) {
                throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + $$0.length);
            }
        }

        public int a(int $$0, int $$1, int $$2) {
            int $$3 = this.b($$1 << 8 | $$2 << 4 | $$0);
            if (this.a($$1 << 8 | $$2 << 4 | $$0)) {
                return this.c[$$3] & 0xF;
            }
            return this.c[$$3] >> 4 & 0xF;
        }

        private boolean a(int $$0) {
            return ($$0 & 1) == 0;
        }

        private int b(int $$0) {
            return $$0 >> 1;
        }
    }

    static class c {
        private final any<Dynamic<?>> b = any.c(32);
        private final List<Dynamic<?>> c;
        private final Dynamic<?> d;
        private final boolean e;
        final Int2ObjectMap<IntList> f = new Int2ObjectLinkedOpenHashMap();
        final IntList g = new IntArrayList();
        public final int a;
        private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
        private final int[] i = new int[4096];

        public c(Dynamic<?> $$0) {
            this.c = Lists.newArrayList();
            this.d = $$0;
            this.a = $$0.get("Y").asInt(0);
            this.e = $$0.get("Blocks").result().isPresent();
        }

        public Dynamic<?> a(int $$0) {
            if ($$0 < 0 || $$0 > 4095) {
                return C;
            }
            Dynamic<?> $$1 = this.b.a(this.i[$$0]);
            return $$1 == null ? C : $$1;
        }

        public void a(int $$0, Dynamic<?> $$1) {
            if (this.h.add($$1)) {
                this.c.add("%%FILTER_ME%%".equals(arr.a($$1)) ? C : $$1);
            }
            this.i[$$0] = arr.a(this.b, $$1);
        }

        public int b(int $$02) {
            if (!this.e) {
                return $$02;
            }
            ByteBuffer $$1 = (ByteBuffer)this.d.get("Blocks").asByteBufferOpt().result().get();
            a $$2 = this.d.get("Data").asByteBufferOpt().map($$0 -> new a(DataFixUtils.toArray((ByteBuffer)$$0))).result().orElseGet(a::new);
            a $$3 = this.d.get("Add").asByteBufferOpt().map($$0 -> new a(DataFixUtils.toArray((ByteBuffer)$$0))).result().orElseGet(a::new);
            this.h.add(C);
            arr.a(this.b, C);
            this.c.add(C);
            for (int $$4 = 0; $$4 < 4096; ++$$4) {
                int $$5 = $$4 & 0xF;
                int $$6 = $$4 >> 8 & 0xF;
                int $$7 = $$4 >> 4 & 0xF;
                int $$8 = $$3.a($$5, $$6, $$7) << 12 | ($$1.get($$4) & 0xFF) << 4 | $$2.a($$5, $$6, $$7);
                if (k.get($$8 >> 4)) {
                    this.a($$8 >> 4, $$4);
                }
                if (j.get($$8 >> 4)) {
                    int $$9 = arr.a($$5 == 0, $$5 == 15, $$7 == 0, $$7 == 15);
                    if ($$9 == 0) {
                        this.g.add($$4);
                    } else {
                        $$02 |= $$9;
                    }
                }
                this.a($$4, arg.b($$8));
            }
            return $$02;
        }

        private void a(int $$0, int $$1) {
            IntList $$2 = (IntList)this.f.get($$0);
            if ($$2 == null) {
                $$2 = new IntArrayList();
                this.f.put($$0, (Object)$$2);
            }
            $$2.add($$1);
        }

        public Dynamic<?> a() {
            Dynamic $$0 = this.d;
            if (!this.e) {
                return $$0;
            }
            $$0 = $$0.set("Palette", $$0.createList(this.c.stream()));
            int $$1 = Math.max(4, DataFixUtils.ceillog2((int)this.h.size()));
            aqe $$2 = new aqe($$1, 4096);
            for (int $$3 = 0; $$3 < this.i.length; ++$$3) {
                $$2.a($$3, this.i[$$3]);
            }
            $$0 = $$0.set("BlockStates", $$0.createLongList(Arrays.stream($$2.a())));
            $$0 = $$0.remove("Blocks");
            $$0 = $$0.remove("Data");
            $$0 = $$0.remove("Add");
            return $$0;
        }
    }
}

