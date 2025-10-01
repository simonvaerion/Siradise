/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class fuy {
    private static final Logger a = LogUtils.getLogger();
    private static final acj b = new acj("atlases", ".json");
    private final List<fuz> c;

    private fuy(List<fuz> $$0) {
        this.c = $$0;
    }

    public List<Supplier<fup>> a(akx $$0) {
        final HashMap $$1 = new HashMap();
        fuz.a $$22 = new fuz.a(){

            @Override
            public void a(acq $$0, fuz.b $$12) {
                fuz.b $$2 = $$1.put($$0, $$12);
                if ($$2 != null) {
                    $$2.a();
                }
            }

            @Override
            public void a(Predicate<acq> $$0) {
                Iterator $$12 = $$1.entrySet().iterator();
                while ($$12.hasNext()) {
                    Map.Entry $$2 = $$12.next();
                    if (!$$0.test((acq)$$2.getKey())) continue;
                    ((fuz.b)$$2.getValue()).a();
                    $$12.remove();
                }
            }
        };
        this.c.forEach($$2 -> $$2.a($$0, $$22));
        ImmutableList.Builder $$3 = ImmutableList.builder();
        $$3.add(ful::a);
        $$3.addAll($$1.values());
        return $$3.build();
    }

    public static fuy a(akx $$0, acq $$1) {
        acq $$2 = b.a($$1);
        ArrayList<fuz> $$3 = new ArrayList<fuz>();
        for (akv $$4 : $$0.a($$2)) {
            try {
                BufferedReader $$5 = $$4.e();
                try {
                    Dynamic $$6 = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)JsonParser.parseReader((Reader)$$5));
                    $$3.addAll((Collection)fvb.h.parse($$6).getOrThrow(false, arg_0 -> ((Logger)a).error(arg_0)));
                }
                finally {
                    if ($$5 == null) continue;
                    $$5.close();
                }
            }
            catch (Exception $$7) {
                a.warn("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), $$7});
            }
        }
        return new fuy($$3);
    }
}

