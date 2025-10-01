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
import java.util.Optional;

public class axa
extends auz {
    public axa(Schema $$0, boolean $$1) {
        super($$0, $$1, "Zombie Villager XP rebuild", avw.q, "minecraft:zombie_villager");
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return $$02.update(DSL.remainderFinder(), $$0 -> {
            Optional $$1 = $$0.get("Xp").asNumber().result();
            if (!$$1.isPresent()) {
                int $$2 = $$0.get("VillagerData").get("level").asInt(1);
                return $$0.set("Xp", $$0.createInt(aws.a($$2)));
            }
            return $$0;
        });
    }
}

