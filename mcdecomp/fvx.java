/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public class fvx
extends qm {
    private static final Logger b = LogUtils.getLogger();
    private final Map<String, String> c;
    private final boolean d;

    private fvx(Map<String, String> $$0, boolean $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public static fvx a(akx $$0, List<String> $$1, boolean $$2) {
        HashMap $$3 = Maps.newHashMap();
        for (String $$4 : $$1) {
            String $$5 = String.format(Locale.ROOT, "lang/%s.json", $$4);
            for (String $$6 : $$0.a()) {
                try {
                    acq $$7 = new acq($$6, $$5);
                    fvx.a($$4, $$0.a($$7), $$3);
                }
                catch (Exception $$8) {
                    b.warn("Skipped language file: {}:{} ({})", new Object[]{$$6, $$5, $$8.toString()});
                }
            }
        }
        return new fvx((Map<String, String>)ImmutableMap.copyOf((Map)$$3), $$2);
    }

    private static void a(String $$0, List<akv> $$1, Map<String, String> $$2) {
        for (akv $$3 : $$1) {
            try {
                InputStream $$4 = $$3.d();
                try {
                    qm.a($$4, $$2::put);
                }
                finally {
                    if ($$4 == null) continue;
                    $$4.close();
                }
            }
            catch (IOException $$5) {
                b.warn("Failed to load translations for {} from pack {}", new Object[]{$$0, $$3.b(), $$5});
            }
        }
    }

    @Override
    public String a(String $$0, String $$1) {
        return this.c.getOrDefault($$0, $$1);
    }

    @Override
    public boolean b(String $$0) {
        return this.c.containsKey($$0);
    }

    @Override
    public boolean b() {
        return this.d;
    }

    @Override
    public aom a(ta $$0) {
        return fvy.a($$0, this.d);
    }
}

