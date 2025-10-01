/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class avf
extends aui {
    public avf(Schema $$02) {
        super($$02, "OminousBannerRenameFix", $$0 -> $$0.equals("minecraft:white_banner"));
    }

    @Override
    protected <T> Dynamic<T> a(Dynamic<T> $$0) {
        Optional $$1 = $$0.get("display").result();
        if ($$1.isPresent()) {
            Dynamic $$2 = (Dynamic)$$1.get();
            Optional $$3 = $$2.get("Name").asString().result();
            if ($$3.isPresent()) {
                String $$4 = (String)$$3.get();
                $$4 = $$4.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
                $$2 = $$2.set("Name", $$2.createString($$4));
            }
            return $$0.set("display", $$2);
        }
        return $$0;
    }
}

