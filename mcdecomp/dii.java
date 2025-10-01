/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.StringUtils
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import org.apache.commons.lang3.StringUtils;

public class dii {
    public static final MapCodec<dii> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.LONG.fieldOf("seed").stable().forGetter(dii::b), (App)Codec.BOOL.fieldOf("generate_features").orElse((Object)true).stable().forGetter(dii::c), (App)Codec.BOOL.fieldOf("bonus_chest").orElse((Object)false).stable().forGetter(dii::d), (App)Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter($$0 -> $$0.f)).apply((Applicative)$$02, $$02.stable(dii::new)));
    public static final dii b = new dii("North Carolina".hashCode(), true, true);
    private final long c;
    private final boolean d;
    private final boolean e;
    private final Optional<String> f;

    public dii(long $$0, boolean $$1, boolean $$2) {
        this($$0, $$1, $$2, Optional.empty());
    }

    public static dii a() {
        return new dii(dii.f(), true, false);
    }

    private dii(long $$0, boolean $$1, boolean $$2, Optional<String> $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.f.isPresent();
    }

    public dii a(boolean $$0) {
        return new dii(this.c, this.d, $$0, this.f);
    }

    public dii b(boolean $$0) {
        return new dii(this.c, $$0, this.e, this.f);
    }

    public dii a(OptionalLong $$0) {
        return new dii($$0.orElse(dii.f()), this.d, this.e, this.f);
    }

    public static OptionalLong a(String $$0) {
        if (StringUtils.isEmpty((CharSequence)($$0 = $$0.trim()))) {
            return OptionalLong.empty();
        }
        try {
            return OptionalLong.of(Long.parseLong($$0));
        }
        catch (NumberFormatException $$1) {
            return OptionalLong.of($$0.hashCode());
        }
    }

    public static long f() {
        return apf.a().g();
    }
}

