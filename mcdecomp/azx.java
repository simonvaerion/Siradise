/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class azx
extends Schema {
    private static final Logger b = LogUtils.getLogger();
    static final Map<String, String> c = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        $$0.put("minecraft:furnace", "Furnace");
        $$0.put("minecraft:lit_furnace", "Furnace");
        $$0.put("minecraft:chest", "Chest");
        $$0.put("minecraft:trapped_chest", "Chest");
        $$0.put("minecraft:ender_chest", "EnderChest");
        $$0.put("minecraft:jukebox", "RecordPlayer");
        $$0.put("minecraft:dispenser", "Trap");
        $$0.put("minecraft:dropper", "Dropper");
        $$0.put("minecraft:sign", "Sign");
        $$0.put("minecraft:mob_spawner", "MobSpawner");
        $$0.put("minecraft:noteblock", "Music");
        $$0.put("minecraft:brewing_stand", "Cauldron");
        $$0.put("minecraft:enhanting_table", "EnchantTable");
        $$0.put("minecraft:command_block", "CommandBlock");
        $$0.put("minecraft:beacon", "Beacon");
        $$0.put("minecraft:skull", "Skull");
        $$0.put("minecraft:daylight_detector", "DLDetector");
        $$0.put("minecraft:hopper", "Hopper");
        $$0.put("minecraft:banner", "Banner");
        $$0.put("minecraft:flower_pot", "FlowerPot");
        $$0.put("minecraft:repeating_command_block", "CommandBlock");
        $$0.put("minecraft:chain_command_block", "CommandBlock");
        $$0.put("minecraft:standing_sign", "Sign");
        $$0.put("minecraft:wall_sign", "Sign");
        $$0.put("minecraft:piston_head", "Piston");
        $$0.put("minecraft:daylight_detector_inverted", "DLDetector");
        $$0.put("minecraft:unpowered_comparator", "Comparator");
        $$0.put("minecraft:powered_comparator", "Comparator");
        $$0.put("minecraft:wall_banner", "Banner");
        $$0.put("minecraft:standing_banner", "Banner");
        $$0.put("minecraft:structure_block", "Structure");
        $$0.put("minecraft:end_portal", "Airportal");
        $$0.put("minecraft:end_gateway", "EndGateway");
        $$0.put("minecraft:shield", "Banner");
    });
    protected static final Hook.HookFunction a = new Hook.HookFunction(){

        public <T> T apply(DynamicOps<T> $$0, T $$1) {
            return azx.a(new Dynamic($$0, $$1), c, "ArmorStand");
        }
    };

    public azx(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static TypeTemplate a(Schema $$0) {
        return DSL.optionalFields((String)"Equipment", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)));
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> azx.a($$0));
    }

    protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0)));
    }

    protected static void c(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0)));
    }

    protected static void d(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.register((Map)$$12, "Item", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)avw.m.in($$0)));
        $$0.registerSimple((Map)$$12, "XPOrb");
        azx.b($$0, $$12, "ThrownEgg");
        $$0.registerSimple((Map)$$12, "LeashKnot");
        $$0.registerSimple((Map)$$12, "Painting");
        $$0.register((Map)$$12, "Arrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0)));
        $$0.register((Map)$$12, "TippedArrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0)));
        $$0.register((Map)$$12, "SpectralArrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0)));
        azx.b($$0, $$12, "Snowball");
        azx.b($$0, $$12, "Fireball");
        azx.b($$0, $$12, "SmallFireball");
        azx.b($$0, $$12, "ThrownEnderpearl");
        $$0.registerSimple((Map)$$12, "EyeOfEnderSignal");
        $$0.register((Map)$$12, "ThrownPotion", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0), (String)"Potion", (TypeTemplate)avw.m.in($$0)));
        azx.b($$0, $$12, "ThrownExpBottle");
        $$0.register((Map)$$12, "ItemFrame", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)avw.m.in($$0)));
        azx.b($$0, $$12, "WitherSkull");
        $$0.registerSimple((Map)$$12, "PrimedTnt");
        $$0.register((Map)$$12, "FallingSand", $$1 -> DSL.optionalFields((String)"Block", (TypeTemplate)avw.r.in($$0), (String)"TileEntityData", (TypeTemplate)avw.l.in($$0)));
        $$0.register((Map)$$12, "FireworksRocketEntity", $$1 -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)avw.m.in($$0)));
        $$0.registerSimple((Map)$$12, "Boat");
        $$0.register((Map)$$12, "Minecart", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        azx.c($$0, $$12, "MinecartRideable");
        $$0.register((Map)$$12, "MinecartChest", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        azx.c($$0, $$12, "MinecartFurnace");
        azx.c($$0, $$12, "MinecartTNT");
        $$0.register((Map)$$12, "MinecartSpawner", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0), (TypeTemplate)avw.u.in($$0)));
        $$0.register((Map)$$12, "MinecartHopper", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        azx.c($$0, $$12, "MinecartCommandBlock");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "ArmorStand");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Creeper");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Skeleton");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Spider");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Giant");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Zombie");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Slime");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Ghast");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "PigZombie");
        $$0.register((Map)$$12, "Enderman", $$1 -> DSL.optionalFields((String)"carried", (TypeTemplate)avw.r.in($$0), (TypeTemplate)azx.a($$0)));
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "CaveSpider");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Silverfish");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Blaze");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "LavaSlime");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "EnderDragon");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "WitherBoss");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Bat");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Witch");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Endermite");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Guardian");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Pig");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Sheep");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Cow");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Chicken");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Squid");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Wolf");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "MushroomCow");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "SnowMan");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Ozelot");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "VillagerGolem");
        $$0.register((Map)$$12, "EntityHorse", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"ArmorItem", (TypeTemplate)avw.m.in($$0), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)azx.a($$0)));
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Rabbit");
        $$0.register((Map)$$12, "Villager", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)avw.m.in($$0), (String)"buyB", (TypeTemplate)avw.m.in($$0), (String)"sell", (TypeTemplate)avw.m.in($$0)))), (TypeTemplate)azx.a($$0)));
        $$0.registerSimple((Map)$$12, "EnderCrystal");
        $$0.registerSimple((Map)$$12, "AreaEffectCloud");
        $$0.registerSimple((Map)$$12, "ShulkerBullet");
        azx.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Shulker");
        return $$12;
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        azx.d($$0, $$12, "Furnace");
        azx.d($$0, $$12, "Chest");
        $$0.registerSimple((Map)$$12, "EnderChest");
        $$0.register((Map)$$12, "RecordPlayer", $$1 -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)avw.m.in($$0)));
        azx.d($$0, $$12, "Trap");
        azx.d($$0, $$12, "Dropper");
        $$0.registerSimple((Map)$$12, "Sign");
        $$0.register((Map)$$12, "MobSpawner", $$1 -> avw.u.in($$0));
        $$0.registerSimple((Map)$$12, "Music");
        $$0.registerSimple((Map)$$12, "Piston");
        azx.d($$0, $$12, "Cauldron");
        $$0.registerSimple((Map)$$12, "EnchantTable");
        $$0.registerSimple((Map)$$12, "Airportal");
        $$0.registerSimple((Map)$$12, "Control");
        $$0.registerSimple((Map)$$12, "Beacon");
        $$0.registerSimple((Map)$$12, "Skull");
        $$0.registerSimple((Map)$$12, "DLDetector");
        azx.d($$0, $$12, "Hopper");
        $$0.registerSimple((Map)$$12, "Comparator");
        $$0.register((Map)$$12, "FlowerPot", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)avw.s.in($$0))));
        $$0.registerSimple((Map)$$12, "Banner");
        $$0.registerSimple((Map)$$12, "Structure");
        $$0.registerSimple((Map)$$12, "EndGateway");
        return $$12;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        $$0.registerType(false, avw.a, DSL::remainder);
        $$0.registerType(false, avw.b, () -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        $$0.registerType(false, avw.c, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)avw.p.in($$0)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)avw.l.in($$0), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)avw.r.in($$0))))));
        $$0.registerType(true, avw.l, () -> DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)$$2));
        $$0.registerType(true, avw.p, () -> DSL.optionalFields((String)"Riding", (TypeTemplate)avw.p.in($$0), (TypeTemplate)avw.q.in($$0)));
        $$0.registerType(false, avw.o, () -> DSL.constType(axd.a()));
        $$0.registerType(true, avw.q, () -> DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)$$1));
        $$0.registerType(true, avw.m, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)avw.s.in($$0)), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)avw.p.in($$0), (String)"BlockEntityTag", (TypeTemplate)avw.l.in($$0), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)))), (Hook.HookFunction)a, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        $$0.registerType(false, avw.e, DSL::remainder);
        $$0.registerType(false, avw.r, () -> DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)DSL.constType(axd.a())));
        $$0.registerType(false, avw.s, () -> DSL.constType(axd.a()));
        $$0.registerType(false, avw.g, DSL::remainder);
        $$0.registerType(false, avw.h, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Features", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.v.in($$0)), (String)"Objectives", (TypeTemplate)DSL.list((TypeTemplate)avw.w.in($$0)), (String)"Teams", (TypeTemplate)DSL.list((TypeTemplate)avw.x.in($$0)))));
        $$0.registerType(false, avw.v, DSL::remainder);
        $$0.registerType(false, avw.w, DSL::remainder);
        $$0.registerType(false, avw.x, DSL::remainder);
        $$0.registerType(true, avw.u, DSL::remainder);
        $$0.registerType(false, avw.j, DSL::remainder);
        $$0.registerType(false, avw.B, DSL::remainder);
        $$0.registerType(false, avw.k, () -> DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)avw.p.in($$0))));
    }

    protected static <T> T a(Dynamic<T> $$0, Map<String, String> $$1, String $$2) {
        return (T)$$0.update("tag", $$3 -> $$3.update("BlockEntityTag", $$2 -> {
            Object $$3 = $$0.get("id").asString().result().map(axd::a).orElse("minecraft:air");
            if (!"minecraft:air".equals($$3)) {
                String $$4 = (String)$$1.get($$3);
                if ($$4 == null) {
                    b.warn("Unable to resolve BlockEntity for ItemStack: {}", $$3);
                } else {
                    return $$2.set("id", $$0.createString($$4));
                }
            }
            return $$2;
        }).update("EntityTag", $$2 -> {
            Object $$3 = $$0.get("id").asString("");
            if ("minecraft:armor_stand".equals(axd.a($$3))) {
                return $$2.set("id", $$0.createString($$2));
            }
            return $$2;
        })).getValue();
    }
}

