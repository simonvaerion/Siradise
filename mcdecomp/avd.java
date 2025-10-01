/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Optional;

public class avd
extends DataFix {
    public avd(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    private static String a(String $$0) {
        return $$0.equals("health") ? "hearts" : "integer";
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.w);
        return this.fixTypeEverywhereTyped("ObjectiveRenderTypeFix", $$0, $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            Optional $$1 = $$0.get("RenderType").asString().result();
            if ($$1.isEmpty()) {
                String $$2 = $$0.get("CriteriaName").asString("");
                String $$3 = avd.a($$2);
                return $$0.set("RenderType", $$0.createString($$3));
            }
            return $$0;
        }));
    }
}

