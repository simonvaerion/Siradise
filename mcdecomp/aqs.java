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

public class aqs
extends auz {
    public aqs(Schema $$0, boolean $$1) {
        super($$0, $$1, "BlockEntityBannerColorFix", avw.l, "minecraft:banner");
    }

    public Dynamic<?> a(Dynamic<?> $$03) {
        $$03 = $$03.update("Base", $$0 -> $$0.createInt(15 - $$0.asInt(0)));
        $$03 = $$03.update("Patterns", $$02 -> (Dynamic)DataFixUtils.orElse((Optional)$$02.asStreamOpt().map($$0 -> $$0.map($$02 -> $$02.update("Color", $$0 -> $$0.createInt(15 - $$0.asInt(0))))).map(arg_0 -> ((Dynamic)$$02).createList(arg_0)).result(), (Object)$$02));
        return $$03;
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        return $$0.update(DSL.remainderFinder(), this::a);
    }
}

