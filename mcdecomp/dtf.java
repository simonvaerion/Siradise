/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dtf
extends dth {
    public static final Codec<dtf> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dth.e.listOf().fieldOf("elements").forGetter($$0 -> $$0.b), dtf.d()).apply((Applicative)$$02, dtf::new));
    private final List<dth> b;

    public dtf(List<dth> $$0, dtj.a $$1) {
        super($$1);
        if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Elements are empty");
        }
        this.b = $$0;
        this.b($$1);
    }

    @Override
    public hz a(dvu $$0, cvz $$1) {
        int $$2 = 0;
        int $$3 = 0;
        int $$4 = 0;
        for (dth $$5 : this.b) {
            hz $$6 = $$5.a($$0, $$1);
            $$2 = Math.max($$2, $$6.u());
            $$3 = Math.max($$3, $$6.v());
            $$4 = Math.max($$4, $$6.w());
        }
        return new hz($$2, $$3, $$4);
    }

    @Override
    public List<dvt.c> a(dvu $$0, gu $$1, cvz $$2, apf $$3) {
        return this.b.get(0).a($$0, $$1, $$2, $$3);
    }

    @Override
    public drs a(dvu $$02, gu $$1, cvz $$2) {
        Stream<drs> $$32 = this.b.stream().filter($$0 -> $$0 != dta.b).map($$3 -> $$3.a($$02, $$1, $$2));
        return drs.b($$32::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
    }

    @Override
    public boolean a(dvu $$0, cng $$1, cne $$2, ddy $$3, gu $$4, gu $$5, cvz $$6, drs $$7, apf $$8, boolean $$9) {
        for (dth $$10 : this.b) {
            if ($$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) continue;
            return false;
        }
        return true;
    }

    @Override
    public dti<?> a() {
        return dti.b;
    }

    @Override
    public dth a(dtj.a $$0) {
        super.a($$0);
        this.b($$0);
        return this;
    }

    public String toString() {
        return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    private void b(dtj.a $$0) {
        this.b.forEach($$1 -> $$1.a($$0));
    }
}

