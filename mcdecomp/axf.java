/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class axf
extends Schema {
    public axf(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, avw.m, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)avw.s.in($$0), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)avw.p.in($$0), (String)"BlockEntityTag", (TypeTemplate)avw.l.in($$0), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)avw.r.in($$0)), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)avw.m.in($$0)))), (Hook.HookFunction)azx.a, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
    }
}

