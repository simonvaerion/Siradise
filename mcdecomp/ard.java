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
import java.util.Objects;

public class ard
extends DataFix {
    public ard(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.r);
        Type $$1 = this.getOutputSchema().getType(avw.r);
        Type $$2 = DSL.named((String)avw.r.typeName(), (Type)DSL.or((Type)DSL.intType(), axd.a()));
        Type $$3 = DSL.named((String)avw.r.typeName(), axd.a());
        if (!Objects.equals($$0, $$2) || !Objects.equals($$1, $$3)) {
            throw new IllegalStateException("Expected and actual types don't match.");
        }
        return this.fixTypeEverywhere("BlockNameFlatteningFix", $$2, $$3, $$02 -> $$0 -> $$0.mapSecond($$02 -> (String)$$02.map(arg::a, $$0 -> arg.a(axd.a($$0)))));
    }
}

