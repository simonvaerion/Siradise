/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public class awt
extends auz {
    public awt(Schema $$0, boolean $$1) {
        super($$0, $$1, "Villager trade fix", avw.q, "minecraft:villager");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        OpticFinder $$12 = $$0.getType().findField("Offers");
        OpticFinder $$2 = $$12.type().findField("Recipes");
        Type $$3 = $$2.type();
        if (!($$3 instanceof List.ListType)) {
            throw new IllegalStateException("Recipes are expected to be a list.");
        }
        List.ListType $$4 = (List.ListType)$$3;
        Type $$5 = $$4.getElement();
        OpticFinder $$62 = DSL.typeFinder((Type)$$5);
        OpticFinder $$7 = $$5.findField("buy");
        OpticFinder $$8 = $$5.findField("buyB");
        OpticFinder $$9 = $$5.findField("sell");
        OpticFinder $$10 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)avw.s.typeName(), axd.a()));
        Function<Typed, Typed> $$11 = $$1 -> this.a((OpticFinder<Pair<String, String>>)$$10, (Typed<?>)$$1);
        return $$0.updateTyped($$12, $$6 -> $$6.updateTyped($$2, $$5 -> $$5.updateTyped($$62, $$4 -> $$4.updateTyped($$7, $$11).updateTyped($$8, $$11).updateTyped($$9, $$11))));
    }

    private Typed<?> a(OpticFinder<Pair<String, String>> $$0, Typed<?> $$1) {
        return $$1.update($$0, $$02 -> $$02.mapSecond($$0 -> Objects.equals($$0, "minecraft:carved_pumpkin") ? "minecraft:pumpkin" : $$0));
    }
}

