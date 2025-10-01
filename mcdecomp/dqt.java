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

public class dqt
extends drg {
    public static final Codec<dqt> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dir.b.fieldOf("predicate").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dqt::new));
    private final dir c;

    private dqt(dir $$0) {
        this.c = $$0;
    }

    public static dqt a(dir $$0) {
        return new dqt($$0);
    }

    @Override
    protected boolean a(drf $$0, apf $$1, gu $$2) {
        return this.c.test($$0.d(), $$2);
    }

    @Override
    public dri<?> b() {
        return dri.a;
    }
}

