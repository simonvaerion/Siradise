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

public class atl
extends auz {
    private static final int a = 6;
    private static final apf b = apf.a();

    public atl(Schema $$0, boolean $$1) {
        super($$0, $$1, "EntityZombieVillagerTypeFix", avw.q, "Zombie");
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        if ($$0.get("IsVillager").asBoolean(false)) {
            if (!$$0.get("ZombieType").result().isPresent()) {
                int $$1 = this.a($$0.get("VillagerProfession").asInt(-1));
                if ($$1 == -1) {
                    $$1 = this.a(b.a(6));
                }
                $$0 = $$0.set("ZombieType", $$0.createInt($$1));
            }
            $$0 = $$0.remove("IsVillager");
        }
        return $$0;
    }

    private int a(int $$0) {
        if ($$0 < 0 || $$0 >= 6) {
            return -1;
        }
        return $$0;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

