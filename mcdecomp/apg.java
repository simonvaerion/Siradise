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
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class apg {
    public static final Codec<apg> a = RecordCodecBuilder.create($$02 -> $$02.group((App)aoi.l.optionalFieldOf("namespace").forGetter($$0 -> $$0.b), (App)aoi.l.optionalFieldOf("path").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, apg::new));
    private final Optional<Pattern> b;
    private final Predicate<String> c;
    private final Optional<Pattern> d;
    private final Predicate<String> e;
    private final Predicate<acq> f;

    private apg(Optional<Pattern> $$02, Optional<Pattern> $$1) {
        this.b = $$02;
        this.c = $$02.map(Pattern::asPredicate).orElse($$0 -> true);
        this.d = $$1;
        this.e = $$1.map(Pattern::asPredicate).orElse($$0 -> true);
        this.f = $$0 -> this.c.test($$0.b()) && this.e.test($$0.a());
    }

    public Predicate<String> a() {
        return this.c;
    }

    public Predicate<String> b() {
        return this.e;
    }

    public Predicate<acq> c() {
        return this.f;
    }
}

