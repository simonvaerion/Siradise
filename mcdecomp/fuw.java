/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class fuw
implements akr,
fux,
AutoCloseable {
    private static final Logger b = LogUtils.getLogger();
    public static final acq a = new acq("");
    private final Map<acq, fug> c = Maps.newHashMap();
    private final Set<fux> d = Sets.newHashSet();
    private final Map<String, Integer> e = Maps.newHashMap();
    private final akx f;

    public fuw(akx $$0) {
        this.f = $$0;
    }

    public void a(acq $$0) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.d($$0));
        } else {
            this.d($$0);
        }
    }

    private void d(acq $$0) {
        fug $$1 = this.c.get($$0);
        if ($$1 == null) {
            $$1 = new fuo($$0);
            this.a($$0, $$1);
        }
        $$1.c();
    }

    public void a(acq $$0, fug $$1) {
        fug $$2 = this.c.put($$0, $$1 = this.d($$0, $$1));
        if ($$2 != $$1) {
            if ($$2 != null && $$2 != ful.c()) {
                this.c($$0, $$2);
            }
            if ($$1 instanceof fux) {
                this.d.add((fux)((Object)$$1));
            }
        }
    }

    private void c(acq $$0, fug $$1) {
        if ($$1 != ful.c()) {
            this.d.remove($$1);
            try {
                $$1.close();
            }
            catch (Exception $$2) {
                b.warn("Failed to close texture {}", (Object)$$0, (Object)$$2);
            }
        }
        $$1.b();
    }

    private fug d(acq $$0, fug $$1) {
        try {
            $$1.a(this.f);
            return $$1;
        }
        catch (IOException $$2) {
            if ($$0 != a) {
                b.warn("Failed to load texture: {}", (Object)$$0, (Object)$$2);
            }
            return ful.c();
        }
        catch (Throwable $$3) {
            o $$4 = o.a($$3, "Registering texture");
            p $$5 = $$4.a("Resource location being registered");
            $$5.a("Resource location", $$0);
            $$5.a("Texture object class", () -> $$1.getClass().getName());
            throw new y($$4);
        }
    }

    public fug b(acq $$0) {
        fug $$1 = this.c.get($$0);
        if ($$1 == null) {
            $$1 = new fuo($$0);
            this.a($$0, $$1);
        }
        return $$1;
    }

    public fug b(acq $$0, fug $$1) {
        return this.c.getOrDefault($$0, $$1);
    }

    public acq a(String $$0, fui $$1) {
        Integer $$2 = this.e.get($$0);
        if ($$2 == null) {
            $$2 = 1;
        } else {
            Integer n2 = $$2;
            $$2 = $$2 + 1;
        }
        this.e.put($$0, $$2);
        acq $$3 = new acq(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
        this.a($$3, (fug)$$1);
        return $$3;
    }

    public CompletableFuture<Void> a(acq $$0, Executor $$1) {
        if (!this.c.containsKey($$0)) {
            fun $$2 = new fun(this.f, $$0, $$1);
            this.c.put($$0, $$2);
            return $$2.d().thenRunAsync(() -> this.a($$0, (fug)$$2), fuw::a);
        }
        return CompletableFuture.completedFuture(null);
    }

    private static void a(Runnable $$0) {
        enn.N().execute(() -> RenderSystem.recordRenderCall($$0::run));
    }

    @Override
    public void e() {
        for (fux $$0 : this.d) {
            $$0.e();
        }
    }

    public void c(acq $$0) {
        fug $$1 = this.c.remove($$0);
        if ($$1 != null) {
            this.c($$0, $$1);
        }
    }

    @Override
    public void close() {
        this.c.forEach(this::c);
        this.c.clear();
        this.d.clear();
        this.e.clear();
    }

    @Override
    public CompletableFuture<Void> a(akr.a $$02, akx $$1, ban $$2, ban $$32, Executor $$4, Executor $$5) {
        CompletableFuture<Void> $$6 = new CompletableFuture<Void>();
        ((CompletableFuture)CompletableFuture.allOf(euw.a(this, $$4), this.a(epf.m, $$4)).thenCompose($$02::a)).thenAcceptAsync($$3 -> {
            ful.c();
            eiu.a(this.f);
            Iterator<Map.Entry<acq, fug>> $$4 = this.c.entrySet().iterator();
            while ($$4.hasNext()) {
                Map.Entry<acq, fug> $$5 = $$4.next();
                acq $$6 = $$5.getKey();
                fug $$7 = $$5.getValue();
                if ($$7 == ful.c() && !$$6.equals(ful.b())) {
                    $$4.remove();
                    continue;
                }
                $$7.a(this, $$1, $$6, $$5);
            }
            enn.N().i(() -> $$6.complete(null));
        }, $$0 -> RenderSystem.recordRenderCall($$0::run));
        return $$6;
    }

    public void a(Path $$0) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.b($$0));
        } else {
            this.b($$0);
        }
    }

    private void b(Path $$0) {
        try {
            Files.createDirectories($$0, new FileAttribute[0]);
        }
        catch (IOException $$12) {
            b.error("Failed to create directory {}", (Object)$$0, (Object)$$12);
            return;
        }
        this.c.forEach(($$1, $$2) -> {
            if ($$2 instanceof fuh) {
                fuh $$3 = (fuh)((Object)$$2);
                try {
                    $$3.a((acq)$$1, $$0);
                }
                catch (IOException $$4) {
                    b.error("Failed to dump texture {}", $$1, (Object)$$4);
                }
            }
        });
    }
}

