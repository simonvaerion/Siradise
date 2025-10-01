/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
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
import java.util.function.Function;

public abstract class arf
extends are {
    private final String a;

    public arf(Schema $$0, String $$1) {
        super($$0, $$1);
        this.a = $$1;
    }

    @Override
    public TypeRewriteRule makeRule() {
        DSL.TypeReference $$0 = avw.l;
        String $$1 = "minecraft:jigsaw";
        OpticFinder $$22 = DSL.namedChoice((String)"minecraft:jigsaw", (Type)this.getInputSchema().getChoiceType($$0, "minecraft:jigsaw"));
        TypeRewriteRule $$3 = this.fixTypeEverywhereTyped(this.a + " for jigsaw state", this.getInputSchema().getType($$0), this.getOutputSchema().getType($$0), $$2 -> $$2.updateTyped($$22, this.getOutputSchema().getChoiceType($$0, "minecraft:jigsaw"), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.update("final_state", $$1 -> (Dynamic)DataFixUtils.orElse($$1.asString().result().map($$0 -> {
            Object $$1 = $$0.indexOf(91);
            Object $$2 = $$0.indexOf(123);
            int $$3 = $$0.length();
            if ($$1 > 0) {
                $$3 = Math.min($$3, $$1);
            }
            if ($$2 > 0) {
                $$3 = Math.min($$3, $$2);
            }
            String $$4 = $$0.substring(0, $$3);
            String $$5 = this.a($$4);
            return $$5 + $$0.substring($$3);
        }).map(arg_0 -> ((Dynamic)$$0).createString(arg_0)), (Object)$$1)))));
        return TypeRewriteRule.seq((TypeRewriteRule)super.makeRule(), (TypeRewriteRule)$$3);
    }

    public static DataFix b(Schema $$0, String $$1, final Function<String, String> $$2) {
        return new arf($$0, $$1){

            @Override
            protected String a(String $$0) {
                return (String)$$2.apply($$0);
            }
        };
    }
}

