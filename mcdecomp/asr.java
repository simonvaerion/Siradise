/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Objects;

public class asr
extends DataFix {
    private static final List<String> a = Lists.newArrayList((Object[])new String[]{"MinecartRideable", "MinecartChest", "MinecartFurnace"});

    public asr(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType $$0 = this.getInputSchema().findChoiceType(avw.q);
        TaggedChoice.TaggedChoiceType $$1 = this.getOutputSchema().findChoiceType(avw.q);
        return this.fixTypeEverywhere("EntityMinecartIdentifiersFix", (Type)$$0, (Type)$$1, $$2 -> $$3 -> {
            if (Objects.equals($$3.getFirst(), "Minecart")) {
                String $$8;
                Typed $$4 = (Typed)$$0.point($$2, (Object)"Minecart", $$3.getSecond()).orElseThrow(IllegalStateException::new);
                Dynamic $$5 = (Dynamic)$$4.getOrCreate(DSL.remainderFinder());
                int $$6 = $$5.get("Type").asInt(0);
                if ($$6 > 0 && $$6 < a.size()) {
                    String $$7 = a.get($$6);
                } else {
                    $$8 = "MinecartRideable";
                }
                return Pair.of((Object)$$8, (Object)((DataResult)$$4.write().map($$2 -> ((Type)$$1.types().get($$8)).read($$2)).result().orElseThrow(() -> new IllegalStateException("Could not read the new minecart."))));
            }
            return $$3;
        });
    }
}

