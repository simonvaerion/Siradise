/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class auj
extends DataFix {
    private static final Map<String, String> a = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        $$0.put("minecraft:stone.0", "minecraft:stone");
        $$0.put("minecraft:stone.1", "minecraft:granite");
        $$0.put("minecraft:stone.2", "minecraft:polished_granite");
        $$0.put("minecraft:stone.3", "minecraft:diorite");
        $$0.put("minecraft:stone.4", "minecraft:polished_diorite");
        $$0.put("minecraft:stone.5", "minecraft:andesite");
        $$0.put("minecraft:stone.6", "minecraft:polished_andesite");
        $$0.put("minecraft:dirt.0", "minecraft:dirt");
        $$0.put("minecraft:dirt.1", "minecraft:coarse_dirt");
        $$0.put("minecraft:dirt.2", "minecraft:podzol");
        $$0.put("minecraft:leaves.0", "minecraft:oak_leaves");
        $$0.put("minecraft:leaves.1", "minecraft:spruce_leaves");
        $$0.put("minecraft:leaves.2", "minecraft:birch_leaves");
        $$0.put("minecraft:leaves.3", "minecraft:jungle_leaves");
        $$0.put("minecraft:leaves2.0", "minecraft:acacia_leaves");
        $$0.put("minecraft:leaves2.1", "minecraft:dark_oak_leaves");
        $$0.put("minecraft:log.0", "minecraft:oak_log");
        $$0.put("minecraft:log.1", "minecraft:spruce_log");
        $$0.put("minecraft:log.2", "minecraft:birch_log");
        $$0.put("minecraft:log.3", "minecraft:jungle_log");
        $$0.put("minecraft:log2.0", "minecraft:acacia_log");
        $$0.put("minecraft:log2.1", "minecraft:dark_oak_log");
        $$0.put("minecraft:sapling.0", "minecraft:oak_sapling");
        $$0.put("minecraft:sapling.1", "minecraft:spruce_sapling");
        $$0.put("minecraft:sapling.2", "minecraft:birch_sapling");
        $$0.put("minecraft:sapling.3", "minecraft:jungle_sapling");
        $$0.put("minecraft:sapling.4", "minecraft:acacia_sapling");
        $$0.put("minecraft:sapling.5", "minecraft:dark_oak_sapling");
        $$0.put("minecraft:planks.0", "minecraft:oak_planks");
        $$0.put("minecraft:planks.1", "minecraft:spruce_planks");
        $$0.put("minecraft:planks.2", "minecraft:birch_planks");
        $$0.put("minecraft:planks.3", "minecraft:jungle_planks");
        $$0.put("minecraft:planks.4", "minecraft:acacia_planks");
        $$0.put("minecraft:planks.5", "minecraft:dark_oak_planks");
        $$0.put("minecraft:sand.0", "minecraft:sand");
        $$0.put("minecraft:sand.1", "minecraft:red_sand");
        $$0.put("minecraft:quartz_block.0", "minecraft:quartz_block");
        $$0.put("minecraft:quartz_block.1", "minecraft:chiseled_quartz_block");
        $$0.put("minecraft:quartz_block.2", "minecraft:quartz_pillar");
        $$0.put("minecraft:anvil.0", "minecraft:anvil");
        $$0.put("minecraft:anvil.1", "minecraft:chipped_anvil");
        $$0.put("minecraft:anvil.2", "minecraft:damaged_anvil");
        $$0.put("minecraft:wool.0", "minecraft:white_wool");
        $$0.put("minecraft:wool.1", "minecraft:orange_wool");
        $$0.put("minecraft:wool.2", "minecraft:magenta_wool");
        $$0.put("minecraft:wool.3", "minecraft:light_blue_wool");
        $$0.put("minecraft:wool.4", "minecraft:yellow_wool");
        $$0.put("minecraft:wool.5", "minecraft:lime_wool");
        $$0.put("minecraft:wool.6", "minecraft:pink_wool");
        $$0.put("minecraft:wool.7", "minecraft:gray_wool");
        $$0.put("minecraft:wool.8", "minecraft:light_gray_wool");
        $$0.put("minecraft:wool.9", "minecraft:cyan_wool");
        $$0.put("minecraft:wool.10", "minecraft:purple_wool");
        $$0.put("minecraft:wool.11", "minecraft:blue_wool");
        $$0.put("minecraft:wool.12", "minecraft:brown_wool");
        $$0.put("minecraft:wool.13", "minecraft:green_wool");
        $$0.put("minecraft:wool.14", "minecraft:red_wool");
        $$0.put("minecraft:wool.15", "minecraft:black_wool");
        $$0.put("minecraft:carpet.0", "minecraft:white_carpet");
        $$0.put("minecraft:carpet.1", "minecraft:orange_carpet");
        $$0.put("minecraft:carpet.2", "minecraft:magenta_carpet");
        $$0.put("minecraft:carpet.3", "minecraft:light_blue_carpet");
        $$0.put("minecraft:carpet.4", "minecraft:yellow_carpet");
        $$0.put("minecraft:carpet.5", "minecraft:lime_carpet");
        $$0.put("minecraft:carpet.6", "minecraft:pink_carpet");
        $$0.put("minecraft:carpet.7", "minecraft:gray_carpet");
        $$0.put("minecraft:carpet.8", "minecraft:light_gray_carpet");
        $$0.put("minecraft:carpet.9", "minecraft:cyan_carpet");
        $$0.put("minecraft:carpet.10", "minecraft:purple_carpet");
        $$0.put("minecraft:carpet.11", "minecraft:blue_carpet");
        $$0.put("minecraft:carpet.12", "minecraft:brown_carpet");
        $$0.put("minecraft:carpet.13", "minecraft:green_carpet");
        $$0.put("minecraft:carpet.14", "minecraft:red_carpet");
        $$0.put("minecraft:carpet.15", "minecraft:black_carpet");
        $$0.put("minecraft:hardened_clay.0", "minecraft:terracotta");
        $$0.put("minecraft:stained_hardened_clay.0", "minecraft:white_terracotta");
        $$0.put("minecraft:stained_hardened_clay.1", "minecraft:orange_terracotta");
        $$0.put("minecraft:stained_hardened_clay.2", "minecraft:magenta_terracotta");
        $$0.put("minecraft:stained_hardened_clay.3", "minecraft:light_blue_terracotta");
        $$0.put("minecraft:stained_hardened_clay.4", "minecraft:yellow_terracotta");
        $$0.put("minecraft:stained_hardened_clay.5", "minecraft:lime_terracotta");
        $$0.put("minecraft:stained_hardened_clay.6", "minecraft:pink_terracotta");
        $$0.put("minecraft:stained_hardened_clay.7", "minecraft:gray_terracotta");
        $$0.put("minecraft:stained_hardened_clay.8", "minecraft:light_gray_terracotta");
        $$0.put("minecraft:stained_hardened_clay.9", "minecraft:cyan_terracotta");
        $$0.put("minecraft:stained_hardened_clay.10", "minecraft:purple_terracotta");
        $$0.put("minecraft:stained_hardened_clay.11", "minecraft:blue_terracotta");
        $$0.put("minecraft:stained_hardened_clay.12", "minecraft:brown_terracotta");
        $$0.put("minecraft:stained_hardened_clay.13", "minecraft:green_terracotta");
        $$0.put("minecraft:stained_hardened_clay.14", "minecraft:red_terracotta");
        $$0.put("minecraft:stained_hardened_clay.15", "minecraft:black_terracotta");
        $$0.put("minecraft:silver_glazed_terracotta.0", "minecraft:light_gray_glazed_terracotta");
        $$0.put("minecraft:stained_glass.0", "minecraft:white_stained_glass");
        $$0.put("minecraft:stained_glass.1", "minecraft:orange_stained_glass");
        $$0.put("minecraft:stained_glass.2", "minecraft:magenta_stained_glass");
        $$0.put("minecraft:stained_glass.3", "minecraft:light_blue_stained_glass");
        $$0.put("minecraft:stained_glass.4", "minecraft:yellow_stained_glass");
        $$0.put("minecraft:stained_glass.5", "minecraft:lime_stained_glass");
        $$0.put("minecraft:stained_glass.6", "minecraft:pink_stained_glass");
        $$0.put("minecraft:stained_glass.7", "minecraft:gray_stained_glass");
        $$0.put("minecraft:stained_glass.8", "minecraft:light_gray_stained_glass");
        $$0.put("minecraft:stained_glass.9", "minecraft:cyan_stained_glass");
        $$0.put("minecraft:stained_glass.10", "minecraft:purple_stained_glass");
        $$0.put("minecraft:stained_glass.11", "minecraft:blue_stained_glass");
        $$0.put("minecraft:stained_glass.12", "minecraft:brown_stained_glass");
        $$0.put("minecraft:stained_glass.13", "minecraft:green_stained_glass");
        $$0.put("minecraft:stained_glass.14", "minecraft:red_stained_glass");
        $$0.put("minecraft:stained_glass.15", "minecraft:black_stained_glass");
        $$0.put("minecraft:stained_glass_pane.0", "minecraft:white_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.1", "minecraft:orange_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.2", "minecraft:magenta_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.3", "minecraft:light_blue_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.4", "minecraft:yellow_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.5", "minecraft:lime_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.6", "minecraft:pink_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.7", "minecraft:gray_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.8", "minecraft:light_gray_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.9", "minecraft:cyan_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.10", "minecraft:purple_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.11", "minecraft:blue_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.12", "minecraft:brown_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.13", "minecraft:green_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.14", "minecraft:red_stained_glass_pane");
        $$0.put("minecraft:stained_glass_pane.15", "minecraft:black_stained_glass_pane");
        $$0.put("minecraft:prismarine.0", "minecraft:prismarine");
        $$0.put("minecraft:prismarine.1", "minecraft:prismarine_bricks");
        $$0.put("minecraft:prismarine.2", "minecraft:dark_prismarine");
        $$0.put("minecraft:concrete.0", "minecraft:white_concrete");
        $$0.put("minecraft:concrete.1", "minecraft:orange_concrete");
        $$0.put("minecraft:concrete.2", "minecraft:magenta_concrete");
        $$0.put("minecraft:concrete.3", "minecraft:light_blue_concrete");
        $$0.put("minecraft:concrete.4", "minecraft:yellow_concrete");
        $$0.put("minecraft:concrete.5", "minecraft:lime_concrete");
        $$0.put("minecraft:concrete.6", "minecraft:pink_concrete");
        $$0.put("minecraft:concrete.7", "minecraft:gray_concrete");
        $$0.put("minecraft:concrete.8", "minecraft:light_gray_concrete");
        $$0.put("minecraft:concrete.9", "minecraft:cyan_concrete");
        $$0.put("minecraft:concrete.10", "minecraft:purple_concrete");
        $$0.put("minecraft:concrete.11", "minecraft:blue_concrete");
        $$0.put("minecraft:concrete.12", "minecraft:brown_concrete");
        $$0.put("minecraft:concrete.13", "minecraft:green_concrete");
        $$0.put("minecraft:concrete.14", "minecraft:red_concrete");
        $$0.put("minecraft:concrete.15", "minecraft:black_concrete");
        $$0.put("minecraft:concrete_powder.0", "minecraft:white_concrete_powder");
        $$0.put("minecraft:concrete_powder.1", "minecraft:orange_concrete_powder");
        $$0.put("minecraft:concrete_powder.2", "minecraft:magenta_concrete_powder");
        $$0.put("minecraft:concrete_powder.3", "minecraft:light_blue_concrete_powder");
        $$0.put("minecraft:concrete_powder.4", "minecraft:yellow_concrete_powder");
        $$0.put("minecraft:concrete_powder.5", "minecraft:lime_concrete_powder");
        $$0.put("minecraft:concrete_powder.6", "minecraft:pink_concrete_powder");
        $$0.put("minecraft:concrete_powder.7", "minecraft:gray_concrete_powder");
        $$0.put("minecraft:concrete_powder.8", "minecraft:light_gray_concrete_powder");
        $$0.put("minecraft:concrete_powder.9", "minecraft:cyan_concrete_powder");
        $$0.put("minecraft:concrete_powder.10", "minecraft:purple_concrete_powder");
        $$0.put("minecraft:concrete_powder.11", "minecraft:blue_concrete_powder");
        $$0.put("minecraft:concrete_powder.12", "minecraft:brown_concrete_powder");
        $$0.put("minecraft:concrete_powder.13", "minecraft:green_concrete_powder");
        $$0.put("minecraft:concrete_powder.14", "minecraft:red_concrete_powder");
        $$0.put("minecraft:concrete_powder.15", "minecraft:black_concrete_powder");
        $$0.put("minecraft:cobblestone_wall.0", "minecraft:cobblestone_wall");
        $$0.put("minecraft:cobblestone_wall.1", "minecraft:mossy_cobblestone_wall");
        $$0.put("minecraft:sandstone.0", "minecraft:sandstone");
        $$0.put("minecraft:sandstone.1", "minecraft:chiseled_sandstone");
        $$0.put("minecraft:sandstone.2", "minecraft:cut_sandstone");
        $$0.put("minecraft:red_sandstone.0", "minecraft:red_sandstone");
        $$0.put("minecraft:red_sandstone.1", "minecraft:chiseled_red_sandstone");
        $$0.put("minecraft:red_sandstone.2", "minecraft:cut_red_sandstone");
        $$0.put("minecraft:stonebrick.0", "minecraft:stone_bricks");
        $$0.put("minecraft:stonebrick.1", "minecraft:mossy_stone_bricks");
        $$0.put("minecraft:stonebrick.2", "minecraft:cracked_stone_bricks");
        $$0.put("minecraft:stonebrick.3", "minecraft:chiseled_stone_bricks");
        $$0.put("minecraft:monster_egg.0", "minecraft:infested_stone");
        $$0.put("minecraft:monster_egg.1", "minecraft:infested_cobblestone");
        $$0.put("minecraft:monster_egg.2", "minecraft:infested_stone_bricks");
        $$0.put("minecraft:monster_egg.3", "minecraft:infested_mossy_stone_bricks");
        $$0.put("minecraft:monster_egg.4", "minecraft:infested_cracked_stone_bricks");
        $$0.put("minecraft:monster_egg.5", "minecraft:infested_chiseled_stone_bricks");
        $$0.put("minecraft:yellow_flower.0", "minecraft:dandelion");
        $$0.put("minecraft:red_flower.0", "minecraft:poppy");
        $$0.put("minecraft:red_flower.1", "minecraft:blue_orchid");
        $$0.put("minecraft:red_flower.2", "minecraft:allium");
        $$0.put("minecraft:red_flower.3", "minecraft:azure_bluet");
        $$0.put("minecraft:red_flower.4", "minecraft:red_tulip");
        $$0.put("minecraft:red_flower.5", "minecraft:orange_tulip");
        $$0.put("minecraft:red_flower.6", "minecraft:white_tulip");
        $$0.put("minecraft:red_flower.7", "minecraft:pink_tulip");
        $$0.put("minecraft:red_flower.8", "minecraft:oxeye_daisy");
        $$0.put("minecraft:double_plant.0", "minecraft:sunflower");
        $$0.put("minecraft:double_plant.1", "minecraft:lilac");
        $$0.put("minecraft:double_plant.2", "minecraft:tall_grass");
        $$0.put("minecraft:double_plant.3", "minecraft:large_fern");
        $$0.put("minecraft:double_plant.4", "minecraft:rose_bush");
        $$0.put("minecraft:double_plant.5", "minecraft:peony");
        $$0.put("minecraft:deadbush.0", "minecraft:dead_bush");
        $$0.put("minecraft:tallgrass.0", "minecraft:dead_bush");
        $$0.put("minecraft:tallgrass.1", "minecraft:grass");
        $$0.put("minecraft:tallgrass.2", "minecraft:fern");
        $$0.put("minecraft:sponge.0", "minecraft:sponge");
        $$0.put("minecraft:sponge.1", "minecraft:wet_sponge");
        $$0.put("minecraft:purpur_slab.0", "minecraft:purpur_slab");
        $$0.put("minecraft:stone_slab.0", "minecraft:stone_slab");
        $$0.put("minecraft:stone_slab.1", "minecraft:sandstone_slab");
        $$0.put("minecraft:stone_slab.2", "minecraft:petrified_oak_slab");
        $$0.put("minecraft:stone_slab.3", "minecraft:cobblestone_slab");
        $$0.put("minecraft:stone_slab.4", "minecraft:brick_slab");
        $$0.put("minecraft:stone_slab.5", "minecraft:stone_brick_slab");
        $$0.put("minecraft:stone_slab.6", "minecraft:nether_brick_slab");
        $$0.put("minecraft:stone_slab.7", "minecraft:quartz_slab");
        $$0.put("minecraft:stone_slab2.0", "minecraft:red_sandstone_slab");
        $$0.put("minecraft:wooden_slab.0", "minecraft:oak_slab");
        $$0.put("minecraft:wooden_slab.1", "minecraft:spruce_slab");
        $$0.put("minecraft:wooden_slab.2", "minecraft:birch_slab");
        $$0.put("minecraft:wooden_slab.3", "minecraft:jungle_slab");
        $$0.put("minecraft:wooden_slab.4", "minecraft:acacia_slab");
        $$0.put("minecraft:wooden_slab.5", "minecraft:dark_oak_slab");
        $$0.put("minecraft:coal.0", "minecraft:coal");
        $$0.put("minecraft:coal.1", "minecraft:charcoal");
        $$0.put("minecraft:fish.0", "minecraft:cod");
        $$0.put("minecraft:fish.1", "minecraft:salmon");
        $$0.put("minecraft:fish.2", "minecraft:clownfish");
        $$0.put("minecraft:fish.3", "minecraft:pufferfish");
        $$0.put("minecraft:cooked_fish.0", "minecraft:cooked_cod");
        $$0.put("minecraft:cooked_fish.1", "minecraft:cooked_salmon");
        $$0.put("minecraft:skull.0", "minecraft:skeleton_skull");
        $$0.put("minecraft:skull.1", "minecraft:wither_skeleton_skull");
        $$0.put("minecraft:skull.2", "minecraft:zombie_head");
        $$0.put("minecraft:skull.3", "minecraft:player_head");
        $$0.put("minecraft:skull.4", "minecraft:creeper_head");
        $$0.put("minecraft:skull.5", "minecraft:dragon_head");
        $$0.put("minecraft:golden_apple.0", "minecraft:golden_apple");
        $$0.put("minecraft:golden_apple.1", "minecraft:enchanted_golden_apple");
        $$0.put("minecraft:fireworks.0", "minecraft:firework_rocket");
        $$0.put("minecraft:firework_charge.0", "minecraft:firework_star");
        $$0.put("minecraft:dye.0", "minecraft:ink_sac");
        $$0.put("minecraft:dye.1", "minecraft:rose_red");
        $$0.put("minecraft:dye.2", "minecraft:cactus_green");
        $$0.put("minecraft:dye.3", "minecraft:cocoa_beans");
        $$0.put("minecraft:dye.4", "minecraft:lapis_lazuli");
        $$0.put("minecraft:dye.5", "minecraft:purple_dye");
        $$0.put("minecraft:dye.6", "minecraft:cyan_dye");
        $$0.put("minecraft:dye.7", "minecraft:light_gray_dye");
        $$0.put("minecraft:dye.8", "minecraft:gray_dye");
        $$0.put("minecraft:dye.9", "minecraft:pink_dye");
        $$0.put("minecraft:dye.10", "minecraft:lime_dye");
        $$0.put("minecraft:dye.11", "minecraft:dandelion_yellow");
        $$0.put("minecraft:dye.12", "minecraft:light_blue_dye");
        $$0.put("minecraft:dye.13", "minecraft:magenta_dye");
        $$0.put("minecraft:dye.14", "minecraft:orange_dye");
        $$0.put("minecraft:dye.15", "minecraft:bone_meal");
        $$0.put("minecraft:silver_shulker_box.0", "minecraft:light_gray_shulker_box");
        $$0.put("minecraft:fence.0", "minecraft:oak_fence");
        $$0.put("minecraft:fence_gate.0", "minecraft:oak_fence_gate");
        $$0.put("minecraft:wooden_door.0", "minecraft:oak_door");
        $$0.put("minecraft:boat.0", "minecraft:oak_boat");
        $$0.put("minecraft:lit_pumpkin.0", "minecraft:jack_o_lantern");
        $$0.put("minecraft:pumpkin.0", "minecraft:carved_pumpkin");
        $$0.put("minecraft:trapdoor.0", "minecraft:oak_trapdoor");
        $$0.put("minecraft:nether_brick.0", "minecraft:nether_bricks");
        $$0.put("minecraft:red_nether_brick.0", "minecraft:red_nether_bricks");
        $$0.put("minecraft:netherbrick.0", "minecraft:nether_brick");
        $$0.put("minecraft:wooden_button.0", "minecraft:oak_button");
        $$0.put("minecraft:wooden_pressure_plate.0", "minecraft:oak_pressure_plate");
        $$0.put("minecraft:noteblock.0", "minecraft:note_block");
        $$0.put("minecraft:bed.0", "minecraft:white_bed");
        $$0.put("minecraft:bed.1", "minecraft:orange_bed");
        $$0.put("minecraft:bed.2", "minecraft:magenta_bed");
        $$0.put("minecraft:bed.3", "minecraft:light_blue_bed");
        $$0.put("minecraft:bed.4", "minecraft:yellow_bed");
        $$0.put("minecraft:bed.5", "minecraft:lime_bed");
        $$0.put("minecraft:bed.6", "minecraft:pink_bed");
        $$0.put("minecraft:bed.7", "minecraft:gray_bed");
        $$0.put("minecraft:bed.8", "minecraft:light_gray_bed");
        $$0.put("minecraft:bed.9", "minecraft:cyan_bed");
        $$0.put("minecraft:bed.10", "minecraft:purple_bed");
        $$0.put("minecraft:bed.11", "minecraft:blue_bed");
        $$0.put("minecraft:bed.12", "minecraft:brown_bed");
        $$0.put("minecraft:bed.13", "minecraft:green_bed");
        $$0.put("minecraft:bed.14", "minecraft:red_bed");
        $$0.put("minecraft:bed.15", "minecraft:black_bed");
        $$0.put("minecraft:banner.15", "minecraft:white_banner");
        $$0.put("minecraft:banner.14", "minecraft:orange_banner");
        $$0.put("minecraft:banner.13", "minecraft:magenta_banner");
        $$0.put("minecraft:banner.12", "minecraft:light_blue_banner");
        $$0.put("minecraft:banner.11", "minecraft:yellow_banner");
        $$0.put("minecraft:banner.10", "minecraft:lime_banner");
        $$0.put("minecraft:banner.9", "minecraft:pink_banner");
        $$0.put("minecraft:banner.8", "minecraft:gray_banner");
        $$0.put("minecraft:banner.7", "minecraft:light_gray_banner");
        $$0.put("minecraft:banner.6", "minecraft:cyan_banner");
        $$0.put("minecraft:banner.5", "minecraft:purple_banner");
        $$0.put("minecraft:banner.4", "minecraft:blue_banner");
        $$0.put("minecraft:banner.3", "minecraft:brown_banner");
        $$0.put("minecraft:banner.2", "minecraft:green_banner");
        $$0.put("minecraft:banner.1", "minecraft:red_banner");
        $$0.put("minecraft:banner.0", "minecraft:black_banner");
        $$0.put("minecraft:grass.0", "minecraft:grass_block");
        $$0.put("minecraft:brick_block.0", "minecraft:bricks");
        $$0.put("minecraft:end_bricks.0", "minecraft:end_stone_bricks");
        $$0.put("minecraft:golden_rail.0", "minecraft:powered_rail");
        $$0.put("minecraft:magma.0", "minecraft:magma_block");
        $$0.put("minecraft:quartz_ore.0", "minecraft:nether_quartz_ore");
        $$0.put("minecraft:reeds.0", "minecraft:sugar_cane");
        $$0.put("minecraft:slime.0", "minecraft:slime_block");
        $$0.put("minecraft:stone_stairs.0", "minecraft:cobblestone_stairs");
        $$0.put("minecraft:waterlily.0", "minecraft:lily_pad");
        $$0.put("minecraft:web.0", "minecraft:cobweb");
        $$0.put("minecraft:snow.0", "minecraft:snow_block");
        $$0.put("minecraft:snow_layer.0", "minecraft:snow");
        $$0.put("minecraft:record_11.0", "minecraft:music_disc_11");
        $$0.put("minecraft:record_13.0", "minecraft:music_disc_13");
        $$0.put("minecraft:record_blocks.0", "minecraft:music_disc_blocks");
        $$0.put("minecraft:record_cat.0", "minecraft:music_disc_cat");
        $$0.put("minecraft:record_chirp.0", "minecraft:music_disc_chirp");
        $$0.put("minecraft:record_far.0", "minecraft:music_disc_far");
        $$0.put("minecraft:record_mall.0", "minecraft:music_disc_mall");
        $$0.put("minecraft:record_mellohi.0", "minecraft:music_disc_mellohi");
        $$0.put("minecraft:record_stal.0", "minecraft:music_disc_stal");
        $$0.put("minecraft:record_strad.0", "minecraft:music_disc_strad");
        $$0.put("minecraft:record_wait.0", "minecraft:music_disc_wait");
        $$0.put("minecraft:record_ward.0", "minecraft:music_disc_ward");
    });
    private static final Set<String> b = a.keySet().stream().map($$0 -> $$0.substring(0, $$0.indexOf(46))).collect(Collectors.toSet());
    private static final Set<String> c = Sets.newHashSet((Object[])new String[]{"minecraft:bow", "minecraft:carrot_on_a_stick", "minecraft:chainmail_boots", "minecraft:chainmail_chestplate", "minecraft:chainmail_helmet", "minecraft:chainmail_leggings", "minecraft:diamond_axe", "minecraft:diamond_boots", "minecraft:diamond_chestplate", "minecraft:diamond_helmet", "minecraft:diamond_hoe", "minecraft:diamond_leggings", "minecraft:diamond_pickaxe", "minecraft:diamond_shovel", "minecraft:diamond_sword", "minecraft:elytra", "minecraft:fishing_rod", "minecraft:flint_and_steel", "minecraft:golden_axe", "minecraft:golden_boots", "minecraft:golden_chestplate", "minecraft:golden_helmet", "minecraft:golden_hoe", "minecraft:golden_leggings", "minecraft:golden_pickaxe", "minecraft:golden_shovel", "minecraft:golden_sword", "minecraft:iron_axe", "minecraft:iron_boots", "minecraft:iron_chestplate", "minecraft:iron_helmet", "minecraft:iron_hoe", "minecraft:iron_leggings", "minecraft:iron_pickaxe", "minecraft:iron_shovel", "minecraft:iron_sword", "minecraft:leather_boots", "minecraft:leather_chestplate", "minecraft:leather_helmet", "minecraft:leather_leggings", "minecraft:shears", "minecraft:shield", "minecraft:stone_axe", "minecraft:stone_hoe", "minecraft:stone_pickaxe", "minecraft:stone_shovel", "minecraft:stone_sword", "minecraft:wooden_axe", "minecraft:wooden_hoe", "minecraft:wooden_pickaxe", "minecraft:wooden_shovel", "minecraft:wooden_sword"});

    public auj(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.m);
        OpticFinder $$1 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)avw.s.typeName(), axd.a()));
        OpticFinder $$22 = $$0.findField("tag");
        return this.fixTypeEverywhereTyped("ItemInstanceTheFlatteningFix", $$0, $$2 -> {
            Optional $$3 = $$2.getOptional($$1);
            if (!$$3.isPresent()) {
                return $$2;
            }
            Typed $$4 = $$2;
            Dynamic $$5 = (Dynamic)$$2.get(DSL.remainderFinder());
            int $$6 = $$5.get("Damage").asInt(0);
            String $$7 = auj.a((String)((Pair)$$3.get()).getSecond(), $$6);
            if ($$7 != null) {
                $$4 = $$4.set($$1, (Object)Pair.of((Object)avw.s.typeName(), (Object)$$7));
            }
            if (c.contains(((Pair)$$3.get()).getSecond())) {
                Typed $$8 = $$2.getOrCreateTyped($$22);
                Dynamic $$9 = (Dynamic)$$8.get(DSL.remainderFinder());
                $$9 = $$9.set("Damage", $$9.createInt($$6));
                $$4 = $$4.set($$22, $$8.set(DSL.remainderFinder(), (Object)$$9));
            }
            $$4 = $$4.set(DSL.remainderFinder(), (Object)$$5.remove("Damage"));
            return $$4;
        });
    }

    @Nullable
    public static String a(@Nullable String $$0, int $$1) {
        if (b.contains($$0)) {
            String $$2 = a.get($$0 + "." + $$1);
            return $$2 == null ? a.get($$0 + ".0") : $$2;
        }
        return null;
    }
}

