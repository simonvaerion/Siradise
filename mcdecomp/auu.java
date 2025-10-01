/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Map;
import java.util.Optional;

public class auu
extends DataFix {
    public auu(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.h);
        OpticFinder $$12 = $$0.findField("data");
        return this.fixTypeEverywhereTyped("Map id fix", $$0, $$1 -> {
            Optional $$2 = $$1.getOptionalTyped($$12);
            if ($$2.isPresent()) {
                return $$1;
            }
            return $$1.update(DSL.remainderFinder(), $$0 -> $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("data"), (Object)$$0)));
        });
    }
}

