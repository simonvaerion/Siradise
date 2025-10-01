/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class ass
extends auz {
    public ass(Schema $$0) {
        super($$0, false, "EntityPaintingFieldsRenameFix", avw.q, "minecraft:painting");
    }

    public Dynamic<?> a(Dynamic<?> $$0) {
        return this.a(this.a($$0, "Motive", "variant"), "Facing", "facing");
    }

    private Dynamic<?> a(Dynamic<?> $$0, String $$1, String $$2) {
        Optional $$32 = $$0.get($$1).result();
        Optional<Dynamic> $$4 = $$32.map($$3 -> $$0.remove($$1).set($$2, $$3));
        return (Dynamic)DataFixUtils.orElse($$4, $$0);
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

