/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class axt
extends axd {
    public axt(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> axe.a($$0));
    }

    protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.registerSimple((Map)$$12, "minecraft:area_effect_cloud");
        axt.a($$0, $$12, "minecraft:armor_stand");
        $$0.register((Map)$$12, "minecraft:arrow", $$1 -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)avw.n.in($$0)));
        axt.a($$0, $$12, "minecraft:bat");
        axt.a($$0, $$12, "minecraft:blaze");
        $$0.registerSimple((Map)$$12, "minecraft:boat");
        axt.a($$0, $$12, "minecraft:cave_spider");
        $$0.register((Map)$$12, "minecraft:chest_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)avw.n.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        axt.a($$0, $$12, "minecraft:chicken");
        $$0.register((Map)$$12, "minecraft:commandblock_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)avw.n.in($$0)));
        axt.a($$0, $$12, "minecraft:cow");
        axt.a($$0, $$12, "minecraft:creeper");
        $$0.register((Map)$$12, "minecraft:donkey", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:dragon_fireball");
        $$0.registerSimple((Map)$$12, "minecraft:egg");
        axt.a($$0, $$12, "minecraft:elder_guardian");
        $$0.registerSimple((Map)$$12, "minecraft:ender_crystal");
        axt.a($$0, $$12, "minecraft:ender_dragon");
        $$0.register((Map)$$12, "minecraft:enderman", $$1 -> DSL.optionalFields((String)"carriedBlockState", (TypeTemplate)avw.n.in($$0), (TypeTemplate)axe.a($$0)));
        axt.a($$0, $$12, "minecraft:endermite");
        $$0.registerSimple((Map)$$12, "minecraft:ender_pearl");
        $$0.registerSimple((Map)$$12, "minecraft:evocation_fangs");
        axt.a($$0, $$12, "minecraft:evocation_illager");
        $$0.registerSimple((Map)$$12, "minecraft:eye_of_ender_signal");
        $$0.register((Map)$$12, "minecraft:falling_block", $$1 -> DSL.optionalFields((String)"BlockState", (TypeTemplate)avw.n.in($$0), (String)"TileEntityData", (TypeTemplate)avw.l.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:fireball");
        $$0.register((Map)$$12, "minecraft:fireworks_rocket", $$1 -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)avw.m.in($$0)));
        $$0.register((Map)$$12, "minecraft:furnace_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)avw.n.in($$0)));
        axt.a($$0, $$12, "minecraft:ghast");
        axt.a($$0, $$12, "minecraft:giant");
        axt.a($$0, $$12, "minecraft:guardian");
        $$0.register((Map)$$12, "minecraft:hopper_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)avw.n.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        $$0.register((Map)$$12, "minecraft:horse", $$1 -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)avw.m.in($$0), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        axt.a($$0, $$12, "minecraft:husk");
        $$0.registerSimple((Map)$$12, "minecraft:illusion_illager");
        $$0.register((Map)$$12, "minecraft:item", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)avw.m.in($$0)));
        $$0.register((Map)$$12, "minecraft:item_frame", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)avw.m.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:leash_knot");
        $$0.register((Map)$$12, "minecraft:llama", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (String)"DecorItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:llama_spit");
        axt.a($$0, $$12, "minecraft:magma_cube");
        $$0.register((Map)$$12, "minecraft:minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)avw.n.in($$0)));
        axt.a($$0, $$12, "minecraft:mooshroom");
        $$0.register((Map)$$12, "minecraft:mule", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        axt.a($$0, $$12, "minecraft:ocelot");
        $$0.registerSimple((Map)$$12, "minecraft:painting");
        $$0.registerSimple((Map)$$12, "minecraft:parrot");
        axt.a($$0, $$12, "minecraft:pig");
        axt.a($$0, $$12, "minecraft:polar_bear");
        $$0.register((Map)$$12, "minecraft:potion", $$1 -> DSL.optionalFields((String)"Potion", (TypeTemplate)avw.m.in($$0)));
        axt.a($$0, $$12, "minecraft:rabbit");
        axt.a($$0, $$12, "minecraft:sheep");
        axt.a($$0, $$12, "minecraft:shulker");
        $$0.registerSimple((Map)$$12, "minecraft:shulker_bullet");
        axt.a($$0, $$12, "minecraft:silverfish");
        axt.a($$0, $$12, "minecraft:skeleton");
        $$0.register((Map)$$12, "minecraft:skeleton_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        axt.a($$0, $$12, "minecraft:slime");
        $$0.registerSimple((Map)$$12, "minecraft:small_fireball");
        $$0.registerSimple((Map)$$12, "minecraft:snowball");
        axt.a($$0, $$12, "minecraft:snowman");
        $$0.register((Map)$$12, "minecraft:spawner_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)avw.n.in($$0), (TypeTemplate)avw.u.in($$0)));
        $$0.register((Map)$$12, "minecraft:spectral_arrow", $$1 -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)avw.n.in($$0)));
        axt.a($$0, $$12, "minecraft:spider");
        axt.a($$0, $$12, "minecraft:squid");
        axt.a($$0, $$12, "minecraft:stray");
        $$0.registerSimple((Map)$$12, "minecraft:tnt");
        $$0.register((Map)$$12, "minecraft:tnt_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)avw.n.in($$0)));
        axt.a($$0, $$12, "minecraft:vex");
        $$0.register((Map)$$12, "minecraft:villager", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)avw.m.in($$0), (String)"buyB", (TypeTemplate)avw.m.in($$0), (String)"sell", (TypeTemplate)avw.m.in($$0)))), (TypeTemplate)axe.a($$0)));
        axt.a($$0, $$12, "minecraft:villager_golem");
        axt.a($$0, $$12, "minecraft:vindication_illager");
        axt.a($$0, $$12, "minecraft:witch");
        axt.a($$0, $$12, "minecraft:wither");
        axt.a($$0, $$12, "minecraft:wither_skeleton");
        $$0.registerSimple((Map)$$12, "minecraft:wither_skull");
        axt.a($$0, $$12, "minecraft:wolf");
        $$0.registerSimple((Map)$$12, "minecraft:xp_bottle");
        $$0.registerSimple((Map)$$12, "minecraft:xp_orb");
        axt.a($$0, $$12, "minecraft:zombie");
        $$0.register((Map)$$12, "minecraft:zombie_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        axt.a($$0, $$12, "minecraft:zombie_pigman");
        axt.a($$0, $$12, "minecraft:zombie_villager");
        return $$12;
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        axt.b($$0, $$12, "minecraft:furnace");
        axt.b($$0, $$12, "minecraft:chest");
        axt.b($$0, $$12, "minecraft:trapped_chest");
        $$0.registerSimple((Map)$$12, "minecraft:ender_chest");
        $$0.register((Map)$$12, "minecraft:jukebox", $$1 -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)avw.m.in($$0)));
        axt.b($$0, $$12, "minecraft:dispenser");
        axt.b($$0, $$12, "minecraft:dropper");
        $$0.registerSimple((Map)$$12, "minecraft:sign");
        $$0.register((Map)$$12, "minecraft:mob_spawner", $$1 -> avw.u.in($$0));
        $$0.register((Map)$$12, "minecraft:piston", $$1 -> DSL.optionalFields((String)"blockState", (TypeTemplate)avw.n.in($$0)));
        axt.b($$0, $$12, "minecraft:brewing_stand");
        $$0.registerSimple((Map)$$12, "minecraft:enchanting_table");
        $$0.registerSimple((Map)$$12, "minecraft:end_portal");
        $$0.registerSimple((Map)$$12, "minecraft:beacon");
        $$0.registerSimple((Map)$$12, "minecraft:skull");
        $$0.registerSimple((Map)$$12, "minecraft:daylight_detector");
        axt.b($$0, $$12, "minecraft:hopper");
        $$0.registerSimple((Map)$$12, "minecraft:comparator");
        $$0.registerSimple((Map)$$12, "minecraft:banner");
        $$0.registerSimple((Map)$$12, "minecraft:structure_block");
        $$0.registerSimple((Map)$$12, "minecraft:end_gateway");
        $$0.registerSimple((Map)$$12, "minecraft:command_block");
        axt.b($$0, $$12, "minecraft:shulker_box");
        $$0.registerSimple((Map)$$12, "minecraft:bed");
        return $$12;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        $$0.registerType(false, avw.a, DSL::remainder);
        $$0.registerType(false, avw.y, () -> DSL.constType(axt.a()));
        $$0.registerType(false, avw.b, () -> DSL.optionalFields((String)"RootVehicle", (TypeTemplate)DSL.optionalFields((String)"Entity", (TypeTemplate)avw.p.in($$0)), (String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (TypeTemplate)DSL.optionalFields((String)"ShoulderEntityLeft", (TypeTemplate)avw.p.in($$0), (String)"ShoulderEntityRight", (TypeTemplate)avw.p.in($$0), (String)"recipeBook", (TypeTemplate)DSL.optionalFields((String)"recipes", (TypeTemplate)DSL.list((TypeTemplate)avw.y.in($$0)), (String)"toBeDisplayed", (TypeTemplate)DSL.list((TypeTemplate)avw.y.in($$0))))));
        $$0.registerType(false, avw.c, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)avw.p.in($$0)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)avw.l.in($$0), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)avw.r.in($$0))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Palette", (TypeTemplate)DSL.list((TypeTemplate)avw.n.in($$0)))))));
        $$0.registerType(true, avw.l, () -> DSL.taggedChoiceLazy((String)"id", axt.a(), (Map)$$2));
        $$0.registerType(true, avw.p, () -> DSL.optionalFields((String)"Passengers", (TypeTemplate)DSL.list((TypeTemplate)avw.p.in($$0)), (TypeTemplate)avw.q.in($$0)));
        $$0.registerType(true, avw.q, () -> DSL.taggedChoiceLazy((String)"id", axt.a(), (Map)$$1));
        $$0.registerType(true, avw.m, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)avw.s.in($$0), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)avw.p.in($$0), (String)"BlockEntityTag", (TypeTemplate)avw.l.in($$0), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)))), (Hook.HookFunction)azv.b, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        $$0.registerType(false, avw.d, () -> DSL.compoundList((TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        $$0.registerType(false, avw.e, DSL::remainder);
        $$0.registerType(false, avw.f, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)avw.p.in($$0))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)avw.l.in($$0))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)avw.n.in($$0))));
        $$0.registerType(false, avw.r, () -> DSL.constType(axt.a()));
        $$0.registerType(false, avw.s, () -> DSL.constType(axt.a()));
        $$0.registerType(false, avw.n, DSL::remainder);
        Supplier<TypeTemplate> $$3 = () -> DSL.compoundList((TypeTemplate)avw.s.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType()));
        $$0.registerType(false, avw.g, () -> DSL.optionalFields((String)"stats", (TypeTemplate)DSL.optionalFields((String)"minecraft:mined", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.r.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:crafted", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:used", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:broken", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:picked_up", (TypeTemplate)((TypeTemplate)$$3.get()), (TypeTemplate)DSL.optionalFields((String)"minecraft:dropped", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:killed", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.o.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:killed_by", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.o.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:custom", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.constType(axt.a()), (TypeTemplate)DSL.constType((Type)DSL.intType()))))));
        $$0.registerType(false, avw.h, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Features", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.v.in($$0)), (String)"Objectives", (TypeTemplate)DSL.list((TypeTemplate)avw.w.in($$0)), (String)"Teams", (TypeTemplate)DSL.list((TypeTemplate)avw.x.in($$0)))));
        $$0.registerType(false, avw.v, DSL::remainder);
        Map<String, Supplier<TypeTemplate>> $$4 = axs.a($$0);
        $$0.registerType(false, avw.w, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"CriteriaType", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)$$4)), (Hook.HookFunction)axs.c, (Hook.HookFunction)axs.d));
        $$0.registerType(false, avw.x, DSL::remainder);
        $$0.registerType(true, avw.u, () -> DSL.optionalFields((String)"SpawnPotentials", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"Entity", (TypeTemplate)avw.p.in($$0))), (String)"SpawnData", (TypeTemplate)avw.p.in($$0)));
        $$0.registerType(false, avw.i, () -> DSL.optionalFields((String)"minecraft:adventure/adventuring_time", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.z.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_a_mob", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.o.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_all_mobs", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.o.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:husbandry/bred_all_animals", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.o.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string())))));
        $$0.registerType(false, avw.z, () -> DSL.constType(axt.a()));
        $$0.registerType(false, avw.o, () -> DSL.constType(axt.a()));
        $$0.registerType(false, avw.j, DSL::remainder);
        $$0.registerType(false, avw.B, DSL::remainder);
        $$0.registerType(false, avw.k, () -> DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)avw.p.in($$0))));
    }
}

