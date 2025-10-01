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
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class asc
extends DataFix {
    private static final Set<String> a = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

    public asc(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Schema $$02 = this.getInputSchema();
        Type $$1 = this.getInputSchema().getType(avw.m);
        OpticFinder $$22 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)avw.s.typeName(), axd.a()));
        OpticFinder $$3 = $$1.findField("tag");
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("EffectDurationEntity", $$02.getType(avw.q), $$0 -> $$0.update(DSL.remainderFinder(), this::c)), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped("EffectDurationPlayer", $$02.getType(avw.b), $$0 -> $$0.update(DSL.remainderFinder(), this::c)), this.fixTypeEverywhereTyped("EffectDurationItem", $$1, $$2 -> {
            Optional $$4;
            Optional $$3 = $$2.getOptional($$22);
            if ($$3.filter(a::contains).isPresent() && ($$4 = $$2.getOptionalTyped($$3)).isPresent()) {
                Dynamic $$5 = (Dynamic)((Typed)$$4.get()).get(DSL.remainderFinder());
                Typed $$6 = ((Typed)$$4.get()).set(DSL.remainderFinder(), (Object)$$5.update("CustomPotionEffects", this::b));
                return $$2.set($$3, $$6);
            }
            return $$2;
        })});
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update("FactorCalculationData", $$1 -> {
            int $$2 = $$1.get("effect_changed_timestamp").asInt(-1);
            $$1 = $$1.remove("effect_changed_timestamp");
            int $$3 = $$0.get("Duration").asInt(-1);
            int $$4 = $$2 - $$3;
            return $$1.set("ticks_active", $$1.createInt($$4));
        });
    }

    private Dynamic<?> b(Dynamic<?> $$0) {
        return $$0.createList($$0.asStream().map(this::a));
    }

    private Dynamic<?> c(Dynamic<?> $$0) {
        $$0 = $$0.update("Effects", this::b);
        $$0 = $$0.update("ActiveEffects", this::b);
        $$0 = $$0.update("CustomPotionEffects", this::b);
        return $$0;
    }
}

