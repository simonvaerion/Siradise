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
import java.util.OptionalInt;

public class dnw
extends dnt {
    public static final Codec<dnw> d = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.intRange((int)0, (int)81).fieldOf("limit").orElse((Object)1).forGetter($$0 -> $$0.e), (App)Codec.intRange((int)0, (int)16).fieldOf("lower_size").orElse((Object)0).forGetter($$0 -> $$0.f), (App)Codec.intRange((int)0, (int)16).fieldOf("upper_size").orElse((Object)1).forGetter($$0 -> $$0.g), dnw.a()).apply((Applicative)$$02, dnw::new));
    private final int e;
    private final int f;
    private final int g;

    public dnw(int $$0, int $$1, int $$2) {
        this($$0, $$1, $$2, OptionalInt.empty());
    }

    public dnw(int $$0, int $$1, int $$2, OptionalInt $$3) {
        super($$3);
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    @Override
    protected dnu<?> b() {
        return dnu.a;
    }

    @Override
    public int a(int $$0, int $$1) {
        return $$1 < this.e ? this.f : this.g;
    }
}

