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

public class dqa {
    public static final Codec<dqa> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.intRange((int)0, (int)dfk.c).fieldOf("height").forGetter(dqa::a), (App)jb.f.q().fieldOf("block").orElse((Object)cpo.a).forGetter($$0 -> $$0.b().b())).apply((Applicative)$$02, dqa::new));
    private final cpn b;
    private final int c;

    public dqa(int $$0, cpn $$1) {
        this.c = $$0;
        this.b = $$1;
    }

    public int a() {
        return this.c;
    }

    public dcb b() {
        return this.b.n();
    }

    public String toString() {
        return (String)(this.c != 1 ? this.c + "*" : "") + jb.f.b(this.b);
    }
}

