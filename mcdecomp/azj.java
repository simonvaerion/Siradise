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

public class azj
extends axd {
    public azj(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$12 = super.registerEntities($$0);
        $$0.register($$12, "minecraft:item_display", $$1 -> DSL.optionalFields((String)"item", (TypeTemplate)avw.m.in($$0)));
        $$0.register($$12, "minecraft:block_display", $$1 -> DSL.optionalFields((String)"block_state", (TypeTemplate)avw.n.in($$0)));
        $$0.registerSimple($$12, "minecraft:text_display");
        return $$12;
    }
}

