/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntUnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvf
implements fuz {
    static final Logger c = LogUtils.getLogger();
    public static final Codec<fvf> b = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.list(acq.a).fieldOf("textures").forGetter($$0 -> $$0.d), (App)acq.a.fieldOf("palette_key").forGetter($$0 -> $$0.f), (App)Codec.unboundedMap((Codec)Codec.STRING, acq.a).fieldOf("permutations").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fvf::new));
    private final List<acq> d;
    private final Map<String, acq> e;
    private final acq f;

    private fvf(List<acq> $$0, acq $$1, Map<String, acq> $$2) {
        this.d = $$0;
        this.e = $$2;
        this.f = $$1;
    }

    @Override
    public void a(akx $$0, fuz.a $$1) {
        Supplier $$2 = Suppliers.memoize(() -> fvf.a($$0, this.f));
        HashMap $$3 = new HashMap();
        this.e.forEach((arg_0, arg_1) -> fvf.a($$3, (java.util.function.Supplier)$$2, $$0, arg_0, arg_1));
        for (acq $$4 : this.d) {
            acq $$5 = a.a($$4);
            Optional<akv> $$6 = $$0.getResource($$5);
            if ($$6.isEmpty()) {
                c.warn("Unable to find texture {}", (Object)$$5);
                continue;
            }
            fve $$7 = new fve($$5, $$6.get(), $$3.size());
            for (Map.Entry $$8 : $$3.entrySet()) {
                acq $$9 = $$4.e("_" + (String)$$8.getKey());
                $$1.a($$9, new a($$7, (java.util.function.Supplier)$$8.getValue(), $$9));
            }
        }
    }

    private static IntUnaryOperator a(int[] $$0, int[] $$1) {
        if ($$1.length != $$0.length) {
            c.warn("Palette mapping has different sizes: {} and {}", (Object)$$0.length, (Object)$$1.length);
            throw new IllegalArgumentException();
        }
        Int2IntOpenHashMap $$2 = new Int2IntOpenHashMap($$1.length);
        for (int $$3 = 0; $$3 < $$0.length; ++$$3) {
            int $$4 = $$0[$$3];
            if (aok.a.a($$4) == 0) continue;
            $$2.put(aok.a.e($$4), $$1[$$3]);
        }
        return arg_0 -> fvf.a((Int2IntMap)$$2, arg_0);
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static int[] a(akx $$0, acq $$1) {
        Optional<akv> $$2 = $$0.getResource(a.a($$1));
        if ($$2.isEmpty()) {
            c.error("Failed to load palette image {}", (Object)$$1);
            throw new IllegalArgumentException();
        }
        try (InputStream $$3 = $$2.get().d();){
            ehk $$4 = ehk.a($$3);
            try {
                int[] nArray = $$4.d();
                if ($$4 != null) {
                    $$4.close();
                }
                return nArray;
            }
            catch (Throwable throwable) {
                if ($$4 != null) {
                    try {
                        $$4.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
        catch (Exception $$5) {
            c.error("Couldn't load texture {}", (Object)$$1, (Object)$$5);
            throw new IllegalArgumentException();
        }
    }

    @Override
    public fva a() {
        return fvb.e;
    }

    private static /* synthetic */ int a(Int2IntMap $$0, int $$1) {
        int $$2 = aok.a.a($$1);
        if ($$2 == 0) {
            return $$1;
        }
        int $$3 = aok.a.e($$1);
        int $$4 = $$0.getOrDefault($$3, aok.a.f($$3));
        int $$5 = aok.a.a($$4);
        return aok.a.a($$2 * $$5 / 255, $$4);
    }

    private static /* synthetic */ void a(Map $$0, java.util.function.Supplier $$1, akx $$2, String $$3, acq $$4) {
        $$0.put($$3, Suppliers.memoize(() -> fvf.a((java.util.function.Supplier)$$1, $$2, $$4)));
    }

    private static /* synthetic */ IntUnaryOperator a(java.util.function.Supplier $$0, akx $$1, acq $$2) {
        return fvf.a((int[])$$0.get(), fvf.a($$1, $$2));
    }

    record a(fve a, java.util.function.Supplier<IntUnaryOperator> b, acq c) implements fuz.b
    {
        private final fve a;
        private final java.util.function.Supplier<IntUnaryOperator> b;
        private final acq c;

        @Nullable
        public fup b() {
            try {
                ehk $$0 = this.a.a().a(this.b.get());
                fup fup2 = new fup(this.c, new fwg($$0.a(), $$0.b()), $$0, fwe.e);
                return fup2;
            }
            catch (IOException | IllegalArgumentException $$1) {
                c.error("unable to apply palette to {}", (Object)this.c, (Object)$$1);
                fup fup3 = null;
                return fup3;
            }
            finally {
                this.a.b();
            }
        }

        @Override
        public void a() {
            this.a.b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "baseImage;palette;permutationLocation", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "baseImage;palette;permutationLocation", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "baseImage;palette;permutationLocation", "a", "b", "c"}, this, $$0);
        }

        public fve c() {
            return this.a;
        }

        public java.util.function.Supplier<IntUnaryOperator> d() {
            return this.b;
        }

        public acq e() {
            return this.c;
        }

        @Override
        @Nullable
        public /* synthetic */ Object get() {
            return this.b();
        }
    }
}

