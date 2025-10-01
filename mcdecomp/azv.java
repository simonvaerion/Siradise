/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class azv
extends axd {
    protected static final Hook.HookFunction b = new Hook.HookFunction(){

        public <T> T apply(DynamicOps<T> $$0, T $$1) {
            return azx.a(new Dynamic($$0, $$1), azu.a, "minecraft:armor_stand");
        }
    };

    public azv(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> axe.a($$0));
    }

    protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0)));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.registerSimple((Map)$$12, "minecraft:area_effect_cloud");
        azv.a($$0, $$12, "minecraft:armor_stand");
        $$0.register((Map)$$12, "minecraft:arrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0)));
        azv.a($$0, $$12, "minecraft:bat");
        azv.a($$0, $$12, "minecraft:blaze");
        $$0.registerSimple((Map)$$12, "minecraft:boat");
        azv.a($$0, $$12, "minecraft:cave_spider");
        $$0.register((Map)$$12, "minecraft:chest_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        azv.a($$0, $$12, "minecraft:chicken");
        $$0.register((Map)$$12, "minecraft:commandblock_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0)));
        azv.a($$0, $$12, "minecraft:cow");
        azv.a($$0, $$12, "minecraft:creeper");
        $$0.register((Map)$$12, "minecraft:donkey", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:dragon_fireball");
        azv.b($$0, $$12, "minecraft:egg");
        azv.a($$0, $$12, "minecraft:elder_guardian");
        $$0.registerSimple((Map)$$12, "minecraft:ender_crystal");
        azv.a($$0, $$12, "minecraft:ender_dragon");
        $$0.register((Map)$$12, "minecraft:enderman", $$1 -> DSL.optionalFields((String)"carried", (TypeTemplate)avw.r.in($$0), (TypeTemplate)axe.a($$0)));
        azv.a($$0, $$12, "minecraft:endermite");
        azv.b($$0, $$12, "minecraft:ender_pearl");
        $$0.registerSimple((Map)$$12, "minecraft:eye_of_ender_signal");
        $$0.register((Map)$$12, "minecraft:falling_block", $$1 -> DSL.optionalFields((String)"Block", (TypeTemplate)avw.r.in($$0), (String)"TileEntityData", (TypeTemplate)avw.l.in($$0)));
        azv.b($$0, $$12, "minecraft:fireball");
        $$0.register((Map)$$12, "minecraft:fireworks_rocket", $$1 -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)avw.m.in($$0)));
        $$0.register((Map)$$12, "minecraft:furnace_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0)));
        azv.a($$0, $$12, "minecraft:ghast");
        azv.a($$0, $$12, "minecraft:giant");
        azv.a($$0, $$12, "minecraft:guardian");
        $$0.register((Map)$$12, "minecraft:hopper_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
        $$0.register((Map)$$12, "minecraft:horse", $$1 -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)avw.m.in($$0), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        azv.a($$0, $$12, "minecraft:husk");
        $$0.register((Map)$$12, "minecraft:item", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)avw.m.in($$0)));
        $$0.register((Map)$$12, "minecraft:item_frame", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)avw.m.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:leash_knot");
        azv.a($$0, $$12, "minecraft:magma_cube");
        $$0.register((Map)$$12, "minecraft:minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0)));
        azv.a($$0, $$12, "minecraft:mooshroom");
        $$0.register((Map)$$12, "minecraft:mule", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        azv.a($$0, $$12, "minecraft:ocelot");
        $$0.registerSimple((Map)$$12, "minecraft:painting");
        $$0.registerSimple((Map)$$12, "minecraft:parrot");
        azv.a($$0, $$12, "minecraft:pig");
        azv.a($$0, $$12, "minecraft:polar_bear");
        $$0.register((Map)$$12, "minecraft:potion", $$1 -> DSL.optionalFields((String)"Potion", (TypeTemplate)avw.m.in($$0), (String)"inTile", (TypeTemplate)avw.r.in($$0)));
        azv.a($$0, $$12, "minecraft:rabbit");
        azv.a($$0, $$12, "minecraft:sheep");
        azv.a($$0, $$12, "minecraft:shulker");
        $$0.registerSimple((Map)$$12, "minecraft:shulker_bullet");
        azv.a($$0, $$12, "minecraft:silverfish");
        azv.a($$0, $$12, "minecraft:skeleton");
        $$0.register((Map)$$12, "minecraft:skeleton_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        azv.a($$0, $$12, "minecraft:slime");
        azv.b($$0, $$12, "minecraft:small_fireball");
        azv.b($$0, $$12, "minecraft:snowball");
        azv.a($$0, $$12, "minecraft:snowman");
        $$0.register((Map)$$12, "minecraft:spawner_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0), (TypeTemplate)avw.u.in($$0)));
        $$0.register((Map)$$12, "minecraft:spectral_arrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)avw.r.in($$0)));
        azv.a($$0, $$12, "minecraft:spider");
        azv.a($$0, $$12, "minecraft:squid");
        azv.a($$0, $$12, "minecraft:stray");
        $$0.registerSimple((Map)$$12, "minecraft:tnt");
        $$0.register((Map)$$12, "minecraft:tnt_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)avw.r.in($$0)));
        $$0.register((Map)$$12, "minecraft:villager", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)avw.m.in($$0), (String)"buyB", (TypeTemplate)avw.m.in($$0), (String)"sell", (TypeTemplate)avw.m.in($$0)))), (TypeTemplate)axe.a($$0)));
        azv.a($$0, $$12, "minecraft:villager_golem");
        azv.a($$0, $$12, "minecraft:witch");
        azv.a($$0, $$12, "minecraft:wither");
        azv.a($$0, $$12, "minecraft:wither_skeleton");
        azv.b($$0, $$12, "minecraft:wither_skull");
        azv.a($$0, $$12, "minecraft:wolf");
        azv.b($$0, $$12, "minecraft:xp_bottle");
        $$0.registerSimple((Map)$$12, "minecraft:xp_orb");
        azv.a($$0, $$12, "minecraft:zombie");
        $$0.register((Map)$$12, "minecraft:zombie_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        azv.a($$0, $$12, "minecraft:zombie_pigman");
        azv.a($$0, $$12, "minecraft:zombie_villager");
        $$0.registerSimple((Map)$$12, "minecraft:evocation_fangs");
        azv.a($$0, $$12, "minecraft:evocation_illager");
        $$0.registerSimple((Map)$$12, "minecraft:illusion_illager");
        $$0.register((Map)$$12, "minecraft:llama", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (String)"DecorItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:llama_spit");
        azv.a($$0, $$12, "minecraft:vex");
        azv.a($$0, $$12, "minecraft:vindication_illager");
        return $$12;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, avw.q, () -> DSL.taggedChoiceLazy((String)"id", azv.a(), (Map)$$1));
        $$0.registerType(true, avw.m, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)avw.s.in($$0), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)avw.p.in($$0), (String)"BlockEntityTag", (TypeTemplate)avw.l.in($$0), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)))), (Hook.HookFunction)b, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
    }
}

