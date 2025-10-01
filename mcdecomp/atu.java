/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class atu
extends DataFix {
    public atu(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.c);
        OpticFinder $$12 = $$0.findField("Level");
        return this.fixTypeEverywhereTyped("HeightmapRenamingFix", $$0, $$1 -> $$1.updateTyped($$12, $$0 -> $$0.update(DSL.remainderFinder(), this::a)));
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        Optional $$6;
        Optional $$5;
        Optional $$4;
        Optional $$1 = $$0.get("Heightmaps").result();
        if (!$$1.isPresent()) {
            return $$0;
        }
        Dynamic $$2 = (Dynamic)$$1.get();
        Optional $$3 = $$2.get("LIQUID").result();
        if ($$3.isPresent()) {
            $$2 = $$2.remove("LIQUID");
            $$2 = $$2.set("WORLD_SURFACE_WG", (Dynamic)$$3.get());
        }
        if (($$4 = $$2.get("SOLID").result()).isPresent()) {
            $$2 = $$2.remove("SOLID");
            $$2 = $$2.set("OCEAN_FLOOR_WG", (Dynamic)$$4.get());
            $$2 = $$2.set("OCEAN_FLOOR", (Dynamic)$$4.get());
        }
        if (($$5 = $$2.get("LIGHT").result()).isPresent()) {
            $$2 = $$2.remove("LIGHT");
            $$2 = $$2.set("LIGHT_BLOCKING", (Dynamic)$$5.get());
        }
        if (($$6 = $$2.get("RAIN").result()).isPresent()) {
            $$2 = $$2.remove("RAIN");
            $$2 = $$2.set("MOTION_BLOCKING", (Dynamic)$$6.get());
            $$2 = $$2.set("MOTION_BLOCKING_NO_LEAVES", (Dynamic)$$6.get());
        }
        return $$0.set("Heightmaps", $$2);
    }
}

