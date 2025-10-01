/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwb
implements aky {
    private static final Logger b = LogUtils.getLogger();
    public static final String a = "en_us";
    private static final fwa c = new fwa("US", "English", false);
    private Map<String, fwa> d = ImmutableMap.of((Object)"en_us", (Object)c);
    private String e;

    public fwb(String $$0) {
        this.e = $$0;
    }

    private static Map<String, fwa> a(Stream<ajl> $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.forEach($$1 -> {
            try {
                fwk $$2 = $$1.a(fwk.c);
                if ($$2 != null) {
                    $$2.a().forEach($$12::putIfAbsent);
                }
            }
            catch (IOException | RuntimeException $$3) {
                b.warn("Unable to parse language metadata section of resourcepack: {}", (Object)$$1.a(), (Object)$$3);
            }
        });
        return ImmutableMap.copyOf((Map)$$12);
    }

    @Override
    public void a(akx $$0) {
        fwa $$3;
        this.d = fwb.a($$0.b());
        ArrayList<String> $$1 = new ArrayList<String>(2);
        boolean $$2 = c.d();
        $$1.add(a);
        if (!this.e.equals(a) && ($$3 = this.d.get(this.e)) != null) {
            $$1.add(this.e);
            $$2 = $$3.d();
        }
        fvx $$4 = fvx.a($$0, $$1, $$2);
        fvz.a($$4);
        qm.a($$4);
    }

    public void a(String $$0) {
        this.e = $$0;
    }

    public String a() {
        return this.e;
    }

    public SortedMap<String, fwa> b() {
        return new TreeMap<String, fwa>(this.d);
    }

    @Nullable
    public fwa b(String $$0) {
        return this.d.get($$0);
    }
}

