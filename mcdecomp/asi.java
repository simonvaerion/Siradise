/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class asi
extends DataFix {
    public asi(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        OpticFinder $$0 = DSL.fieldFinder((String)"id", axd.a());
        return this.fixTypeEverywhereTyped("EntityCustomNameToComponentFix", this.getInputSchema().getType(avw.q), $$1 -> $$1.update(DSL.remainderFinder(), $$2 -> {
            Optional $$3 = $$1.getOptional($$0);
            if ($$3.isPresent() && Objects.equals($$3.get(), "minecraft:commandblock_minecart")) {
                return $$2;
            }
            return asi.a($$2);
        }));
    }

    public static Dynamic<?> a(Dynamic<?> $$0) {
        String $$1 = $$0.get("CustomName").asString("");
        if ($$1.isEmpty()) {
            return $$0.remove("CustomName");
        }
        return $$0.set("CustomName", $$0.createString(sw.a.a(sw.b($$1))));
    }
}

