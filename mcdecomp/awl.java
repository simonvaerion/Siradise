/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class awl
extends DataFix {
    public awl(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.B);
        OpticFinder $$1 = $$0.findField("dimensions");
        return this.fixTypeEverywhereTyped("StructureSettingsFlatten", $$0, $$12 -> $$12.updateTyped($$1, $$1 -> {
            Dynamic $$2 = (Dynamic)$$1.write().result().orElseThrow();
            Dynamic $$3 = $$2.updateMapValues(awl::a);
            return (Typed)((Pair)$$1.type().readTyped($$3).result().orElseThrow()).getFirst();
        }));
    }

    private static Pair<Dynamic<?>, Dynamic<?>> a(Pair<Dynamic<?>, Dynamic<?>> $$0) {
        Dynamic $$1 = (Dynamic)$$0.getSecond();
        return Pair.of((Object)((Dynamic)$$0.getFirst()), (Object)$$1.update("generator", $$02 -> $$02.update("settings", $$0 -> $$0.update("structures", awl::a))));
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        Dynamic $$1 = $$0.get("structures").orElseEmptyMap().updateMapValues($$12 -> $$12.mapSecond($$1 -> $$1.set("type", $$0.createString("minecraft:random_spread"))));
        return (Dynamic)DataFixUtils.orElse($$0.get("stronghold").result().map($$2 -> $$1.set("minecraft:stronghold", $$2.set("type", $$0.createString("minecraft:concentric_rings")))), (Object)$$1);
    }
}

