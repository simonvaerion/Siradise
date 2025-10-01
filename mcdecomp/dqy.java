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
import java.util.stream.Stream;

public class dqy
extends drh {
    private final ha c;
    private final dir d;
    private final dir e;
    private final int f;
    public static final Codec<dqy> a = RecordCodecBuilder.create($$02 -> $$02.group((App)ha.h.fieldOf("direction_of_search").forGetter($$0 -> $$0.c), (App)dir.b.fieldOf("target_condition").forGetter($$0 -> $$0.d), (App)dir.b.optionalFieldOf("allowed_search_condition", (Object)dir.e()).forGetter($$0 -> $$0.e), (App)Codec.intRange((int)1, (int)32).fieldOf("max_steps").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, dqy::new));

    private dqy(ha $$0, dir $$1, dir $$2, int $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public static dqy a(ha $$0, dir $$1, dir $$2, int $$3) {
        return new dqy($$0, $$1, $$2, $$3);
    }

    public static dqy a(ha $$0, dir $$1, int $$2) {
        return dqy.a($$0, $$1, dir.e(), $$2);
    }

    @Override
    public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
        gu.a $$3 = $$2.j();
        cng $$4 = $$0.d();
        if (!this.e.test($$4, $$3)) {
            return Stream.of(new gu[0]);
        }
        for (int $$5 = 0; $$5 < this.f; ++$$5) {
            if (this.d.test($$4, $$3)) {
                return Stream.of($$3);
            }
            $$3.c(this.c);
            if ($$4.d($$3.v())) {
                return Stream.of(new gu[0]);
            }
            if (!this.e.test($$4, $$3)) break;
        }
        if (this.d.test($$4, $$3)) {
            return Stream.of($$3);
        }
        return Stream.of(new gu[0]);
    }

    @Override
    public dri<?> b() {
        return dri.j;
    }
}

