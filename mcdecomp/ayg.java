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

public class ayg
extends axd {
    public ayg(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static TypeTemplate a(Schema $$0) {
        return DSL.optionalFields((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)), (String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)));
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> ayg.a($$0));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$1 = super.registerEntities($$0);
        $$1.remove("minecraft:illager_beast");
        ayg.a($$0, $$1, "minecraft:ravager");
        return $$1;
    }
}

