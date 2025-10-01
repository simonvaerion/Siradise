/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class awd
extends aqh {
    private static final Logger b = LogUtils.getLogger();

    public awd(Schema $$0) {
        super($$0, avw.h);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("SavedDataUUIDFix", this.getInputSchema().getType(this.a), $$0 -> $$0.updateTyped($$0.getType().findField("data"), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.update("Raids", $$02 -> $$02.createList($$02.asStream().map($$0 -> $$0.update("HeroesOfTheVillage", $$02 -> $$02.createList($$02.asStream().map($$0 -> awd.d($$0, "UUIDMost", "UUIDLeast").orElseGet(() -> {
            b.warn("HeroesOfTheVillage contained invalid UUIDs.");
            return $$0;
        }))))))))));
    }
}

