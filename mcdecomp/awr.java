/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class awr
extends auz {
    private static final double a = 16.0;
    private static final double b = 48.0;

    public awr(Schema $$0) {
        super($$0, false, "Villager Follow Range Fix", avw.q, "minecraft:villager");
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), awr::a);
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update("Attributes", $$1 -> $$0.createList($$1.asStream().map($$0 -> {
            if (!$$0.get("Name").asString("").equals("generic.follow_range") || $$0.get("Base").asDouble(0.0) != 16.0) {
                return $$0;
            }
            return $$0.set("Base", $$0.createDouble(48.0));
        })));
    }
}

