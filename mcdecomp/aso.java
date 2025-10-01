/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class aso
extends asz {
    public aso(Schema $$0, boolean $$1) {
        super("EntityHorseSplitFix", $$0, $$1);
    }

    @Override
    protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
        Dynamic $$2 = (Dynamic)$$1.get(DSL.remainderFinder());
        if (Objects.equals("EntityHorse", $$0)) {
            String $$8;
            int $$3 = $$2.get("Type").asInt(0);
            switch ($$3) {
                default: {
                    String $$4 = "Horse";
                    break;
                }
                case 1: {
                    String $$5 = "Donkey";
                    break;
                }
                case 2: {
                    String $$6 = "Mule";
                    break;
                }
                case 3: {
                    String $$7 = "ZombieHorse";
                    break;
                }
                case 4: {
                    $$8 = "SkeletonHorse";
                }
            }
            $$2.remove("Type");
            Type $$9 = (Type)this.getOutputSchema().findChoiceType(avw.q).types().get($$8);
            return Pair.of((Object)$$8, (Object)((Typed)((Pair)$$1.write().flatMap(arg_0 -> ((Type)$$9).readTyped(arg_0)).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse"))).getFirst()));
        }
        return Pair.of((Object)$$0, $$1);
    }
}

