/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akq
implements akn {
    private static final Logger a = LogUtils.getLogger();
    private final Map<String, ako> b;
    private final List<ajl> c;

    public akq(ajm $$0, List<ajl> $$12) {
        this.c = List.copyOf($$12);
        HashMap<String, ako> $$2 = new HashMap<String, ako>();
        List $$3 = $$12.stream().flatMap($$1 -> $$1.a($$0).stream()).distinct().toList();
        for (ajl $$4 : $$12) {
            akw $$5 = this.a($$4);
            Set<String> $$6 = $$4.a($$0);
            Predicate<acq> $$7 = $$5 != null ? $$1 -> $$5.b($$1.a()) : null;
            for (String $$8 : $$3) {
                boolean $$10;
                boolean $$9 = $$6.contains($$8);
                boolean bl2 = $$10 = $$5 != null && $$5.a($$8);
                if (!$$9 && !$$10) continue;
                ako $$11 = (ako)$$2.get($$8);
                if ($$11 == null) {
                    $$11 = new ako($$0, $$8);
                    $$2.put($$8, $$11);
                }
                if ($$9 && $$10) {
                    $$11.a($$4, $$7);
                    continue;
                }
                if ($$9) {
                    $$11.a($$4);
                    continue;
                }
                $$11.a($$4.a(), $$7);
            }
        }
        this.b = $$2;
    }

    @Nullable
    private akw a(ajl $$0) {
        try {
            return $$0.a(akw.a);
        }
        catch (IOException $$1) {
            a.error("Failed to get filter section from pack {}", (Object)$$0.a());
            return null;
        }
    }

    @Override
    public Set<String> a() {
        return this.b.keySet();
    }

    @Override
    public Optional<akv> getResource(acq $$0) {
        akx $$1 = this.b.get($$0.b());
        if ($$1 != null) {
            return $$1.getResource($$0);
        }
        return Optional.empty();
    }

    @Override
    public List<akv> a(acq $$0) {
        akx $$1 = this.b.get($$0.b());
        if ($$1 != null) {
            return $$1.a($$0);
        }
        return List.of();
    }

    @Override
    public Map<acq, akv> b(String $$0, Predicate<acq> $$1) {
        akq.a($$0);
        TreeMap<acq, akv> $$2 = new TreeMap<acq, akv>();
        for (ako $$3 : this.b.values()) {
            $$2.putAll($$3.b($$0, $$1));
        }
        return $$2;
    }

    @Override
    public Map<acq, List<akv>> c(String $$0, Predicate<acq> $$1) {
        akq.a($$0);
        TreeMap<acq, List<akv>> $$2 = new TreeMap<acq, List<akv>>();
        for (ako $$3 : this.b.values()) {
            $$2.putAll($$3.c($$0, $$1));
        }
        return $$2;
    }

    private static void a(String $$0) {
        if ($$0.endsWith("/")) {
            throw new IllegalArgumentException("Trailing slash in path " + $$0);
        }
    }

    @Override
    public Stream<ajl> b() {
        return this.c.stream();
    }

    @Override
    public void close() {
        this.c.forEach(ajl::close);
    }
}

