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

public class dgh
implements dgp {
    public static final Codec<dgh> a = RecordCodecBuilder.create($$02 -> $$02.group((App)gu.a.fieldOf("pos").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dgh::new));
    final gu c;

    public dgh(gu $$0) {
        this.c = $$0;
    }

    @Override
    public Optional<eei> a(cmm $$0) {
        return Optional.of(eei.b(this.c));
    }

    @Override
    public dgq<?> a() {
        return dgq.a;
    }

    public static class a
    implements dgq<dgh> {
        public dgh a(sf $$0) {
            return new dgh($$0.f());
        }

        @Override
        public void a(sf $$0, dgh $$1) {
            $$0.a($$1.c);
        }

        @Override
        public Codec<dgh> a() {
            return a;
        }

        @Override
        public /* synthetic */ dgp b(sf sf2) {
            return this.a(sf2);
        }
    }
}

