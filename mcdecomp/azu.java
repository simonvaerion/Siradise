/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class azu
extends Schema {
    protected static final Map<String, String> a = (Map)DataFixUtils.make(() -> {
        HashMap $$0 = Maps.newHashMap();
        $$0.put("minecraft:furnace", "minecraft:furnace");
        $$0.put("minecraft:lit_furnace", "minecraft:furnace");
        $$0.put("minecraft:chest", "minecraft:chest");
        $$0.put("minecraft:trapped_chest", "minecraft:chest");
        $$0.put("minecraft:ender_chest", "minecraft:ender_chest");
        $$0.put("minecraft:jukebox", "minecraft:jukebox");
        $$0.put("minecraft:dispenser", "minecraft:dispenser");
        $$0.put("minecraft:dropper", "minecraft:dropper");
        $$0.put("minecraft:sign", "minecraft:sign");
        $$0.put("minecraft:mob_spawner", "minecraft:mob_spawner");
        $$0.put("minecraft:spawner", "minecraft:mob_spawner");
        $$0.put("minecraft:noteblock", "minecraft:noteblock");
        $$0.put("minecraft:brewing_stand", "minecraft:brewing_stand");
        $$0.put("minecraft:enhanting_table", "minecraft:enchanting_table");
        $$0.put("minecraft:command_block", "minecraft:command_block");
        $$0.put("minecraft:beacon", "minecraft:beacon");
        $$0.put("minecraft:skull", "minecraft:skull");
        $$0.put("minecraft:daylight_detector", "minecraft:daylight_detector");
        $$0.put("minecraft:hopper", "minecraft:hopper");
        $$0.put("minecraft:banner", "minecraft:banner");
        $$0.put("minecraft:flower_pot", "minecraft:flower_pot");
        $$0.put("minecraft:repeating_command_block", "minecraft:command_block");
        $$0.put("minecraft:chain_command_block", "minecraft:command_block");
        $$0.put("minecraft:shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:white_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:orange_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:magenta_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:light_blue_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:yellow_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:lime_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:pink_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:gray_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:silver_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:cyan_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:purple_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:blue_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:brown_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:green_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:red_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:black_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:bed", "minecraft:bed");
        $$0.put("minecraft:light_gray_shulker_box", "minecraft:shulker_box");
        $$0.put("minecraft:banner", "minecraft:banner");
        $$0.put("minecraft:white_banner", "minecraft:banner");
        $$0.put("minecraft:orange_banner", "minecraft:banner");
        $$0.put("minecraft:magenta_banner", "minecraft:banner");
        $$0.put("minecraft:light_blue_banner", "minecraft:banner");
        $$0.put("minecraft:yellow_banner", "minecraft:banner");
        $$0.put("minecraft:lime_banner", "minecraft:banner");
        $$0.put("minecraft:pink_banner", "minecraft:banner");
        $$0.put("minecraft:gray_banner", "minecraft:banner");
        $$0.put("minecraft:silver_banner", "minecraft:banner");
        $$0.put("minecraft:light_gray_banner", "minecraft:banner");
        $$0.put("minecraft:cyan_banner", "minecraft:banner");
        $$0.put("minecraft:purple_banner", "minecraft:banner");
        $$0.put("minecraft:blue_banner", "minecraft:banner");
        $$0.put("minecraft:brown_banner", "minecraft:banner");
        $$0.put("minecraft:green_banner", "minecraft:banner");
        $$0.put("minecraft:red_banner", "minecraft:banner");
        $$0.put("minecraft:black_banner", "minecraft:banner");
        $$0.put("minecraft:standing_sign", "minecraft:sign");
        $$0.put("minecraft:wall_sign", "minecraft:sign");
        $$0.put("minecraft:piston_head", "minecraft:piston");
        $$0.put("minecraft:daylight_detector_inverted", "minecraft:daylight_detector");
        $$0.put("minecraft:unpowered_comparator", "minecraft:comparator");
        $$0.put("minecraft:powered_comparator", "minecraft:comparator");
        $$0.put("minecraft:wall_banner", "minecraft:banner");
        $$0.put("minecraft:standing_banner", "minecraft:banner");
        $$0.put("minecraft:structure_block", "minecraft:structure_block");
        $$0.put("minecraft:end_portal", "minecraft:end_portal");
        $$0.put("minecraft:end_gateway", "minecraft:end_gateway");
        $$0.put("minecraft:sign", "minecraft:sign");
        $$0.put("minecraft:shield", "minecraft:banner");
        $$0.put("minecraft:white_bed", "minecraft:bed");
        $$0.put("minecraft:orange_bed", "minecraft:bed");
        $$0.put("minecraft:magenta_bed", "minecraft:bed");
        $$0.put("minecraft:light_blue_bed", "minecraft:bed");
        $$0.put("minecraft:yellow_bed", "minecraft:bed");
        $$0.put("minecraft:lime_bed", "minecraft:bed");
        $$0.put("minecraft:pink_bed", "minecraft:bed");
        $$0.put("minecraft:gray_bed", "minecraft:bed");
        $$0.put("minecraft:silver_bed", "minecraft:bed");
        $$0.put("minecraft:light_gray_bed", "minecraft:bed");
        $$0.put("minecraft:cyan_bed", "minecraft:bed");
        $$0.put("minecraft:purple_bed", "minecraft:bed");
        $$0.put("minecraft:blue_bed", "minecraft:bed");
        $$0.put("minecraft:brown_bed", "minecraft:bed");
        $$0.put("minecraft:green_bed", "minecraft:bed");
        $$0.put("minecraft:red_bed", "minecraft:bed");
        $$0.put("minecraft:black_bed", "minecraft:bed");
        $$0.put("minecraft:oak_sign", "minecraft:sign");
        $$0.put("minecraft:spruce_sign", "minecraft:sign");
        $$0.put("minecraft:birch_sign", "minecraft:sign");
        $$0.put("minecraft:jungle_sign", "minecraft:sign");
        $$0.put("minecraft:acacia_sign", "minecraft:sign");
        $$0.put("minecraft:dark_oak_sign", "minecraft:sign");
        $$0.put("minecraft:crimson_sign", "minecraft:sign");
        $$0.put("minecraft:warped_sign", "minecraft:sign");
        $$0.put("minecraft:skeleton_skull", "minecraft:skull");
        $$0.put("minecraft:wither_skeleton_skull", "minecraft:skull");
        $$0.put("minecraft:zombie_head", "minecraft:skull");
        $$0.put("minecraft:player_head", "minecraft:skull");
        $$0.put("minecraft:creeper_head", "minecraft:skull");
        $$0.put("minecraft:dragon_head", "minecraft:skull");
        $$0.put("minecraft:barrel", "minecraft:barrel");
        $$0.put("minecraft:conduit", "minecraft:conduit");
        $$0.put("minecraft:smoker", "minecraft:smoker");
        $$0.put("minecraft:blast_furnace", "minecraft:blast_furnace");
        $$0.put("minecraft:lectern", "minecraft:lectern");
        $$0.put("minecraft:bell", "minecraft:bell");
        $$0.put("minecraft:jigsaw", "minecraft:jigsaw");
        $$0.put("minecraft:campfire", "minecraft:campfire");
        $$0.put("minecraft:bee_nest", "minecraft:beehive");
        $$0.put("minecraft:beehive", "minecraft:beehive");
        $$0.put("minecraft:sculk_sensor", "minecraft:sculk_sensor");
        $$0.put("minecraft:decorated_pot", "minecraft:decorated_pot");
        return ImmutableMap.copyOf((Map)$$0);
    });
    protected static final Hook.HookFunction b = new Hook.HookFunction(){

        public <T> T apply(DynamicOps<T> $$0, T $$1) {
            return azx.a(new Dynamic($$0, $$1), a, "ArmorStand");
        }
    };

    public azu(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
    }

    public Type<?> getChoiceType(DSL.TypeReference $$0, String $$1) {
        if (Objects.equals($$0.typeName(), avw.l.typeName())) {
            return super.getChoiceType($$0, axd.a($$1));
        }
        return super.getChoiceType($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        azu.a($$0, $$12, "minecraft:furnace");
        azu.a($$0, $$12, "minecraft:chest");
        $$0.registerSimple((Map)$$12, "minecraft:ender_chest");
        $$0.register((Map)$$12, "minecraft:jukebox", $$1 -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)avw.m.in($$0)));
        azu.a($$0, $$12, "minecraft:dispenser");
        azu.a($$0, $$12, "minecraft:dropper");
        $$0.registerSimple((Map)$$12, "minecraft:sign");
        $$0.register((Map)$$12, "minecraft:mob_spawner", $$1 -> avw.u.in($$0));
        $$0.registerSimple((Map)$$12, "minecraft:noteblock");
        $$0.registerSimple((Map)$$12, "minecraft:piston");
        azu.a($$0, $$12, "minecraft:brewing_stand");
        $$0.registerSimple((Map)$$12, "minecraft:enchanting_table");
        $$0.registerSimple((Map)$$12, "minecraft:end_portal");
        $$0.registerSimple((Map)$$12, "minecraft:beacon");
        $$0.registerSimple((Map)$$12, "minecraft:skull");
        $$0.registerSimple((Map)$$12, "minecraft:daylight_detector");
        azu.a($$0, $$12, "minecraft:hopper");
        $$0.registerSimple((Map)$$12, "minecraft:comparator");
        $$0.register((Map)$$12, "minecraft:flower_pot", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)avw.s.in($$0))));
        $$0.registerSimple((Map)$$12, "minecraft:banner");
        $$0.registerSimple((Map)$$12, "minecraft:structure_block");
        $$0.registerSimple((Map)$$12, "minecraft:end_gateway");
        $$0.registerSimple((Map)$$12, "minecraft:command_block");
        return $$12;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(false, avw.l, () -> DSL.taggedChoiceLazy((String)"id", axd.a(), (Map)$$2));
        $$0.registerType(true, avw.m, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)avw.s.in($$0), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)avw.p.in($$0), (String)"BlockEntityTag", (TypeTemplate)avw.l.in($$0), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)))), (Hook.HookFunction)b, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
    }
}

