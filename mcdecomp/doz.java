/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class doz
extends dot {
    public static final Codec<doz> b = RecordCodecBuilder.create($$02 -> $$02.group((App)dot.a.fieldOf("source").forGetter($$0 -> $$0.c), (App)Codec.STRING.fieldOf("property").forGetter($$0 -> $$0.d), (App)bdc.c.fieldOf("values").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, doz::new));
    private final dot c;
    private final String d;
    @Nullable
    private ddb e;
    private final bdc f;

    public doz(dot $$0, ddb $$1, bdc $$2) {
        this.c = $$0;
        this.e = $$1;
        this.d = $$1.f();
        this.f = $$2;
        Collection<Integer> $$3 = $$1.a();
        for (int $$4 = $$2.a(); $$4 <= $$2.b(); ++$$4) {
            if ($$3.contains($$4)) continue;
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
        }
    }

    public doz(dot $$0, String $$1, bdc $$2) {
        this.c = $$0;
        this.d = $$1;
        this.f = $$2;
    }

    @Override
    protected dou<?> a() {
        return dou.g;
    }

    @Override
    public dcb a(apf $$0, gu $$1) {
        dcb $$2 = this.c.a($$0, $$1);
        if (this.e == null || !$$2.b(this.e)) {
            this.e = doz.a($$2, this.d);
        }
        return (dcb)$$2.a(this.e, this.f.a($$0));
    }

    private static ddb a(dcb $$02, String $$12) {
        Collection<dde<?>> $$2 = $$02.B();
        Optional<ddb> $$3 = $$2.stream().filter($$1 -> $$1.f().equals($$12)).filter($$0 -> $$0 instanceof ddb).map($$0 -> (ddb)$$0).findAny();
        return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$12));
    }
}

