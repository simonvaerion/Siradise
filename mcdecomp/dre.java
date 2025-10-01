/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public final class dre
extends Record {
    private final he<dkb<?, ?>> e;
    private final List<drh> f;
    public static final Codec<dre> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dkb.b.fieldOf("feature").forGetter($$0 -> $$0.e), (App)drh.b.listOf().fieldOf("placement").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, dre::new));
    public static final Codec<he<dre>> b = acm.a(jc.ay, a);
    public static final Codec<hi<dre>> c = ht.a(jc.ay, a);
    public static final Codec<List<hi<dre>>> d = ht.a(jc.ay, a, true).listOf();

    public dre(he<dkb<?, ?>> $$0, List<drh> $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public boolean a(cng $$0, ddy $$1, apf $$2, gu $$3) {
        return this.a(new drf($$0, $$1, Optional.empty()), $$2, $$3);
    }

    public boolean b(cng $$0, ddy $$1, apf $$2, gu $$3) {
        return this.a(new drf($$0, $$1, Optional.of(this)), $$2, $$3);
    }

    private boolean a(drf $$0, apf $$1, gu $$2) {
        Stream<gu> $$32 = Stream.of($$2);
        for (drh $$42 : this.f) {
            $$32 = $$32.flatMap($$3 -> $$42.a_($$0, $$1, (gu)$$3));
        }
        dkb<?, ?> $$5 = this.e.a();
        MutableBoolean $$6 = new MutableBoolean();
        $$32.forEach($$4 -> {
            if ($$5.a($$0.d(), $$0.f(), $$1, (gu)$$4)) {
                $$6.setTrue();
            }
        });
        return $$6.isTrue();
    }

    public Stream<dkb<?, ?>> a() {
        return this.e.a().a();
    }

    @Override
    public String toString() {
        return "Placed " + this.e;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dre.class, "feature;placement", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dre.class, "feature;placement", "e", "f"}, this, $$0);
    }

    public he<dkb<?, ?>> b() {
        return this.e;
    }

    public List<drh> c() {
        return this.f;
    }
}

