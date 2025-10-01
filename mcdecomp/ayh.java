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

public class ayh
extends axd {
    public ayh(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$12 = super.registerEntities($$0);
        $$0.register($$12, "minecraft:wandering_trader", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)avw.m.in($$0), (String)"buyB", (TypeTemplate)avw.m.in($$0), (String)"sell", (TypeTemplate)avw.m.in($$0)))), (TypeTemplate)axe.a($$0)));
        $$0.register($$12, "minecraft:trader_llama", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"SaddleItem", (TypeTemplate)avw.m.in($$0), (String)"DecorItem", (TypeTemplate)avw.m.in($$0), (TypeTemplate)axe.a($$0)));
        return $$12;
    }
}

