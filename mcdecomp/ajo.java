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
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ajo
implements ajl {
    private static final Logger a = LogUtils.getLogger();
    private final aji d;
    private final Set<String> e;
    private final List<Path> f;
    private final Map<ajm, List<Path>> g;

    ajo(aji $$0, Set<String> $$1, List<Path> $$2, Map<ajm, List<Path>> $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    @Nullable
    public akp<InputStream> a(String ... $$0) {
        v.a($$0);
        List<String> $$1 = List.of($$0);
        for (Path $$2 : this.f) {
            Path $$3 = v.a($$2, $$1);
            if (!Files.exists($$3, new LinkOption[0]) || !ajn.a($$3)) continue;
            return akp.create($$3);
        }
        return null;
    }

    public void a(ajm $$0, acq $$12, Consumer<Path> $$2) {
        v.c($$12.a()).get().ifLeft($$3 -> {
            String $$4 = $$12.b();
            for (Path $$5 : this.g.get((Object)$$0)) {
                Path $$6 = $$5.resolve($$4);
                $$2.accept(v.a($$6, $$3));
            }
        }).ifRight($$1 -> a.error("Invalid path {}: {}", (Object)$$12, (Object)$$1.message()));
    }

    @Override
    public void a(ajm $$0, String $$12, String $$2, ajl.a $$32) {
        v.c($$2).get().ifLeft($$3 -> {
            List<Path> $$4 = this.g.get((Object)$$0);
            int $$5 = $$4.size();
            if ($$5 == 1) {
                ajo.a($$32, $$12, $$4.get(0), $$3);
            } else if ($$5 > 1) {
                HashMap<acq, akp<InputStream>> $$6 = new HashMap<acq, akp<InputStream>>();
                for (int $$7 = 0; $$7 < $$5 - 1; ++$$7) {
                    ajo.a($$6::putIfAbsent, $$12, $$4.get($$7), $$3);
                }
                Path $$8 = $$4.get($$5 - 1);
                if ($$6.isEmpty()) {
                    ajo.a($$32, $$12, $$8, $$3);
                } else {
                    ajo.a($$6::putIfAbsent, $$12, $$8, $$3);
                    $$6.forEach($$32);
                }
            }
        }).ifRight($$1 -> a.error("Invalid path {}: {}", (Object)$$2, (Object)$$1.message()));
    }

    private static void a(ajl.a $$0, String $$1, Path $$2, List<String> $$3) {
        Path $$4 = $$2.resolve($$1);
        ajn.a($$1, $$4, $$3, $$0);
    }

    @Override
    @Nullable
    public akp<InputStream> a(ajm $$0, acq $$12) {
        return (akp)v.c($$12.a()).get().map($$2 -> {
            String $$3 = $$12.b();
            for (Path $$4 : this.g.get((Object)$$0)) {
                Path $$5 = v.a($$4.resolve($$3), $$2);
                if (!Files.exists($$5, new LinkOption[0]) || !ajn.a($$5)) continue;
                return akp.create($$5);
            }
            return null;
        }, $$1 -> {
            a.error("Invalid path {}: {}", (Object)$$12, (Object)$$1.message());
            return null;
        });
    }

    @Override
    public Set<String> a(ajm $$0) {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public <T> T a(ajx<T> $$0) {
        akp<InputStream> $$1 = this.a("pack.mcmeta");
        if ($$1 == null) return this.d.a($$0);
        try (InputStream $$2 = $$1.get();){
            T $$3 = ajh.a($$0, $$2);
            if ($$3 == null) return this.d.a($$0);
            T t2 = $$3;
            return t2;
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this.d.a($$0);
    }

    @Override
    public String a() {
        return "vanilla";
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void close() {
    }

    public ala c() {
        return $$02 -> Optional.ofNullable(this.a(ajm.a, $$02)).map($$0 -> new akv(this, (akp<InputStream>)$$0));
    }
}

