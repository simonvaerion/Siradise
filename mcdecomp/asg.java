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

public class asg
extends awe {
    public asg(Schema $$0, boolean $$1) {
        super("EntityCatSplitFix", $$0, $$1);
    }

    @Override
    protected Pair<String, Dynamic<?>> a(String $$0, Dynamic<?> $$1) {
        if (Objects.equals("minecraft:ocelot", $$0)) {
            int $$2 = $$1.get("CatType").asInt(0);
            if ($$2 == 0) {
                String $$3 = $$1.get("Owner").asString("");
                String $$4 = $$1.get("OwnerUUID").asString("");
                if ($$3.length() > 0 || $$4.length() > 0) {
                    $$1.set("Trusting", $$1.createBoolean(true));
                }
            } else if ($$2 > 0 && $$2 < 4) {
                $$1 = $$1.set("CatType", $$1.createInt($$2));
                $$1 = $$1.set("OwnerUUID", $$1.createString($$1.get("OwnerUUID").asString("")));
                return Pair.of((Object)"minecraft:cat", (Object)$$1);
            }
        }
        return Pair.of((Object)$$0, $$1);
    }
}

