/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntIterator
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class duz
extends dvq {
    public static final Codec<duz> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dvs.a.fieldOf("delegate").forGetter($$0 -> $$0.b), (App)bdc.e.fieldOf("limit").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, duz::new));
    private final dvq b;
    private final bdc c;

    public duz(dvq $$0, bdc $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    protected dvs<?> a() {
        return dvs.o;
    }

    @Override
    public final List<dvt.c> a(cnb $$0, gu $$1, gu $$2, List<dvt.c> $$3, List<dvt.c> $$4, dvp $$5) {
        if (this.c.b() == 0 || $$4.isEmpty()) {
            return $$4;
        }
        if ($$3.size() != $$4.size()) {
            ac.a("Original block info list not in sync with processed list, skipping processing. Original size: " + $$3.size() + ", Processed size: " + $$4.size());
            return $$4;
        }
        apf $$6 = apf.a($$0.C().A()).e().a($$1);
        int $$7 = Math.min(this.c.a($$6), $$4.size());
        if ($$7 < 1) {
            return $$4;
        }
        IntArrayList $$8 = ac.a(IntStream.range(0, $$4.size()), $$6);
        IntIterator $$9 = $$8.intIterator();
        int $$10 = 0;
        while ($$9.hasNext() && $$10 < $$7) {
            dvt.c $$13;
            int $$11 = $$9.nextInt();
            dvt.c $$12 = $$3.get($$11);
            dvt.c $$14 = this.b.a((cmp)$$0, $$1, $$2, $$12, $$13 = $$4.get($$11), $$5);
            if ($$14 == null || $$13.equals($$14)) continue;
            ++$$10;
            $$4.set($$11, $$14);
        }
        return $$4;
    }
}

