/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class are
extends DataFix {
    private final String a;

    public are(Schema $$0, String $$1) {
        super($$0, false);
        this.a = $$1;
    }

    public TypeRewriteRule makeRule() {
        Type $$1;
        Type $$0 = this.getInputSchema().getType(avw.r);
        if (!Objects.equals($$0, $$1 = DSL.named((String)avw.r.typeName(), axd.a()))) {
            throw new IllegalStateException("block type is not what was expected.");
        }
        TypeRewriteRule $$2 = this.fixTypeEverywhere(this.a + " for block", $$1, $$02 -> $$0 -> $$0.mapSecond(this::a));
        TypeRewriteRule $$3 = this.fixTypeEverywhereTyped(this.a + " for block_state", this.getInputSchema().getType(avw.n), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> {
            Optional $$1 = $$0.get("Name").asString().result();
            if ($$1.isPresent()) {
                return $$0.set("Name", $$0.createString(this.a((String)$$1.get())));
            }
            return $$0;
        }));
        return TypeRewriteRule.seq((TypeRewriteRule)$$2, (TypeRewriteRule)$$3);
    }

    protected abstract String a(String var1);

    public static DataFix a(Schema $$0, String $$1, final Function<String, String> $$2) {
        return new are($$0, $$1){

            @Override
            protected String a(String $$0) {
                return (String)$$2.apply($$0);
            }
        };
    }
}

