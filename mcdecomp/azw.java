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

public class azw
extends axd {
    public azw(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        Map $$1 = super.registerBlockEntities($$0);
        azw.a($$0, $$1, "minecraft:shulker_box");
        return $$1;
    }
}

