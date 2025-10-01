/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Map;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class awy
extends DataFix {
    private static final String b = "WorldGenSettingsHeightAndBiomeFix";
    public static final String a = "has_increased_height_already";

    public awy(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.B);
        OpticFinder $$1 = $$0.findField("dimensions");
        Type $$22 = this.getOutputSchema().getType(avw.B);
        Type $$3 = $$22.findFieldType("dimensions");
        return this.fixTypeEverywhereTyped(b, $$0, $$22, $$2 -> {
            OptionalDynamic $$32 = ((Dynamic)$$2.get(DSL.remainderFinder())).get(a);
            boolean $$4 = $$32.result().isEmpty();
            boolean $$5 = $$32.asBoolean(true);
            return $$2.update(DSL.remainderFinder(), $$0 -> $$0.remove(a)).updateTyped($$1, $$3, $$3 -> {
                Dynamic $$4 = (Dynamic)$$3.write().result().orElseThrow(() -> new IllegalStateException("Malformed WorldGenSettings.dimensions"));
                $$4 = $$4.update("minecraft:overworld", $$2 -> $$2.update("generator", $$22 -> {
                    Object $$3 = $$22.get("type").asString("");
                    if ("minecraft:noise".equals($$3)) {
                        MutableBoolean $$4 = new MutableBoolean();
                        $$22 = $$22.update("biome_source", $$2 -> {
                            Object $$3 = $$2.get("type").asString("");
                            if ("minecraft:vanilla_layered".equals($$3) || $$4 && "minecraft:multi_noise".equals($$3)) {
                                if ($$2.get("large_biomes").asBoolean(false)) {
                                    $$4.setTrue();
                                }
                                return $$2.createMap((Map)ImmutableMap.of((Object)$$2.createString("preset"), (Object)$$2.createString("minecraft:overworld"), (Object)$$2.createString("type"), (Object)$$2.createString("minecraft:multi_noise")));
                            }
                            return $$2;
                        });
                        if ($$4.booleanValue()) {
                            return $$22.update("settings", $$0 -> {
                                if ("minecraft:overworld".equals($$0.asString(""))) {
                                    return $$0.createString("minecraft:large_biomes");
                                }
                                return $$0;
                            });
                        }
                        return $$22;
                    }
                    if ("minecraft:flat".equals($$3)) {
                        if ($$5) {
                            return $$22;
                        }
                        return $$22.update("settings", $$0 -> $$0.update("layers", awy::a));
                    }
                    return $$22;
                }));
                return (Typed)((Pair)$$3.readTyped($$4).result().orElseThrow(() -> new IllegalStateException("WorldGenSettingsHeightAndBiomeFix failed."))).getFirst();
            });
        });
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        Dynamic $$1 = $$0.createMap((Map)ImmutableMap.of((Object)$$0.createString("height"), (Object)$$0.createInt(64), (Object)$$0.createString("block"), (Object)$$0.createString("minecraft:air")));
        return $$0.createList(Stream.concat(Stream.of($$1), $$0.asStream()));
    }
}

