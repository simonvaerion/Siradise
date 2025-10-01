/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 */
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class aur
extends DataFix {
    static final Map<String, String> a = ac.a(Maps.newHashMap(), (T $$0) -> {
        $$0.put("0", "minecraft:ocean");
        $$0.put("1", "minecraft:plains");
        $$0.put("2", "minecraft:desert");
        $$0.put("3", "minecraft:mountains");
        $$0.put("4", "minecraft:forest");
        $$0.put("5", "minecraft:taiga");
        $$0.put("6", "minecraft:swamp");
        $$0.put("7", "minecraft:river");
        $$0.put("8", "minecraft:nether");
        $$0.put("9", "minecraft:the_end");
        $$0.put("10", "minecraft:frozen_ocean");
        $$0.put("11", "minecraft:frozen_river");
        $$0.put("12", "minecraft:snowy_tundra");
        $$0.put("13", "minecraft:snowy_mountains");
        $$0.put("14", "minecraft:mushroom_fields");
        $$0.put("15", "minecraft:mushroom_field_shore");
        $$0.put("16", "minecraft:beach");
        $$0.put("17", "minecraft:desert_hills");
        $$0.put("18", "minecraft:wooded_hills");
        $$0.put("19", "minecraft:taiga_hills");
        $$0.put("20", "minecraft:mountain_edge");
        $$0.put("21", "minecraft:jungle");
        $$0.put("22", "minecraft:jungle_hills");
        $$0.put("23", "minecraft:jungle_edge");
        $$0.put("24", "minecraft:deep_ocean");
        $$0.put("25", "minecraft:stone_shore");
        $$0.put("26", "minecraft:snowy_beach");
        $$0.put("27", "minecraft:birch_forest");
        $$0.put("28", "minecraft:birch_forest_hills");
        $$0.put("29", "minecraft:dark_forest");
        $$0.put("30", "minecraft:snowy_taiga");
        $$0.put("31", "minecraft:snowy_taiga_hills");
        $$0.put("32", "minecraft:giant_tree_taiga");
        $$0.put("33", "minecraft:giant_tree_taiga_hills");
        $$0.put("34", "minecraft:wooded_mountains");
        $$0.put("35", "minecraft:savanna");
        $$0.put("36", "minecraft:savanna_plateau");
        $$0.put("37", "minecraft:badlands");
        $$0.put("38", "minecraft:wooded_badlands_plateau");
        $$0.put("39", "minecraft:badlands_plateau");
        $$0.put("40", "minecraft:small_end_islands");
        $$0.put("41", "minecraft:end_midlands");
        $$0.put("42", "minecraft:end_highlands");
        $$0.put("43", "minecraft:end_barrens");
        $$0.put("44", "minecraft:warm_ocean");
        $$0.put("45", "minecraft:lukewarm_ocean");
        $$0.put("46", "minecraft:cold_ocean");
        $$0.put("47", "minecraft:deep_warm_ocean");
        $$0.put("48", "minecraft:deep_lukewarm_ocean");
        $$0.put("49", "minecraft:deep_cold_ocean");
        $$0.put("50", "minecraft:deep_frozen_ocean");
        $$0.put("127", "minecraft:the_void");
        $$0.put("129", "minecraft:sunflower_plains");
        $$0.put("130", "minecraft:desert_lakes");
        $$0.put("131", "minecraft:gravelly_mountains");
        $$0.put("132", "minecraft:flower_forest");
        $$0.put("133", "minecraft:taiga_mountains");
        $$0.put("134", "minecraft:swamp_hills");
        $$0.put("140", "minecraft:ice_spikes");
        $$0.put("149", "minecraft:modified_jungle");
        $$0.put("151", "minecraft:modified_jungle_edge");
        $$0.put("155", "minecraft:tall_birch_forest");
        $$0.put("156", "minecraft:tall_birch_hills");
        $$0.put("157", "minecraft:dark_forest_hills");
        $$0.put("158", "minecraft:snowy_taiga_mountains");
        $$0.put("160", "minecraft:giant_spruce_taiga");
        $$0.put("161", "minecraft:giant_spruce_taiga_hills");
        $$0.put("162", "minecraft:modified_gravelly_mountains");
        $$0.put("163", "minecraft:shattered_savanna");
        $$0.put("164", "minecraft:shattered_savanna_plateau");
        $$0.put("165", "minecraft:eroded_badlands");
        $$0.put("166", "minecraft:modified_wooded_badlands_plateau");
        $$0.put("167", "minecraft:modified_badlands_plateau");
    });
    public static final String b = "generatorOptions";

    public aur(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getOutputSchema().getType(avw.a);
        return this.fixTypeEverywhereTyped("LevelDataGeneratorOptionsFix", this.getInputSchema().getType(avw.a), $$0, $$12 -> (Typed)$$12.write().flatMap($$1 -> {
            Dynamic $$7;
            Optional $$2 = $$1.get(b).asString().result();
            if ("flat".equalsIgnoreCase($$1.get("generatorName").asString(""))) {
                String $$3 = $$2.orElse("");
                Dynamic $$4 = $$1.set(b, aur.a($$3, $$1.getOps()));
            } else if ("buffet".equalsIgnoreCase($$1.get("generatorName").asString("")) && $$2.isPresent()) {
                Dynamic $$5 = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)aor.a((String)$$2.get(), true));
                Dynamic $$6 = $$1.set(b, $$5.convert($$1.getOps()));
            } else {
                $$7 = $$1;
            }
            return $$0.readTyped($$7);
        }).map(Pair::getFirst).result().orElseThrow(() -> new IllegalStateException("Could not read new level type.")));
    }

    private static <T> Dynamic<T> a(String $$0, DynamicOps<T> $$13) {
        ArrayList $$122;
        Iterator $$2 = Splitter.on((char)';').split((CharSequence)$$0).iterator();
        String $$3 = "minecraft:plains";
        HashMap $$4 = Maps.newHashMap();
        if (!$$0.isEmpty() && $$2.hasNext()) {
            List<Pair<Integer, String>> $$5 = aur.b((String)$$2.next());
            if (!$$5.isEmpty()) {
                if ($$2.hasNext()) {
                    $$3 = a.getOrDefault($$2.next(), "minecraft:plains");
                }
                if ($$2.hasNext()) {
                    String[] $$6;
                    for (String $$7 : $$6 = ((String)$$2.next()).toLowerCase(Locale.ROOT).split(",")) {
                        String[] $$9;
                        String[] $$8 = $$7.split("\\(", 2);
                        if ($$8[0].isEmpty()) continue;
                        $$4.put($$8[0], Maps.newHashMap());
                        if ($$8.length <= 1 || !$$8[1].endsWith(")") || $$8[1].length() <= 1) continue;
                        for (String $$10 : $$9 = $$8[1].substring(0, $$8[1].length() - 1).split(" ")) {
                            String[] $$11 = $$10.split("=", 2);
                            if ($$11.length != 2) continue;
                            ((Map)$$4.get($$8[0])).put($$11[0], $$11[1]);
                        }
                    }
                } else {
                    $$4.put("village", Maps.newHashMap());
                }
            }
        } else {
            $$122 = Lists.newArrayList();
            $$122.add(Pair.of((Object)1, (Object)"minecraft:bedrock"));
            $$122.add(Pair.of((Object)2, (Object)"minecraft:dirt"));
            $$122.add(Pair.of((Object)1, (Object)"minecraft:grass_block"));
            $$4.put("village", Maps.newHashMap());
        }
        Object $$132 = $$13.createList($$122.stream().map($$1 -> $$13.createMap((Map)ImmutableMap.of((Object)$$13.createString("height"), (Object)$$13.createInt(((Integer)$$1.getFirst()).intValue()), (Object)$$13.createString("block"), (Object)$$13.createString((String)$$1.getSecond())))));
        Object $$14 = $$13.createMap($$4.entrySet().stream().map($$12 -> Pair.of((Object)$$13.createString(((String)$$12.getKey()).toLowerCase(Locale.ROOT)), (Object)$$13.createMap(((Map)$$12.getValue()).entrySet().stream().map($$1 -> Pair.of((Object)$$13.createString((String)$$1.getKey()), (Object)$$13.createString((String)$$1.getValue()))).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond))))).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
        return new Dynamic($$13, $$13.createMap((Map)ImmutableMap.of((Object)$$13.createString("layers"), (Object)$$132, (Object)$$13.createString("biome"), (Object)$$13.createString($$3), (Object)$$13.createString("structures"), (Object)$$14)));
    }

    @Nullable
    private static Pair<Integer, String> a(String $$0) {
        int $$4;
        String[] $$1 = $$0.split("\\*", 2);
        if ($$1.length == 2) {
            try {
                int $$2 = Integer.parseInt($$1[0]);
            }
            catch (NumberFormatException $$3) {
                return null;
            }
        } else {
            $$4 = 1;
        }
        String $$5 = $$1[$$1.length - 1];
        return Pair.of((Object)$$4, (Object)$$5);
    }

    private static List<Pair<Integer, String>> b(String $$0) {
        String[] $$2;
        ArrayList $$1 = Lists.newArrayList();
        for (String $$3 : $$2 = $$0.split(",")) {
            Pair<Integer, String> $$4 = aur.a($$3);
            if ($$4 == null) {
                return Collections.emptyList();
            }
            $$1.add($$4);
        }
        return $$1;
    }
}

