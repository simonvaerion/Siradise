/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class atk
extends awe {
    public atk(Schema $$0, boolean $$1) {
        super("EntityZombieSplitFix", $$0, $$1);
    }

    @Override
    protected Pair<String, Dynamic<?>> a(String $$0, Dynamic<?> $$1) {
        if (Objects.equals("Zombie", $$0)) {
            String $$2 = "Zombie";
            int $$3 = $$1.get("ZombieType").asInt(0);
            switch ($$3) {
                default: {
                    break;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    $$2 = "ZombieVillager";
                    $$1 = $$1.set("Profession", $$1.createInt($$3 - 1));
                    break;
                }
                case 6: {
                    $$2 = "Husk";
                }
            }
            $$1 = $$1.remove("ZombieType");
            return Pair.of((Object)$$2, (Object)$$1);
        }
        return Pair.of((Object)$$0, $$1);
    }
}

