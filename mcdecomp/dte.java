/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dte
extends dtg {
    public static final Codec<dte> a = RecordCodecBuilder.create($$0 -> $$0.group(dte.c(), dte.b(), dte.d()).apply((Applicative)$$0, dte::new));

    protected dte(Either<acq, dvt> $$0, he<dvr> $$1, dtj.a $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected dvp a(cvz $$0, drs $$1, boolean $$2) {
        dvp $$3 = super.a($$0, $$1, $$2);
        $$3.b(duv.b);
        $$3.a(duv.d);
        return $$3;
    }

    @Override
    public dti<?> a() {
        return dti.e;
    }

    @Override
    public String toString() {
        return "LegacySingle[" + this.c + "]";
    }
}

