/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fkd {
    private final fjk a = new fjk();
    private final SortedMap<fkf, eie> b = (SortedMap)ac.a(new Object2ObjectLinkedOpenHashMap(), (T $$0) -> {
        $$0.put((Object)fkj.i(), (Object)this.a.a(fkf.c()));
        $$0.put((Object)fkj.j(), (Object)this.a.a(fkf.e()));
        $$0.put((Object)fkj.a(), (Object)this.a.a(fkf.d()));
        $$0.put((Object)fkj.l(), (Object)this.a.a(fkf.f()));
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkj.b());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkj.c());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkj.d());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkj.e());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkj.f());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkj.g());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.h());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.k());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.l());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.n());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.o());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.m());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.p());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.q());
        fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, fkf.j());
        fww.l.forEach($$1 -> fkd.a((Object2ObjectLinkedOpenHashMap<fkf, eie>)$$0, $$1));
    });
    private final fjx.a c = fjx.a(this.b, new eie(256));
    private final fjx.a d = fjx.a(new eie(256));
    private final fjy e = new fjy(this.c);

    private static void a(Object2ObjectLinkedOpenHashMap<fkf, eie> $$0, fkf $$1) {
        $$0.put((Object)$$1, (Object)new eie($$1.H()));
    }

    public fjk a() {
        return this.a;
    }

    public fjx.a b() {
        return this.c;
    }

    public fjx.a c() {
        return this.d;
    }

    public fjy d() {
        return this.e;
    }
}

