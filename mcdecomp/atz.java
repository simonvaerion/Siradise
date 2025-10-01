/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;

public class atz
extends DataFix {
    public atz(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.m);
        OpticFinder $$12 = $$0.findField("tag");
        return this.fixTypeEverywhereTyped("Item Lore componentize", $$0, $$1 -> $$1.updateTyped($$12, $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.update("display", $$02 -> $$02.update("Lore", $$0 -> (Dynamic)DataFixUtils.orElse((Optional)$$0.asStreamOpt().map(atz::a).map(arg_0 -> ((Dynamic)$$0).createList(arg_0)).result(), (Object)$$0))))));
    }

    private static <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> $$02) {
        return $$02.map($$0 -> (Dynamic)DataFixUtils.orElse((Optional)$$0.asString().map(atz::a).map(arg_0 -> ((Dynamic)$$0).createString(arg_0)).result(), (Object)$$0));
    }

    private static String a(String $$0) {
        return sw.a.a(sw.b($$0));
    }
}

