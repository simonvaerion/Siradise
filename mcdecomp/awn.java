/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class awn
extends DataFix {
    public awn(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$02 = DSL.named((String)avw.x.typeName(), (Type)DSL.remainderType());
        if (!Objects.equals($$02, this.getInputSchema().getType(avw.x))) {
            throw new IllegalStateException("Team type is not what was expected.");
        }
        return this.fixTypeEverywhere("TeamDisplayNameFix", $$02, $$0 -> $$02 -> $$02.mapSecond($$0 -> $$0.update("DisplayName", $$1 -> (Dynamic)DataFixUtils.orElse((Optional)$$1.asString().map($$0 -> sw.a.a(sw.b($$0))).map(arg_0 -> ((Dynamic)$$0).createString(arg_0)).result(), (Object)$$1))));
    }
}

