/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class ary
extends auz {
    public ary(Schema $$0, boolean $$1) {
        super($$0, $$1, "Colorless shulker entity fix", avw.q, "minecraft:shulker");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> {
            if ($$0.get("Color").asInt(0) == 10) {
                return $$0.set("Color", $$0.createByte((byte)16));
            }
            return $$0;
        });
    }
}

