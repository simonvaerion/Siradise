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

public class axv
extends axd {
    public axv(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> axe.a($$0));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        Map $$12 = super.registerEntities($$0);
        axv.a($$0, $$12, "minecraft:turtle");
        axv.a($$0, $$12, "minecraft:cod_mob");
        axv.a($$0, $$12, "minecraft:tropical_fish");
        axv.a($$0, $$12, "minecraft:salmon_mob");
        axv.a($$0, $$12, "minecraft:puffer_fish");
        axv.a($$0, $$12, "minecraft:phantom");
        axv.a($$0, $$12, "minecraft:dolphin");
        axv.a($$0, $$12, "minecraft:drowned");
        $$0.register($$12, "minecraft:trident", $$1 -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)avw.n.in($$0)));
        return $$12;
    }
}

