/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class auo
extends DataFix {
    private static final Map<String, String> a = ImmutableMap.builder().put((Object)"down", (Object)"down_south").put((Object)"up", (Object)"up_north").put((Object)"north", (Object)"north_up").put((Object)"south", (Object)"south_up").put((Object)"west", (Object)"west_up").put((Object)"east", (Object)"east_up").build();

    public auo(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    private static Dynamic<?> a(Dynamic<?> $$02) {
        Optional $$1 = $$02.get("Name").asString().result();
        if ($$1.equals(Optional.of("minecraft:jigsaw"))) {
            return $$02.update("Properties", $$0 -> {
                String $$1 = $$0.get("facing").asString("north");
                return $$0.remove("facing").set("orientation", $$0.createString(a.getOrDefault($$1, $$1)));
            });
        }
        return $$02;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("jigsaw_rotation_fix", this.getInputSchema().getType(avw.n), $$0 -> $$0.update(DSL.remainderFinder(), auo::a));
    }
}

