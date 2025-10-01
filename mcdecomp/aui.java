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
import java.util.Optional;
import java.util.function.Predicate;

public abstract class aui
extends DataFix {
    private final String a;
    private final Predicate<String> b;

    public aui(Schema $$0, String $$1, Predicate<String> $$2) {
        super($$0, false);
        this.a = $$1;
        this.b = $$2;
    }

    public final TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.m);
        OpticFinder $$1 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)avw.s.typeName(), axd.a()));
        OpticFinder $$22 = $$0.findField("tag");
        return this.fixTypeEverywhereTyped(this.a, $$0, $$2 -> {
            Optional $$3 = $$2.getOptional($$1);
            if ($$3.isPresent() && this.b.test((String)((Pair)$$3.get()).getSecond())) {
                return $$2.updateTyped($$22, $$0 -> $$0.update(DSL.remainderFinder(), this::a));
            }
            return $$2;
        });
    }

    protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}

