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
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuq {
    private static final Logger a = LogUtils.getLogger();
    private final acq b;
    private final int c;
    private final int d;
    private final int e;

    public fuq(acq $$0, int $$1, int $$2, int $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static fuq a(fuu $$0) {
        return new fuq($$0.g(), $$0.h(), $$0.i(), $$0.j());
    }

    public a a(List<fup> $$02, int $$1, Executor $$2) {
        CompletableFuture<Object> $$21;
        int $$12;
        int $$3 = this.c;
        fus<fup> $$4 = new fus<fup>($$3, $$3, $$1);
        int $$5 = Integer.MAX_VALUE;
        int $$6 = 1 << $$1;
        for (fup $$7 : $$02) {
            $$5 = Math.min($$5, Math.min($$7.a(), $$7.b()));
            int $$8 = Math.min(Integer.lowestOneBit($$7.a()), Integer.lowestOneBit($$7.b()));
            if ($$8 < $$6) {
                a.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{$$7.c(), $$7.a(), $$7.b(), apa.f($$6), apa.f($$8)});
                $$6 = $$8;
            }
            $$4.a($$7);
        }
        int $$9 = Math.min($$5, $$6);
        int $$10 = apa.f($$9);
        if ($$10 < $$1) {
            a.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.b, $$1, $$10, $$9});
            int $$11 = $$10;
        } else {
            $$12 = $$1;
        }
        try {
            $$4.c();
        }
        catch (fut $$13) {
            o $$14 = o.a($$13, "Stitching");
            p $$15 = $$14.a("Stitcher");
            $$15.a("Sprites", $$13.a().stream().map($$0 -> String.format(Locale.ROOT, "%s[%dx%d]", $$0.c(), $$0.a(), $$0.b())).collect(Collectors.joining(",")));
            $$15.a("Max Texture Size", $$3);
            throw new y($$14);
        }
        int $$16 = Math.max($$4.a(), this.d);
        int $$17 = Math.max($$4.b(), this.e);
        Map<acq, fuv> $$18 = this.a($$4, $$16, $$17);
        fuv $$19 = $$18.get(ful.b());
        if ($$12 > 0) {
            CompletableFuture<Void> $$20 = CompletableFuture.runAsync(() -> $$18.values().forEach($$1 -> $$1.e().a($$12)), $$2);
        } else {
            $$21 = CompletableFuture.completedFuture(null);
        }
        return new a($$16, $$17, $$12, $$19, $$18, $$21);
    }

    public static CompletableFuture<List<fup>> a(List<Supplier<fup>> $$02, Executor $$12) {
        List<CompletableFuture> $$2 = $$02.stream().map($$1 -> CompletableFuture.supplyAsync($$1, $$12)).toList();
        return ((CompletableFuture)((Object)ac.b($$2))).thenApply($$0 -> $$0.stream().filter(Objects::nonNull).toList());
    }

    public CompletableFuture<a> a(akx $$0, acq $$12, int $$22, Executor $$3) {
        return ((CompletableFuture)CompletableFuture.supplyAsync(() -> fuy.a($$0, $$12).a($$0), $$3).thenCompose($$1 -> fuq.a($$1, $$3))).thenApply($$2 -> this.a((List<fup>)$$2, $$22, $$3));
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static fup a(acq $$0, akv $$1) {
        void $$9;
        void $$4;
        try {
            fwe $$2 = $$1.f().a(fwe.a).orElse(fwe.e);
        }
        catch (Exception $$3) {
            a.error("Unable to parse metadata from {}", (Object)$$0, (Object)$$3);
            return null;
        }
        try (InputStream $$5 = $$1.d();){
            ehk $$6 = ehk.a($$5);
        }
        catch (IOException $$8) {
            a.error("Using missing texture, unable to load {}", (Object)$$0, (Object)$$8);
            return null;
        }
        fwg $$10 = $$4.a($$9.a(), $$9.b());
        if (apa.c($$9.a(), $$10.a()) && apa.c($$9.b(), $$10.b())) {
            return new fup($$0, $$10, (ehk)$$9, (fwe)$$4);
        }
        a.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{$$0, $$9.a(), $$9.b(), $$10.a(), $$10.b()});
        $$9.close();
        return null;
    }

    private Map<acq, fuv> a(fus<fup> $$0, int $$1, int $$2) {
        HashMap<acq, fuv> $$32 = new HashMap<acq, fuv>();
        $$0.a(($$3, $$4, $$5) -> $$32.put($$3.c(), new fuv(this.b, (fup)$$3, $$1, $$2, $$4, $$5)));
        return $$32;
    }

    public record a(int a, int b, int c, fuv d, Map<acq, fuv> e, CompletableFuture<Void> f) {
        private final int a;
        private final int b;
        private final int c;
        private final fuv d;
        private final Map<acq, fuv> e;
        private final CompletableFuture<Void> f;

        public CompletableFuture<a> a() {
            return this.f.thenApply($$0 -> this);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "width;height;mipLevel;missing;regions;readyForUpload", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "width;height;mipLevel;missing;regions;readyForUpload", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "width;height;mipLevel;missing;regions;readyForUpload", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public int b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        public fuv e() {
            return this.d;
        }

        public Map<acq, fuv> f() {
            return this.e;
        }

        public CompletableFuture<Void> g() {
            return this.f;
        }
    }
}

