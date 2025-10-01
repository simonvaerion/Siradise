/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;

public class dto
extends drz {
    public static final Codec<dto> d = dto.a(dto::new);

    public dto(dsa.c $$0) {
        super(dtn::new, 21, 21, $$0);
    }

    @Override
    public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, dsp $$6) {
        Comparator $$7 = apo.a(hz::i);
        for (dse $$8 : $$6.c()) {
            if (!($$8 instanceof dtn)) continue;
            dtn $$9 = (dtn)$$8;
            $$7.addAll($$9.b());
            dto.a($$4, $$0, $$9.c());
        }
        ObjectArrayList $$10 = new ObjectArrayList($$7.stream().toList());
        apf $$11 = apf.a($$0.A()).e().a($$6.b().f());
        ac.b($$10, $$11);
        int $$12 = Math.min($$7.size(), $$11.b(5, 8));
        for (gu $$13 : $$10) {
            if ($$12 > 0) {
                --$$12;
                dto.a($$4, $$0, $$13);
                continue;
            }
            if (!$$4.b($$13)) continue;
            $$0.a($$13, cpo.I.n(), 2);
        }
    }

    private static void a(drs $$0, cng $$12, gu $$2) {
        if ($$0.b($$2)) {
            $$12.a($$2, cpo.J.n(), 2);
            $$12.a($$2, czp.N).ifPresent($$1 -> $$1.a(dzg.aD, $$2.a()));
        }
    }

    @Override
    public dsj<?> e() {
        return dsj.b;
    }
}

