/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class axe
extends Schema {
    public axe(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static TypeTemplate a(Schema $$0) {
        return DSL.optionalFields((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)));
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> axe.a($$0));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$12 = super.registerEntities($$0);
        axe.a($$0, $$12, "ArmorStand");
        axe.a($$0, $$12, "Creeper");
        axe.a($$0, $$12, "Skeleton");
        axe.a($$0, $$12, "Spider");
        axe.a($$0, $$12, "Giant");
        axe.a($$0, $$12, "Zombie");
        axe.a($$0, $$12, "Slime");
        axe.a($$0, $$12, "Ghast");
        axe.a($$0, $$12, "PigZombie");
        $$0.register($$12, "Enderman", $$1 -> DSL.optionalFields((String)"carried", (TypeTemplate)avw.r.in($$0), (TypeTemplate)axe.a($$0)));
        axe.a($$0, $$12, "CaveSpider");
        axe.a($$0, $$12, "Silverfish");
        axe.a($$0, $$12, "Blaze");
        axe.a($$0, $$12, "LavaSlime");
        axe.a($$0, $$12, "EnderDragon");
        axe.a($$0, $$12, "WitherBoss");
        axe.a($$0, $$12, "Bat");
        axe.a($$0, $$12, "Witch");
        axe.a($$0, $$12, "Endermite");
        axe.a($$0, $$12, "Guardian");
        axe.a($$0, $$12, "Pig");
        axe.a($$0, $$12, "Sheep");
        axe.a($$0, $$12, "Cow");
        axe.a($$0, $$12, "Chicken");
        axe.a($$0, $$12, "Squid");
        axe.a($$0, $$12, "Wolf");
        axe.a($$0, $$12, "MushroomCow");
        axe.a($$0, $$12, "SnowMan");
        axe.a($$0, $$12, "Ozelot");
        axe.a($$0, $$12, "VillagerGolem");
        $$0.register($$12, "EntityHorse", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"ArmorItem", (TypeTemplate)avw.m.in($$0), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        axe.a($$0, $$12, "Rabbit");
        $$0.register($$12, "Villager", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)avw.m.in($$0), (String)"buyB", (TypeTemplate)avw.m.in($$0), (String)"sell", (TypeTemplate)avw.m.in($$0)))), (TypeTemplate)axe.a($$0)));
        axe.a($$0, $$12, "Shulker");
        $$0.registerSimple($$12, "AreaEffectCloud");
        $$0.registerSimple($$12, "ShulkerBullet");
        return $$12;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(false, avw.f, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)avw.p.in($$0))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)avw.l.in($$0))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)avw.n.in($$0))));
        $$0.registerType(false, avw.n, DSL::remainder);
    }
}

