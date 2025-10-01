/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public abstract class auz
extends DataFix {
    private final String a;
    private final String b;
    private final DSL.TypeReference c;

    public auz(Schema $$0, boolean $$1, String $$2, DSL.TypeReference $$3, String $$4) {
        super($$0, $$1);
        this.a = $$2;
        this.c = $$3;
        this.b = $$4;
    }

    public TypeRewriteRule makeRule() {
        OpticFinder $$0 = DSL.namedChoice((String)this.b, (Type)this.getInputSchema().getChoiceType(this.c, this.b));
        return this.fixTypeEverywhereTyped(this.a, this.getInputSchema().getType(this.c), this.getOutputSchema().getType(this.c), $$1 -> $$1.updateTyped($$0, this.getOutputSchema().getChoiceType(this.c, this.b), this::a));
    }

    protected abstract Typed<?> a(Typed<?> var1);
}

