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
import java.util.function.Function;

abstract class dit
implements dir {
    protected final List<dir> e;

    protected dit(List<dir> $$0) {
        this.e = $$0;
    }

    public static <T extends dit> Codec<T> a(Function<List<dir>, T> $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)dir.b.listOf().fieldOf("predicates").forGetter($$0 -> $$0.e)).apply((Applicative)$$1, $$0));
    }
}

