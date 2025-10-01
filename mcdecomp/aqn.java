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
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class aqn
extends DataFix {
    public aqn(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        OpticFinder $$0 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)avw.s.typeName(), axd.a()));
        return this.fixTypeEverywhereTyped("BedItemColorFix", this.getInputSchema().getType(avw.m), $$1 -> {
            Dynamic $$3;
            Optional $$2 = $$1.getOptional($$0);
            if ($$2.isPresent() && Objects.equals(((Pair)$$2.get()).getSecond(), "minecraft:bed") && ($$3 = (Dynamic)$$1.get(DSL.remainderFinder())).get("Damage").asInt(0) == 0) {
                return $$1.set(DSL.remainderFinder(), (Object)$$3.set("Damage", $$3.createShort((short)14)));
            }
            return $$1;
        });
    }
}

