/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class dpw {
    public static final Codec<dpw> c = jb.Y.q().dispatch(dpw::a, dpx::a);
    private static final int a = 32;
    private static final int b = 24;
    public static final int d = 80;
    protected final int e;
    protected final int f;
    protected final int g;

    protected static <P extends dpw> Products.P3<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer> a(RecordCodecBuilder.Instance<P> $$02) {
        return $$02.group((App)Codec.intRange((int)0, (int)32).fieldOf("base_height").forGetter($$0 -> $$0.e), (App)Codec.intRange((int)0, (int)24).fieldOf("height_rand_a").forGetter($$0 -> $$0.f), (App)Codec.intRange((int)0, (int)24).fieldOf("height_rand_b").forGetter($$0 -> $$0.g));
    }

    public dpw(int $$0, int $$1, int $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    protected abstract dpx<?> a();

    public abstract List<doe.a> a(cms var1, BiConsumer<gu, dcb> var2, apf var3, int var4, gu var5, dno var6);

    public int a(apf $$0) {
        return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
    }

    private static boolean c(cms $$02, gu $$1) {
        return $$02.a($$1, (dcb $$0) -> dko.b($$0) && !$$0.a(cpo.i) && !$$0.a(cpo.fl));
    }

    protected static void a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, gu $$3, dno $$4) {
        if ($$4.k || !dpw.c($$0, $$3)) {
            $$1.accept($$3, $$4.c.a($$2, $$3));
        }
    }

    protected boolean b(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, gu $$3, dno $$4) {
        return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
    }

    protected boolean a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, gu $$3, dno $$4, Function<dcb, dcb> $$5) {
        if (this.a($$0, $$3)) {
            $$1.accept($$3, $$5.apply($$4.b.a($$2, $$3)));
            return true;
        }
        return false;
    }

    protected void a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, gu.a $$3, dno $$4) {
        if (this.b($$0, $$3)) {
            this.b($$0, $$1, $$2, $$3, $$4);
        }
    }

    protected boolean a(cms $$0, gu $$1) {
        return dma.c($$0, $$1);
    }

    public boolean b(cms $$02, gu $$1) {
        return this.a($$02, $$1) || $$02.a($$1, (dcb $$0) -> $$0.a(amw.t));
    }
}

