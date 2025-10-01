/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public class aut
extends aqh {
    private static final Logger b = LogUtils.getLogger();

    public aut(Schema $$0) {
        super($$0, avw.a);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelUUIDFix", this.getInputSchema().getType(this.a), $$0 -> $$0.updateTyped(DSL.remainderFinder(), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            $$0 = this.d((Dynamic<?>)$$0);
            $$0 = this.c((Dynamic<?>)$$0);
            $$0 = this.b((Dynamic<?>)$$0);
            return $$0;
        })));
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return aut.a($$0, "WanderingTraderId", "WanderingTraderId").orElse($$0);
    }

    private Dynamic<?> c(Dynamic<?> $$0) {
        return $$0.update("DimensionData", $$02 -> $$02.updateMapValues($$0 -> $$0.mapSecond($$02 -> $$02.update("DragonFight", $$0 -> aut.c($$0, "DragonUUID", "Dragon").orElse((Dynamic<?>)$$0)))));
    }

    private Dynamic<?> d(Dynamic<?> $$02) {
        return $$02.update("CustomBossEvents", $$0 -> $$0.updateMapValues($$02 -> $$02.mapSecond($$0 -> $$0.update("Players", $$1 -> $$0.createList($$1.asStream().map($$0 -> aut.a($$0).orElseGet(() -> {
            b.warn("CustomBossEvents contains invalid UUIDs.");
            return $$0;
        })))))));
    }
}

