/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;

public class ftr<T extends bfz, M extends fbf<T>>
extends ftg<T, M> {
    private static final Int2ObjectMap<acq> a = (Int2ObjectMap)ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
        $$0.put(1, (Object)new acq("stone"));
        $$0.put(2, (Object)new acq("iron"));
        $$0.put(3, (Object)new acq("gold"));
        $$0.put(4, (Object)new acq("emerald"));
        $$0.put(5, (Object)new acq("diamond"));
    });
    private final Object2ObjectMap<byg, fwh.a> b = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<bye, fwh.a> c = new Object2ObjectOpenHashMap();
    private final akx d;
    private final String e;

    public ftr(fqt<T, M> $$0, akx $$1, String $$2) {
        super($$0);
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        if (((bfj)$$3).cb()) {
            return;
        }
        byc $$10 = ((byd)$$3).gj();
        byg $$11 = $$10.a();
        bye $$12 = $$10.b();
        fwh.a $$13 = this.a(this.b, "type", jb.z, $$11);
        fwh.a $$14 = this.a(this.c, "profession", jb.A, $$12);
        Object $$15 = this.c();
        ((fdp)$$15).a($$14 == fwh.a.a || $$14 == fwh.a.b && $$13 != fwh.a.c);
        acq $$16 = this.a("type", jb.z.b($$11));
        ftr.a($$15, $$16, $$0, $$1, $$2, $$3, 1.0f, 1.0f, 1.0f);
        ((fdp)$$15).a(true);
        if ($$12 != bye.b && !((bfz)$$3).h_()) {
            acq $$17 = this.a("profession", jb.A.b($$12));
            ftr.a($$15, $$17, $$0, $$1, $$2, $$3, 1.0f, 1.0f, 1.0f);
            if ($$12 != bye.m) {
                acq $$18 = this.a("profession_level", (acq)a.get(apa.a($$10.c(), 1, a.size())));
                ftr.a($$15, $$18, $$0, $$1, $$2, $$3, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    private acq a(String $$0, acq $$12) {
        return $$12.a($$1 -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1 + ".png");
    }

    public <K> fwh.a a(Object2ObjectMap<K, fwh.a> $$0, String $$1, gz<K> $$2, K $$32) {
        return (fwh.a)((Object)$$0.computeIfAbsent($$32, $$3 -> this.d.getResource(this.a($$1, $$2.b($$32))).flatMap($$0 -> {
            try {
                return $$0.f().a(fwh.a).map(fwh::a);
            }
            catch (IOException $$1) {
                return Optional.empty();
            }
        }).orElse(fwh.a.a)));
    }
}

