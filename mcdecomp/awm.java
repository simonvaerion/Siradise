/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class awm
extends DataFix {
    private static final Map<String, a> a = ImmutableMap.builder().put((Object)"mineshaft", (Object)awm$a.a(Map.of(List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands"), "minecraft:mineshaft_mesa"), "minecraft:mineshaft")).put((Object)"shipwreck", (Object)awm$a.a(Map.of(List.of("minecraft:beach", "minecraft:snowy_beach"), "minecraft:shipwreck_beached"), "minecraft:shipwreck")).put((Object)"ocean_ruin", (Object)awm$a.a(Map.of(List.of("minecraft:warm_ocean", "minecraft:lukewarm_ocean", "minecraft:deep_lukewarm_ocean"), "minecraft:ocean_ruin_warm"), "minecraft:ocean_ruin_cold")).put((Object)"village", (Object)awm$a.a(Map.of(List.of("minecraft:desert"), "minecraft:village_desert", List.of("minecraft:savanna"), "minecraft:village_savanna", List.of("minecraft:snowy_plains"), "minecraft:village_snowy", List.of("minecraft:taiga"), "minecraft:village_taiga"), "minecraft:village_plains")).put((Object)"ruined_portal", (Object)awm$a.a(Map.of(List.of("minecraft:desert"), "minecraft:ruined_portal_desert", List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands", "minecraft:windswept_hills", "minecraft:windswept_forest", "minecraft:windswept_gravelly_hills", "minecraft:savanna_plateau", "minecraft:windswept_savanna", "minecraft:stony_shore", "minecraft:meadow", "minecraft:frozen_peaks", "minecraft:jagged_peaks", "minecraft:stony_peaks", "minecraft:snowy_slopes"), "minecraft:ruined_portal_mountain", List.of("minecraft:bamboo_jungle", "minecraft:jungle", "minecraft:sparse_jungle"), "minecraft:ruined_portal_jungle", List.of("minecraft:deep_frozen_ocean", "minecraft:deep_cold_ocean", "minecraft:deep_ocean", "minecraft:deep_lukewarm_ocean", "minecraft:frozen_ocean", "minecraft:ocean", "minecraft:cold_ocean", "minecraft:lukewarm_ocean", "minecraft:warm_ocean"), "minecraft:ruined_portal_ocean"), "minecraft:ruined_portal")).put((Object)"pillager_outpost", (Object)awm$a.a("minecraft:pillager_outpost")).put((Object)"mansion", (Object)awm$a.a("minecraft:mansion")).put((Object)"jungle_pyramid", (Object)awm$a.a("minecraft:jungle_pyramid")).put((Object)"desert_pyramid", (Object)awm$a.a("minecraft:desert_pyramid")).put((Object)"igloo", (Object)awm$a.a("minecraft:igloo")).put((Object)"swamp_hut", (Object)awm$a.a("minecraft:swamp_hut")).put((Object)"stronghold", (Object)awm$a.a("minecraft:stronghold")).put((Object)"monument", (Object)awm$a.a("minecraft:monument")).put((Object)"fortress", (Object)awm$a.a("minecraft:fortress")).put((Object)"endcity", (Object)awm$a.a("minecraft:end_city")).put((Object)"buried_treasure", (Object)awm$a.a("minecraft:buried_treasure")).put((Object)"nether_fossil", (Object)awm$a.a("minecraft:nether_fossil")).put((Object)"bastion_remnant", (Object)awm$a.a("minecraft:bastion_remnant")).build();

    public awm(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(avw.c);
        Type $$1 = this.getInputSchema().getType(avw.c);
        return this.writeFixAndRead("StucturesToConfiguredStructures", $$0, $$1, this::a);
    }

    private Dynamic<?> a(Dynamic<?> $$0) {
        return $$0.update("structures", $$12 -> $$12.update("starts", $$1 -> this.a((Dynamic<?>)$$1, $$0)).update("References", $$1 -> this.b((Dynamic<?>)$$1, $$0)));
    }

    private Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$12) {
        Map $$22 = (Map)$$0.getMapValues().result().get();
        ArrayList $$3 = new ArrayList();
        $$22.forEach(($$1, $$2) -> {
            if ($$2.get("id").asString("INVALID").equals("INVALID")) {
                $$3.add($$1);
            }
        });
        for (Dynamic $$4 : $$3) {
            $$0 = $$0.remove($$4.asString(""));
        }
        return $$0.updateMapValues($$1 -> this.a((Pair<Dynamic<?>, Dynamic<?>>)$$1, $$12));
    }

    private Pair<Dynamic<?>, Dynamic<?>> a(Pair<Dynamic<?>, Dynamic<?>> $$0, Dynamic<?> $$1) {
        Dynamic<?> $$2 = this.c($$0, $$1);
        return new Pair($$2, (Object)((Dynamic)$$0.getSecond()).set("id", $$2));
    }

    private Dynamic<?> b(Dynamic<?> $$0, Dynamic<?> $$12) {
        Map $$22 = (Map)$$0.getMapValues().result().get();
        ArrayList $$3 = new ArrayList();
        $$22.forEach(($$1, $$2) -> {
            if ($$2.asLongStream().count() == 0L) {
                $$3.add($$1);
            }
        });
        for (Dynamic $$4 : $$3) {
            $$0 = $$0.remove($$4.asString(""));
        }
        return $$0.updateMapValues($$1 -> this.b((Pair<Dynamic<?>, Dynamic<?>>)$$1, $$12));
    }

    private Pair<Dynamic<?>, Dynamic<?>> b(Pair<Dynamic<?>, Dynamic<?>> $$0, Dynamic<?> $$1) {
        return $$0.mapFirst($$2 -> this.c($$0, $$1));
    }

    private Dynamic<?> c(Pair<Dynamic<?>, Dynamic<?>> $$0, Dynamic<?> $$1) {
        Optional<String> $$6;
        String $$2 = ((Dynamic)$$0.getFirst()).asString("UNKNOWN").toLowerCase(Locale.ROOT);
        a $$3 = a.get($$2);
        if ($$3 == null) {
            throw new IllegalStateException("Found unknown structure: " + $$2);
        }
        Dynamic $$4 = (Dynamic)$$0.getSecond();
        String $$5 = $$3.b;
        if (!$$3.a().isEmpty() && ($$6 = this.a($$1, $$3)).isPresent()) {
            $$5 = $$6.get();
        }
        Dynamic $$7 = $$4.createString($$5);
        return $$7;
    }

    private Optional<String> a(Dynamic<?> $$0, a $$1) {
        Object2IntArrayMap $$2 = new Object2IntArrayMap();
        $$0.get("sections").asList(Function.identity()).forEach($$22 -> $$22.get("biomes").get("palette").asList(Function.identity()).forEach($$2 -> {
            String $$3 = $$1.a().get($$2.asString(""));
            if ($$3 != null) {
                $$2.mergeInt((Object)$$3, 1, Integer::sum);
            }
        }));
        return $$2.object2IntEntrySet().stream().max(Comparator.comparingInt(Object2IntMap.Entry::getIntValue)).map(Map.Entry::getKey);
    }

    static final class a
    extends Record {
        private final Map<String, String> a;
        final String b;

        private a(Map<String, String> $$0, String $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static a a(String $$0) {
            return new a(Map.of(), $$0);
        }

        public static a a(Map<List<String>, String> $$0, String $$1) {
            return new a(awm$a.a($$0), $$1);
        }

        private static Map<String, String> a(Map<List<String>, String> $$0) {
            ImmutableMap.Builder $$1 = ImmutableMap.builder();
            for (Map.Entry<List<String>, String> $$22 : $$0.entrySet()) {
                $$22.getKey().forEach($$2 -> $$1.put($$2, (Object)((String)$$22.getValue())));
            }
            return $$1.build();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "biomeMapping;fallback", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "biomeMapping;fallback", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "biomeMapping;fallback", "a", "b"}, this, $$0);
        }

        public Map<String, String> a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }
}

