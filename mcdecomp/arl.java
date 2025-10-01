/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Streams;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class arl
extends DataFix {
    public arl(Schema $$0, boolean $$1) {
        super($$0, $$1);
    }

    public TypeRewriteRule makeRule() {
        Type $$0 = this.getOutputSchema().getType(avw.c);
        Type $$1 = $$0.findFieldType("Level");
        Type $$2 = $$1.findFieldType("TileEntities");
        if (!($$2 instanceof List.ListType)) {
            throw new IllegalStateException("Tile entity type is not a list type.");
        }
        List.ListType $$3 = (List.ListType)$$2;
        return this.a($$1, $$3);
    }

    private <TE> TypeRewriteRule a(Type<?> $$0, List.ListType<TE> $$1) {
        Type $$2 = $$1.getElement();
        OpticFinder $$3 = DSL.fieldFinder((String)"Level", $$0);
        OpticFinder $$4 = DSL.fieldFinder((String)"TileEntities", $$1);
        int $$5 = 416;
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhere("InjectBedBlockEntityType", (Type)this.getInputSchema().findChoiceType(avw.l), (Type)this.getOutputSchema().findChoiceType(avw.l), $$02 -> $$0 -> $$0), (TypeRewriteRule)this.fixTypeEverywhereTyped("BedBlockEntityInjecter", this.getOutputSchema().getType(avw.c), $$32 -> {
            Typed $$42 = $$32.getTyped($$3);
            Dynamic $$52 = (Dynamic)$$42.get(DSL.remainderFinder());
            int $$6 = $$52.get("xPos").asInt(0);
            int $$7 = $$52.get("zPos").asInt(0);
            ArrayList $$8 = Lists.newArrayList((Iterable)((Iterable)$$42.getOrCreate($$4)));
            List $$9 = $$52.get("Sections").asList(Function.identity());
            for (int $$10 = 0; $$10 < $$9.size(); ++$$10) {
                Dynamic $$11 = (Dynamic)$$9.get($$10);
                int $$12 = $$11.get("Y").asInt(0);
                Streams.mapWithIndex((IntStream)$$11.get("Blocks").asIntStream(), ($$4, $$5) -> {
                    if (416 == ($$4 & 0xFF) << 4) {
                        int $$6 = (int)$$5;
                        int $$7 = $$6 & 0xF;
                        int $$8 = $$6 >> 8 & 0xF;
                        int $$9 = $$6 >> 4 & 0xF;
                        HashMap $$10 = Maps.newHashMap();
                        $$10.put($$11.createString("id"), $$11.createString("minecraft:bed"));
                        $$10.put($$11.createString("x"), $$11.createInt($$7 + ($$6 << 4)));
                        $$10.put($$11.createString("y"), $$11.createInt($$8 + ($$12 << 4)));
                        $$10.put($$11.createString("z"), $$11.createInt($$9 + ($$7 << 4)));
                        $$10.put($$11.createString("color"), $$11.createShort((short)14));
                        return $$10;
                    }
                    return null;
                }).forEachOrdered($$3 -> {
                    if ($$3 != null) {
                        $$8.add(((Pair)$$2.read($$11.createMap($$3)).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created bed block entity."))).getFirst());
                    }
                });
            }
            if (!$$8.isEmpty()) {
                return $$32.set($$3, $$42.set($$4, (Object)$$8));
            }
            return $$32;
        }));
    }
}

