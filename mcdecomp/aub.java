/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class aub
extends DataFix {
    private final Set<String> a;

    public aub(Schema $$0, boolean $$1, Set<String> $$2) {
        super($$0, $$1);
        this.a = $$2;
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.m);
        OpticFinder $$1 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)avw.s.typeName(), axd.a()));
        OpticFinder $$2 = $$0.findField("tag");
        OpticFinder $$32 = $$2.type().findField("BlockEntityTag");
        return this.fixTypeEverywhereTyped("ItemRemoveBlockEntityTagFix", $$0, $$3 -> {
            Typed $$6;
            Optional $$7;
            Optional $$5;
            Optional $$4 = $$3.getOptional($$1);
            if ($$4.isPresent() && this.a.contains(((Pair)$$4.get()).getSecond()) && ($$5 = $$3.getOptionalTyped($$2)).isPresent() && ($$7 = ($$6 = (Typed)$$5.get()).getOptionalTyped($$32)).isPresent()) {
                Optional $$8 = $$6.write().result();
                Dynamic $$9 = $$8.isPresent() ? (Dynamic)$$8.get() : (Dynamic)$$6.get(DSL.remainderFinder());
                Dynamic $$10 = $$9.remove("BlockEntityTag");
                Optional $$11 = $$2.type().readTyped($$10).result();
                if ($$11.isEmpty()) {
                    return $$3;
                }
                return $$3.set($$2, (Typed)((Pair)$$11.get()).getFirst());
            }
            return $$3;
        });
    }
}

