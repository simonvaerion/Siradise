/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class ayq
extends axd {
    public ayq(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(false, avw.B, () -> DSL.fields((String)"dimensions", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.constType(ayq.a()), (TypeTemplate)DSL.fields((String)"generator", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:debug", DSL::remainder, (Object)"minecraft:flat", () -> DSL.optionalFields((String)"settings", (TypeTemplate)DSL.optionalFields((String)"biome", (TypeTemplate)avw.z.in($$0), (String)"layers", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"block", (TypeTemplate)avw.r.in($$0))))), (Object)"minecraft:noise", () -> DSL.optionalFields((String)"biome_source", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:fixed", () -> DSL.fields((String)"biome", (TypeTemplate)avw.z.in($$0)), (Object)"minecraft:multi_noise", () -> DSL.list((TypeTemplate)DSL.fields((String)"biome", (TypeTemplate)avw.z.in($$0))), (Object)"minecraft:checkerboard", () -> DSL.fields((String)"biomes", (TypeTemplate)DSL.list((TypeTemplate)avw.z.in($$0))), (Object)"minecraft:vanilla_layered", DSL::remainder, (Object)"minecraft:the_end", DSL::remainder)), (String)"settings", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.optionalFields((String)"default_block", (TypeTemplate)avw.r.in($$0), (String)"default_fluid", (TypeTemplate)avw.r.in($$0))))))))));
    }
}

