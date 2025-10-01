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

public class akw {
    private static final Codec<akw> b = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.list(apg.a).fieldOf("block").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, akw::new));
    public static final ajy<akw> a = ajy.a("filter", b);
    private final List<apg> c;

    public akw(List<apg> $$0) {
        this.c = List.copyOf($$0);
    }

    public boolean a(String $$0) {
        return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
    }

    public boolean b(String $$0) {
        return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
    }
}

