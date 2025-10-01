/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.Locale;

public class aqj
extends DataFix {
    private final String a;
    private final DSL.TypeReference b;

    public aqj(Schema $$0, String $$1, DSL.TypeReference $$2) {
        super($$0, true);
        this.a = $$1;
        this.b = $$2;
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType $$0 = this.getInputSchema().findChoiceType(this.b);
        TaggedChoice.TaggedChoiceType $$1 = this.getOutputSchema().findChoiceType(this.b);
        return this.a(this.a, $$0, $$1);
    }

    protected final <K> TypeRewriteRule a(String $$0, TaggedChoice.TaggedChoiceType<K> $$1, TaggedChoice.TaggedChoiceType<?> $$2) {
        if ($$1.getKeyType() != $$2.getKeyType()) {
            throw new IllegalStateException("Could not inject: key type is not the same");
        }
        TaggedChoice.TaggedChoiceType<?> $$3 = $$2;
        return this.fixTypeEverywhere($$0, (Type)$$1, (Type)$$3, $$12 -> $$1 -> {
            if (!$$3.hasType($$1.getFirst())) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "Unknown type %s in %s ", $$1.getFirst(), this.b));
            }
            return $$1;
        });
    }
}

