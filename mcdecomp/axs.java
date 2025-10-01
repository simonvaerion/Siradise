/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class axs
extends axd {
    public static final String b = "_special";
    protected static final Hook.HookFunction c = new Hook.HookFunction(){

        public <T> T apply(DynamicOps<T> $$02, T $$12) {
            Dynamic $$2 = new Dynamic($$02, $$12);
            return (T)((Dynamic)DataFixUtils.orElse($$2.get("CriteriaName").asString().get().left().map($$0 -> {
                int $$1 = $$0.indexOf(58);
                if ($$1 < 0) {
                    return Pair.of((Object)axs.b, (Object)$$0);
                }
                try {
                    acq $$2 = acq.a($$0.substring(0, $$1), '.');
                    acq $$3 = acq.a($$0.substring($$1 + 1), '.');
                    return Pair.of((Object)$$2.toString(), (Object)$$3.toString());
                }
                catch (Exception $$4) {
                    return Pair.of((Object)axs.b, (Object)$$0);
                }
            }).map($$1 -> $$2.set("CriteriaType", $$2.createMap((Map)ImmutableMap.of((Object)$$2.createString("type"), (Object)$$2.createString((String)$$1.getFirst()), (Object)$$2.createString("id"), (Object)$$2.createString((String)$$1.getSecond()))))), (Object)$$2)).getValue();
        }
    };
    protected static final Hook.HookFunction d = new Hook.HookFunction(){

        private String a(String $$0) {
            acq $$1 = acq.a($$0);
            return $$1 != null ? $$1.b() + "." + $$1.a() : $$0;
        }

        public <T> T apply(DynamicOps<T> $$0, T $$12) {
            Dynamic $$2 = new Dynamic($$0, $$12);
            Optional<Dynamic> $$3 = $$2.get("CriteriaType").get().get().left().flatMap($$1 -> {
                Optional $$2 = $$1.get("type").asString().get().left();
                Optional $$3 = $$1.get("id").asString().get().left();
                if ($$2.isPresent() && $$3.isPresent()) {
                    String $$4 = (String)$$2.get();
                    if ($$4.equals(axs.b)) {
                        return Optional.of($$2.createString((String)$$3.get()));
                    }
                    return Optional.of($$1.createString(this.a($$4) + ":" + this.a((String)$$3.get())));
                }
                return Optional.empty();
            });
            return (T)((Dynamic)DataFixUtils.orElse($$3.map($$1 -> $$2.set("CriteriaName", $$1).remove("CriteriaType")), (Object)$$2)).getValue();
        }
    };

    public axs(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        Supplier<TypeTemplate> $$3 = () -> DSL.compoundList((TypeTemplate)avw.s.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType()));
        $$0.registerType(false, avw.g, () -> DSL.optionalFields((String)"stats", (TypeTemplate)DSL.optionalFields((String)"minecraft:mined", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.r.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:crafted", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:used", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:broken", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:picked_up", (TypeTemplate)((TypeTemplate)$$3.get()), (TypeTemplate)DSL.optionalFields((String)"minecraft:dropped", (TypeTemplate)((TypeTemplate)$$3.get()), (String)"minecraft:killed", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.o.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:killed_by", (TypeTemplate)DSL.compoundList((TypeTemplate)avw.o.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:custom", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.constType(axs.a()), (TypeTemplate)DSL.constType((Type)DSL.intType()))))));
        Map<String, Supplier<TypeTemplate>> $$4 = axs.a($$0);
        $$0.registerType(false, avw.w, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"CriteriaType", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)$$4)), (Hook.HookFunction)c, (Hook.HookFunction)d));
    }

    protected static Map<String, Supplier<TypeTemplate>> a(Schema $$0) {
        Supplier<TypeTemplate> $$1 = () -> DSL.optionalFields((String)"id", (TypeTemplate)avw.s.in($$0));
        Supplier<TypeTemplate> $$2 = () -> DSL.optionalFields((String)"id", (TypeTemplate)avw.r.in($$0));
        Supplier<TypeTemplate> $$3 = () -> DSL.optionalFields((String)"id", (TypeTemplate)avw.o.in($$0));
        HashMap $$4 = Maps.newHashMap();
        $$4.put("minecraft:mined", $$2);
        $$4.put("minecraft:crafted", $$1);
        $$4.put("minecraft:used", $$1);
        $$4.put("minecraft:broken", $$1);
        $$4.put("minecraft:picked_up", $$1);
        $$4.put("minecraft:dropped", $$1);
        $$4.put("minecraft:killed", $$3);
        $$4.put("minecraft:killed_by", $$3);
        $$4.put("minecraft:custom", () -> DSL.optionalFields((String)"id", (TypeTemplate)DSL.constType(axs.a())));
        $$4.put(b, () -> DSL.optionalFields((String)"id", (TypeTemplate)DSL.constType((Type)DSL.string())));
        return $$4;
    }
}

