/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ebv {
    private static final BiMap<acq, ebu> o = HashBiMap.create();
    public static final ebu a = ebv.a("empty", $$0 -> {});
    public static final ebu b = ebv.a("chest", $$0 -> $$0.a(ebw.f).b(ebw.a));
    public static final ebu c = ebv.a("command", $$0 -> $$0.a(ebw.f).b(ebw.a));
    public static final ebu d = ebv.a("selector", $$0 -> $$0.a(ebw.f).a(ebw.a));
    public static final ebu e = ebv.a("fishing", $$0 -> $$0.a(ebw.f).a(ebw.i).b(ebw.a));
    public static final ebu f = ebv.a("entity", $$0 -> $$0.a(ebw.a).a(ebw.f).a(ebw.c).b(ebw.d).b(ebw.e).b(ebw.b));
    public static final ebu g = ebv.a("archaeology", $$0 -> $$0.a(ebw.f).b(ebw.a));
    public static final ebu h = ebv.a("gift", $$0 -> $$0.a(ebw.f).a(ebw.a));
    public static final ebu i = ebv.a("barter", $$0 -> $$0.a(ebw.a));
    public static final ebu j = ebv.a("advancement_reward", $$0 -> $$0.a(ebw.a).a(ebw.f));
    public static final ebu k = ebv.a("advancement_entity", $$0 -> $$0.a(ebw.a).a(ebw.f));
    public static final ebu l = ebv.a("advancement_location", $$0 -> $$0.a(ebw.a).a(ebw.f).a(ebw.i).a(ebw.g));
    public static final ebu m = ebv.a("generic", $$0 -> $$0.a(ebw.a).a(ebw.b).a(ebw.c).a(ebw.d).a(ebw.e).a(ebw.f).a(ebw.g).a(ebw.h).a(ebw.i).a(ebw.j));
    public static final ebu n = ebv.a("block", $$0 -> $$0.a(ebw.g).a(ebw.f).a(ebw.i).b(ebw.a).b(ebw.h).b(ebw.j));

    private static ebu a(String $$0, Consumer<ebu.a> $$1) {
        ebu.a $$2 = new ebu.a();
        $$1.accept($$2);
        ebu $$3 = $$2.a();
        acq $$4 = new acq($$0);
        ebu $$5 = (ebu)o.put((Object)$$4, (Object)$$3);
        if ($$5 != null) {
            throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
        }
        return $$3;
    }

    @Nullable
    public static ebu a(acq $$0) {
        return (ebu)o.get((Object)$$0);
    }

    @Nullable
    public static acq a(ebu $$0) {
        return (acq)o.inverse().get((Object)$$0);
    }
}

