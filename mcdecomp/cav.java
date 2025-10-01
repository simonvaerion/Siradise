/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class cav {
    private static final Logger a = LogUtils.getLogger();
    private final cax b;
    private final Map<acq, cau> c;
    private final caw d;

    cav(cax $$0, caw $$1, Map<acq, cau> $$2) {
        this.b = $$0;
        this.c = $$2;
        this.d = $$1;
    }

    public boolean a(caw $$0) {
        return $$0.a(this.d);
    }

    public caw a() {
        return this.d;
    }

    public caw a(Iterable<acq> $$02) {
        return this.a($$02, (acq $$0) -> a.warn("Unknown feature flag: {}", $$0));
    }

    public caw a(cau ... $$0) {
        return caw.a(this.b, Arrays.asList($$0));
    }

    public caw a(Iterable<acq> $$0, Consumer<acq> $$1) {
        Set $$2 = Sets.newIdentityHashSet();
        for (acq $$3 : $$0) {
            cau $$4 = this.c.get($$3);
            if ($$4 == null) {
                $$1.accept($$3);
                continue;
            }
            $$2.add($$4);
        }
        return caw.a(this.b, $$2);
    }

    public Set<acq> b(caw $$0) {
        HashSet<acq> $$1 = new HashSet<acq>();
        this.c.forEach(($$2, $$3) -> {
            if ($$0.b((cau)$$3)) {
                $$1.add((acq)$$2);
            }
        });
        return $$1;
    }

    public Codec<caw> b() {
        return acq.a.listOf().comapFlatMap($$0 -> {
            HashSet $$1 = new HashSet();
            caw $$2 = this.a((Iterable<acq>)$$0, $$1::add);
            if (!$$1.isEmpty()) {
                return DataResult.error(() -> "Unknown feature ids: " + $$1, (Object)$$2);
            }
            return DataResult.success((Object)$$2);
        }, $$0 -> List.copyOf(this.b((caw)$$0)));
    }

    public static class a {
        private final cax a;
        private int b;
        private final Map<acq, cau> c = new LinkedHashMap<acq, cau>();

        public a(String $$0) {
            this.a = new cax($$0);
        }

        public cau a(String $$0) {
            return this.a(new acq("minecraft", $$0));
        }

        public cau a(acq $$0) {
            cau $$1;
            cau $$2;
            if (this.b >= 64) {
                throw new IllegalStateException("Too many feature flags");
            }
            if (($$2 = this.c.put($$0, $$1 = new cau(this.a, this.b++))) != null) {
                throw new IllegalStateException("Duplicate feature flag " + $$0);
            }
            return $$1;
        }

        public cav a() {
            caw $$0 = caw.a(this.a, this.c.values());
            return new cav(this.a, $$0, Map.copyOf(this.c));
        }
    }
}

