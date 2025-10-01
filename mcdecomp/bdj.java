/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bdj
extends bdc {
    public static final Codec<bdj> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bch.b(bdc.c).fieldOf("distribution").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, bdj::new));
    private final bch<bdc> b;
    private final int f;
    private final int g;

    public bdj(bch<bdc> $$0) {
        this.b = $$0;
        List $$1 = $$0.e();
        int $$2 = Integer.MAX_VALUE;
        int $$3 = Integer.MIN_VALUE;
        for (bcj.b $$4 : $$1) {
            int $$5 = ((bdc)$$4.b()).a();
            int $$6 = ((bdc)$$4.b()).b();
            $$2 = Math.min($$2, $$5);
            $$3 = Math.max($$3, $$6);
        }
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public int a(apf $$0) {
        return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0);
    }

    @Override
    public int a() {
        return this.f;
    }

    @Override
    public int b() {
        return this.g;
    }

    @Override
    public bdd<?> c() {
        return bdd.e;
    }
}

